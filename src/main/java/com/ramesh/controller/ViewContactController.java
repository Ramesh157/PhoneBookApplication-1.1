package com.ramesh.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.ramesh.model.Contact;
import com.ramesh.service.ContactService;


@Controller
public class ViewContactController {
	
	@Autowired
	private ContactService contactService;

	
	@RequestMapping("/editcontact")
	public String editContact(@RequestParam ("contactId")Integer contactId) {
		return null;}
	
	@RequestMapping(value = "/update", method = RequestMethod.POST)
		public	String updateContact(Contact c, Model model) {
		return null;
	}
	
	@RequestMapping(value = "/delete")
	String deleteContact(@RequestParam ("contactId")Integer contactId) {
		return null;
	}
	
	
}
