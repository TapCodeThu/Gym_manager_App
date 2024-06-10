package com.example.gym_manager.activitys;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.os.Bundle;

import com.example.gym_manager.R;
import com.example.gym_manager.databinding.ActivitySettingBinding;
import com.google.firebase.auth.FirebaseAuth;

public class SettingActivity extends AppCompatActivity {
    private ActivitySettingBinding binding;
    private FirebaseAuth auth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivitySettingBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        getWindow().setStatusBarColor(ContextCompat.getColor(this,R.color.white));

        auth = FirebaseAuth.getInstance();
        binding.btnLogout.setOnClickListener(v->{
            auth.signOut();
            startActivity(new Intent(SettingActivity.this, LoginActivity.class));
            finish();
        });


    }
}