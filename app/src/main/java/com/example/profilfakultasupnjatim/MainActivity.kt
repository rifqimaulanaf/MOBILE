package com.example.profilfakultasupnjatim

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val testData = tambahan()
        rv.layoutManager = LinearLayoutManager(this)
        rv.setHasFixedSize(true)
        rv.adapter = adapter(testData) { fakultaslist: fakultaslistview -> klikfakultasItem(fakultaslist) }
    }


    private fun klikfakultasItem(fakultaslistview: fakultaslistview) {
        val showDetailActivityIntent = Intent(this, detailactivity::class.java)
        showDetailActivityIntent.putExtra(Intent.EXTRA_INTENT, fakultaslistview.namafakultaslist)
        showDetailActivityIntent.putExtra(Intent.EXTRA_INDEX, fakultaslistview.caption)
        showDetailActivityIntent.putExtra(Intent.EXTRA_TEXT, fakultaslistview.deskripsi)
        showDetailActivityIntent.putExtra(Intent.EXTRA_CHOSEN_COMPONENT, fakultaslistview.image)
        startActivity(showDetailActivityIntent)
    }
}
