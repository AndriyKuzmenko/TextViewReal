package com.example.textviewreal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity
{
    Random r;
    EditText ans1;
    EditText ans2;
    EditText ans3;
    TextView num1Stage1;
    TextView num2Stage1;
    TextView num1Stage2;
    TextView num2Stage2;
    TextView num1Stage3;
    TextView num2Stage3;
    ImageView stage1;
    ImageView stage2;
    ImageView stage3;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        r=new Random();
        ans1=(EditText)findViewById(R.id.editText);
        ans2=(EditText)findViewById(R.id.editText6);
        ans3=(EditText)findViewById(R.id.editText7);

        num1Stage1=(TextView)findViewById(R.id.textView2);
        num2Stage1=(TextView)findViewById(R.id.textView3);
        num1Stage2=(TextView)findViewById(R.id.textView14);
        num2Stage2=(TextView)findViewById(R.id.textView15);
        num1Stage3=(TextView)findViewById(R.id.textView17);
        num2Stage3=(TextView)findViewById(R.id.textView18);

        stage1=(ImageView)findViewById(R.id.imageView);
        stage2=(ImageView)findViewById(R.id.imageView5);
        stage3=(ImageView)findViewById(R.id.imageView7);
    }
}
