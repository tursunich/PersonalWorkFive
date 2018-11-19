package kz.education.tursun.personalworkfive.entity;

public class Museum extends Sight{
    private int resId;
    private String time;

    public Museum(String title, String address, int resId, String time) {
        super(title, address);
        this.resId = resId;
        this.time = time;
    }

    public int getResId() {
        return resId;
    }

    public void setResId(int resId) {
        this.resId = resId;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
