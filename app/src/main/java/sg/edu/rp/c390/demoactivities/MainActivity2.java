package sg.edu.rp.c390.demoactivities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        //Get intent so as to get the things inside the intent
        Intent i = getIntent();
        //get String array named info we passed in
        String[] info = i.getStringArrayExtra("info");
        //get the TextView object
        TextView tv1 = findViewById(R.id.textView1);
        //Display name and age on textview
        tv1.setText("You are " + info[0] + ", age" + info[1]);
    }
}
