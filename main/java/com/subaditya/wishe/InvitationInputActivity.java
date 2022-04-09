package com.subaditya.wishe;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class InvitationInputActivity extends AppCompatActivity {
    public static final String EXTRA_MESSAGE =" com.subaditya.wishe.Massage " ;
    public static final String EXTRA_MESSAGE2 =" com.subaditya.wishe.Massage2 " ;
    public static final String EXTRA_MESSAGE3 =" com.subaditya.wishe.Massage3 ";
    public static final String EXTRA_MESSAGE4 =" com.subaditya.wishe.Massage4 ";
    public static final String EXTRA_MESSAGE5 =" com.subaditya.wishe.Massage5 ";
    public static final String EXTRA_MESSAGE6 =" com.subaditya.wishe.Massage6 ";
    public static final String EXTRA_MESSAGE7 =" com.subaditya.wishe.Massage7 ";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_invitation_input);

    }
    public void sendMessage(View view) {
        Intent intent = new Intent(this, ViewInvitationActivity.class);
        EditText et_inv_title = (EditText) findViewById(R.id.et_inv_title);
        String message = et_inv_title.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, message);

        EditText et_inv_subtitle = (EditText) findViewById(R.id.et_inv_subtitle);
        String message2 = et_inv_subtitle.getText().toString();
        intent.putExtra(EXTRA_MESSAGE2, message2);

        EditText et_inv_day = (EditText) findViewById(R.id.et_inv_day);
        String message3 = et_inv_day.getText().toString();
        intent.putExtra(EXTRA_MESSAGE3, message3);

        EditText et_inv_date = (EditText) findViewById(R.id.et_inv_date);
        String message4 = et_inv_date.getText().toString();
        intent.putExtra(EXTRA_MESSAGE4, message4);

        EditText et_inv_time = (EditText) findViewById(R.id.et_inv_time);
        String message5 = et_inv_time.getText().toString();
        intent.putExtra(EXTRA_MESSAGE5, message5);

        EditText et_inv_ampm = (EditText) findViewById(R.id.et_inv_ampm);
        String message6 = et_inv_ampm.getText().toString();
        intent.putExtra(EXTRA_MESSAGE6, message6);

        EditText et_inv_address = (EditText) findViewById(R.id.et_inv_address);
        String message7 = et_inv_address.getText().toString();
        intent.putExtra(EXTRA_MESSAGE7, message7);


        startActivity(intent);
    }
}