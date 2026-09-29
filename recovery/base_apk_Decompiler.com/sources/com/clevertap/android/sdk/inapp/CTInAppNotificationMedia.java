package com.clevertap.android.sdk.inapp;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.UUID;
import kotlin.MagicModuleRepositoryImplExternalSyntheticLambda0;
import kotlin.Metadata;
import kotlin.TestGroupLSModel;
import kotlin.getMagicModuleMeta;
import kotlin.toMagicModuleMetaRepoModel;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u000b\b\u0000\u0018\u0000  2\u00020\u0001:\u0001 B3\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nB\u0011\b\u0012\u0012\u0006\u0010\u0003\u001a\u00020\u000b¢\u0006\u0004\b\t\u0010\fJ\u000f\u0010\r\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0015\u001a\u00020\u0012¢\u0006\u0004\b\u0015\u0010\u0014J\r\u0010\u0016\u001a\u00020\u0012¢\u0006\u0004\b\u0016\u0010\u0014J\r\u0010\u0017\u001a\u00020\u0012¢\u0006\u0004\b\u0017\u0010\u0014J\r\u0010\u0018\u001a\u00020\u0012¢\u0006\u0004\b\u0018\u0010\u0014J\u001a\u0010\u001a\u001a\u00020\u00122\b\u0010\u0003\u001a\u0004\u0018\u00010\u0019H\u0096\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u001c\u0010\u000eR\"\u0010\u001e\u001a\u00020\u00028\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u0014\u0010\u0013\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\"\u0010\u001dR\u001a\u0010 \u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u001d\u001a\u0004\b \u0010\u001fR\u0016\u0010\"\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001dR\u001a\u0010\u0015\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b\"\u0010\u000e"}, d2 = {"Lcom/clevertap/android/sdk/inapp/CTInAppNotificationMedia;", "Landroid/os/Parcelable;", "", "p0", "p1", "p2", "p3", "", "p4", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "describeContents", "()I", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "", "read", "()Z", "AudioAttributesCompatParcelizer", "AudioAttributesImplApi21Parcelizer", "AudioAttributesImplBaseParcelizer", "MediaBrowserCompatCustomActionResultReceiver", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "Ljava/lang/String;", "RemoteActionCompatParcelizer", "()Ljava/lang/String;", "write", "(Ljava/lang/String;)V", "IconCompatParcelizer", "AudioAttributesImplApi26Parcelizer", "I"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class CTInAppNotificationMedia implements Parcelable {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private String RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: from kotlin metadata */
    private final int AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final String read;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final String IconCompatParcelizer;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final String write;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final Parcelable.Creator<CTInAppNotificationMedia> CREATOR = new read();

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from getter */
    public final String getRemoteActionCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    public final void write(String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        this.RemoteActionCompatParcelizer = str;
    }

    /* JADX INFO: renamed from: write, reason: from getter */
    public final String getWrite() {
        return this.write;
    }

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from getter */
    public final int getAudioAttributesCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    public CTInAppNotificationMedia(String str, String str2, String str3, String str4, int i) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(str2, "");
        toMagicModuleMetaRepoModel.write(str3, "");
        this.RemoteActionCompatParcelizer = str;
        this.read = str2;
        this.write = str3;
        this.IconCompatParcelizer = str4;
        this.AudioAttributesCompatParcelizer = i;
    }

    private CTInAppNotificationMedia(Parcel parcel) {
        String string = parcel.readString();
        this.RemoteActionCompatParcelizer = string == null ? "" : string;
        String string2 = parcel.readString();
        this.read = string2 == null ? "" : string2;
        String string3 = parcel.readString();
        this.write = string3 != null ? string3 : "";
        this.IconCompatParcelizer = parcel.readString();
        this.AudioAttributesCompatParcelizer = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel p0, int p1) {
        toMagicModuleMetaRepoModel.write(p0, "");
        p0.writeString(this.RemoteActionCompatParcelizer);
        p0.writeString(this.read);
        p0.writeString(this.write);
        p0.writeString(this.IconCompatParcelizer);
        p0.writeInt(this.AudioAttributesCompatParcelizer);
    }

    public final boolean read() {
        return !TestGroupLSModel.IconCompatParcelizer((CharSequence) this.RemoteActionCompatParcelizer) && TestGroupLSModel.MediaBrowserCompatCustomActionResultReceiver(this.read, "audio");
    }

    public final boolean AudioAttributesCompatParcelizer() {
        return !TestGroupLSModel.IconCompatParcelizer((CharSequence) this.RemoteActionCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.read, (Object) "image/gif");
    }

    public final boolean AudioAttributesImplApi21Parcelizer() {
        return (TestGroupLSModel.IconCompatParcelizer((CharSequence) this.RemoteActionCompatParcelizer) || !TestGroupLSModel.MediaBrowserCompatCustomActionResultReceiver(this.read, "image") || toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.read, (Object) "image/gif")) ? false : true;
    }

    public final boolean AudioAttributesImplBaseParcelizer() {
        return !TestGroupLSModel.IconCompatParcelizer((CharSequence) this.RemoteActionCompatParcelizer) && TestGroupLSModel.MediaBrowserCompatCustomActionResultReceiver(this.read, "video");
    }

    public final boolean MediaBrowserCompatCustomActionResultReceiver() {
        return AudioAttributesImplBaseParcelizer() || read();
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(getClass(), p0 != null ? p0.getClass() : null)) {
            return false;
        }
        toMagicModuleMetaRepoModel.read(p0, "");
        CTInAppNotificationMedia cTInAppNotificationMedia = (CTInAppNotificationMedia) p0;
        return this.AudioAttributesCompatParcelizer == cTInAppNotificationMedia.AudioAttributesCompatParcelizer && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.RemoteActionCompatParcelizer, (Object) cTInAppNotificationMedia.RemoteActionCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.read, (Object) cTInAppNotificationMedia.read) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.write, (Object) cTInAppNotificationMedia.write) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.IconCompatParcelizer, (Object) cTInAppNotificationMedia.IconCompatParcelizer);
    }

    public final int hashCode() {
        int i = this.AudioAttributesCompatParcelizer;
        int iHashCode = this.RemoteActionCompatParcelizer.hashCode();
        int iHashCode2 = this.read.hashCode();
        int iHashCode3 = this.write.hashCode();
        String str = this.IconCompatParcelizer;
        return (((((((i * 31) + iHashCode) * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (str != null ? str.hashCode() : 0);
    }

    /* JADX INFO: renamed from: com.clevertap.android.sdk.inapp.CTInAppNotificationMedia$write, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006¢\u0006\u0006\n\u0004\b\f\u0010\r"}, d2 = {"Lcom/clevertap/android/sdk/inapp/CTInAppNotificationMedia$write;", "", "<init>", "()V", "Lorg/json/JSONObject;", "p0", "", "p1", "Lcom/clevertap/android/sdk/inapp/CTInAppNotificationMedia;", "IconCompatParcelizer", "(Lorg/json/JSONObject;I)Lcom/clevertap/android/sdk/inapp/CTInAppNotificationMedia;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @getMagicModuleMeta
        public static CTInAppNotificationMedia IconCompatParcelizer(JSONObject p0, int p1) {
            String string;
            toMagicModuleMetaRepoModel.write(p0, "");
            String strOptString = p0.optString("content_type");
            toMagicModuleMetaRepoModel.write((Object) strOptString);
            if (TestGroupLSModel.IconCompatParcelizer((CharSequence) strOptString)) {
                return null;
            }
            String strOptString2 = p0.optString("url");
            toMagicModuleMetaRepoModel.write((Object) strOptString2);
            if (TestGroupLSModel.IconCompatParcelizer((CharSequence) strOptString2) || !TestGroupLSModel.MediaBrowserCompatCustomActionResultReceiver(strOptString, "image")) {
                string = null;
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append(UUID.randomUUID());
                sb.append(p0.optString("key"));
                string = sb.toString();
            }
            String strOptString3 = p0.optString("alt_text");
            toMagicModuleMetaRepoModel.write((Object) strOptString3);
            return new CTInAppNotificationMedia(strOptString2, strOptString, strOptString3, string, p1);
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }

    public static final class read implements Parcelable.Creator<CTInAppNotificationMedia> {
        read() {
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ CTInAppNotificationMedia createFromParcel(Parcel parcel) {
            return IconCompatParcelizer(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ CTInAppNotificationMedia[] newArray(int i) {
            return write(i);
        }

        private static CTInAppNotificationMedia IconCompatParcelizer(Parcel parcel) {
            toMagicModuleMetaRepoModel.write(parcel, "");
            return new CTInAppNotificationMedia(parcel, null);
        }

        private static CTInAppNotificationMedia[] write(int i) {
            return new CTInAppNotificationMedia[i];
        }
    }

    public /* synthetic */ CTInAppNotificationMedia(Parcel parcel, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this(parcel);
    }
}
