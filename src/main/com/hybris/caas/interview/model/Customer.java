package com.hybris.caas.interview.model;

import java.util.List;

/**
 * @author SAP Hybris YaaS
 */
public class Customer {

    String id;
    String name;
    List<Address> addressBook;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Address> getAddressBook() {
        return addressBook;
    }

    public void setAddressBook(List<Address> addressBook) {
        this.addressBook = addressBook;
    }
}
