package com.rosanne.nederlandsapp;

import android.content.Intent;
import android.speech.tts.TextToSpeech;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Locale;

public class OefLichaam extends AppCompatActivity {

    public TextView DutchWord;
    public TextToSpeech translator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_oeflichaam);

        DutchWord = (TextView) findViewById(R.id.dutchword);
    }

    /** Alle aan te wijzen onderdelen **/
    /** afbeelding keuken: zelf geknutselt **/
    public void VoetClick(View view)
    {
        DutchWord.setText("de voet");
    }

    public void EnkelClick(View view)
    {
        DutchWord.setText("de enkel");
    }

    public void BovenbeenClick(View view)
    {
        DutchWord.setText("het bovenbeen");
    }

    public void KnieClick(View view)
    {
        DutchWord.setText("de knie");
    }

    public void HeupClick(View view)
    {
        DutchWord.setText("de heup");
    }

    public void HandClick(View view)
    {
        DutchWord.setText("de hand");
    }

    public void ElleboogClick(View view)
    {
        DutchWord.setText("de elleboog");
    }

    public void HoofdClick(View view)
    {
        DutchWord.setText("het hoofd");
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
