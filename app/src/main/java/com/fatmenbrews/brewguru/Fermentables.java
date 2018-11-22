package com.fatmenbrews.brewguru;

/**
 * Created by Juan on 11/5/2018.
 */

public class Fermentables {
    private double mQuantity;               //fermentable amount
    private String mFermentable;            //Fermentable used
    private double mFermentablePercent;      //Percentage of fermentable in the brew

    public double getmQuantity() {
        return mQuantity;
    }

    public void setmQuantity(double mQuantity) {
        this.mQuantity = mQuantity;
    }

    public String getmFermentable() {
        return mFermentable;
    }

    public void setmFermentable(String mFermentable) {
        this.mFermentable = mFermentable;
    }

    public double getmFermentablePercent() {
        return mFermentablePercent;
    }

    public void setmFermentablePercent(double mFermentablePercent) {
        this.mFermentablePercent = mFermentablePercent;
    }
}
