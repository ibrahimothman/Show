package com.example.ibrakarim.myapplication.fragment;


import android.support.v4.app.Fragment;

import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.DisplayMetrics;

import com.ibra.moviesseries.R;

import butterknife.BindView;
import butterknife.ButterKnife;


public abstract class BaseFragment extends Fragment {




    public BaseFragment() {
    }

    public int numberOfColumns() {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        getActivity().getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        int widthDivider = 600;
        int width = displayMetrics.widthPixels;
        int nColumns = width / widthDivider;
        if (nColumns < 3) {
            return 3;
        }
        return nColumns;
    }



}
