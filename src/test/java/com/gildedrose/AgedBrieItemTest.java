package com.gildedrose;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class AgedBrieItemTest {

    @Test
    public void should_increase_quality_and_decrease_seelIn_when_update_quality() {
        ItemWrapper agedBrie = new AgedBrieItem("Aged Brie", 2, 0);

        agedBrie.updateQuality();

        Assertions.assertThat(agedBrie).isEqualTo(new AgedBrieItem("Aged Brie", 1, 1));
    }

    @Test
    public void should_increase_quality_twice_and_decrease_seelIn_when_update_quality_and_sellIn_is_negative() {
        ItemWrapper agedBrie = new AgedBrieItem("Aged Brie", 0, 0);

        agedBrie.updateQuality();

        Assertions.assertThat(agedBrie).isEqualTo(new AgedBrieItem("Aged Brie", -1, 2));
    }

    @Test
    public void should_not_increase_quality_but_decrease_seelIn_when_update_quality_and_quality_is_already_at_maximum() {
        ItemWrapper agedBrie = new AgedBrieItem("Aged Brie", 0, 50);

        agedBrie.updateQuality();

        Assertions.assertThat(agedBrie).isEqualTo(new AgedBrieItem("Aged Brie", -1, 50));
    }
}
