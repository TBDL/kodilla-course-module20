package com.kodilla.testing;

import com.kodilla.testing.user.SimpleUser;
import com.kodilla.testing.calculator.Calculator;

public class TestingMain {

    public static void main(String[] args){
       SimpleUser simpleUser = new SimpleUser("theForumUser");

       String result = simpleUser.getUsername();

       if(result.equals("theForumUser")){
           System.out.println("test OK");
       } else {
           System.out.println("Error!");
       }

       // Quest 6.2
       Calculator calculator = new Calculator(10,5);

       int addResult = calculator.add(10,5);
       int substractResult = calculator.substract(10,5);

       if(addResult == (calculator.getA() + calculator.getB()) &&
          substractResult == (calculator.getA() - calculator.getB())){

           System.out.println("test OK");
        } else {
           System.out.println("Error!");
    }

    }
}
