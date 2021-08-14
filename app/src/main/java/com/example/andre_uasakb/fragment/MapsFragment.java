package com.example.andre_uasakb.fragment;

// 14 Agustus 2021
//
//        10118382
//        Andre Burhan
//        IF - 9

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.example.andre_uasakb.R;

public class MapsFragment extends Fragment {

    private OnMapReadyCallback callback = new OnMapReadyCallback() {

        /**
         * Manipulates the map once available.
         * This callback is triggered when the map is ready to be used.
         * This is where we can add markers or lines, add listeners or move the camera.
         * In this case, we just add a marker near Sydney, Australia.
         * If Google Play services is not installed on the device, the user will be prompted to
         * install it inside the SupportMapFragment. This method will only be triggered once the
         * user has installed Google Play services and returned to the app.
         */
        @Override
        public void onMapReady(GoogleMap googleMap) {
            LatLng bandung = new LatLng(-7.179054, 107.592306);
            LatLng danauSituCileunca = new LatLng(-7.192481, 107.550470);
            LatLng curugPanganten = new LatLng(-7.160249, 107.625180);
            LatLng wayangWindu = new LatLng(-7.207074, 107.627083);

            googleMap.addMarker(new MarkerOptions().position(danauSituCileunca).title("Danau Situ Cileunca"));
            googleMap.addMarker(new MarkerOptions().position(curugPanganten).title("Curug Panganten"));
            googleMap.addMarker(new MarkerOptions().position(wayangWindu).title("Wayang Windu"));

            googleMap.moveCamera(CameraUpdateFactory.newLatLngZoom(bandung,11));

        }
    };

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_maps, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        SupportMapFragment mapFragment =
                (SupportMapFragment) getChildFragmentManager().findFragmentById(R.id.map);
        if (mapFragment != null) {
            mapFragment.getMapAsync(callback);
        }
    }
}