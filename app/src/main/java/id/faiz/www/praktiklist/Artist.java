package id.faiz.www.praktiklist;

import androidx.annotation.NonNull;

class Artist {
    private String nama;
    private int follower;
    private String category;
    private String countryCode;

    public Artist(String nama, int follower, String category, String countryCode) {
        this.nama = nama;
        this.follower = follower;
        this.category = category;
        this.countryCode = countryCode;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getFollower() {
        return follower;
    }

    public void setFollower(int follower) {
        this.follower = follower;
    }



    @NonNull
    @Override
    public String toString() {
        return super.toString();
    }
}
