package com.example.ibrakarim.myapplication.fragment;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;

import com.ibra.moviesseries.R;
import com.example.ibrakarim.myapplication.adapter.VideoAdapter;

import butterknife.BindView;
import butterknife.ButterKnife;

public class VideoFragment extends BaseDetailFragment {

    private static final String TAG = VideoFragment.class.getSimpleName();
    @BindView(R.id.list)
    RecyclerView mList;
    @BindView(R.id.progress_bar)
    ProgressBar mProgressBar;
    private VideoAdapter mVideoAdapter;


    public VideoFragment() {
    }



    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.list,container,false);
        ButterKnife.bind(this,view);

        loadData();
        return view;
    }

    @Override
    protected void updateUi() {
        GridLayoutManager gridLayoutManager = new GridLayoutManager(getContext(),numberOfColumns());
        mList.setLayoutManager(gridLayoutManager);
        mVideoAdapter = new VideoAdapter(getContext(),credit.getVideoList().getVideoList());
        mList.setAdapter(mVideoAdapter);
    }
}
