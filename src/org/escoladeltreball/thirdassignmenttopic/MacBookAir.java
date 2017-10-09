/**
 * 
 */
package org.escoladeltreball.thirdassignmenttopic;

/**
 * @author iaw46994355
 *
 */
public final class MacBookAir extends Laptop {

	/**
	 * @param marca
	 * @param model
	 * @param speed
	 */
	public MacBookAir(String marca, String model, int speed) {
		super(marca, model, speed, LaptopType.ULTRALIGHT);
	}
	
	/**
	 * @param marca
	 * @param model
	 */
	public MacBookAir(String marca, String model) {
		this(marca, model, 367); // Crido el constructor de la pròpia classe
	}
	
	/*
	 * 
	 */
	@Override
	public void turnOff() {
		System.out.println("closing mac smoothly");
	}

}
