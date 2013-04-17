package org.joyofcoding.objectcalisthenics;

import java.util.ArrayList;
import java.util.List;

public class CopyOfGildedRose {

	public ListItem makeItems() {
		
		ListItem listItem = new ListItem();
		
		listItem.add(new Item("+5 Dexterity Vest", 10, 20));
//		listItem.add(new Item("Aged Brie", 2, 0));
//		listItem.add(new Item("Elixir of the Mongoose", 5, 7));
//		listItem.add(new Item("Sulfuras, Hand of Ragnaros", 0, 80));
//		listItem.add(new Item("Backstage passes to a TAFKAL80ETC concert", 15,
//				20));
//		listItem.add(new Item("Conjured Mana Cake", 3, 6));

		
		return listItem;
	}

	public void updateQuality(List<Item> items) {

		Item itemTemp;
		for (int i = 0; i < items.size(); i++) {
			
			itemTemp = items.get(i);
			
			
			if (!itemTemp.isNamed("Aged Brie")
										&& !itemTemp
							.isNamed("Backstage passes to a TAFKAL80ETC concert")) {
				
				System.out.println("--------ni bri ni back");
				if (itemTemp.hasQualityUpTo(0)) {
					if (!itemTemp.isNamed("Sulfuras, Hand of Ragnaros")) {
						itemTemp.decreaseQuality();
					}
				}
			} else {
				if (itemTemp.hasQualityUnder(50)) {
					itemTemp.incQuality();

					if (itemTemp
							.isNamed("Backstage passes to a TAFKAL80ETC concert")) {
						if (itemTemp.hasSellInunder(11)) {
							if (itemTemp.hasQualityUnder(50)) {
								itemTemp.incQuality();
							}
						}

						if (itemTemp.hasSellInunder(6)) {
							if (itemTemp.hasQualityUnder(50)) {
								itemTemp.incQuality();
							}
						}
					}
				}
			}

			if (!itemTemp.isNamed("Sulfuras, Hand of Ragnaros")) {
				itemTemp.decreaseSellIn();
			}

			if (itemTemp.hasSellInunder(0)) {
				if (!itemTemp.isNamed("Aged Brie")) {
					if (!itemTemp
							.isNamed("Backstage passes to a TAFKAL80ETC concert")) {
						if (itemTemp.hasQualityUpTo(0)) {
							if (!itemTemp.isNamed("Sulfuras, Hand of Ragnaros")) {
								itemTemp.decreaseQuality();
							}
						}
					} else {
						itemTemp.resetQuality();
					}
				} else {
					if (itemTemp.hasQualityUnder(50)) {
						itemTemp.incQuality();
					}
				}
			}
		}
	}

}
