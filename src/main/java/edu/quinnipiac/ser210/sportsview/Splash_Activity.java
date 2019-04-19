package edu.quinnipiac.ser210.sportsview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Splash_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        configureEnterButton();
    }


    private void configureEnterButton(){
        Button playButton = (Button) findViewById(R.id.enter_button);
        playButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Splash_Activity.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }


}
