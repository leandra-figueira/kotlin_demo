package net.lfernandes.demothree;

import android.app.DialogFragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import net.lfernandes.demothree.Dialogs.JavaNameDialog;
import net.lfernandes.myapplication.Dialogs.EmailDialog;

public class JavaActivity extends AppCompatActivity {

    public String email;
    public TextView tvName;
    public TextView tvEmail;

    public String nameInput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_java);

        tvName = findViewById(R.id.tvName);
        tvEmail = findViewById(R.id.tvEmail);

        // initiate the java dialog
        tvName.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                JavaNameDialog dialog = new JavaNameDialog();
                dialog.show(getFragmentManager(), "JavaNameDialog");
            }
        });

        // initiate the kotlin dialog
        tvEmail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EmailDialog dialog = new EmailDialog();
                dialog.show(getSupportFragmentManager(), "EmailDialog");
            }
        });
    }
}
