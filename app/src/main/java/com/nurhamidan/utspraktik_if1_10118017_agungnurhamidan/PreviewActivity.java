package com.nurhamidan.utspraktik_if1_10118017_agungnurhamidan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/*
    Tanggal pengerjaan: 5 Juni 2021
    Nim: 10118017
    Nama: Agung Nurhamidan
    Kelas: IF-1
 */
public class PreviewActivity extends AppCompatActivity {
    private TextView tvNik;
    private TextView tvNama;
    private TextView tvTanggalLahir;
    private TextView tvJenisKelamin;
    private TextView tvHubungan;

    private Button btnUbah;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_preview);

        tvNik = (TextView) findViewById(R.id.preview_nik);
        tvNama = (TextView) findViewById(R.id.preview_nama);
        tvTanggalLahir = (TextView) findViewById(R.id.preview_tanggal_lahir);
        tvJenisKelamin = (TextView) findViewById(R.id.preview_jenis_kelamin);
        tvHubungan = (TextView) findViewById(R.id.preview_hubungan);

        Bundle bundle = getIntent().getExtras();

        tvNik.setText(bundle.getString("nik"));
        tvNama.setText(bundle.getString("nama"));
        tvTanggalLahir.setText(bundle.getString("tanggal_lahir"));
        tvJenisKelamin.setText(bundle.getString("jenis_kelamin"));
        tvHubungan.setText(bundle.getString("hubungan"));

        btnUbah = (Button) findViewById(R.id.preview_btn_ubah);

        btnUbah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}