package com.vinappstudio.petbio;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.Switch;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private String  TAG ;
    private ImageView catView;
    private ImageView dogView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        catView = findViewById(R.id.cat_id);
        dogView = findViewById(R.id.dog_id);
        catView.setOnClickListener(this);
        dogView.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {

        switch (view.getId()){
            case R.id.cat_id:
                Toast.makeText(this, "Cat Touched ", Toast.LENGTH_SHORT).show();
               // Log.d(TAG, "cat touched ");
                Intent catIntent = new Intent(MainActivity.this , BioActivity.class);
                catIntent.putExtra("name" , "Jarvis");
                catIntent.putExtra("bio","Great cat. Loves people . Meows a a lot ");
                startActivity(catIntent);
                break;

            case R.id.dog_id:
                Toast.makeText(this, " Dog Touched", Toast.LENGTH_SHORT).show();
              //  Log.d(TAG, "dog touched ");
                Intent dogIntent = new Intent(MainActivity.this , BioActivity.class);
                dogIntent.putExtra("name" , "Dufus");
                dogIntent.putExtra("bio","Great dog. Loves people ,  barks and eat a lot  ");
                startActivity(dogIntent);
                break;

        }
    }
}