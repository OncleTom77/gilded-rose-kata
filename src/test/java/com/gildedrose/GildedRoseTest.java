package com.gildedrose;

import static org.junit.Assert.*;

import com.gildedrose.items.AbstractItemWrapper;
import com.gildedrose.items.degradable.DefaultItem;
import org.junit.Ignore;
import org.junit.Test;

public class GildedRoseTest {

    @Ignore
    @Test
    public void foo() {
        AbstractItemWrapper[] items = new AbstractItemWrapper[] { DefaultItem.of("foo", 0, 0) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("fixme", app.items[0].name);
    }

}
