package sg.edu.rp.c390.demoactivities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button btnDone;
    EditText etName, etAge;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Get button and set onclick listener
        btnDone = findViewById(R.id.button);
        btnDone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //get editText that user keys in name
                etName = findViewById(R.id.editTextName);

                etAge = findViewById(R.id.editTextAge);

                //put name and age into array

                String[] info = {etName.getText().toString(),etAge.getText().toString()};

                //Create an intent to start another activity called
                //MainActivity2

                Intent i = new Intent(MainActivity.this,MainActivity2.class);

                //Pass the string array holding name and age to new activity
                i.putExtra("info", info);
                //start new activity
                startActivity(i);
            }
        });

    }
}
