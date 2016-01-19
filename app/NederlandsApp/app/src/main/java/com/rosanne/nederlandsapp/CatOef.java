package com.rosanne.nederlandsapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class CatOef extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_catoef);
    }

    /** Kies categorie **/
    public void KleurClick(View view)
    {
        Intent intent = new Intent(this, OefKleur.class);
        startActivity(intent);
    }

    /** Kies categorie **/
    public void StraatClick(View view)
    {
        Intent intent = new Intent(this, oefstraat.class);
        startActivity(intent);
    }

    /** Kies categorie **/
    public void KledingClick(View view)
    {
        Intent intent = new Intent(this, OefKleding.class);
        startActivity(intent);
    }

    /** Terugknop **/
    public void TerugClick(View view)
    {
        Intent Main = new Intent(this, MainActivity.class);
        startActivity(Main);
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

