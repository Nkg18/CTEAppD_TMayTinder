package io.github.yashxd.tmaytinder;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    TextView textView1;
    TextView textView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        textView1 = findViewById(R.id.tv2_2);
        textView2 = findViewById(R.id.tv2_3);

        String nameStringSA = getIntent().getStringExtra("name");
        String bioStringSA = getIntent().getStringExtra("bio");

        textView1.setText("Welcome "+nameStringSA);
        textView2.setText("Your bio:\n"+bioStringSA);
    }
}
