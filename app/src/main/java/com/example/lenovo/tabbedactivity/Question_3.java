package com.example.lenovo.tabbedactivity;

import android.graphics.Typeface;
import android.os.Bundle;
import android.support.annotation.IdRes;
import android.support.annotation.Nullable;
import android.text.InputType;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by LENOVO on 5/17/2017.
 */

public class Question_3 extends android.support.v4.app.Fragment implements CompoundButton.OnCheckedChangeListener{
    //Variables for Buttons and Text View
    TextView q3;
    RadioGroup q3rg1,q3rg2,q3rg3,q3rg4;
    RadioButton q3op1,q3op2,q3op3,q3op4,q3op5,q3op6,q3op7,q3op8,q3op9,q3op10;
    EditText q3ed1;


    public static Question_3 newInstance() {
        Question_3 fragment = new Question_3();
        return fragment;
    }

    public Question_3(){
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater,ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.question_3, container, false);
        q3 = (TextView) rootView.findViewById(R.id.q3);
        q3ed1 = (EditText) rootView.findViewById(R.id.q3ed1);

        q3ed1.setEnabled(false);
        q3rg1 = (RadioGroup) rootView.findViewById(R.id.q3rg);
        q3op1 = (RadioButton) rootView.findViewById(R.id.q3op1);
        q3op2 = (RadioButton) rootView.findViewById(R.id.q3op2);
        q3op3 = (RadioButton) rootView.findViewById(R.id.q3op3);
        q3op4 = (RadioButton) rootView.findViewById(R.id.q3op4);
        q3op5 = (RadioButton) rootView.findViewById(R.id.q3op5);
        q3op6 = (RadioButton) rootView.findViewById(R.id.q3op6);
        q3op7 = (RadioButton) rootView.findViewById(R.id.q3op7);
        q3op8 = (RadioButton) rootView.findViewById(R.id.q3op8);
        q3op9 = (RadioButton) rootView.findViewById(R.id.q3op9);
        q3op10 = (RadioButton) rootView.findViewById(R.id.q3op10);
        Typeface typeface = Typeface.createFromAsset(getContext().getAssets(),"Gothic-20.ttf");
        Typeface typeface2 = Typeface.createFromAsset(getContext().getAssets(),"Gothic-18.ttf");
        q3.setTypeface(typeface);
        q3op1.setTypeface(typeface2);
        q3op2.setTypeface(typeface2);
        q3op3.setTypeface(typeface2);
        q3op4.setTypeface(typeface2);
        q3op5.setTypeface(typeface2);
        q3op6.setTypeface(typeface2);
        q3op7.setTypeface(typeface2);
        q3op8.setTypeface(typeface2);
        q3op9.setTypeface(typeface2);
        q3op10.setTypeface(typeface2);
        q3op1.setOnCheckedChangeListener((CompoundButton.OnCheckedChangeListener) this);
        q3op2.setOnCheckedChangeListener((CompoundButton.OnCheckedChangeListener) this);
        q3op3.setOnCheckedChangeListener((CompoundButton.OnCheckedChangeListener) this);
        q3op4.setOnCheckedChangeListener((CompoundButton.OnCheckedChangeListener) this);
        q3op5.setOnCheckedChangeListener((CompoundButton.OnCheckedChangeListener) this);
        q3op6.setOnCheckedChangeListener((CompoundButton.OnCheckedChangeListener) this);
        q3op7.setOnCheckedChangeListener((CompoundButton.OnCheckedChangeListener) this);
        q3op8.setOnCheckedChangeListener((CompoundButton.OnCheckedChangeListener) this);
        q3op9.setOnCheckedChangeListener((CompoundButton.OnCheckedChangeListener) this);
        q3op10.setOnCheckedChangeListener((CompoundButton.OnCheckedChangeListener) this);
        q3rg1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, @IdRes int checkedId) {
                Toast.makeText(getContext(),"Radio Checked ID: "+q3rg1.getCheckedRadioButtonId(),Toast.LENGTH_LONG).show();
            }
        });

