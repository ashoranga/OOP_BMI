/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personbmi;

/**
 *
 * @author MERC-LAB-01
 */
public class Person {
    String name;
    int age;
    double ht;
    double wt;
    double bmi;
    
public  Person (){
    System.out.println("new class is created");
}

public Person (String provideAname){
            System.out.println("new class with name");
            name= provideAname;
}

public Person (String provideName,double provideHt,double provideWt){
    System.out.println("New class with name,ht,wt");
    name = provideName;
    ht = provideHt;
    wt = provideWt;
}
public void calculateBmi (){
        bmi = wt/(ht*ht);
    
    }
    
    
    
    
}
