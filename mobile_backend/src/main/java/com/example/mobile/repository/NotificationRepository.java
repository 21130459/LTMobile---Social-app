package com.example.mobile.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.mobile.model.Notification;

@Repository
public interface NotificationRepository extends JpaRepository<Notification, Integer> {
	
}