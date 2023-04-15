package com.emobilis.calintentweb

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class CalculatorActivity2 : AppCompatActivity() {
    lateinit var TextView_answer:TextView
    lateinit var Edt_Fnum:EditText
    lateinit var Edt_Snum:EditText
    lateinit var buttonadd:Button
    lateinit var buttonminus:Button
    lateinit var buttontimes: Button
    lateinit var buttondivide: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculator2)
        TextView_answer=findViewById(R.id.Txt_answer)
        Edt_Fnum=findViewById(R.id.Edt_Fnum)
        Edt_Snum=findViewById(R.id.Edt_Snum)
        buttonadd=findViewById(R.id.Btn_add)
        buttonminus=findViewById(R.id.Btn_minus)
        buttontimes=findViewById(R.id.Btn_times)
        buttondivide=findViewById(R.id.Btn_divide)

        buttonadd.setOnClickListener {
            var myfirstnumber=Edt_Fnum.text.toString()
            var mysecondnumber=Edt_Snum.text.toString()
            if (myfirstnumber.isEmpty() && mysecondnumber.isEmpty()){
                TextView_answer.text="Please fill in all inputs"

            }else{
                //lets now calculate
                var answer=myfirstnumber.toDouble()+mysecondnumber.toDouble()
                TextView_answer.text=answer.toString()
            }
        }

        buttonminus.setOnClickListener {
            var myfirstnumber=Edt_Fnum.text.toString()
            var mysecondnumber=Edt_Snum.text.toString()
            if (myfirstnumber.isEmpty() && mysecondnumber.isEmpty()){
                TextView_answer.text="Please fill in all inputs"

            }else{
                //lets now calculate
                var  answer=myfirstnumber.toDouble()-mysecondnumber.toDouble()
                TextView_answer.text=answer.toString()
            }
        }

        buttontimes.setOnClickListener {
            var myfirstnumber=Edt_Fnum.text.toString()
            var mysecondnumber=Edt_Snum.text.toString()
            if (myfirstnumber.isEmpty() && mysecondnumber.isEmpty()){
                TextView_answer.text="Please fill in all inputs"

            }else{
                //lets now calculate
                var answer=myfirstnumber.toDouble()*mysecondnumber.toDouble()
                TextView_answer.text=answer.toString()
            }
        }

        buttondivide.setOnClickListener {
            var myfirstnumber=Edt_Fnum.text.toString()
            var mysecondnumber=Edt_Snum.text.toString()
            if (myfirstnumber.isEmpty() && mysecondnumber.isEmpty()){
                TextView_answer.text="PLease fill in all inputs"

            }else{
                //lets now calculate
                var answer=myfirstnumber.toDouble()/mysecondnumber.toDouble()
                TextView_answer.text=answer.toString()
            }
        }

    }
}