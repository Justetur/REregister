package re.register.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import re.register.model.RealEstate;
import re.register.model.Register;
import re.register.model.SearchCriteria;
import re.register.services.Search;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/search")
public class SearchController {

    @Autowired
    private Register register;

    @Autowired
    private SearchCriteria criterias;

    @PostMapping("")
    public List<RealEstate> search(@RequestBody Search search) {
        List<RealEstate> filteredList = new ArrayList<>();
        search.search(register, criterias);
        return filteredList;
    }
}
