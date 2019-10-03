package com.ing.mb.mwchapter;

public class MvpSuperDigitDGarbau implements SuperDigit {

    @Override
    public int calc(String n, String k) {
        return superDigit(buildNumber(String.valueOf(superDigit(n)), k));
    }

    private String buildNumber(String n, String k) {
    return new String(new char[Integer.parseInt(k)]).replace("\0", n);
    }

    private int superDigit(String p) {
        return (p.length() == 1) ? Integer.parseInt(p) : superDigit(String.valueOf(p.chars()
            .mapToObj(c -> (char) c)
            .mapToInt(ch -> Character.getNumericValue(ch)).sum()));
    }

}
