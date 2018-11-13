package com.gildedrose.items.legendary;

import com.gildedrose.items.AbstractItemWrapper;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SulfurasItemTest {

    @Test
    public void should_keep_sellIn_and_quality_when_update_quality() {
        AbstractItemWrapper sulfuras = SulfurasItem.of(0);

        sulfuras.updateQuality();

        assertThat(sulfuras).isEqualTo(SulfurasItem.of(0));
    }
}
