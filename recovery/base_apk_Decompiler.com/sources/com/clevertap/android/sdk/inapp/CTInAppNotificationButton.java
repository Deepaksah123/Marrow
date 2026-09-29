package com.clevertap.android.sdk.inapp;

import android.os.Parcel;
import android.os.Parcelable;
import com.clevertap.android.sdk.inapp.CTInAppAction;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import kotlin.MagicModuleRepositoryImplExternalSyntheticLambda0;
import kotlin.Metadata;
import kotlin.toMagicModuleMetaRepoModel;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u0011\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0011\b\u0012\u0012\u0006\u0010\u0003\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u0003\u001a\u0004\u0018\u00010\u000fH\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0013\u0010\nR\u0017\u0010\u0019\u001a\u00020\u00148\u0007¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0017\u001a\u00020\u00148\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u0016\u001a\u0004\b\u0019\u0010\u0018R\u001a\u0010\u001b\u001a\u00020\u00148\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u0016\u001a\u0004\b\u001b\u0010\u0018R\u001a\u0010\u001a\u001a\u00020\u00148\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u0016\u001a\u0004\b\u001a\u0010\u0018R\u001a\u0010\u001c\u001a\u00020\u00148\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u0016\u001a\u0004\b\u001c\u0010\u0018R\u0016\u0010\u0015\u001a\u0004\u0018\u00010\u001e8\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u001f"}, d2 = {"Lcom/clevertap/android/sdk/inapp/CTInAppNotificationButton;", "Landroid/os/Parcelable;", "Lorg/json/JSONObject;", "p0", "<init>", "(Lorg/json/JSONObject;)V", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "", "describeContents", "()I", "p1", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "", "AudioAttributesImplBaseParcelizer", "Ljava/lang/String;", "read", "()Ljava/lang/String;", "IconCompatParcelizer", "write", "RemoteActionCompatParcelizer", "AudioAttributesCompatParcelizer", "AudioAttributesImplApi26Parcelizer", "Lcom/clevertap/android/sdk/inapp/CTInAppAction;", "Lcom/clevertap/android/sdk/inapp/CTInAppAction;"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class CTInAppNotificationButton implements Parcelable {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final String write;

    /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: from kotlin metadata */
    private final String AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: from kotlin metadata */
    private final String IconCompatParcelizer;
    private final String RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    public final CTInAppAction AudioAttributesImplBaseParcelizer;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final String read;
    public static final Parcelable.Creator<CTInAppNotificationButton> CREATOR = new RemoteActionCompatParcelizer();

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX INFO: renamed from: read, reason: from getter */
    public final String getIconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from getter */
    public final String getRead() {
        return this.read;
    }

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from getter */
    public final String getRemoteActionCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    /* JADX INFO: renamed from: write, reason: from getter */
    public final String getWrite() {
        return this.write;
    }

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from getter */
    public final String getAudioAttributesCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    public CTInAppNotificationButton(JSONObject jSONObject) {
        toMagicModuleMetaRepoModel.write(jSONObject, "");
        this.IconCompatParcelizer = jSONObject.optString("text");
        this.AudioAttributesCompatParcelizer = jSONObject.optString(TtmlNode.ATTR_TTS_COLOR, "#0000FF");
        this.read = jSONObject.optString("bg", "#FFFFFF");
        this.RemoteActionCompatParcelizer = jSONObject.optString("border", "#FFFFFF");
        this.write = jSONObject.optString("radius");
        CTInAppAction.Companion companion = CTInAppAction.INSTANCE;
        this.AudioAttributesImplBaseParcelizer = CTInAppAction.Companion.IconCompatParcelizer(jSONObject.optJSONObject("actions"));
    }

    private CTInAppNotificationButton(Parcel parcel) {
        String string = parcel.readString();
        this.IconCompatParcelizer = string == null ? "" : string;
        String string2 = parcel.readString();
        this.AudioAttributesCompatParcelizer = string2 == null ? "#0000FF" : string2;
        String string3 = parcel.readString();
        this.read = string3 == null ? "#FFFFFF" : string3;
        String string4 = parcel.readString();
        this.RemoteActionCompatParcelizer = string4 != null ? string4 : "#FFFFFF";
        String string5 = parcel.readString();
        this.write = string5 != null ? string5 : "";
        this.AudioAttributesImplBaseParcelizer = (CTInAppAction) parcel.readParcelable(CTInAppAction.class.getClassLoader());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel p0, int p1) {
        toMagicModuleMetaRepoModel.write(p0, "");
        p0.writeString(this.IconCompatParcelizer);
        p0.writeString(this.AudioAttributesCompatParcelizer);
        p0.writeString(this.read);
        p0.writeString(this.RemoteActionCompatParcelizer);
        p0.writeString(this.write);
        p0.writeParcelable(this.AudioAttributesImplBaseParcelizer, p1);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(getClass(), p0 != null ? p0.getClass() : null)) {
            return false;
        }
        toMagicModuleMetaRepoModel.read(p0, "");
        CTInAppNotificationButton cTInAppNotificationButton = (CTInAppNotificationButton) p0;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.read, (Object) cTInAppNotificationButton.read) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.RemoteActionCompatParcelizer, (Object) cTInAppNotificationButton.RemoteActionCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.write, (Object) cTInAppNotificationButton.write) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.IconCompatParcelizer, (Object) cTInAppNotificationButton.IconCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.AudioAttributesCompatParcelizer, (Object) cTInAppNotificationButton.AudioAttributesCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.AudioAttributesImplBaseParcelizer, cTInAppNotificationButton.AudioAttributesImplBaseParcelizer);
    }

    public final int hashCode() {
        int iHashCode = this.read.hashCode();
        int iHashCode2 = this.RemoteActionCompatParcelizer.hashCode();
        int iHashCode3 = this.write.hashCode();
        int iHashCode4 = this.IconCompatParcelizer.hashCode();
        int iHashCode5 = this.AudioAttributesCompatParcelizer.hashCode();
        CTInAppAction cTInAppAction = this.AudioAttributesImplBaseParcelizer;
        return (((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + (cTInAppAction != null ? cTInAppAction.hashCode() : 0);
    }

    public static final class RemoteActionCompatParcelizer implements Parcelable.Creator<CTInAppNotificationButton> {
        RemoteActionCompatParcelizer() {
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ CTInAppNotificationButton createFromParcel(Parcel parcel) {
            return AudioAttributesCompatParcelizer(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ CTInAppNotificationButton[] newArray(int i) {
            return write(i);
        }

        private static CTInAppNotificationButton AudioAttributesCompatParcelizer(Parcel parcel) {
            toMagicModuleMetaRepoModel.write(parcel, "");
            return new CTInAppNotificationButton(parcel, null);
        }

        private static CTInAppNotificationButton[] write(int i) {
            return new CTInAppNotificationButton[i];
        }
    }

    public /* synthetic */ CTInAppNotificationButton(Parcel parcel, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this(parcel);
    }
}
