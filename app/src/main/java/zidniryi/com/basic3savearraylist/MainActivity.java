package zidniryi.com.basic3savearraylist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    //Todo inisialisasi
    // inisialisasi  ArrayList
    private List kontenList = new ArrayList<>();
    //inisialisasi  Array Adapter
    private ArrayAdapter adapter = null;
    //inisialisasi/Deklrasi Variable ListView
    private ListView listView;

    //inisialisasi / deklaeasi Komponen2 yang lain
    private EditText inputData;
    private Button saveData;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //FindViewnya
        listView = findViewById(R.id.list_data);
        inputData = findViewById(R.id.input_data);
        saveData = findViewById(R.id.save_data);


        //Mengatur ArrayAdapater untuk ditampilkan pada ListView
        adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, kontenList);
        //Menampilkan data
        listView.setAdapter(adapter);

        //Menyimpan data Array dan menampilammya
        saveData.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Membuat objek dari kelas Kontent yang berguna menyimpan data
                Konten myKonten = new Konten();
                //Get  buat ngambil text, data dsb
                myKonten.setData(inputData.getText().toString());
                adapter.add(myKonten);
                //Munculin Toast
                Toast.makeText(getApplicationContext(),"Ok Data Tersimpan", Toast.LENGTH_LONG).show();

            }
        });
    }
}
