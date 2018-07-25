package com.example.ibrakarim.myapplication.retrofit.show;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class ShowList {

    @SerializedName("results")
    private List<Show> showList;

    public List<Show> getShowList() {
        return showList;
    }

    public void setShowList(List<Show> showList) {
        this.showList = showList;
    }
}
