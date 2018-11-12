package com.gildedrose;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class TexttestFixture {

    private static FileWriter goldenMasterWriter;

    public static void main(String[] args) throws IOException {
        initGoldenMasterFile();

        writeInFile("OMGHAI!");

        ItemWrapper[] items = new ItemWrapper[] {
                new ItemWrapper("+5 Dexterity Vest", 10, 20), //
                new AgedBrieItem("Aged Brie", 2, 0), //
                new ItemWrapper("Elixir of the Mongoose", 5, 7), //
                new ItemWrapper("Sulfuras, Hand of Ragnaros", 0, 80), //
                new ItemWrapper("Sulfuras, Hand of Ragnaros", -1, 80),
                new ItemWrapper("Backstage passes to a TAFKAL80ETC concert", 15, 20),
                new ItemWrapper("Backstage passes to a TAFKAL80ETC concert", 10, 49),
                new ItemWrapper("Backstage passes to a TAFKAL80ETC concert", 5, 49),
                // this conjured item does not work properly yet
                new ItemWrapper("Conjured Mana Cake", 3, 6) };

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
            System.out.println(object);
            goldenMasterWriter.append(object);
        }
        goldenMasterWriter.append("\n");
    }

    private static void initGoldenMasterFile() throws IOException {
        File goldenMaster = new File("./goldenMaster.txt");

        if (!goldenMaster.exists()) {
            if (!goldenMaster.createNewFile()) {
                throw new IllegalStateException();
            }
        }

        goldenMasterWriter = new FileWriter(goldenMaster, false);

    }

}
