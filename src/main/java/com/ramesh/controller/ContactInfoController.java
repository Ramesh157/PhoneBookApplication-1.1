package com.ramesh.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.ramesh.model.Contact;
import com.ramesh.service.ContactService;

@Controller
public class ContactInfoController {

	@Autowired
	private ContactService contactService;

	@GetMapping(value = { "/", "/addContact" })
	public String loadForm(Model model) {

		Contact c = new Contact();
		model.addAttribute("contact",c);
		return "contactInfo";
	}

	@PostMapping(value = "/saveContact")
	public String handleSubmitBtn(@ModelAttribute("contact") Contact c, Model model) {
		boolean isSaved = contactService.saveContact(c);

		if (isSaved) {
			model.addAttribute("succMsg", "contact Saved");
		} else {
			model.addAttribute("errMsg", "Failed to Save Contact");
		}

		return "contactInfo";
	}

	@GetMapping(value = "/viewContact")
	public String handleViewContactLink(Model model) {
		return null;
	}

}
