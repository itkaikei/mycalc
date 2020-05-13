package com.example.mycalc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //足し算のボタン
        btnAdd.setOnClickListener {
            if( edtInput.text.toString().equals("")) {
                Toast.makeText(this, "数値の入力をしましょう。", Toast.LENGTH_SHORT).show()
            }else{
                var total = Integer.parseInt(txtDisplay.text.toString())
                var num = Integer.parseInt(edtInput.text.toString())
                total = total + num
                txtDisplay.text = total.toString()
                edtInput.setText("")
            }
        }
        //引き算のボタン
        btnSub.setOnClickListener {
            if( edtInput.text.toString().equals("")){
                Toast.makeText( this, "数値の入力をしましょう。",Toast.LENGTH_SHORT).show()
            }else {
                var total = Integer.parseInt(txtDisplay.text.toString())
                var num = Integer.parseInt(edtInput.text.toString())
                total = total - num
                txtDisplay.text = total.toString()
                edtInput.setText("")
            }
        }
        //掛け算のボタン
        btnMul.setOnClickListener {
            if( edtInput.text.toString().equals("")){
                Toast.makeText( this, "数値の入力をしましょう。",Toast.LENGTH_SHORT).show()
            }else {
                var total = Integer.parseInt(txtDisplay.text.toString())
                var num = Integer.parseInt(edtInput.text.toString())
                total = total * num
                txtDisplay.text = total.toString()
                edtInput.setText("")
            }
        }
        //割り算のボタン
        btnDev.setOnClickListener {
            if( edtInput.text.toString().equals("")){
                Toast.makeText( this, "数値の入力をしましょう。",Toast.LENGTH_SHORT).show()
            }else {
                var total = Integer.parseInt(txtDisplay.text.toString())
                var num = Integer.parseInt(edtInput.text.toString())
                total = total / num
                txtDisplay.text = total.toString()
                edtInput.setText("")
            }
        }

    }
}
