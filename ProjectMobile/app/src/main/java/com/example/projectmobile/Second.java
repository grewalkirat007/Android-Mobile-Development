package com.example.projectmobile;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

public class Second extends AppCompatActivity implements View.OnClickListener{
    Button next;
    public static int score = 0;
    Fragment fragment;
    int count = 1;
    ques obj = new ques();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        obj.getRandomElement();
        setContentView(R.layout.activity_second);
         fragment = new mainButton();
        transit(fragment);
        next = findViewById(R.id.nxtButton);
        next.setOnClickListener(this);

    }
    @Override
    public void onClick(View v) {
        count++;
        if(count==2){
            fragment = new mainCheck();
            transit(fragment);
             score+= mainButton.t;
        }
        else if(count==3){
            fragment = new mainRadio();
            transit(fragment);
            score+= mainCheck.t2;
        }
        else if(count==4){
            fragment = new mainImage();
            transit(fragment);
            score+= mainRadio.t3;
        }
        else if(count==5){
            fragment = new mainList();
            transit(fragment);
            score+= mainImage.t4;
            next.setText("Submit");
        }
        else if(count==6){
            fragment = new mainResult();
            transit(fragment);
            next.setText("Home");
            next.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    Intent intent = new Intent(Second.this,MainActivity.class);
                    startActivity(intent);
                }
            });
        }
    }
    void transit(Fragment fragment){
        FragmentManager manager = getSupportFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();
        transaction.replace(R.id.LayoutId,fragment);
        transaction.commit();
    }
}
