package razibkani.parcelablesample.model;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by razibkani on 4/17/16.
 */
public class Mahasiswa implements Parcelable {

    public int id;
    public String nama;
    public String tempatLahir;
    public String tanggalLahir;
    public String fakultas;
    public String jurusan;
    public String kelas;
    public String hobi;
    public String skill;
    public String motto;

    public Mahasiswa(int id, String nama, String tempatLahir, String tanggalLahir, String fakultas,
                     String jurusan, String kelas, String hobi, String skill, String motto) {
        this.id = id;
        this.nama = nama;
        this.tempatLahir = tempatLahir;
        this.tanggalLahir = tanggalLahir;
        this.fakultas = fakultas;
        this.jurusan = jurusan;
        this.kelas = kelas;
        this.hobi = hobi;
        this.skill = skill;
        this.motto = motto;
    }


    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(this.id);
        dest.writeString(this.nama);
        dest.writeString(this.tempatLahir);
        dest.writeString(this.tanggalLahir);
        dest.writeString(this.fakultas);
        dest.writeString(this.jurusan);
        dest.writeString(this.kelas);
        dest.writeString(this.hobi);
        dest.writeString(this.skill);
        dest.writeString(this.motto);
    }

    protected Mahasiswa(Parcel in) {
        this.id = in.readInt();
        this.nama = in.readString();
        this.tempatLahir = in.readString();
        this.tanggalLahir = in.readString();
        this.fakultas = in.readString();
        this.jurusan = in.readString();
        this.kelas = in.readString();
        this.hobi = in.readString();
        this.skill = in.readString();
        this.motto = in.readString();
    }

    public static final Parcelable.Creator<Mahasiswa> CREATOR = new Parcelable.Creator<Mahasiswa>() {
        @Override
        public Mahasiswa createFromParcel(Parcel source) {
            return new Mahasiswa(source);
        }

        @Override
        public Mahasiswa[] newArray(int size) {
            return new Mahasiswa[size];
        }
    };
}
