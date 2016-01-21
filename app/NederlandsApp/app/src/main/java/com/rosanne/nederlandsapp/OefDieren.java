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
    }

    public void KoeClick(View view)
    {
        DutchWord.setText("de koe");
    }

    public void HondClick(View view)
    {
        DutchWord.setText("de hond");
    }

    public void KonijnClick(View view)
    {
        DutchWord.setText("het konijn");
    }

    public void VarkenClick(View view)
    {
        DutchWord.setText("het varken");
    }

    public void KipClick(View view)
    {
        DutchWord.setText("de kip");
    }

    public void SchaapClick(View view)
    {
        DutchWord.setText("het schaap");
    }

    public void PaardClick(View view)
    {
        DutchWord.setText("het paard");
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
