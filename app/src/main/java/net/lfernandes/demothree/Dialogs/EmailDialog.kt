package net.lfernandes.myapplication.Dialogs

import android.os.Bundle
import android.support.v4.app.DialogFragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ListView
import android.widget.TextView
import net.lfernandes.demothree.JavaActivity
import net.lfernandes.demothree.MainActivity
import net.lfernandes.demothree.R

/**
 * Created by Leandra Fernandes on 2018-03-21.
 */
class EmailDialog : DialogFragment() {
    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View {

        val newView = inflater!!.inflate(R.layout.dialog_email, container, false)
        val dismiss = newView.findViewById<Button>(R.id.dlg_btnCancel) as Button

        dismiss.setOnClickListener{
            dismiss()
        }

        val enter = newView.findViewById<Button>(R.id.dlg_btnEnter) as Button
        val txtEmail = newView.findViewById<TextView>(R.id.dlg_etEmail) as TextView

        enter.setOnClickListener{
            (activity as MainActivity).email = txtEmail.text.toString()
            // gets the information from the Activity to assign the data to the text view on the activity
            val email = activity.findViewById<TextView>(R.id.tvEmail) as TextView
            email.text = (activity as MainActivity).email
            dismiss()
        }

        val enter_java = newView.findViewById<Button>(R.id.dlg_btnEnterJava) as Button

        enter_java.setOnClickListener{
            (activity as JavaActivity).email = txtEmail.text.toString()
            val email = activity.findViewById<TextView>(R.id.tvEmail) as TextView
            email.text = (activity as JavaActivity).email
            dismiss()
        }

        return newView
    }
}