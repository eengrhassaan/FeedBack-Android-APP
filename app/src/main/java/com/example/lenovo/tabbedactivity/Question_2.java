package com.example.lenovo.tabbedactivity;

import android.graphics.Typeface;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

/**
 * Created by LENOVO on 5/17/2017.
 */

public class Question_2 extends android.support.v4.app.Fragment {
    //Variables for Buttons and Text View
    TextView q2;
    RadioGroup q2rg;
    RadioButton q2op1,q2op2,q2op3,q2op4;
    Button bt1;
    int size_f=5;

    public static Question_2 newInstance() {
        Question_2 fragment = new Question_2();
        return fragment;
    }

    public Question_2(){
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater,ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.question_2, container, false);
        q2 = (TextView) rootView.findViewById(R.id.q2);
        q2rg = (RadioGroup) rootView.findViewById(R.id.q2rg);
        q2op1 = (RadioButton) rootView.findViewById(R.id.q2op1);
        q2op2 = (RadioButton) rootView.findViewById(R.id.q2op2);
        q2op3 = (RadioButton) rootView.findViewById(R.id.q2op3);
        q2op4 = (RadioButton) rootView.findViewById(R.id.q2op4);
        Typeface typeface = Typeface.createFromAsset(getContext().getAssets(),"Gothic-20.ttf");
        Typeface typeface2 = Typeface.createFromAsset(getContext().getAssets(),"Gothic-18.ttf");
        q2.setTypeface(typeface);
        q2op1.setTypeface(typeface2);
        q2op2.setTypeface(typeface2);
        q2op3.setTypeface(typeface2);
        q2op4.setTypeface(typeface2);
        return rootView;
    }
}