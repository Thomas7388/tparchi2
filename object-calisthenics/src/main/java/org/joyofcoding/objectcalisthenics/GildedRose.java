package org.joyofcoding.objectcalisthenics;

import java.util.ArrayList;
import java.util.List;

public class GildedRose {
	public static void main(String[] args) {
		GildedRose gildedRose = new GildedRose();
		gildedRose.updateQuality(gildedRose.makeItems());
	}

	public ListItem makeItems() {
		ListItem items = new ListItem();
		items.add(new Item("+5 Dexterity Vest", 10, 20));
		items.add(new Item("Aged Brie", 2, 0));
		items.add(new Item("Elixir of the Mongoose", 5, 7));
		items.add(new Item("Sulfuras, Hand of Ragnaros", 0, 80));
		items.add(new Item("Backstage passes to a TAFKAL80ETC concert", 15, 20));
		items.add(new Item("Conjured Mana Cake", 3, 6));
		return items;
	}

	public void updateQuality(ListItem items) {
		Item itemTemp;
		for (int i = 0; i < items.size(); i++) {

			itemTemp = items.get(i);
			if (!itemTemp.isNamed("Aged Brie")
					&& !itemTemp
							.isNamed("Backstage passes to a TAFKAL80ETC concert")) {
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
