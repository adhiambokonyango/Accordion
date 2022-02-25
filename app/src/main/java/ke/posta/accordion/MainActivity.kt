package ke.posta.accordion

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton
import ke.posta.accordion.modules.FrontActivity
import ke.posta.accordion.modules.TestActivity

class MainActivity : AppCompatActivity() {

    private var versionList = ArrayList<Versions>()
    private lateinit var recyclerView: RecyclerView
    private lateinit var versionAdapter: VersionAdapter
    private lateinit var floatingActionButton: ExtendedFloatingActionButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

         recyclerView = findViewById(R.id.recyclerView)
        floatingActionButton = findViewById(R.id.iconEmail)

        floatingActionButton.setOnClickListener {
            val intent = Intent(this,FrontActivity::class.java)
            startActivity(intent)
        }

        initData()
        setRecyclerView()
    }

    private fun setRecyclerView() {
     //   versionAdapter = VersionAdapter(versionList)
        recyclerView.layoutManager = LinearLayoutManager(applicationContext)
        recyclerView.setHasFixedSize(false)
        versionAdapter = VersionAdapter(versionList)
        recyclerView.adapter = versionAdapter

    }

    private fun initData() {
        versionList.add(
            Versions(
                "Coder version 10",
                "Lorem Ipsum is simply dummy text of the printing and typesetting industry"
            )
        )
        versionList.add(
            Versions(
                "Coder version 10",
                "Lorem Ipsum is simply dummy text of the printing and typesetting industry"
            )
        )
        versionList.add(
            Versions(
                "Coder version 10",
                "Lorem Ipsum is simply dummy text of the printing and typesetting industry"
            )
        )
        versionList.add(
            Versions(
                "Coder version 10",
                "Lorem Ipsum is simply dummy text of the printing and typesetting industry"
            )
        )
    }

}