package com.example.li406.team14;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity {

    public final static String EXTRA_PAGE = "com.example.li406.team14";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    /**Called when the user clicks the button*/
    public void signUp(View view) {
        Intent intent = new Intent(this, SignUpPageActivity.class);
        EditText editText = (EditText) findViewById(R.id.editText);
        String message = editText.getText().toString();
        intent.putExtra(EXTRA_PAGE, message);
        startActivity(intent);
    }
}
