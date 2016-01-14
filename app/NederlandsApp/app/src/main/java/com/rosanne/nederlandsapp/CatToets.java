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

    /** Kies categorie **/
    public void KledingClick(View view)
    {
        Intent intent = new Intent(this, ToetsKleur.class);
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
