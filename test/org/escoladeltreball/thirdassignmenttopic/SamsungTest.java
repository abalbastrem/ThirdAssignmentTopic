/**
 * 
 */
package org.escoladeltreball.thirdassignmenttopic;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * @author iaw46994355
 *
 */
public class SamsungTest {
	
	Samsung samsung;

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		samsung = new Samsung("Samsung","Galaxy S7",400);
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
		samsung = null;
	}

	/**
	 * Test method for {@link org.escoladeltreball.thirdassignmenttopic.Samsung#overClock()}.
	 */
	@Test
	public void testOverClock() throws Exception {
		assertEquals(600.00, samsung.overClock(), 1.0e-4);
	}

}
