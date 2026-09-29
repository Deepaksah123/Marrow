package com.marrow.data.models.common;

import java.io.Serializable;
import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public class PresenterBundle {
    private HashMap<String, String> mStringMap = new HashMap<>();
    private HashMap<String, Integer> mIntegerMap = new HashMap<>();
    private HashMap<String, Long> mLongMap = new HashMap<>();
    private HashMap<String, Boolean> mBooleanMap = new HashMap<>();
    private HashMap<String, Double> mDoubleMap = new HashMap<>();
    private HashMap<String, PresenterBundle> mBundleMap = new HashMap<>();
    private HashMap<String, String[]> mStringArrayMap = new HashMap<>();
    private HashMap<String, Serializable> serializableMap = new HashMap<>();

    public HashMap<String, Serializable> getSerializableMap() {
        return this.serializableMap;
    }

    public HashMap<String, String> getStringMap() {
        return this.mStringMap;
    }

    public HashMap<String, Integer> getIntegerMap() {
        return this.mIntegerMap;
    }

    public HashMap<String, Long> getLongMap() {
        return this.mLongMap;
    }

    public HashMap<String, Boolean> getBooleanMap() {
        return this.mBooleanMap;
    }

    public HashMap<String, Double> getDoubleMap() {
        return this.mDoubleMap;
    }

    public HashMap<String, PresenterBundle> getBundleMap() {
        return this.mBundleMap;
    }

    public HashMap<String, String[]> getStringArrayMap() {
        return this.mStringArrayMap;
    }

    public Serializable getSerializable(String str) {
        return this.serializableMap.get(str);
    }

    public void putSerializable(String str, Serializable serializable) {
        this.serializableMap.put(str, serializable);
    }

    public void put(String str, int i) {
        this.mIntegerMap.put(str, Integer.valueOf(i));
    }

    public int getInt(String str, int i) {
        Integer num = this.mIntegerMap.get(str);
        return num == null ? i : num.intValue();
    }

    public int getInt(String str) {
        return this.mIntegerMap.get(str).intValue();
    }

    public void put(String str, String str2) {
        this.mStringMap.put(str, str2);
    }

    public String getString(String str, String str2) {
        String string = getString(str);
        return string == null ? str2 : string;
    }

    public String getString(String str) {
        return this.mStringMap.get(str);
    }

    public void put(String str, double d) {
        this.mDoubleMap.put(str, Double.valueOf(d));
    }

    public double getDouble(String str, double d) {
        Double d2 = this.mDoubleMap.get(str);
        return d2 == null ? d : d2.doubleValue();
    }

    public double getDouble(String str) {
        return this.mDoubleMap.get(str).doubleValue();
    }

    public void put(String str, long j) {
        this.mLongMap.put(str, Long.valueOf(j));
    }

    public long getLong(String str, long j) {
        Long l = this.mLongMap.get(str);
        return l == null ? j : l.longValue();
    }

    public long getLong(String str) {
        return this.mLongMap.get(str).longValue();
    }

    public void put(String str, boolean z) {
        this.mBooleanMap.put(str, Boolean.valueOf(z));
    }

    public boolean getBoolean(String str, boolean z) {
        Boolean bool = this.mBooleanMap.get(str);
        return bool == null ? z : bool.booleanValue();
    }

    public boolean getBoolean(String str) {
        return this.mBooleanMap.get(str).booleanValue();
    }

    public void put(String str, PresenterBundle presenterBundle) {
        this.mBundleMap.put(str, presenterBundle);
    }

    public PresenterBundle getBundle(String str) {
        return this.mBundleMap.get(str);
    }

    public void put(String str, String[] strArr) {
        this.mStringArrayMap.put(str, strArr);
    }

    public String[] getStringArray(String str) {
        return this.mStringArrayMap.get(str);
    }
}
