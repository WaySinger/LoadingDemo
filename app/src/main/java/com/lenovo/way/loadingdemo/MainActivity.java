package com.lenovo.way.loadingdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.lenovo.way.loadingdemo.view.Titanic;
import com.lenovo.way.loadingdemo.view.TitanicTextView;
import com.lenovo.way.loadingdemo.view.Typefaces;

public class MainActivity extends AppCompatActivity {

    private TitanicTextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv = (TitanicTextView)findViewById(R.id.titanic_tv);

        tv.setText("记得喝水");

        tv.setTypeface(Typefaces.get(this,"hwxk.ttf"));

        new Titanic().start(tv);
    }
}
