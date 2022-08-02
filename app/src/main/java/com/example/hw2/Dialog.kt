package com.example.hw2
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.view.MenuInflater as MenuInflater1
import android.widget.*
import androidx.fragment.app.DialogFragment

class Dialog: DialogFragment(R.layout.adialog) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val cancelbt : Button = view.findViewById(R.id.cancelBT);
        val submitbt : Button = view.findViewById(R.id.submitBT);
        val radioGroup = view.findViewById<RadioGroup>(R.id.RatingRadioGroup)
        cancelbt.setOnClickListener{
            dismiss()
        }
        submitbt.setOnClickListener {
            val selectedOption: Int = radioGroup.checkedRadioButtonId
            val radioButton = view.findViewById<RadioButton>(selectedOption)
            Toast.makeText(context,radioButton.text,Toast.LENGTH_SHORT).show()

            dismiss()
            }
        submitbt.setOnClickListener {
            val selectedOption: Int = radioGroup.checkedRadioButtonId
            val radioButton = view.findViewById<RadioButton>(selectedOption)
            Toast.makeText(context,radioButton.text,Toast.LENGTH_SHORT).show()
            val m1:MainActivity = getActivity() as MainActivity;
            m1.receiveFeedback(radioButton.text.toString())
            dismiss()
        }
    }
}