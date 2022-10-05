package com.example.projectmobile;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.fragment.app.Fragment;


public class mainCheck extends Fragment {

    Button r1,r2,r3,r4;
    ques obj = new ques();
    public static int t2;
    int a = ques.two;
    TextView qs2;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_main_checkbox, container, false);
        perform(view);
        return view;
    }

    private void perform(View view) {
        r1 = view.findViewById(R.id.op1chk);
        r2 = view.findViewById(R.id.op2chk);
        r3 = view.findViewById(R.id.op3chk);
        r4 = view.findViewById(R.id.op4chk);
        qs2 = view.findViewById(R.id.q2);

        qs2.setText(obj.getquestion(a));
        r1.setText(obj.getoptione(a));
        r2.setText(obj.getoptiontwo(a));
        r3.setText(obj.getoptionthree(a));
        r4.setText(obj.getoptionfour(a));



        r1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(r1.getText().toString().equals(obj.getcorrectans(a))){
                    t2=  1;
                }
                else{
                    t2 = t2+0;
                }
            }
        });

        r2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(r2.getText().toString().equals(obj.getcorrectans(a))){
                    t2=  1;
                }
                else{
                    t2 = t2+0;
                }
            }
        });
        r3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(r3.getText().toString().equals(obj.getcorrectans(a))){
                    t2=  1;
                }
                else{
                    t2 = t2+0;
                }

            }
        });
        r4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(r4.getText().toString().equals(obj.getcorrectans(a))){
                    t2=  1;
                }
                else{
                    t2 = t2+0;
                }
            }
        });


    }

}
