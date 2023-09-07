package com.example.shoppingapp.service;

import com.example.shoppingapp.dto.ContactDto;
import com.example.shoppingapp.dto.request.ContactRequest;

import java.util.List;

public interface ContactService {

    ContactDto getContactsByContactId(Long contactId);

    void saveContacts(ContactRequest contactRequest);

    void updateContacts(ContactRequest contactRequest);
    void deleteByContactId(Long contactId);

    List<ContactDto> getAll();
}
