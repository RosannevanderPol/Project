package com.rosanne.nederlandsapp;

import android.content.Intent;
import android.speech.tts.TextToSpeech;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Locale;

public class OefCijfers extends AppCompatActivity {

    public TextView DutchWord;
    public TextToSpeech translator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_oefcijfers);

        DutchWord = (TextView) findViewById(R.id.dutchword);
    }

    /** Alle aan te wijzen onderdelen **/
    /** afbeelding cijfers: www.aduis.nl **/
    public void NulClick(View view)
    {
        DutchWord.setText("nul");
    }

    public void EenClick(View view)
    {
        DutchWord.setText("één");
    }

    public void TweeClick(View view)
    {
        DutchWord.setText("twee");
    }

    public void DrieClick(View view)
    {
        DutchWord.setText("drie");
    }

    public void VierClick(View view)
    {
        DutchWord.setText("vier");
    }

    public void VijfClick(View view)
    {
        DutchWord.setText("Vijf");
    }

    public void ZesClick(View view)
    {
        DutchWord.setText("zes");
    }

    public void ZevenClick(View view)
    {
        DutchWord.setText("zeven");
    }

    public void AchtClick(View view)
    {
        DutchWord.setText("acht");
    }

    public void NegenClick(View view)
    {
        DutchWord.setText("negen");
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
