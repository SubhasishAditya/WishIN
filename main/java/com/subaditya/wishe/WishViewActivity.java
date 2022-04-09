package com.subaditya.wishe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class WishViewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wish_view);

        Intent intent=getIntent();
        String message01=intent.getStringExtra(WishInputActivity.EXTRA_MESSAGE_w1);
        String message02=intent.getStringExtra(WishInputActivity.EXTRA_MESSAGE_w2);
        String message03=intent.getStringExtra(WishInputActivity.EXTRA_MESSAGE_w3);


        TextView tv_wish_title=findViewById(R.id.tv_wish_title);
        tv_wish_title.setText(message01);

        TextView tv_wish_quot=findViewById(R.id.tv_wish_quot);
        tv_wish_quot.setText(" \" "+message02+" \" ");

        TextView tv_wish_from=findViewById(R.id.tv_wish_from);
        tv_wish_from.setText("from-        "+message03);


        Typeface tfw1= Typeface.createFromAsset(getAssets(),"fonts/Pacifico-Regular.ttf");
        TextView wish_title= this.findViewById(R.id.tv_wish_title);
        wish_title.setTypeface(tfw1);

        Typeface tfw2= Typeface.createFromAsset(getAssets(),"fonts/Philosopher-Regular.ttf");
        TextView quot= this.findViewById(R.id.tv_wish_quot);
        TextView from= this.findViewById(R.id.tv_wish_from);
        quot.setTypeface(tfw2);
        from.setTypeface(tfw2);
    }

    public void unavaliable(View view) {
        Toast.makeText(this, "Right now this function is unavailable !", Toast.LENGTH_SHORT).show();

    }
}