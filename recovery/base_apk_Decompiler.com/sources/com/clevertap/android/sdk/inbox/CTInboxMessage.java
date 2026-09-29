package com.clevertap.android.sdk.inbox;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.source.rtsp.SessionDescription;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.marrow.data.models.custommodule.FilterParams;
import java.util.ArrayList;
import java.util.List;
import kotlin.RendererWakeupListener;
import kotlin.SimpleBasePlayerState;
import kotlin.setAdBufferedPositionMs;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class CTInboxMessage implements Parcelable {
    public static final Parcelable.Creator<CTInboxMessage> CREATOR = new Parcelable.Creator<CTInboxMessage>() { // from class: com.clevertap.android.sdk.inbox.CTInboxMessage.5
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ CTInboxMessage createFromParcel(Parcel parcel) {
            return RemoteActionCompatParcelizer(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ CTInboxMessage[] newArray(int i) {
            return RemoteActionCompatParcelizer(i);
        }

        private static CTInboxMessage RemoteActionCompatParcelizer(Parcel parcel) {
            return new CTInboxMessage(parcel, (byte) 0);
        }

        private static CTInboxMessage[] RemoteActionCompatParcelizer(int i) {
            return new CTInboxMessage[i];
        }
    };
    private String AudioAttributesCompatParcelizer;
    private JSONObject AudioAttributesImplApi21Parcelizer;
    private long AudioAttributesImplApi26Parcelizer;
    private String AudioAttributesImplBaseParcelizer;
    private String IconCompatParcelizer;
    private long MediaBrowserCompatCustomActionResultReceiver;
    private ArrayList<CTInboxMessageContent> MediaBrowserCompatItemReceiver;
    private String MediaBrowserCompatMediaItem;
    private boolean MediaBrowserCompatSearchResultReceiver;
    private List<String> MediaDescriptionCompat;
    private String MediaMetadataCompat;
    private String RatingCompat;
    private String RemoteActionCompatParcelizer;
    private JSONObject onCommand;
    private setAdBufferedPositionMs onCustomAction;
    private JSONObject read;
    private String write;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* synthetic */ CTInboxMessage(Parcel parcel, byte b) {
        this(parcel);
    }

    public CTInboxMessage(JSONObject jSONObject) {
        this.read = new JSONObject();
        this.MediaBrowserCompatItemReceiver = new ArrayList<>();
        this.MediaDescriptionCompat = new ArrayList();
        this.AudioAttributesImplApi21Parcelizer = jSONObject;
        try {
            this.RatingCompat = jSONObject.has("id") ? jSONObject.getString("id") : SessionDescription.SUPPORTED_SDP_VERSION;
            this.AudioAttributesCompatParcelizer = jSONObject.has("wzrk_id") ? jSONObject.getString("wzrk_id") : "0_0";
            this.MediaBrowserCompatCustomActionResultReceiver = jSONObject.has("date") ? jSONObject.getLong("date") : System.currentTimeMillis() / 1000;
            this.AudioAttributesImplApi26Parcelizer = jSONObject.has("wzrk_ttl") ? jSONObject.getLong("wzrk_ttl") : System.currentTimeMillis() + 86400000;
            this.MediaBrowserCompatSearchResultReceiver = jSONObject.has("isRead") && jSONObject.getBoolean("isRead");
            JSONArray jSONArray = jSONObject.has(FilterParams.KEY_TAGS) ? jSONObject.getJSONArray(FilterParams.KEY_TAGS) : null;
            if (jSONArray != null) {
                for (int i = 0; i < jSONArray.length(); i++) {
                    this.MediaDescriptionCompat.add(jSONArray.getString(i));
                }
            }
            JSONObject jSONObject2 = jSONObject.has("msg") ? jSONObject.getJSONObject("msg") : null;
            if (jSONObject2 != null) {
                this.onCustomAction = jSONObject2.has("type") ? setAdBufferedPositionMs.read(jSONObject2.getString("type")) : setAdBufferedPositionMs.read("");
                this.write = jSONObject2.has("bg") ? jSONObject2.getString("bg") : "";
                JSONArray jSONArray2 = jSONObject2.has("content") ? jSONObject2.getJSONArray("content") : null;
                if (jSONArray2 != null) {
                    for (int i2 = 0; i2 < jSONArray2.length(); i2++) {
                        this.MediaBrowserCompatItemReceiver.add(new CTInboxMessageContent().MediaBrowserCompatCustomActionResultReceiver(jSONArray2.getJSONObject(i2)));
                    }
                }
                JSONArray jSONArray3 = jSONObject2.has("custom_kv") ? jSONObject2.getJSONArray("custom_kv") : null;
                if (jSONArray3 != null) {
                    for (int i3 = 0; i3 < jSONArray3.length(); i3++) {
                        JSONObject jSONObject3 = jSONArray3.getJSONObject(i3);
                        if (jSONObject3.has("key")) {
                            String string = jSONObject3.getString("key");
                            if (jSONObject3.has(AppMeasurementSdk.ConditionalUserProperty.VALUE)) {
                                this.read.put(string, jSONObject3.getJSONObject(AppMeasurementSdk.ConditionalUserProperty.VALUE).getString("text"));
                            }
                        }
                    }
                }
                this.MediaMetadataCompat = jSONObject2.has("orientation") ? jSONObject2.getString("orientation") : "";
            }
            this.onCommand = jSONObject.has("wzrkParams") ? jSONObject.getJSONObject("wzrkParams") : null;
        } catch (JSONException e) {
            e.getLocalizedMessage();
            RendererWakeupListener.MediaMetadataCompat();
        }
    }

    private CTInboxMessage(Parcel parcel) {
        this.read = new JSONObject();
        this.MediaBrowserCompatItemReceiver = new ArrayList<>();
        this.MediaDescriptionCompat = new ArrayList();
        try {
            this.MediaBrowserCompatMediaItem = parcel.readString();
            this.RemoteActionCompatParcelizer = parcel.readString();
            this.AudioAttributesImplBaseParcelizer = parcel.readString();
            this.IconCompatParcelizer = parcel.readString();
            this.MediaBrowserCompatCustomActionResultReceiver = parcel.readLong();
            this.AudioAttributesImplApi26Parcelizer = parcel.readLong();
            this.RatingCompat = parcel.readString();
            JSONObject jSONObject = null;
            this.AudioAttributesImplApi21Parcelizer = parcel.readByte() == 0 ? null : new JSONObject(parcel.readString());
            this.read = parcel.readByte() == 0 ? null : new JSONObject(parcel.readString());
            this.MediaBrowserCompatSearchResultReceiver = parcel.readByte() != 0;
            this.onCustomAction = (setAdBufferedPositionMs) parcel.readValue(setAdBufferedPositionMs.class.getClassLoader());
            if (parcel.readByte() == 1) {
                List arrayList = new ArrayList();
                this.MediaDescriptionCompat = arrayList;
                parcel.readList(arrayList, String.class.getClassLoader());
            } else {
                this.MediaDescriptionCompat = null;
            }
            this.write = parcel.readString();
            if (parcel.readByte() == 1) {
                ArrayList<CTInboxMessageContent> arrayList2 = new ArrayList<>();
                this.MediaBrowserCompatItemReceiver = arrayList2;
                parcel.readList(arrayList2, CTInboxMessageContent.class.getClassLoader());
            } else {
                this.MediaBrowserCompatItemReceiver = null;
            }
            this.MediaMetadataCompat = parcel.readString();
            this.AudioAttributesCompatParcelizer = parcel.readString();
            if (parcel.readByte() != 0) {
                jSONObject = new JSONObject(parcel.readString());
            }
            this.onCommand = jSONObject;
        } catch (JSONException e) {
            e.getLocalizedMessage();
            RendererWakeupListener.MediaMetadataCompat();
        }
    }

    public final String AudioAttributesCompatParcelizer() {
        return this.write;
    }

    public final ArrayList<SimpleBasePlayerState> IconCompatParcelizer() {
        ArrayList<SimpleBasePlayerState> arrayList = new ArrayList<>();
        for (CTInboxMessageContent cTInboxMessageContent : RemoteActionCompatParcelizer()) {
            arrayList.add(new SimpleBasePlayerState(cTInboxMessageContent.IconCompatParcelizer(), cTInboxMessageContent.AudioAttributesImplApi21Parcelizer()));
        }
        return arrayList;
    }

    public final long read() {
        return this.MediaBrowserCompatCustomActionResultReceiver;
    }

    public final ArrayList<CTInboxMessageContent> RemoteActionCompatParcelizer() {
        return this.MediaBrowserCompatItemReceiver;
    }

    public final String write() {
        return this.RatingCompat;
    }

    public final String AudioAttributesImplApi26Parcelizer() {
        return this.MediaMetadataCompat;
    }

    public final List<String> AudioAttributesImplApi21Parcelizer() {
        return this.MediaDescriptionCompat;
    }

    public final setAdBufferedPositionMs AudioAttributesImplBaseParcelizer() {
        return this.onCustomAction;
    }

    public final JSONObject MediaBrowserCompatItemReceiver() {
        JSONObject jSONObject = this.onCommand;
        return jSONObject == null ? new JSONObject() : jSONObject;
    }

    public final boolean MediaBrowserCompatCustomActionResultReceiver() {
        return this.MediaBrowserCompatSearchResultReceiver;
    }

    public final void MediaBrowserCompatMediaItem() {
        this.MediaBrowserCompatSearchResultReceiver = true;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.MediaBrowserCompatMediaItem);
        parcel.writeString(this.RemoteActionCompatParcelizer);
        parcel.writeString(this.AudioAttributesImplBaseParcelizer);
        parcel.writeString(this.IconCompatParcelizer);
        parcel.writeLong(this.MediaBrowserCompatCustomActionResultReceiver);
        parcel.writeLong(this.AudioAttributesImplApi26Parcelizer);
        parcel.writeString(this.RatingCompat);
        if (this.AudioAttributesImplApi21Parcelizer == null) {
            parcel.writeByte((byte) 0);
        } else {
            parcel.writeByte((byte) 1);
            parcel.writeString(this.AudioAttributesImplApi21Parcelizer.toString());
        }
        if (this.read == null) {
            parcel.writeByte((byte) 0);
        } else {
            parcel.writeByte((byte) 1);
            parcel.writeString(this.read.toString());
        }
        parcel.writeByte(this.MediaBrowserCompatSearchResultReceiver ? (byte) 1 : (byte) 0);
        parcel.writeValue(this.onCustomAction);
        if (this.MediaDescriptionCompat == null) {
            parcel.writeByte((byte) 0);
        } else {
            parcel.writeByte((byte) 1);
            parcel.writeList(this.MediaDescriptionCompat);
        }
        parcel.writeString(this.write);
        if (this.MediaBrowserCompatItemReceiver == null) {
            parcel.writeByte((byte) 0);
        } else {
            parcel.writeByte((byte) 1);
            parcel.writeList(this.MediaBrowserCompatItemReceiver);
        }
        parcel.writeString(this.MediaMetadataCompat);
        parcel.writeString(this.AudioAttributesCompatParcelizer);
        if (this.onCommand == null) {
            parcel.writeByte((byte) 0);
        } else {
            parcel.writeByte((byte) 1);
            parcel.writeString(this.onCommand.toString());
        }
    }
}
