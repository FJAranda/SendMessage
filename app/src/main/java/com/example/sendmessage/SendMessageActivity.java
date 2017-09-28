package com.example.sendmessage;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class SendMessageActivity extends AppCompatActivity implements View.OnClickListener{
    private EditText etMensaje;
    private EditText etUsuario;
    private Button btnOk;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_send_message);
        etMensaje = (EditText)findViewById(R.id.etMensaje);
        etUsuario = (EditText)findViewById(R.id.etUsuario);
        btnOk = (Button)findViewById(R.id.btnOk);
        btnOk.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putString("mensaje", etMensaje.getText().toString());
        bundle.putString("usuario", etUsuario.getText().toString());
        Intent intent = new Intent(SendMessageActivity.this,ViewMessageActivity.class);
        intent.putExtras(bundle);
        startActivity(intent);
    }
}
