package com.example.jayvee.navigationdrawer;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        /*FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });*/

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
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

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();
        String pName = "";
        String pDetail = "";
        int pImage = R.drawable.ic_menu_camera;
        PlanetDetails pd = (PlanetDetails) this.getFragmentManager().findFragmentById(R.id.fragment);

        switch(id) {
            case R.id.mercury:
                pName = "Mercury";
                pDetail = "\tMercury is the smallest of the eight planets. It is also the closest to the Sun. " +
                        "Mercury goes around the Sun the fastest of all planets." +
                        " Mercury has no Moons.";
                pImage = R.drawable.mercury;

            break;
            case R.id.venus:
                pName = "Venus";
                pDetail = "\tVenus is the second planet from the Sun, and is Earth's closest neighbor in the solar system" +
                        " Venus is the brightest object in the sky after the Sun and the Moon, and sometimes looks like a" +
                        " bright star in the morning or evening sky. The planet is a little smaller than Earth, and is similar" +
                        " to Earth inside. We can't see the surface of Venus from Earth, because it is covered with thick clouds.";
                pImage = R.drawable.venus;

                break;
            case R.id.earth:
                pName = "Earth";
                pDetail = "\tEarth is our home planet. Scientist believe Earth and its moon formed around the same time as the rest" +
                        " of the solar system. They think that was about 4.5 billion years ago. Earth is the fifth-largest planet" +
                        " in the solar system. Its diameter is about 8,000 miles. And Earth is the third-closest planet to the Sun." +
                        " Its average distance from the sun is about 93 million miles. Only Mercury and Venus are closer.";
                pImage = R.drawable.earth;

                break;
            case R.id.mars:
                pName = "Mars";
                pDetail = "\tMars is the fourth planet from the Sun and the second-smallest planet in the Solar System," +
                        " after Mercury. Named after the Roman god of war, it is often referred to as the \"Red Planet\"" +
                        " because the iron oxide prevalent on its surface gives it a reddish appearance. Mars is a terrestrial" +
                        " planet with a thin atmosphere, having surface features reminiscent both of the impact craters of the" +
                        " Moon and the valley, deserts, and polar ice caps of Earth.";
                pImage = R.drawable.mars;

                break;
            case R.id.jupiter:
                pName = "Jupiter";
                pDetail = "\tJupiter is the fifth planet from the Sun and the largest in the Solar System. It is a giant planet" +
                        " with a mass one-thousand that of the Sun, but two and a half times that of all other planets" +
                        " in the Solar System combined. Jupiter and Saturn are gas giants; the other two giant planets, Uranus" +
                        " and Neptune are ice giants. Jupiter has been known to astronomers since antiquity. The Romans named" +
                        " it after their god Jupiter.";
                pImage = R.drawable.jupiter;

                break;
            case R.id.saturn:
                pName = "Saturn";
                pDetail = "\tSaturn is the sixth planet from the Sun and the second-largest in the Solar System, after Jupiter." +
                        "  It is a gas giant with an average radius about nine times that of Earth. Although it has only" +
                        " one-eight the density of Earth, with its larger volume Saturn is just over 95 times more massive" +
                        " Saturn is named after the Roman god of agriculture.";
                pImage = R.drawable.saturn;

                break;
            case R.id.uranus:
                pName = "Uranus";
                pDetail = "\tUranus is the seventh planet from the Sun. It has the third-largest planetary mass in the Solar System." +
                        " Uranus is similar in composition to Neptune, and both have different bulk chemical composition" +
                        " from that of the larger gas giants Jupiter and Saturn. For this reason, scientist often classify" +
                        " Uranus and Neptune as \"Ice Giants\" to distinguish them from the gas giants.";
                pImage = R.drawable.uranus;

                break;
            case R.id.neptune:
                pName = "Neptune";
                pDetail = "\tNeptune is the eighth and farthest known planet from the Sun in the Solar System. In the Solar System," +
                        " it is the fourth-largest planet by diameter, the third-most-massive planet, and the densest giant planet." +
                        " Neptune is 17 times ethe mass of Earth and slightly more massive than its near-twin Uranus, which is 15" +
                        " mass of Earth and slightly larger than Neptune. Neptune is named after the Roman god of the sea.";
                pImage = R.drawable.neptune;

                break;
            case R.id.pluto:
                pName = "Pluto";
                pDetail = "\tPluto is a dwarf planet in the Kulper belt, a ring of bodies beyond Neptune. It was the first Kulper" +
                        " belt object to be discovered. Pluto was discovered by Clyde Tombaugh in 1930 and was originally" +
                        " considered to be the ninth planet from the Sun. After 1992, its status as a planet was questioned" +
                        " following the discovery of several object of similar size in the Kulper belt. In 2005, Eris, a" +
                        " dwarf planet in the scattered disc which is 27% more massive than Pluto, was discovered. This led the" +
                        " IAU to define the term \"planet\" formally in 2006 during their 26th General Assembly. That definition" +
                        " excluded Pluto and reclassified it as a dwarf planet.";
                pImage = R.drawable.pluto;

                break;
        }

        pd.setMessage(pImage, pName, pDetail);

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
