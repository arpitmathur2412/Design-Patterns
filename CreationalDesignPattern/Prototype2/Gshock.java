package com.CreationalDesignPattern.Prototype2;
import java.util.ArrayList;
import java.util.List;

public class Gshock extends Watches implements Cloneable{
    public Gshock(){
        this.watchlist=new ArrayList<String>();
    }

    public Gshock(List<String> list){
        this.watchlist=list;
    }

    public List<String> getWatchList() {
        return this.watchlist;
    }

    public List<String> add(String watch){
        Gshock temp=new Gshock();
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
        Gshock temp=new Gshock();
        temp.watchlist=l;
        return temp;
    }

}
