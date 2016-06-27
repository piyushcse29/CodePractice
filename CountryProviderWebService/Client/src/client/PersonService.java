package client;
import java.util.ArrayList;
import java.util.Date;import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("client")
@Consumes(value = { "application/json", "application/xml" })
@Produces(value = { "application/json", "application/xml" })
public class PersonService {

    private List<Person> persons;
    private Person person;

    public PersonService() {
        super();
        this.persons = new ArrayList<Person>();
        for (long i = 0; i < 10; i++) {
            Person p = new Person();
            p.setId(i);
            p.setFirstname("Piyush " + i);
            p.setLastname("Mittal " + i);
            p.setHiredate(new Date());
            this.persons.add(p);
        }
        this.person = this.persons.get(0);
    }

    @GET
    @Path("/persons")
    public List<Person> getPersons(){
        return this.persons;
    }

    @POST
    @Path("/person")
    public void addPerson(Person person) {
        System.out.println("add person " + person);

        if(person != null){
            getPersons().add(person);
        }
    }

    @GET
    @Path("/person")
    public Person getPerson(){
        return person;
    }
}