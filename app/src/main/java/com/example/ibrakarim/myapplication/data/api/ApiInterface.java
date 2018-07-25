package com.example.ibrakarim.myapplication.data.api;

import com.example.ibrakarim.myapplication.data.Contract;
import com.example.ibrakarim.myapplication.retrofit.credit.Credit;
import com.example.ibrakarim.myapplication.retrofit.show.ShowList;
import com.example.ibrakarim.myapplication.retrofit.video.VideoList;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface ApiInterface {



    @GET(Contract.LOAD_MOVIES)
    public Call<ShowList> getMovies(@Path("cat") String category);

    @GET(Contract.LOAD_TVS)
    public Call<ShowList> getTvShows(@Path("cat") String category);


    @GET(Contract.CRIDIT)
    public Call<Credit> getCridit(@Path("type") String type, @Path("id") int id);


    @GET(Contract.VIDEO)
    public Call<VideoList> getVideos(@Path("type") String type, @Path("id") int id);


}
