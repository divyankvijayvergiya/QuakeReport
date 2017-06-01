package com.example.android.quakereport;

/**
 * Created by Dell on 31-05-2017.
 */

public class EarthQuake {
    private String mMagnitude;

    private String mPlace;

    private long mtimeinmilliseconds;


    public EarthQuake(String magnitude , String Place ,long timeinmillisecond){

        mMagnitude=magnitude;
        mPlace=Place;
       mtimeinmilliseconds=timeinmillisecond;



    }



    public String getmagnitude(){

        return mMagnitude;
    }

    public String getPlace(){
        return mPlace;
    }

    public long gettimeinmillisecond(){return mtimeinmilliseconds; }
}
