/**
 * 
 */
package org.escoladeltreball.thirdassignmenttopic;

/**
 * @author iaw46994355
 *
 */
public final class WindowsBasedLaptop extends Laptop {

	/**
	 * @param marca
	 * @param model
	 * @param speed
	 */
	public WindowsBasedLaptop(String marca, String model, int speed) {
		super(marca, model, speed, LaptopType.HEAVY);
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * @param marca
	 * @param model
	 */
	public WindowsBasedLaptop(String marca, String model) {
		super(marca, model, 399, LaptopType.HEAVY);
	}
	
	/* (non-Javadoc)
	 * @see org.escoladeltreball.thirdassignmenttopic.Device#turnOff()
	 */
	@Override
	public void turnOff() {
		System.out.println("Windows s'està tancant");

	}

}
