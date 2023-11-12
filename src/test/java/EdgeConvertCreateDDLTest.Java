import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

public class EdgeConvertCreateDDLTest {

    private EdgeConvertCreateDDL edgeConvertCreateDDL;

    @Before
    public void setUp() {

        edgeConvertCreateDDL = new EdgeConvertCreateDDL();
    }

    @Test
    public void testGenerateDDL() {

        String expectedDDL = "CREATE TABLE example (id INT PRIMARY KEY, name VARCHAR(255));";
        String generatedDDL = edgeConvertCreateDDL.generateDDL("example");

        assertEquals(expectedDDL, generatedDDL);
    }

}
