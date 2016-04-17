package razibkani.parcelablesample.view;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import razibkani.parcelablesample.R;
import razibkani.parcelablesample.model.Mahasiswa;

public class MainActivity extends AppCompatActivity {

    private Button sendParcel;
    private Mahasiswa mahasiswa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        // init dummy ada
        mahasiswa = new Mahasiswa(1, "Razib Kani Maulidan", "Bogor", "N/A", "Teknologi Industri",
                "Teknik Informatika", "Non-Kelas", "Bernafas", "Minum Kopi", "Motto-GP");

        // init component
        sendParcel = (Button) findViewById(R.id.send_parcel);

        // sending parcel to DetailActivity
        sendParcel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, DetailActivity.class);
                intent.putExtra("parcel", mahasiswa); // send object mahasiswa
                startActivity(intent);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
