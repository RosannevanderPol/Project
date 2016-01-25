package com.rosanne.nederlandsapp;

import android.content.Intent;
import android.speech.tts.TextToSpeech;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Locale;

public class OefKeuken extends AppCompatActivity {

    public TextView DutchWord;
    public TextToSpeech translator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_oefkeuken);

        DutchWord = (TextView) findViewById(R.id.dutchword);
    }

    /** Alle aan te wijzen onderdelen **/
    /** afbeelding keuken: zelf geknutselt **/
    public void PanClick(View view)
    {
        DutchWord.setText("de pan");
    }

    public void KoekenpanClick(View view)
    {
        DutchWord.setText("de koekenpan");
    }

    public void GlasClick(View view)
    {
        DutchWord.setText("het glas");
    }

    public void VorkClick(View view)
    {
        DutchWord.setText("de vork");
    }

    public void LepelClick(View view)
    {
        DutchWord.setText("de lepel");
    }

    public void MesClick(View view)
    {
        DutchWord.setText("het mes");
    }

    public void BordClick(View view)
    {
        DutchWord.setText("het bord");
    }

    public void BekerClick(View view)
    {
        DutchWord.setText("de beker");
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
