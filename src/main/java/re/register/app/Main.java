package re.register.app;

import re.register.model.Register;
import re.register.model.SearchCriteria;
import re.register.qualificators.City;
import re.register.qualificators.PlotPurpose;

public class Main {

    public static void main(String[] args) {



        Register rElist = Register.createNew();

        SearchCriteria criteria = new SearchCriteria("House", 100000, 150000, City.Vilnius,
                null, null,null);

        rElist.filter(criteria);





    }

}
