package com.example.lib;

public class Car {
   private  int year;

  private int speed;

  //Getter & Setters
    //Use to retrieve the private year
    public int getYear(){
        return  year;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    //Modification of the year
    public void setYear(int newYear){
        year = newYear;
    }
    protected void accelerate(){
        speed += 10;
        System.out.println("Your new Speed is: " +speed );
    }

    public void brake(){
        speed -= 5;
        System.out.println("Your new Speed is: " +speed);
    }

    //Constructor
    public Car(int carSpeed, int carYear){
        year = carYear;
        speed = carSpeed;
    }
}
