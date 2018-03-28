package net.lfernandes.myapplication.Dialogs

import android.os.Bundle
import android.support.v4.app.DialogFragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import net.lfernandes.demothree.MainActivity
import net.lfernandes.demothree.R


/**
 * Created by Leandra Fernandes on 2018-03-15.
 */
class NameDialog : DialogFragment() {
    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View {

        // use the inflater to inflate the layout
        val newView = inflater!!.inflate(R.layout.dialog_name, container, false)
        val dismiss = newView.findViewById<Button>(R.id.dlg_btnCancel) as Button

        dismiss.setOnClickListener{
            dismiss()
        }

        val enter = newView.findViewById<Button>(R.id.dlg_btnEnter) as Button
        val txtName = newView.findViewById<TextView>(R.id.dlg_etName) as TextView

        enter.setOnClickListener{
            (activity as MainActivity).name = txtName.text.toString()
            // gets the information from the Activity to assign the data to the text view on the activity
            val name = activity.findViewById<TextView>(R.id.tvName) as TextView
            name.text = (activity as MainActivity).name
            dismiss()
        }
        return newView
    }
}