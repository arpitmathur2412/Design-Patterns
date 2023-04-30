package com.Practice.Iterator_Pattern;

public class NameRepository implements Container {

    String[] names={"arpit","akshit","tarun","manisha"};
    public Object getIterator(){
        return new NameIterator();
    }

    private class NameIterator implements Iterator{

        int index=0;
        @Override
        public boolean hasNext() {
            if(index<=names.length -1){
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
