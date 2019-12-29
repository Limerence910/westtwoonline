package com.example.myrecyview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import static com.example.myrecyview.MainActivity.list;

public class SecondActivity extends AppCompatActivity{
    private EditText editText1;
    private EditText editText2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_layout);
        Button button = (Button) findViewById(R.id.button);
        editText1 = (EditText) findViewById(R.id.edit_view1);
        editText2 = (EditText) findViewById(R.id.edit_view2);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String inputText1 = editText1.getText().toString();
                String inputText2 = editText2.getText().toString();
//                Toast.makeText(SecondActivity.this, "", Toast.LENGTH_SHORT).show();
//                Toast.makeText(SecondActivity.this, "", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(SecondActivity.this, DetailsActivity.class);
                intent.putExtra("EXTRA_MESSAGE1", inputText1);
                intent.putExtra("EXTRA_MESSAGE2", inputText2);
                list.add(new message(inputText2,inputText1));
                startActivity(intent);

//                Intent intent1 = new Intent();
//                intent1.putExtra("Love_you",inputText1);
//                intent1.putExtra("Love_me",inputText2);
//                setResult(RESULT_OK,intent1);
//                finish();
            }
        });
    }
    public void onBackPressed(){
        String inputText1 = editText1.getText().toString();
        String inputText2 = editText2.getText().toString();
        Intent intent = new Intent();
        intent.putExtra("EXTRA_MESSAGE1", inputText1);
        intent.putExtra("EXTRA_MESSAGE2", inputText2);
        setResult(RESULT_OK,intent);
        finish();
    }

}

//    public void sendMessage(View view){
//        Intent intent = new Intent(SecondActivity.this,DetailsActivity.class);
//        EditText editText1 = (EditText) findViewById(R.id.edit_view1);
//        EditText editText2 = (EditText) findViewById(R.id.edit_view2);
//        String message1 = editText1.getText().toString();
//        String message2 = editText2.getText().toString();
//        intent.putExtra("EXTRA_MESSAGE1",message1);
//        intent.putExtra("EXTRA_MESSAGE2",message2);
//        startActivity(intent);
//    }
//}}