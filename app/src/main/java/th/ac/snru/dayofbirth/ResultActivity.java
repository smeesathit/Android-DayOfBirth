package th.ac.snru.dayofbirth;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class ResultActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        Intent intent = getIntent();
        String dateString = intent.getStringExtra("date");

        String message = "Input date = " + dateString;
        Toast.makeText(getBaseContext(), message, Toast.LENGTH_SHORT).show();
        Button backButton = (Button)findViewById(R.id.backButton);
        backButton.setOnClickListener(this);
    }// End onCreate


        @Override
        public void onClick(View v) {
            finish();
        } // End onClick
    } // End ResultActivity