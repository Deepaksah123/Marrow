package com.marrow.data.models.preference;

import android.text.TextUtils;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import java.util.HashMap;
import kotlin.parseDolbyChannelConfiguration;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class Preference {
    private boolean isPermanent;
    private String mKey;
    private String mValue;

    public String getKey() {
        return this.mKey;
    }

    public void setKey(String str) {
        this.mKey = str;
    }

    public String getValue() {
        return this.mValue;
    }

    public int getValueInt() {
        try {
            return Integer.parseInt(this.mValue);
        } catch (Exception unused) {
            return 0;
        }
    }

    public boolean getValueBoolean() {
        if (TextUtils.isEmpty(this.mValue)) {
            return false;
        }
        return parseDolbyChannelConfiguration.RemoteActionCompatParcelizer("true", this.mValue.toLowerCase()) || parseDolbyChannelConfiguration.RemoteActionCompatParcelizer(IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE, this.mValue);
    }

    public long getValueLong() {
        try {
            return Long.parseLong(this.mValue);
        } catch (Exception unused) {
            return 0L;
        }
    }

    public void setValue(String str) {
        this.mValue = str;
    }

    public void setValue(int i) {
        this.mValue = String.valueOf(i);
    }

    public void setValue(long j) {
        this.mValue = String.valueOf(j);
    }

    public static HashMap<String, String> asMap(Preference[] preferenceArr) {
        HashMap<String, String> map = new HashMap<>();
        if (preferenceArr != null) {
            for (Preference preference : preferenceArr) {
                map.put(preference.getKey(), preference.getValue());
            }
        }
        return map;
    }

    public void setValue(boolean z) {
        this.mValue = String.valueOf(z);
    }

    public JSONObject getValueAsJSON() {
        try {
            return new JSONObject(getValue());
        } catch (JSONException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static Preference newPair(String str, int i) {
        Preference preference = new Preference();
        preference.setKey(str);
        preference.setValue(i);
        return preference;
    }

    public static Preference newPair(String str, boolean z) {
        Preference preference = new Preference();
        preference.setKey(str);
        preference.setValue(z);
        return preference;
    }

    public static Preference newPair(String str, String str2) {
        Preference preference = new Preference();
        preference.setKey(str);
        preference.setValue(str2);
        return preference;
    }

    public static Preference newPair(String str, long j) {
        Preference preference = new Preference();
        preference.setKey(str);
        preference.setValue(j);
        return preference;
    }

    public static boolean booleanValue(Preference preference) {
        if (preference == null) {
            return false;
        }
        return preference.getValueBoolean();
    }

    public void setPermanent(boolean z) {
        this.isPermanent = z;
    }

    public boolean isPermanent() {
        return this.isPermanent;
    }
}
