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

public class Question_7 extends android.support.v4.app.Fragment {
    //Variables for Buttons and Text View
    TextView q7;
    Button bt1;
    RadioGroup rgq7;
    RadioButton q7op1,q7op2,q7op3,q7op4;

    public static Question_7 newInstance() {
        Question_7 fragment = new Question_7();
        return fragment;
    }

    public Question_7(){
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater,ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.question_7, container, false);
        q7 = (TextView) rootView.findViewById(R.id.q7);
        rgq7 = (RadioGroup) rootView.findViewById(R.id.q7rg);
        q7op1 = (RadioButton) rootView.findViewById(R.id.q7op1);
        q7op2 = (RadioButton) rootView.findViewById(R.id.q7op2);
        q7op3 = (RadioButton) rootView.findViewById(R.id.q7op3);
        q7op4 = (RadioButton) rootView.findViewById(R.id.q7op4);
        Typeface typeface = Typeface.createFromAsset(getContext().getAssets(),"Gothic-20.ttf");
        Typeface typeface2 = Typeface.createFromAsset(getContext().getAssets(),"Gothic-18.ttf");
        q7.setTypeface(typeface);
        q7op1.setTypeface(typeface2);
        q7op2.setTypeface(typeface2);
        q7op3.setTypeface(typeface2);
        q7op4.setTypeface(typeface2);
        return rootView;
    }
}
