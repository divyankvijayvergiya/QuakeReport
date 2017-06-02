package com.example.android.quakereport;

/**
 * Created by Dell on 31-05-2017.
 */

public class EarthQuake {
    private Double mMagnitude;

    private String mPlace;

    private long mtimeinmilliseconds;


    public EarthQuake(Double magnitude , String Place ,long timeinmillisecond){

        mMagnitude=magnitude;
        mPlace=Place;
       mtimeinmilliseconds=timeinmillisecond;



    }



    public Double getmagnitude(){

        return mMagnitude;
    }

    public String getPlace(){
        return mPlace;
    }

    public long gettimeinmillisecond(){return mtimeinmilliseconds; }
}
