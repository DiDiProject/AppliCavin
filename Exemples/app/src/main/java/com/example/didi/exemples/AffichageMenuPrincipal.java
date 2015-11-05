package com.example.didi.exemples;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class AffichageMenuPrincipal extends Activity {
    private Button cave = null;
    private Button liste = null;
    private Button bdd = null;
    private Button recherche = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_affichage_menu_principal);

        cave = (Button) findViewById(R.id.voirCave);
        liste = (Button) findViewById(R.id.voirListe);
        bdd = (Button) findViewById(R.id.voirBdd);
        recherche = (Button) findViewById(R.id.voidRecherche);

        cave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Réagir au clic
                // Le premier paramètre est le nom de l'activité actuelle
                // Le second est le nom de l'activité de destination
                Toast.makeText(AffichageMenuPrincipal.this, "Le contenu de votre cave à vin virtuelle va s'afficher !", Toast.LENGTH_SHORT).show();
                Intent secondeActivite = new Intent(AffichageMenuPrincipal.this, AffichageCave.class);
                // Puis on lance l'intent !
                startActivity(secondeActivite);
            }
        });

        liste.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(AffichageMenuPrincipal.this, "Le contenu de votre liste de préférence va s'afficher !", Toast.LENGTH_SHORT).show();
                Intent n = new Intent(AffichageMenuPrincipal.this, AffichagePref.class);
                startActivity(n);
            }
        });

        bdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(AffichageMenuPrincipal.this, "Le contenu de la base de données va s'afficher !", Toast.LENGTH_SHORT).show();
                Intent n = new Intent(AffichageMenuPrincipal.this, AffichageBdD.class);
                startActivity(n);
            }
        });
    }
}