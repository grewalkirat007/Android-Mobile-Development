package com.example.projectmobile;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.fragment.app.Fragment;


public class mainButton extends Fragment {
    Button r1,r2,r3,r4;
    TextView qs1;
    int a = ques.one;
    public static int t ;
    ques obj = new ques();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_main_button, container, false);
        perform(view);

        return view;
}
    private void perform(View view) {
        r1 = view.findViewById(R.id.op1btn);
        r2 = view.findViewById(R.id.op2btn);
        r3 = view.findViewById(R.id.op3btn);
        r4 = view.findViewById(R.id.op4btn);
        qs1 = view.findViewById(R.id.q1);

        qs1.setText(obj.getquestion(a));
        r1.setText(obj.getoptione(a));
        r2.setText(obj.getoptiontwo(a));
        r3.setText(obj.getoptionthree(a));
        r4.setText(obj.getoptionfour(a));

    r1.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            if(r1.getText().toString().equals(obj.getcorrectans(a))){
                t = 1;
            }
            else{
                t = 0;

            }
        }
    });
        r2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(r2.getText().toString().equals(obj.getcorrectans(a))){
                    t = 1;
                }
                else{
                    t = 0;

                }
            }
        });
        r3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(r3.getText().toString().equals(obj.getcorrectans(a))){
                    t = 1;
                }
                else{
                    t = 0;

                }
            }
        });
        r4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(r4.getText().toString().equals(obj.getcorrectans(a))){
                    t = 1;
                }
                else{
                    t = 0;

                }
            }
        });

}
}
