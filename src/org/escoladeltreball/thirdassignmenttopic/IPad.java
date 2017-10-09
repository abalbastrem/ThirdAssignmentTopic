/**
 * 
 */
package org.escoladeltreball.thirdassignmenttopic;

/**
 * @author iaw46994355
 *
 */
public final class IPad extends Tablet {

	/**
	 * @param marca
	 * @param model
	 * @param speed
	 */
	public IPad(String marca, String model, int speed) {
		super(marca, model, speed);
	}
	
	/* (non-Javadoc)
	 * @see org.escoladeltreball.thirdassignmenttopic.Device#turnOff()
	 */
	@Override
	public void turnOff() {
		System.out.println("Apple és el teu amo encara que l'apaguis");

	}
	
	/* (non-Javadoc)
	 * @see org.escoladeltreball.thirdassignmenttopic.Device#overClock()
	 */
	@Override
	public int overClock() throws Exception {
		return (int) (speed * 1.5);
	}

}
