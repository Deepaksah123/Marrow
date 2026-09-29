package kotlin;

import com.google.android.exoplayer2.analytics.AnalyticsListener;
import org.apache.commons.compress.archivers.zip.UnixStat;

/* JADX INFO: loaded from: classes4.dex */
public final class isDontConsider {
    public static final isDontConsider AudioAttributesCompatParcelizer;
    private final boolean AudioAttributesImplApi21Parcelizer;
    private final boolean AudioAttributesImplApi26Parcelizer;
    private final boolean AudioAttributesImplBaseParcelizer;
    private final isDontConsider IconCompatParcelizer;
    private final boolean MediaBrowserCompatCustomActionResultReceiver;
    private final boolean MediaBrowserCompatItemReceiver;
    private final boolean MediaMetadataCompat;
    private final isDontConsider RemoteActionCompatParcelizer;
    private final isDontConsider read;
    private final boolean write;

    public final /* synthetic */ class write {
        public static final /* synthetic */ int[] IconCompatParcelizer;

        static {
            int[] iArr = new int[getTotalSubject.values().length];
            try {
                iArr[getTotalSubject.IN_VARIANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[getTotalSubject.INVARIANT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            IconCompatParcelizer = iArr;
        }
    }

    private isDontConsider(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, isDontConsider isdontconsider, boolean z6, isDontConsider isdontconsider2, isDontConsider isdontconsider3, boolean z7) {
        this.AudioAttributesImplApi21Parcelizer = z;
        this.AudioAttributesImplBaseParcelizer = z2;
        this.write = z3;
        this.MediaBrowserCompatCustomActionResultReceiver = z4;
        this.MediaMetadataCompat = z5;
        this.RemoteActionCompatParcelizer = isdontconsider;
        this.AudioAttributesImplApi26Parcelizer = z6;
        this.IconCompatParcelizer = isdontconsider2;
        this.read = isdontconsider3;
        this.MediaBrowserCompatItemReceiver = z7;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    private /* synthetic */ isDontConsider(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, isDontConsider isdontconsider, boolean z6, isDontConsider isdontconsider2, isDontConsider isdontconsider3, boolean z7, int i) {
        z = (i & 1) != 0 ? true : z;
        z2 = (i & 2) != 0 ? true : z2;
        z3 = (i & 4) != 0 ? false : z3;
        z4 = (i & 8) != 0 ? false : z4;
        z5 = (i & 16) != 0 ? false : z5;
        isdontconsider = (i & 32) != 0 ? null : isdontconsider;
        this(z, z2, z3, z4, z5, isdontconsider, (i & 64) != 0 ? true : z6, (i & 128) != 0 ? isdontconsider : isdontconsider2, (i & 256) != 0 ? isdontconsider : isdontconsider3, (i & 512) != 0 ? false : z7);
    }

    public final boolean AudioAttributesCompatParcelizer() {
        return this.AudioAttributesImplApi21Parcelizer;
    }

    public final boolean read() {
        return this.AudioAttributesImplBaseParcelizer;
    }

    public final boolean RemoteActionCompatParcelizer() {
        return this.write;
    }

    public final boolean IconCompatParcelizer() {
        return this.AudioAttributesImplApi26Parcelizer;
    }

    public final boolean write() {
        return this.MediaBrowserCompatItemReceiver;
    }

    public static final class IconCompatParcelizer {
        private IconCompatParcelizer() {
        }

        public /* synthetic */ IconCompatParcelizer(byte b) {
            this();
        }
    }

    static {
        new IconCompatParcelizer((byte) 0);
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        isDontConsider isdontconsider = null;
        boolean z5 = false;
        isDontConsider isdontconsider2 = null;
        isDontConsider isdontconsider3 = null;
        boolean z6 = false;
        isDontConsider isdontconsider4 = new isDontConsider(z, false, z2, z3, z4, isdontconsider, z5, isdontconsider2, isdontconsider3, z6, AnalyticsListener.EVENT_DRM_KEYS_LOADED);
        boolean z7 = false;
        boolean z8 = false;
        boolean z9 = false;
        boolean z10 = false;
        boolean z11 = false;
        boolean z12 = false;
        isDontConsider isdontconsider5 = null;
        isDontConsider isdontconsider6 = null;
        boolean z13 = true;
        isDontConsider isdontconsider7 = new isDontConsider(z7, z8, z9, z10, z11, null, z12, isdontconsider5, isdontconsider6, z13, UnixStat.DEFAULT_LINK_PERM);
        new isDontConsider(z, true, z2, z3, z4, isdontconsider, z5, isdontconsider2, isdontconsider3, z6, AnalyticsListener.EVENT_VIDEO_FRAME_PROCESSING_OFFSET);
        int i = 988;
        AudioAttributesCompatParcelizer = new isDontConsider(z, false, z2, z3, z4, isdontconsider4, z5, isdontconsider2, isdontconsider3, z6, i);
        new isDontConsider(z7, z8, z9, z10, z11, isdontconsider7, z12, isdontconsider5, isdontconsider6, z13, 476);
        new isDontConsider(z, true, z2, z3, z4, isdontconsider4, z5, isdontconsider2, isdontconsider3, z6, i);
        boolean z14 = false;
        boolean z15 = true;
        new isDontConsider(z, z14, z2, z15, z4, isdontconsider4, z5, isdontconsider2, isdontconsider3, z6, 983);
        new isDontConsider(z, z14, z2, z15, z4, isdontconsider4, z5, isdontconsider2, isdontconsider3, z6, 919);
        new isDontConsider(z, z14, true, false, z4, isdontconsider4, z5, isdontconsider2, isdontconsider3, z6, 984);
    }

    public final isDontConsider read(getTotalSubject gettotalsubject) {
        toMagicModuleMetaRepoModel.write(gettotalsubject, "");
        if (!this.write) {
            int i = write.IconCompatParcelizer[gettotalsubject.ordinal()];
            if (i == 1) {
                isDontConsider isdontconsider = this.IconCompatParcelizer;
                if (isdontconsider != null) {
                    return isdontconsider;
                }
            } else if (i == 2) {
                isDontConsider isdontconsider2 = this.read;
                if (isdontconsider2 != null) {
                    return isdontconsider2;
                }
            } else {
                isDontConsider isdontconsider3 = this.RemoteActionCompatParcelizer;
                if (isdontconsider3 != null) {
                    return isdontconsider3;
                }
            }
        }
        return this;
    }

    public final isDontConsider AudioAttributesImplApi26Parcelizer() {
        return new isDontConsider(this.AudioAttributesImplApi21Parcelizer, true, this.write, this.MediaBrowserCompatCustomActionResultReceiver, this.MediaMetadataCompat, this.RemoteActionCompatParcelizer, this.AudioAttributesImplApi26Parcelizer, this.IconCompatParcelizer, this.read, false, 512);
    }

    public isDontConsider() {
        this(false, false, false, false, false, null, false, null, null, false, AnalyticsListener.EVENT_DRM_KEYS_LOADED);
    }
}
