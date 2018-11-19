package kz.education.tursun.personalworkfive.entity;

public class Restaurant extends Sight {
    private int resId;

    public Restaurant(String title, String address, int resId) {
        super(title, address);
        this.resId = resId;
    }

    public int getResId() {
        return resId;
    }

    public void setResId(int resId) {
        this.resId = resId;
    }
}
