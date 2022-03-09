package com.vinappstudio.petbio;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class BioActivity extends AppCompatActivity {
    private ImageView petImage;
    private TextView petName;
    private TextView petBio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bio);
        petImage = findViewById(R.id.petImage_ID);
        petName = findViewById(R.id.name_id);
        petBio = findViewById(R.id.bioText_ID);

        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            String name = extras.getString("name");
            String bio = extras.getString("bio");
            setUp(name, bio);
        }
    }

    public void setUp(String name, String bio) {
        if(name.equals("Dufus")){
          petImage.setImageDrawable(getResources().getDrawable(R.drawable.dog));
            petName.setText(name);
            petBio.setText(bio);
        }else if (name.equals("Jarvis")){
            petImage.setImageDrawable(getResources().getDrawable(R.drawable.cat));
            petName.setText(name);
            petBio.setText(bio);
        }


    }
}