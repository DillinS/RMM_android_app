package com.example.applogo;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.widget.ImageButton;

public class ContactList extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact_list);
       // Toolbar toolbar = findViewById(R.id.toolbar);
      //  setSupportActionBar(toolbar);

      //  FloatingActionButton fab = findViewById(R.id.fab);
     //   fab.setOnClickListener(new View.OnClickListener() {
      //      @Override
       //     public void onClick(View view) {
        //        Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
      //                  .setAction("Action", null).show();
      //      }
      //  });


        ImageButton btncontactLW = (ImageButton) findViewById(R.id.imageButton27);
//
        btncontactLW.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ContactList.this,Contact1.class);
                startActivity(intent);
            }
        });

        ImageButton btncontactJE = (ImageButton) findViewById(R.id.imageButton28);
//
        btncontactJE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ContactList.this,Contactjackie.class);
                startActivity(intent);
            }
        });

        ImageButton btncontactMP = (ImageButton) findViewById(R.id.imageButton29);
//
        btncontactMP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ContactList.this,Contactmarius.class);
                startActivity(intent);
            }
        });

        ImageButton btncontactBUTTONCW = (ImageButton) findViewById(R.id.imageButton26);
//
        btncontactBUTTONCW.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ContactList.this,Contactcarol.class);
                startActivity(intent);
            }
        });

        ImageButton btncontactEM = (ImageButton) findViewById(R.id.imageButton21);
//
        btncontactEM.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ContactList.this,Contactelvis.class);
                startActivity(intent);
            }
        });

        ImageButton btncontactKF = (ImageButton) findViewById(R.id.imageButton22);
//
        btncontactKF.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ContactList.this,Contactkeith.class);
                startActivity(intent);
            }
        });

        ImageButton btncontactHK = (ImageButton) findViewById(R.id.imageButton23);
//
        btncontactHK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ContactList.this,Contactheinne.class);
                startActivity(intent);
            }
        });

        ImageButton btncontactCR = (ImageButton) findViewById(R.id.imageButton24);
//
        btncontactCR.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ContactList.this,ContactCaleb.class);
                startActivity(intent);
            }
        });

        ImageButton btncontactJP = (ImageButton) findViewById(R.id.imageButton25);
//
        btncontactJP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ContactList.this,Contactjustin.class);
                startActivity(intent);
            }
        });


        ImageButton btncontactCW = (ImageButton) findViewById(R.id.imageButton18);
//
        btncontactCW.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ContactList.this,Contactcharles.class);
                startActivity(intent);
            }
        });

        ImageButton btncontactIW = (ImageButton) findViewById(R.id.imageButton19);
//
        btncontactIW.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ContactList.this,Contactinge.class);
                startActivity(intent);
            }
        });

    }

}
