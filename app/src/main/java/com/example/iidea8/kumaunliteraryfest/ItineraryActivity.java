package com.example.iidea8.kumaunliteraryfest;

import android.content.Context;
import android.os.Bundle;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;

import java.util.zip.Inflater;

/**
 * Created by Abhigyan on 7/21/2015.
 */
public class ItineraryActivity extends  DrawerActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        FrameLayout frameLayout = (FrameLayout) findViewById(R.id.activity_frame);
        LayoutInflater layoutInflater = (LayoutInflater) getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = layoutInflater.inflate(R.layout.activity_itinerary, null, false);
        frameLayout.addView(view);

    }
}

