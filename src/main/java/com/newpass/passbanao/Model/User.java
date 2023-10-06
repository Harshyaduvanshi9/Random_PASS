package com.newpass.passbanao.Model;

@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String firstName;
    private String middleName;
    private String lastName;
    private String password;

    // Getters and setters
    
}

