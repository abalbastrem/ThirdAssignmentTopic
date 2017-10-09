/**
 * 
 */
package org.escoladeltreball.thirdassignmenttopic;

/**
 * @author iaw46994355
 *
 */
public final class Samsung extends Tablet {

	/**
	 * @param marca
	 * @param model
	 * @param speed
	 */
	public Samsung(String marca, String model, int speed) {
		super(marca, model, speed);
		// TODO Auto-generated constructor stub
	}
	
	/* (non-Javadoc)
	 * @see org.escoladeltreball.thirdassignmenttopic.Device#turnOff()
	 */
	@Override
	public void turnOff() {
		System.out.println("Samsung et diu adéu");

	}
	
	/* (non-Javadoc)
	 * @see org.escoladeltreball.thirdassignmenttopic.Device#overClock()
	 */
	@Override
	public int overClock() throws Exception {
		return (int) (speed * 1.5);
	}

}
