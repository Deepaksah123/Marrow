package com.marrow.ui.activities.learn.video.overlay;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.getMagicModuleTimeline;
import kotlin.toMagicModuleMetaRepoModel;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\r\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0005¢\u0006\u0004\b\f\u0010\rj\u0002\b\u000ej\u0002\b\u000f"}, d2 = {"Lcom/marrow/ui/activities/learn/video/overlay/NavKey;", "Landroid/os/Parcelable;", "", "<init>", "(Ljava/lang/String;I)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "p0", "p1", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "IconCompatParcelizer", "RemoteActionCompatParcelizer"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class NavKey implements Parcelable {
    public static final Parcelable.Creator<NavKey> CREATOR;
    public static final NavKey IconCompatParcelizer = new NavKey("RESOLUTION", 0);
    public static final NavKey RemoteActionCompatParcelizer = new NavKey("SEEK", 1);
    private static final /* synthetic */ NavKey[] write;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    private NavKey(String str, int i) {
    }

    static {
        NavKey[] navKeyArrIconCompatParcelizer = IconCompatParcelizer();
        write = navKeyArrIconCompatParcelizer;
        getMagicModuleTimeline.IconCompatParcelizer(navKeyArrIconCompatParcelizer);
        CREATOR = new Parcelable.Creator<NavKey>() { // from class: com.marrow.ui.activities.learn.video.overlay.NavKey.read
            private static NavKey AudioAttributesCompatParcelizer(Parcel parcel) {
                toMagicModuleMetaRepoModel.write(parcel, "");
                return NavKey.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ NavKey createFromParcel(Parcel parcel) {
                return AudioAttributesCompatParcelizer(parcel);
            }

            private static NavKey[] write(int i) {
                return new NavKey[i];
            }

            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ NavKey[] newArray(int i) {
                return write(i);
            }
        };
    }

    private static final /* synthetic */ NavKey[] IconCompatParcelizer() {
        return new NavKey[]{IconCompatParcelizer, RemoteActionCompatParcelizer};
    }

    public static NavKey valueOf(String str) {
        return (NavKey) Enum.valueOf(NavKey.class, str);
    }

    public static NavKey[] values() {
        return (NavKey[]) write.clone();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel p0, int p1) {
        toMagicModuleMetaRepoModel.write(p0, "");
        p0.writeString(name());
    }
}
