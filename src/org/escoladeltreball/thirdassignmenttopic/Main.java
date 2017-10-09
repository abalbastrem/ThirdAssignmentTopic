/**
 * 
 */
package org.escoladeltreball.thirdassignmenttopic;

/**
 * @author iaw46994355
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {
		MacBookAir mac = new MacBookAir("Apple", "Air Turbo", 456);
		
		MacBookAir macClone = (MacBookAir) mac.clone();
		
		System.out.println(mac.equals(macClone)); // TRUE
		System.out.println(mac == macClone); // FALSE perquè la direcció de memòria serà diferent
	}

}
