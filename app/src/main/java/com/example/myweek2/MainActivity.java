package com.example.myweek2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewbinding.ViewBinding;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.EditText;

import com.example.myweek2.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    //ERROR :private ViewBinding viewVar;
    private ActivityMainBinding viewVar;

    TextView txt1;
    EditText edt1;

    //step1:
    Button btn1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);

        viewVar= ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(viewVar.getRoot());

        //txt1=(TextView) findViewById(R.id.txt1);
        txt1= viewVar.txt1;

       // edt1=(EditText) findViewById(R.id.edt1);
        edt1=viewVar.edt1;

        //step2
        btn1= (Button) findViewById(R.id.btn1);

        //step3(option 1)
        /*
         btn1.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {

                 String s= edt1.getText().toString();

                 txt1.setText("Hello ...."+ s);

                 // txt1.setText("Hello .... "+edt1.getText().toString();
             }
         });
         */

        //step3(option 2)

        btn1.setOnClickListener((View v)->{

           txt1.setText("Hello .+++.. " +  edt1.getText());
        });


    }



}