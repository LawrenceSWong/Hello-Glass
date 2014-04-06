/*
 * Magic.java
 * @author Cody Engel
 * 
 */
package com.codyengel.helloglass;

import com.google.android.glass.app.Card;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;

public class Magic extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		/*
		 * 
		 */
		Card card1 = new Card(this);
		card1.setText("Hello, Glass Workshop!"); // Main text area
		card1.setFootnote("..welcome to a16z"); // Footer
		View card1View = card1.toView();
		
		// Display the card we just created
		setContentView(card1View);
	}

}
