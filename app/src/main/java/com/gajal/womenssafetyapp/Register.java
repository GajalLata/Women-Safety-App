package com.gajal.womenssafetyapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

public class Register extends AppCompatActivity {
EditText et1;
EditText et2;
EditText et3;
EditText et4;
EditText et5;
CheckBox cb;
Button b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        et1=findViewById(R.id.t1);
        et2=findViewById(R.id.t2);
        et3=findViewById(R.id.t3);
        et4=findViewById(R.id.t4);
        et5=findViewById(R.id.t5);

        cb=findViewById(R.id.cb1);
        b=findViewById(R.id.button);

        String name=et1.getText().toString();
        String email=et2.getText().toString();
        String mobile=et3.getText().toString();
        String pass=et4.getText().toString();
        String password=et5.getText().toString();

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                if(  name==null || email==null || mobile==null || pass==null || password==null){
                    Toast.makeText(Register.this, "First fill all empty fields", Toast.LENGTH_SHORT).show();

                }
               else if(cb.isChecked() && name!=null && email!=null && mobile!=null && pass!=null && password!=null){
                    Toast.makeText(Register.this, "Your Information is successfully submitted", Toast.LENGTH_SHORT).show();
                }


                else
                {
                    Toast.makeText(Register.this, "Please first accept terms and conditions", Toast.LENGTH_SHORT).show();
                }
            }
        });


    }
}