package com.example.tarea4;

import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {
    private MenuItem nav_red, nav_blue, nav_green;
    private Menu menu;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("MainActivity", "onCreate");

        setContentView(R.layout.activity_main);
        // Referencia al BottomNavigationView
        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);

        // Cargar el fragmento inicial
        loadFragment(new RedFragment());
        menu = findViewById(R.menu.botton_nav_menu);
        nav_red = menu.findItem(R.id.nav_red);
        nav_blue = menu.findItem(R.id.nav_blue);
        nav_green = menu.findItem(R.id.nav_green);
        // Listener para cambiar de fragmentos
        bottomNavigationView.setOnItemSelectedListener(item -> {
            Fragment fragment = null;


            if (item.getItemId() == R.id.nav_red) {
               // fragment = new RedFragment();
            } else if (item.getItemId() == R.id.nav_blue) {
                //fragment = new BlueFragment();
            } else if (item.getItemId() == R.id.nav_green) {
               // fragment = new GreenFragment();
            }

            if (fragment != null) {
                loadFragment(fragment);
            }
            return true;
        });
    }

    private void loadFragment(Fragment fragment) {
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.fragment_container, fragment)
                .commit();
    }
}
