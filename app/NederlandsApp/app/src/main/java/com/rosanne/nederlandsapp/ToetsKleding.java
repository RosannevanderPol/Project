package com.rosanne.nederlandsapp;

import android.content.Intent;
import android.speech.tts.TextToSpeech;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Locale;

public class ToetsKleding extends AppCompatActivity {

    public final String[] list = {"de schoen", "de jurk", "de broek","het kind","het overhemd","de baby","de man","de vrouw"};
    public String woord;
    public TextView Dutchword;
    public TextView Nedwoord;
    public TextView Feedback;
    public TextToSpeech translator;
    public int teller = 1;
    public TextView Teller;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toetskleding);

        Dutchword = (TextView) findViewById(R.id.Dutchword);
        Nedwoord = (TextView) findViewById(R.id.Nedwoord);
        Feedback = (TextView) findViewById(R.id.feedback);
        Teller = (TextView) findViewById(R.id.Teller);

        SelecteerWoord();
        Checkteller();
    }

    /** Random een woord kiezen uit de te toetsen lijst **/
    private void SelecteerWoord(){
        woord = list[(int) (Math.random() * list.length)]; // stackoverflow.com
        Dutchword.setText(woord);
        Teller.setText(teller + "/" + (list.length * 2));
    }

    /** Check of het antwoord goed is en geef feedback **/
    private void Feedback(){
        if (String.valueOf(Dutchword.getText()) == String.valueOf(Nedwoord.getText())){
            Feedback.setText("   :)    goed zo!");
            teller += 1;
            Checkteller();
            SelecteerWoord();
        }
        else {
            Feedback.setText("   :(    probeer nog eens");
        }
    }

    private void Checkteller(){
        if (teller > (list.length * 2)){
            Toast.makeText(getApplicationContext(),
                    "Je bent klaar!",
                    Toast.LENGTH_LONG).show();
            Intent Main = new Intent(this, CatToets.class);
            startActivity(Main);
        }
    }

    /** Alle aan te wijzen onderdelen **/
    public void SchoenClick(View view)
    {
        Nedwoord.setText("de schoen");
        Feedback();
    }

    public void JurkClick(View view)
    {
        Nedwoord.setText("de jurk");
        Feedback();
    }

    public void BroekClick(View view)
    {
        Nedwoord.setText("de broek");
        Feedback();
    }

    public void KindClick(View view)
    {
        Nedwoord.setText("het kind");
        Feedback();
    }

    public void OverhemdClick(View view)
    {
        Nedwoord.setText("het overhemd");
        Feedback();
    }

    public void BabyClick(View view)
    {
        Nedwoord.setText("de baby");
        Feedback();
    }

    public void ManClick(View view)
    {
        Nedwoord.setText("de man");
        Feedback();
    }

    public void VrouwClick(View view)
    {
        Nedwoord.setText("de vrouw");
        Feedback();
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
                translator.speak(String.valueOf(Dutchword.getText()), TextToSpeech.QUEUE_FLUSH, null);
            }
        });
    }

    /** Terugknop **/
    public void TerugClick(View view)
    {
        Intent Main = new Intent(this, CatToets.class);
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

