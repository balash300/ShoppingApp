package com.example.shoppingapp.service.impl;

import com.example.shoppingapp.dto.ContactDto;
import com.example.shoppingapp.dto.request.ContactRequest;
import com.example.shoppingapp.model.Contacts;
import com.example.shoppingapp.repository.ContactRepository;
import com.example.shoppingapp.service.ContactService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ContactImpl implements ContactService {
    private final ContactRepository contactRepository;

    @Override
    public ContactDto getContactsByContactId(Long contactId) {
        Contacts contacts = contactRepository.getContactsByContactId(contactId);
        return ContactDto.builder()
                .firstName(contacts.getFirstName())
                .email(contacts.getEmail())
                .phone(contacts.getPhone())
                .build();
    }

    @Override
    public void saveContacts(ContactRequest contactRequest) {
        Contacts contacts = Contacts.builder()
                .firstName(contactRequest.getFirstName())
                .phone(contactRequest.getPhone())
                .build();
        
        contactRepository.save(contacts);
    }

    @Override
    public void updateContacts(ContactRequest contactRequest) {
        Contacts contacts = Contacts.builder()
                .firstName(contactRequest.getFirstName())
                .lastName(contactRequest.getLastName())
                .email(contactRequest.getEmail())
                .phone(contactRequest.getPhone())
                .build();

        contactRepository.save(contacts);
    }

    @Override
    public void deleteByContactId(Long contactId) {
        if (contactId == null){
            throw new RuntimeException("There is no such information");
        } else {
            contactRepository.deleteById(contactId);
        }
    }

    @Override
    public List<ContactDto> getAll() {
        List<Contacts> contacts1 = contactRepository.findAll();
        List<ContactDto> contactDtos = new ArrayList<>();
        
        for (Contacts contacts : contacts1){
            ContactDto contactDto = ContactDto.builder()
                    .firstName(contacts.getFirstName())
                    .email(contacts.getEmail())
                    .phone(contacts.getPhone())
                    .build();
                    
            contactDtos.add(contactDto);
        }
        return contactDtos;
    }
}
