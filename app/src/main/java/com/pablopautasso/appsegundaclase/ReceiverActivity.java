package com.pablopautasso.appsegundaclase;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ReceiverActivity extends AppCompatActivity {

    TextView txtReceiver;
    String from;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_receiver);

        txtReceiver = (TextView) findViewById(R.id.textView);

        //Obteniendo la instancia del Intent
        Intent intent = getIntent();
        //Extrayendo el extra de tipo cadena

        from = intent.getExtras().get("MainActivity").toString();
        txtReceiver.setText(from);

    }
}
