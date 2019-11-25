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
                Artist clicked = (Artist) listView.getItemAtPosition(position);
                String message = clicked.getNama() + "Jumlah Followers: " + clicked.getFollower();
                Toast.makeText(MainActivity.this, message,Toast.LENGTH_SHORT).show();
            }
        });
    }

    private List<Artist> getData(){
        Artist[] artists = new Artist[]{
                new Artist("Aokiji", 1233300, "male","jpn"),
                new Artist("Monkey D Luffy",1999999000,"male","idn"),
                new Artist("Vinsmoke", 1029929228,"male","jey"),
                new Artist("Roronoa Zoro", 455789621,"male","jpn"),
                new Artist("Chooper", 44456755, "male","idn"),
                new Artist("Eyeshild 21", 45687862,"female","kor"),

        };
    return  new ArrayList<>(Arrays.asList(artists));
    }
}
