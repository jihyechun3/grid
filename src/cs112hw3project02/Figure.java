/* Figure.java - 
 * 
 * Author : JiHye Chun
 * Module : Module3
 * Project : Chapter8/project #5
 * Problem Statement : 
 * 
 * Algorithm : 
 * 1. Create an abstract class named
 *    'Figure'.
 * 2. Create abstract methods for 
 *    figure class.
 *    - draw 
 *    - erase
 *    - center
 *    - equals
 *    - toString
 */

package cs112hw3project02;

// Create abstract methods 
public abstract class Figure 
{
	public abstract void draw();
	public abstract void erase();
	public abstract void center();
	public abstract boolean equals();
	public abstract String toString();
}
