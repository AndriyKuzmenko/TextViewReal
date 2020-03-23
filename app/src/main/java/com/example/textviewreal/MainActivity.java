package com.example.textviewreal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.ImageView;
import android.widget.Toast;

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
    int num1,num2,sum, answer;
    boolean done1,done2,done3;
    Context context;
    int counter;

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
        counter=0;

        num1=r.nextInt(90)+10;
        num2=r.nextInt(90)+10;
        sum=num1+num2;
        done1=false;
        done2=false;
        done3=false;
        num1Stage1.setText(num1+"");
        num2Stage1.setText(num2+"");
    }

    public void check1(View view)
    {
        if (!done1)
        {
            answer = Integer.parseInt(ans1.getText().toString());
            if (answer == sum)
            {
                stage1.setImageResource(R.drawable.correct);
                counter++;
            }
            else
            {
                stage1.setImageResource(R.drawable.incorrect);
            }
            done1=true;

            num1=sum;
            num2=r.nextInt(90)+10;
            sum=num1+num2;
            num1Stage2.setText(num1+"");
            num2Stage2.setText(num2+"");
        }
    }

    public void check2(View view)
    {
        if (!done2 && done1)
        {
            answer = Integer.parseInt(ans2.getText().toString());
            if (answer == sum)
            {
                stage2.setImageResource(R.drawable.correct);
                counter++;
            }
            else
            {
                stage2.setImageResource(R.drawable.incorrect);
            }
            done2=true;

            num1=sum;
            num2=r.nextInt(90)+10;
            sum=num1+num2;
            num1Stage3.setText(num1+"");
            num2Stage3.setText(num2+"");
        }
    }

    public void check3(View view)
    {
        if (!done3 && done2)
        {
            answer = Integer.parseInt(ans3.getText().toString());
            if (answer == sum)
            {
                stage3.setImageResource(R.drawable.correct);
                counter++;
            }
            else
            {
                stage3.setImageResource(R.drawable.incorrect);
            }
            done3=true;
        }
    }
}