package com.durga.balaji66.androidfirstapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class HomeActivity extends AppCompatActivity {

    private TextView mTextView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        initializeViews();
        displayName();

    }

    public void initializeViews()
    {
       mTextView =(TextView)findViewById(R.id.textView);
    }

    public void displayName()
    {
        mTextView.setText(R.string.this_is_my_first_application);
    }

}
