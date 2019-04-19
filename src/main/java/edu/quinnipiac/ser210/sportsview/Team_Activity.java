package edu.quinnipiac.ser210.sportsview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Team_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_team_);

        configureLineUpButton();
        configureReturnButton();
    }


    private void configureLineUpButton(){
        ImageButton playButton = (ImageButton) findViewById(R.id.lineUp_button);
        playButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Team_Activity.this, LineUp_Detail.class);
                startActivity(intent);
            }
        });
    }

    private void configureReturnButton(){
        Button playButton = (Button) findViewById(R.id.return_button);
        playButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Team_Activity.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }


}
