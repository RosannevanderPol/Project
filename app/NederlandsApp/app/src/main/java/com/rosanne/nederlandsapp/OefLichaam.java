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
        translator = new TextToSpeech(this, new TextToSpeech.OnInitListener()
        {
            @Override
            public void onInit(int status)
            {
                translator.speak(String.valueOf(DutchWord.getText()), TextToSpeech.QUEUE_FLUSH, null);
            }
        });
    }

    public void EnkelClick(View view)
    {
        DutchWord.setText("de enkel");
        translator = new TextToSpeech(this, new TextToSpeech.OnInitListener()
        {
            @Override
            public void onInit(int status)
            {
                translator.speak(String.valueOf(DutchWord.getText()), TextToSpeech.QUEUE_FLUSH, null);
            }
        });
    }

    public void BovenbeenClick(View view)
    {
        DutchWord.setText("het bovenbeen");
        translator = new TextToSpeech(this, new TextToSpeech.OnInitListener()
        {
            @Override
            public void onInit(int status)
            {
                translator.speak(String.valueOf(DutchWord.getText()), TextToSpeech.QUEUE_FLUSH, null);
            }
        });
    }

    public void KnieClick(View view)
    {
        DutchWord.setText("de knie");
        translator = new TextToSpeech(this, new TextToSpeech.OnInitListener()
        {
            @Override
            public void onInit(int status)
            {
                translator.speak(String.valueOf(DutchWord.getText()), TextToSpeech.QUEUE_FLUSH, null);
            }
        });
    }

    public void HeupClick(View view)
    {
        DutchWord.setText("de heup");
        translator = new TextToSpeech(this, new TextToSpeech.OnInitListener()
        {
            @Override
            public void onInit(int status)
            {
                translator.speak(String.valueOf(DutchWord.getText()), TextToSpeech.QUEUE_FLUSH, null);
            }
        });
    }

    public void HandClick(View view)
    {
        DutchWord.setText("de hand");
        translator = new TextToSpeech(this, new TextToSpeech.OnInitListener()
        {
            @Override
            public void onInit(int status)
            {
                translator.speak(String.valueOf(DutchWord.getText()), TextToSpeech.QUEUE_FLUSH, null);
            }
        });
    }

    public void ElleboogClick(View view)
    {
        DutchWord.setText("de elleboog");
        translator = new TextToSpeech(this, new TextToSpeech.OnInitListener()
        {
            @Override
            public void onInit(int status)
            {
                translator.speak(String.valueOf(DutchWord.getText()), TextToSpeech.QUEUE_FLUSH, null);
            }
        });
    }

    public void HoofdClick(View view)
    {
        DutchWord.setText("het hoofd");
        translator = new TextToSpeech(this, new TextToSpeech.OnInitListener()
        {
            @Override
            public void onInit(int status)
            {
                translator.speak(String.valueOf(DutchWord.getText()), TextToSpeech.QUEUE_FLUSH, null);
            }
        });
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
