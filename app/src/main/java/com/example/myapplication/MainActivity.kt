package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var luckycard = 0
    var fortune = 0
    var gamestart = false
    var ansered = false

    override fun onResume() {
        super.onResume()
        Result_Fortune.text = getString(R.string.result_fortune)
        Lucky_Cardimage.setImageResource(R.drawable.z02)
        gamestart = true

        letFortune()

    }
    private fun letFortune(){
        luckycard = (1..13).random()
        fortune = (1..4).random()
}
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Let_fortuneBtn.setOnClickListener {
            if (gamestart == !ansered)
                tellingFortune()
            }

        restartBtn.setOnClickListener {
            onResume()
            ansered = false
        }
        }
    private fun tellingFortune(){
        when(luckycard){
        1 -> Lucky_Cardimage.setImageResource(R.drawable.c01)
        2 -> Lucky_Cardimage.setImageResource(R.drawable.c02)
        3 -> Lucky_Cardimage.setImageResource(R.drawable.c03)
        4 -> Lucky_Cardimage.setImageResource(R.drawable.c04)
        5 -> Lucky_Cardimage.setImageResource(R.drawable.c05)
        6 -> Lucky_Cardimage.setImageResource(R.drawable.c06)
        7 -> Lucky_Cardimage.setImageResource(R.drawable.c07)
        8 -> Lucky_Cardimage.setImageResource(R.drawable.c08)
        9 -> Lucky_Cardimage.setImageResource(R.drawable.c09)
        10 -> Lucky_Cardimage.setImageResource(R.drawable.c10)
        11 -> Lucky_Cardimage.setImageResource(R.drawable.c11)
        12 -> Lucky_Cardimage.setImageResource(R.drawable.c12)
        13 -> Lucky_Cardimage.setImageResource(R.drawable.c13)
    }
     when(fortune){
         1 -> Result_Fortune.text = getString(R.string.very_good)
         2 -> Result_Fortune.text = getString(R.string.good)
         3 -> Result_Fortune.text = getString(R.string.very_bad)
         4 -> Result_Fortune.text = getString(R.string.bad)
     }
        ansered = true
    }

}



