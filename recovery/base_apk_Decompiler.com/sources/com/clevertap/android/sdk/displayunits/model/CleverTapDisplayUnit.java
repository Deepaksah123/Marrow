package com.clevertap.android.sdk.displayunits.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import kotlin.RendererWakeupListener;
import kotlin.lambdasetPlaybackParameters11;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class CleverTapDisplayUnit implements Parcelable {
    public static final Parcelable.Creator<CleverTapDisplayUnit> CREATOR = new Parcelable.Creator<CleverTapDisplayUnit>() { // from class: com.clevertap.android.sdk.displayunits.model.CleverTapDisplayUnit.1
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ CleverTapDisplayUnit createFromParcel(Parcel parcel) {
            return IconCompatParcelizer(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ CleverTapDisplayUnit[] newArray(int i) {
            return AudioAttributesCompatParcelizer(i);
        }

        private static CleverTapDisplayUnit IconCompatParcelizer(Parcel parcel) {
            return new CleverTapDisplayUnit(parcel, (byte) 0);
        }

        private static CleverTapDisplayUnit[] AudioAttributesCompatParcelizer(int i) {
            return new CleverTapDisplayUnit[i];
        }
    };
    private String AudioAttributesCompatParcelizer;
    private lambdasetPlaybackParameters11 AudioAttributesImplApi21Parcelizer;
    private JSONObject IconCompatParcelizer;
    private String MediaBrowserCompatCustomActionResultReceiver;
    private ArrayList<CleverTapDisplayUnitContent> RemoteActionCompatParcelizer;
    private HashMap<String, String> read;
    private String write;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* synthetic */ CleverTapDisplayUnit(Parcel parcel, byte b) {
        this(parcel);
    }

    public static CleverTapDisplayUnit RemoteActionCompatParcelizer(JSONObject jSONObject) {
        try {
            String string = jSONObject.has("wzrk_id") ? jSONObject.getString("wzrk_id") : "0_0";
            lambdasetPlaybackParameters11 lambdasetplaybackparameters11RemoteActionCompatParcelizer = jSONObject.has("type") ? lambdasetPlaybackParameters11.RemoteActionCompatParcelizer(jSONObject.getString("type")) : null;
            String string2 = jSONObject.has("bg") ? jSONObject.getString("bg") : "";
            JSONArray jSONArray = jSONObject.has("content") ? jSONObject.getJSONArray("content") : null;
            ArrayList arrayList = new ArrayList();
            if (jSONArray != null) {
                for (int i = 0; i < jSONArray.length(); i++) {
                    CleverTapDisplayUnitContent cleverTapDisplayUnitContentWrite = CleverTapDisplayUnitContent.write(jSONArray.getJSONObject(i));
                    if (TextUtils.isEmpty(cleverTapDisplayUnitContentWrite.read())) {
                        arrayList.add(cleverTapDisplayUnitContentWrite);
                    }
                }
            }
            return new CleverTapDisplayUnit(jSONObject, string, lambdasetplaybackparameters11RemoteActionCompatParcelizer, string2, arrayList, jSONObject.has("custom_kv") ? jSONObject.getJSONObject("custom_kv") : null, null);
        } catch (Exception e) {
            e.getLocalizedMessage();
            RendererWakeupListener.AudioAttributesImplApi21Parcelizer();
            StringBuilder sb = new StringBuilder("Error Creating Display Unit from JSON : ");
            sb.append(e.getLocalizedMessage());
            return new CleverTapDisplayUnit(null, "", null, null, null, null, sb.toString());
        }
    }

    private CleverTapDisplayUnit(JSONObject jSONObject, String str, lambdasetPlaybackParameters11 lambdasetplaybackparameters11, String str2, ArrayList<CleverTapDisplayUnitContent> arrayList, JSONObject jSONObject2, String str3) {
        this.IconCompatParcelizer = jSONObject;
        this.MediaBrowserCompatCustomActionResultReceiver = str;
        this.AudioAttributesImplApi21Parcelizer = lambdasetplaybackparameters11;
        this.write = str2;
        this.RemoteActionCompatParcelizer = arrayList;
        this.read = write(jSONObject2);
        this.AudioAttributesCompatParcelizer = str3;
    }

    private CleverTapDisplayUnit(Parcel parcel) {
        try {
            this.MediaBrowserCompatCustomActionResultReceiver = parcel.readString();
            this.AudioAttributesImplApi21Parcelizer = (lambdasetPlaybackParameters11) parcel.readValue(lambdasetPlaybackParameters11.class.getClassLoader());
            this.write = parcel.readString();
            JSONObject jSONObject = null;
            if (parcel.readByte() == 1) {
                ArrayList<CleverTapDisplayUnitContent> arrayList = new ArrayList<>();
                this.RemoteActionCompatParcelizer = arrayList;
                parcel.readList(arrayList, CleverTapDisplayUnitContent.class.getClassLoader());
            } else {
                this.RemoteActionCompatParcelizer = null;
            }
            this.read = parcel.readHashMap(null);
            if (parcel.readByte() != 0) {
                jSONObject = new JSONObject(parcel.readString());
            }
            this.IconCompatParcelizer = jSONObject;
            this.AudioAttributesCompatParcelizer = parcel.readString();
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder("Error Creating Display Unit from parcel : ");
            sb.append(e.getLocalizedMessage());
            this.AudioAttributesCompatParcelizer = sb.toString();
            RendererWakeupListener.AudioAttributesImplApi21Parcelizer();
        }
    }

    public final String read() {
        return this.AudioAttributesCompatParcelizer;
    }

    public final String write() {
        return this.MediaBrowserCompatCustomActionResultReceiver;
    }

    public String toString() {
        try {
            StringBuilder sb = new StringBuilder();
            sb.append("[");
            sb.append(" Unit id- ");
            sb.append(this.MediaBrowserCompatCustomActionResultReceiver);
            sb.append(", Type- ");
            lambdasetPlaybackParameters11 lambdasetplaybackparameters11 = this.AudioAttributesImplApi21Parcelizer;
            sb.append(lambdasetplaybackparameters11 != null ? lambdasetplaybackparameters11.toString() : null);
            sb.append(", bgColor- ");
            sb.append(this.write);
            ArrayList<CleverTapDisplayUnitContent> arrayList = this.RemoteActionCompatParcelizer;
            if (arrayList != null && !arrayList.isEmpty()) {
                for (int i = 0; i < this.RemoteActionCompatParcelizer.size(); i++) {
                    CleverTapDisplayUnitContent cleverTapDisplayUnitContent = this.RemoteActionCompatParcelizer.get(i);
                    if (cleverTapDisplayUnitContent != null) {
                        sb.append(", Content Item:");
                        sb.append(i);
                        sb.append(" ");
                        sb.append(cleverTapDisplayUnitContent.toString());
                        sb.append("\n");
                    }
                }
            }
            if (this.read != null) {
                sb.append(", Custom KV:");
                sb.append(this.read);
            }
            sb.append(", JSON -");
            sb.append(this.IconCompatParcelizer);
            sb.append(", Error-");
            sb.append(this.AudioAttributesCompatParcelizer);
            sb.append(" ]");
            return sb.toString();
        } catch (Exception unused) {
            RendererWakeupListener.AudioAttributesImplApi21Parcelizer();
            return super.toString();
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.MediaBrowserCompatCustomActionResultReceiver);
        parcel.writeValue(this.AudioAttributesImplApi21Parcelizer);
        parcel.writeString(this.write);
        if (this.RemoteActionCompatParcelizer == null) {
            parcel.writeByte((byte) 0);
        } else {
            parcel.writeByte((byte) 1);
            parcel.writeList(this.RemoteActionCompatParcelizer);
        }
        parcel.writeMap(this.read);
        if (this.IconCompatParcelizer == null) {
            parcel.writeByte((byte) 0);
        } else {
            parcel.writeByte((byte) 1);
            parcel.writeString(this.IconCompatParcelizer.toString());
        }
        parcel.writeString(this.AudioAttributesCompatParcelizer);
    }

    private static HashMap<String, String> write(JSONObject jSONObject) {
        if (jSONObject != null) {
            try {
                Iterator<String> itKeys = jSONObject.keys();
                if (itKeys != null) {
                    HashMap<String, String> map = null;
                    while (itKeys.hasNext()) {
                        String next = itKeys.next();
                        String string = jSONObject.getString(next);
                        if (!TextUtils.isEmpty(next)) {
                            if (map == null) {
                                map = new HashMap<>();
                            }
                            map.put(next, string);
                        }
                    }
                    return map;
                }
            } catch (Exception e) {
                e.getLocalizedMessage();
                RendererWakeupListener.AudioAttributesImplApi21Parcelizer();
            }
        }
        return null;
    }
}
