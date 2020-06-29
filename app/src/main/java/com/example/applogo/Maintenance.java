package com.example.applogo;

import android.content.Intent;
import android.os.Bundle;

//import com.google.android.material.floatingactionbutton.FloatingActionButton;
//import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageButton;
public class Maintenance extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maintenance);
        //Toolbar toolbar = findViewById(R.id.toolbar);
        //setSupportActionBar(toolbar);

     //   FloatingActionButton fab = findViewById(R.id.fab);
      //  fab.setOnClickListener(new View.OnClickListener() {
      //      @Override
       //     public void onClick(View view) {
       //         Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
       //                 .setAction("Action", null).show();

       // ImageButton btnmainback = (ImageButton) findViewById(R.id.imageButton7);

       // btnmainback.setOnClickListener(new View.OnClickListener() {
       //     @Override
        //    public void onClick(View v) {
        //        Intent intent = new Intent(Maintenance.this, MainActivity.class );
        //        startActivity(intent);
       //     }
        //});



//});

        ImageButton btnpdfview = (ImageButton) findViewById(R.id.imageButton6);
//
        btnpdfview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Maintenance.this,Pdfviewer.class);
                startActivity(intent);
            }
        });

    }
}