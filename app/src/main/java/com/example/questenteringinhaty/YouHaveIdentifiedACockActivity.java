package com.example.questenteringinhaty;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;


public class YouHaveIdentifiedACockActivity extends AppCompatActivity {

    Button restartButton;

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.you_have_identified_a_cock);
        findViewById(R.id.button_restart).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                swichActivity();
            }
        });
    }

    private void swichActivity() {
        Intent i  = new Intent(this, MainActivity.class);
        startActivity(i);
    }

}




