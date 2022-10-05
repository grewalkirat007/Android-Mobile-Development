package com.example.projectmobile;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.fragment.app.Fragment;


public class mainImage extends Fragment {
     ImageView r1,r2,r3,r4;
    public static int t4;
    TextView qs4;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_main_image, container, false);
        perform(view);
        return view;
    }

    private void perform(View view) {
        r1 = view.findViewById(R.id.op1img);
        r2 = view.findViewById(R.id.op2img);
        r3 = view.findViewById(R.id.op3img);
        r4 = view.findViewById(R.id.op4img);
        qs4 = view.findViewById(R.id.q4);

        qs4.setText("Which is the logo for ``?");

        r1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                t4 = t4+ 0;
            }
        });
        r2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                t4 = t4+ 0;
            }
        });
        r3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                t4 = t4+ 0;
            }
        });
        r4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                t4 = 1;
            }
        });





    }
}
