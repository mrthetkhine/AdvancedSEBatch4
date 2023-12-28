package com.turing.advancedse4.refactoring.kata.gliderose;

public class GildedRose {
	public static final int MAX_QTY = 50;
	public static final String SULFURAS_HAND_OF_RAGNAROS = "Sulfuras, Hand of Ragnaros";
	public static final String BACKSTAGE_PASSES_TO_A_TAFKAL80ETC_CONCERT = "Backstage passes to a TAFKAL80ETC concert";
	public static final String AGED_BRIE = "Aged Brie";
	public static final int MIN_QTY = 0;
	public Item[] items;

	public GildedRose(Item[] items) {
		this.items = itemFactory(items);
	}

	public void update() {
		for (Item item: items) {
			item.update();
		}
	}
	Item[] itemFactory(Item[]items)
	{
		Item result [] =new Item[items.length];
		for(int i=0;i< items.length;i++)
		{
			Item it= items[i];
			
			if(it.name.equals(AGED_BRIE))
			{
				result[i] = new AgeBrieItem(it);
			}
			else if(it.name.equals(BACKSTAGE_PASSES_TO_A_TAFKAL80ETC_CONCERT))
			{
				result[i] = new BackStageItem(it);
			}
			else if(it.name.equals(SULFURAS_HAND_OF_RAGNAROS))
			{
				result[i] = new SulfurasItem(it);
			}
			else
			{
				result[i] = it;
			}
			//result[i] = it;
		}
		return result;
	}

	
	
}
