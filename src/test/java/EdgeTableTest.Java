import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class EdgeTableTest {

    private EdgeTable edgeTable;

    @Before
    public void setUp() {
        edgeTable = new EdgeTable("1|TableName");
        edgeTable.addRelatedTable(2);
        edgeTable.addNativeField(3);
        edgeTable.addNativeField(4);
        edgeTable.makeArrays();
    }

    @Test
    public void testGetterAndSetter() {
        assertEquals(1, edgeTable.getNumFigure());
        assertEquals("TableName", edgeTable.getName());
    }

    @Test
    public void testAddRelatedTable() {
        int[] relatedTablesArray = edgeTable.getRelatedTablesArray();
        assertEquals(2, relatedTablesArray[0]);
    }

    @Test
    public void testAddNativeField() {
        int[] nativeFieldsArray = edgeTable.getNativeFieldsArray();
        assertEquals(3, nativeFieldsArray[0]);
        assertEquals(4, nativeFieldsArray[1]);
    }

    @Test
    public void testMoveFieldUp() {
        edgeTable.moveFieldUp(1);
        int[] nativeFieldsArray = edgeTable.getNativeFieldsArray();
        assertEquals(4, nativeFieldsArray[0]);
        assertEquals(3, nativeFieldsArray[1]);
    }

    @Test
    public void testMoveFieldDown() {
        edgeTable.moveFieldDown(0);
        int[] nativeFieldsArray = edgeTable.getNativeFieldsArray();
        assertEquals(4, nativeFieldsArray[0]);
        assertEquals(3, nativeFieldsArray[1]);
    }
}
