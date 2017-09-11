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

public class Question_8 extends android.support.v4.app.Fragment {
    //Variables for Buttons and Text View
    TextView q8;
    Button bt1;
    RadioGroup rgq8;
    RadioButton q8op1,q8op2,q8op3,q8op4;

    public static Question_8 newInstance() {
        Question_8 fragment = new Question_8();
        return fragment;
    }

    public Question_8(){
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater,ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.question_8, container, false);
        q8 = (TextView) rootView.findViewById(R.id.q8);
        rgq8 = (RadioGroup) rootView.findViewById(R.id.q8rg);
        q8op1 = (RadioButton) rootView.findViewById(R.id.q8op1);
        q8op2 = (RadioButton) rootView.findViewById(R.id.q8op2);
        q8op3 = (RadioButton) rootView.findViewById(R.id.q8op3);
        q8op4 = (RadioButton) rootView.findViewById(R.id.q8op4);
        Typeface typeface = Typeface.createFromAsset(getContext().getAssets(),"Gothic-20.ttf");
        Typeface typeface2 = Typeface.createFromAsset(getContext().getAssets(),"Gothic-18.ttf");
        q8.setTypeface(typeface);
        q8op1.setTypeface(typeface2);
        q8op2.setTypeface(typeface2);
        q8op3.setTypeface(typeface2);
        q8op4.setTypeface(typeface2);
        return rootView;
    }
}
