package com.cyogere.simplelist;

public class PersonWithImage {

    private String name;
    private String birthday;
    private String gender;
    private String imageURL;

    public String getImageURL() {
        return imageURL;
    }

    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }

    public PersonWithImage(String name, String birthday, String gender, String image) {
        this.name = name;
        this.birthday = birthday;
        this.gender = gender;
        this.imageURL = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
