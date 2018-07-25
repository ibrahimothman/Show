package com.example.ibrakarim.myapplication.event;

import com.example.ibrakarim.myapplication.retrofit.credit.Cast;

import java.util.List;

public class Event {

    private List<Cast> castList;

    public Event(List<Cast> castList) {
        this.castList = castList;
    }

    public List<Cast> getCastList() {
        return castList;
    }
}
