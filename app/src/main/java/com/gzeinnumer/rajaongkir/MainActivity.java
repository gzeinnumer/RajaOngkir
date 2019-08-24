package com.gzeinnumer.rajaongkir;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.Toast;

import com.gzeinnumer.rajaongkir.adapter.AdapterCity;
import com.gzeinnumer.rajaongkir.model.ResponseCity;
import com.gzeinnumer.rajaongkir.model.ResultsItem;
import com.gzeinnumer.rajaongkir.network.RetroServer;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    //todo 12
    List<ResultsItem> list;
    String KEY = "YOUR_KEY_HERE";

    //todo 17 biarkan merah
    private AdapterCity adapter;
    private Spinner spAsal, spTujuan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //todo 18
        spAsal = findViewById(R.id.spAsal);
        spTujuan = findViewById(R.id.spTujuan);

        //todo 13
        loadDataCity();

        //todo 19 buat adapter
    }

    //todo 14
    private void loadDataCity() {
        Toast.makeText(this, "load data", Toast.LENGTH_SHORT).show();
        RetroServer.getInstance().getCity(KEY).enqueue(new Callback<ResponseCity>() {
            @Override
            public void onResponse(Call<ResponseCity> call, Response<ResponseCity> response) {
                if(response.isSuccessful()){
                    if (response.body().getRajaongkir().getResults().size()>0 ){
                        list = response.body().getRajaongkir().getResults();
                        //todo 15
                        initDataToSpinner();
                        Toast.makeText(MainActivity.this, String.valueOf(list.size()), Toast.LENGTH_SHORT).show();
                    } else {
                        Toast.makeText(MainActivity.this, "Data city tidak ada", Toast.LENGTH_SHORT).show();
                    }
                }
            }

            @Override
            public void onFailure(Call<ResponseCity> call, Throwable t) {
                Toast.makeText(MainActivity.this, t.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });
    }

    //todo 16
    private void initDataToSpinner() {
        Toast.makeText(this, "sini", Toast.LENGTH_SHORT).show();
        //todo 22
        adapter = new AdapterCity(this, list);
        adapter.notifyDataSetChanged();
        spAsal.setAdapter(adapter);
        spTujuan.setAdapter(adapter);

        spAsal.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                //model sama dengan todo12
                ResultsItem current = (ResultsItem) adapterView.getItemAtPosition(i);
                String id = current.getCityId();
                Toast.makeText(MainActivity.this, id, Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
        spTujuan.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                //model sama dengan todo12
                ResultsItem current = (ResultsItem) adapterView.getItemAtPosition(i);
                String id = current.getCityId();
                Toast.makeText(MainActivity.this, id, Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
    }
}
