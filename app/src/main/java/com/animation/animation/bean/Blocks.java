package com.animation.animation.bean;

import java.util.List;

/**
 * Created by luojurong on 2017/2/28.
 */

public class Blocks {
    private String blocktitle;
    private String blockcoin;
    private int comiccount;
    private int templateid;
    private int place;
    private List<Comiclist> comiclists;

    public void setBlocktitle(String blocktitle) {
        this.blocktitle = blocktitle;
    }

    public void setComiclists(List<Comiclist> comiclists) {
        this.comiclists = comiclists;
    }

    public void setPlace(int place) {
        this.place = place;
    }

    public void setTemplateid(int templateid) {
        this.templateid = templateid;
    }

    public void setComiccount(int comiccount) {
        this.comiccount = comiccount;
    }

    public void setBlockcoin(String blockcoin) {
        this.blockcoin = blockcoin;
    }

    public String getBlocktitle() {
        return blocktitle;
    }

    public String getBlockcoin() {
        return blockcoin;
    }

    public int getComiccount() {
        return comiccount;
    }

    public int getTemplateid() {
        return templateid;
    }

    public int getPlace() {
        return place;
    }

    public List<Comiclist> getComiclists() {
        return comiclists;
    }
}
