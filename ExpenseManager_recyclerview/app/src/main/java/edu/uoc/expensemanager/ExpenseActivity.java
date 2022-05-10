package edu.uoc.expensemanager;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class ExpenseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_expense);
        PayersInfo[] myListData = new PayersInfo[] {
                new PayersInfo("name1", "email1",  101),
                new PayersInfo("name2", "email2",  102),
                new PayersInfo("name3", "email3",  103),
                new PayersInfo("name4", "email4",  104),
                new PayersInfo("name5", "email5",  105),
                new PayersInfo("name6", "email6",  106),
                new PayersInfo("name7", "email7",  107),
                new PayersInfo("name8", "email8",  108),
                new PayersInfo("name9", "email9",  109),
                new PayersInfo("name10", "email10", 110),
                new PayersInfo("name11", "email11", 111),
                new PayersInfo("name12", "email12", 112)
        };

        RecyclerView recyclerView = findViewById(R.id.payerslist);
        PayersListAdapter adapter = new PayersListAdapter(myListData);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);

    }
}