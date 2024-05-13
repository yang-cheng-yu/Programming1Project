package org.example;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@EqualsAndHashCode
@Getter
@Setter
public class Address {
    private int streetNo;
    private String street;
    private String city;
    private String province;
    private String postalCode;
    private String country;

    public Address(int streetNo, String street, String city, String province, String postalCode, String country) {
        if (isPostalCodeValid(postalCode)) {
            this.streetNo = streetNo;
            this.street = street;
            this.city = city;
            this.province = province;
            this.postalCode = postalCode;
            this.country = country;
        }
    }

    /**
     * Returns true if postal code is correct format (CDCDCD or CDC DCD)
     * @param postalCode
     * @returntrue if postal code is correct format
     */
    private static boolean isPostalCodeValid(String postalCode) {
        boolean out = true;
        switch (postalCode.length()) {
            case 6 -> {
                for (int i = 0; i < 6; i++) {
                    char c = postalCode.charAt(i);
                    out = (i % 2 == 0) ? out && Character.isAlphabetic(c) : out && Character.isDigit(c);
                }
            }
            case 7 -> {
                for (int i = 0; i < 7; i++) {
                    char c = postalCode.charAt(i);
                    out = switch (i) {
                        case 0, 2, 5 -> out && Character.isAlphabetic(c);
                        default -> out && Character.isDigit(c);
                    };
                }
            }
            default -> throw new RuntimeException("Postal Code has wrong number of characters");
        }
        return out;
    }
}
