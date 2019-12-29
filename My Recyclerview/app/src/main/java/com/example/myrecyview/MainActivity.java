package com.example.myrecyview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Adapter;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    public static List<message> list = new ArrayList<message>();
 //   Intent intent = new Intent();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.first_layout);

//        Intent intent = new Intent(MainActivity.this,SecondActivity.class);
//        startActivityForResult(intent,1);
  //      onActivityResult(RESULT_OK,1,intent);
//        startActivityForResult(intent,0);
        RecyclerView recyclerView = findViewById(R.id.recycler_view);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        MyAdapter adapter = new MyAdapter(list);
        recyclerView.setAdapter(adapter);
    }

    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.main,menu);
        return true;
    }
    public boolean onOptionsItemSelected(MenuItem item){
        Toast.makeText(this,"Turning to the SecondActivity",Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(MainActivity.this,SecondActivity.class);
        startActivity(intent);
        return true;
    }
//    protected void onActivityResult(int requestCode,int resultCode,Intent data) {
//        super.onActivityResult(requestCode, resultCode, data);
//        switch (requestCode) {
//            case 1:
//                if (requestCode == RESULT_OK) {
//                    String returnedData1 = data.getStringExtra("Love_you");
//                    String returnedData2 = data.getStringExtra("Love_me");
//                    list.add(new message(returnedData1,returnedData2));
//                }
//                break;
//            default:
//                break;
//        }
//    }
    public void onResume(){
        super.onResume();
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        MyAdapter adapter = (MyAdapter) recyclerView.getAdapter();
        adapter.notifyDataSetChanged();
    }
}

