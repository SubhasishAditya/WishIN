package com.subaditya.wishe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class WishInputActivity extends AppCompatActivity {

    public static final String EXTRA_MESSAGE_w1 =" com.subaditya.wishe.Massage0.1 " ;
    public static final String EXTRA_MESSAGE_w2 =" com.subaditya.wishe.Massage0.2 ";
    public static final String EXTRA_MESSAGE_w3 =" com.subaditya.wishe.Massage0.3 ";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_input_wish);
    }

    public void sendWishInfo(View view) {

        Intent intent = new Intent(this, WishViewActivity.class);
        EditText et_wish_title =findViewById(R.id.et_wish_title);
        String message01 = et_wish_title.getText().toString();
        intent.putExtra(EXTRA_MESSAGE_w1, message01);

        EditText et_wish_subtitle =findViewById(R.id.et_wish_quot);
        String message02 = et_wish_subtitle.getText().toString();
        intent.putExtra(EXTRA_MESSAGE_w2, message02);

        EditText et_wish_from =findViewById(R.id.et_wish_from);
        String message03 = et_wish_from.getText().toString();
        intent.putExtra(EXTRA_MESSAGE_w3, message03);

        startActivity(intent);
    }
}