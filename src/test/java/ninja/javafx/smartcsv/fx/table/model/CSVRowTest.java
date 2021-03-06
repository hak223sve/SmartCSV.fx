package ninja.javafx.smartcsv.fx.table.model;

import ninja.javafx.smartcsv.validation.Validator;
import org.hamcrest.Matchers;
import org.junit.Test;

import static org.hamcrest.Matchers.hasKey;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;

/**
 * unit test for row class
 */
public class CSVRowTest {

    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    // constants
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    static final String COLUMN = "COLUMN";
    static final String VALUE = "VALUE";

    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    // subject under test
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    CSVRow sut = new CSVRow();


    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    // tests
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    @Test
    public void adds_column_and_value_to_row() {
        // execution
        sut.addValue(COLUMN, VALUE);

        // assertion
        assertThat(sut.getColumns(), hasKey(COLUMN));
        assertThat(sut.getColumns().get(COLUMN).get().getValue(), is(VALUE));
    }


}