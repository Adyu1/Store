package com.store.store.model;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //Check what this does
    private int id;
    private String name;
    private String surname;
    private String password;
    private String email;
    private Date birth_date;

    public Customer(int id, String name, String surname, String password, String email, Date birth_date){
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.password = password;
        this.email = email;
        this.birth_date = birth_date;

    }

    public int getId(){
    return id;
    }
    public void setId(int id){
    this.id = id;
    }
   
    public String getName() {
    return name;
    }
    public void setName (String name){
    this.name = name;
    }

    public String getSurname() {
    return surname;
    }
    public void setSurname (String surname){
    this.surname = surname;
    }

    public String getPassword() {
    return password;
    }
    public void setPassword (String password){
    this.password = password;
    }
 
    public String getEmail() {
    return email;
    }
    public void setEmail (String email){
    this.email = email;
    }
    
    public Date getBirth_date() {
    return birth_date;
    }
    public void setBirth_date (Date birth_date){
    this.birth_date = birth_date;
    }
}
