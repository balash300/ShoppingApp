package com.example.shoppingapp.repository;

import com.example.shoppingapp.model.Contacts;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContactRepository extends JpaRepository<Contacts, Long> {

    Contacts getContactsByContactId(Long contactId);
}
