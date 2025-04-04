public class SBN {
    private String name; // Nama
    private double interestRate; // Bunga
    private int duration; // Jangka Waktu
    private String maturityDate; // Tanggal Jatuh Tempo
    private int nationalQuota; // Kuota Nasional

    public SBN(String name, double interestRate, int duration, String maturityDate, int nationalQuota) {
        this.name = name;
        this.interestRate = interestRate;
        this.duration = duration;
        this.maturityDate = maturityDate;
        this.nationalQuota = nationalQuota;
    }

    public String getName() {
        return name;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public int getDuration() {
        return duration;
    }

    public String getMaturityDate() {
        return maturityDate;
    }

    public int getNationalQuota() {
        return nationalQuota;
    }

}