package com.example.myapplication;

import android.app.ProgressDialog;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.AsyncTask;
import android.os.Bundle;

import com.example.myapplication.retrofit_api_response.Car;
import com.example.myapplication.retrofit_api_response.Cars;
import com.example.myapplication.retrofit_api_response.GetDataService;
import com.example.myapplication.retrofit_api_response.RetrofitClientInstance;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.util.Log;
import android.view.MenuItem;
import android.widget.GridView;
import android.widget.TextView;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

public class MainActivity extends AppCompatActivity {


    private Context context;

    @BindView(R.id.nav_view)
    BottomNavigationView navView;

    @BindView(R.id.dataViewer)
    GridView dataViewer;

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
//            switch (item.getItemId()) {
//                case R.id.navigation_home:
//                    mTextMessage.setText(R.string.title_home);
//                    return true;
//                case R.id.navigation_dashboard:
//                    mTextMessage.setText(R.string.title_dashboard);
//                    return true;
//                case R.id.navigation_notifications:
//                    mTextMessage.setText(R.string.title_notifications);
//                    return true;
//            }
            return true;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);
        context = this;
        navView.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
        loadData();


    }


    public void loadData() {
        GetDataService service = RetrofitClientInstance.getRetrofitInstance(getString(R.string.BASE_URL)).create(GetDataService.class);
        Call<Cars> call = service.getCars();

        call.enqueue(new Callback<Cars>() {
            @Override
            public void onResponse(Call<Cars> call, Response<Cars> response) {

                if (response.isSuccessful()) {

                    CarAdapter adapter = new CarAdapter(context);
                    List<Car> cars = response.body().getCars();
                    //    adapter.setCars(cars);


                    adapter.setCars(cars);
                    dataViewer.setAdapter(adapter);
                    adapter.notifyDataSetChanged();




                }


            }

            @Override
            public void onFailure(Call<Cars> call, Throwable t) {
                Log.e("API response", t.toString());
            }
        });


    }


}
