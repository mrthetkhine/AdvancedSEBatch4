package com.turing.advancedse4.refactoring.kata.gliderose;

public class GildedRose {
	private static final int MAX_QTY = 50;
	public static final String SULFURAS_HAND_OF_RAGNAROS = "Sulfuras, Hand of Ragnaros";
	public static final String BACKSTAGE_PASSES_TO_A_TAFKAL80ETC_CONCERT = "Backstage passes to a TAFKAL80ETC concert";
	public static final String AGED_BRIE = "Aged Brie";
	public static final int MIN_QTY = 0;
	public Item[] items;

	public GildedRose(Item[] items) {
		this.items = items;
	}

	public void update() {
		for (Item item: items) {
			updateQuality(item);
			updateSellIn(item);
			updateQualityWhenSellInPass(item);
		}
	}

	private void updateSellIn(Item item) {
		//update sell-in
		if (!item.name.equals(SULFURAS_HAND_OF_RAGNAROS)) {
			item.sellIn = item.sellIn - 1;
		}
	}

	private void updateQualityWhenSellInPass(Item item) {
		if (item.sellIn < 0) {
			if (!item.name.equals(AGED_BRIE)) {
				if (!item.name.equals(BACKSTAGE_PASSES_TO_A_TAFKAL80ETC_CONCERT)) {
					if (item.quality > MIN_QTY) {
						if (!item.name.equals(SULFURAS_HAND_OF_RAGNAROS)) {
							item.quality = item.quality - 1;
						}
					}
				} else {
					item.quality = 0;
				}
			} else {
				if (item.quality < MAX_QTY) {
					item.quality = item.quality + 1;
				}
			}
		}
	}

	private void updateQuality(Item item) {
		if(	item.name.equals(AGED_BRIE) 
				|| item.name.equals(BACKSTAGE_PASSES_TO_A_TAFKAL80ETC_CONCERT))
		{
			if (item.quality < MAX_QTY) {
				item.quality = item.quality + 1;
				
		}//backstage additional requirements
		else if (item.name.equals(BACKSTAGE_PASSES_TO_A_TAFKAL80ETC_CONCERT)) {
				item.quality = item.quality + 1;
				if (item.sellIn < 11) {
					if (item.quality < MAX_QTY) {
						item.quality = item.quality + 1;
					}
				}

				if (item.sellIn < 6) {
					if (item.quality < MAX_QTY) {
						item.quality = item.quality + 1;
					}
				}
			}
		}
		else if (item.name.equals(SULFURAS_HAND_OF_RAGNAROS))
		{
			//do nothing
		}
		else
		{
			if (item.quality > MIN_QTY) {
				item.quality = item.quality - 1;
			
			}
		}
		
	}
}
