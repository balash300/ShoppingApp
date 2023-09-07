package com.example.shoppingapp.controller;

import com.example.shoppingapp.dto.ContactDto;
import com.example.shoppingapp.dto.request.ContactRequest;
import com.example.shoppingapp.model.Contacts;
import com.example.shoppingapp.service.ContactService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping(value = "/saveContacts")
    public void saveContacts(@RequestBody ContactRequest contactRequest){
        contactService.saveContacts(contactRequest);
    }

    @PostMapping(value = "/updateContacts")
    public void updateContacts(@RequestBody ContactRequest contactRequest){
        contactService.updateContacts(contactRequest);
    }

    @DeleteMapping(value = "/deleteByContactId/{contactId}")
    public void deleteByContactId(@PathVariable(value = "contactId") Long contactId) {
        contactService.deleteByContactId(contactId);
    }

}
