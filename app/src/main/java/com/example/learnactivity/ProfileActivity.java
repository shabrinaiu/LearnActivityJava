package com.example.learnactivity;

import android.os.Bundle;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

public class ProfileActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.profile);

        SignUpViewModel viewModel = new ViewModelProvider(this).get(SignUpViewModel.class);

        User user = viewModel.getUser();
        TextView tvUsername = findViewById(R.id.profile_username);
        TextView tvEmail = findViewById(R.id.profile_email);

        tvUsername.setText(user.username);
        tvEmail.setText(user.email);
    }
}
