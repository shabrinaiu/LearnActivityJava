package com.example.learnactivity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.material.textfield.TextInputLayout;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class SignUpActivity extends AppCompatActivity {

    TextInputLayout signupUsername, signupEmail, signupPassword;
    Button signupBtn, signupToLoginBtn;
    FirebaseDatabase rootNode;
    DatabaseReference reference;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.signup);
        signupUsername = findViewById(R.id.signup_username);
        signupEmail = findViewById(R.id.signup_email);
        signupPassword = findViewById(R.id.signup_password);
        signupBtn = findViewById(R.id.signup_btn);
        signupToLoginBtn = findViewById(R.id.signup_login_btn);

        final SignUpViewModel viewModel = new ViewModelProvider(this).get(SignUpViewModel.class);

        signupBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                rootNode = FirebaseDatabase.getInstance();
//                reference = rootNode.getReference("users");
                String username = signupUsername.getEditText().getText().toString();
                String email = signupEmail.getEditText().getText().toString();
                String password = signupPassword.getEditText().getText().toString();
                User user = new User(email, username, password);
//                reference.setValue();
                viewModel.setUser(user);
                Intent intent = new Intent()
            }
        });
    }
}