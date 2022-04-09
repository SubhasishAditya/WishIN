package com.subaditya.wishe;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class ViewInvitationActivity extends AppCompatActivity {



    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_invitation);

        Intent intent=getIntent();
        String message=intent.getStringExtra(InvitationInputActivity.EXTRA_MESSAGE);
        String message2=intent.getStringExtra(InvitationInputActivity.EXTRA_MESSAGE2);
        String message3=intent.getStringExtra(InvitationInputActivity.EXTRA_MESSAGE3);
        String message4=intent.getStringExtra(InvitationInputActivity.EXTRA_MESSAGE4);
        String message5=intent.getStringExtra(InvitationInputActivity.EXTRA_MESSAGE5);
        String message6=intent.getStringExtra(InvitationInputActivity.EXTRA_MESSAGE6);
        String message7=intent.getStringExtra(InvitationInputActivity.EXTRA_MESSAGE7);


        TextView tv_inv_title=findViewById(R.id.tv_inv_title);
        tv_inv_title.setText(message);

        TextView tv_inv_subtitle=findViewById(R.id.tv_inv_subtitle);
        tv_inv_subtitle.setText("("+message2+")");

        TextView tv_inv_day=findViewById(R.id.tv_inv_day);
        tv_inv_day.setText("on  "+message3+",");

        TextView tv_inv_date=findViewById(R.id.tv_inv_date);
        tv_inv_date.setText(message4);

        TextView tv_inv_time=findViewById(R.id.tv_inv_time);
        tv_inv_time.setText(message5);

        TextView tv_inv_ampm=findViewById(R.id.tv_inv_ampm);
        tv_inv_ampm.setText(message6);

        TextView tv_inv_address=findViewById(R.id.tv_inv_location);
        tv_inv_address.setText("at  "+message7);


        Typeface tf= Typeface.createFromAsset(getAssets(),"fonts/Pacifico-Regular.ttf");
        TextView title= this.<TextView>findViewById(R.id.tv_inv_title);
        title.setTypeface(tf);

        Typeface tf2= Typeface.createFromAsset(getAssets(),"fonts/Philosopher-Regular.ttf");
        TextView note= this.findViewById(R.id.tv_inv_note);
        TextView subtitle= this.findViewById(R.id.tv_inv_subtitle);
        TextView day= this.findViewById(R.id.tv_inv_day);
        TextView date= this.findViewById(R.id.tv_inv_date);
        TextView time= this.findViewById(R.id.tv_inv_time);
        TextView ampm= this.findViewById(R.id.tv_inv_ampm);
        TextView location= this.findViewById(R.id.tv_inv_location);
        subtitle.setTypeface(tf2);
        day.setTypeface(tf2);
        date.setTypeface(tf2);
        time.setTypeface(tf2);
        ampm.setTypeface(tf2);
        note.setTypeface(tf2);
        location.setTypeface(tf2);
        note.setTypeface(tf2);



    }

    public void unavaliable(View view) {
        Toast.makeText(this, "Right now this function is unavailable !", Toast.LENGTH_SHORT).show();


    }
}