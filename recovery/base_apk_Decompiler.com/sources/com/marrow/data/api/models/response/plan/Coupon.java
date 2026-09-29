package com.marrow.data.api.models.response.plan;

import android.text.TextUtils;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.JsonNode;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import kotlin.DownloadHelper2;
import kotlin.DownloadHelperExternalSyntheticLambda2;
import kotlin.DownloadHelperExternalSyntheticLambda4;
import kotlin.ShuffleOrder;
import kotlin.cloneAndInsert;
import kotlin.getPercentDownloaded;
import kotlin.isDvbProfileDeclared;
import kotlin.notifyManifestPublishTimeExpired;
import kotlin.sendRemoveDownload;
import kotlin.sendSetRequirements;
import kotlin.sendSetStopReason;
import kotlin.setDownloadingStatesToQueued;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Coupon implements notifyManifestPublishTimeExpired {
    private static final String KEY_COUPON_TYPE = "coupon_type";
    public static final int KEY_COUPON_TYPE_RENEW = 2;
    private static final String KEY_COURSE_ID = "course_id";
    private static final String KEY_DISCOUNT = "discount";
    private static final String KEY_EXTENSION = "extension";
    private static final String KEY_EXTENSION_DAYS = "extension_days";
    private static final String KEY_FALL_BACK_COUPON = "fallback_coupon";
    private static final String KEY_ID = "_id";
    private static final String PLAN_TYPE_DEFAULT = "default";

    @JsonProperty("course_id")
    private String courseId;

    @JsonProperty(KEY_FALL_BACK_COUPON)
    private Coupon fallBack;
    private int mCouponType;
    private HashMap<String, Double> mDiscountMap;
    private int mExtensionDays;
    private HashMap<String, Integer> mExtensionMap;
    private String mId;

    public String getCouponCode() {
        return this.mId;
    }

    @JsonSetter("_id")
    public void setCouponCode(String str) {
        this.mId = str;
    }

    public int getCouponType() {
        return this.mCouponType;
    }

    @JsonSetter(KEY_COUPON_TYPE)
    public void setCouponType(int i) {
        this.mCouponType = i;
    }

    @JsonSetter(KEY_EXTENSION_DAYS)
    public void setExtensionDays(int i) {
        this.mExtensionDays = i;
    }

    @JsonSetter(KEY_DISCOUNT)
    public void setDiscount(JsonNode jsonNode) {
        Iterator<String> itFieldNames = jsonNode.fieldNames();
        this.mDiscountMap = new HashMap<>();
        while (itFieldNames.hasNext()) {
            String next = itFieldNames.next();
            this.mDiscountMap.put(next, Double.valueOf(jsonNode.get(next).doubleValue()));
        }
    }

    @JsonSetter(KEY_EXTENSION)
    public void setExtension(JsonNode jsonNode) {
        Iterator<String> itFieldNames = jsonNode.fieldNames();
        this.mExtensionMap = new HashMap<>();
        while (itFieldNames.hasNext()) {
            String next = itFieldNames.next();
            this.mExtensionMap.put(next, Integer.valueOf(jsonNode.get(next).intValue()));
        }
    }

    public double getDiscount(String str) {
        HashMap<String, Double> map = this.mDiscountMap;
        if (map == null || map.size() == 0) {
            return 0.0d;
        }
        if (this.mDiscountMap.containsKey(str)) {
            return this.mDiscountMap.get(str).doubleValue();
        }
        if (this.mDiscountMap.containsKey("default")) {
            return this.mDiscountMap.get("default").doubleValue();
        }
        return 0.0d;
    }

    public boolean isValidForPlan(String str) {
        HashMap<String, Double> map = this.mDiscountMap;
        if (map == null || map.size() <= 0) {
            return false;
        }
        return this.mDiscountMap.containsKey(str) || this.mDiscountMap.containsKey("default");
    }

    public int getExtension(String str) {
        HashMap<String, Integer> map = this.mExtensionMap;
        if (map == null || map.size() == 0) {
            return 0;
        }
        if (this.mExtensionMap.containsKey(str)) {
            return this.mExtensionMap.get(str).intValue();
        }
        if (this.mExtensionMap.containsKey("default")) {
            return this.mExtensionMap.get("default").intValue();
        }
        return 0;
    }

    public boolean isValid() {
        String str = this.mId;
        return str != null && str.length() > 0;
    }

    public void fromJSON(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            fromJSON(new JSONObject(str));
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    @Override // kotlin.notifyManifestPublishTimeExpired
    public void fromJSON(JSONObject jSONObject) {
        if (jSONObject != null) {
            this.mId = jSONObject.optString("_id");
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(KEY_DISCOUNT);
            JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject(KEY_EXTENSION);
            this.fallBack = (Coupon) new setDownloadingStatesToQueued().IconCompatParcelizer(jSONObject.optString(KEY_FALL_BACK_COUPON), Coupon.class);
            this.courseId = jSONObject.optString("course_id");
            this.mCouponType = jSONObject.optInt(KEY_COUPON_TYPE);
            if (jSONObjectOptJSONObject != null) {
                Iterator<String> itKeys = jSONObjectOptJSONObject.keys();
                this.mDiscountMap = new HashMap<>();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    this.mDiscountMap.put(next, Double.valueOf(jSONObjectOptJSONObject.optDouble(next)));
                }
            }
            if (jSONObjectOptJSONObject2 != null) {
                Iterator<String> itKeys2 = jSONObjectOptJSONObject2.keys();
                this.mExtensionMap = new HashMap<>();
                while (itKeys2.hasNext()) {
                    String next2 = itKeys2.next();
                    this.mExtensionMap.put(next2, Integer.valueOf(jSONObjectOptJSONObject2.optInt(next2)));
                }
            }
        }
    }

    public boolean belongsToCourseId(int i) {
        return String.valueOf(i).equals(this.courseId);
    }

    public JSONObject toJSON() {
        JSONObject jSONObject = new JSONObject();
        isDvbProfileDeclared.write(jSONObject, "_id", this.mId);
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        if (this.fallBack != null) {
            isDvbProfileDeclared.write(jSONObject, KEY_FALL_BACK_COUPON, new setDownloadingStatesToQueued().AudioAttributesCompatParcelizer(this.fallBack));
        }
        HashMap<String, Double> map = this.mDiscountMap;
        if (map != null) {
            for (String str : map.keySet()) {
                isDvbProfileDeclared.read(jSONObject2, str, Double.valueOf(this.mDiscountMap.get(str).doubleValue()));
            }
        }
        HashMap<String, Integer> map2 = this.mExtensionMap;
        if (map2 != null) {
            for (String str2 : map2.keySet()) {
                isDvbProfileDeclared.read(jSONObject3, str2, Integer.valueOf(this.mExtensionMap.get(str2).intValue()));
            }
        }
        isDvbProfileDeclared.read(jSONObject, KEY_DISCOUNT, jSONObject2);
        isDvbProfileDeclared.read(jSONObject, KEY_EXTENSION, jSONObject3);
        isDvbProfileDeclared.write(jSONObject, "course_id", this.courseId);
        isDvbProfileDeclared.read(jSONObject, KEY_COUPON_TYPE, Integer.valueOf(this.mCouponType));
        return jSONObject;
    }

    public static String getCouponCode(Coupon coupon) {
        return coupon != null ? coupon.getCouponCode() : "";
    }

    private int getDaysExtension() {
        return this.mExtensionDays;
    }

    public Coupon getFallBack() {
        return this.fallBack;
    }

    public HashMap<String, Double> getDiscountGroup() {
        return this.mDiscountMap;
    }

    public HashMap<String, Integer> getExtensionGroup() {
        return this.mExtensionMap;
    }

    public final /* synthetic */ void write(setDownloadingStatesToQueued setdownloadingstatestoqueued, DownloadHelper2 downloadHelper2, sendSetStopReason sendsetstopreason) throws IOException {
        downloadHelper2.RemoteActionCompatParcelizer();
        IconCompatParcelizer(setdownloadingstatestoqueued, downloadHelper2, sendsetstopreason);
        downloadHelper2.IconCompatParcelizer();
    }

    private /* synthetic */ void IconCompatParcelizer(setDownloadingStatesToQueued setdownloadingstatestoqueued, DownloadHelper2 downloadHelper2, sendSetStopReason sendsetstopreason) throws IOException {
        if (this != this.courseId) {
            sendsetstopreason.IconCompatParcelizer(downloadHelper2, TsExtractor.TS_STREAM_TYPE_DTS);
            downloadHelper2.AudioAttributesCompatParcelizer(this.courseId);
        }
        if (this != this.fallBack) {
            sendsetstopreason.IconCompatParcelizer(downloadHelper2, 144);
            Coupon coupon = this.fallBack;
            sendSetRequirements.write(setdownloadingstatestoqueued, Coupon.class, coupon).read(downloadHelper2, coupon);
        }
        sendsetstopreason.IconCompatParcelizer(downloadHelper2, TsExtractor.TS_STREAM_TYPE_AC3);
        downloadHelper2.AudioAttributesCompatParcelizer(Integer.valueOf(this.mCouponType));
        if (this != this.mDiscountMap) {
            sendsetstopreason.IconCompatParcelizer(downloadHelper2, 178);
            ShuffleOrder shuffleOrder = new ShuffleOrder();
            HashMap<String, Double> map = this.mDiscountMap;
            sendSetRequirements.write(setdownloadingstatestoqueued, shuffleOrder, map).read(downloadHelper2, map);
        }
        sendsetstopreason.IconCompatParcelizer(downloadHelper2, 97);
        downloadHelper2.AudioAttributesCompatParcelizer(Integer.valueOf(this.mExtensionDays));
        if (this != this.mExtensionMap) {
            sendsetstopreason.IconCompatParcelizer(downloadHelper2, 168);
            cloneAndInsert cloneandinsert = new cloneAndInsert();
            HashMap<String, Integer> map2 = this.mExtensionMap;
            sendSetRequirements.write(setdownloadingstatestoqueued, cloneandinsert, map2).read(downloadHelper2, map2);
        }
        if (this != this.mId) {
            sendsetstopreason.IconCompatParcelizer(downloadHelper2, 170);
            downloadHelper2.AudioAttributesCompatParcelizer(this.mId);
        }
    }

    public final /* synthetic */ void AudioAttributesCompatParcelizer(setDownloadingStatesToQueued setdownloadingstatestoqueued, DownloadHelperExternalSyntheticLambda4 downloadHelperExternalSyntheticLambda4, sendRemoveDownload sendremovedownload) throws IOException {
        downloadHelperExternalSyntheticLambda4.AudioAttributesCompatParcelizer();
        while (downloadHelperExternalSyntheticLambda4.AudioAttributesImplApi21Parcelizer()) {
            read(setdownloadingstatestoqueued, downloadHelperExternalSyntheticLambda4, sendremovedownload.AudioAttributesCompatParcelizer(downloadHelperExternalSyntheticLambda4));
        }
        downloadHelperExternalSyntheticLambda4.RemoteActionCompatParcelizer();
    }

    private /* synthetic */ void read(setDownloadingStatesToQueued setdownloadingstatestoqueued, DownloadHelperExternalSyntheticLambda4 downloadHelperExternalSyntheticLambda4, int i) throws IOException {
        boolean z = downloadHelperExternalSyntheticLambda4.onCustomAction() != DownloadHelperExternalSyntheticLambda2.NULL;
        if (i == 3) {
            if (z) {
                this.fallBack = (Coupon) setdownloadingstatestoqueued.read(Coupon.class).AudioAttributesCompatParcelizer(downloadHelperExternalSyntheticLambda4);
                return;
            } else {
                this.fallBack = null;
                downloadHelperExternalSyntheticLambda4.MediaDescriptionCompat();
                return;
            }
        }
        if (i == 7) {
            if (z) {
                this.mExtensionMap = (HashMap) setdownloadingstatestoqueued.IconCompatParcelizer(new cloneAndInsert()).AudioAttributesCompatParcelizer(downloadHelperExternalSyntheticLambda4);
                return;
            } else {
                this.mExtensionMap = null;
                downloadHelperExternalSyntheticLambda4.MediaDescriptionCompat();
                return;
            }
        }
        if (i == 23) {
            if (z) {
                this.mDiscountMap = (HashMap) setdownloadingstatestoqueued.IconCompatParcelizer(new ShuffleOrder()).AudioAttributesCompatParcelizer(downloadHelperExternalSyntheticLambda4);
                return;
            } else {
                this.mDiscountMap = null;
                downloadHelperExternalSyntheticLambda4.MediaDescriptionCompat();
                return;
            }
        }
        if (i == 52) {
            if (!z) {
                this.courseId = null;
                downloadHelperExternalSyntheticLambda4.MediaDescriptionCompat();
                return;
            } else if (downloadHelperExternalSyntheticLambda4.onCustomAction() != DownloadHelperExternalSyntheticLambda2.BOOLEAN) {
                this.courseId = downloadHelperExternalSyntheticLambda4.MediaBrowserCompatSearchResultReceiver();
                return;
            } else {
                this.courseId = Boolean.toString(downloadHelperExternalSyntheticLambda4.AudioAttributesImplApi26Parcelizer());
                return;
            }
        }
        if (i == 55) {
            if (!z) {
                downloadHelperExternalSyntheticLambda4.MediaDescriptionCompat();
                return;
            }
            try {
                this.mExtensionDays = downloadHelperExternalSyntheticLambda4.MediaBrowserCompatItemReceiver();
                return;
            } catch (NumberFormatException e) {
                throw new getPercentDownloaded(e);
            }
        }
        if (i == 109) {
            if (!z) {
                this.mId = null;
                downloadHelperExternalSyntheticLambda4.MediaDescriptionCompat();
                return;
            } else if (downloadHelperExternalSyntheticLambda4.onCustomAction() != DownloadHelperExternalSyntheticLambda2.BOOLEAN) {
                this.mId = downloadHelperExternalSyntheticLambda4.MediaBrowserCompatSearchResultReceiver();
                return;
            } else {
                this.mId = Boolean.toString(downloadHelperExternalSyntheticLambda4.AudioAttributesImplApi26Parcelizer());
                return;
            }
        }
        if (i != 111) {
            downloadHelperExternalSyntheticLambda4.handleMediaPlayPauseIfPendingOnHandler();
        } else {
            if (!z) {
                downloadHelperExternalSyntheticLambda4.MediaDescriptionCompat();
                return;
            }
            try {
                this.mCouponType = downloadHelperExternalSyntheticLambda4.MediaBrowserCompatItemReceiver();
            } catch (NumberFormatException e2) {
                throw new getPercentDownloaded(e2);
            }
        }
    }
}
