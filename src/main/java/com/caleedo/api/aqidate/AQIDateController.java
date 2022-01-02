package com.caleedo.api.aqidate;

import com.caleedo.api.models.AQIDateModel;
import com.caleedo.api.models.CustomerModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1")
public class AQIDateController {
    @Autowired AQIDateService aqiDateService;
    @PostMapping("/addvalue")
    public ResponseEntity addNewValue(@RequestBody AQIDateModel aqiDateModel){
        try{
            aqiDateService.addNewValue(aqiDateModel);
            return new ResponseEntity(HttpStatus.ACCEPTED);
        } catch (Exception e){
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/getallvalues")
    public ResponseEntity<List<AQIDateModel>> getAllValues(){
        try{
            return new ResponseEntity<List<AQIDateModel>>(aqiDateService.getAllValues(),HttpStatus.ACCEPTED);
        } catch (Exception e){
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
