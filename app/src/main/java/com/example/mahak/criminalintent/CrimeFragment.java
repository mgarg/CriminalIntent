package com.example.mahak.criminalintent;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.Editable;
import android.text.TextWatcher;
import android.text.format.DateFormat;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;

/**
 * Created by mahak on 23/7/16.
 */
public class CrimeFragment extends Fragment {
    private Crime crime;
    private EditText titleField;
    private Button button;
    private CheckBox checkBox;
    @Override
    public void onCreate(Bundle savedInstance){
        super.onCreate(savedInstance);
        crime = new Crime();


    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup,Bundle savedInstance){
        View v =inflater.inflate(R.layout.fragment_crime,viewGroup,false);
        button = (Button) v.findViewById(R.id.date);
        button.setText(crime.getDate().toString());
        button.setEnabled(false);

        checkBox = (CheckBox) v.findViewById(R.id.solved);

        checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                crime.setStatus(b);
            }
        });
        Log.d("hi",crime.isStatus()+"");
        titleField = (EditText) v.findViewById(R.id.crime_title);
        titleField.addTextChangedListener(
                new TextWatcher() {
                    @Override
                    public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

                    }

                    @Override
                    public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                        crime.setCrimeTitle(charSequence.toString());
                    }

                    @Override
                    public void afterTextChanged(Editable editable) {

                    }
                }
        );
        return v;
    }
}
