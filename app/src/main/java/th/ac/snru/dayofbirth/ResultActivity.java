package th.ac.snru.dayofbirth;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class ResultActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        Intent intent = getIntent();
        String dateString = intent.getStringExtra("date");

//        String message = "Input date = " + dateString;
//        Toast.makeText(getBaseContext(), message, Toast.LENGTH_SHORT).show();

        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");


        try {
            Date date = sdf.parse(dateString);
            SimpleDateFormat df = new SimpleDateFormat("EEEE");
            TextView dowLabel = (TextView) findViewById(R.id.dowLabel);
            TextView dowText = (TextView) findViewById(R.id.dowText);

            dowText.setText(df.format(date));
//        String message = "converted date:" +date.toString();
//        Toast.makeText(getBaseContext(), message, Toast.LENGTH_LONG).show();
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(date);


        } catch (ParseException e) {
           // e.printStackTrace();
            Toast.makeText(getBaseContext(), "Input Error", Toast.LENGTH_SHORT).show();
        }

//        String dateInString = "22-01-2015 10:20:56";
/*
        Date date = null;
        try {
            date = sdf.parse(dateString);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        Calendar calendar = Calendar.getInstance();
            calendar.setTime(date);

*/
        Button backButton = (Button)findViewById(R.id.backButton);
        backButton.setOnClickListener(this);
    }// End onCreate


        @Override
        public void onClick(View v) {
            finish();
        } // End onClick
    } // End ResultActivity