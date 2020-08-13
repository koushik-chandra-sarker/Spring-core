package com.springCore.two_constructorInjection;

import java.util.Map;

public class Certificats {
    private String CertificateName;
    private Map<String, String> Grade;

    public Certificats(String certificateName, Map<String, String> Grade) {
        this.CertificateName = certificateName;
        this.Grade = Grade;
    }

    @Override
    public String toString() {
        return "Certificats{" +
                "CertificateName='" + CertificateName + '\'' +
                ", Grade=" + Grade +
                '}';
    }
}
