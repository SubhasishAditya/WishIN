package com.subaditya.wishe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void invitationInput(View view){
        Intent intent= new Intent(this,InvitationInputActivity.class);
        startActivity(intent);
    }

    public void sendWishInfo(View view) {
        Intent intent= new Intent(this,WishInputActivity.class);
        startActivity(intent);
    }
}