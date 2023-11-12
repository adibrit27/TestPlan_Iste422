import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

public class CreateDDLMySQLTest {

    private CreateDDLMySQL createDDLMySQL;

    @Before
    public void setUp() {
        createDDLMySQL = new CreateDDLMySQL();
    }

    @Test
    public void testGenerateDDL() {
        String expectedDDL = "CREATE TABLE example (id INT PRIMARY KEY, name VARCHAR(255));";
        String generatedDDL = createDDLMySQL.generateDDL("example");

        assertEquals(expectedDDL, generatedDDL);
    }

}
