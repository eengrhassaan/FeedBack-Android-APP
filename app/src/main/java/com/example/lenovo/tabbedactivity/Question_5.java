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

public class Question_5 extends android.support.v4.app.Fragment {
    //Variables for Buttons and Text View
    TextView q5;
    RadioGroup q5rg;
    RadioButton q5op1,q5op2,q5op3,q5op4;

    public static Question_5 newInstance() {
        Question_5 fragment = new Question_5();
        return fragment;
    }

    public Question_5(){
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater,ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.question_5, container, false);
        q5 = (TextView) rootView.findViewById(R.id.q5);
        q5rg = (RadioGroup) rootView.findViewById(R.id.q5rg);
        q5op1 = (RadioButton) rootView.findViewById(R.id.q5op1);
        q5op2 = (RadioButton) rootView.findViewById(R.id.q5op2);
        q5op3 = (RadioButton) rootView.findViewById(R.id.q5op3);
        q5op4 = (RadioButton) rootView.findViewById(R.id.q5op4);
        Typeface typeface = Typeface.createFromAsset(getContext().getAssets(),"Gothic-20.ttf");
        Typeface typeface2 = Typeface.createFromAsset(getContext().getAssets(),"Gothic-18.ttf");
        q5.setTypeface(typeface);
        q5op1.setTypeface(typeface2);
        q5op2.setTypeface(typeface2);
        q5op3.setTypeface(typeface2);
        q5op4.setTypeface(typeface2);
        return rootView;
    }
}