package com.fatmenbrews.brewguru;

/**
 * Created by Juan on 11/5/2018.
 */

public class Mash {
    private double mThickness;              //Water to grain ratio
    private int    mTemp;                   //Mash Temp
    private int    mTime;                   //Duration of mash
    private double mStrikeWaterAmount;      //How much water should be used for
    private String mType;                   //Fly sparge, batch sparge...
    private double mStrikeWaterTemp;        //Temperature of Strike Water

    public double getmThickness() {
        return mThickness;
    }

    public void setmThickness(double mThickness) {
        this.mThickness = mThickness;
    }

    public int getmTemp() {
        return mTemp;
    }

    public void setmTemp(int mTemp) {
        this.mTemp = mTemp;
    }

    public int getmTime() {
        return mTime;
    }

    public void setmTime(int mTime) {
        this.mTime = mTime;
    }

    public double getmStrikeWaterAmount() {
        return mStrikeWaterAmount;
    }

    public void setmStrikeWaterAmount(double mStrikeWaterAmount) {
        this.mStrikeWaterAmount = mStrikeWaterAmount;
    }

    public String getmType() {
        return mType;
    }

    public void setmType(String mType) {
        this.mType = mType;
    }

    public double getmStrikeWaterTemp() {
        return mStrikeWaterTemp;
    }

    public void setmStrikeWaterTemp(double mStrikeWaterTemp) {
        this.mStrikeWaterTemp = mStrikeWaterTemp;
    }
}
