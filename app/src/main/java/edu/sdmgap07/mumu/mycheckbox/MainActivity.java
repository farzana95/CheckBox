package edu.sdmgap07.mumu.mycheckbox;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    //Variable Declaring
    private CheckBox yes, no, dhaka, comilla, khulna;
    private Button button1;
    private Button button2;
    private TextView result1;
    private TextView result2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Find
        yes = findViewById(R.id.yes);
        no = findViewById(R.id.no);
        dhaka = findViewById(R.id.dhaka);
        comilla = findViewById(R.id.comilla);
        khulna = findViewById(R.id.khulna);
        button1 = findViewById(R.id.button1);
        button2 = findViewById(R.id.button2);
        result1= findViewById(R.id.result1);
        result2= findViewById(R.id.result2);
        //Set Onclick Listener
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                StringBuilder stringBuilder = new StringBuilder();
                if(yes.isChecked()){
                    //Convert into String
                    String value = yes.getText().toString();
                    stringBuilder.append(value+", I want.\n");
                }
                else if(no.isChecked()){
                    //Convert into String
                    String value = no.getText().toString();
                    stringBuilder.append(value+", I don't.\n");
                }
                result1.setText(stringBuilder);
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                StringBuilder stringBuilder = new StringBuilder();
                if(dhaka.isChecked()){
                    //Convert into String
                    String value = dhaka.getText().toString();
                    stringBuilder.append("I want to travel in "+value+"." );
                }
                else if(comilla.isChecked()){
                    //Convert into String
                    String value = comilla.getText().toString();
                    stringBuilder.append("I want to travel in "+value+"." );
                }
                else if(khulna.isChecked()){
                    //Convert into String
                    String value = khulna.getText().toString();
                    stringBuilder.append("I want to travel in " +value+"." );
                }
                result2.setText(stringBuilder);
            }
        });
    }
}
