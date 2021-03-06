package communityuni.com.tracnghiemantoan;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.LinearLayout;

import java.util.ArrayList;
import java.util.List;

public class CategoriesActivity extends AppCompatActivity {

    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_categories);
        Toolbar toolbar = findViewById(R.id.toolbar);

        getSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Categories");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        recyclerView= findViewById(R.id.rv);

        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        layoutManager.setOrientation(RecyclerView.VERTICAL);

        recyclerView.setLayoutManager(layoutManager);
        List<CategoryMode> list = new ArrayList<>();
        list.add(new CategoryMode("","Category1"));
        list.add(new CategoryMode("","Category2"));
        list.add(new CategoryMode("","Category3"));
        list.add(new CategoryMode("","Category4"));
        list.add(new CategoryMode("","Category5"));
        list.add(new CategoryMode("","Category6"));
        list.add(new CategoryMode("","Category7"));
        list.add(new CategoryMode("","Category8"));
        list.add(new CategoryMode("","Category9"));
        list.add(new CategoryMode("","Category10"));
        list.add(new CategoryMode("","Category11"));
        list.add(new CategoryMode("","Category12"));
        list.add(new CategoryMode("","Category13"));
        list.add(new CategoryMode("","Category14"));
        list.add(new CategoryMode("","Category15"));

        CategoryAdapter adapter = new CategoryAdapter(list);
        recyclerView.setAdapter(adapter);


    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if(item.getItemId() == android.R.id.home){
            finish();
        }

        return super.onOptionsItemSelected(item);
    }
}
