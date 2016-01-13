package com.rosanne.nederlandsapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.speech.tts.TextToSpeech;
import java.util.Locale;

public class OefKleur extends AppCompatActivity {

    public TextView DutchWord;
    public TextToSpeech translator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_oefkleur);

        DutchWord = (TextView) findViewById(R.id.dutchword);
    }

    /** Alle aan te wijzen onderdelen **/
    public void WitClick(View view)
    {
        DutchWord.setText("Wit");
    }

    public void RoodClick(View view)
    {
        DutchWord.setText("Rood");
    }

    public void OranjeClick(View view)
    {
        DutchWord.setText("Oranje");
    }

    public void GeelClick(View view)
    {
        DutchWord.setText("Geel");
    }

    public void GroenClick(View view)
    {
        DutchWord.setText("Groen");
    }

    public void BlauwClick(View view)
    {
        DutchWord.setText("Blauw");
    }

    public void PaarsClick(View view)
    {
        DutchWord.setText("Paars");
    }

    public void ZwartClick(View view)
    {
        DutchWord.setText("Zwart");
    }

    /** Het woord uit de textview uitspreken **/ // android-developers.blogspot.com
    public void SpeakClick(View view)
    {
        translator = new TextToSpeech(this, new TextToSpeech.OnInitListener()
        {
            @Override
            public void onInit(int status)
            {
                translator.setLanguage(Locale.GERMAN); // er is nog geen Nederlands :(
                translator.speak(String.valueOf(DutchWord.getText()), TextToSpeech.QUEUE_FLUSH, null);
            }
        });
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
