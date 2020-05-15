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
    int counter;
    CharSequence message;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        r=new Random();
        ans1=(EditText)findViewById(R.id.ans1);
        ans2=(EditText)findViewById(R.id.ans2);
        ans3=(EditText)findViewById(R.id.ans3);

        num1Stage1=(TextView)findViewById(R.id.num1Stage1);
        num2Stage1=(TextView)findViewById(R.id.num2Stage1);
        num1Stage2=(TextView)findViewById(R.id.num1Stage2);
        num2Stage2=(TextView)findViewById(R.id.num2Stage2);
        num1Stage3=(TextView)findViewById(R.id.num1Stage3);
        num2Stage3=(TextView)findViewById(R.id.num2Stage3);

        stage1=(ImageView)findViewById(R.id.stage1);
        stage2=(ImageView)findViewById(R.id.stage2);
        stage3=(ImageView)findViewById(R.id.stage3);
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

            int percent=counter*100/3;
            message="You've answered correctly "+counter+"/3 questions. That is "+percent+"% of the questions";

            Context context=getApplicationContext();
            int duration=Toast.LENGTH_LONG;

            Toast.makeText(context, message, duration).show();
        }
    }

    public void newGame(View view)
    {
        done1=false;
        done2=false;
        done3=false;
        num1Stage2.setText("");
        num2Stage2.setText("");
        num1Stage3.setText("");
        num2Stage3.setText("");
        ans1.setText("");
        ans2.setText("");
        ans3.setText("");

        counter=0;
        num1=r.nextInt(90)+10;
        num2=r.nextInt(90)+10;
        sum=num1+num2;
        num1Stage1.setText(num1+"");
        num2Stage1.setText(num2+"");
        stage1.setImageDrawable(null);
        stage2.setImageDrawable(null);
        stage3.setImageDrawable(null);
    }
}
