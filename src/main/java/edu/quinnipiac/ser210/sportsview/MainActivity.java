package edu.quinnipiac.ser210.sportsview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        configureFavoritesButton();
        configureSearchButton();
    }


    private void configureFavoritesButton(){
        Button playButton = (Button) findViewById(R.id.favorites_button);
        playButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Splash_Activity.class);
                startActivity(intent);
            }
        });
    }

    private void configureSearchButton(){
        Button playButton = (Button) findViewById(R.id.search_button);
        playButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Team_Activity.class);
                startActivity(intent);
            }
        });
    }

}
