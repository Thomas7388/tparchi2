package org.joyofcoding.objectcalisthenics;



public class MainGildedRose {

	 public static void main(String[] args) {
			GildedRose gildedRose = new GildedRose();
			
			ListItem listItem = gildedRose.makeItems();
	        gildedRose.updateQuality(listItem);
		}
}
