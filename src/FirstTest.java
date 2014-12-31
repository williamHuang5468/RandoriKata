import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class FirstTest {
    ISBN isbn;
    @Before
    public void setUp() throws Exception {
	isbn = new ISBN();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void test() {
	assertTrue(isbn.isISBN());
    }

}
