package com.example.myapplication;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.myapplication.db.CarDB;
import com.example.myapplication.retrofit_api_response.Car;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;


public class CarAdapter extends BaseAdapter {


    @BindView(R.id.carName)
    TextView carName;

    @BindView(R.id.carPrice)
    TextView carPrice;

    @BindView(R.id.lotNum)
    TextView lotNum;

    @BindView(R.id.bids)
    TextView bids;

    @BindView(R.id.timeLift)
    TextView timeLift;

    @BindView(R.id.carPoster)
    ImageView carPoster;


    @BindView(R.id.fav)
    ImageView favorite;


    private CarDB carDB;

    private List<Car> cars;
    private Context context;

    public void setCars(List<Car> cars) {
        this.cars = cars;
    }


    public CarAdapter(Context context) {
        this.context = context;
        carDB = CarDB.getInstance(context);

    }

    public void CarAdapter(List<Car> movies) {
        this.cars = movies;

    }


    @Override
    public int getCount() {

        return cars == null ? 0 : cars.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    private static int[] splitToComponentTimes(int biggy) {
        long longVal = biggy;
        int hours = (int) longVal / 3600;
        int remainder = (int) longVal - hours * 3600;
        int mins = remainder / 60;
        remainder = remainder - mins * 60;
        int secs = remainder;

        int[] ints = {hours, mins, secs};
        return ints;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        final Car car = cars.get(position);

        if (convertView == null) {
            LayoutInflater from = LayoutInflater.from(context);
            convertView = from.inflate(R.layout.fragment_card, null);
        }

        ButterKnife.bind(this, convertView);

// TODO: fix the favorite icon on click to be changed
        favorite.setOnClickListener(view -> {
            System.out.println(position);
            if (carDB.getCarDBDao().getCar(car.getCarID()) != null) {
                favorite.setImageResource(R.drawable.heart_hollow);
                carDB.getCarDBDao().delete(cars.get(position));
                System.out.println("removed!");

            } else {
                favorite.setImageResource(R.drawable.heart_full);

                carDB.getCarDBDao().insert(car);
            }
        });


        if (cars.size() != 0) {

            if (carDB.getCarDBDao().getCar(car.getCarID()) != null)
                favorite.setImageResource(R.drawable.heart_full);
            else
                favorite.setImageResource(R.drawable.heart_hollow);


            String link = car.getImage();
            link = link.replace("[w]", "0");
            link = link.replace("[h]", "0");


            Glide.with(this.context).load(link).into(carPoster);

            carName.setText(car.getModelEn());

            carPrice.setText(car.getAuctionInfo().getCurrentPrice().toString());

            bids.setText(car.getAuctionInfo().getBids().toString());

            lotNum.setText(car.getAuctionInfo().getLot().toString());

            int[] ints = splitToComponentTimes(car.getAuctionInfo().getEndDate());

            String time = ints[0] + ":" + ints[1] + ":" + ints[2];


            timeLift.setText(time);

        }


        return convertView;
    }


}