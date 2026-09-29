package com.clevertap.android.sdk;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public class CTInboxStyleConfig implements Parcelable {
    public static final Parcelable.Creator<CTInboxStyleConfig> CREATOR = new Parcelable.Creator<CTInboxStyleConfig>() { // from class: com.clevertap.android.sdk.CTInboxStyleConfig.3
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ CTInboxStyleConfig createFromParcel(Parcel parcel) {
            return write(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ CTInboxStyleConfig[] newArray(int i) {
            return write(i);
        }

        private static CTInboxStyleConfig write(Parcel parcel) {
            return new CTInboxStyleConfig(parcel);
        }

        private static CTInboxStyleConfig[] write(int i) {
            return new CTInboxStyleConfig[i];
        }
    };
    private String AudioAttributesCompatParcelizer;
    private String AudioAttributesImplApi21Parcelizer;
    private String AudioAttributesImplApi26Parcelizer;
    private String AudioAttributesImplBaseParcelizer;
    private String IconCompatParcelizer;
    private String MediaBrowserCompatCustomActionResultReceiver;
    private String MediaBrowserCompatItemReceiver;
    private String MediaBrowserCompatMediaItem;
    private String MediaBrowserCompatSearchResultReceiver;
    private String[] MediaDescriptionCompat;
    private String RemoteActionCompatParcelizer;
    private String read;
    private String write;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public CTInboxStyleConfig() {
        this.RemoteActionCompatParcelizer = "#FFFFFF";
        this.IconCompatParcelizer = "App Inbox";
        this.MediaBrowserCompatItemReceiver = "#333333";
        this.AudioAttributesCompatParcelizer = "#D3D4DA";
        this.read = "#333333";
        this.AudioAttributesImplBaseParcelizer = "#1C84FE";
        this.MediaBrowserCompatSearchResultReceiver = "#808080";
        this.AudioAttributesImplApi21Parcelizer = "#1C84FE";
        this.MediaBrowserCompatMediaItem = "#FFFFFF";
        this.MediaDescriptionCompat = new String[0];
        this.AudioAttributesImplApi26Parcelizer = "No Message(s) to show";
        this.MediaBrowserCompatCustomActionResultReceiver = "#000000";
        this.write = "ALL";
    }

    protected CTInboxStyleConfig(Parcel parcel) {
        this.RemoteActionCompatParcelizer = parcel.readString();
        this.IconCompatParcelizer = parcel.readString();
        this.MediaBrowserCompatItemReceiver = parcel.readString();
        this.AudioAttributesCompatParcelizer = parcel.readString();
        this.MediaDescriptionCompat = parcel.createStringArray();
        this.read = parcel.readString();
        this.AudioAttributesImplBaseParcelizer = parcel.readString();
        this.MediaBrowserCompatSearchResultReceiver = parcel.readString();
        this.AudioAttributesImplApi21Parcelizer = parcel.readString();
        this.MediaBrowserCompatMediaItem = parcel.readString();
        this.AudioAttributesImplApi26Parcelizer = parcel.readString();
        this.MediaBrowserCompatCustomActionResultReceiver = parcel.readString();
        this.write = parcel.readString();
    }

    public final String RemoteActionCompatParcelizer() {
        return this.read;
    }

    public final String IconCompatParcelizer() {
        return this.write;
    }

    public final String AudioAttributesCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    public final String write() {
        return this.RemoteActionCompatParcelizer;
    }

    public final String read() {
        return this.IconCompatParcelizer;
    }

    public final String AudioAttributesImplApi21Parcelizer() {
        return this.MediaBrowserCompatItemReceiver;
    }

    public final String AudioAttributesImplBaseParcelizer() {
        return this.AudioAttributesImplApi26Parcelizer;
    }

    public final String MediaBrowserCompatItemReceiver() {
        return this.MediaBrowserCompatCustomActionResultReceiver;
    }

    public final String MediaBrowserCompatCustomActionResultReceiver() {
        return this.AudioAttributesImplBaseParcelizer;
    }

    public final String AudioAttributesImplApi26Parcelizer() {
        return this.AudioAttributesImplApi21Parcelizer;
    }

    public final String MediaBrowserCompatMediaItem() {
        return this.MediaBrowserCompatMediaItem;
    }

    public final ArrayList<String> MediaDescriptionCompat() {
        return this.MediaDescriptionCompat == null ? new ArrayList<>() : new ArrayList<>(Arrays.asList(this.MediaDescriptionCompat));
    }

    public final String MediaMetadataCompat() {
        return this.MediaBrowserCompatSearchResultReceiver;
    }

    public final boolean MediaBrowserCompatSearchResultReceiver() {
        String[] strArr = this.MediaDescriptionCompat;
        return strArr != null && strArr.length > 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.RemoteActionCompatParcelizer);
        parcel.writeString(this.IconCompatParcelizer);
        parcel.writeString(this.MediaBrowserCompatItemReceiver);
        parcel.writeString(this.AudioAttributesCompatParcelizer);
        parcel.writeStringArray(this.MediaDescriptionCompat);
        parcel.writeString(this.read);
        parcel.writeString(this.AudioAttributesImplBaseParcelizer);
        parcel.writeString(this.MediaBrowserCompatSearchResultReceiver);
        parcel.writeString(this.AudioAttributesImplApi21Parcelizer);
        parcel.writeString(this.MediaBrowserCompatMediaItem);
        parcel.writeString(this.AudioAttributesImplApi26Parcelizer);
        parcel.writeString(this.MediaBrowserCompatCustomActionResultReceiver);
        parcel.writeString(this.write);
    }
}
