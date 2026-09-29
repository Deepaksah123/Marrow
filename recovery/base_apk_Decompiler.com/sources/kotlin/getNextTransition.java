package kotlin;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0081@\u0018\u00002\u00020\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B)\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\nB\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\rJ5\u0010\u0004\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\u000fJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u000e\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0018\u0088\u0001\u0019\u0092\u0001\u00020\u0002"}, d2 = {"Lo/getNextTransition;", "", "Lo/PropertyValueAny;", "p0", "write", "(J)J", "", "p1", "p2", "p3", "(IIII)J", "Lo/getAnimatingAway;", "AudioAttributesCompatParcelizer", "(JLo/getAnimatingAway;)J", "read", "(JIIII)J", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "J", AppMeasurementSdk.ConditionalUserProperty.VALUE}, k = 1, mv = {2, 0, 0}, xi = 48)
@submitMagicModule
public final class getNextTransition {

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final long read;

    private static long write(long j) {
        return j;
    }

    public static long write(int i, int i2, int i3, int i4) {
        return write(PropertyValueBuffer.read(i, i2, i3, i4));
    }

    public static long AudioAttributesCompatParcelizer(long j, getAnimatingAway getanimatingaway) {
        return write(getanimatingaway == getAnimatingAway.read ? PropertyValueAny.MediaBrowserCompatItemReceiver(j) : PropertyValueAny.MediaBrowserCompatCustomActionResultReceiver(j), getanimatingaway == getAnimatingAway.read ? PropertyValueAny.AudioAttributesImplBaseParcelizer(j) : PropertyValueAny.AudioAttributesImplApi21Parcelizer(j), getanimatingaway == getAnimatingAway.read ? PropertyValueAny.MediaBrowserCompatCustomActionResultReceiver(j) : PropertyValueAny.MediaBrowserCompatItemReceiver(j), getanimatingaway == getAnimatingAway.read ? PropertyValueAny.AudioAttributesImplApi21Parcelizer(j) : PropertyValueAny.AudioAttributesImplBaseParcelizer(j));
    }

    public static final long read(long j, getAnimatingAway getanimatingaway) {
        if (getanimatingaway == getAnimatingAway.read) {
            return PropertyValueBuffer.read(PropertyValueAny.MediaBrowserCompatItemReceiver(j), PropertyValueAny.AudioAttributesImplBaseParcelizer(j), PropertyValueAny.MediaBrowserCompatCustomActionResultReceiver(j), PropertyValueAny.AudioAttributesImplApi21Parcelizer(j));
        }
        return PropertyValueBuffer.read(PropertyValueAny.MediaBrowserCompatCustomActionResultReceiver(j), PropertyValueAny.AudioAttributesImplApi21Parcelizer(j), PropertyValueAny.MediaBrowserCompatItemReceiver(j), PropertyValueAny.AudioAttributesImplBaseParcelizer(j));
    }

    public static final long write(long j, int i, int i2, int i3, int i4) {
        return write(i, i2, i3, i4);
    }

    public static /* synthetic */ long write$default(long j, int i, int i2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i = PropertyValueAny.MediaBrowserCompatItemReceiver(j);
        }
        int i6 = i;
        if ((i5 & 2) != 0) {
            i2 = PropertyValueAny.AudioAttributesImplBaseParcelizer(j);
        }
        int i7 = i2;
        if ((i5 & 4) != 0) {
            i3 = PropertyValueAny.MediaBrowserCompatCustomActionResultReceiver(j);
        }
        int i8 = i3;
        if ((i5 & 8) != 0) {
            i4 = PropertyValueAny.AudioAttributesImplApi21Parcelizer(j);
        }
        return write(j, i6, i7, i8, i4);
    }

    public static boolean read(long j, Object obj) {
        return (obj instanceof getNextTransition) && PropertyValueAny.write(j, ((getNextTransition) obj).getRead());
    }

    public static int IconCompatParcelizer(long j) {
        return PropertyValueAny.MediaDescriptionCompat(j);
    }

    public static String read(long j) {
        StringBuilder sb = new StringBuilder("OrientationIndependentConstraints(value=");
        sb.append((Object) PropertyValueAny.MediaBrowserCompatMediaItem(j));
        sb.append(')');
        return sb.toString();
    }

    public final boolean equals(Object p0) {
        return read(this.read, p0);
    }

    public final int hashCode() {
        return IconCompatParcelizer(this.read);
    }

    public final String toString() {
        return read(this.read);
    }

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from getter */
    public final /* synthetic */ long getRead() {
        return this.read;
    }
}
