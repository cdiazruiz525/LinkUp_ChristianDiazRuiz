package com.chrsoft.linkup;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return true;
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle item selection
        switch (item.getItemId()) {
            case R.id.menu_settings:
                Toast.makeText(this, "Creado por Christian Díaz", Toast.LENGTH_SHORT).show();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    public void llamarActividad (View view) {
        Button btn = (Button) view;
        String btnText = btn.getText().toString();

        if (btnText.contains("web")) {
            Intent intent = new Intent(this, ActivityWeb.class);
            startActivity(intent);
        }
        if (btnText.contains("teléfono")) {
            Intent intent = new Intent(this, ActivityTel.class);
            startActivity(intent);
        }
        if (btnText.contains("Maps")) {
            Intent intent = new Intent(this, ActivityMaps.class);
            startActivity(intent);
        }
        if (btnText.contains("foto")) {
            Intent i = new Intent("android.media.action.IMAGE_CAPTURE");
            startActivity(i);
        }
        if (btnText.contains("correo")) {
            Intent intent = new Intent(this, ActivityCorreo.class);
            startActivity(intent);
        }
    }
}