package com.caleedo.api.param;

import com.caleedo.api.models.CustomerModel;
import com.caleedo.api.models.ParameterMasterModel;
import com.caleedo.api.models.ParameterThresholdModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;

@RestController
@RequestMapping("/v1")
public class ParamMasterController {
    @Autowired ParamMasterService paramMasterService;

    @PostMapping("/addparam")
    public ResponseEntity addNewParam(@RequestBody ParameterMasterModel parameterMasterModel){
        try{
            return new ResponseEntity<ParameterMasterModel>(paramMasterService.addNewParameter(parameterMasterModel), HttpStatus.ACCEPTED);
        } catch (Exception e){
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PostMapping("/updatethreshold")
    public ResponseEntity updateThreshold(@RequestBody ParameterThresholdModel parameterThresholdModel){
        try{
            paramMasterService.updateThreshold(parameterThresholdModel);
            return new ResponseEntity(HttpStatus.ACCEPTED);
        } catch (Exception e){
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/getthersholds")
    public ResponseEntity<HashMap<Integer,ThresholdModel>> getAllThresholds(){
        try{
            return new ResponseEntity<HashMap<Integer,ThresholdModel>>(paramMasterService.getAllThresholds(),HttpStatus.ACCEPTED);
        } catch (Exception e){
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
