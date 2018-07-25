package com.example.ibrakarim.myapplication.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;

import com.example.ibrakarim.myapplication.data.api.ApiClinet;
import com.example.ibrakarim.myapplication.data.api.ApiInterface;
import com.example.ibrakarim.myapplication.retrofit.credit.Credit;
import com.example.ibrakarim.myapplication.retrofit.show.Show;
import com.example.ibrakarim.myapplication.ui.DetailActivity;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public abstract class BaseDetailFragment extends BaseFragment {

    public Show show;
    public String type;
    public Credit credit;

    public BaseDetailFragment() {
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // get some info from detail activity
        if(getActivity() != null){
            show = ((DetailActivity)getActivity()).show;
            type = ((DetailActivity)getActivity()).type;
        }

        loadData();
    }

    public void loadData() {
        Call<Credit> call = ApiClinet.getApiClient().create(ApiInterface.class).getCridit(type,show.getMovieId());
        call.enqueue(new Callback<Credit>() {
            @Override
            public void onResponse(Call<Credit> call, Response<Credit> response) {
                credit =  response.body();
                updateUi();

            }

            @Override
            public void onFailure(Call<Credit> call, Throwable t) {
                Log.d(getTag(),"error "+t.getLocalizedMessage());
            }
        });
    }

    protected abstract void updateUi();
}
