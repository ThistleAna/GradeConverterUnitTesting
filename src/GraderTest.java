import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GraderTest {
    @Test
    void fiftyNineReturnF() {
        var grader = new Grader(); // new object called grader
        assertEquals('F', grader.graderConverter(59));
    }

    @Test
    void sixtyNineReturnD() {
        var grader = new Grader(); // new object called grader
        assertEquals('D', grader.graderConverter(69));
    }

    // Theo - C
    @Test
    void seventyThreeReturnC() {
        var grader = new Grader();
        assertEquals('C', grader.graderConverter(73));
    }

    // Simko - B
    @Test
    void eightyNineReturnB() {
        var grader = new Grader();
        assertEquals('B', grader.graderConverter(89));
    }

    // Tatiana - A
    void ninetyOneReturnA(){
        var grader = new Grader(); // new object called grader
        assertEquals('A', grader.graderConverter(91));
    }

    // Phil - A
}


