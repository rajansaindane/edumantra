package com.srajan.edumantra;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.srajan.edumantra.DBHelper.DataBaseSignUp;

public class LoginActivity extends AppCompatActivity {

    DataBaseSignUp db=new DataBaseSignUp(this);


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Button signIn=(Button)findViewById(R.id.btnsign);
        signIn.setOnClickListener(this::openSignIn);

        TextView signUp=(TextView) findViewById(R.id.btnup);
        signUp.setOnClickListener(this::openSignUp);

        Button button=(Button)findViewById(R.id.btnskip);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Intent intent=new Intent(LoginActivity.this,HomeScreen.class);
                startActivity(intent);
            }
        });





    }

    private void openSignUp(View view) {

        Intent intentsign=new Intent(LoginActivity.this,SignUpActivity.class);
        startActivity(intentsign);
    }

    private void openSignIn(View view) {

        EditText user=(EditText)findViewById(R.id.uname);
        EditText pass=(EditText)findViewById(R.id.passw);
        String username=user.getText().toString();
        String password=pass.getText().toString();

        String checkPass=db.searchpass(password);

        if(password.equals(checkPass))
        {
            Intent intentsign=new Intent(LoginActivity.this,HomeScreen.class);
            startActivity(intentsign);
        }
        else
            {
                Toast.makeText(this,"Username or Password don't match",Toast.LENGTH_SHORT).show();
            }

    }
}
