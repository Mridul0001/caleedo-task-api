package com.caleedo.api.branchmaster;

import com.caleedo.api.models.BranchMasterModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1")
public class BranchMasterController {
    @Autowired BranchMasterService branchMasterService;

    @GetMapping("/findbranch/{id}")
    public ResponseEntity findBranchById(@PathVariable(name = "id") int id){
        try{
            return new ResponseEntity<BranchMasterModel>(branchMasterService.findBranchById(id), HttpStatus.ACCEPTED);
        } catch (Exception e){
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PostMapping("/addbranch")
    public ResponseEntity addNewBranch(@RequestBody BranchMasterModel branchMasterModel){
        try{
            return new ResponseEntity<BranchMasterModel>(branchMasterService.addNewBranch(branchMasterModel), HttpStatus.ACCEPTED);
        } catch (Exception e){
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
