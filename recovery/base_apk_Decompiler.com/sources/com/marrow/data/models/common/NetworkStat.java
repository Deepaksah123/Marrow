package com.marrow.data.models.common;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.HashMap;
import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
@JsonIgnoreProperties(ignoreUnknown = true)
public class NetworkStat {
    public String as;
    public String city;
    public String country;
    public String isp;
    public double lat;
    public double lon;

    /* JADX INFO: renamed from: org, reason: collision with root package name */
    public String f1org;
    public String query;
    public String regionName;
    public String timezone;
    public String zip;

    public HashMap<String, String> toMap() {
        HashMap<String, String> map = new HashMap<>();
        map.put("ns_ip", this.query);
        map.put("ns_isp", this.isp);
        map.put("ns_region", this.regionName);
        map.put("ns_country", this.country);
        map.put("ns_city", this.city);
        return map;
    }

    public String simplify() {
        Locale locale = Locale.getDefault();
        String str = this.query;
        String str2 = this.isp;
        String str3 = this.regionName;
        return String.format(locale, "IP:%s/%s   City:%s, %s, %s", str, str2, str3, this.city, str3, this.country);
    }
}
