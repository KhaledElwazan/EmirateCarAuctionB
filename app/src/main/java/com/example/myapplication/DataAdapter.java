package com.example.myapplication;

import android.graphics.Bitmap;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplication.retrofit_api_response.Car;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class DataAdapter extends RecyclerView.Adapter<DataAdapter.DataHandler> {

    public void setCars(List<Car> cars) {
        this.cars = cars;
    }

    public DataAdapter() {
    }

    public DataAdapter(List<Car> cars, List<Bitmap> posters) {
        this.cars = cars;
        this.posters = posters;
    }

    public void setPosters(List<Bitmap> posters) {
        this.posters = posters;
    }

    private List<Car> cars;
    private List<Bitmap> posters;


    @NonNull
    @Override
    public DataHandler onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.fragment_card, parent, false);

//        ButterKnife.bind(this, view);

        return new DataHandler(view);
    }

    @Override
    public void onBindViewHolder(@NonNull DataHandler holder, int position) {


        Car car = cars.get(position);

        if (cars.size() != 0 && posters != null) {
            holder.carPoster.setImageBitmap(posters.get(position));

            holder.carName.setText(car.getModelEn());

            holder.carPrice.setText(car.getAuctionInfo().getCurrentPrice().toString());

            holder.bids.setText(car.getAuctionInfo().getBids().toString());

            holder.lotNum.setText(car.getAuctionInfo().getLot().toString());

            holder.timeLift.setText(car.getAuctionInfo().getEndDate().toString());

        }
    }

    @Override
    public int getItemCount() {
        return cars.size() != 0 ? cars.size() : 0;
    }

    public static class DataHandler extends RecyclerView.ViewHolder {


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

        public DataHandler(@NonNull View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);

        }
    }


}
