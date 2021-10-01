package com.company;

public class Fraction {
    float a;
    float b;
    public void Fraction(float a, float b){
        this.a=a;
        this.b=b;
    }
    public void Fraction(){

    }
    public void SetFraction(float a, float b){
        this.a=a;
        if(b!=0) {
            System.out.println("You can't set dénominateur on 0 ");


            this.b = b;
        }
        else{
            this.b = 1;

        }
    }
    public String toString(){
        System.out.println("Cette fraction a comme numérateur : %f"+ a+" et comme dénominateur : %f "+ b+ "==>"+a+"/"+b);
        return null;
    }

}