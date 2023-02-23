package com.example.notey;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;

import com.google.android.material.snackbar.Snackbar;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.view.MenuInflater;
import android.view.View;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;
import com.example.notey.databinding.ActivityMainBinding;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.HashSet;

public class MainActivity extends AppCompatActivity {

    static ArrayList<String> notes = new ArrayList<>();
    static ArrayAdapter arrayAdapter;

 //   @Override
 //   public boolean onCreateOptionsMenu(Menu menu) {

  //      MenuInflater menuInflater = getMenuInflater();
  //      menuInflater.inflate(R.menu.add_note_menu, menu);

   //     return super.onCreateOptionsMenu(menu);

  //  }


    public void newNote(View view) {

            // Going from MainActivity to NotesEditorActivity
            Intent intent = new Intent(getApplicationContext(), NoteEditorActivity.class);
            startActivity(intent);

    }



    private AppBarConfiguration appBarConfiguration;
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        setSupportActionBar(binding.toolbar);

        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_content_main);
        appBarConfiguration = new AppBarConfiguration.Builder(navController.getGraph()).build();
        NavigationUI.setupActionBarWithNavController(this, navController, appBarConfiguration);

        binding.fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }

        });


       // setContentView(R.layout.activity_main);

      //  ListView listView = findViewById(R.id.listView);
        //SharedPreferences sharedPreferences = getApplicationContext().getSharedPreferences("com.example.notes", Context.MODE_PRIVATE);
       // HashSet<String> set = (HashSet<String>) sharedPreferences.getStringSet("notes", null);

        //if (set == null) {

          //  notes.add("Example note");
        //} else {
          //  notes = new ArrayList(set);
        //}

        // Using custom listView Provided by Android Studio
        //arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_expandable_list_item_1, notes);

        //listView.setAdapter(arrayAdapter);

        //listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
  //          @Override
    //        public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
//
                // Going from MainActivity to NotesEditorActivity
  //              Intent intent = new Intent(getApplicationContext(), NoteEditorActivity.class);
    //            intent.putExtra("noteId", i);
      //          startActivity(intent);

       //     }
      //  }
    }




    @Override
    public boolean onSupportNavigateUp() {
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_content_main);
        return NavigationUI.navigateUp(navController, appBarConfiguration)
                || super.onSupportNavigateUp();
    }
}