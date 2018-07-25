package com.example.ibrakarim.myapplication.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.View;

import com.example.ibrakarim.myapplication.retrofit.show.Show;
import com.example.ibrakarim.myapplication.ui.DetailActivity;

import java.util.List;

public class TvAdapter extends ShowAdapter {


    public TvAdapter(Context mContext, List<Show> showList) {
        super(mContext, showList);
    }

    @Override
    protected int setPlayImageVisibility() {
        return View.GONE;
    }

    @Override
    protected int setJopVisibility() {
        return View.GONE;
    }

    @Override
    protected void onViewClick(Context context, Show show) {
        Intent intent = new Intent(context,DetailActivity.class);
        intent.putExtra("show",show);
        intent.putExtra("type","tv");
        context.startActivity(intent);
    }
}
