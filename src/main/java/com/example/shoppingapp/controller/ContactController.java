package com.example.shoppingapp.controller;

import com.example.shoppingapp.dto.ContactDto;
import com.example.shoppingapp.service.ContactService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/contacts")
public class ContactController {

    final ContactService contactService;

    @GetMapping(value = ":/contactList")
    public List<ContactDto> getContactInfo() { return contactService.getAll();}

    @GetMapping(value = "/getContactsByContactId/{contactId}")
    public ContactDto getContactsByContactId(@PathVariable(value = "contactId") Long contactId){
        return getContactsByContactId(contactId);
    }

}
