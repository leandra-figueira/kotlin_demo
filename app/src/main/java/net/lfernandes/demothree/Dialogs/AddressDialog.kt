package net.lfernandes.myapplication.Dialogs
import android.support.v4.app.DialogFragment
import android.os.Bundle
import android.view.ViewGroup
import android.view.LayoutInflater
import android.view.View
import android.widget.Button
import android.widget.TextView
import net.lfernandes.demothree.MainActivity
import net.lfernandes.demothree.R

/**
 * Created by Leandra Fernandes on 2018-03-16.
 */
class AddressDialog : DialogFragment() {
    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View {
//
        val newView = inflater!!.inflate(R.layout.dialog_address, container, false)
        val dismiss = newView.findViewById<Button>(R.id.dlg_btnCancel) as Button

        dismiss.setOnClickListener {
            dismiss()
        }

        val enter = newView.findViewById<Button>(R.id.dlg_btnEnter) as Button
        val txtAddress = newView.findViewById<TextView>(R.id.dlg_etAddress) as TextView
        val txtCity = newView.findViewById<TextView>(R.id.dlg_etCity) as TextView
        val txtProvince = newView.findViewById<TextView>(R.id.dlg_etProvince) as TextView
        val txtCountry = newView.findViewById<TextView>(R.id.dlg_etCountry) as TextView
        val txtPostalCode = newView.findViewById<TextView>(R.id.dlg_etPostalCode) as TextView

        var address = " "
        var city = " "
        var province = " "
        var country = " "
        var postalCode = " "

        enter.setOnClickListener {

            if (txtAddress.text.toString() != null) { address = txtAddress.text.toString() + " " }
            if (txtCity.text.toString() != null) { city = txtCity.text.toString() + " " }
            if (txtProvince.text.toString() != null) { province = txtProvince.text.toString() + " " }
            if (txtCountry.text.toString() != null) { country = txtCountry.text.toString() + " "}
            if (txtPostalCode.text.toString() != null) { postalCode = txtPostalCode.text.toString()}

            val completeAddress = address + city + province + country + postalCode
            (activity as MainActivity).address = completeAddress
            val address = activity.findViewById<TextView>(R.id.tvAddress) as TextView
            address.text = (activity as MainActivity).address
            dismiss()
        }
        return newView
    }
}