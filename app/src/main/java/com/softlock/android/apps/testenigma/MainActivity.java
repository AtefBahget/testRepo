package com.softlock.android.apps.testenigma;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
String TestString = "Hello TestStrings";
  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);

    Toast.makeText(this, TestString,Toast.LENGTH_LONG).show();
  }
}
