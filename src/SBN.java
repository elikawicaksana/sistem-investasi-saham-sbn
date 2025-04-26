package src;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class SBN {
    private String name;
    private double interestRate;
    private int duration;
    private LocalDate maturityDate;
    private long nationalQuota;

    public SBN(String name, double interestRate, int duration, String maturityDateStr, long nationalQuota) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        this.name = name;
        this.interestRate = interestRate;
        this.duration = duration;
        this.maturityDate = LocalDate.parse(maturityDateStr, formatter);
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

    public LocalDate getMaturityDate() {
        return maturityDate;
    }

    public long getNationalQuota() {
        return nationalQuota;
    }

    @Override
    public String toString() {
        return String.format("Nama: %s | Bunga: %.2f%% | Durasi: %d tahun | Jatuh Tempo: %s | Kuota: %d",
                name, interestRate, duration, maturityDate.toString(), nationalQuota);
    }
}
