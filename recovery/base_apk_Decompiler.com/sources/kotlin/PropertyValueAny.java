package kotlin;

import com.google.android.exoplayer2.audio.WavUtil;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0087@\u0018\u0000 \n2\u00020\u0001:\u0001\nB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J5\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0018\u001a\u00020\u00068G¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u001a\u001a\u00020\u00068G¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u0017R\u0011\u0010\n\u001a\u00020\u00068G¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0017R\u0011\u0010\u0004\u001a\u00020\u00068G¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u0017R\u0011\u0010\u001b\u001a\u00020\u000f8G¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u001dR\u0011\u0010\u0016\u001a\u00020\u000f8G¢\u0006\u0006\u001a\u0004\b\n\u0010\u001dR\u0011\u0010\u0019\u001a\u00020\u000f8G¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001dR\u0011\u0010\u001c\u001a\u00020\u000f8G¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001d\u0088\u0001\u001f\u0092\u0001\u00020\u0002"}, d2 = {"Lo/PropertyValueAny;", "", "", "p0", "write", "(J)J", "", "p1", "p2", "p3", "AudioAttributesCompatParcelizer", "(JIIII)J", "", "MediaBrowserCompatMediaItem", "(J)Ljava/lang/String;", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "read", "J", "MediaBrowserCompatItemReceiver", "(J)I", "RemoteActionCompatParcelizer", "AudioAttributesImplBaseParcelizer", "IconCompatParcelizer", "MediaBrowserCompatCustomActionResultReceiver", "AudioAttributesImplApi21Parcelizer", "(J)Z", "AudioAttributesImplApi26Parcelizer", AppMeasurementSdk.ConditionalUserProperty.VALUE}, k = 1, mv = {2, 0, 0}, xi = 48)
@submitMagicModule
public final class PropertyValueAny {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final long read;

    public static final boolean AudioAttributesCompatParcelizer(long j) {
        int i = (int) (3 & j);
        int i2 = ((i & 1) << 1) + (((i & 2) >> 1) * 3);
        return (((int) (j >> (i2 + 46))) & ((1 << (18 - i2)) - 1)) != 0;
    }

    public static final int AudioAttributesImplApi21Parcelizer(long j) {
        int i = (int) (3 & j);
        int i2 = ((i & 1) << 1) + (((i & 2) >> 1) * 3);
        int i3 = ((int) (j >> (i2 + 46))) & ((1 << (18 - i2)) - 1);
        if (i3 == 0) {
            return Integer.MAX_VALUE;
        }
        return i3 - 1;
    }

    public static final boolean AudioAttributesImplApi26Parcelizer(long j) {
        int i = (int) (3 & j);
        int i2 = (1 << ((((i & 1) << 1) + (((i & 2) >> 1) * 3)) + 13)) - 1;
        int i3 = (int) (j >> 2);
        int i4 = ((int) (j >> 33)) & i2;
        return (i3 & i2) == (i4 == 0 ? Integer.MAX_VALUE : i4 + (-1));
    }

    public static final int AudioAttributesImplBaseParcelizer(long j) {
        int i = (int) (3 & j);
        int i2 = ((int) (j >> 33)) & ((1 << ((((i & 1) << 1) + (((i & 2) >> 1) * 3)) + 13)) - 1);
        if (i2 == 0) {
            return Integer.MAX_VALUE;
        }
        return i2 - 1;
    }

    public static final boolean IconCompatParcelizer(long j) {
        int i = (int) (3 & j);
        int i2 = ((i & 1) << 1) + (((i & 2) >> 1) * 3);
        int i3 = (1 << (18 - i2)) - 1;
        int i4 = (int) (j >> (i2 + 15));
        int i5 = ((int) (j >> (i2 + 46))) & i3;
        return (i4 & i3) == (i5 == 0 ? Integer.MAX_VALUE : i5 + (-1));
    }

    public static final int MediaBrowserCompatCustomActionResultReceiver(long j) {
        int i = (int) (3 & j);
        int i2 = ((i & 1) << 1) + (((i & 2) >> 1) * 3);
        return ((int) (j >> (i2 + 15))) & ((1 << (18 - i2)) - 1);
    }

    public static final int MediaBrowserCompatItemReceiver(long j) {
        int i = (int) (3 & j);
        return ((int) (j >> 2)) & ((1 << ((((i & 1) << 1) + (((i & 2) >> 1) * 3)) + 13)) - 1);
    }

    public static final boolean RemoteActionCompatParcelizer(long j) {
        int i = (int) (3 & j);
        return (((int) (j >> 33)) & ((1 << ((((i & 1) << 1) + (((i & 2) >> 1) * 3)) + 13)) - 1)) != 0;
    }

    public static long write(long j) {
        return j;
    }

    public static final boolean write(long j, long j2) {
        return j == j2;
    }

    private /* synthetic */ PropertyValueAny(long j) {
        this.read = j;
    }

