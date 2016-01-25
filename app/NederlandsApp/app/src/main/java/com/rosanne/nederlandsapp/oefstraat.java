package com.rosanne.nederlandsapp;

import android.content.Intent;
import android.speech.tts.TextToSpeech;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Locale;

public class OefStraat extends AppCompatActivity {

    public TextView DutchWord;
    public TextToSpeech translator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_oefstraat);

        DutchWord = (TextView) findViewById(R.id.dutchword);
    }

    /** Alle aan te wijzen onderdelen **/
    public void AutoClick(View view)
    {
        DutchWord.setText("de auto");
    }

    public void WegClick(View view)
    {
        DutchWord.setText("de weg");
    }

    public void StoepClick(View view)
    {
        DutchWord.setText("de stoep");
    }

    public void VoetgangerClick(View view)
    {
        DutchWord.setText("de voetganger");
    }

    public void LantaarnClick(View view)
    {
        DutchWord.setText("de lantaarnpaal");
    }

    public void FietserClick(View view)
    {
        DutchWord.setText("de fietser");
    }

    public void BoomClick(View view)
    {
        DutchWord.setText("de boom");
    }

    public void StoplichtClick(View view)
    {
        DutchWord.setText("het stoplicht");
    }

    /** Het woord uit de textview uitspreken **/ // android-developers.blogspot.com
    public void SpeakClick(View view)
    {
        translator = new TextToSpeech(this, new TextToSpeech.OnInitListener()
        {
            @Override
            public void onInit(int status)
            {
                translator.setLanguage(Locale.getDefault());
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
