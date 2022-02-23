package ke.posta.accordion

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    val versionList = ArrayList<Versions>()
    private lateinit var recyclerView: RecyclerView
    private lateinit var versionAdapter: VersionAdapter


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

         recyclerView = findViewById(R.id.recyclerView)


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