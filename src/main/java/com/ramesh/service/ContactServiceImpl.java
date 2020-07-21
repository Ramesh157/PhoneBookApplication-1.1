package com.ramesh.service;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ramesh.entity.ContactEntity;
import com.ramesh.model.Contact;
import com.ramesh.repository.ContactDtlsRepository;
@Service
public class ContactServiceImpl implements ContactService {

	@Autowired
	private ContactDtlsRepository contactRepo;

	@Override
	public boolean saveContact(Contact c) {
		ContactEntity entity = new ContactEntity();
		BeanUtils.copyProperties(c, entity);
		ContactEntity savedEntity = contactRepo.save(entity);
		return savedEntity.getContactId() != null;
	}

	@Override
	public List<Contact> getAllContacts() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Contact getContactById(Integer cid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean updateContact(Contact c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteContact(Integer cid) {
		// TODO Auto-generated method stub
		return false;
	}

}
