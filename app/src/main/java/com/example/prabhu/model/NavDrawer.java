package com.example.prabhu.model;

/**
 * Created by prabhu on 12-02-2017.
 */

public class NavDrawer {
    private boolean showNotify;
    private String title;
    public NavDrawer(){
        /** Constructor
         *
         */
    }
    public void NavDrawerItem(boolean showNotify,String title){
        this.showNotify=showNotify;
        this.title=title;
    }

    public boolean isShowNotify(){
        return showNotify;
    }

    public void setShowNotify(boolean showNotify){
        this.showNotify=showNotify;
    }
    public String getTitle(){
        return title;
    }
    public void setTitle(String title){
        this.title=title;
    }
}
