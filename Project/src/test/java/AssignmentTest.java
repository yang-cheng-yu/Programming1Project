import org.example.Assignment;
import org.junit.jupiter.api.Assertions;

import java.util.ArrayList;
import java.util.Arrays;

public class AssignmentTest {
    public void testCalcAssignmentAvg1() {
        Assignment assignment = new Assignment("a", 0.1, 10);
        assignment.setScores(new ArrayList<>(Arrays.asList(80, 78, 54, 72)));

        assignment.calcAssignmentAvg();

        double expected = 71;
        double result = assignment.getAssignmentAverage();

        Assertions.assertEquals(expected, result);
    }

    public void testCalcAssignmentAvg2() {
        Assignment assignment = new Assignment("a", 0.1, 10);
        assignment.setScores(new ArrayList<>(Arrays.asList(0, 0, 0, 0)));

        assignment.calcAssignmentAvg();

        double expected = 0;
        double result = assignment.getAssignmentAverage();

        Assertions.assertEquals(expected, result);
    }

    public void testCalcAssignmentAvg3() {
        Assignment assignment = new Assignment("a", 0.1, 10);
        assignment.setScores(new ArrayList<>(Arrays.asList(70)));

        assignment.calcAssignmentAvg();

        double expected = 70;
        double result = assignment.getAssignmentAverage();

        Assertions.assertEquals(expected, result);
    }

    public void testCalcAssignmentAvg4() {
        Assignment assignment = new Assignment("a", 0.1, 10);
        assignment.setScores(new ArrayList<>(Arrays.asList(60, 90, 54)));

        assignment.calcAssignmentAvg();

        double expected = 68;
        double result = assignment.getAssignmentAverage();

        Assertions.assertEquals(expected, result);
    }
}
