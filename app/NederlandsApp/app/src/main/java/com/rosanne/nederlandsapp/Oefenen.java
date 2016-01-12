package com.rosanne.nederlandsapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Oefenen extends AppCompatActivity {

    public TextView DutchWord;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_oefenen);

    // define variables
    DutchWord = (TextView) findViewById(R.id.dutchword);
    }

    public void RoodClick(View view)
    {
        DutchWord.setText("Rood");
    }

    public void BlauwClick(View view)
    {
        DutchWord.setText("Blauw");
    }

    // Method to enable rotation
    @Override
    public void onSaveInstanceState(Bundle outState)
    {
        super.onSaveInstanceState(outState);
    }

    // Method to enable rotation
    @Override
    public void onRestoreInstanceState(Bundle inState)
    {
        super.onRestoreInstanceState(inState);
    }

}
