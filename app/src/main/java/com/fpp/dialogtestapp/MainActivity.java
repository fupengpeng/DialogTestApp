package com.fpp.dialogtestapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{


    TextView tvActivityMainAlertDialog,tvActivityMainProgressDialog,
            tvActivityMainDatePickerDialog,tvActivityMainTimePickerDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();


    }

    /*
    创建对话框步骤：
        1.创建AlertDialog.Builder对象。
        2.调用AlertDialog.Builder的setTitle()或者setCustomTitle()方法设置标题。
        3.调用AlertDialog.Builder的setIcon()方法设置图标。
        4.调用AlertDialog.Builder的相关设置方法设置对话框内容。
            01.setMessage():
            02.setItems():
            03.setSingleChoiceItems():
            04.setMultiChoiceItems():
            05.setAdapter():
            06.setView():
        5.调用AlertDialog.Builder的setPositiveButton()、setNegativeButton()、setNeutralButton()方法添加多个按钮。
        6.调用AlertDialog.Builder的create()方法创建AlertDialog对象，再调用AlertDialog对象的show()方法将该对话框显示出来。
     */

    private void initView() {

        tvActivityMainAlertDialog = (TextView) findViewById(R.id.tv_activity_main_alert_dialog);
        tvActivityMainProgressDialog = (TextView) findViewById(R.id.tv_activity_main_progress_dialog);
        tvActivityMainDatePickerDialog = (TextView) findViewById(R.id.tv_activity_main_date_picker_dialog);
        tvActivityMainTimePickerDialog = (TextView) findViewById(R.id.tv_activity_main_time_picker_dialog);

        tvActivityMainAlertDialog.setOnClickListener(this);
        tvActivityMainProgressDialog.setOnClickListener(this);
        tvActivityMainDatePickerDialog.setOnClickListener(this);
        tvActivityMainTimePickerDialog.setOnClickListener(this);


    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.tv_activity_main_alert_dialog:

                break;
            case R.id.tv_activity_main_progress_dialog:

                break;
            case R.id.tv_activity_main_date_picker_dialog:

                break;
            case R.id.tv_activity_main_time_picker_dialog:

                break;
        }
    }
}
