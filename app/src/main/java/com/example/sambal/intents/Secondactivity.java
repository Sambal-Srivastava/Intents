package com.example.sambal.intents;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Secondactivity extends AppCompatActivity {
    EditText t2;
    Button b2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secondactivity);
        t2= (EditText) findViewById(R.id.editText2);
        b2= (Button) findViewById(R.id.button2);
        b2.setOnClickListener(new goback());

        Intent i1=getIntent();
        Bundle bndl2=i1.getExtras();
        String s2=bndl2.getString("message");
        t2.setText(String.valueOf(s2));
        Toast.makeText(this,t2.getText().toString(),Toast.LENGTH_SHORT).show();
    }

    private class goback implements View.OnClickListener {
        @Override
        public void onClick(View v) {
            Intent i2=new Intent(Secondactivity.this,FirstActivity.class);
            startActivity(i2);
        }
    }
}
