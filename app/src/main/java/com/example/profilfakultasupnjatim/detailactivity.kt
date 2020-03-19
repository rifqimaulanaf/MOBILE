package com.example.profilfakultasupnjatim

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.detailfakultas.*
import kotlinx.android.synthetic.main.rvlistfakultas.*

class detailactivity : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.detailfakultas)
        var intentThatStartedThisActivity = intent

        if (intentThatStartedThisActivity.hasExtra(Intent.EXTRA_INTENT)) {

            var partName = intentThatStartedThisActivity.getStringExtra(Intent.EXTRA_INTENT)
            var partdeskripsi = intentThatStartedThisActivity.getStringExtra(Intent.EXTRA_TEXT)
            var partcaption = intentThatStartedThisActivity.getStringExtra(Intent.EXTRA_INDEX)
            var partImage = intentThatStartedThisActivity.getIntExtra(Intent.EXTRA_CHOSEN_COMPONENT, 0)
            namafakultas.text = partName
            deskripsifakultas.text = partdeskripsi
            caption.text=partcaption
            imgview.contentDescription = partName
            imgview.setImageResource(partImage)
        }
    }
}