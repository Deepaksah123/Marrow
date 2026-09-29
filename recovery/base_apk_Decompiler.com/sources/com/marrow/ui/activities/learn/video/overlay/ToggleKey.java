package com.marrow.ui.activities.learn.video.overlay;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.getMagicModuleTimeline;
import kotlin.toMagicModuleMetaRepoModel;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0086\u0001\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\r\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0005¢\u0006\u0004\b\f\u0010\rj\u0002\b\u000e"}, d2 = {"Lcom/marrow/ui/activities/learn/video/overlay/ToggleKey;", "Landroid/os/Parcelable;", "", "<init>", "(Ljava/lang/String;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "p0", "p1", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "IconCompatParcelizer"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ToggleKey implements Parcelable {
    public static final Parcelable.Creator<ToggleKey> CREATOR;
    public static final ToggleKey IconCompatParcelizer = new ToggleKey("INTERACTIVE");
    private static final /* synthetic */ ToggleKey[] RemoteActionCompatParcelizer;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    private ToggleKey(String str) {
    }

    static {
        ToggleKey[] toggleKeyArrWrite = write();
        RemoteActionCompatParcelizer = toggleKeyArrWrite;
        getMagicModuleTimeline.IconCompatParcelizer(toggleKeyArrWrite);
        CREATOR = new Parcelable.Creator<ToggleKey>() { // from class: com.marrow.ui.activities.learn.video.overlay.ToggleKey.write
            private static ToggleKey IconCompatParcelizer(Parcel parcel) {
                toMagicModuleMetaRepoModel.write(parcel, "");
                return ToggleKey.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ ToggleKey createFromParcel(Parcel parcel) {
                return IconCompatParcelizer(parcel);
            }

            private static ToggleKey[] RemoteActionCompatParcelizer(int i) {
                return new ToggleKey[i];
            }

            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ ToggleKey[] newArray(int i) {
                return RemoteActionCompatParcelizer(i);
            }
        };
    }

    private static final /* synthetic */ ToggleKey[] write() {
        return new ToggleKey[]{IconCompatParcelizer};
    }

    public static ToggleKey valueOf(String str) {
        return (ToggleKey) Enum.valueOf(ToggleKey.class, str);
    }

    public static ToggleKey[] values() {
        return (ToggleKey[]) RemoteActionCompatParcelizer.clone();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel p0, int p1) {
        toMagicModuleMetaRepoModel.write(p0, "");
        p0.writeString(name());
    }
}
