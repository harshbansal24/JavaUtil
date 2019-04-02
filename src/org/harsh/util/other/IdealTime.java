/**
 * 
 */
package org.harsh.util.other;

import java.awt.MouseInfo;
import java.awt.Point;

/**
 * @author Harsh Bansal
 * 
 */
public class IdealTime {

	public IdealTime() {
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		long idleTime = 0;
		long interval = 1;
		long start = System.currentTimeMillis();
		Point currLocation = MouseInfo.getPointerInfo().getLocation();
		while (true) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			Point newLocation = MouseInfo.getPointerInfo().getLocation();
			if (newLocation.equals(currLocation)) {
				// not moved
				idleTime = System.currentTimeMillis() - start;
			} else {
				if (idleTime > interval * 1000) {
					System.out.printf("Where were you for: %s seconds"
							,(idleTime/1000));
				}
				idleTime = 0;
				start = System.currentTimeMillis();
				break;
			}
			currLocation = newLocation;
		}
	}
}