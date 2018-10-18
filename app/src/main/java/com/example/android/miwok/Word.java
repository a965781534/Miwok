package com.example.android.miwok;

public class Word {

    private String defaultTranslation;
    private String miwokTranslation;
    private int imageResurceId = NO_IMAGE_PROVIDED;
    private int audioResourceId;

    private static final int NO_IMAGE_PROVIDED = -1;

    public Word(String defaultTranslation, String miwokTranslation, int imageResurceId, int audioResourceId) {
        this.defaultTranslation = defaultTranslation;
        this.miwokTranslation = miwokTranslation;
        this.imageResurceId = imageResurceId;
        this.audioResourceId = audioResourceId;
    }

    public Word(String defaultTranslation, String miwokTranslation, int audioResourceId) {
        this.defaultTranslation = defaultTranslation;
        this.miwokTranslation = miwokTranslation;
        this.audioResourceId = audioResourceId;
    }

    public String getDefaultTranslation() {
        return defaultTranslation;
    }

    public String getMiwokTranslation() {
        return miwokTranslation;
    }

    public int getImageResurceId() {
        return imageResurceId;
    }

    public int getAudioResourceId() {
        return audioResourceId;
    }

    public boolean hasImage(){
        return imageResurceId != NO_IMAGE_PROVIDED;
    }
}
