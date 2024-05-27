import org.junit.jupiter.api.Assertions;
import org.example.Address;

public class AddressTest {
    public void testIsPostalCodeValid1() {
        String postalCode = "c3c3c3";
        boolean expected = true;
        boolean result = Address.isPostalCodeValid(postalCode);

        Assertions.assertEquals(expected, result);
    }
    public void testIsPostalCodeValid2() {
        String postalCode = "c3c 3c3";
        boolean expected = true;
        boolean result = Address.isPostalCodeValid(postalCode);

        Assertions.assertEquals(expected, result);
    }
    public void testIsPostalCodeValid3() {
        String postalCode = "c3c-3c3";
        boolean expected = false;
        boolean result = Address.isPostalCodeValid(postalCode);

        Assertions.assertEquals(expected, result);
    }
    public void testIsPostalCodeValid4() {
        String postalCode = "3c3c3c";
        boolean expected = false;
        boolean result = Address.isPostalCodeValid(postalCode);

        Assertions.assertEquals(expected, result);
    }
    public void testIsPostalCodeValid5() {
        String postalCode = "";
        boolean expected = false;
        boolean result = Address.isPostalCodeValid(postalCode);

        Assertions.assertEquals(expected, result);
    }
    public void testIsPostalCodeValid6() {
        String postalCode = null;
        boolean expected = false;
        boolean result = Address.isPostalCodeValid(postalCode);

        Assertions.assertEquals(expected, result);
    }
}
