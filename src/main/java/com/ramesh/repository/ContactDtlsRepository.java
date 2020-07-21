package com.ramesh.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ramesh.entity.ContactEntity;


 @Repository
public interface ContactDtlsRepository extends JpaRepository<ContactEntity, Serializable> {

	 
	
}
