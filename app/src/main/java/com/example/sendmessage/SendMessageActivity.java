package com.example.sendmessage;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.sendmessage.POJO.Message;

public class SendMessageActivity extends AppCompatActivity implements View.OnClickListener{
    private EditText etMensaje;
    private EditText etUsuario;
    private Button btnOk;
    private com.example.sendmessage.POJO.Message message;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("com.example.Sendmessage", "SendMessage: OnCreate");
        setContentView(R.layout.activity_send_message);
        etMensaje = (EditText)findViewById(R.id.etMensaje);
        etUsuario = (EditText)findViewById(R.id.etUsuario);
        btnOk = (Button)findViewById(R.id.btnOk);
        btnOk.setOnClickListener(this);

        /*Clase Anonima
        btnOk.setOnClickListener(new View.OnClickListener(){
                public void onClick(View view){

                }
        });*/
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("com.example.Sendmessage", "SendMessage: OnStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("com.example.Sendmessage", "SendMessage: OnResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("com.example.Sendmessage", "SendMessage: OnPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("com.example.Sendmessage", "SendMessage: OnStop");
    }

    @Override
    public void onClick(View view) {
        message = new Message(etMensaje.getText().toString(), etUsuario.getText().toString());
        Bundle bundle = new Bundle();
        bundle.putSerializable("mensaje", message);
        Intent intent = new Intent(SendMessageActivity.this,ViewMessageActivity.class);
        intent.putExtras(bundle);
        startActivity(intent);
    }
}
