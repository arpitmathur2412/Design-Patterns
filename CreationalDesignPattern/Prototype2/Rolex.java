package com.CreationalDesignPattern.Prototype2;

import java.util.ArrayList;
import java.util.List;

public class Rolex extends Watches implements Cloneable{
        public Rolex(){
            this.watchlist=new ArrayList<String>();
        }

        public Rolex(List<String> list){
            this.watchlist=list;
        }

        public List<String> getWatchList() {
            return this.watchlist;
        }

        public List<String> add(String watch){
            Rolex temp=new Rolex();
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
            Rolex temp=new Rolex();
            temp.watchlist=l;
            return temp;
        }

    }

