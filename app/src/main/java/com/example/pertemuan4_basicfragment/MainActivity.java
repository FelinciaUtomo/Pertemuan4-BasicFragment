package com.example.pertemuan4_basicfragment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

//    Fragment = aktivitas satu tapi layout bisa diganti
//    1. Ubah layout menjadi frame layout
//    2. Buat fragment todo layout
//    3. Buat string
//    4. Isi fragment todo layout, hint hanya petunjuk saja
//    5. Buat new java class "ToDo"
//    6. Buat new java class "ToDoFragment"
//    7. Isi MainActivity

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FragmentManager fm = getSupportFragmentManager();
        Fragment fragment = fm.findFragmentById(R.id.fragment_container);

        if (fragment==null){
            fragment = new ToDoFragment();
            fm.beginTransaction().add(R.id.fragment_container,fragment).commit();
        }
    }
}