package com.gla.recursion;
import java.util.*;
public class directorysizecalc {
    static class Item {
        String name;
        int size;
        boolean isDirectory;
        List<Item> children = new ArrayList<>();
        Item(String name, int size, boolean isDirectory) {
            this.name = name;
            this.size = size;
            this.isDirectory = isDirectory;
        }
        void add(Item item) {
            children.add(item);
        }
    }
    static int totalSize(Item item, Set<Item> active) {
        if (!item.isDirectory) {
            System.out.println(item.name + " = " + item.size + " KB");
            return item.size;
        }
        if (!active.add(item)) {
            throw new IllegalStateException(
                    "Directory cycle detected: " + item.name
            );
        }
        int total = 0;
        for (Item child : item.children) {
            total += totalSize(child, active);
        }
        active.remove(item);
        System.out.println(item.name + " total = " + total + " KB");
        return total;
    }
    public static void main(String[] args) {
        Item project = new Item("project", 0, true);
        Item src = new Item("src", 0, true);
        Item docs = new Item("docs", 0, true);
        Item guides = new Item("guides", 0, true);
        src.add(new Item("main.java", 100, false));
        src.add(new Item("utils.java", 50, false));
        docs.add(new Item("readme.txt", 10, false));
        guides.add(new Item("setup.pdf", 200, false));
        docs.add(guides);
        project.add(src);
        project.add(docs);
        project.add(new Item("config.xml", 20, false));
        int result = totalSize(project, new HashSet<>());
        System.out.println("--------------------");
        System.out.println("Total directory size: " + result + " KB");
    }

}
