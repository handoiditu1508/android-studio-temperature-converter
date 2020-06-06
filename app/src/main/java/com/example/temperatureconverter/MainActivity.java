package com.example.temperatureconverter;

import androidx.appcompat.app.AppCompatActivity;
import androidx.arch.core.util.Function;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	public void PerformClick(View v){
		EditText input = findViewById(R.id.inputText);
		String inputText = input.getText().toString();
		if(inputText == null || inputText.isEmpty())
			inputText = "0";
		TextView result = findViewById(R.id.resultText);

		Double number = Double.parseDouble(inputText);

		ToggleButton toggle = findViewById(R.id.toggleBtn);
		if(toggle.isChecked()){
			result.setText(TemperatureConverter.FahrenheitToCelsius(number).toString());
		}
		else{
			result.setText(TemperatureConverter.CelsiusToFahrenheit(number).toString());
		}
	}
}
