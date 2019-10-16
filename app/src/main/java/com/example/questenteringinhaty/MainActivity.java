package com.example.questenteringinhaty;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button main_button_1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.main_button_1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                swichActivity();
            }
        });
    }

    private void swichActivity() {
        Intent i  = new Intent(this, YouHaveIdentifiedACockActivity.class);
        startActivity(i);
    }
}
