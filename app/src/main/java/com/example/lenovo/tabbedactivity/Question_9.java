package com.example.lenovo.tabbedactivity;

import android.content.Context;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.annotation.IdRes;
import android.support.annotation.Nullable;
import android.text.InputType;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

/**
 * Created by LENOVO on 5/17/2017.
 */

public class Question_9 extends android.support.v4.app.Fragment {
    //Variables for Buttons and Text View
    TextView q9;
    Button bt1;
    RadioGroup rgq9;
    RadioButton q9op1,q9op2,q9op3,q9op4;
    EditText q9ed1;
    public static Question_9 newInstance() {
        Question_9 fragment = new Question_9();
        return fragment;
    }

    public Question_9(){
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater,ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.question_9, container, false);
        q9 = (TextView) rootView.findViewById(R.id.q9);
        q9ed1 = (EditText) rootView.findViewById(R.id.q9ed1);
        rgq9 = (RadioGroup) rootView.findViewById(R.id.q9rg);
        q9op1 = (RadioButton) rootView.findViewById(R.id.q9op1);
        q9op2 = (RadioButton) rootView.findViewById(R.id.q9op2);
        q9op3 = (RadioButton) rootView.findViewById(R.id.q9op3);
        q9op4 = (RadioButton) rootView.findViewById(R.id.q9op4);
        Typeface typeface = Typeface.createFromAsset(getContext().getAssets(),"Gothic-20.ttf");
        Typeface typeface2 = Typeface.createFromAsset(getContext().getAssets(),"Gothic-18.ttf");
        q9.setTypeface(typeface);
        q9op1.setTypeface(typeface2);
        q9op2.setTypeface(typeface2);
        q9op3.setTypeface(typeface2);
        q9op4.setTypeface(typeface2);
        rgq9.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, @IdRes int checkedId) {
                if (checkedId == R.id.q9op4){
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
            q9ed1.requestFocus();
            q9ed1.setEnabled(true);
            q9ed1.setInputType(InputType.TYPE_CLASS_TEXT);
            q9ed1.setFocusable(true);
            q9ed1.setActivated(true);
//            InputMethodManager imm = (InputMethodManager)getActivity().getSystemService(Context.INPUT_METHOD_SERVICE);
//            imm.showSoftInput(q9ed1, InputMethodManager.SHOW_IMPLICIT);
            q9ed1.setOnFocusChangeListener(new View.OnFocusChangeListener() {
                @Override
                public void onFocusChange(View v, boolean hasFocus) {
                    q9ed1.post(new Runnable() {
                        @Override
                        public void run() {
                            InputMethodManager imm = (InputMethodManager) getActivity().getSystemService(Context.INPUT_METHOD_SERVICE);
                            imm.showSoftInput(q9ed1, InputMethodManager.SHOW_IMPLICIT);
                        }
                    });
                }
            });
        }
        else{
            q9ed1.setEnabled(false);
            q9ed1.setInputType(InputType.TYPE_NULL);
        }
    }
}
