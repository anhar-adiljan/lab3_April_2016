package com.example.ainihaer.lab3.my_test;

import android.test.ActivityInstrumentationTestCase2;
import android.widget.TextView;

import com.example.ainihaer.lab3.MainActivity;
import com.example.ainihaer.lab3.R;

/**
 * Created by ainihaer on 4/13/16.
 */
public class JUnitTest extends ActivityInstrumentationTestCase2<MainActivity>{
    MainActivity mainActivity;

    public JUnitTest(){
        super(MainActivity.class);
    }

    public void test_first(){
        mainActivity = getActivity();
        TextView textView = (TextView) mainActivity.findViewById(R.id.tv1);
        String tester = textView.getText().toString();
        assertEquals("Hello World!", tester); //success


    }

}
