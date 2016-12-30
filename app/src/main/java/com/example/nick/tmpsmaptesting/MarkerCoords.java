package com.example.nick.tmpsmaptesting;
import com.google.android.gms.maps.model.LatLng;

public class MarkerCoords {
    public String name;
    public LatLng point;

    MarkerCoords(String name, LatLng point) {
        this.point = point;
        this.name = name;
    }
}
