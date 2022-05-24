package com.example.lv4_vorgic

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.annotation.IntegerRes
import androidx.lifecycle.ViewModelProvider
import com.example.lv4_vorgic.databinding.ActivityMainBinding
import org.koin.androidx.viewmodel.ext.android.viewModel
import java.text.SimpleDateFormat
import java.util.*

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private val viewModel: MainViewModel by viewModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater).also {
            it.bTeamAOne.setOnClickListener { viewModel.addOneA() }
            it.bTeamATwo.setOnClickListener { viewModel.addTwoA() }
            it.bTeamAThree.setOnClickListener { viewModel.addThreeA() }
            it.bTeamBOne.setOnClickListener { viewModel.addOneB() }
            it.bTeamBTwo.setOnClickListener { viewModel.addTwoB() }
            it.bTeamBThree.setOnClickListener { viewModel.addThreeB() }
            it.bReset.setOnClickListener { viewModel.reset() }

        }
        setContentView(binding.root)

        val textView: TextView = findViewById(R.id.dateAndTime)
        val simpleDateFormat = SimpleDateFormat("dd.MM.yyyy.")
        val currentDateAndTime: String = simpleDateFormat.format(Date())
        textView.text = currentDateAndTime

        viewModel.countA.observe(this, { binding.tvCountTeamA.text = it.toString()})
        viewModel.countB.observe(this, { binding.tvCountTeamB.text = it.toString()})

        viewModel.countA.observe(this, {countA -> if (countA >= 30) {
            binding.tvCountTeamA.setBackgroundColor(resources.getColor(R.color.teamAlight))
        }})

        viewModel.countA.observe(this, {countA -> if (countA.toString() < "30") {
            binding.tvCountTeamA.setBackgroundColor(resources.getColor(R.color.white))
        }})

        viewModel.countB.observe(this, {countB -> if (countB >= 30) {
                binding.tvCountTeamB.setBackgroundColor(resources.getColor(R.color.teamBlight))
            }} )

        viewModel.countB.observe(this, {countB -> if (countB.toString() < "30") {
            binding.tvCountTeamB.setBackgroundColor(resources.getColor(R.color.white))
        }})

    }
}
