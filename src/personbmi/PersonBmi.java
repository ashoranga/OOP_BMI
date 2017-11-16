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
public class PersonBmi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Person p1 = new Person();
        p1.name = "Kamal";
        p1.age = 28;
        p1.ht = 1.56;
        p1.wt = 60;
        p1.calculateBmi();
        System.out.println(p1.name+"'s BMI is "+p1.bmi);
        
       Person p2 = new Person ();
        p2.name = "Sunil";
        p2.wt = 80;
        p2.ht = 1.6;
        p2.calculateBmi();
        System.out.println(p2.name+"'s BMI is "+p2.bmi);
        
       Person p3 = new Person ("Ashoranga");
        p3.wt = 70;
        p3.ht = 1.54;
        p3.calculateBmi();
        System.out.println(p3.name+"'s BMI is "+p3.bmi);
        
       Person p4 = new Person("Gamage", 1.62, 58);
        p4.calculateBmi();
        System.out.println(p4.name+"'s BMI is "+p4.bmi);
        


// TODO code application logic here
    }
    
}
