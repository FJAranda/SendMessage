package com.example.sendmessage;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class SendMessageActivity extends AppCompatActivity {
    private EditText etMensaje;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_send_message);
        etMensaje = (EditText)findViewById(R.id.etMensaje);
    }

    public void getOnCLick(View view){
        Bundle bundle = new Bundle();
        bundle.putString("Mensaje", etMensaje.getText().toString());
        Intent intent = new Intent(SendMessageActivity.this,ViewMessageActivity.class);
        intent.putExtras(bundle);
        startActivity(intent);
    }
}
