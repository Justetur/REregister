package re.register.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import re.register.model.RealEstate;
import re.register.model.SearchCriteria;
import re.register.repositories.Register;
import re.register.services.Search;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/search")
public class SearchController {

    @Autowired
    private Register register;

    @Autowired
	private Search search;

    @PostMapping("")
    public List<RealEstate> search(@RequestBody SearchCriteria criterias) {
        List<RealEstate> filteredList = new ArrayList<>();
        search.search(register, criterias);
        return filteredList;
    }
}
