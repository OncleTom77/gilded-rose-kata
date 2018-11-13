package com.gildedrose.items.improving;

import com.gildedrose.items.AbstractItemWrapper;
import com.gildedrose.items.improving.BackstageItem;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class BackstageItemTest {

    @Test
    public void should_increase_quality_once_and_decrease_sellIn_when_sellIn_is_above_10() {
        AbstractItemWrapper backstage = BackstageItem.of(20, 0);

        backstage.updateQuality();

        assertThat(backstage).isEqualTo(BackstageItem.of(19, 1));
    }

    @Test
    public void should_not_increase_quality_and_decrease_sellIn_when_sellIn_is_above_10_and_quality_is_already_at_maximum() {
        AbstractItemWrapper backstage = BackstageItem.of(20, 50);

        backstage.updateQuality();

        assertThat(backstage).isEqualTo(BackstageItem.of(19, 50));
    }

    @Test
    public void should_increase_quality_twice_and_decrease_sellIn_when_sellIn_is_above_5_and_under_11() {
        AbstractItemWrapper backstage = BackstageItem.of(10, 0);

        backstage.updateQuality();

        assertThat(backstage).isEqualTo(BackstageItem.of(9, 2));
    }

    @Test
    public void should_increase_quality_once_and_decrease_sellIn_when_sellIn_is_above_5_and_under_11_and_quality_is_equal_to_maximum_subtract_1() {
        AbstractItemWrapper backstage = BackstageItem.of(10, 49);

        backstage.updateQuality();

        assertThat(backstage).isEqualTo(BackstageItem.of(9, 50));
    }

    @Test
    public void should_not_increase_quality_and_decrease_sellIn_when_sellIn_is_above_5_and_under_11_and_quality_is_already_at_maximum() {
        AbstractItemWrapper backstage = BackstageItem.of(10, 50);

        backstage.updateQuality();

        assertThat(backstage).isEqualTo(BackstageItem.of(9, 50));
    }

    @Test
    public void should_increase_quality_3_times_and_decrease_sellIn_when_sellIn_is_positive_and_under_6_and_quality_is_under_maximum_subtract_2() {
        AbstractItemWrapper backstage = BackstageItem.of(5, 0);

        backstage.updateQuality();

        assertThat(backstage).isEqualTo(BackstageItem.of(4, 3));
    }

    @Test
    public void should_increase_quality_twice_and_decrease_sellIn_when_sellIn_is_positive_and_under_6_and_quality_is_equal_to_maximum_subtract_2() {
        AbstractItemWrapper backstage = BackstageItem.of(5, 48);

        backstage.updateQuality();

        assertThat(backstage).isEqualTo(BackstageItem.of(4, 50));
    }

    @Test
    public void should_increase_quality_once_and_decrease_sellIn_when_sellIn_is_positive_and_under_6_and_quality_is_equal_to_maximum_subtract_1() {
        AbstractItemWrapper backstage = BackstageItem.of(5, 49);

        backstage.updateQuality();

        assertThat(backstage).isEqualTo(BackstageItem.of(4, 50));
    }

    @Test
    public void should_not_increase_quality_and_decrease_sellIn_when_sellIn_is_positive_and_under_6_and_quality_is_already_at_maximum() {
        AbstractItemWrapper backstage = BackstageItem.of(5, 50);

        backstage.updateQuality();

        assertThat(backstage).isEqualTo(BackstageItem.of(4, 50));
    }

    @Test
    public void should_set_quality_to_0_and_decrease_sellIn_when_sellIn_is_negative() {
        AbstractItemWrapper backstage = BackstageItem.of(0, 2);

        backstage.updateQuality();

        assertThat(backstage).isEqualTo(BackstageItem.of(-1, 0));
    }
}
