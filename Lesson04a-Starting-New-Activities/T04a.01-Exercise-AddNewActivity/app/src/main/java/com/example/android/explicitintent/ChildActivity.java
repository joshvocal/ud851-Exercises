package com.example.android.explicitintent;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

// Do steps 2 - 5 in activity_child.xml
// DONE (2) Change the ConstraintLayout to a FrameLayout and make appropriate adjustments
// DONE (3) Give your TextView an ID of tv_display
// DONE (4) Set the text to something that indicates this is default text being displayed
// DONE (5) Make the text size a little larger

// Do steps 6 & 7 in ChildActivity.java
// DONE (6) Create a TextView field to display your message
// DONE (7) Get a reference to your TextView in Java

public class ChildActivity extends AppCompatActivity {

    private TextView mDisplayTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_child);

        mDisplayTextView = (TextView) findViewById(R.id.tv_display);
    }
}
