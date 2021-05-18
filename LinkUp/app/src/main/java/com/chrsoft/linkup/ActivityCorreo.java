package com.chrsoft.linkup;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class ActivityCorreo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_correo);
    }

    public void enviarCorreo (View view) throws Exception { ;
        EditText editTextDestinatario = (EditText) findViewById(R.id.editTextDestinatario);
        String destinatario = editTextDestinatario.getText().toString();

        EditText editTextAsunto = (EditText) findViewById(R.id.editTextAsunto);
        String asunto = editTextAsunto.getText().toString();

        EditText editTextCuerpo = (EditText) findViewById(R.id.editTextCuerpo);
        String cuerpo = editTextCuerpo.getText().toString();


        try {
            Intent i = new Intent(Intent.ACTION_SEND);
            i.setType("text/plain");
            i.putExtra(Intent.EXTRA_EMAIL, new String[] {destinatario});
            i.putExtra(Intent.EXTRA_SUBJECT, asunto);
            i.putExtra(Intent.EXTRA_TEXT, cuerpo);
            if ((destinatario.equals("") && asunto.equals(""))) {
                throw new Exception();
            }
            startActivity(i);
        }catch (Exception e) {
            Intent i = new Intent(Intent.ACTION_SEND);
            i.setType("text/plain");
            i.putExtra(Intent.EXTRA_EMAIL, new String[] {"ejemplo@gmail.com" });
            i.putExtra(Intent.EXTRA_SUBJECT, "Ejemplo");
            i.putExtra(Intent.EXTRA_TEXT, "Esto es un ejemplo");
            startActivity(i);
        }

    }
}