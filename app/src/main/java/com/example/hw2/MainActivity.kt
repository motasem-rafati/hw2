package com.example.hw2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.view.MenuInflater as MenuInflater1
import android.widget.*
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button: Button = findViewById(R.id.order)
        val talb : TextView = findViewById(R.id.Result)

        var flag : String = "pizza"

        val spinnerVal : Spinner = findViewById(R.id.spinnera)

        var options = arrayOf("pizza hot","macdonald")

        spinnerVal.adapter = ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,options )

        button.setOnClickListener{
            if(flag=="pizza hot") {
                var dialog_var = Dialog()
                dialog_var.show(supportFragmentManager, "Custom Dialog")
            }
            else {
                var dialog_va = bdialog()
                dialog_va.show(supportFragmentManager, "Custom Dialog")
            }
        }



        spinnerVal.onItemSelectedListener = object : AdapterView.OnItemSelectedListener{

            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {

                flag = options.get(p2) //p2 is the index of selected item

            }

            override fun onNothingSelected(p0: AdapterView<*>?) {

                TODO("Not yet implemented")

            }

        }


    }


    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu to use in the action bar
        val inflater = menuInflater
        inflater.inflate(R.menu.like_menu, menu)
        return super.onCreateOptionsMenu(menu)

        }
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId){

            R.id.item2 -> Toast.makeText(this, "like the restaurant", Toast.LENGTH_SHORT).show()
            R.id.item3 -> Toast.makeText(this, "dislike the restaurant", Toast.LENGTH_SHORT).show()

        }
        return true;
    }
    fun receiveFeedback(feedback: String){
        val or : TextView = findViewById(R.id.Result)
        or.text = feedback;


    }
    }
