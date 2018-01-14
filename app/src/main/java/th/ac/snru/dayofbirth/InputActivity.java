package th.ac.snru.dayofbirth;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class InputActivity extends AppCompatActivity implements View.OnClickListener {
    EditText dateEditText;
    Button predictButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_input);

        dateEditText = (EditText) findViewById(R.id.dateEditText);
        predictButton = (Button) findViewById(R.id.predictButton);
        predictButton.setOnClickListener(this);

    } // End onCreate

    @Override
    public void onClick(View v) {
        if (dateEditText.getText().toString().trim().equals("")) {
            Toast.makeText(getBaseContext(), R.string.dateError, Toast.LENGTH_SHORT).show();
        } else {
            // Toast.makeText(getBaseContext(), "Birth day: " + dateEditText.getText().toString(), Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(getBaseContext(), ResultActivity.class);

            // Set data
            String bDate;

            bDate = dateEditText.getText().toString();
            intent.putExtra("date", bDate);

            // open another Activity
            startActivity(intent);
        }

    } // End onClick
} // End InputActivity
