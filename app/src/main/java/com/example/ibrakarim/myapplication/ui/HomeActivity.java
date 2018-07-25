package com.example.ibrakarim.myapplication.ui;


import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;

import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

import com.ibra.moviesseries.R;
import com.example.ibrakarim.myapplication.adapter.ViewPagerAdapter;
import com.example.ibrakarim.myapplication.fragment.movie.NowPlayingMovieFragment;
import com.example.ibrakarim.myapplication.fragment.movie.PopularMovieFragment;
import com.example.ibrakarim.myapplication.fragment.movie.TopRatedMovieFragment;
import com.example.ibrakarim.myapplication.fragment.movie.UpcomingMovieFragment;
import com.example.ibrakarim.myapplication.retrofit.genre.Genre;

import java.util.ArrayList;

public class HomeActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    public static final String SHOW_TYPE_PREF = "SHOW_TYPE_PREF";
    public static final String SHOW_TYPE_EDITOR = "SHOW_TYPE_EDITOR";
    private static final String TAG = HomeActivity.class.getSimpleName();


    private Fragment[]fragments = {new TopRatedMovieFragment(),new UpcomingMovieFragment(),new NowPlayingMovieFragment()
                                    ,new PopularMovieFragment()};
    String[]tabNames = {"TOP RATED","UPCOMING","NOW PLAYING","POPULAR"};


    private ViewPagerAdapter viewPagerAdapter;




    private ViewPager viewPager;
    private TabLayout tabLayout;
    private ArrayList<Genre> genres = new ArrayList<>();
    private String type = "show";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        // setup actionbar
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle(getString(R.string.movies_activity));

        // setup nav-drawer
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);



        viewPager = (ViewPager) findViewById(R.id.view_pager);
        tabLayout = (TabLayout) findViewById(R.id.tablayout);

        setUpViewpager();





    }


    private void setUpViewpager() {

        viewPagerAdapter = new ViewPagerAdapter(getSupportFragmentManager(),fragments,tabNames,type);
        viewPager.setAdapter(viewPagerAdapter);
        tabLayout.setupWithViewPager(viewPager);

    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.home, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_search) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_movies) {

        } else if (id == R.id.nav_tvshow) {
            Intent tvIntent = new Intent(this,SeriesActivity.class);
            startActivity(tvIntent);
        }


        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }


}
