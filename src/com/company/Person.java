package com.company;

public class Person {
    String personName;
    int age;
    int govtID;
    int adressNO;
    int KRA_Pin;

    Person(String personName,int age,int govtID,int adressNO,int KRA_Pin){
        this.personName = personName;
        this.age=age;
        this.govtID=govtID;
        this.KRA_Pin=KRA_Pin;
    }
    public String toString(){
        return this.personName+"\n"+this.age+"\n"+this.govtID+"\n"+this.KRA_Pin+"\n";}
}
