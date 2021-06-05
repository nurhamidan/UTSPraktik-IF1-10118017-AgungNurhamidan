package com.nurhamidan.utspraktik_if1_10118017_agungnurhamidan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

/*
    Tanggal pengerjaan: 5 Juni 2021
    Nim: 10118017
    Nama: Agung Nurhamidan
    Kelas: IF-1
 */

public class MainActivity extends AppCompatActivity {
    private Button btnSelanjutnya;
    private EditText edtNik;
    private EditText edtNama;
    private EditText edtTglLahir;
    private RadioGroup radioGroupJenisKelamin;
    private RadioGroup radioGroupHubungan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        edtNik = (EditText) findViewById(R.id.main_nik);
        edtNama = (EditText) findViewById(R.id.main_nama);
        edtTglLahir = (EditText) findViewById(R.id.main_tanggal_lahir);
        radioGroupJenisKelamin = (RadioGroup) findViewById(R.id.main_jenis_kelamin);
        radioGroupHubungan = (RadioGroup) findViewById(R.id.main_hubungan);

        btnSelanjutnya = (Button) findViewById(R.id.main_selanjutnya);
        btnSelanjutnya.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (radioGroupJenisKelamin.getCheckedRadioButtonId() != -1 && radioGroupHubungan.getCheckedRadioButtonId() != -1) {
                    RadioButton radioJenisKelamin = (RadioButton) findViewById(radioGroupJenisKelamin.getCheckedRadioButtonId());
                    RadioButton radioHubungan = (RadioButton) findViewById(radioGroupHubungan.getCheckedRadioButtonId());

                    String nik = edtNik.getText().toString();
                    String nama = edtNama.getText().toString();
                    String tanggalLahir = edtTglLahir.getText().toString();
                    String jenisKelamin = radioJenisKelamin.getText().toString();
                    String hubungan = radioHubungan.getText().toString();

                    Bundle bundle = new Bundle();
                    bundle.putString("nik", nik);
                    bundle.putString("nama", nama);
                    bundle.putString("tanggal_lahir", tanggalLahir);
                    bundle.putString("jenis_kelamin", jenisKelamin);
                    bundle.putString("hubungan", hubungan);

                    Intent intent = new Intent(MainActivity.this, PreviewActivity.class);
                    intent.putExtras(bundle);

                    startActivity(intent);
                } else {
                    Toast.makeText(getApplicationContext(), "Ada radio yang belum dicek.", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}