import static org.junit.jupiter.api.Assertions.*;

class StudentGradeTest {

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {
    }
    @Test
    void constructorTest(){
        StudentGrade  theScores = new StudentGrade(String name, String lName);
        assertNotNull(new StudentGrade("john", "james"))
    }
}