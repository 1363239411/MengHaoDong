package com.example.administrator.my_text;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.andexert.calendarlistview.library.DayPickerView;

public class OneActivity extends AppCompatActivity {

    private DayPickerView mDayPickerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_one);
        initView();
    }

    private void initView() {
        mDayPickerView = (DayPickerView) findViewById(R.id.mDayPickerView);
    }
}
