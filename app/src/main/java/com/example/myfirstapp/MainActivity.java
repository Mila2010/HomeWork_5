package com.example.myfirstapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    public final static String EXTRA_MESSAGE = "com.example.myfirstapp.MESSAGE";
    private static final String TAG = "MyActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sendMessage(View view) {
        Intent intent = new Intent(this, DisplayMessageActivity.class);
        EditText editText = (EditText) findViewById(R.id.edit_message);
        String message = editText.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }

    @Override
    public void onStart(){
        super.onStart();
        Log.d(TAG,"onStart()");
    }
    @Override
    public void onResume(){
        super.onResume();
        Log.d(TAG,"onResume()");
    }

    @Override
    public void onPause(){
        super.onPause();
        Log.d(TAG,"onPause()");
    }

    @Override
    public void onStop(){
        super.onStop();
        Log.d(TAG,"onStop()");
    }
    @Override
    public void onRestart(){
        super.onRestart();
        Log.d(TAG,"onRestart()");
    }

    @Override
    public void onDestroy(){
        super.onDestroy();
        Log.d(TAG,"onDestroy()");
    }

}
