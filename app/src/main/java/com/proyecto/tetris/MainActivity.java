package com.proyecto.tetris;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.Vist.Board;

public class MainActivity extends AppCompatActivity {

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(new Board(this));


    }
}