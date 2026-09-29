package com.clevertap.android.sdk.displayunits.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import in.juspay.hyper.constants.LogSubCategory;
import kotlin.RendererWakeupListener;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class CleverTapDisplayUnitContent implements Parcelable {
    public static final Parcelable.Creator<CleverTapDisplayUnitContent> CREATOR = new Parcelable.Creator<CleverTapDisplayUnitContent>() { // from class: com.clevertap.android.sdk.displayunits.model.CleverTapDisplayUnitContent.2
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ CleverTapDisplayUnitContent createFromParcel(Parcel parcel) {
            return write(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ CleverTapDisplayUnitContent[] newArray(int i) {
            return IconCompatParcelizer(i);
        }

        private static CleverTapDisplayUnitContent write(Parcel parcel) {
            return new CleverTapDisplayUnitContent(parcel, (byte) 0);
        }

        private static CleverTapDisplayUnitContent[] IconCompatParcelizer(int i) {
            return new CleverTapDisplayUnitContent[i];
        }
    };
    private String AudioAttributesCompatParcelizer;
    private String AudioAttributesImplApi21Parcelizer;
    private String AudioAttributesImplApi26Parcelizer;
    private String AudioAttributesImplBaseParcelizer;
    private String IconCompatParcelizer;
    private String MediaBrowserCompatCustomActionResultReceiver;
    private String MediaBrowserCompatItemReceiver;
    private String RemoteActionCompatParcelizer;
    private String read;
    private String write;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* synthetic */ CleverTapDisplayUnitContent(Parcel parcel, byte b) {
        this(parcel);
    }

    private CleverTapDisplayUnitContent(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10) {
        this.AudioAttributesImplApi26Parcelizer = str;
        this.AudioAttributesImplApi21Parcelizer = str2;
        this.AudioAttributesImplBaseParcelizer = str3;
        this.MediaBrowserCompatCustomActionResultReceiver = str4;
        this.read = str5;
        this.write = str6;
        this.IconCompatParcelizer = str7;
        this.MediaBrowserCompatItemReceiver = str8;
        this.RemoteActionCompatParcelizer = str9;
        this.AudioAttributesCompatParcelizer = str10;
    }

    private CleverTapDisplayUnitContent(Parcel parcel) {
        this.AudioAttributesImplApi26Parcelizer = parcel.readString();
        this.AudioAttributesImplApi21Parcelizer = parcel.readString();
        this.AudioAttributesImplBaseParcelizer = parcel.readString();
        this.MediaBrowserCompatCustomActionResultReceiver = parcel.readString();
        this.read = parcel.readString();
        this.write = parcel.readString();
        this.IconCompatParcelizer = parcel.readString();
        this.MediaBrowserCompatItemReceiver = parcel.readString();
        this.RemoteActionCompatParcelizer = parcel.readString();
        this.AudioAttributesCompatParcelizer = parcel.readString();
    }

    public final String read() {
        return this.AudioAttributesCompatParcelizer;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[ title:");
        sb.append(this.AudioAttributesImplApi26Parcelizer);
        sb.append(", titleColor:");
        sb.append(this.AudioAttributesImplApi21Parcelizer);
        sb.append(" message:");
        sb.append(this.AudioAttributesImplBaseParcelizer);
        sb.append(", messageColor:");
        sb.append(this.MediaBrowserCompatCustomActionResultReceiver);
        sb.append(", media:");
        sb.append(this.write);
        sb.append(", contentType:");
        sb.append(this.IconCompatParcelizer);
        sb.append(", posterUrl:");
        sb.append(this.MediaBrowserCompatItemReceiver);
        sb.append(", actionUrl:");
        sb.append(this.RemoteActionCompatParcelizer);
        sb.append(", icon:");
        sb.append(this.read);
        sb.append(", error:");
        sb.append(this.AudioAttributesCompatParcelizer);
        sb.append(" ]");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.AudioAttributesImplApi26Parcelizer);
        parcel.writeString(this.AudioAttributesImplApi21Parcelizer);
        parcel.writeString(this.AudioAttributesImplBaseParcelizer);
        parcel.writeString(this.MediaBrowserCompatCustomActionResultReceiver);
        parcel.writeString(this.read);
        parcel.writeString(this.write);
        parcel.writeString(this.IconCompatParcelizer);
        parcel.writeString(this.MediaBrowserCompatItemReceiver);
        parcel.writeString(this.RemoteActionCompatParcelizer);
        parcel.writeString(this.AudioAttributesCompatParcelizer);
    }

    static CleverTapDisplayUnitContent write(JSONObject jSONObject) {
        String str;
        String string;
        String str2;
        String string2;
        String str3;
        String str4;
        String string3;
        try {
            JSONObject jSONObject2 = jSONObject.has("title") ? jSONObject.getJSONObject("title") : null;
            String string4 = "";
            if (jSONObject2 != null) {
                String string5 = jSONObject2.has("text") ? jSONObject2.getString("text") : "";
                string = jSONObject2.has(TtmlNode.ATTR_TTS_COLOR) ? jSONObject2.getString(TtmlNode.ATTR_TTS_COLOR) : "";
                str = string5;
            } else {
                str = "";
                string = str;
            }
            JSONObject jSONObject3 = jSONObject.has("message") ? jSONObject.getJSONObject("message") : null;
            if (jSONObject3 != null) {
                String string6 = jSONObject3.has("text") ? jSONObject3.getString("text") : "";
                if (jSONObject3.has(TtmlNode.ATTR_TTS_COLOR)) {
                    string2 = jSONObject3.getString(TtmlNode.ATTR_TTS_COLOR);
                    str2 = string6;
                } else {
                    str2 = string6;
                    string2 = "";
                }
            } else {
                str2 = "";
                string2 = str2;
            }
            JSONObject jSONObject4 = jSONObject.has("icon") ? jSONObject.getJSONObject("icon") : null;
            String string7 = (jSONObject4 == null || !jSONObject4.has("url")) ? "" : jSONObject4.getString("url");
            JSONObject jSONObject5 = jSONObject.has("media") ? jSONObject.getJSONObject("media") : null;
            if (jSONObject5 != null) {
                String string8 = jSONObject5.has("url") ? jSONObject5.getString("url") : "";
                String string9 = jSONObject5.has("content_type") ? jSONObject5.getString("content_type") : "";
                if (jSONObject5.has("poster")) {
                    string3 = jSONObject5.getString("poster");
                    str4 = string9;
                    str3 = string8;
                } else {
                    str4 = string9;
                    str3 = string8;
                    string3 = "";
                }
            } else {
                str3 = "";
                str4 = str3;
                string3 = str4;
            }
            JSONObject jSONObject6 = jSONObject.has("action") ? jSONObject.getJSONObject("action") : null;
            if (jSONObject6 != null) {
                JSONObject jSONObject7 = jSONObject6.has("url") ? jSONObject6.getJSONObject("url") : null;
                if (jSONObject7 != null) {
                    JSONObject jSONObject8 = jSONObject7.has(LogSubCategory.LifeCycle.ANDROID) ? jSONObject7.getJSONObject(LogSubCategory.LifeCycle.ANDROID) : null;
                    if (jSONObject8 != null && jSONObject8.has("text")) {
                        string4 = jSONObject8.getString("text");
                    }
                }
            }
            return new CleverTapDisplayUnitContent(str, string, str2, string2, string7, str3, str4, string3, string4, null);
        } catch (Exception e) {
            e.getLocalizedMessage();
            RendererWakeupListener.AudioAttributesImplApi21Parcelizer();
            StringBuilder sb = new StringBuilder("Error Creating DisplayUnit Content from JSON : ");
            sb.append(e.getLocalizedMessage());
            return new CleverTapDisplayUnitContent("", "", "", "", "", "", "", "", "", sb.toString());
        }
    }
}
