package com.example.projectmobile;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

import java.util.ArrayList;

public class mainList extends Fragment {
    ListView lstv;
     TextView qs5;
    ques obj = new ques();
   public static int t5;
    int a = ques.four;
    ArrayList<String> arrayList = new ArrayList<>();
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_main_list, container, false);
        perform(view);
        return view;
    }

    private void perform(View view) {

        qs5 = view.findViewById(R.id.question5);
        qs5.setText(obj.getquestion(a));
        lstv = (ListView) view.findViewById(R.id.listview);
        arrayList.add(obj.getoptione(a));
        arrayList.add(obj.getoptiontwo(a));
        arrayList.add(obj.getoptionthree(a));
        arrayList.add(obj.getoptionfour(a));

        ArrayAdapter<String> arrayAdapter =  new ArrayAdapter<String>(getActivity() , android.R.layout.simple_list_item_1, arrayList);
        lstv.setAdapter(arrayAdapter);
        lstv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                                        @Override
                                        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                                            String clickedItem=(String) lstv.getItemAtPosition(position);
                                            if(clickedItem.equals(obj.getcorrectans(2))){
                                                t5 =1;

                                            }
                                            else
                                            {
                                                    t5=0;
                                            }
                                        }

                                    }
        );
    }

}
