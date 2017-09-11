package com.example.lenovo.tabbedactivity;

import android.graphics.Typeface;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

/**
 * Created by LENOVO on 5/17/2017.
 */

public class Question_4 extends android.support.v4.app.Fragment implements CompoundButton.OnCheckedChangeListener {
    //Variables for Buttons and Text View
    TextView q4;
    Button bt1;
    RadioGroup q4rg;
    RadioButton q4op1,q4op2,q4op3,q4op4;

    public static Question_4 newInstance() {
        Question_4 fragment = new Question_4();
        return fragment;
    }

    public Question_4(){
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater,ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.question_4, container, false);
        q4 = (TextView) rootView.findViewById(R.id.q4);
        q4rg = (RadioGroup) rootView.findViewById(R.id.q4rg);
        q4op1 = (RadioButton) rootView.findViewById(R.id.q4op1);
        q4op2 = (RadioButton) rootView.findViewById(R.id.q4op2);
        q4op3 = (RadioButton) rootView.findViewById(R.id.q4op3);
        q4op4 = (RadioButton) rootView.findViewById(R.id.q4op4);
        Typeface typeface = Typeface.createFromAsset(getContext().getAssets(),"Gothic-20.ttf");
        Typeface typeface2 = Typeface.createFromAsset(getContext().getAssets(),"Gothic-18.ttf");
        q4.setTypeface(typeface);
        q4op1.setTypeface(typeface2);
        q4op2.setTypeface(typeface2);
        q4op3.setTypeface(typeface2);
        q4op4.setTypeface(typeface2);
        return rootView;
    }

    @Override
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

    }
}