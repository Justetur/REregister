package re.register.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.NumberFormat;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import re.register.model.RealEstate;
import re.register.repositories.Register;

@RestController
@RequestMapping("/register")
public class RegisterController {


    @Autowired
    private Register register;


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
