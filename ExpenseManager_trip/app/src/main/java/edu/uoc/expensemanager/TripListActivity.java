package edu.uoc.expensemanager;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class TripListActivity extends AppCompatActivity {
    FloatingActionButton btnAddNewTrip;
    ImageButton btnViewProfile;
    private edu.uoc.expensemanager.TripInfo[] TripInfo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trip_list);
        TripInfo[] myListData = new TripInfo[] {
                new TripInfo("a", "19890712", "Venecia",1),
                new TripInfo("b","19900916","Portugal",2),
                new TripInfo("c","19891203","Hungria",3),

        };

        RecyclerView recyclerView = findViewById(R.id.recyclerView2);
        MyListAdapter adapter = new MyListAdapter(myListData);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);
        btnAddNewTrip = findViewById(R.id.btn_add_new_trip);
        btnViewProfile = findViewById(R.id.btn_vew_profile);

        //------Temporal code for debugging purposes:
        Button btnAuxViewTrip = findViewById(R.id.btn_aux_view_trip);
        btnAuxViewTrip.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent k = new Intent(TripListActivity.this, TripViewActivity.class);
                startActivity(k);
            }
        });

        //Add actions to the buttons:
        btnAddNewTrip.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent k = new Intent(TripListActivity.this, TripEditActivity.class);
                startActivity(k);
            }
        });

        btnViewProfile.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent k = new Intent(TripListActivity.this, UserProfileActivity.class);
                startActivity(k);
            }
        });

    }
}