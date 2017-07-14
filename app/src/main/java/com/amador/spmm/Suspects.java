package com.amador.spmm;

/**
 * Created by Amador on 7/13/17.
 */

public class Suspects {
    private String mName;
    private String mDescription;
    // TODO (1) Add a variable to store the image for the suspect
    // TODO (2) Add image to constructor
    public Suspects(String susName,String susDescription){
        mName = susName;
        mDescription = susDescription;
    }

    public String getName(){
        return mName;
    }

    public String getmDescription(){
        return mDescription;
    }

    //TODO (3) add getter for image


}
