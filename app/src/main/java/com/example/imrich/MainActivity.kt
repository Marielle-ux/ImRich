package com.example.imrich

import android.media.MediaPlayer
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.imrich.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val mediaDo = MediaPlayer.create(this, R.raw.zvuk_do)
        val mediaRe = MediaPlayer.create(this, R.raw.zvuk_re)
        val mediaMi = MediaPlayer.create(this, R.raw.zvuk_mi)
        val mediaFa = MediaPlayer.create(this, R.raw.zvuk_fa)
        val mediaSol = MediaPlayer.create(this, R.raw.zvuk_sol)
        val mediaLya = MediaPlayer.create(this, R.raw.zvuk_lya)
        val mediaSi = MediaPlayer.create(this, R.raw.zvuk_si)

        binding.btnDo.setOnClickListener {
            mediaDo.start()
        }

        binding.btnRe.setOnClickListener {
            mediaRe.start()
        }

        binding.btnMi.setOnClickListener {
            mediaMi.start()
        }

        binding.btnFa.setOnClickListener {
            mediaFa.start()
        }

        binding.btnSol.setOnClickListener {
            mediaSol.start()
        }

        binding.btnLya.setOnClickListener {
            mediaLya.start()
        }

        binding.btnSi.setOnClickListener {
            mediaSi.start()
        }
    }
}

