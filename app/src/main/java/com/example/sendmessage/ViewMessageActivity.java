package com.example.sendmessage;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.sendmessage.POJO.Message;

public class ViewMessageActivity extends AppCompatActivity {
    private TextView tvViewUser;
    private TextView tvViewMessage;
    private Message mensaje;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_message);

        mensaje = (Message)getIntent().getExtras().getSerializable("mensaje");
        tvViewUser = (TextView)findViewById(R.id.tvViewUser);
        String viewUser = String.format(getResources().getString(R.string.tvViewUser), mensaje.getUser());
        tvViewMessage = (TextView)findViewById(R.id.tvViewMessage);
        tvViewMessage.setText(mensaje.getMessage());
        tvViewUser.setText(viewUser);
    }
}
