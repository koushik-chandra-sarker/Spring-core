package com.springCore.one_setterInjection.premitive;

public class students {
    private int StdId;
    private String StdName;
    private String StdAddress;

    public students() {
    }

    public students(int stdId, String stdName, String stdAddress) {
        StdId = stdId;
        StdName = stdName;
        StdAddress = stdAddress;
    }

    public int getStdId() {
        return StdId;
    }

    public void setStdId(int stdId) {
        System.out.println("Call setStdId.");
        StdId = stdId;
    }

    public String getStdName() {
        return StdName;
    }

    public void setStdName(String stdName) {
        System.out.println("Call setStdName.");

        StdName = stdName;
    }

    public String getStdAddress() {
        return StdAddress;
    }

    public void setStdAddress(String stdAddress) {
        System.out.println("Call setStdAddress.");

        StdAddress = stdAddress;
    }

    @Override
    public String toString() {
        return "students{" +
                "StdId=" + StdId +
                ", StdName='" + StdName + '\'' +
                ", StdAddress='" + StdAddress + '\'' +
                '}';
    }
}
