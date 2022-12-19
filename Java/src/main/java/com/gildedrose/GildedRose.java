package com.gildedrose;

class GildedRose {
    Item[] items;
    public static final String CONCERT ="Backstage passes to a TAFKAL80ETC concert";
    public static final String SULFURAS = "Sulfuras, Hand of Ragnaros";
    public static final String BRIE = "Aged Brie";
    public GildedRose(Item[] items) {
        this.items = items;
    }

    /**
     * 
     */
    public void updateQuality() {
        for (int i = 0; i < items.length; i++) {
            if (!items[i].name.equals(BRIE)&& !items[i].name.equals(CONCERT)&&items[i].quality > 0 &&!items[i].name.equals(SULFURAS)) {
                
                    items[i].quality = items[i].quality - 1;
                
                }else if (items[i].quality < 50&&items[i].name.equals(CONCERT)&& items[i].sellIn < 11) {
                    items[i].quality = items[i].quality + 2;
                           
                        if (items[i].sellIn < 6 &&items[i].quality < 50) {
                            items[i].quality = items[i].quality + 1;
                            
                        }
                    
                }else if (!items[i].name.equals(SULFURAS)) {
                items[i].sellIn = items[i].sellIn - 1;
                }else if (items[i].sellIn < 0&&!items[i].name.equals(BRIE)
                    &&!items[i].name.equals(CONCERT)&&items[i].quality > 0 &&!items[i].name.equals(SULFURAS)) {
                            items[i].quality = items[i].quality - 1;
                } else if (items[i].quality < 50) {
                        items[i].quality = items[i].quality + 1;
                }else {
                    items[i].quality = 0;
                }
            }
        
    }
}