package com.example.myapplication;

import android.os.Bundle;
import android.widget.GridView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.myapplication.db.CarDB;
import com.example.myapplication.retrofit_api_response.Car;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class FavoriteActivity extends AppCompatActivity {

    @BindView(R.id.dataViewer)
    GridView dataViewer;

    private CarDB carDB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_favorite);

        setTitle("Favorite Cars");

        ButterKnife.bind(this);

        carDB = CarDB.getInstance(this);

        List<Car> carList = carDB.getCarDBDao().getAll();

        if (carList.size() == 0) {

            Toast.makeText(this, "Sorry, no favorite cars to display!", Toast.LENGTH_LONG).show();

            return;
        }


        CarAdapter adapter = new CarAdapter(this);
        adapter.setCars(carList);

        dataViewer.setAdapter(adapter);
        adapter.notifyDataSetChanged();


    }
}
