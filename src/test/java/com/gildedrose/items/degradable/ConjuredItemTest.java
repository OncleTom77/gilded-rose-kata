package com.gildedrose.items.degradable;

import com.gildedrose.items.AbstractItemWrapper;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ConjuredItemTest {

    @Test
    public void should_decrease_quality_twice_and_decrease_sellIn_when_quality_is_above_1() {
        AbstractItemWrapper conjuredItem = ConjuredItem.of("Conjured item", 20, 20);

        conjuredItem.updateQuality();

        assertThat(conjuredItem).isEqualTo(ConjuredItem.of("Conjured item", 19, 18));
    }

    @Test
    public void should_decrease_quality_once_and_decrease_sellIn_when_quality_is_equal_to_1() {
        AbstractItemWrapper conjuredItem = ConjuredItem.of("Conjured item", 20, 1);

        conjuredItem.updateQuality();

        assertThat(conjuredItem).isEqualTo(ConjuredItem.of("Conjured item", 19, 0));
    }

    @Test
    public void should_not_decrease_quality_and_decrease_sellIn_when_quality_is_equal_to_0() {
        AbstractItemWrapper conjuredItem = ConjuredItem.of("Conjured item", 20, 0);

        conjuredItem.updateQuality();

        assertThat(conjuredItem).isEqualTo(ConjuredItem.of("Conjured item", 19, 0));
    }

    @Test
    public void should_decrease_quality_4_times_and_decrease_sellIn_when_sellIn_is_negative() {
        AbstractItemWrapper conjuredItem = ConjuredItem.of("Conjured item", 0, 4);

        conjuredItem.updateQuality();

        assertThat(conjuredItem).isEqualTo(ConjuredItem.of("Conjured item", -1, 0));
    }
}
