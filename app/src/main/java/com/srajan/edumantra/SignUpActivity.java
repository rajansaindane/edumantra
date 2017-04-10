package com.srajan.edumantra;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.srajan.edumantra.DBHelper.DataBaseSignUp;
import com.srajan.edumantra.Domain.GetSignUpInfo;

public class SignUpActivity extends AppCompatActivity {

    DataBaseSignUp db=new DataBaseSignUp(this);

    EditText name, add, contact, qualification, email, username, password, cpassword;
    Button button;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);


        name = (EditText) findViewById(R.id.name);
        add = (EditText) findViewById(R.id.add);
        contact = (EditText) findViewById(R.id.contactno);
        qualification = (EditText) findViewById(R.id.qualification);
        email = (EditText) findViewById(R.id.id);
        username = (EditText) findViewById(R.id.username);
        password = (EditText) findViewById(R.id.password);
        cpassword = (EditText) findViewById(R.id.conformpassword);
        button = (Button) findViewById(R.id.btns);
        button.setOnClickListener(this::check);

        String user = username.getText().toString();
        String pass = password.getText().toString();
        String cpass = cpassword.getText().toString();
        String em = email.getText().toString();
        String nam = name.getText().toString();
        String address=add.getText().toString();
        String cont=contact.getText().toString();
        String qulify=qualification.getText().toString();


    }


    private void check(View view) {

        String user = username.getText().toString();
        String pass = password.getText().toString();
        String cpass = cpassword.getText().toString();
        String em = email.getText().toString();
        String nam = name.getText().toString();
        String address=add.getText().toString();
        String cont=contact.getText().toString();
        String qulify=qualification.getText().toString();

        String pattern="^(([^<>()\\[\\]\\\\.,;:\\s@\"]+" +
                "(\\.[^<>()\\[\\]\\\\.,;:\\s@\"]+)*)|(\".+\"))@((\\[[0-9]{1,3}\\." +
                "[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}])|(([a-zA-Z\\-0-9]+\\.)+[a-zA-Z]{2,}))$";


//        if (user.isEmpty() || pass.isEmpty() || em.isEmpty() || nam.isEmpty()) {

            if (em.isEmpty()) {
                Toast.makeText(this, "email can not be empty", Toast.LENGTH_SHORT).show();
            } else if (!em.matches(pattern)) {

                Toast.makeText(this, "Invalid email", Toast.LENGTH_SHORT).show();
                email.setError("Invalid Email");
            }  else if (username.getText().toString().length() == 0) {

                Toast.makeText(this, "username can not be empty", Toast.LENGTH_SHORT).show();

            } else if (nam.isEmpty()) {
                Toast.makeText(this, "name can not be empty", Toast.LENGTH_SHORT).show();
            } else if (pass.isEmpty()) {
                Toast.makeText(this, "password can not be empty", Toast.LENGTH_SHORT).show();
            } else if (cpass.isEmpty()) {
                Toast.makeText(this, "password can not be empty", Toast.LENGTH_SHORT).show();
            }
//            else if (em.matches(pattern))
//            {
//
//                Toast.makeText(getApplicationContext(),"Invalid email address",Toast.LENGTH_SHORT).show();
//            }

            else if (!pass.equals(cpass)) {
                Toast.makeText(SignUpActivity.this, "Password Do Not Match", Toast.LENGTH_SHORT).show();
            }
//        else if (Patterns.EMAIL_ADDRESS.matcher(email.getText().toString()).matches()) {
//
//            Toast.makeText(this, "Invalid Email", Toast.LENGTH_SHORT).show();
//            email.setError("Invalid Email");
//
//        }
        else {

                save();
                Intent intent = new Intent(SignUpActivity.this, LoginActivity.class);
                startActivity(intent);

//                sendMail();
                Toast.makeText(this, "Thank You,You Have Successfully Registered", Toast.LENGTH_SHORT).show();
                SignUpActivity.this.finish();

            }






    }

    private void sendMail()
    {

        String em = email.getText().toString();

        Intent email = new Intent(Intent.ACTION_SEND);
        String[] To = {"saindane.raajn@gmail.com"};
        String[] CC = {"saindane.rajan@gmail.com"};

        email.setData(Uri.parse("mailto:"));

        email.setType("text/plain");

        email.putExtra(Intent.EXTRA_EMAIL, To);


        email.putExtra(Intent.EXTRA_SUBJECT, "CareerMitra Student Data");

        email.putExtra(Intent.EXTRA_TEXT,
                "name:" + name.getText().toString() + '\n' + "address:" + add.getText().toString() +
                        '\n' + "phone:" + contact.getText().toString() +
                        '\n' + '\n' + em + '\n' + "qualification :"+ qualification.getText().toString() + '\n' +
                        '\n' + "Student Data");

        try {

            startActivity(Intent.createChooser(email, "send mail..."));
            finish();
        } catch (android.content.ActivityNotFoundException ex) {
            Toast.makeText(SignUpActivity.this,
                    "There is no email client installed.", Toast.LENGTH_SHORT).show();
        }

    }

    private void save()
    {

        String user = username.getText().toString();
        String pass = password.getText().toString();
        String cpass = cpassword.getText().toString();
        String em = email.getText().toString();
        String nam = name.getText().toString();
        String address=add.getText().toString();
        String cont=contact.getText().toString();
        String qulify=qualification.getText().toString();

        GetSignUpInfo c=new GetSignUpInfo();
        c.setName(nam);
        c.setAdd(address);
        c.setContact(cont);
        c.setQualification(qulify);
        c.setUsername(user);
        c.setEmail(em);
        c.setPassword(pass);
        c.setCpassword(cpass);
        db.insertStudinfo(c);


    }

    }
