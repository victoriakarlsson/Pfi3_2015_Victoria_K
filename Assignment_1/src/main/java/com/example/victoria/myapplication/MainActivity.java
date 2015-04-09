package com.example.victoria.myapplication;

import android.content.res.Resources;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Button;

import java.util.Random;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onStart() {
        super.onStart(); // k
        Log.i("Start","The app starts");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("Stop","The app stops");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("Destroy","Destroyed");
    }

    @Override
    protected void onPostResume() {
        super.onPostResume();
        Log.i("Resume","The app is resumed");
    }

    TextView t;

    public void onClick(View Button){ // denna metod säger till vad knappen ska göra när den är klickad
        Button B = (Button) findViewById(R.id.myButton);
        t = (TextView) findViewById(R.id.textView2);


    Resources res = getResources(); //hänvisar till arraylisten i resourcemapp
    String [] Q = res.getStringArray(R.array.myQuotes); // visar min arraylist

    t.setText(Q[new Random().nextInt(Q.length)]);
        Log.i("MyAPP","Button pressed");

    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }
//hej
        return super.onOptionsItemSelected(item);
    }
}
