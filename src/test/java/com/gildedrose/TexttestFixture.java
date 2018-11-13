package com.gildedrose;

import com.gildedrose.items.*;
import com.gildedrose.items.degradable.ConjuredItem;
import com.gildedrose.items.degradable.DefaultItem;
import com.gildedrose.items.improving.AgedBrieItem;
import com.gildedrose.items.improving.BackstageItem;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class TexttestFixture {

    private static FileWriter goldenMasterWriter;

    public static void main(String[] args) throws IOException {
        initGoldenMasterFile();

        writeInFile("OMGHAI!");

        AbstractItemWrapper[] items = new AbstractItemWrapper[]{
                DefaultItem.of("+5 Dexterity Vest", 10, 20), //
                AgedBrieItem.of(2, 0), //
                DefaultItem.of("Elixir of the Mongoose", 5, 7), //
                SulfurasItem.of(0, 80), //
                SulfurasItem.of(-1, 80),
                BackstageItem.of(15, 20),
                BackstageItem.of(10, 49),
                BackstageItem.of(5, 49),
                // this conjured item does not work properly yet
                ConjuredItem.of("Conjured Mana Cake", 3, 6)
        };

        GildedRose app = new GildedRose(items);

        int days = 10;
        if (args.length > 0) {
            days = Integer.parseInt(args[0]) + 1;
        }

        for (int i = 0; i < days; i++) {
            writeInFile("-------- day " + i + " --------");
            writeInFile("name, sellIn, quality");
            for (Item item : items) {
                writeInFile(item.toString());
            }
            writeInFile();
            app.updateQuality();
        }

        goldenMasterWriter.close();
    }

    private static void writeInFile() throws IOException {
        writeInFile(null);
    }

    private static void writeInFile(String object) throws IOException {
        if (null != object) {
            System.out.print(object);
            goldenMasterWriter.append(object);
        }
        goldenMasterWriter.append("\n");
        System.out.println();
    }

    private static void initGoldenMasterFile() throws IOException {
        File goldenMaster = new File("./goldenMaster.txt");

        if (!goldenMaster.exists()
                && !goldenMaster.createNewFile()) {
            throw new IllegalStateException();
        }

        goldenMasterWriter = new FileWriter(goldenMaster, false);

    }

}
