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

public class Question_1 extends android.support.v4.app.Fragment {
    //Variables for Buttons and Text View
    TextView tv1;
    Button bt1;
    RadioGroup rgq1;
    RadioButton q1op1,q1op2,q1op3,q1op4;

    public static Question_1 newInstance() {
        Question_1 fragment = new Question_1();
        return fragment;
    }

    public Question_1(){
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater,ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.question_1, container, false);
        tv1 = (TextView) rootView.findViewById(R.id.q1);
        rgq1 = (RadioGroup) rootView.findViewById(R.id.q1rg);
        q1op1 = (RadioButton) rootView.findViewById(R.id.q1op1);
        q1op2 = (RadioButton) rootView.findViewById(R.id.q1op2);
        q1op3 = (RadioButton) rootView.findViewById(R.id.q1op3);
        q1op4 = (RadioButton) rootView.findViewById(R.id.q1op4);
        Typeface typeface = Typeface.createFromAsset(getContext().getAssets(),"Gothic-20.ttf");
        Typeface typeface2 = Typeface.createFromAsset(getContext().getAssets(),"Gothic-18.ttf");

        tv1.setTypeface(typeface);
        q1op1.setTypeface(typeface2);
        q1op2.setTypeface(typeface2);
        q1op3.setTypeface(typeface2);
        q1op4.setTypeface(typeface2);
        return rootView;
    }
}
