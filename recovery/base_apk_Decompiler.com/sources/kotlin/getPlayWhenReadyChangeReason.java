package kotlin;

import java.util.Arrays;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000b\n\u0002\b\r\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0019\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u000b\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u001a\u0010\u000e\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\b\u001a\u0004\b\r\u0010\nj\u0002\b\rj\u0002\b\u000bj\u0002\b\u000fj\u0002\b\u000e"}, d2 = {"Lo/getPlayWhenReadyChangeReason;", "", "", "p0", "p1", "<init>", "(Ljava/lang/String;IZZ)V", "MediaBrowserCompatCustomActionResultReceiver", "Z", "AudioAttributesCompatParcelizer", "()Z", "IconCompatParcelizer", "AudioAttributesImplApi21Parcelizer", "read", "RemoteActionCompatParcelizer", "write"}, k = 1, mv = {1, 5, 1}, xi = 48)
public enum getPlayWhenReadyChangeReason {
    ENABLED(true, true),
    READ_ONLY(true, false),
    WRITE_ONLY(false, true),
    DISABLED(false, false);


    /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: from kotlin metadata */
    private final boolean RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from kotlin metadata */
    private final boolean IconCompatParcelizer;

    getPlayWhenReadyChangeReason(boolean z, boolean z2) {
        this.IconCompatParcelizer = z;
        this.RemoteActionCompatParcelizer = z2;
    }

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from getter */
    public final boolean getIconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    /* JADX INFO: renamed from: read, reason: from getter */
    public final boolean getRemoteActionCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    /* JADX INFO: renamed from: values, reason: to resolve conflict with enum method */
    public static getPlayWhenReadyChangeReason[] valuesCustom() {
        getPlayWhenReadyChangeReason[] getplaywhenreadychangereasonArrValuesCustom = values();
        return (getPlayWhenReadyChangeReason[]) Arrays.copyOf(getplaywhenreadychangereasonArrValuesCustom, getplaywhenreadychangereasonArrValuesCustom.length);
    }
}
