package com.rosanne.nederlandsapp;

import android.content.Intent;
import android.speech.tts.TextToSpeech;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Locale;

public class OefGereedschap extends AppCompatActivity {

    public TextView DutchWord;
    public TextToSpeech translator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_oefgereedschap);

        DutchWord = (TextView) findViewById(R.id.dutchword);
    }

    /** Alle aan te wijzen onderdelen **/
    /** afbeelding gereedschap: zelf geknutselt **/
    public void HamerClick(View view)
    {
        DutchWord.setText("de hamer");
    }

    public void SchroevendraaierClick(View view)
    {
        DutchWord.setText("de schroevendraaier");
    }

    public void HakbijlClick(View view)
    {
        DutchWord.setText("de hakbijl");
    }

    public void BoormachineClick(View view)
    {
        DutchWord.setText("de boormachine");
    }

    public void SchroefClick(View view)
    {
        DutchWord.setText("de schroef");
    }

    public void BezemClick(View view)
    {
        DutchWord.setText("de bezem");
    }

    public void StofferClick(View view)
    {
        DutchWord.setText("het stoffer en blik");
    }

    public void SchaarClick(View view)
    {
        DutchWord.setText("de schaar");
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
