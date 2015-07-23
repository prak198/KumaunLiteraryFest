package com.example.iidea8.kumaunliteraryfest;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

/**
 * Created by Abhigyan on 7/22/2015.
 */
public class LogoutActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent intent = new Intent(this, LoginActivity.class);
        startActivity(intent);
        Toast.makeText(this, "Succesfully Logged Out", Toast.LENGTH_LONG).show();
    }
}
