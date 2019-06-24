package com.example.myapplication;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.GridView;
import android.widget.PopupMenu;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

import com.example.myapplication.retrofit_api_response.Car;
import com.example.myapplication.retrofit_api_response.Cars;
import com.example.myapplication.retrofit_api_response.GetDataService;
import com.example.myapplication.retrofit_api_response.RetrofitClientInstance;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.Collections;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {


    private Context context;

    @BindView(R.id.nav_view)
    BottomNavigationView navView;

    @BindView(R.id.dataViewer)
    GridView dataViewer;

    @BindView(R.id.swipeToRefresh)
    SwipeRefreshLayout swipe;



    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.filter:


                    return true;
                case R.id.sort:


                    PopupMenu popup = new PopupMenu(MainActivity.this, findViewById(R.id.sort));
                    MenuInflater inflater = popup.getMenuInflater();
                    inflater.inflate(R.menu.popup_sort, popup.getMenu());
                    popup.show();
                    popup.setOnMenuItemClickListener(menuItem -> {


                        switch (menuItem.getItemId()) {

                            case R.id.endDate:

                                loadData(true, 0);

                                break;

                            case R.id.price:
                                loadData(true, 1);


                                break;

                            case R.id.year:

                                loadData(true, 2);
                                break;


                        }


                        return true;
                    });
                    return true;
                case R.id.gridView:


                    if (dataViewer.getNumColumns() == 1) {
                        dataViewer.setNumColumns(2);
                    } else {
                        dataViewer.setNumColumns(1);
                    }

                    return true;
            }
            return false;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);
        context = this;
        navView.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
        loadData(false, -1);


        swipe.setOnRefreshListener(() -> {
            loadData(false, -1);
            if (swipe.isRefreshing()) swipe.setRefreshing(false);


        });


    }


    public void loadData(boolean toBeSorted, int sortingCriterion) {
        GetDataService service = RetrofitClientInstance.getRetrofitInstance(getString(R.string.BASE_URL)).create(GetDataService.class);
        Call<Cars> call = service.getCars();

        call.enqueue(new Callback<Cars>() {
            @RequiresApi(api = Build.VERSION_CODES.N)
            @Override
            public void onResponse(Call<Cars> call, Response<Cars> response) {

                if (response.isSuccessful()) {

                    CarAdapter adapter = new CarAdapter(context);
                    List<Car> cars = response.body().getCars();

                    if (toBeSorted) {
                        switch (sortingCriterion) {
                            case 0:

                                Collections.sort(cars, (t1, t2) -> t1.getAuctionInfo().getEndDate() - t2.getAuctionInfo().getEndDate());


                                break;
                            case 1:

                                Collections.sort(cars, (t1, t2) -> t1.getAuctionInfo().getCurrentPrice() - t2.getAuctionInfo().getCurrentPrice());

                                break;
                            case 2:
                                Collections.sort(cars, (t1, t2) -> t1.getYear() - t2.getYear());

                                break;

                        }
                    }
                    adapter.setCars(cars);
                    dataViewer.setAdapter(adapter);
                    adapter.notifyDataSetChanged();


                }


            }

            @Override
            public void onFailure(Call<Cars> call, Throwable t) {
                Log.e("Retrofit", t.toString());
            }
        });


    }


}
