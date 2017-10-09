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
public class IPadTest {
	
	IPad iPad;
	

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
		iPad = new IPad("Apple","iPad Pro",500);
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	/**
	 * Test method for {@link org.escoladeltreball.thirdassignmenttopic.iPad#overClock()}.
	 */
	@Test
	public void testOverClock() throws Exception {
		assertEquals(750.00, iPad.overClock(), 1.0e-4);
	}

}
