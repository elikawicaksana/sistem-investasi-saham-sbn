package src;

import java.util.*;

public class Admin {
    private List<SBN> sbnList;

    public Admin() {
        this.sbnList = new ArrayList<>();
    }

    public void addSBN(SBN sbn) {
        sbnList.add(sbn);
        System.out.println("src.SBN " + sbn.getName() + " berhasil ditambahkan!");
    }

    public void removeSBN(String name) {
        sbnList.removeIf(sbn -> sbn.getName().equals(name));
        System.out.println("src.SBN " + name  + "berhasil dihapus.");
    }

    public List<SBN> getSBNList() {
        return sbnList;
    }

}
