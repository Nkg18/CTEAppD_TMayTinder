package io.github.yashxd.tmaytinder;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText nameEditText;
    EditText bioEditText;
    Button goButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nameEditText = findViewById(R.id.et1_1);
        bioEditText = findViewById(R.id.et1_2);
        goButton = findViewById(R.id.btn1);

        goButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Executed on user interaction with the button
                Intent intent = new Intent(MainActivity.this,
                        SecondActivity.class);
                String nameString = nameEditText.getText().toString();
                String bioString = bioEditText.getText().toString();

                if(nameString.isEmpty() || bioString.isEmpty()) {
                    //Code to run is strings are empty
                    Toast.makeText(MainActivity.this,
                            "Please enter valid data!",
                            Toast.LENGTH_SHORT).show();
                }
                else {
                    intent.putExtra("name", nameString);
                    intent.putExtra("bio", bioString);
                    startActivity(intent);
                }
            }
        });
    }
}
