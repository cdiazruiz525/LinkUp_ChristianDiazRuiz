package com.chrsoft.linkup;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class ActivityWeb extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web);
    }


    public void cargarURL (View view) { ;
        EditText editText = (EditText) findViewById(R.id.editTextDestinatario);
        String message = editText.getText().toString();
        try {
            Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse(message));
            startActivity(i);
        }catch (Exception e) {
            Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/search?q=" + message));
            startActivity(i);
        }

    }
}