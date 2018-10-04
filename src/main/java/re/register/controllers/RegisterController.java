package re.register.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.NumberFormat;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;
import re.register.model.RealEstate;
import re.register.model.Register;
import re.register.model.SearchCriteria;


import java.util.List;

@RestController
@RequestMapping("/register")
public class RegisterController {

    private RealEstate reObject;

    @Autowired
    private Register register;

    private SearchCriteria criteria;



    @GetMapping
    public List<RealEstate> getAll() {
        return register.getAllObjects();
    }


    @PostMapping("/add/{reObject}")
    public int addNew(@PathVariable("reObject") RealEstate reObject){
        return register.add(reObject);
    }

    @DeleteMapping("/remove/{id}")
    public ResponseEntity<Void> removeById(@PathVariable("id") @NumberFormat int id){
        register.removeById(id);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/getBy/{id}")
    public ResponseEntity<RealEstate> getById(@PathVariable("id") @NumberFormat int id) {
        RealEstate reObject = register.getById(id);

        if (reObject != null) {
            return ResponseEntity.ok(reObject);
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
    }


}
