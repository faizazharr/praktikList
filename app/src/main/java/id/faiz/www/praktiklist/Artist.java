package id.faiz.www.praktiklist;

import androidx.annotation.NonNull;

class Artist {
    private String nama;
    private int follower;
    private String kelamin;

    public Artist(String nama, int follower, String kelamin) {
        this.nama = nama;
        this.follower = follower;
        this.kelamin = kelamin;
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

    public String getKelamin() {
        return kelamin;
    }

    public void setKelamin(String kelamin) {
        this.kelamin = kelamin;
    }

    @NonNull
    @Override
    public String toString() {
        return super.toString();
    }
}
