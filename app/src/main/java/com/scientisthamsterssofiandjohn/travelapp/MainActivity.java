package com.scientisthamsterssofiandjohn.travelapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ViewPager2 locationsViewPager;
    private List<TravelLocation> travelLocationList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

    private void init() {
        locationsViewPager = findViewById(R.id.locationsViewPager);
        travelLocationList = new ArrayList<>();
        TravelLocation travelLocationEiffelTower = new TravelLocation();
        travelLocationEiffelTower.imageUrl = "https://www.baiaholiday.com/images/w-1900/h-1200/zc-1/q-80/p?src=https%3A%2F%2Fwww.baiaholiday.com%2Fuploads%2Fimage%2F1544432636159.jpg";
        travelLocationEiffelTower.location = "Eiffel Tower";
        travelLocationEiffelTower.title = "France";
        travelLocationEiffelTower.starRating = 4.7f;

        travelLocationList.add(travelLocationEiffelTower);

        TravelLocation travelLocationKyiv = new TravelLocation();
        travelLocationKyiv.imageUrl = "https://cdnp.flypgs.com/files/Sehirler-long-tail/Kyiv/kyiv-bag_ms_zl_k-anit.jpg";
        travelLocationKyiv.location = "Maidan Nezalezhnosti";
        travelLocationKyiv.title = "Kiev";
        travelLocationKyiv.starRating = 5.0f;

        travelLocationList.add(travelLocationKyiv);

        TravelLocation travelLocationHawaii = new TravelLocation();
        travelLocationHawaii.imageUrl = "https://haleakalaecotours.com/wp-content/uploads/2019/04/hawaii-dangerous-waves.jpg";
        travelLocationHawaii.location = "Hawaii Wave";
        travelLocationHawaii.title = "Hawaii";
        travelLocationHawaii.starRating = 5.0f;

        travelLocationList.add(travelLocationHawaii);

        TravelLocation travelLocationTroeshina = new TravelLocation();
        travelLocationTroeshina.starRating = 5.0f;
        travelLocationTroeshina.title = "Troeshina";
        travelLocationTroeshina.location = "The place where metro does not go";
        travelLocationTroeshina.imageUrl = "https://weekend.today/modules/pages/upload/images/semen-shurochin02.jpg";

        travelLocationList.add(travelLocationTroeshina);

        locationsViewPager.setAdapter(new TravelLocationsAdapter(travelLocationList));
    }
}