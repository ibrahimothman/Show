package com.example.ibrakarim.myapplication.retrofit.credit;

import com.google.gson.annotations.SerializedName;
import com.example.ibrakarim.myapplication.retrofit.genre.Genre;
import com.example.ibrakarim.myapplication.retrofit.show.ShowList;
import com.example.ibrakarim.myapplication.retrofit.video.VideoList;

import java.util.List;

public class Credit {

    @SerializedName("genres")
    private List<Genre> genres;


    @SerializedName("runtime")
    private double duration;

    @SerializedName("credits")
    private CastCrowList castCrewList;

    @SerializedName("videos")
    private VideoList videoList;

    @SerializedName("similar")
    private ShowList similarList;

    public ShowList getSimilarList() {
        return similarList;
    }

    public void setSimilarList(ShowList similarList) {
        this.similarList = similarList;
    }

    public VideoList getVideoList() {
        return videoList;
    }

    public void setVideoList(VideoList videoList) {
        this.videoList = videoList;
    }

    public List<Genre> getGenres() {
        return genres;
    }

    public void setGenres(List<Genre> genres) {
        this.genres = genres;
    }


    public double getDuration() {
        return duration;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }


    public CastCrowList getCastCrewList() {
        return castCrewList;
    }

    public void setCastCrewList(CastCrowList castCrewList) {
        this.castCrewList = castCrewList;
    }
}
