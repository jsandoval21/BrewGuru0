package com.fatmenbrews.brewguru;

/**
 * Created by Juan on 11/5/2018.
 */

public class Brew {
    private String mBrewName;       //brew name
    private String mBrewStyle;      //brew style
    private String mBrewMethod;     //All Grain, BiaB, Extract, Partial
    private double mBatchSize;      //Batch Size
    private double mBoilSize;       //Batch Size at boil
    private double mBoilTime;       //Time of boil
    private double mEfficiency;     //System efficiency

    public String getmBrewName() {
        return mBrewName;
    }

    public void setmBrewName(String mBrewName) {
        this.mBrewName = mBrewName;
    }

    public String getmBrewStyle() {
        return mBrewStyle;
    }

    public void setmBrewStyle(String mBrewStyle) {
        this.mBrewStyle = mBrewStyle;
    }

    public String getmBrewMethod() {
        return mBrewMethod;
    }

    public void setmBrewMethod(String mBrewMethod) {
        this.mBrewMethod = mBrewMethod;
    }

    public double getmBatchSize() {
        return mBatchSize;
    }

    public void setmBatchSize(double mBatchSize) {
        this.mBatchSize = mBatchSize;
    }

    public double getmBoilSize() {
        return mBoilSize;
    }

    public void setmBoilSize(double mBoilSize) {
        this.mBoilSize = mBoilSize;
    }

    public double getmBoilTime() {
        return mBoilTime;
    }

    public void setmBoilTime(double mBoilTime) {
        this.mBoilTime = mBoilTime;
    }

    public double getmEfficiency() {
        return mEfficiency;
    }

    public void setmEfficiency(double mEfficiency) {
        this.mEfficiency = mEfficiency;
    }
}

