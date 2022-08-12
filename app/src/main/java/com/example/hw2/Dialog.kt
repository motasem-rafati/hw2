package com.example.hw2
import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.content.*
import android.widget.*
import android.net.Uri
import com.example.hw2.BEST_APP.Companion.APP_ID
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.fragment.app.DialogFragment
import android.view.MenuInflater as MenuInflater1


class Dialog: DialogFragment(R.layout.adialog) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val cancelbt : Button = view.findViewById(R.id.cancle);
        val submitbt : Button = view.findViewById(R.id.add1);

        cancelbt.setOnClickListener{
            dismiss()
        }
        submitbt.setOnClickListener{
            val values = ContentValues()​
            values.put(​
            StudentsProvider.NAME,
            (findViewById<View>(R.id.editText1) as EditText).text.toString()
            )
            values.put(
            StudentsProvider.GRADE,
            (findViewById<View>(R.id.editText3) as EditText).text.toString()
            )



        }
    }
}