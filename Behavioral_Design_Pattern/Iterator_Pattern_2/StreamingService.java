package com.Behavioral_Design_Pattern.Iterator_Pattern_2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StreamingService {

    private final List<String> items;

    public StreamingService() {
        this.items = new ArrayList<String>();
        this.items.add("Friends");
        this.items.add("The Vampire Diaries");
        this.items.add("How I met your mother");
        this.items.add("The Originals");
    }

    public Iterator<String> createIterator() {
        return items.iterator();
    }
    public static void main(String[] args) {
        StreamingService streamingService = new StreamingService();
        Iterator<String> iterator = streamingService.createIterator();
        while (iterator.hasNext()) {
            String item = iterator.next();
            System.out.println(item);
        }
    }
}