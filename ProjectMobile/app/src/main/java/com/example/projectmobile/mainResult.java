package com.example.projectmobile;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.fragment.app.Fragment;


/**
 * A simple {@link Fragment} subclass.
 */
public class mainResult extends Fragment {

    public mainResult() {
        // Required empty public constructor
    }
    TextView totl;
    TextView msg;
    int tototl = mainButton.t+ mainCheck.t2+ mainRadio.t3+ mainImage.t4+ mainList.t5;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_result, container, false);
        totl = view.findViewById(R.id.Finnal);
        msg = view.findViewById(R.id.message);
        totl.setText("Totol Score is " + String.valueOf(tototl));

        if(tototl<2){

                msg.setText("try agian.....");
        }
        else if(tototl==3){
            msg.setText("good.....");
        }
        else if(tototl==4){
            msg.setText("nice.....");
        }
        else if(tototl==5){
            msg.setText("exlnt.....");
        }

        return view;
    }
}
