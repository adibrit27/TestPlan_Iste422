import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class EdgeFieldTest {

    private EdgeField edgeField;  // Fix: Added type declaration

    @Before
    public void setUp() {
        // Inisialisasi objek EdgeField jika diperlukan
        edgeField = new EdgeField("1|FieldName");
    }

    @Test
    public void testGetterAndSetter() {
        // Set nilai untuk diuji
        edgeField.setTableID(1);
        edgeField.setTableBound(2);
        edgeField.setFieldBound(3);
        edgeField.setDisallowNull(true);
        edgeField.setIsPrimaryKey(true);
        edgeField.setDefaultValue("DefaultValue");
        edgeField.setVarcharValue(255);
        edgeField.setDataType(1);

        // Periksa getter sesuai dengan nilai yang di-set
        assertEquals(1, edgeField.getNumFigure());
        assertEquals("FieldName", edgeField.getName());
        assertEquals(1, edgeField.getTableID());
        assertEquals(2, edgeField.getTableBound());
        assertEquals(3, edgeField.getFieldBound());
        assertTrue(edgeField.getDisallowNull());
        assertTrue(edgeField.getIsPrimaryKey());
        assertEquals("DefaultValue", edgeField.getDefaultValue());
        assertEquals(255, edgeField.getVarcharValue());
        assertEquals(1, edgeField.getDataType());
    }

    @Test
    public void testToString() {
        // Periksa apakah metode toString menghasilkan output yang benar
        assertEquals("1|FieldName|1|2|3|1|255|true|true|DefaultValue", edgeField.toString());
    }

    // Tambahkan metode uji lainnya sesuai kebutuhan
}
