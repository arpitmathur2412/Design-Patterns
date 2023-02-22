package com.CreationalDesignPattern.Prototype2;

import java.util.ArrayList;
import java.util.List;

public class Tag_heuer extends Watches implements Cloneable{
    public Tag_heuer(){
        this.watchlist=new ArrayList<String>();
    }

    public Tag_heuer(List<String> list){
        this.watchlist=list;
    }

    public List<String> getWatchList() {
        return this.watchlist;
    }

    public List<String> add(String watch){
        Tag_heuer temp=new Tag_heuer();
        temp.watchlist=this.watchlist;
        temp.watchlist.add(watch);
        return temp.watchlist;
    }

    public String modify(){
        return (String)this.watchlist.get(0);
    }

    @Override
    public Object clone() throws CloneNotSupportedException{
        List<String> l =this.watchlist;
        Tag_heuer temp=new Tag_heuer();
        temp.watchlist=l;
        return temp;
    }

}

