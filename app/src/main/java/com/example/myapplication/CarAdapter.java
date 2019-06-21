package com.example.myapplication;


import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;


import com.bumptech.glide.Glide;
import com.example.myapplication.retrofit_api_response.Car;

import java.util.ArrayList;
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


    private List<Car> cars;
    private Context context;

    public void setCars(List<Car> cars) {
        this.cars = cars;
    }


    public CarAdapter(Context context) {
        this.context = context;

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

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        final Car movie = cars.get(position);

        if (convertView == null) {
            LayoutInflater from = LayoutInflater.from(context);
            convertView = from.inflate(R.layout.fragment_card, null);
        }

        ButterKnife.bind(this, convertView);


        Car car = cars.get(position);

        if (cars.size() != 0 ) {



            String link = car.getImage();
            link = link.replace("[w]", "0");
            link = link.replace("[h]", "0");


            Glide.with(this.context).load(link).into(carPoster);

            carName.setText(car.getModelEn());

            carPrice.setText(car.getAuctionInfo().getCurrentPrice().toString());

            bids.setText(car.getAuctionInfo().getBids().toString());

            lotNum.setText(car.getAuctionInfo().getLot().toString());

            timeLift.setText(car.getAuctionInfo().getEndDate().toString());

        }


        return convertView;
    }


}