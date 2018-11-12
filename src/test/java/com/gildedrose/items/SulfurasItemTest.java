package com.gildedrose.items;

import com.gildedrose.items.AbstractItemWrapper;
import com.gildedrose.items.SulfurasItem;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SulfurasItemTest {

    @Test
    public void should_keep_sellIn_and_quality_when_update_quality() {
        AbstractItemWrapper sulfuras = new SulfurasItem("Sulfuras, Hand of Ragnaros", 0, 80);

        sulfuras.updateQuality();

        assertThat(sulfuras).isEqualTo(new SulfurasItem("Sulfuras, Hand of Ragnaros", 0, 80));
    }
}
