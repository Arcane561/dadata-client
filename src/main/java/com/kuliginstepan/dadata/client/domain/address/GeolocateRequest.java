package com.kuliginstepan.dadata.client.domain.address;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.kuliginstepan.dadata.client.domain.BasicRequest;
import lombok.EqualsAndHashCode;
import lombok.Value;

@Value
@EqualsAndHashCode(callSuper = true)
public class GeolocateRequest extends BasicRequest {

    private double lat;
    private double lon;
    @JsonProperty("radius_meters")
    private int radius;

    public GeolocateRequest(double lat, double lon) {
        super(null, null);
        this.lat = lat;
        this.lon = lon;
        radius = 100;
    }

    public GeolocateRequest(double lat, double lon, int radius) {
        super(null, null);
        this.lat = lat;
        this.lon = lon;
        this.radius = radius;
    }
}
