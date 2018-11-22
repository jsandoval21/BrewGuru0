package com.fatmenbrews.brewguru;

/**
 * Created by Juan on 11/5/2018.
 */

public class Yeast {
    private String  mBrand;             //yeast brand
    private String  mVariety;           //yeast variety
    private double  mAmount;            //how many packets pitched
    private boolean mYeastStarter;      //was yeast starter used

    public String getmBrand() {
        return mBrand;
    }

    public void setmBrand(String mBrand) {
        this.mBrand = mBrand;
    }

    public String getmVariety() {
        return mVariety;
    }

    public void setmVariety(String mVariety) {
        this.mVariety = mVariety;
    }

    public double getmAmount() {
        return mAmount;
    }

    public void setmAmount(double mAmount) {
        this.mAmount = mAmount;
    }

    public boolean ismYeastStarter() {
        return mYeastStarter;
    }

    public void setmYeastStarter(boolean mYeastStarter) {
        this.mYeastStarter = mYeastStarter;
    }
}

