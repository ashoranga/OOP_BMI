/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personbmi;

import javax.swing.JOptionPane;

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

public void resultsClazzification (){
      if (bmi<=18.5){
      JOptionPane.showMessageDialog(null, "BMI = " + bmi + "  Underweight");
      }
      if ((bmi>18.5)&&(bmi<25)){
          JOptionPane.showMessageDialog(null,"BMI = " + bmi + "  Healthy");
      }
      if ((bmi>=25)&&(bmi<=30)){
          JOptionPane.showMessageDialog(null,"BMI = " + bmi + "  Over Weight");
      }
      if (bmi>30){
          JOptionPane.showMessageDialog(null,"BMI = " + bmi + "  Obese");      }
}
    
    
    
    
}
