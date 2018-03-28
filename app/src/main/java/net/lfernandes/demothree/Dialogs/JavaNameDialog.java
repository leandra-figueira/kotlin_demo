package net.lfernandes.demothree.Dialogs;


import android.app.DialogFragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;


import net.lfernandes.demothree.JavaActivity;
import net.lfernandes.demothree.R;

/**
 * Created by Leandra Fernandes on 2018-03-28.
 */

public class JavaNameDialog extends DialogFragment {

    private EditText etName;
    private Button btnCancel, btnOK;
    private View newView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // I'm using the same layout xml here
        newView = inflater.inflate(R.layout.dialog_name, container, false);

        etName = newView.findViewById(R.id.dlg_etName);
        btnOK = newView.findViewById(R.id.dlg_btnEnter);
        btnCancel = newView.findViewById(R.id.dlg_btnCancel);

        btnCancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getDialog().dismiss();
            }
        });

        btnOK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String input = etName.getText().toString();
                if (!input.equals("")) {
                    ((JavaActivity)getActivity()).tvName.setText(input);
                }

                getDialog().dismiss();
            }
        });

        return newView;
    }

}