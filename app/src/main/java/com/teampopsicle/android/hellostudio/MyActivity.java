package com.teampopsicle.android.hellostudio;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MyActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my);
    }

    public void enterHearActivity(View view){
        Intent intent = new Intent(view.getContext(),HearActivity.class);
        startActivityForResult(intent, 1);
    }

    public void enterSeeActivity(View view){
        Context context = getApplicationContext();
        CharSequence text = "AHH, IM BLIND!!!";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context,text,duration);
        toast.show();
    }

    public void enterSmellActivity(View view){
        Context context = getApplicationContext();
        CharSequence text = "I Cant Let You Do That";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }

}
