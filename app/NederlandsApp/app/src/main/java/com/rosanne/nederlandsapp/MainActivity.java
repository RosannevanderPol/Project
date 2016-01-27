package com.rosanne.nederlandsapp;

// www.wnf.nl : strand
// perron11.nl: duinen


import android.content.Intent;
import android.speech.tts.TextToSpeech;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    public TextToSpeech translator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /** 'Spreek' een leeg bericht uit om text-to-speech op te starten zodat het meteen
         *   snel werkt als het microfoontje wordt aangeklikt in de oefen- of toets-modus. **/
        translator = new TextToSpeech(this, new TextToSpeech.OnInitListener()
        {
            @Override
            public void onInit(int status)
            {
                translator.speak("", TextToSpeech.QUEUE_FLUSH, null);
            }
        });
    }

    public void OefenenClick(View view)
    {
        Intent Oefenen = new Intent(this, CatOef.class);
        startActivity(Oefenen);
    }
    public void ToetsClick(View view)
    {
        Intent Toetsen = new Intent(this, CatToets.class);
        startActivity(Toetsen);
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

