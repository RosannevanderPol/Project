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
    public void StraatClick(View view)
    {
        Intent intent = new Intent(this, OefStraat.class);
        startActivity(intent);
    }
    public void KledingClick(View view)
    {
        Intent intent = new Intent(this, OefKleding.class);
        startActivity(intent);
    }
    public void CijfersClick(View view)
    {
        Intent intent = new Intent(this, OefCijfers.class);
        startActivity(intent);
    }
    public void HuiskamerClick(View view)
    {
        Intent intent = new Intent(this, OefHuiskamer.class);
        startActivity(intent);
    }
    public void LichaamClick(View view)
    {
        Intent intent = new Intent(this, OefLichaam.class);
        startActivity(intent);
    }
    public void DierenClick(View view)
    {
        Intent intent = new Intent(this, OefDieren.class);
        startActivity(intent);
    }
    public void KeukenClick(View view)
    {
        Intent intent = new Intent(this, OefKeuken.class);
        startActivity(intent);
    }
    public void GereedschapClick(View view)
    {
        Intent intent = new Intent(this, OefGereedschap.class);
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

