package com.example.myapplication


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import java.lang.Integer.parseInt
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val  Calculatedvalue= findViewById<TextView>(R.id.calculatedvalue)
        val  Clear=findViewById<Button>(R.id.clear)
        val  Allclear=findViewById<Button>(R.id.allclear)
        val  Signchange=findViewById<Button>(R.id.signchange)
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
        val  Num00=findViewById<Button>(R.id.num00)
        val  Add=findViewById<Button>(R.id.add)
        val  Sub=findViewById<Button>(R.id.sub)
        val  Mul=findViewById<Button>(R.id.mul)
        val  Div=findViewById<Button>(R.id.div)
        val  Equal=findViewById<Button>(R.id.equal)
        var count= 0F
        var tmp= 0F
        var curoperator=""
        var mulcount=0

        Add.setOnClickListener {
            tmp=calculation(curoperator,tmp,count)
            Calculatedvalue.setText(tmp.toString())
            count=0F
            curoperator="add"
        }
        Sub.setOnClickListener {
            tmp=calculation(curoperator,tmp,count)
            Calculatedvalue.setText(tmp.toString())
            count=0F
            curoperator="sub"
        }
        Mul.setOnClickListener {
            if (count!=0F) {
                tmp = calculation(curoperator, tmp, count)
                Calculatedvalue.setText(tmp.toString())
                count = 0F
            }
            curoperator="mul"
        }
        Div.setOnClickListener {
            if (count!=0F) {
                tmp = calculation(curoperator, tmp, count)
                Calculatedvalue.setText(tmp.toString())
                count = 0F
            }
            curoperator="div"
        }
        Equal.setOnClickListener {
            tmp=calculation(curoperator,tmp,count)
            Calculatedvalue.setText(tmp.toString())
            count=0F
        }
        Num0.setOnClickListener {
            count *= 10
            Calculatedvalue.setText(count.toString())
        }
        Num00.setOnClickListener {
            count *= 100
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
        Clear.setOnClickListener {
            count=0F
            Calculatedvalue.setText(count.toString())
        }
        Allclear.setOnClickListener {
            count=0F
            tmp=0F
            Calculatedvalue.setText(count.toString())
            curoperator=""
        }
        Signchange.setOnClickListener {
            if (count!=0F) {
                count *= -1
                Calculatedvalue.setText(count.toString())
            }
        }

    }

    private fun calculation(curoperator:String,tmp:Float,count:Float): Float {
        return if(curoperator=="add"){
            tmp+count
        }else if(curoperator=="sub"){
            tmp-count
        }else if(curoperator=="mul"){
            tmp*count
        }else if(curoperator=="div"){
            tmp/count
        }else{
            count
        }
    }
}