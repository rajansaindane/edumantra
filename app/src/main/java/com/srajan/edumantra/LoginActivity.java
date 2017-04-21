package com.srajan.edumantra;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.StringRequest;
import com.srajan.edumantra.DBHelper.DataBaseSignUp;
import com.srajan.edumantra.RequestQueue.WebService;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.HashMap;
import java.util.Map;

public class LoginActivity extends AppCompatActivity {

    DataBaseSignUp db = new DataBaseSignUp(this);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Button signIn = (Button) findViewById(R.id.btnsign);
        signIn.setOnClickListener(this::openSignIn);

        TextView signUp = (TextView) findViewById(R.id.btnup);
        signUp.setOnClickListener(this::openSignUp);

        Button button = (Button) findViewById(R.id.btnskip);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Intent intent = new Intent(LoginActivity.this, NavigationHome.class);
                startActivity(intent);
            }
        });
    }

    private void openSignUp(View view) {

        Intent intentsign = new Intent(LoginActivity.this, SignUpActivity.class);
        startActivity(intentsign);
    }

    private void openSignIn(View view) {

        EditText user = (EditText) findViewById(R.id.uname);
        EditText pass = (EditText) findViewById(R.id.passw);
        String email = user.getText().toString();
        String password = pass.getText().toString();

        String url = "http://192.168.0.18:8787/mahacareer/user/loginUser";


        WebService.q(this).add(new JsonObjectRequest(Request.Method.POST, url + "?emailId=" + email + "&password=" + password,
                this::onPostSuccess,
                this::onPostError));
    }

    private void onPostSuccess(JSONObject jsonobject) {

        Log.i("@srajan", "Response" + jsonobject.toString());
        try {
            String check = jsonobject.getString("status");
            Log.i("@srajan", "Response" + check);
            if (check.equals("success")) {
                Intent intent = new Intent(LoginActivity.this, NavigationHome.class);
                startActivity(intent);
            } else {
                Toast.makeText(this, "Username or Password does not match", Toast.LENGTH_SHORT).show();
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    private void onPostError(VolleyError e) {

        Log.i("@srajan", "Error" + e.toString());

    }
}
