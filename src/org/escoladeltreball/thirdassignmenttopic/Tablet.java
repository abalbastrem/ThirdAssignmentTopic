/**
 * 
 */
package org.escoladeltreball.thirdassignmenttopic;

/**
 * @author iaw46994355
 *
 */
public class Tablet extends DeviceImpl {

	/**
	 * @param marca
	 * @param model
	 * @param speed
	 */
	public Tablet(String marca, String model, int speed) {
		super(marca, model, speed);
	}
	
	/* (non-Javadoc)
	 * @see org.escoladeltreball.thirdassignmenttopic.Device#turnOff()
	 */
	@Override
	public void turnOff() {
		// TODO Auto-generated method stub

	}
	
	/* (non-Javadoc)
	 * @see org.escoladeltreball.thirdassignmenttopic.Device#overClock()
	 */
	@Override
	public int overClock() throws Exception {
		return (int) (speed * 1.5);
	}

}
