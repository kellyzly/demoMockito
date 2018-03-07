package  main.java.mockito.demo;

public interface PersonDao
{
    public Person fetchPerson( Integer personID );
    public void update( Person person );
} 