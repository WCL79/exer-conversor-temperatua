package com.catalisa;

public class Celsius {

    double celsius,fahrenheit,reaumur,rankine;

    public double converterFahrenheit(){
        fahrenheit = ( 9 * celsius + 160 ) / 5;
       return fahrenheit;
    }
    public double converterReaumur(){
        reaumur = (celsius * 0.8);
        return reaumur;
    }
    public double converterRankine(){
        rankine = (celsius * 1.8 + 32 + 459.67);
        return rankine;
    }
}
