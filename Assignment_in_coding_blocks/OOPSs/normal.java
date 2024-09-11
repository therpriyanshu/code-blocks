package Assignment_in_coding_blocks.OOPSs;
import java.util.*;
public class normal { 
    String name;
    int ID;
    int age;
    char section;
    String branch;
    void introduceYourself(){ 
        System.out.println("Hi, my name is: "+ name+"my ID is: "+ID+"my major is: "+branch+ "of section "+section+ "my age is"+age);
    }
    public normal(){
        
    }
    public normal(String name,int age,char section,String branch){
        this.name=name;
        try{if(age>17)
            this.age=age;
            else
            throw new Exception("Wrong Inputs :");
        }catch(Exception e){
            e.printStackTrace();
            //System.exit(0);
        }finally{
            System.out.println("Finally we can end our code");
        } 
        this.age=age; 
        this.ID=ID; 
        this.section=section;
        this.branch=branch;
        //all valu
    }
}



