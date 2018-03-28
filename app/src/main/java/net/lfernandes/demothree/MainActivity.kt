package net.lfernandes.demothree

import android.content.Intent
import net.lfernandes.myapplication.Dialogs.NameDialog
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import net.lfernandes.myapplication.Dialogs.EmailDialog
import net.lfernandes.myapplication.Dialogs.AddressDialog

class MainActivity : AppCompatActivity() {

    var name: String = ""
    var address: String = ""
    var email: String = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // get view by id not required for all cases
        btnOther.setOnClickListener{
             val intent = Intent(this, JavaActivity::class.java)
             startActivity(intent)
        }
    }

    // each of these functions are called from onClick event of the TextView. Available on the activity_main.xml
    // example: android:onClick="showEmailDialog"/>
    fun showNameDialog(v: View) {
        val dialog = NameDialog()
        dialog.show(supportFragmentManager, "NameDialog")
    }
    fun showAddressDialog(v: View){
        val dialog = AddressDialog()
        dialog.show(supportFragmentManager, "AddressDialog")
    }
    fun showEmailDialog(v: View){
        val dialog = EmailDialog()
        dialog.show(supportFragmentManager, "EmailDialog")
    }
}
