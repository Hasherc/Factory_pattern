package filterPattern.src.criteria;

import filterPattern.src.Person;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 91504
 * Date: 2017-11-15
 * Time: 20:18
 */
public interface Criteria {
    public List<Person> meetCriteria(List<Person> persons);
}
