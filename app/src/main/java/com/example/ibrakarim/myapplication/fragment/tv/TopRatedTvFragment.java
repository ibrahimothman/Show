package com.example.ibrakarim.myapplication.fragment.tv;

import com.example.ibrakarim.myapplication.data.Contract;
import com.example.ibrakarim.myapplication.data.api.ApiClinet;
import com.example.ibrakarim.myapplication.data.api.ApiInterface;
import com.example.ibrakarim.myapplication.retrofit.show.ShowList;

import retrofit2.Call;

public class TopRatedTvFragment extends BaseTvFragment {


    @Override
    protected Call<ShowList> getData() {
        return ApiClinet.getApiClient().create(ApiInterface.class).getTvShows(Contract.TOP_RATED);    }
}
