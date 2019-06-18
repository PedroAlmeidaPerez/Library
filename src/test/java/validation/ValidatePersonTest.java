package validation;

import org.junit.Assert;
import org.junit.Test;

public class ValidatePersonTest {

    @Test
    public void testValidateName() {
        ValidatePerson validatePerson = new ValidatePerson();
        boolean result = validatePerson.ValidateName("pedro");
        Assert.assertEquals(true, result);
    }

    @Test
    public void testValidateNameWithNumber() {
        ValidatePerson validatePerson = new ValidatePerson();
        boolean result = validatePerson.ValidateName("pedro2");
        Assert.assertEquals(true, result);
    }
}
