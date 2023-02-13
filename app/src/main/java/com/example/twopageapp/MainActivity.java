package com.example.twopageapp;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.twopageapp.databinding.ActivityMainBinding;
import com.example.twopageapp.databinding.ActivitySecondBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
    }

    public void submitBtn(View v)
    {
        Intent intent = new Intent(this, SecondActivity.class);
        intent.putExtra("data", binding.nameTextInput.getText().toString());
        startActivity(intent);
    }

}