package razibkani.parcelablesample.view;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.TextView;

import razibkani.parcelablesample.R;
import razibkani.parcelablesample.model.Mahasiswa;

public class DetailActivity extends AppCompatActivity {

    private TextView id;
    private TextView nama;
    private TextView tempatLahir;
    private TextView tanggalLahir;
    private TextView fakultas;
    private TextView jurusan;
    private TextView kelas;
    private TextView hobi;
    private TextView skill;
    private TextView motto;

    private Mahasiswa mahasiswa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        // get parcel from MainActivity
        mahasiswa = getIntent().getExtras().getParcelable("parcel");

        // init component
        id              = (TextView) findViewById(R.id.id);
        nama            = (TextView) findViewById(R.id.nama);
        tempatLahir     = (TextView) findViewById(R.id.tempat_lahir);
        tanggalLahir    = (TextView) findViewById(R.id.tanggal_lahir);
        fakultas        = (TextView) findViewById(R.id.fakultas);
        jurusan         = (TextView) findViewById(R.id.jurusan);
        kelas           = (TextView) findViewById(R.id.kelas);
        hobi            = (TextView) findViewById(R.id.hobi);
        skill           = (TextView) findViewById(R.id.skill);
        motto           = (TextView) findViewById(R.id.motto);

        // set data into view
        id.setText(String.valueOf(mahasiswa.id));
        nama.setText(mahasiswa.nama);
        tempatLahir.setText(mahasiswa.tempatLahir);
        tanggalLahir.setText(mahasiswa.tanggalLahir);
        fakultas.setText(mahasiswa.fakultas);
        jurusan.setText(mahasiswa.jurusan);
        kelas.setText(mahasiswa.kelas);
        hobi.setText(mahasiswa.hobi);
        skill.setText(mahasiswa.skill);
        motto.setText(mahasiswa.motto);
    }

}
