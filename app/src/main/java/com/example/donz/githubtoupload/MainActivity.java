package com.example.donz.githubtoupload;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(this, "New Toast Added from Github File from Hamza", Toast.LENGTH_SHORT).show();
        Toast.makeText(this, "New Toast Added from Waleed laptop", Toast.LENGTH_SHORT).show();
    }
}
