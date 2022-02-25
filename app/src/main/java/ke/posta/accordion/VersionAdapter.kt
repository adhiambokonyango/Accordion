package ke.posta.accordion

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import androidx.recyclerview.widget.RecyclerView

class VersionAdapter (val versionList: List<Versions>): RecyclerView.Adapter<VersionAdapter.VersionViewHolder>(){
    class VersionViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        val codeName: RadioButton = itemView.findViewById(R.id.code_name)
        val content: RadioGroup = itemView.findViewById(R.id.content)
        val linearLayout: LinearLayout = itemView.findViewById(R.id.linearLayout)
        val expandedMenu: RelativeLayout = itemView.findViewById(R.id.expanded_menu)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VersionViewHolder {

        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.root, parent, false)
        return VersionViewHolder(view)
    }

    override fun onBindViewHolder(holder: VersionViewHolder, position: Int) {
        val versions: Versions = versionList[position]
        holder.codeName.text = versions.code_name
      //  holder.content.text = versions.description

        val isExpandableMenu: Boolean = versionList[position].expandable
        holder.expandedMenu.visibility = if (isExpandableMenu) View.VISIBLE else View.GONE

        holder.codeName.setOnClickListener {
            versions.expandable = !versions.expandable
            notifyItemChanged(position)
        }


    }

    override fun getItemCount(): Int {

        return versionList.size
    }

}