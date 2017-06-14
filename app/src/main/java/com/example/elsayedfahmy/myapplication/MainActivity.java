package com.example.elsayedfahmy.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }



    NewMessageNotification newn= new   NewMessageNotification();
    public void  startmethod(View view) {

        newn.notify(this,"hello frind",1232);
        newn.notify(this,"hello frind",12333);

    }


    public void  removemethod(View view) {
        newn.cancel(this);

    }


}
