package com.example.sambal.intents;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class FirstActivity extends AppCompatActivity {
    Button b1;
    EditText t1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
        t1= (EditText) findViewById(R.id.editText);
        b1= (Button) findViewById(R.id.button);
        b1.setOnClickListener(new clicked());

    }

    private class clicked implements View.OnClickListener {

        @Override
        public void onClick(View v) {
            String s1=t1.getText().toString();

            Bundle bndl=new Bundle();
            bndl.putString("message",s1);

            Intent i=new Intent(FirstActivity.this,Secondactivity.class);
            i.putExtras(bndl);
            startActivity(i);
        }
    }
}
