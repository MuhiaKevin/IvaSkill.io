package com.myfirstapp.muhia.ivaskillio;

// this class will set get the information on each technology

public class Technologies_model {
    private String title, rank, link;


    public Technologies_model(String tle, String num , String lnk){

        this.title = tle;
        this.rank = num;
        this.link = lnk;
    }


    public String getTitle(){
        return title;

    }


    public void setTitle(String tile){
        this.title = tile;

    }


    public String getRank(){
        return rank;

    }

    public void setRank(String numm){
        this.rank = numm;

    }

    public String getLink() {
        return link;
    }

    public void setLink(String link){
        this.link = link;

    }





}
