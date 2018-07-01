package com.example.android.losangelesmusicguide;

public class Items {


    /** String resource ID for the name of the Item */
    private int mNameOfLocationID;

    /** String resource ID for the address of the Item */
    private int mAddressID;

    /** String resource ID for the description of the Item */
    private int mDescriptionID;

    /** Image resource ID for the image of the Item */
    private int mImageResourceID;

    /**
     * Create a new Item object.
     *
     * @param nameOfLocationID is the string resource ID for the name of the location Item
     * @param addressID is the address of the location item
     * @param descriptionID is the description of the location item
     * @param imageResourceID is the image associated with the location item
     */
    public Items(int nameOfLocationID, int addressID, int descriptionID, int imageResourceID) {
        mNameOfLocationID = nameOfLocationID;
        mAddressID = addressID;
        mDescriptionID = descriptionID;
        mImageResourceID = imageResourceID;
    }



    /**
     * Get the string resource ID for the name of the location item
     */
    public int getNameOfLocation() {
        return mNameOfLocationID;
    }

    /**
     * Get the string resource ID for the address of the location item
     */
    public int getAddress() {
        return mAddressID;
    }

    /**
     * Get the string resource ID for the description of the location item
     */
    public int getDescription() {
        return mDescriptionID;
    }

    /**
     * Get the image resource ID for the picture of the location item
     */
    public int getImageResourceId() {
        return mImageResourceID;
    }
}



