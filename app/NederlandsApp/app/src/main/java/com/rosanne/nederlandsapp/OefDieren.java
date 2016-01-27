package com.rosanne.nederlandsapp;

import android.content.Intent;
import android.speech.tts.TextToSpeech;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Locale;

public class OefDieren extends AppCompatActivity {

    public TextView DutchWord;
    public TextToSpeech translator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_oefdieren);

        DutchWord = (TextView) findViewById(R.id.dutchword);
    }

    /** Alle aan te wijzen onderdelen **/
    /** afbeelding dieren: zelf in elkaar gezet met plaatjes van www.pixabay.com **/
    public void PoesClick(View view)
    {
        DutchWord.setText("de poes");
        translator = new TextToSpeech(this, new TextToSpeech.OnInitListener()
        {
            @Override
            public void onInit(int status)
            {
                translator.speak(String.valueOf(DutchWord.getText()), TextToSpeech.QUEUE_FLUSH, null);
            }
        });
    }

    public void KoeClick(View view)
    {
        DutchWord.setText("de koe");
        translator = new TextToSpeech(this, new TextToSpeech.OnInitListener()
        {
            @Override
            public void onInit(int status)
            {
                translator.speak(String.valueOf(DutchWord.getText()), TextToSpeech.QUEUE_FLUSH, null);
            }
        });
    }

    public void HondClick(View view)
    {
        DutchWord.setText("de hond");
        translator = new TextToSpeech(this, new TextToSpeech.OnInitListener()
        {
            @Override
            public void onInit(int status)
            {
                translator.speak(String.valueOf(DutchWord.getText()), TextToSpeech.QUEUE_FLUSH, null);
            }
        });
    }

    public void KonijnClick(View view)
    {
        DutchWord.setText("het konijn");
        translator = new TextToSpeech(this, new TextToSpeech.OnInitListener()
        {
            @Override
            public void onInit(int status)
            {
                translator.speak(String.valueOf(DutchWord.getText()), TextToSpeech.QUEUE_FLUSH, null);
            }
        });
    }

    public void VarkenClick(View view)
    {
        DutchWord.setText("het varken");
        translator = new TextToSpeech(this, new TextToSpeech.OnInitListener()
        {
            @Override
            public void onInit(int status)
            {
                translator.speak(String.valueOf(DutchWord.getText()), TextToSpeech.QUEUE_FLUSH, null);
            }
        });
    }

    public void KipClick(View view)
    {
        DutchWord.setText("de kip");
        translator = new TextToSpeech(this, new TextToSpeech.OnInitListener()
        {
            @Override
            public void onInit(int status)
            {
                translator.speak(String.valueOf(DutchWord.getText()), TextToSpeech.QUEUE_FLUSH, null);
            }
        });
    }

    public void SchaapClick(View view)
    {
        DutchWord.setText("het schaap");
        translator = new TextToSpeech(this, new TextToSpeech.OnInitListener()
        {
            @Override
            public void onInit(int status)
            {
                translator.speak(String.valueOf(DutchWord.getText()), TextToSpeech.QUEUE_FLUSH, null);
            }
        });
    }

    public void PaardClick(View view)
    {
        DutchWord.setText("het paard");
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
