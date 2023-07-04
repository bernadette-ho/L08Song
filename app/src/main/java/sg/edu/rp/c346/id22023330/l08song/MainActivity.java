package sg.edu.rp.c346.id22023330.l08song;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    DBHelper dbHelper;
    EditText ET1, ET2, ET3;
    Button button, button2;
    RadioGroup radioGroup;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ET1 = findViewById(R.id.ET1);
        ET2 = findViewById(R.id.ET2);
        ET3 = findViewById(R.id.ET3);
        radioGroup = findViewById(R.id.radioGroup);
        button = findViewById(R.id.button);
        button2 = findViewById(R.id.button2);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String title = ET1.getText().toString();
                String singer = ET2.getText().toString();
                int year = Integer.parseInt(ET3.getText().toString());
                int stars = checkRadioButton();


                //intialize DB connection
                DBHelper db = new DBHelper(MainActivity.this);

                //insert value
                db.insertSong(title, singer, year, stars);
            }

        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, viewSong.class);
                startActivity(intent);
            }
        });
        }

        private int checkRadioButton(){
            int star = radioGroup.getCheckedRadioButtonId();
            int value = 1;

            if (star == R.id.radioButton) {
                value = 1;
            } else if (star == R.id.radioButton2) {
                value = 2;
            } else if (star == R.id.radioButton3) {
                value = 3;
            } else if (star == R.id.radioButton4) {
                value = 4;
            } else if (star == R.id.radioButton5) {
                value = 5;
            } else {
                value = 1;
            }
            return value;

    }
}