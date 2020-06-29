package com.example.applogo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class Pdfview extends AppCompatActivity {

    PDFView mPDFView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pdfview);

        mPDFView = (PDFView) findViewById(R.id.pdfView);
        mPDFView.fromAsset("RMMGuide.pdf").load();

    }
}
