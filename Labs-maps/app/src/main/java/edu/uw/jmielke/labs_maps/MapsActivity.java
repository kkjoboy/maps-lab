package edu.uw.jmielke.labs_maps;

import android.support.v4.app.FragmentActivity;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.Polyline;
import com.google.android.gms.maps.model.PolylineOptions;

import java.util.ArrayList;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }


    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        // Add a marker in Sydney and move the camera
        LatLng fountain = new LatLng(47.6538, -122.3078);
        ArrayList<LatLng> y = new ArrayList<LatLng>();
//        y.add(new LatLng(47.2538, -122.5078));
//        y.add(new LatLng(47.4538, -122.1078));
//        y.add(new LatLng(47.6538, -122.3078));
//        y.add(new LatLng(47.8538, -122.1078));
//        y.add(new LatLng(48.0538, -122.5078));

        y.add(new LatLng(47.6558, -122.3038));
        y.add(new LatLng(47.6518, -122.3058));
        y.add(new LatLng(47.6538, -122.3078));
        y.add(new LatLng(47.6518, -122.3098));
        y.add(new LatLng(47.6558, -122.3118));
        mMap.addMarker(new MarkerOptions().position(fountain).title("Drumheller Fountain").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_VIOLET)).snippet("The Ducks are a shitty football team who tend to come to Drumheller Fountain in the springtime to raise their offspring."));
        PolylineOptions x = new PolylineOptions().color(R.color.uw).addAll(y);
        mMap.addPolyline(x);
    }
}
