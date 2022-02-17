package com.lau.geekslovecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    private TextView name;
    private TextView lang;
    private TextView rnd;
    private ImageView img;
    EditText username;
    int choice =-1;
    int count=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Spinner spinner = findViewById(R.id.spinner1);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.languages, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(this);
        username = (EditText) findViewById(R.id.name);    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
        choice = i;
        String tst = username.getText().toString() + " chainged to " + adapterView.getItemAtPosition(i).toString();
        Toast.makeText(adapterView.getContext(), tst, Toast.LENGTH_LONG).show();

    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }


    public void test(View view){
        if(count>6) count = 0;
        count++;
        double random = Math.random();
        double d = random*100;
        int rand = (int)d;


        if(count==1){
            if (choice == 0) {
                name = (TextView) findViewById(R.id.t00);
                name.setText(username.getText().toString();
                lang = (TextView) findViewById(R.id.t01);
                lang.setText("java");
                img = (ImageView) findViewById(R.id.i0);
                img.setImageResource(R.drawable.java);
                rnd = (TextView) findViewById(R.id.t02);
                rnd.setText(rand);
            }else if(choice == 1) {
                name = (TextView) findViewById(R.id.t00);
                name.setText(username.getText().toString());
                lang = (TextView) findViewById(R.id.t01);
                lang.setText("HTML");
                img = (ImageView) findViewById(R.id.i0);
                img.setImageResource(R.drawable.html);
                rnd = (TextView) findViewById(R.id.t02);
                rnd.setText(rand);
            }else if(choice == 2) {
                name = (TextView) findViewById(R.id.t00);
                name.setText(username.getText().toString());
                lang = (TextView) findViewById(R.id.t01);
                lang.setText("JavaScript");
                img = (ImageView) findViewById(R.id.i0);
                img.setImageResource(R.drawable.js);
                rnd = (TextView) findViewById(R.id.t02);
                rnd.setText(rand);
            }else if(choice == 3) {
                name = (TextView) findViewById(R.id.t00);
                name.setText(username.getText().toString());
                lang = (TextView) findViewById(R.id.t01);
                lang.setText("CSS");
                img = (ImageView) findViewById(R.id.i0);
                img.setImageResource(R.drawable.css);
                rnd = (TextView) findViewById(R.id.t02);
                rnd.setText(rand);
            }else if(choice == 4) {
                name = (TextView) findViewById(R.id.t00);
                name.setText(username.getText().toString());
                lang = (TextView) findViewById(R.id.t01);
                lang.setText("Python");
                img = (ImageView) findViewById(R.id.i0);
                img.setImageResource(R.drawable.python);
                rnd = (TextView) findViewById(R.id.t02);
                rnd.setText(rand);
            }else if(choice == 5) {
                name = (TextView) findViewById(R.id.t00);
                name.setText(username.getText().toString());
                lang = (TextView) findViewById(R.id.t01);
                lang.setText("PHP");
                img = (ImageView) findViewById(R.id.i0);
                img.setImageResource(R.drawable.php);
                rnd = (TextView) findViewById(R.id.t02);
                rnd.setText(rand);
            }
        }else if(count==2){
            if (choice == 0) {
                name = (TextView) findViewById(R.id.t10);
                name.setText(username.getText().toString());
                lang = (TextView) findViewById(R.id.t11);
                lang.setText("java");
                img = (ImageView) findViewById(R.id.i1);
                img.setImageResource(R.drawable.java);
                rnd = (TextView) findViewById(R.id.t12);
                rnd.setText(rand);
            }else if(choice == 1) {
                name = (TextView) findViewById(R.id.t10);
                name.setText(username.getText().toString());
                lang = (TextView) findViewById(R.id.t11);
                lang.setText("HTML");
                img = (ImageView) findViewById(R.id.i1);
                img.setImageResource(R.drawable.html);
                rnd = (TextView) findViewById(R.id.t12);
                rnd.setText(rand);
            }else if(choice == 2) {
                name = (TextView) findViewById(R.id.t10);
                name.setText(username.getText().toString());
                lang = (TextView) findViewById(R.id.t11);
                lang.setText("JavaScript");
                img = (ImageView) findViewById(R.id.i1);
                img.setImageResource(R.drawable.js);
                rnd = (TextView) findViewById(R.id.t12);
                rnd.setText(rand);
            }else if(choice == 3) {
                name = (TextView) findViewById(R.id.t10);
                name.setText(username.getText().toString());
                lang = (TextView) findViewById(R.id.t11);
                lang.setText("CSS");
                img = (ImageView) findViewById(R.id.i1);
                img.setImageResource(R.drawable.css);
                rnd = (TextView) findViewById(R.id.t12);
                rnd.setText(rand);
            }else if(choice == 4) {
                name = (TextView) findViewById(R.id.t10);
                name.setText(username.getText().toString());
                lang = (TextView) findViewById(R.id.t11);
                lang.setText("Python");
                img = (ImageView) findViewById(R.id.i1);
                img.setImageResource(R.drawable.python);
                rnd = (TextView) findViewById(R.id.t12);
                rnd.setText(rand);
            }else if(choice == 5) {
                name = (TextView) findViewById(R.id.t10);
                name.setText(username.getText().toString();
                lang = (TextView) findViewById(R.id.t11);
                lang.setText("PHP");
                img = (ImageView) findViewById(R.id.i1);
                img.setImageResource(R.drawable.php);
                rnd = (TextView) findViewById(R.id.t12);
                rnd.setText(rand);
            }
        }else if(count==3){
            if (choice == 0) {
                name = (TextView) findViewById(R.id.t20);
                name.setText(username.getText().toString());
                lang = (TextView) findViewById(R.id.t21);
                lang.setText("java");
                img = (ImageView) findViewById(R.id.i2);
                img.setImageResource(R.drawable.java);
                rnd = (TextView) findViewById(R.id.t22);
                rnd.setText(rand);
            }else if(choice == 1) {
                name = (TextView) findViewById(R.id.t20);
                name.setText(username.getText().toString());
                lang = (TextView) findViewById(R.id.t21);
                lang.setText("HTML");
                img = (ImageView) findViewById(R.id.i2);
                img.setImageResource(R.drawable.html);
                rnd = (TextView) findViewById(R.id.t22);
                rnd.setText(rand);
            }else if(choice == 2) {
                name = (TextView) findViewById(R.id.t20);
                name.setText(username.getText().toString());
                lang = (TextView) findViewById(R.id.t21);
                lang.setText("JavaScript");
                img = (ImageView) findViewById(R.id.i2);
                img.setImageResource(R.drawable.js);
                rnd = (TextView) findViewById(R.id.t22);
                rnd.setText(rand);
            }else if(choice == 3) {
                name = (TextView) findViewById(R.id.t20);
                name.setText(username.getText().toString());
                lang = (TextView) findViewById(R.id.t21);
                lang.setText("CSS");
                img = (ImageView) findViewById(R.id.i2);
                img.setImageResource(R.drawable.css);
                rnd = (TextView) findViewById(R.id.t22);
                rnd.setText(rand);
            }else if(choice == 4) {
                name = (TextView) findViewById(R.id.t20);
                name.setText(username.getText().toString());
                lang = (TextView) findViewById(R.id.t21);
                lang.setText("Python");
                img = (ImageView) findViewById(R.id.i2);
                img.setImageResource(R.drawable.python);
                rnd = (TextView) findViewById(R.id.t22);
                rnd.setText(rand);
            }else if(choice == 5) {
                name = (TextView) findViewById(R.id.t20);
                name.setText(username.getText().toString());
                lang = (TextView) findViewById(R.id.t21);
                lang.setText("PHP");
                img = (ImageView) findViewById(R.id.i2);
                img.setImageResource(R.drawable.php);
                rnd = (TextView) findViewById(R.id.t22);
                rnd.setText(rand);
            }
        }else if(count==4){
            if (choice == 0) {
                name = (TextView) findViewById(R.id.t30);
                name.setText(username.getText().toString());
                lang = (TextView) findViewById(R.id.t31);
                lang.setText("java");
                img = (ImageView) findViewById(R.id.i3);
                img.setImageResource(R.drawable.java);
                rnd = (TextView) findViewById(R.id.t32);
                rnd.setText(rand);
            }else if(choice == 1) {
                name = (TextView) findViewById(R.id.t30);
                name.setText(username.getText().toString());
                lang = (TextView) findViewById(R.id.t31);
                lang.setText("HTML");
                img = (ImageView) findViewById(R.id.i3);
                img.setImageResource(R.drawable.html);
                rnd = (TextView) findViewById(R.id.t32);
                rnd.setText(rand);
            }else if(choice == 2) {
                name = (TextView) findViewById(R.id.t30);
                name.setText(username.getText().toString());
                lang = (TextView) findViewById(R.id.t31);
                lang.setText("JavaScript");
                img = (ImageView) findViewById(R.id.i3);
                img.setImageResource(R.drawable.js);
                rnd = (TextView) findViewById(R.id.t32);
                rnd.setText(rand);
            }else if(choice == 3) {
                name = (TextView) findViewById(R.id.t30);
                name.setText(username.getText().toString());
                lang = (TextView) findViewById(R.id.t31);
                lang.setText("CSS");
                img = (ImageView) findViewById(R.id.i3);
                img.setImageResource(R.drawable.css);
                rnd = (TextView) findViewById(R.id.t32);
                rnd.setText(rand);
            }else if(choice == 4) {
                name = (TextView) findViewById(R.id.t30);
                name.setText(username.getText().toString());
                lang = (TextView) findViewById(R.id.t31);
                lang.setText("Python");
                img = (ImageView) findViewById(R.id.i3);
                img.setImageResource(R.drawable.python);
                rnd = (TextView) findViewById(R.id.t32);
                rnd.setText(rand);
            }else if(choice == 5) {
                name = (TextView) findViewById(R.id.t30);
                name.setText(username.getText().toString();
                lang = (TextView) findViewById(R.id.t31);
                lang.setText("PHP");
                img = (ImageView) findViewById(R.id.i3);
                img.setImageResource(R.drawable.php);
                rnd = (TextView) findViewById(R.id.t32);
                rnd.setText(rand);
            }
        }else if(count==5){
            if (choice == 0) {
                name = (TextView) findViewById(R.id.t40);
                name.setText(username.getText().toString());
                lang = (TextView) findViewById(R.id.t41);
                lang.setText("java");
                img = (ImageView) findViewById(R.id.i4);
                img.setImageResource(R.drawable.java);
                rnd = (TextView) findViewById(R.id.t42);
                rnd.setText(rand);
            }else if(choice == 1) {
                name = (TextView) findViewById(R.id.t40);
                name.setText(username.getText().toString());
                lang = (TextView) findViewById(R.id.t41);
                lang.setText("HTML");
                img = (ImageView) findViewById(R.id.i4);
                img.setImageResource(R.drawable.html);
                rnd = (TextView) findViewById(R.id.t42);
                rnd.setText(rand);
            }else if(choice == 2) {
                name = (TextView) findViewById(R.id.t40);
                name.setText(username.getText().toString());
                lang = (TextView) findViewById(R.id.t41);
                lang.setText("JavaScript");
                img = (ImageView) findViewById(R.id.i4);
                img.setImageResource(R.drawable.js);
                rnd = (TextView) findViewById(R.id.t42);
                rnd.setText(rand);
            }else if(choice == 3) {
                name = (TextView) findViewById(R.id.t40);
                name.setText(username.getText().toString());
                lang = (TextView) findViewById(R.id.t41);
                lang.setText("CSS");
                img = (ImageView) findViewById(R.id.i4);
                img.setImageResource(R.drawable.css);
                rnd = (TextView) findViewById(R.id.t42);
                rnd.setText(rand);
            }else if(choice == 4) {
                name = (TextView) findViewById(R.id.t40);
                name.setText(username.getText().toString());
                lang = (TextView) findViewById(R.id.t41);
                lang.setText("Python");
                img = (ImageView) findViewById(R.id.i4);
                img.setImageResource(R.drawable.python);
                rnd = (TextView) findViewById(R.id.t42);
                rnd.setText(rand);
            }else if(choice == 5) {
                name = (TextView) findViewById(R.id.t40);
                name.setText(username.getText().toString());
                lang = (TextView) findViewById(R.id.t41);
                lang.setText("PHP");
                img = (ImageView) findViewById(R.id.i4);
                img.setImageResource(R.drawable.php);
                rnd = (TextView) findViewById(R.id.t42);
                rnd.setText(rand);
            }
        }else if(count==6){
            if (choice == 0) {
                name = (TextView) findViewById(R.id.t50);
                name.setText(username.getText().toString());
                lang = (TextView) findViewById(R.id.t51);
                lang.setText("java");
                img = (ImageView) findViewById(R.id.i5);
                img.setImageResource(R.drawable.java);
                rnd = (TextView) findViewById(R.id.t52);
                rnd.setText(rand);
            }else if(choice == 1) {
                name = (TextView) findViewById(R.id.t50);
                name.setText(username.getText().toString());
                lang = (TextView) findViewById(R.id.t51);
                lang.setText("HTML");
                img = (ImageView) findViewById(R.id.i5);
                img.setImageResource(R.drawable.html);
                rnd = (TextView) findViewById(R.id.t52);
                rnd.setText(rand);
            }else if(choice == 2) {
                name = (TextView) findViewById(R.id.t50);
                name.setText(username.getText().toString());
                lang = (TextView) findViewById(R.id.t51);
                lang.setText("JavaScript");
                img = (ImageView) findViewById(R.id.i5);
                img.setImageResource(R.drawable.js);
                rnd = (TextView) findViewById(R.id.t52);
                rnd.setText(rand);
            }else if(choice == 3) {
                name = (TextView) findViewById(R.id.t50);
                name.setText(username.getText().toString());
                lang = (TextView) findViewById(R.id.t51);
                lang.setText("CSS");
                img = (ImageView) findViewById(R.id.i5);
                img.setImageResource(R.drawable.css);
                rnd = (TextView) findViewById(R.id.t52);
                rnd.setText(rand);
            }else if(choice == 4) {
                name = (TextView) findViewById(R.id.t50);
                name.setText(username.getText().toString());
                lang = (TextView) findViewById(R.id.t51);
                lang.setText("Python");
                img = (ImageView) findViewById(R.id.i5);
                img.setImageResource(R.drawable.python);
                rnd = (TextView) findViewById(R.id.t52);
                rnd.setText(rand);
            }else if(choice == 5) {
                name = (TextView) findViewById(R.id.t50);
                name.setText(username.getText().toString());
                lang = (TextView) findViewById(R.id.t51);
                lang.setText("PHP");
                img = (ImageView) findViewById(R.id.i5);
                img.setImageResource(R.drawable.php);
                rnd = (TextView) findViewById(R.id.t52);
                rnd.setText(rand);
            }
        }
    }
}