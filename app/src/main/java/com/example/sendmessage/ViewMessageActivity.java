package com.example.sendmessage;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ViewMessageActivity extends AppCompatActivity {
    private TextView tvViewUser;
    private TextView tvViewMessage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_message);
        tvViewUser = (TextView)findViewById(R.id.tvViewUser);
        String viewUser = String.format(getResources().getString(R.string.tvViewUser), getIntent().getExtras().getString("usuario"));
        tvViewMessage = (TextView)findViewById(R.id.tvViewMessage);
        tvViewMessage.setText(getIntent().getExtras().getString("mensaje"));
        tvViewUser.setText(viewUser);
    }
}
