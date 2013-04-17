package org.joyofcoding.objectcalisthenics;

import org.mockito.stubbing.answers.ReturnsElementsOf;

public class Item {
	
	private String name;
	private int sellIn;
	private int quality;

	public Item(String name, int sellIn, int quality) {
		this.name = name;
		this.quality = quality;
		this.sellIn = sellIn;
	}

	public boolean isNamed(String itemName){	
		return name.equals(itemName);		
	}
	
	public boolean hasQualityUpTo(int value ){
		return (quality > value);
	}
	
	public boolean hasQualityUnder(int value){
		return (quality < value);
	}
	
	public void decreaseQuality(){
		quality--;
	}	
	public void incQuality(){
		quality++;
	}
	public boolean hasSellInunder(int value){
		return sellIn < value;
	}
	public void decreaseSellIn(){
		sellIn--;
	}
	public void resetQuality(){
		quality=0;
	}
	
	/*
	 * Accesseur
	 */
	
	 public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public int getSellIn() {
			return sellIn;
		}

		public void setSellIn(int sellIn) {
			this.sellIn = sellIn;
		}

		public int getQuality() {
			return quality;
		}

		public void setQuality(int quality) {
			this.quality = quality;
		}
}
