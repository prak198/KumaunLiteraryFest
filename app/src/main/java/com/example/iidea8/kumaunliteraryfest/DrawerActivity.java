package com.example.iidea8.kumaunliteraryfest;

import android.content.Intent;
import android.content.res.Configuration;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.support.v7.app.ActionBarDrawerToggle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;


public class DrawerActivity extends ActionBarActivity {

        private ListView mListView;
        private String[] mListItems;
        private DrawerLayout mdrawerLayout;
        private ActionBarDrawerToggle mDrawerToggle;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drawer);

        mdrawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
        mListItems = getResources().getStringArray(R.array.array_list_item);
        mListView = (ListView) findViewById(R.id.list_view);
        mdrawerLayout.setDrawerShadow(R.drawable.drawer_shadow, GravityCompat.START);

        mListView.setAdapter(new ArrayAdapter<String>(this, R.layout.drawer_list_item, mListItems));
        mListView.setOnItemClickListener(new DrawerItemClickListener());

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeButtonEnabled(true);

        mDrawerToggle = new ActionBarDrawerToggle(this, mdrawerLayout, null,
                        R.string.navigation_drawer_open, R.string.navigation_drawer_close ){

            public void onDrawerOpen(View view){
                super.onDrawerOpened(view);
              invalidateOptionsMenu();
          }
            public  void  onDrawerClose(View view){
                super.onDrawerClosed(view);
                invalidateOptionsMenu();
            }
        };

        mDrawerToggle.setDrawerIndicatorEnabled(true);
        mdrawerLayout.setDrawerListener(mDrawerToggle);



    }

    @Override
    protected void onPostCreate(Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);
        mDrawerToggle.syncState();
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        mDrawerToggle.onConfigurationChanged(newConfig);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_drawer, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        if (mDrawerToggle.onOptionsItemSelected(item)){
            return true;
        }

        //noinspection SimplifiableIfStatement


        return super.onOptionsItemSelected(item);
    }
//    @Override
//    public boolean onPrepareOptionsMenu(Menu menu) {
//        boolean drawerOpen = mdrawerLayout.isDrawerOpen(mListView);
//
//        for (int index = 0; index < menu.size(); index++) {
//            MenuItem menuItem = menu.getItem(index);
//            if (menuItem != null) {
//                // hide the menu items if the drawer is open
//                menuItem.setVisible(!drawerOpen);
//            }
//        }

//        return super.onPrepareOptionsMenu(menu);
//    }

    private class DrawerItemClickListener implements ListView.OnItemClickListener {

        @Override
        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
            switch (position) {
                case 0: {
                    Intent intent0 = new Intent(DrawerActivity.this, HomeActivity.class);
                    startActivity(intent0);
                    break;
                }
                case 1: {
                    Intent intent1 = new Intent(DrawerActivity.this, ItineraryActivity.class);
                    startActivity(intent1);
                    break;
                }
                case 2: {
                    Intent intent2 = new Intent(DrawerActivity.this, SpeakersActivity.class);
                    startActivity(intent2);
                    break;
                }
                case 3: {
                    Intent intent3 = new Intent(DrawerActivity.this, OverviewActivity.class);
                    startActivity(intent3);
                    break;
                }
                case 4: {
                    Intent intent4 = new Intent(DrawerActivity.this, QuizActivity.class);
                    startActivity(intent4);
                    break;
                }
                case 5: {
                    Intent intent5 = new Intent(DrawerActivity.this, PictureGalleryActivity.class);
                    startActivity(intent5);
                    break;
                }
                case 6: {
                    Intent intent6 = new Intent(DrawerActivity.this, SponsorsActivity.class);
                    startActivity(intent6);
                    break;
                }
                case 7:{
                    Intent intent7 = new Intent(DrawerActivity.this, LogoutActivity.class);
                    startActivity(intent7);
                    break;
                }
                default:
                    break;
                }
            mdrawerLayout.closeDrawer(mListView);
        }
    }
}
