package org.example;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@EqualsAndHashCode
@Getter
@Setter
public class Department {
    private String  departmentId;  // 2-digits starts with a character D
    private String departmentName;
    private static int nextId; // indicates the next ID that will be used

    public Department(String departmentId, String departmentName) {
        if (validateDepartmentName(departmentName)) {
            this.departmentId = departmentId;
            this.departmentName = departmentName;
        }
    }

    /**
     * Returns true if the name only contains alphabetic characters and spaces, else false
     * @param departmentName
     * @return true if the name only contains alphabetic characters and spaces, else false
     */
    public boolean validateDepartmentName(String departmentName) {
        for (char c : departmentName.toCharArray()) {
            if (!Character.isAlphabetic(c) && c != ' ') {
                return false;
            }
        }
        return true;
    }
}
