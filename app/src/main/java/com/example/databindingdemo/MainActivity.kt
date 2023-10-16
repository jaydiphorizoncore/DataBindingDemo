package com.example.databindingdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.databindingdemo.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding.company = getCompany()


        binding.btnSubmit.setOnClickListener {
            displayGreeting()
        }
    }

    private fun getCompany(): Company {
        return Company(1, "Jay", "jay@gmail.com")
    }

    private fun displayGreeting() {
        binding.tv.text = "hello " + binding.edName.text

    }
}
