package com.example.lenovo.tabbedactivity;

import android.content.Context;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.annotation.IdRes;
import android.support.annotation.Nullable;
import android.support.v4.widget.CompoundButtonCompat;
import android.text.InputType;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

/**
 * Created by LENOVO on 5/17/2017.
 */

public class Question_6 extends android.support.v4.app.Fragment implements CompoundButton.OnCheckedChangeListener {
    //Variables for Buttons and Text View
    TextView q6;
    Button bt1;
    RadioGroup rgq6;
    RadioButton q6op1,q6op2,q6op3,q6op4,q6op5;
    EditText q6ed1;
    public static Question_6 newInstance() {
        Question_6 fragment = new Question_6();
        return fragment;
    }

    public Question_6(){
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater,ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.question_6, container, false);
        q6 = (TextView) rootView.findViewById(R.id.q6);
        rgq6 = (RadioGroup) rootView.findViewById(R.id.q6rg);
        q6op1 = (RadioButton) rootView.findViewById(R.id.q6op1);
        q6op2 = (RadioButton) rootView.findViewById(R.id.q6op2);
        q6op3 = (RadioButton) rootView.findViewById(R.id.q6op3);
        q6op4 = (RadioButton) rootView.findViewById(R.id.q6op4);
        q6op5 = (RadioButton) rootView.findViewById(R.id.q6op5);
        q6ed1 = (EditText) rootView.findViewById(R.id.q6ed1);
        Typeface typeface = Typeface.createFromAsset(getContext().getAssets(),"Gothic-20.ttf");
        Typeface typeface2 = Typeface.createFromAsset(getContext().getAssets(),"Gothic-18.ttf");
        q6.setTypeface(typeface);
        q6op1.setTypeface(typeface2);
        q6op2.setTypeface(typeface2);
        q6op3.setTypeface(typeface2);
        q6op4.setTypeface(typeface2);
        q6op5.setTypeface(typeface2);
        q6op1.setOnCheckedChangeListener((CompoundButton.OnCheckedChangeListener) this);
        q6op2.setOnCheckedChangeListener((CompoundButton.OnCheckedChangeListener) this);
        q6op3.setOnCheckedChangeListener((CompoundButton.OnCheckedChangeListener) this);
        q6op4.setOnCheckedChangeListener((CompoundButton.OnCheckedChangeListener) this);
        q6op5.setOnCheckedChangeListener((CompoundButton.OnCheckedChangeListener) this);

        q6ed1.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                q6ed1.post(new Runnable() {
                    @Override
                    public void run() {
                        InputMethodManager imm = (InputMethodManager) getActivity().getSystemService(Context.INPUT_METHOD_SERVICE);
                        imm.showSoftInput(q6ed1, InputMethodManager.SHOW_IMPLICIT);

                    }
                });
            }
        });

        rgq6.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, @IdRes int checkedId) {
                if (checkedId == R.id.q6op5){
                    edBox(true);
                }
                else{
                    edBox(false);
                }
            }
        });
        return rootView;
    }

    private void edBox(boolean states) {
        if (states){
            q6ed1.requestFocus();
            q6ed1.setEnabled(true);
            q6ed1.setInputType(InputType.TYPE_CLASS_TEXT);
            q6ed1.setFocusable(true);
            q6ed1.setActivated(true);
//            InputMethodManager imm = (InputMethodManager)getActivity().getSystemService(Context.INPUT_METHOD_SERVICE);
//            imm.showSoftInput(q9ed1, InputMethodManager.SHOW_IMPLICIT);

        }
        else{
            q6ed1.setEnabled(false);
            q6ed1.setInputType(InputType.TYPE_NULL);
        }
    }

    @Override
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
        if (isChecked){
            switch (buttonView.getId()){
                case R.id.q6op1:
                    edBox(false);
                    q6op2.setChecked(false);
                    q6op3.setChecked(false);
                    q6op4.setChecked(false);
                    q6op5.setChecked(false);
                    break;
                case R.id.q6op2:
                    edBox(false);
                    q6op1.setChecked(false);
                    q6op3.setChecked(false);
                    q6op4.setChecked(false);
                    q6op5.setChecked(false);
                    break;
                case R.id.q6op3:
                    edBox(false);
                    q6op1.setChecked(false);
                    q6op2.setChecked(false);
                    q6op4.setChecked(false);
                    q6op5.setChecked(false);
                    break;
                case R.id.q6op4:
                    edBox(false);
                    q6op1.setChecked(false);
                    q6op2.setChecked(false);
                    q6op3.setChecked(false);
                    q6op5.setChecked(false);
                    break;
                case R.id.q6op5:
                    edBox(true);
                    q6op1.setChecked(false);
                    q6op2.setChecked(false);
                    q6op3.setChecked(false);
                    q6op4.setChecked(false);
                    break;
            }
        }
    }
}
