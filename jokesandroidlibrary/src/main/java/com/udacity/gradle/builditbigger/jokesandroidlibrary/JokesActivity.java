package com.udacity.gradle.builditbigger.jokesandroidlibrary;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.TextView;

public class JokesActivity extends AppCompatActivity {


    TextView jokesTv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jokes);

        jokesTv = (TextView) findViewById(R.id.jokeTv);

        String joke = getIntent().getExtras().getString(Intent.EXTRA_TEXT);

        if (!TextUtils.isEmpty(joke)) {
            jokesTv.setText(joke);
        }



    }
}
