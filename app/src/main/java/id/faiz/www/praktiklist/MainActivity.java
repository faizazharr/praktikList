package id.faiz.www.praktiklist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.lis);
//        ArrayAdapter<Adapter> adapter = new ArrayAdapter(
//                this,
//                android.R.layout.simple_list_item_1,
//                getData());
        listView.setAdapter(new ArtistAdapter(getData(),this));
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                String clicked = (String) listView.getItemAtPosition(position);
                Toast.makeText(MainActivity.this, "Clicked", Toast.LENGTH_SHORT).show();
            }
        });
    }

    private List<Artist> getData(){
        Artist[] artists = new Artist[]{
            new Artist("faiz", 10, "laki"),
            new Artist("Azhar", 12, "perempuan"),
            new Artist("Ristya", 13, "laki")
        };
    return  new ArrayList<>(Arrays.asList(artists));
    }
}
