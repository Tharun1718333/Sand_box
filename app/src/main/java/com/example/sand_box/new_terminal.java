package com.example.sand_box;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class new_terminal extends AppCompatActivity {
    FloatingActionButton Button_adder;
    EditText product_name;
    EditText num1;
    EditText num2;
    EditText num3;
    EditText num4;
    EditText num5;
    EditText num6;
    EditText num7;
    EditText num8;
    EditText num9;
    EditText num10;
    EditText num11;
    EditText num12;
    CheckBox First;
    CheckBox second;
    CheckBox third;
    CheckBox fourth;
    CheckBox fifth;
    CheckBox sixth;
    CheckBox seventh;
    CheckBox eighth;
    CheckBox ninth;
    CheckBox tenth;
    CheckBox eleventh;
    CheckBox twelveth;
    int i =0;
    int c1=0;
    int c2=0;
    int c3=0;
    int c4=0;
    int c5=0;
    int c6=0;
    int c7=0;
    int c8=0;
    int c9=0;
    int c10=0;
    int c11=0;
    int c12=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_terminal);
        Button_adder = (FloatingActionButton)findViewById(R.id.Adder);
        First = (CheckBox)findViewById(R.id.checkBox1);
        second = (CheckBox)findViewById(R.id.checkBox2);
        third = (CheckBox)findViewById(R.id.checkBox3);
        fourth = (CheckBox)findViewById(R.id.checkBox4);
        fifth = (CheckBox)findViewById(R.id.checkBox5);
        sixth = (CheckBox)findViewById(R.id.checkBox6);
        seventh = (CheckBox)findViewById(R.id.checkBox7);
        eighth = (CheckBox)findViewById(R.id.checkBox8);
        ninth = (CheckBox)findViewById(R.id.checkBox9);
        tenth = (CheckBox)findViewById(R.id.checkBox10);
        eleventh = (CheckBox)findViewById(R.id.checkBox11);
        twelveth = (CheckBox)findViewById(R.id.checkBox12);
        product_name = (EditText) findViewById(R.id.product_name);
        num1= (EditText) findViewById(R.id.editTextNumber1);
        num2= (EditText) findViewById(R.id.editTextNumber2);
        num3= (EditText) findViewById(R.id.editTextNumber3);
        num4= (EditText) findViewById(R.id.editTextNumber4);
        num5= (EditText) findViewById(R.id.editTextNumber5);
        num6= (EditText) findViewById(R.id.editTextNumber6);
        num7= (EditText) findViewById(R.id.editTextNumber7);
        num8= (EditText) findViewById(R.id.editTextNumber8);
        num9= (EditText) findViewById(R.id.editTextNumber9);
        num10= (EditText) findViewById(R.id.editTextNumber10);
        num11= (EditText) findViewById(R.id.editTextNumber11);
        num12= (EditText) findViewById(R.id.editTextNumber12);
        Button_adder.setOnClickListener(new View.OnClickListener()
        {
            @Override

            public void onClick(View v) {
                if(c1 ==0)
                {
                    i=1;
                }
                else if(c2==0)
                {
                    i=2;
                }
                else if(c3==0)
                {
                    i=3;
                }
                else if(c4==0)
                {
                    i=4;
                }
                else if(c5==0)
                {
                    i=5;
                }
                else if(c6==0)
                {
                    i=6;
                }
                else if(c7==0)
                {
                    i=7;
                }
                else if(c8==0)
                {
                    i=8;
                }
                else if(c9==0)
                {
                    i=9;
                }
                else if(c10==0)
                {
                    i=10;
                }
                else if(c11==0)
                {
                    i=11;
                }
                else if(c12==0)
                {
                    i=12;
                }
                else
                {
                    i=0;
                }


                if (i == 1) {
                    First.setVisibility(View.VISIBLE);
                    num1.setVisibility(View.VISIBLE);
                    c1=1;
                    First.setText(product_name.getText().toString());
                     i=i+1;
                }
                else if (i == 2) {
                    second.setVisibility(View.VISIBLE);
                    num2.setVisibility(View.VISIBLE);
                    i=i+1;
                    c2=1;
                    second.setText(product_name.getText().toString());
                }
                else if (i == 3) {
                    third.setVisibility(View.VISIBLE);
                    num3.setVisibility(View.VISIBLE);
                    i=i+1;
                    c3=1;
                    third.setText(product_name.getText().toString());
                }
                else if (i == 4) {
                    fourth.setVisibility(View.VISIBLE);
                    num4.setVisibility(View.VISIBLE);
                    i=i+1;
                    c4=1;
                    fourth.setText(product_name.getText().toString());
                }
                else if (i == 5) {
                    fifth.setVisibility(View.VISIBLE);
                    num5.setVisibility(View.VISIBLE);
                    i=i+1;
                    c5=1;
                    fifth.setText(product_name.getText().toString());
                }
                else if (i == 6) {
                    sixth.setVisibility(View.VISIBLE);
                    num6.setVisibility(View.VISIBLE);
                    i=i+1;
                    c6=1;
                    sixth.setText(product_name.getText().toString());
                }
                else if (i == 7) {
                    seventh.setVisibility(View.VISIBLE);
                    num7.setVisibility(View.VISIBLE);
                    i=i+1;
                    c7=1;
                    seventh.setText(product_name.getText().toString());
                }
                else if (i == 8) {
                    eighth.setVisibility(View.VISIBLE);
                    num8.setVisibility(View.VISIBLE);
                    i=i+1;
                    c8=1;
                    eighth.setText(product_name.getText().toString());
                }
                else if (i == 9) {
                    ninth.setVisibility(View.VISIBLE);
                    num9.setVisibility(View.VISIBLE);
                    i=i+1;
                    c9=1;
                    ninth.setText(product_name.getText().toString());
                }
                else if (i == 10) {
                    tenth.setVisibility(View.VISIBLE);
                    num10.setVisibility(View.VISIBLE);
                    i=i+1;
                    c10=1;
                    tenth.setText(product_name.getText().toString());
                }
                else if (i == 11) {
                    eleventh.setVisibility(View.VISIBLE);
                    num11.setVisibility(View.VISIBLE);
                    i=i+1;
                    c11=1;
                    eleventh.setText(product_name.getText().toString());
                }
                else if (i == 12) {
                    twelveth.setVisibility(View.VISIBLE);
                    num12.setVisibility(View.VISIBLE);
                    i=1;
                    c12=1;
                    twelveth.setText(product_name.getText().toString());
                }

            }
        });


    }

    public void checkBox1(View view) {
        if (First.isChecked()) {
            First.setText("");
            num1.setText("");
            First.toggle();
            c1=0;
            First.setVisibility(View.GONE);
            num1.setVisibility(View.GONE);
        }
    }
    public void checkBox2(View view) {
        if (second.isChecked()) {
            second.setText("");
            second.toggle();
            c2=0;
            num2.setText("");
            second.setVisibility(View.GONE);
            num2.setVisibility(View.GONE);
        }
    }
    public void checkBox3(View view) {
        if (third.isChecked()) {
            third.setText("");
            third.toggle();
            c3=0;
            num3.setText("");
            third.setVisibility(View.GONE);
            num3.setVisibility(View.GONE);
        }
    }
    public void checkBox4(View view) {
        if (fourth.isChecked()) {
            fourth.setText("");
            fourth.toggle();
            num4.setText("");
            c4=0;
            fourth.setVisibility(View.GONE);
            num4.setVisibility(View.GONE);
        }
    }
    public void checkBox5(View view) {
        if (fifth.isChecked()) {
            fifth.setText("");
            fifth.toggle();
            num5.setText("");
            c5=0;
            fifth.setVisibility(View.GONE);
            num5.setVisibility(View.GONE);
        }
    }
    public void checkBox6(View view) {
        if (sixth.isChecked()) {
            sixth.setText("");
            sixth.toggle();
            num6.setText("");
            c6=0;
            sixth.setVisibility(View.GONE);
            num6.setVisibility(View.GONE);
        }
    }
    public void checkBox7(View view) {
        if (seventh.isChecked()) {
            seventh.setText("");
            seventh.toggle();
            num7.setText("");
            c7=0;
            seventh.setVisibility(View.GONE);
            num7.setVisibility(View.GONE);
        }
    }
    public void checkBox8(View view) {
        if (eighth.isChecked()) {
            eighth.setText("");
            eighth.toggle();
            num8.setText("");
            c8=0;
            eighth.setVisibility(View.GONE);
            num8.setVisibility(View.GONE);
        }
    }
    public void checkBox9(View view) {
        if (ninth.isChecked()) {
            ninth.setText("");
            num9.setText("");
            ninth.toggle();
            c9=0;
            ninth.setVisibility(View.GONE);
            num9.setVisibility(View.GONE);
        }
    }
    public void checkBox10(View view) {
        if (tenth.isChecked()) {
            tenth.setText("");
            num10.setText("");
            tenth.toggle();
            c10=0;
            tenth.setVisibility(View.GONE);
            num10.setVisibility(View.GONE);
        }
    }
    public void checkBox11(View view) {
        if (eleventh.isChecked()) {
            eleventh.setText("");
            eleventh.toggle();
            num11.setText("");
            c11=0;
            eleventh.setVisibility(View.GONE);
            num11.setVisibility(View.GONE);
        }
    }
    public void checkBox12(View view) {
        if (twelveth.isChecked()) {
            twelveth.setText("");
            twelveth.toggle();
            num12.setText("");
            c12=0;
            twelveth.setVisibility(View.GONE);
            num12.setVisibility(View.GONE);
        }
    }
}