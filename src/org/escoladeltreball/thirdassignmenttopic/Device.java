/**
 * 
 */
package org.escoladeltreball.thirdassignmenttopic;

/**
 * @author iaw46994355
 *
 */
public interface Device extends Cloneable { // o bé extends a l'interface of implements a l'implementació
	
	/**
	 * Turns device on
	 */
	public abstract void turnOn();
	
	/**
	 * Turns device off
	 */
	public abstract void turnOff();
	
	/**
	 * 
	 */
	public abstract int overClock() throws Exception;

}
