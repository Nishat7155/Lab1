package software;

import org.junit.Assert;
import org.junit.Test;



public class PersonTest {

    private Person person;
    @BeforeEach
    public void setUp() throws Exception{
        this.person= new Person("Anderson", 40);
    }

    @Test
    public void getName() {
        assert this.person.getName().equals("Anderson");
    }

    @Test
    public void getAge() {
        assert this.person.getAge() == 40;

    }

    @Test
    public void setAge() {
        this.person.setAge(-2);
        assert this.person.getAge() == 0;

    }

    @Test
    public void setName() {
        this.person.setName("Oops");
        assert this.person.getName().equals("Oops");

    }

    @Test
    public void reverseName() {
        String name = "Anderson";
        Assert.assertEquals("nosrednA",person.reverseName(name));

    }
}