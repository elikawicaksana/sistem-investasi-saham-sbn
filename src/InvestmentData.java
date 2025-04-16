package src;

import java.util.*;

public class InvestmentData {
    private static final List<Saham> sahamList = new ArrayList<>();
    private static final List<SBN> sbnList = new ArrayList<>();

    // ===== Saham =====
    public static void addSaham(Saham saham) {
        sahamList.add(saham);
    }

    public static void removeSaham(String code) {
        sahamList.removeIf(s -> s.getCode().equalsIgnoreCase(code));
    }

    public static List<Saham> getSahamList() {
        return sahamList;
    }

    // ===== SBN =====
    public static void addSBN(SBN sbn) {
        sbnList.add(sbn);
    }

    public static void removeSBN(String name) {
        sbnList.removeIf(s -> s.getName().equalsIgnoreCase(name));
    }

    public static List<SBN> getSBNList() {
        return sbnList;
    }
}
