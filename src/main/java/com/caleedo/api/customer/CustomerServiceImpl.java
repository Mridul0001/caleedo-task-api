package com.caleedo.api.customer;

import com.caleedo.api.constants.GlobalConstants;
import com.caleedo.api.helpers.SequenceService;
import com.caleedo.api.models.CustomerModel;
import com.caleedo.api.repos.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl implements CustomerService{
    @Autowired CustomerRepository customerRepository;
    @Autowired SequenceService sequenceService;

    @Override
    public CustomerModel addNewCustomer(CustomerModel customerModel) {
        //Can add duplicate check here as well
        int id = sequenceService.getSequence(GlobalConstants.CUSTOMER);
        customerModel.setId(id);
        customerRepository.save(customerModel);
        return customerModel;
    }

    @Override
    public CustomerModel findCutomerById(int id) {
        CustomerModel customerModel = customerRepository.findCutomerById(id);
        return customerModel;
    }
}
