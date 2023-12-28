package com.turing.advancedse4.refactoring.kata;

import org.junit.jupiter.api.Test;

import com.turing.advancedse4.refactoring.kata.gliderose.GildedRose;
import com.turing.advancedse4.refactoring.kata.gliderose.Item;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static com.turing.advancedse4.refactoring.kata.gliderose.GildedRose.*;
class GildedRoseTest {

	
    @Test
    void testSimpleItem() {
        Item[] items = new Item[] { 
        		new Item("+5 Dexterity Vest", 10, 20),
        		new Item("Elixir of the Mongoose", 5, 7),
        		new Item("Conjured Mana Cake", 3, 6)};
        GildedRose app = new GildedRose(items);
        app.update();
        assertEquals(9, app.items[0].sellIn);
        assertEquals(19, app.items[0].quality);
        
        assertEquals(4, app.items[1].sellIn);
        assertEquals(6, app.items[1].quality);
        
        assertEquals(2, app.items[2].sellIn);
        assertEquals(5, app.items[2].quality);
    }

    @Test
    void testSulfurasItem() {
        Item[] items = new Item[] { 
        		  new Item("Sulfuras, Hand of Ragnaros", 0, 80), //
                  new Item("Sulfuras, Hand of Ragnaros", -1, 80),};
        GildedRose app = new GildedRose(items);
        app.update();
        assertEquals(0, app.items[0].sellIn);
        assertEquals(80, app.items[0].quality);
        
        assertEquals(-1, app.items[1].sellIn);
        assertEquals(80, app.items[1].quality);
    }
    @Test
    void testBackstageItem() {
        Item[] items = new Item[] { 
        		   new Item("Backstage passes to a TAFKAL80ETC concert", 15, 20),
                   new Item("Backstage passes to a TAFKAL80ETC concert", 10, 49),
                   new Item("Backstage passes to a TAFKAL80ETC concert", 5, 49),};
        GildedRose app = new GildedRose(items);
        app.update();
      
        assertEquals(14, app.items[0].sellIn);
        assertEquals(21, app.items[0].quality);
        
        assertEquals(9, app.items[1].sellIn);
        assertEquals(50, app.items[1].quality);
        
        assertEquals(4, app.items[2].sellIn);
        assertEquals(50, app.items[2].quality);
    }
    
    @Test
    void testAgeBrie() {
        Item[] items = new Item[] { 
        		   new Item(AGED_BRIE, 15, 20),
                 };
        GildedRose app = new GildedRose(items);
        app.update();
      
        assertEquals(14, app.items[0].sellIn);
        assertEquals(21, app.items[0].quality);
        
       
    }
}