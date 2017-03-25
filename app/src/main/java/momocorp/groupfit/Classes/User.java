package momocorp.groupfit.Classes;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.ArrayList;

/**
 * Created by Satchin on 3/25/2017.
 */

public class User implements Parcelable{
    public String name;
    public String pic_uri;
    private int height;
    private int weight;
    private String UID;
    private String email;
    private String password;
    private int age;
    private ArrayList<String> selectedInterests;

    public User(String name, String pic_uri){
        this.name = name;
        this.pic_uri = pic_uri;
    }

    protected User(Parcel in) {
        name = in.readString();
        pic_uri = in.readString();
    }

    public User() {

    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(name);
        dest.writeString(pic_uri);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Creator<User> CREATOR = new Creator<User>() {
        @Override
        public User createFromParcel(Parcel in) {
            return new User(in);
        }

        @Override
        public User[] newArray(int size) {
            return new User[size];
        }
    };

    public void setHeight(int height) {
        this.height = height;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setUID(String UID) {
        this.UID = UID;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getHeight() {
        return height;
    }

    public int getWeight() {
        return weight;
    }

    public String getUID() {
        return UID;
    }


    public void setAge(int age) {
        this.age = age;
    }

    public void setSelectedInterests(ArrayList<String> selectedInterests) {
        this.selectedInterests = selectedInterests;
    }

    public ArrayList<String> getSelectedInterests() {
        return selectedInterests;
    }
}
