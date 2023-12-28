package com.turing.advancedse4.refactoring.kata.gliderose;

public class Item {
	public String name;
	public int sellIn;
	public int quality;

	public Item(String name, int sellIn, int quality) {
		this.name = name;
		this.sellIn = sellIn;
		this.quality = quality;
	}

	@Override
	public String toString() {
		return this.name + ", " + this.sellIn + ", " + this.quality;
	}
	
	void update()
	{
		updateQuality();
		updateSellIn();
		updateQualityWhenSellInPass();
	}
	void updateQuality() {
		if (this.quality > GildedRose.MIN_QTY) {
			this.quality = this.quality - 1;
		}
		
	}
	
	protected void safeIncQuality() {
		if (this.quality < GildedRose.MAX_QTY) {
			this.quality = this.quality + 1;
			
		}
	}
	void updateSellIn() {
		this.sellIn = this.sellIn - 1;
	}

	void updateQualityWhenSellInPass() {
		if (this.sellIn < 0) {
			if (this.quality > GildedRose.MIN_QTY)
			{
				this.quality = this.quality - 1;
			}		
			
		}
	}
}
class AgeBrieItem extends Item
{

	public AgeBrieItem(Item item)
	{
		super(item.name, item.sellIn, item.quality);
	}
	
	@Override
	public void updateQuality() {
		//System.out.println("updateQuality in AgeBrieItem");
		super.safeIncQuality();
	}
	
	@Override
	public void updateQualityWhenSellInPass()
	{
		if (this.sellIn < 0) {
			super.safeIncQuality();
		}
	}
}
class BackStageItem extends Item
{

	public BackStageItem(Item item)
	{
		super(item.name, item.sellIn, item.quality);
	}
	private void updateQtyForBackStageItem() {
		if (this.quality < GildedRose.MAX_QTY) {
			this.quality = this.quality + 1;		
		}
		//backstage additional requirements
		else if (this.name.equals(GildedRose.BACKSTAGE_PASSES_TO_A_TAFKAL80ETC_CONCERT)) {
			this.quality = this.quality + 1;
			if (this.sellIn < 11) {
				safeIncQuality();
			}

			if (this.sellIn < 6) {
				safeIncQuality();
			}
		}
	}
	@Override
	public void updateQuality() {
		
		this.updateQtyForBackStageItem();
	}
	
	@Override
	public void updateQualityWhenSellInPass()
	{
		if (this.sellIn < 0) {
			this.quality = 0;
		}
	}
}
class SulfurasItem extends Item
{

	public SulfurasItem(Item item)
	{
		super(item.name, item.sellIn, item.quality);
	}
	
	@Override
	public void updateQuality() {
		//Do noting
	}
	@Override
	public void updateSellIn()
	{
		//Do noting
	}
	@Override
	public void updateQualityWhenSellInPass()
	{
		
	}
}
