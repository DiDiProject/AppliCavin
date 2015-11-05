package com.example.didi.exemples;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class AffichagePref extends Activity {
    private Button bouttonRetour = null;
    private ListView listeDePref = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_affichage_pref);
        bouttonRetour = (Button)findViewById(R.id.buttonretour);
        listeDePref = (ListView)findViewById(R.id.listevoirpref);

        List<String> exemple = new ArrayList<String>();
        exemple.add("Bordeaux");
        exemple.add("Cadillac");
        exemple.add("Riesling");
        exemple.add("Gewurztraminer d'Alsace");
        exemple.add("Monbazillac");
        exemple.add("champagne dom pérignon");
        exemple.add("Gewurztraminer d'Alsace");
        exemple.add("Monbazillac");
        exemple.add("champagne dom pérignon");
        exemple.add("Gewurztraminer d'Alsace");
        exemple.add("Monbazillac");
        exemple.add("champagne dom pérignon");

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, exemple);
        listeDePref.setAdapter(adapter);

        bouttonRetour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent n = new Intent(AffichagePref.this, AffichageMenuPrincipal.class);
                startActivity(n);
            }
        });


    }

}
