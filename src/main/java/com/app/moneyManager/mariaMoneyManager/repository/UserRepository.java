package com.app.moneyManager.mariaMoneyManager.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.moneyManager.mariaMoneyManager.entities.User;

public interface UserRepository extends JpaRepository <User, Integer> {

}
