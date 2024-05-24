package model;

public class Perusahaan {
    private String namaUsaha;
    private String provinsi;
    private String kota;
    private String produk[];
    private String katUsaha;
    private String katLain;
    private String omset;
    private int jmlPegawaiSblm;
    private int jmlPegawaiSkrg;
    private String operasi;

    public String getNamaUsaha() {
        return namaUsaha;
    }

    public void setNamaUsaha(String namaUsaha) {
        this.namaUsaha = namaUsaha;
    }

    public String getProvinsi() {
        return provinsi;
    }

    public void setProvinsi(String provinsi) {
        this.provinsi = provinsi;
    }

    public String getKota() {
        return kota;
    }

    public void setKota(String kota) {
        this.kota = kota;
    }

    public String[] getProduk() {
        return produk;
    }

    public void setProduk(String[] produk) {
        this.produk = produk;
    }

    public String getKatUsaha() {
        return katUsaha;
    }

    public void setKatUsaha(String katUsaha) {
        this.katUsaha = katUsaha;
    }

    public String getKatLain() {
        return katLain;
    }

    public void setKatLain(String katLain) {
        this.katLain = katLain;
    }

    public String getOmset() {
        return omset;
    }

    public void setOmset(String omset) {
        this.omset = omset;
    }

    public int getJmlPegawaiSblm() {
        return jmlPegawaiSblm;
    }

    public void setJmlPegawaiSblm(int jmlPegawaiSblm) {
        this.jmlPegawaiSblm = jmlPegawaiSblm;
    }

    public int getJmlPegawaiSkrg() {
        return jmlPegawaiSkrg;
    }

    public void setJmlPegawaiSkrg(int jmlPegawaiSkrg) {
        this.jmlPegawaiSkrg = jmlPegawaiSkrg;
    }

    public String getOperasi() {
        return operasi;
    }

    public void setOperasi(String operasi) {
        this.operasi = operasi;
    }
}
