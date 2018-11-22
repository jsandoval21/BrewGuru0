package com.fatmenbrews.brewguru;

/**
 * Created by Juan on 11/5/2018.
 */

public class Hops {
    private double mAmoumt;         //amount of hops used
    private String mHopVariety;     //hope variety used (centennial, simcoe, etc, etc)
    private double mAlphaAcid;      //Alpha Acid in hops
    private int    mHopTime;        //Time hop is added. Can be in boil or days for
    private String mTimeUnit;       //minutes or days
    private String mHopType;        //pellet, whole, extract
    private String mAdditionType;   //dry hop, boil, etc

    public double getmAmoumt() {
        return mAmoumt;
    }

    public void setmAmoumt(double mAmoumt) {
        this.mAmoumt = mAmoumt;
    }

    public String getmHopVariety() {
        return mHopVariety;
    }

    public void setmHopVariety(String mHopVariety) {
        this.mHopVariety = mHopVariety;
    }

    public double getmAlphaAcid() {
        return mAlphaAcid;
    }

    public void setmAlphaAcid(double mAlphaAcid) {
        this.mAlphaAcid = mAlphaAcid;
    }

    public int getmHopTime() {
        return mHopTime;
    }

    public void setmHopTime(int mHopTime) {
        this.mHopTime = mHopTime;
    }

    public String getmHopType() {
        return mHopType;
    }

    public void setmHopType(String mHopType) {
        this.mHopType = mHopType;
    }

    public String getmAdditionType() {
        return mAdditionType;
    }

    public void setmAdditionType(String mAdditionType) {
        this.mAdditionType = mAdditionType;
    }

    public String getmTimeUnit() {
        return mTimeUnit;
    }

    public void setmTimeUnit(String mTimeUnit) {
        this.mTimeUnit = mTimeUnit;
    }
}

