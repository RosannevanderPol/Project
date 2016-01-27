package com.rosanne.nederlandsapp;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.speech.tts.TextToSpeech;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.Locale;
import java.util.Random;

public class ToetsCijfers extends AppCompatActivity {

    public final String[] list = {"één", "twee", "drie","vier","vijf","zes","zeven","acht","negen","nul"};  // de woordenlijst
    public String woord;
    public TextView Dutchword;
    public TextView Nedwoord;
    public TextView Feedback;
    public TextToSpeech translator;
    public int teller = 1;
    public TextView Teller;
    public int tellerfout = 0;
    public ImageView smiley;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toetscijfers);

        Dutchword = (TextView) findViewById(R.id.Dutchword);
        Nedwoord = (TextView) findViewById(R.id.Nedwoord);
        Feedback = (TextView) findViewById(R.id.feedback);
        Teller = (TextView) findViewById(R.id.Teller);
        smiley = (ImageView) findViewById(R.id.smiley);

        SelecteerWoord();
        Checkteller();
    }

    /** Random een woord kiezen uit de te toetsen lijst (behalve het huidige woord)
     * de vraag direct uitspreken **/
    private void SelecteerWoord(){
        if (teller <= (list.length * 2)) {
            do {
                woord = list[(new Random().nextInt(list.length))];}     // stackoverflow.com
            while (woord == String.valueOf(Nedwoord.getText()));
            Dutchword.setText(woord);
            Teller.setText((teller) + "/" + (list.length * 2));
            translator = new TextToSpeech(this, new TextToSpeech.OnInitListener()
            {
                @Override
                public void onInit(int status)
                {
                    translator.speak("Klik op       :" + String.valueOf(Dutchword.getText()), TextToSpeech.QUEUE_FLUSH, null);
                }
            });
        }
    }

    /** Check of het antwoord goed is en geef feedback, teller updaten **/
    private void Feedback(){
        if (String.valueOf(Dutchword.getText()) == String.valueOf(Nedwoord.getText())){
            Feedback.setText("goed");
            smiley.setImageResource(R.drawable.up);       // pixabay.com
            teller += 1;
            Checkteller();
            SelecteerWoord();
        }
        else {
            Feedback.setText("fout");
            smiley.setImageResource(R.drawable.down);    // pixabay.com
            tellerfout +=1;
        }
    }

    /** Als er 20 vragen zijn gesteld, dialogvenster met aantalfout en daarna naar categorie overzicht**/
    private void Checkteller() {
        if (teller > (list.length * 2)) {
            AlertDialog.Builder scores = new AlertDialog.Builder(this);   // stackoverflow.com
            scores.setMessage("Aantal fout: " + tellerfout);
            scores.setTitle("Score");
            scores.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialog, int which) {
                    startMain();
                }
            });
            scores.setCancelable(true);
            scores.create().show();
        }
    }
    private void startMain() {
        Intent main = new Intent(this, CatToets.class);
        main.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(main);
    }

    /** Alle aan te wijzen onderdelen **/
    public void NulClick(View view)
    {
        Nedwoord.setText("nul");
        Feedback();
    }
    public void EenClick(View view)
    {
        Nedwoord.setText("één");
        Feedback();
    }
    public void TweeClick(View view)
    {
        Nedwoord.setText("twee");
        Feedback();
    }
    public void DrieClick(View view)
    {
        Nedwoord.setText("drie");
        Feedback();
    }
    public void VierClick(View view)
    {
        Nedwoord.setText("vier");
        Feedback();
    }
    public void VijfClick(View view)
    {
        Nedwoord.setText("vijf");
        Feedback();
    }
    public void ZesClick(View view)
    {
        Nedwoord.setText("zes");
        Feedback();
    }
    public void ZevenClick(View view)
    {
        Nedwoord.setText("zeven");
        Feedback();
    }
    public void AchtClick(View view)
    {
        Nedwoord.setText("acht");
        Feedback();
    }
    public void NegenClick(View view)
    {
        Nedwoord.setText("negen");
        Feedback();
    }

    /** Het woord uit de textview uitspreken als op de speeker wordt geklikt**/
    public void SpeakClick(View view)
    {
        translator = new TextToSpeech(this, new TextToSpeech.OnInitListener()
        {
            @Override
            public void onInit(int status)
            {
                translator.setLanguage(Locale.getDefault());
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

