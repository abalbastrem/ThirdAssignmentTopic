/**
 * 
 */
package org.escoladeltreball.thirdassignmenttopic;

/**
 * @author iaw46994355
 *
 */
public abstract class Laptop extends DeviceImpl {
	
	private LaptopType type;
	
	/**
	 * @param marca
	 * @param model
	 * @param speed
	 */
	public Laptop(String marca, String model, int speed, LaptopType type) {
		super(marca, model, speed);
		this.type = type;
	}
	
	/* (non-Javadoc)
	 * @see org.escoladeltreball.thirdassignmenttopic.Device#turnOff()
	 */
	@Override
	public void turnOff() {
		// TODO Auto-generated method stub

	}

}
