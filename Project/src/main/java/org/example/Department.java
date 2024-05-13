package org.example;

import lombok.Data;

@Data
public class Department {
    private String  departmentId;  // 2-digits starts with a character D
    private String departmentName;
    private static int nextId; // indicates the next ID that will be used

    /**
     * Returns true if the name only contains alphabetic characters and U+0020, else false
     * @param departmentName
     * @return true if the name only contains alphabetic characters and U+0020, else false
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
