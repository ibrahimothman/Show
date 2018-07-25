package com.example.ibrakarim.myapplication.fragment.movie;

import com.example.ibrakarim.myapplication.data.Contract;
import com.example.ibrakarim.myapplication.data.api.ApiClinet;
import com.example.ibrakarim.myapplication.data.api.ApiInterface;
import com.example.ibrakarim.myapplication.retrofit.show.ShowList;

import retrofit2.Call;

public class NowPlayingMovieFragment extends BaseMovieFragment  {


    @Override
    protected Call<ShowList> getData() {
        return ApiClinet.getApiClient().create(ApiInterface.class).getMovies(Contract.NOW_PALYING);
    }




}
