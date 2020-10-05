package com.example.learnactivity;

import androidx.lifecycle.ViewModel;

public class SignUpViewModel extends ViewModel {
    private User user;

    public void setUser(User user) {
        this.user = user;
    }

    public User getUser() {
        return user;
    }
}
