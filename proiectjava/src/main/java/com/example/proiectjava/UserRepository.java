package com.example.proiectjava;

import com.example.proiectjava.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

interface UserRepository extends JpaRepository<User, Long> {

}