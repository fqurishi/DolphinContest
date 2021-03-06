
package myGameEngine;

import net.java.games.input.Event;
import ray.input.action.AbstractInputAction;
import ray.rage.scene.*;
import ray.rml.*;

public class RotateDolphinUp extends AbstractInputAction {

	private Node avN;
	public RotateDolphinUp(Node n)
	{
		avN = n;
	}
	
	public void performAction(float time, Event event) {
		avN.pitch(Degreef.createFrom(1.5f));
	}
}