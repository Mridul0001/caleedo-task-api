package com.caleedo.api.customer;

import com.caleedo.api.models.BranchMasterModel;
import com.caleedo.api.models.CustomerModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1")
public class CustomerController {
    @Autowired CustomerService customerService;

    @GetMapping("/findcustomer/{id}")
    public ResponseEntity findBranchById(@PathVariable(name = "id") int id){
        try{
            return new ResponseEntity<CustomerModel>(customerService.findCutomerById(id), HttpStatus.ACCEPTED);
        } catch (Exception e){
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PostMapping("/addcustomer")
    public ResponseEntity addNewCustomer(@RequestBody CustomerModel customerModel){
        try{
            return new ResponseEntity<CustomerModel>(customerService.addNewCustomer(customerModel), HttpStatus.ACCEPTED);
        } catch (Exception e){
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
