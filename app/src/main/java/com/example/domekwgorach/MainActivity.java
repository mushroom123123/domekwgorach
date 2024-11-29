package com.example.domekwgorach;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    private TextView TextView2;
    int count = 0;
    String text = " ILOSC POLUBIEN";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        TextView2 = findViewById(R.id.textView2);
        Button buttonPolub = findViewById(R.id.przycisk);
        Button buttonUsun = findViewById(R.id.przycisk2);
        Button buttonZapisz = findViewById(R.id.przycisk3);

        buttonPolub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ++count;
                TextView2.setText(count + text);
            }
        });
        buttonUsun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (count > 0) {
                    --count;
                    TextView2.setText(count + text);
                }
            }
        });
    }
}