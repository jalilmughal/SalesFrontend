package dk.cphbusiness.sales.control;

import dk.cphbusiness.sales.contract.SalesManager;
import dk.cphbusiness.sales.model.Person;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
public class SalesManagerBean implements SalesManager {

    @PersistenceContext(unitName = "SalesBackendPU")
    private EntityManager em;

    @Override
    public String sayHello(String name) {
        return "Hello " + name + " remote sales manager bean";
    }

    @Override
    public String sayHelloTo(String email) {
        Person person = em.find(Person.class, email);
        if (person == null) {
            return "Say hello to who?";
        }
        return "Hello " + person.getFirstName() + " " + person.getLastName()
                + " you want a " + person.getGift().getName();
    }
}
