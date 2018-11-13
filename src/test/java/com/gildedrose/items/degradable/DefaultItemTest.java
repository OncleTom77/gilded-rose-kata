package com.gildedrose.items.degradable;

import com.gildedrose.items.AbstractItemWrapper;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class DefaultItemTest {

    @Test
    public void should_decrease_quality_and_sellIn_once() {
        AbstractItemWrapper defaultItem = DefaultItem.of("Default item", 20, 20);

        defaultItem.updateQuality();

        assertThat(defaultItem).isEqualTo(DefaultItem.of("Default item", 19, 19));
    }

    @Test
    public void should_decrease_quality_twice_and_sellIn_once_when_sellIn_is_negative() {
        AbstractItemWrapper defaultItem = DefaultItem.of("Default item", 0, 20);

        defaultItem.updateQuality();

        assertThat(defaultItem).isEqualTo(DefaultItem.of("Default item", -1, 18));
    }
}
