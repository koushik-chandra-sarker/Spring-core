package com.springCore.six_StandaloneCollections;

import java.util.List;
import java.util.Map;
import java.util.Properties;

public class Parson {
    private List<String> friends;
    private Map<String,Integer> feeStructure;
    private Properties properties;


    public Parson() {
    }

    @Override
    public String toString() {
        return "Parson{" +
                "friends=" + friends +
                ", \nfeeStructure=" + feeStructure +
                ", \nproperties=" + properties +
                '}';
    }

    public List<String> getFriends() {
        return friends;
    }

    public void setFriends(List<String> friends) {
        this.friends = friends;
    }

    public Map<String, Integer> getFeeStructure() {
        return feeStructure;
    }

    public void setFeeStructure(Map<String, Integer> feeStructure) {
        this.feeStructure = feeStructure;
    }

    public Properties getProperties() {
        return properties;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }
}
