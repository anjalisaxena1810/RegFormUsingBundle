package com.example.myinfo

import android.app.Activity
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.widget.CompoundButton
import android.widget.CompoundButton.OnCheckedChangeListener
import com.example.myinfo.databinding.ActivityMain2Binding
import com.example.myinfo.databinding.ActivityMainBinding



class MainActivity : AppCompatActivity(), View.OnClickListener , OnCheckedChangeListener {


    private lateinit var binding: ActivityMainBinding
    private var listOfCheckBoxText = ArrayList<String>()
    private lateinit var gender: String


    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.btnsubmit.setOnClickListener (this)
        binding.cbcoding.setOnCheckedChangeListener(this)
        binding.teach.setOnCheckedChangeListener(this)
        binding.Accept.setOnCheckedChangeListener(this)
        binding.cbengg.setOnCheckedChangeListener(this)
        binding.travel.setOnCheckedChangeListener(this)

    }

//    fun myDetail() {
//        binding.alldetails.text =
//            binding.fname.text.toString() + " " + binding.lname.text.toString() + "\n" +
//                    binding.mobile.text.toString() + "\n" +
//                    binding.email.text.toString()
//
//    }


   protected fun share(){

    val intent = Intent(this@MainActivity, MainActivity2::class.java)
    var fname: String = binding.fname.text.toString()
    var lname: String = binding.lname.text.toString()
    var mobile: String = binding.mobile.text.toString()
    var email: String = binding.email.text.toString()



    intent.putExtra("fname", fname)
    intent.putExtra("lname", lname)
    intent.putExtra("mobile", mobile)
    intent.putExtra("email", email)
    intent.putExtra("gender", gender)
    intent.putExtra("hobbies", listOfCheckBoxText.joinToString())

    startActivity(intent)

    }


    override fun onClick(view: View?) {

        when (binding.rdGroup.checkedRadioButtonId) {

            R.id.btn_male -> {
                gender = binding.btnMale.text.toString()
            }
          R.id.btn_fmale -> {
                gender =binding.btnFmale.text.toString()

            }

            R.id.btn_trans -> {
                gender = binding.btnTrans.text.toString()
            }

        }
    share()
//        myDetail()
//        binding.txtDis.text = listOfCheckBoxText.toString()

    }


    override fun onCheckedChanged(view: CompoundButton?, p1: Boolean) {
        when (view?.id) {
            R.id.cbcoding -> {
                if (view.isChecked) {
                    listOfCheckBoxText.add(binding.cbcoding.text.toString())
                } else {
                    if (listOfCheckBoxText.contains(binding.cbcoding.text.toString())) {
                        listOfCheckBoxText.remove(binding.cbcoding.text.toString())
                    }
                }
            }
            R.id.cbengg -> {
                if (view.isChecked) {
                    listOfCheckBoxText.add(binding.cbengg.text.toString())
                } else {
                    if (listOfCheckBoxText.contains(binding.cbengg.text.toString())) {
                        listOfCheckBoxText.remove(binding.cbengg.text.toString())
                    }
                }
            }
            R.id.travel -> {
                if (view.isChecked) {
                    listOfCheckBoxText.add(binding.travel.text.toString())
                } else {
                    if (listOfCheckBoxText.contains(binding.travel.text.toString())) {
                        listOfCheckBoxText.remove(binding.travel.text.toString())
                    }
                }
            }
            R.id.teach -> {
                if (view.isChecked) {
                    listOfCheckBoxText.add(binding.teach.text.toString())
                } else {
                    if (listOfCheckBoxText.contains(binding.teach.text.toString())) {
                        listOfCheckBoxText.remove(binding.teach.text.toString())
                    }
                }
            }
            R.id.Accept -> {
                if (view.isChecked) {
                    listOfCheckBoxText.add(binding.Accept.text.toString())
                } else {
                    if (listOfCheckBoxText.contains(binding.Accept.text.toString())) {
                        listOfCheckBoxText.remove(binding.Accept.text.toString())
                    }
                }
            }


        }
    }
}
