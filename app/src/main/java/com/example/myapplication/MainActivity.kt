package com.example.myapplication

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.myapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        //enableEdgeToEdge()
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val num1 = binding.num1editText.text
        val num2 = binding.num2editText.text

        // Bila button + ditekan lakukan kod di dalam ini
        binding.plusBtn.setOnClickListener {
            val sum = num1.toString().toDouble() + num2.toString().toDouble();
            binding.resultTextView.text = "The sum of $num1 and $num2 is $sum";
        }

        binding.minusBtn.setOnClickListener {
            val minus = num1.toString().toDouble() - num2.toString().toDouble();
            binding.resultTextView.text = "The minus of $num1 and $num2 is $minus";
        }

        binding.productBtn.setOnClickListener {
            val multiple =  num1.toString().toDouble() * num2.toString().toDouble();
            binding.resultTextView.text = "The product of $num1 and $num2 is $multiple";
        }

        binding.divideBtn.setOnClickListener {
            val division =  num1.toString().toDouble() / num2.toString().toDouble();
            binding.resultTextView.text = "The divison of $num1 and $num2 is $division";
        }


    }
}