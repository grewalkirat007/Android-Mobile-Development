package com.example.projectmobile;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ques {

    public String[] cars = {"hello how are you?",
                            "what do you like to eat?",
                            "What is your favorite sport?",
                            "Do you like to go to canada?",
                            "What is longest bridge?",
                            "Which is your fvouite colur.",
                            "The most wanted book",
                            "what is your favourite subject",
                            " Who is your fav actor",
                            "what is your hobby"
                            };
    public String[][] options={
            {"good","fine","not that bad","jakas"},
            {"mango","apple","peach","grapes"},
            {"football","tennis","criket","althes"},
            {"yes","no","not sure","never"},
            {"young bridge","loo bridge","sada bridge","tera bridge"},
            {"blue","red","matblack","pink"},
            {"50 shades","Black Ice","Darkneess","Flaw"},
            {"C#","Maths", "Python", "English"},
            {"sudha", "rachida","roshni","chadni"},
            {"gardening","football","listening music","redaing books"}
    };

    public String[] correctansawers = {
            "good",
            "mango",
            "football",
            "yes",
            "sada bridge",
            "matblack",
            "50 shades",
            "Python",
            "rachida",
            "gardening",

    };

    public String getcorrectans(int a){
        String c = correctansawers[a];
        return c;
    };


    public String getquestion(int a) {
        String qs = cars[a];
        return qs;
    }
    public String getoptione(int a) {
        String qs = options[a][0];
        return qs;
    }
    public String getoptionthree(int a) {
        String qs = options[a][2];
        return qs;
    }
    public String getoptionfour(int a) {
        String qs = options[a][3];
        return qs;
    }
    public String getoptiontwo(int a) {
        String qs = options[a][1];
        return qs;
    }

    public  static  int one ;
    public  static  int two ;
    public  static  int three ;
    public  static  int four ;

    public void getRandomElement()
    {
        List<Integer> list = new ArrayList<>();
        // add 5 element in ArrayList
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);
        list.add(0);

        int totalItems = 4;

        Random rand = new Random();

        // create a temporary list for storing
        // selected element
        List<Integer> newList = new ArrayList<>();
        for (int i = 0; i < totalItems; i++) {

            // take a raundom index between 0 to size
            // of given List
            int randomIndex = rand.nextInt(list.size());

            // add element in temporary list
            newList.add(list.get(randomIndex));

            // Remove selected element from orginal list
            list.remove(randomIndex);
        }
        one = newList.get(0);
        two = newList.get(1);
        three = newList.get(2);
        four = newList.get(3);

    }
    }
