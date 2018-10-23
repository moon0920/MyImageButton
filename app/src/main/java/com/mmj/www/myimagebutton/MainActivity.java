package com.mmj.www.myimagebutton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void onClickWidjet (View view){
        Toast.makeText(view.getContext(),"1번입니다.", Toast.LENGTH_SHORT).show();
    }
    public void onClickWidjet2 (View view){
        Toast.makeText(view.getContext(),"2번입니다.", Toast.LENGTH_SHORT).show();
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button);
    }
}