    public static /* synthetic */ long AudioAttributesCompatParcelizer$default(long j, int i, int i2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i = MediaBrowserCompatItemReceiver(j);
        }
        int i6 = i;
        if ((i5 & 2) != 0) {
            i2 = AudioAttributesImplBaseParcelizer(j);
        }
        int i7 = i2;
        if ((i5 & 4) != 0) {
            i3 = MediaBrowserCompatCustomActionResultReceiver(j);
        }
        int i8 = i3;
        if ((i5 & 8) != 0) {
            i4 = AudioAttributesImplApi21Parcelizer(j);
        }
        return AudioAttributesCompatParcelizer(j, i6, i7, i8, i4);
    }

    public final String toString() {
        return MediaBrowserCompatMediaItem(this.read);
    }

    public static String MediaBrowserCompatMediaItem(long j) {
        int iAudioAttributesImplBaseParcelizer = AudioAttributesImplBaseParcelizer(j);
        String strValueOf = "Infinity";
        String strValueOf2 = iAudioAttributesImplBaseParcelizer == Integer.MAX_VALUE ? "Infinity" : String.valueOf(iAudioAttributesImplBaseParcelizer);
        int iAudioAttributesImplApi21Parcelizer = AudioAttributesImplApi21Parcelizer(j);
        if (iAudioAttributesImplApi21Parcelizer != Integer.MAX_VALUE) {
            strValueOf = String.valueOf(iAudioAttributesImplApi21Parcelizer);
        }
        StringBuilder sb = new StringBuilder("Constraints(minWidth = ");
        sb.append(MediaBrowserCompatItemReceiver(j));
        sb.append(", maxWidth = ");
        sb.append(strValueOf2);
        sb.append(", minHeight = ");
        sb.append(MediaBrowserCompatCustomActionResultReceiver(j));
        sb.append(", maxHeight = ");
        sb.append(strValueOf);
        sb.append(')');
        return sb.toString();
    }

    /* JADX INFO: renamed from: o.PropertyValueAny$AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\n\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\u000bJ-\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u0004¢\u0006\u0004\b\u000e\u0010\u000fJ-\u0010\n\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\u000f"}, d2 = {"Lo/PropertyValueAny$AudioAttributesCompatParcelizer;", "", "<init>", "()V", "", "p0", "p1", "Lo/PropertyValueAny;", "AudioAttributesCompatParcelizer", "(II)J", "RemoteActionCompatParcelizer", "(I)J", "p2", "p3", "IconCompatParcelizer", "(IIII)J"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final long IconCompatParcelizer(int p0, int p1, int p2, int p3) {
            int i = 262142;
            int iMin = Math.min(p0, 262142);
            int iMin2 = p1 == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.min(p1, 262142);
            int i2 = iMin2 == Integer.MAX_VALUE ? iMin : iMin2;
            if (i2 >= 8191) {
                if (i2 < 32767) {
                    i = WavUtil.TYPE_WAVE_FORMAT_EXTENSIBLE;
                } else if (i2 < 65535) {
                    i = 32766;
                } else {
                    if (i2 >= 262143) {
                        PropertyValueBuffer.write(i2);
                        throw new PlanDetailsCreator();
                    }
                    i = 8190;
                }
            }
            return PropertyValueBuffer.read(iMin, iMin2, Math.min(i, p2), p3 != Integer.MAX_VALUE ? Math.min(i, p3) : Integer.MAX_VALUE);
        }

        public final long RemoteActionCompatParcelizer(int p0, int p1, int p2, int p3) {
            int i = 262142;
            int iMin = Math.min(p2, 262142);
            int iMin2 = p3 == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.min(p3, 262142);
            int i2 = iMin2 == Integer.MAX_VALUE ? iMin : iMin2;
            if (i2 >= 8191) {
                if (i2 < 32767) {
                    i = WavUtil.TYPE_WAVE_FORMAT_EXTENSIBLE;
                } else if (i2 < 65535) {
                    i = 32766;
                } else {
                    if (i2 >= 262143) {
                        PropertyValueBuffer.write(i2);
                        throw new PlanDetailsCreator();
                    }
                    i = 8190;
                }
            }
            return PropertyValueBuffer.read(Math.min(i, p0), p1 != Integer.MAX_VALUE ? Math.min(i, p1) : Integer.MAX_VALUE, iMin, iMin2);
        }

        public final long AudioAttributesCompatParcelizer(int p0, int p1) {
            if (!((p1 >= 0) & (p0 >= 0))) {
                readIdProperty.read("width and height must be >= 0");
            }
            return PropertyValueBuffer.RemoteActionCompatParcelizer(p0, p0, p1, p1);
        }

        public final long RemoteActionCompatParcelizer(int p0) {
            if (p0 < 0) {
                readIdProperty.read("width must be >= 0");
            }
            return PropertyValueBuffer.RemoteActionCompatParcelizer(p0, p0, 0, Integer.MAX_VALUE);
        }

        public final long AudioAttributesCompatParcelizer(int p0) {
            if (p0 < 0) {
                readIdProperty.read("height must be >= 0");
            }
            return PropertyValueBuffer.RemoteActionCompatParcelizer(0, Integer.MAX_VALUE, p0, p0);
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }

    public static final long AudioAttributesCompatParcelizer(long j, int i, int i2, int i3, int i4) {
        if (i2 < i || i4 < i3 || i < 0 || i3 < 0) {
            readIdProperty.read("maxWidth must be >= than minWidth,\nmaxHeight must be >= than minHeight,\nminWidth and minHeight must be >= 0");
        }
        return PropertyValueBuffer.RemoteActionCompatParcelizer(i, i2, i3, i4);
    }

    public static final /* synthetic */ PropertyValueAny read(long j) {
        return new PropertyValueAny(j);
    }

    public static boolean IconCompatParcelizer(long j, Object obj) {
        return (obj instanceof PropertyValueAny) && j == ((PropertyValueAny) obj).getRead();
    }

    public static int MediaDescriptionCompat(long j) {
        return Long.hashCode(j);
    }

    public final boolean equals(Object p0) {
        return IconCompatParcelizer(this.read, p0);
    }

    public final int hashCode() {
        return MediaDescriptionCompat(this.read);
    }

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from getter */
    public final /* synthetic */ long getRead() {
        return this.read;
    }
}
