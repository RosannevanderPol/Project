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

public class ToetsKeuken extends AppCompatActivity {

    public final String[] list = {"de lepel", "de vork", "het mes","het bord","de beker","het glas","de pan","de koekenpan"};
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
        setContentView(R.layout.activity_toetskeuken);

        Dutchword = (TextView) findViewById(R.id.Dutchword);
        Nedwoord = (TextView) findViewById(R.id.Nedwoord);
        Feedback = (TextView) findViewById(R.id.feedback);
        Teller = (TextView) findViewById(R.id.Teller);
        smiley = (ImageView) findViewById(R.id.smiley);

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
            Feedback.setText("  GOED!");
            smiley.setImageResource(R.drawable.like);       // pixabay.com
            teller += 1;
            Checkteller();
            SelecteerWoord();
        }
        else {
            Feedback.setText("probeer nog eens");
            smiley.setImageResource(R.drawable.dislike);    // pixabay.com
            tellerfout +=1;
        }
    }

    /** Als er 16 vragen zijn gesteld, dialogvenster met aantalfout en daarna naar categorie overzicht**/
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
    public void PanClick(View view)
    {
        Nedwoord.setText("de pan");
        Feedback();
    }
    public void KoekenpanClick(View view)
    {
        Nedwoord.setText("de koekenpan");
        Feedback();
    }
    public void GlasClick(View view)
    {
        Nedwoord.setText("het glas");
        Feedback();
    }
    public void BekerClick(View view)
    {
        Nedwoord.setText("de beker");
        Feedback();
    }
    public void VorkClick(View view)
    {
        Nedwoord.setText("de vork");
        Feedback();
    }
    public void LepelClick(View view)
    {
        Nedwoord.setText("de lepel");
        Feedback();
    }
    public void BordClick(View view)
    {
        Nedwoord.setText("het bord");
        Feedback();
    }
    public void MesClick(View view)
    {
        Nedwoord.setText("het mes");
        Feedback();
    }

    /** Het woord uit de textview uitspreken **/        // android-developers.blogspot.com
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

