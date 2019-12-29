package com.example.myrecyview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class DetailsActivity extends AppCompatActivity {
    String message1 = null;
    String message2 = null;
    String message3 = null;
    String message4 = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.details_layout);
        Intent intent = getIntent();
        message1 = intent.getStringExtra("EXTRA_MESSAGE1");
        message2 = intent.getStringExtra("EXTRA_MESSAGE2");
        message3 = intent.getStringExtra("Mayday");
        message4 = intent.getStringExtra("July");
        if(message3 == null && message4 == null) {
            TextView textView1 = (TextView) findViewById(R.id.textView4);
            textView1.setText(message1);
            TextView textView2 = (TextView) findViewById(R.id.textView5);
            textView2.setText(message2);
        }
        if(message1 == null && message2 == null) {
            TextView textView1 = (TextView) findViewById(R.id.textView4);
            textView1.setText(message4);
            TextView textView2 = (TextView) findViewById(R.id.textView5);
            textView2.setText(message3);
        }
        Button button = (Button) findViewById(R.id.button2);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(DetailsActivity.this,MainActivity.class);
                startActivity(intent1);
            }
        });
    }

}
