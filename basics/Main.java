//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

class Main {
    Main() {
    }

    public static void main(String[] var0) {
        System.out.println("pluralize\n__________");
        byte var1 = 1;
        System.out.println("I own " + var1 + " " + pluralize("dog", var1) + ".");
        byte var2 = 2;
        System.out.println("I own " + var2 + " " + pluralize("cat", var2) + ".");
        byte var3 = 0;
        System.out.println("I own " + var3 + " " + pluralize("turtle", var3) + ".");
        System.out.println("__________\n");
        System.out.println("flipNHeads\n__________");
        flipNHeads(5);
        System.out.println("__________\n");
        System.out.println("Clock\n__________");
        Clock();
        System.out.println("__________\n");
    }

    public static String pluralize(String var0, int var1) {
        if (var1 != 0 && var1 != 1) {
            return var1 > 1 ? var0 + "s" : "";
        } else {
            return var0;
        }
    }

    public static void flipNHeads(int var0) {
        Random var1 = new Random();
        int var2 = 0;
        int var3 = 0;

        while(var3 != var0) {

            float var4 = var1.nextFloat();
            if ((double)var4 > 0.5D) {
                System.out.println("heads");
                ++var2;
            } else if ((double)var4 < 0.5D) {
                System.out.println("tails");
            }
            ++var3;

            if (var3 == var0) {
                System.out.println("It took " + var0 + " flips to flip " + var2 + " head in a row.");
            }

        }

    }

    public static void Clock() {
        new Scanner(System.in);

        while(true) {
            while(true) {
                Long var1 = System.currentTimeMillis();
                LocalDateTime var2 = LocalDateTime.now();
                int var3 = var2.getHour();
                int var4 = var2.getMinute();
                int var5 = var2.getSecond();
                String var6 = var2.format(DateTimeFormatter.ofPattern("HH:mm:ss"));

                try {
                    TimeUnit.SECONDS.sleep(1L);
                } catch (InterruptedException var12) {
                    Thread.currentThread().interrupt();
                }

                System.out.print(var6);
                long var7 = System.currentTimeMillis();
                long var9 = var7 - var1;
                String var11 = String.format("%,d", var9);
                if (var9 < 1000L) {
                    System.out.println(" " + var11 + " Hz");
                } else if (var9 > 999L && var9 < 10000L) {
                    System.out.println(" " + var11 + " KHz");
                } else if (var9 > 999999L && var9 < 10000000L) {
                    System.out.println(" " + var11 + " MHz");
                } else if (var9 > 999999999L && var9 < 10000000000L) {
                    System.out.println(" " + var11 + " GHz");
                }
            }
        }
    }
}
