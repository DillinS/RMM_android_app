package com.example.applogo;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.widget.ImageButton;

public class Contact1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact1);
       // Toolbar toolbar = findViewById(R.id.toolbar);
      // setSupportActionBar(toolbar);
        ImageButton btn = (ImageButton) findViewById(R.id.imageButton16);


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:082 559 6226"));

                startActivity(intent);
            }
        });

        ImageButton btnEmail = (ImageButton) findViewById(R.id.imageButton15);


        btnEmail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_SENDTO);
                intent.setData(Uri.parse("mailto: lionel@redmetal.co.za")); // only email apps should handle this
               startActivity(intent);
            }
        });




    }

}
