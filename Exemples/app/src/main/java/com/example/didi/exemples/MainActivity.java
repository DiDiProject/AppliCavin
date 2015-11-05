package com.example.didi.exemples;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity {
    private Button menuPrincipal = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        menuPrincipal = (Button)findViewById(R.id.passerelle);

        menuPrincipal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
<<<<<<< HEAD
                Toast.makeText(MainActivity.this, "Coucou tout le monde Le contenu du menu principal va s'afficher !", Toast.LENGTH_SHORT).show();
=======
                Toast.makeText(MainActivity.this, "Coucou Le contenu du menu principal va s'afficher !", Toast.LENGTH_SHORT).show();
>>>>>>> refs/remotes/origin/master
                Intent n = new Intent(MainActivity.this, AffichageMenuPrincipal.class);
                startActivity(n);
            }
        });

    }

    //adding commentaries
    //BLAbla

}