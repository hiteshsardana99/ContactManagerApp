package com.example.demo.controller;

import com.example.demo.model.Contact;
import com.example.demo.service.ContactManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping("/api")
public class ContactController {

  @Autowired
  private ContactManagerService contactManagerService;

  @PostMapping(value = "/saveContact")
  public void saveContact(@RequestParam("firstName") String firstName,
                             @RequestParam("lastName") String lastName,
                             @RequestParam("phoneNum") String phoneNum) {
    contactManagerService.addContact(firstName, lastName, phoneNum);
  }

  @GetMapping(value = "/getContactList")
  public Collection<Contact> saveContact() {
    return contactManagerService.getAllContacts();
  }

}
