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
    /** afbeelding kleding: zelf geknutselt uit de Ikea gids **/
    public void SchoenClick(View view)
    {
        DutchWord.setText("de schoen");
    }

    public void SjaalClick(View view)
    {
        DutchWord.setText("de sjaal");
    }

    public void BroekClick(View view)
    {
        DutchWord.setText("de broek");
    }

    public void MutsClick(View view)
    {
        DutchWord.setText("de muts");
    }

    public void JasClick(View view)
    {
        DutchWord.setText("de jas");
    }

    public void TruiClick(View view)
    {
        DutchWord.setText("de trui");
    }

    public void LaarsClick(View view)
    {
        DutchWord.setText("de laars");
    }

    public void HandschoenClick(View view)
    {
        DutchWord.setText("de handschoen");
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
