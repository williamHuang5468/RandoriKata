package Anagrams;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class AnagramsTest {
    Anagrams anagrams;
    @Before
    public void setUp() throws Exception {
	anagrams = new Anagrams("bi");
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void getWord(){
	String expect = "bi";
	String real = anagrams.getWord();
	assertEquals(expect, real);
    }
}
