package com.example.sendmessage;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.sendmessage.POJO.Message;

/**
 * @author Francisco Javier Aranda Caro
 * @version 1.0
 *
 * <h1>Clase que contiene el comportamiento de la Activity SendMessage</h1>
 * <p>Conceptos aprendidos en la practica:</p>
 *   <ul>
 *   <li>Concepto Contexto</li>
 *   <li>Paso de parametro mediante el objeto @see android.os.Bundle </li>
 *   <li>Paso de mensajes entre dos actividades mediante la clase @see android.content.Intent</li>
 *   <li>Creacion de documentacion en proyectos de Android Studio</li>
 *   <li>Uso del metodo Log.d() para debug</li>
 *   <li>Formato automatico mediante el entorno(Code/Reformat Code)</li>
 *   <li>Uso de la opcion Surroding(Code/Surronding with...)</li>
 *   <li>Crear clases y paquetes</li>
 *   <li>Generar codigo automaticamente</li>
 *   <li>Enviar un objeto customizado por bundle</li>
 *   </ul>
 * */
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
