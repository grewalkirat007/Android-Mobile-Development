package com.example.projectmobile;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import androidx.fragment.app.Fragment;


public class mainRadio extends Fragment {
    RadioButton r1,r2,r3,r4;
    RadioGroup rb;
    TextView qs3;
    ques obj = new ques();
    int a = ques.three;
 public static int t3;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
       View view = inflater.inflate(R.layout.fragment_main_radio, container, false);
       perform(view);
        return view;
    }

    private void perform(View view) {
        rb = view.findViewById(R.id.rad);
        r1 = view.findViewById(R.id.op1rad);
        r2 = view.findViewById(R.id.op2rad);
        r3 = view.findViewById(R.id.op3rad);
        r4 = view.findViewById(R.id.op4rad);
        qs3 = view.findViewById(R.id.q3);

        qs3.setText(obj.getquestion(a));
        r1.setText(obj.getoptione(a));
        r2.setText(obj.getoptiontwo(a));
        r3.setText(obj.getoptionthree(a));
        r4.setText(obj.getoptionfour(a));


        r1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    if(r1.getText().toString().equals(obj.getcorrectans(a))){
                        t3 = 1;
                    }
                    else{
                        t3 = 0;
                    }
                }
            }
        });
        r2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    if(r2.getText().toString().equals(obj.getcorrectans(a))){
                        t3 = 1;
                    }
                    else{
                        t3 = 0;
                    }
                }
            }
        });
        r3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    if(r3.getText().toString().equals(obj.getcorrectans(a))){
                        t3 = 1;
                    }
                    else{
                        t3 = 0;
                    }
                }
            }
        });
        r4.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    if(r4.getText().toString().equals(obj.getcorrectans(a))){
                        t3 = 1;
                    }
                    else{
                        t3 = 0;
                    }
                }
            }
        });

    }

}
