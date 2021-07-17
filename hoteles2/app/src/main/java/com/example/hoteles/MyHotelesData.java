package com.example.hoteles;

public class MyHotelesData {
    private String HotelesName;
    private String HotelesData;
    private Integer HotelesImage;

    public MyHotelesData(String hotelesName, String hotelesData, Integer hotelesImage) {
        HotelesName = hotelesName;
        HotelesData = hotelesData;
        HotelesImage = hotelesImage;
    }

    public String getHotelesName() {
        return HotelesName;
    }

    public void setHotelesName(String hotelesName) {
        HotelesName = hotelesName;
    }

    public String getHotelesData() {
        return HotelesData;
    }

    public void setHotelesData(String hotelesData) {
        HotelesData = hotelesData;
    }

    public Integer getHotelesImage() {
        return HotelesImage;
    }

    public void setHotelesImage(Integer hotelesImage) {
        HotelesImage = hotelesImage;
    }
}
