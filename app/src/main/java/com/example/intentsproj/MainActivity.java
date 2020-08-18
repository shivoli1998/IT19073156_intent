package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private Object;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        onclickButtonLister();
    }
    @SuppressLint("WrongViewCast")
    public void onclickButtonLister()
    {
        button=(btn1)findViewById(R.id.btn1);
        button.setOnClickListner(
                new Veiw.OnClickListener(
                        @Override
                        publick void onClick (view view){

        Intent intent = new Intent(action ".SecondActivity");
        StartActivity(intent);


    }

                        
                )
        )
    }

}