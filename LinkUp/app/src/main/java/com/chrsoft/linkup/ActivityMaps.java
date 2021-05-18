package com.chrsoft.linkup;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class ActivityMaps extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
    }

    public void cargarMaps (View view) {
        String coord = null;
        EditText editTextLatitud = (EditText) findViewById(R.id.editTextDestinatario);
        String latitud = editTextLatitud.getText().toString();

        EditText editTextLongitud = (EditText) findViewById(R.id.editTextAsunto);
        String longitud = editTextLongitud.getText().toString();

        if (!latitud.equals("") && !longitud.equals("")) {
            coord = "geo:" + latitud + ", " + longitud + "?z=10";
        }

        try {
            Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse(coord));
            startActivity(i);
        }catch (Exception e) {
            Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("geo:37.7749,-122.4192?z=4"));
            startActivity(i);
        }

    }
}