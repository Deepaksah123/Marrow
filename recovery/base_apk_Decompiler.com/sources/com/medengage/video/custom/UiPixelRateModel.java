package com.medengage.video.custom;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import java.lang.reflect.Constructor;
import kotlin.Metadata;
import kotlin.PlayerNotificationManager1;
import kotlin.buildFormat;
import kotlin.startForeground;
import kotlin.toMagicModuleMetaRepoModel;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\n\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\r\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u000bJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001d\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0003\u001a\u00020\u00132\u0006\u0010\u0005\u001a\u00020\t¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u001a\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019R\u001a\u0010\u001d\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001a\u0010\u0017\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010\u001c\u001a\u0004\b\u001b\u0010\u001eR\u001a\u0010\u001b\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001c\u001a\u0004\b\u001f\u0010\u001eR\u0011\u0010\u001f\u001a\u00020\u00108G¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0012"}, d2 = {"Lcom/medengage/video/custom/UiPixelRateModel;", "Landroid/os/Parcelable;", "Lo/PlayerNotificationManager1;", "p0", "", "p1", "p2", "<init>", "(Lo/PlayerNotificationManager1;ZZ)V", "", "describeContents", "()I", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "", "toString", "()Ljava/lang/String;", "Landroid/os/Parcel;", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "RemoteActionCompatParcelizer", "Lo/PlayerNotificationManager1;", "()Lo/PlayerNotificationManager1;", "IconCompatParcelizer", "write", "Z", "read", "()Z", "AudioAttributesCompatParcelizer"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class UiPixelRateModel implements Parcelable {
    public static final Parcelable.Creator<UiPixelRateModel> CREATOR;

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final boolean RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final PlayerNotificationManager1 IconCompatParcelizer;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final boolean write;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final boolean read;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public UiPixelRateModel(PlayerNotificationManager1 playerNotificationManager1, boolean z, boolean z2) {
        toMagicModuleMetaRepoModel.write(playerNotificationManager1, "");
        this.IconCompatParcelizer = playerNotificationManager1;
        this.read = z;
        this.RemoteActionCompatParcelizer = z2;
        this.write = playerNotificationManager1 == PlayerNotificationManager1.RemoteActionCompatParcelizer;
    }

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from getter */
    public final PlayerNotificationManager1 getIconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    /* JADX INFO: renamed from: read, reason: from getter */
    public final boolean getRead() {
        return this.read;
    }

    /* JADX INFO: renamed from: write, reason: from getter */
    public final boolean getRemoteActionCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from getter */
    public final boolean getWrite() {
        return this.write;
    }

    public final String IconCompatParcelizer() {
        buildFormat.Companion companion = buildFormat.INSTANCE;
        return buildFormat.Companion.IconCompatParcelizer(this.IconCompatParcelizer);
    }

    static {
        try {
            Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(1350202949);
            if (objRemoteActionCompatParcelizer == null) {
                objRemoteActionCompatParcelizer = startForeground.read((char) (TextUtils.lastIndexOf("", '0', 0, 0) + 1), KeyEvent.normalizeMetaState(0) + 24360, 49 - View.MeasureSpec.makeMeasureSpec(0, 0), 775140048, false, null, new Class[0]);
            }
            CREATOR = (Parcelable.Creator) ((Constructor) objRemoteActionCompatParcelizer).newInstance(null);
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof UiPixelRateModel)) {
            return false;
        }
        UiPixelRateModel uiPixelRateModel = (UiPixelRateModel) p0;
        return this.IconCompatParcelizer == uiPixelRateModel.IconCompatParcelizer && this.read == uiPixelRateModel.read && this.RemoteActionCompatParcelizer == uiPixelRateModel.RemoteActionCompatParcelizer;
    }

    public final int hashCode() {
        return (((this.IconCompatParcelizer.hashCode() * 31) + Boolean.hashCode(this.read)) * 31) + Boolean.hashCode(this.RemoteActionCompatParcelizer);
    }

    public final String toString() {
        PlayerNotificationManager1 playerNotificationManager1 = this.IconCompatParcelizer;
        boolean z = this.read;
        boolean z2 = this.RemoteActionCompatParcelizer;
        StringBuilder sb = new StringBuilder("UiPixelRateModel(IconCompatParcelizer=");
        sb.append(playerNotificationManager1);
        sb.append(", read=");
        sb.append(z);
        sb.append(", RemoteActionCompatParcelizer=");
        sb.append(z2);
        sb.append(")");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel p0, int p1) {
        toMagicModuleMetaRepoModel.write(p0, "");
        p0.writeString(this.IconCompatParcelizer.name());
        p0.writeInt(this.read ? 1 : 0);
        p0.writeInt(this.RemoteActionCompatParcelizer ? 1 : 0);
    }
}
