package com.rosanne.nederlandsapp;

import android.content.Intent;
import android.speech.tts.TextToSpeech;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Locale;

public class OefHuiskamer extends AppCompatActivity {

    public TextView DutchWord;
    public TextToSpeech translator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_oefhuiskamer);

        DutchWord = (TextView) findViewById(R.id.dutchword);
    }

    /** Alle aan te wijzen onderdelen **/
    /** afbeelding huiskamer: zelf geknutselt **/
    public void KastClick(View view)
    {
        DutchWord.setText("de kast");
    }

    public void BloemenvaasClick(View view)
    {
        DutchWord.setText("de bloemenvaas");
    }

    public void KlokClick(View view)
    {
        DutchWord.setText("de klok");
    }

    public void KaarsClick(View view)
    {
        DutchWord.setText("de kaars");
    }

    public void StoelClick(View view)
    {
        DutchWord.setText("de stoel");
    }

    public void LampClick(View view)
    {
        DutchWord.setText("de lamp");
    }

    public void TafelClick(View view)
    {
        DutchWord.setText("de tafel");
    }

    public void BankClick(View view)
    {
        DutchWord.setText("de bank");
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
        Intent Main = new Intent(this, CatOef.class);
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
