package com.cesarferreira.painlessprefs.sample;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.cesarferreira.painlessprefs.PainlessPrefs;

public class MainActivity extends AppCompatActivity {

    private Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        context = getApplicationContext();
    }

    @Override
    protected void onStop() {
        super.onStop();
    }

    public void performClick(View view) {
        PainlessPrefs.getInstance(context).save("some boolean key", true);
        boolean someBoolean = PainlessPrefs.getInstance(context).getBoolean("some boolean key", false);
        Log.i("tag", (String.format("bool from preferences: %b", someBoolean)));

        // Int
        PainlessPrefs.getInstance(context).save("some int key", 15);
        int someInt = PainlessPrefs.getInstance(context).getInt("some int key", -1);
        Log.i("tag", String.format("int from preferences: %d", someInt));


    }

}
