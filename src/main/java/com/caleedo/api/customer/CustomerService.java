package com.caleedo.api.customer;

import com.caleedo.api.models.CustomerModel;

public interface CustomerService {
    public CustomerModel addNewCustomer(CustomerModel customerModel);
    public CustomerModel findCutomerById(int id);
}
