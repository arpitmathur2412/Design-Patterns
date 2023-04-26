package com.Behavioral_Design_Pattern.Iterator_Pattern;
public class NameRepository implements Container{
    public String names[] = {"Arpit,Abhinav,Murli,Priyank"};

    @Override
    public Iterator getIterator() {
        return new NameIterator();
    }

    private class NameIterator implements Iterator {
        int index;

        @Override
        public boolean hasNext() {

            if(index <= (names.length-1)){
                return true;
            }
            return false;
        }

        @Override
        public Object next() {

            if(this.hasNext()){
                return names[index++];
            }
            return null;
        }
    }
}