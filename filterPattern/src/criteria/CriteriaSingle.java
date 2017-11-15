package filterPattern.src.criteria;

import filterPattern.src.Person;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 91504
 * Date: 2017-11-15
 * Time: 20:27
 */
public class CriteriaSingle implements Criteria {
    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> singlePersons = new ArrayList<>();
        for (Person person : persons){
            if (person.getMaritalStatus().equalsIgnoreCase("Single")){
                singlePersons.add(person);
            }
        }
        return singlePersons;
    }
}
