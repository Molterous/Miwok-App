package com.example.miwokapp;

public class word {

    private String mDefaultTranslation;
    private String mMiwokTranslation;
    private int mImageResourceId =  -1;
    private int mAudioResourceId ;

    public word( String mDefaultTranslation , String mMiwokTranslation, int mAudioResourceId){
        this.mDefaultTranslation = mDefaultTranslation;
        this.mMiwokTranslation = mMiwokTranslation;
        this.mAudioResourceId = mAudioResourceId;
    }

    public word( String mDefaultTranslation , String mMiwokTranslation, int mImageResourceId, int mAudioResourceId){
        this.mDefaultTranslation = mDefaultTranslation;
        this.mMiwokTranslation = mMiwokTranslation;
        this.mImageResourceId = mImageResourceId;
        this.mAudioResourceId = mAudioResourceId;
    }

    public String getDefaultTranslation(){
        return this.mDefaultTranslation;
    }

    public String getMiwokTranslation(){
        return this.mMiwokTranslation;
    }

    public int getImageResourceId(){
        return this.mImageResourceId;
    }

    public boolean hasImage(){
        return (mImageResourceId !=  -1);
    }

    public int getAudioResourceId(){ return mAudioResourceId;    }

}
