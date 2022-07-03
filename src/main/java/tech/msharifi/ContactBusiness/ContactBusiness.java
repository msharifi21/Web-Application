package tech.msharifi.ContactBusiness;

import java.util.ArrayList;

import java.util.*;
import tech.msharifi.Contact.Contact;

public class ContactBusiness {

	public List<Contact> getContactList() {
        List<Contact> listContact = new ArrayList<>();
         
        listContact.add(new Contact("Mustafa", "Sharifi", "msharifi21@hotmail.com", "(720) 401-6227"));
        
         
        return listContact;
    }
}
