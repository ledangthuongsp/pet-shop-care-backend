package com.example.pet_shop_care_backend.Models;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.time.LocalDate;

public class Users {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;
    private String username;
    private String hashPassword;
    private LocalDate dayOfBirth;
    private String fullName;
    private String phoneNumber;
    private String avatarUrl;
    private String personalId;
}
