package com.example.temperatureconverter;

public class TemperatureConverter {
	public static Double FahrenheitToCelsius(Double f){
		return (5.0/9)*(f-32);
	}

	public static Double CelsiusToFahrenheit(Double c){
		return 1.8*c+32;
	}
}
