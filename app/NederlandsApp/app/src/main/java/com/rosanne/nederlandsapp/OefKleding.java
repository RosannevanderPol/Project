package com.rosanne.nederlandsapp;

import android.content.Intent;
import android.speech.tts.TextToSpeech;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Locale;

public class OefKleding extends AppCompatActivity {

    public TextView DutchWord;
    public TextToSpeech translator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_oefkleding);

        DutchWord = (TextView) findViewById(R.id.dutchword);
    }

    /** Alle aan te wijzen onderdelen **/
    /** afbeelding kleding1: http://www.absolutefacts.nl/ **/
    public void SchoenClick(View view)
    {
        DutchWord.setText("de schoen");
    }

    public void JurkClick(View view)
    {
        DutchWord.setText("de jurk");
    }

    public void BroekClick(View view)
    {
        DutchWord.setText("de broek");
    }

    public void KindClick(View view)
    {
        DutchWord.setText("het kind");
    }

    public void OverhemdClick(View view)
    {
        DutchWord.setText("het overhemd");
    }

    public void BabyClick(View view)
    {
        DutchWord.setText("de baby");
    }

    public void ManClick(View view)
    {
        DutchWord.setText("de man");
    }

    public void VrouwClick(View view)
    {
        DutchWord.setText("de vrouw");
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
