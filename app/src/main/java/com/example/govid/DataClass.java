package com.example.govid;

public class DataClass {

    private final String dataTitle;
    private final int dataDesc; // Merubah Datadesc menjadi dataDesc
    private final String dataTitleSub;
    private final int dataImage; // Merubah dataimage menjadi dataImage

    public String getDataTitle() {
        return dataTitle;
    }

    public int getDataDesc() {
        return dataDesc;
    }

    public String getDataTitleSub() {
        return dataTitleSub;
    }

    public int getDataImage() {
        return dataImage;
    }

    public DataClass(String dataTitle, int dataDesc, String dataTitleSub, int dataImage) {
        this.dataTitle = dataTitle;
        this.dataDesc = dataDesc;
        this.dataTitleSub = dataTitleSub;
        this.dataImage = dataImage;
    }
}
