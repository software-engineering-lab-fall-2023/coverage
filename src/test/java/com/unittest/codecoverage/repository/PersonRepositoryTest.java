package com.unittest.codecoverage.repository;

import com.unittest.codecoverage.repositories.PersonRepository;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import com.unittest.codecoverage.models.Person;
import com.unittest.codecoverage.models.Gender;

public class PersonRepositoryTest {

    private PersonRepository repository = new PersonRepository();

    @Test
    public void testInsert_shouldInsertPersonWithSuccessWhenPersonIsValid() {
        Person person = new Person();
        person.setName("Test Name");
        person.setAge(30);
        person.setGender(Gender.M);

        Person result = repository.insert(person);
        assertNotNull(result);
        assertEquals("Test Name", result.getName());
    }

    @Test
    public void testInsert_shouldThrowNullPointerExceptionWhenPersonIsNull() {
        assertThrows(NullPointerException.class, () -> repository.insert(null));
    }

    @Test
    public void testUpdate_shouldNotThrowExceptionWhenPersonIsValid() {
        Person person = new Person();
        person.setName("Test Name");
        person.setAge(30);
        person.setGender(Gender.M);

        assertDoesNotThrow(() -> repository.update(person));
    }

    @Test
    public void testUpdate_shouldThrowNullPointerExceptionWhenPersonIsNull() {
        assertThrows(NullPointerException.class, () -> repository.update(null));
    }

    @Test
    public void testDelete_shouldNotThrowExceptionWhenNameIsValid() {
        assertDoesNotThrow(() -> repository.delete("Test Name"));
    }

    @Test
    public void testDelete_shouldThrowNullPointerExceptionWhenNameIsNull() {
        assertThrows(NullPointerException.class, () -> repository.delete(null));
    }

    @Test
    public void testGet_shouldReturnNullWhenNameIsValid() { // Assuming get method is not fully implemented.
        assertNull(repository.get("Test Name"));
    }

    @Test
    public void testGet_shouldThrowNullPointerExceptionWhenNameIsNull() {
        assertThrows(NullPointerException.class, () -> repository.get(null));
    }
}