//        q3op1.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                q3op2.setChecked(false);
//                q3op3.setChecked(false);
//                q3op4.setChecked(false);
//                q3op5.setChecked(false);
//                q3op6.setChecked(false);
//                q3op7.setChecked(false);
//                q3op8.setChecked(false);
//                q3op9.setChecked(false);
//                q3op10.setChecked(false);
//            }
//        });
        return rootView;
    }

    @Override
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
        if (isChecked){
            switch (buttonView.getId()){
                case R.id.q3op1:
                    edBox(false);
                    q3op2.setChecked(false);
                    q3op3.setChecked(false);
                    q3op4.setChecked(false);
                    q3op5.setChecked(false);
                    q3op6.setChecked(false);
                    q3op7.setChecked(false);
                    q3op8.setChecked(false);
                    q3op9.setChecked(false);
                    q3op10.setChecked(false);
                    break;
                case R.id.q3op2:
                    edBox(false);
                    q3op1.setChecked(false);
                    q3op3.setChecked(false);
                    q3op4.setChecked(false);
                    q3op5.setChecked(false);
                    q3op6.setChecked(false);
                    q3op7.setChecked(false);
                    q3op8.setChecked(false);
                    q3op9.setChecked(false);
                    q3op10.setChecked(false);
                    break;
                case R.id.q3op3:
                    edBox(false);
                    q3op1.setChecked(false);
                    q3op2.setChecked(false);
                    q3op4.setChecked(false);
                    q3op5.setChecked(false);
                    q3op6.setChecked(false);
                    q3op7.setChecked(false);
                    q3op8.setChecked(false);
                    q3op9.setChecked(false);
                    q3op10.setChecked(false);
                    break;
                case R.id.q3op4:
                    edBox(false);
                    q3op1.setChecked(false);
                    q3op2.setChecked(false);
                    q3op3.setChecked(false);
                    q3op5.setChecked(false);
                    q3op6.setChecked(false);
                    q3op7.setChecked(false);
                    q3op8.setChecked(false);
                    q3op9.setChecked(false);
                    q3op10.setChecked(false);
                    break;
                case R.id.q3op5:
                    edBox(false);
                    q3op1.setChecked(false);
                    q3op2.setChecked(false);
                    q3op3.setChecked(false);
                    q3op4.setChecked(false);
                    q3op6.setChecked(false);
                    q3op7.setChecked(false);
                    q3op8.setChecked(false);
                    q3op9.setChecked(false);
                    q3op10.setChecked(false);
                    break;
                case R.id.q3op6:
                    edBox(false);
                    q3op1.setChecked(false);
                    q3op2.setChecked(false);
                    q3op3.setChecked(false);
                    q3op4.setChecked(false);
                    q3op5.setChecked(false);
                    q3op7.setChecked(false);
                    q3op8.setChecked(false);
                    q3op9.setChecked(false);
                    q3op10.setChecked(false);
                    break;
                case R.id.q3op7:
                    edBox(false);
                    q3op1.setChecked(false);
                    q3op2.setChecked(false);
                    q3op3.setChecked(false);
                    q3op4.setChecked(false);
                    q3op5.setChecked(false);
                    q3op6.setChecked(false);
                    q3op8.setChecked(false);
                    q3op9.setChecked(false);
                    q3op10.setChecked(false);
                    break;
                case R.id.q3op8:
                    edBox(false);
                    q3op1.setChecked(false);
                    q3op2.setChecked(false);
                    q3op3.setChecked(false);
                    q3op4.setChecked(false);
                    q3op5.setChecked(false);
                    q3op6.setChecked(false);
                    q3op7.setChecked(false);
                    q3op9.setChecked(false);
                    q3op10.setChecked(false);
                    break;
                case R.id.q3op9:
                    edBox(false);
                    q3op1.setChecked(false);
                    q3op2.setChecked(false);
                    q3op3.setChecked(false);
                    q3op4.setChecked(false);
                    q3op5.setChecked(false);
                    q3op6.setChecked(false);
                    q3op7.setChecked(false);
                    q3op8.setChecked(false);
                    q3op10.setChecked(false);
                    break;
                case R.id.q3op10:
                    edBox(true);
                    q3op1.setChecked(false);
                    q3op2.setChecked(false);
                    q3op3.setChecked(false);
                    q3op4.setChecked(false);
                    q3op5.setChecked(false);
                    q3op6.setChecked(false);
                    q3op7.setChecked(false);
                    q3op8.setChecked(false);
                    q3op9.setChecked(false);
                    break;
            }
        }
    }

    private void edBox(boolean states) {
        if (states){
            q3ed1.setEnabled(true);
            q3ed1.setInputType(InputType.TYPE_CLASS_TEXT);
            q3ed1.setFocusable(true);
        }
        else{
            q3ed1.setEnabled(false);
            q3ed1.setInputType(InputType.TYPE_NULL);
        }
    }
}