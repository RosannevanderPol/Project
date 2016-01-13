package com.rosanne.nederlandsapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class CatToets extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cattoets);
    }

    public void KledingClick(View view)
    {
        Intent intent = new Intent(this, Toets.class);
        startActivity(intent);
    }

    /** Onthoudt de huidige staat, maakt roteren mogelijk **/
    @Override
    public void onSaveInstanceState(Bundle outState)
    {
        super.onSaveInstanceState(outState);
    }

    @Override
    public void onRestoreInstanceState(Bundle inState)
    {
        super.onRestoreInstanceState(inState);
    }
}
