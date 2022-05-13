package com.example.myapplication


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val  Calculatedvalue= findViewById<TextView>(R.id.calculatedvalue)
        val  Num1=findViewById<Button>(R.id.num1)
        val  Num2=findViewById<Button>(R.id.num2)
        val  Num3=findViewById<Button>(R.id.num3)
        val  Num4=findViewById<Button>(R.id.num4)
        val  Num5=findViewById<Button>(R.id.num5)
        val  Num6=findViewById<Button>(R.id.num6)
        val  Num7=findViewById<Button>(R.id.num7)
        val  Num8=findViewById<Button>(R.id.num8)
        val  Num9=findViewById<Button>(R.id.num9)
        val  Num0=findViewById<Button>(R.id.num0)
        val  Plus=findViewById<Button>(R.id.add)
        val  Equal=findViewById<Button>(R.id.equal)
        var count:Float= 0F
        var tmp:Float= 0F
        var curoperator=""

        Plus.setOnClickListener {

        }
        Equal.setOnClickListener {
            Calculatedvalue.setText((count+tmp).toString())
            tmp=0F
        }
        Num0.setOnClickListener {
            count *= 10
            Calculatedvalue.setText(count.toString())
        }
        Num1.setOnClickListener {
            count = count*10+1
            Calculatedvalue.setText(count.toString())
        }
        Num2.setOnClickListener {
            count = count*10+2
            Calculatedvalue.setText(count.toString())
        }
        Num3.setOnClickListener {
            count = count*10+3
            Calculatedvalue.setText(count.toString())
        }
        Num4.setOnClickListener {
            count = count*10+4
            Calculatedvalue.setText(count.toString())
        }
        Num5.setOnClickListener {
            count = count*10+5
            Calculatedvalue.setText(count.toString())
        }
        Num6.setOnClickListener {
            count = count*10+6
            Calculatedvalue.setText(count.toString())
        }
        Num7.setOnClickListener {
            count = count*10+7
            Calculatedvalue.setText(count.toString())
        }
        Num8.setOnClickListener {
            count = count*10+8
            Calculatedvalue.setText(count.toString())
        }
        Num9.setOnClickListener {
            count = count*10+9
            Calculatedvalue.setText(count.toString())
        }

        fun calculation(){
            if(curoperator=="add"){
                tmp += count
                count = 0F
                Calculatedvalue.setText(tmp.toString())
            }else if(curoperator=="sub"){
                tmp -= count
                count = 0F
                Calculatedvalue.setText(tmp.toString())
            }else if(curoperator=="mul"){
                tmp *= count
                count = 0F
                Calculatedvalue.setText(tmp.toString())
            }else if(curoperator=="div"){
                tmp /= count
                count = 0F
                Calculatedvalue.setText(tmp.toString())
            }

        }
    }
}