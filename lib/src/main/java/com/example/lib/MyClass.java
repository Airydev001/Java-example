package com.example.lib;

public class MyClass {
   public  static  void main( String[] args){

//       int age = 27;
//       System.out.print(
//               "Hello my friends " + age);
//
//       String friendName = "Bayomi";
//
//       System.out.println(friendName);

       //Create the new instance of the car
       Car redCar = new Car(100, 2024);

       redCar.accelerate();

       redCar.brake();

       redCar.accelerate();

       redCar.accelerate();

       redCar.brake();


   }
}
