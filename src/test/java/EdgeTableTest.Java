import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class EdgeTableTest {

    private EdgeTable edgeTable;

    @Before
    public void setUp() {
        // Inisialisasi objek EdgeTable jika diperlukan
        edgeTable = new EdgeTable("1|TableName");
        edgeTable.addRelatedTable(2);
        edgeTable.addNativeField(3);
        edgeTable.addNativeField(4);
        edgeTable.makeArrays();
    }

    @Test
    public void testGetterAndSetter() {
        // Periksa getter sesuai dengan nilai yang di-set
        assertEquals(1, edgeTable.getNumFigure());
        assertEquals("TableName", edgeTable.getName());
    }

    @Test
    public void testAddRelatedTable() {
        // Periksa apakah metode addRelatedTable bekerja dengan baik
        int[] relatedTablesArray = edgeTable.getRelatedTablesArray();
        assertEquals(2, relatedTablesArray[0]);
    }

    @Test
    public void testAddNativeField() {
        // Periksa apakah metode addNativeField bekerja dengan baik
        int[] nativeFieldsArray = edgeTable.getNativeFieldsArray();
        assertEquals(3, nativeFieldsArray[0]);
        assertEquals(4, nativeFieldsArray[1]);
    }

    @Test
    public void testMoveFieldUp() {
        // Periksa apakah metode moveFieldUp bekerja dengan baik
        edgeTable.moveFieldUp(1);
        int[] nativeFieldsArray = edgeTable.getNativeFieldsArray();
        assertEquals(4, nativeFieldsArray[0]);
        assertEquals(3, nativeFieldsArray[1]);
    }

    @Test
    public void testMoveFieldDown() {
        // Periksa apakah metode moveFieldDown bekerja dengan baik
        edgeTable.moveFieldDown(0);
        int[] nativeFieldsArray = edgeTable.getNativeFieldsArray();
        assertEquals(4, nativeFieldsArray[0]);
        assertEquals(3, nativeFieldsArray[1]);
    }

    // Tambahkan metode uji lainnya sesuai kebutuhan
}
