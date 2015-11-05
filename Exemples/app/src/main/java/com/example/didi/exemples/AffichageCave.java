package com.example.didi.exemples;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.GridView;
import android.widget.TextView;
import android.widget.Toast;

public class AffichageCave extends Activity {
    private Button retour = null;
    private GridView tab = null;
    private GridView tabNom = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_affichage_cave);
        retour = (Button)findViewById(R.id.retourButton);
        tabNom = (GridView)findViewById(R.id.gridView);
        tab = (GridView)findViewById(R.id.gridView2);

        String[] title = new String[] {
                "Nom du vin", "Type", "Nb de bouteilles"};
        ArrayAdapter<String> adapterTitle = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, title);

        tabNom.setAdapter(adapterTitle);
        tabNom.setNumColumns(3);

        String[] numbers = new String[] {
                "Bordeaux", "rouge", "8",
                "Cadillac", "blanc", "1",
                "Riesling", "blanc", "5",
                "Whispering Angel", "rosé", "3",
                "MonBazillac", "blanc", "10"};

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, numbers);

        tab.setAdapter(adapter);
        tab.setNumColumns(3); //définit le nombre de colonne par ligne

        retour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent n = new Intent(AffichageCave.this, AffichageMenuPrincipal.class);
                startActivity(n);
            }
        });

        tab.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View v, int position, long id) {
                String s = (String) ((TextView) v).getText();
                if (position % 3 == 0)
                    Toast.makeText(getApplicationContext(), "Nom :" + s, Toast.LENGTH_SHORT).show();
                else if (position % 3 == 1)
                    Toast.makeText(getApplicationContext(), "Type : " + s, Toast.LENGTH_SHORT).show();
                else
                    Toast.makeText(getApplicationContext(), "Nb : " + s, Toast.LENGTH_SHORT).show();

                Intent n = new Intent(AffichageCave.this, AffichageDetailVin.class);
                startActivity(n);
            }
        });

        tab.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener(){
            public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {
                String s = (String) ((TextView) view).getText();
                if (position % 3 == 0)
                    Toast.makeText(getApplicationContext(), "Nom :" + s, Toast.LENGTH_SHORT).show();
                else if (position % 3 == 1)
                    Toast.makeText(getApplicationContext(), "Type : " + s, Toast.LENGTH_SHORT).show();
                else
                    Toast.makeText(getApplicationContext(), "Nb : " + s, Toast.LENGTH_SHORT).show();
                return true;
            }
        });
    }

}
