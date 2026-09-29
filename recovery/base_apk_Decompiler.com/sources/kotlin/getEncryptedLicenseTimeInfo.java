package kotlin;

import java.util.Random;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b!\u0018\u0000 12\u00020\u0001:\u0002\u001b1Bs\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\u0005\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u0002\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0018\u001a\u00020\u00028\u0007¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0017\u0010\u001a\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u001a\u0010\u0019\u001a\u0004\b\u001b\u0010\u001cR\u001a\u0010\u001d\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u0019\u001a\u0004\b\u001e\u0010\u001cR\u001a\u0010\u001f\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u001a\u0010#\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b#\u0010 \u001a\u0004\b$\u0010\"R\u001a\u0010%\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b%\u0010 \u001a\u0004\b&\u0010\"R\u001a\u0010'\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b'\u0010\u0019\u001a\u0004\b(\u0010\u001cR\u001a\u0010)\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b)\u0010\u0019\u001a\u0004\b*\u0010\u001cR\u001a\u0010+\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b+\u0010\u0019\u001a\u0004\b,\u0010\u001cR\u0014\u0010-\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b-\u0010\u0019R\u001a\u0010.\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b.\u0010\u0019\u001a\u0004\b/\u0010\u001cR\u0014\u00100\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b0\u0010 "}, d2 = {"Lo/getEncryptedLicenseTimeInfo;", "", "", "p0", "p1", "", "p2", "p3", "p4", "p5", "p6", "p7", "p8", "p9", "p10", "p11", "", "p12", "<init>", "(ZZIIZZZIIZZZLjava/lang/String;)V", "toString", "()Ljava/lang/String;", "headerValue", "Ljava/lang/String;", "immutable", "Z", "isPrivate", "AudioAttributesCompatParcelizer", "()Z", "isPublic", "write", "maxAgeSeconds", "I", "read", "()I", "maxStaleSeconds", "IconCompatParcelizer", "minFreshSeconds", "RemoteActionCompatParcelizer", "mustRevalidate", "MediaBrowserCompatItemReceiver", "noCache", "MediaBrowserCompatCustomActionResultReceiver", "noStore", "AudioAttributesImplApi21Parcelizer", "noTransform", "onlyIfCached", "AudioAttributesImplBaseParcelizer", "sMaxAgeSeconds", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class getEncryptedLicenseTimeInfo {
    private String headerValue;
    private final boolean immutable;
    private final boolean isPrivate;
    private final boolean isPublic;
    private final int maxAgeSeconds;
    private final int maxStaleSeconds;
    private final int minFreshSeconds;
    private final boolean mustRevalidate;
    private final boolean noCache;
    private final boolean noStore;
    private final boolean noTransform;
    private final boolean onlyIfCached;
    private final int sMaxAgeSeconds;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final getEncryptedLicenseTimeInfo FORCE_NETWORK = new AudioAttributesCompatParcelizer().read().RemoteActionCompatParcelizer();
    public static final getEncryptedLicenseTimeInfo FORCE_CACHE = new AudioAttributesCompatParcelizer().AudioAttributesCompatParcelizer().write(TimeUnit.SECONDS).RemoteActionCompatParcelizer();

    private getEncryptedLicenseTimeInfo(boolean z, boolean z2, int i, int i2, boolean z3, boolean z4, boolean z5, int i3, int i4, boolean z6, boolean z7, boolean z8, String str) {
        this.noCache = z;
        this.noStore = z2;
        this.maxAgeSeconds = i;
        this.sMaxAgeSeconds = i2;
        this.isPrivate = z3;
        this.isPublic = z4;
        this.mustRevalidate = z5;
        this.maxStaleSeconds = i3;
        this.minFreshSeconds = i4;
        this.onlyIfCached = z6;
        this.noTransform = z7;
        this.immutable = z8;
        this.headerValue = str;
    }

    /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from getter */
    public final boolean getNoCache() {
        return this.noCache;
    }

    /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: from getter */
    public final boolean getNoStore() {
        return this.noStore;
    }

    /* JADX INFO: renamed from: read, reason: from getter */
    public final int getMaxAgeSeconds() {
        return this.maxAgeSeconds;
    }

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from getter */
    public final boolean getIsPrivate() {
        return this.isPrivate;
    }

    /* JADX INFO: renamed from: write, reason: from getter */
    public final boolean getIsPublic() {
        return this.isPublic;
    }

    /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: from getter */
    public final boolean getMustRevalidate() {
        return this.mustRevalidate;
    }

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from getter */
    public final int getMaxStaleSeconds() {
        return this.maxStaleSeconds;
    }

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from getter */
    public final int getMinFreshSeconds() {
        return this.minFreshSeconds;
    }

    /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: from getter */
    public final boolean getOnlyIfCached() {
        return this.onlyIfCached;
    }

    public final String toString() {
        String str = this.headerValue;
        if (str != null) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        if (this.noCache) {
            sb.append("no-cache, ");
        }
        if (this.noStore) {
            sb.append("no-store, ");
        }
        if (this.maxAgeSeconds != -1) {
            sb.append("max-age=");
            sb.append(this.maxAgeSeconds);
            sb.append(", ");
        }
        if (this.sMaxAgeSeconds != -1) {
            sb.append("s-maxage=");
            sb.append(this.sMaxAgeSeconds);
            sb.append(", ");
        }
        if (this.isPrivate) {
            sb.append("private, ");
        }
        if (this.isPublic) {
            sb.append("public, ");
        }
        if (this.mustRevalidate) {
            sb.append("must-revalidate, ");
        }
        if (this.maxStaleSeconds != -1) {
            sb.append("max-stale=");
            sb.append(this.maxStaleSeconds);
            sb.append(", ");
        }
        if (this.minFreshSeconds != -1) {
            sb.append("min-fresh=");
            sb.append(this.minFreshSeconds);
            sb.append(", ");
        }
        if (this.onlyIfCached) {
            sb.append("only-if-cached, ");
        }
        if (this.noTransform) {
            sb.append("no-transform, ");
        }
        if (this.immutable) {
            sb.append("immutable, ");
        }
        if (sb.length() == 0) {
            return "";
        }
        sb.delete(sb.length() - 2, sb.length());
        String string = sb.toString();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string, "");
        this.headerValue = string;
        return string;
    }

    public static final class AudioAttributesCompatParcelizer {
        public static int AudioAttributesCompatParcelizer;
        public static int IconCompatParcelizer;
        private boolean AudioAttributesImplApi26Parcelizer;
        private boolean AudioAttributesImplBaseParcelizer;
        private boolean MediaBrowserCompatCustomActionResultReceiver;
        private boolean MediaBrowserCompatItemReceiver;
        private boolean read;
        private int RemoteActionCompatParcelizer = -1;
        private int write = -1;
        private int AudioAttributesImplApi21Parcelizer = -1;

        private static int AudioAttributesCompatParcelizer(long j) {
            if (j > 2147483647L) {
                return Integer.MAX_VALUE;
            }
            return (int) j;
        }

        public final AudioAttributesCompatParcelizer read() {
            this.MediaBrowserCompatCustomActionResultReceiver = true;
            return this;
        }

        public final AudioAttributesCompatParcelizer IconCompatParcelizer() {
            this.MediaBrowserCompatItemReceiver = true;
            return this;
        }

        public final AudioAttributesCompatParcelizer write(TimeUnit timeUnit) {
            toMagicModuleMetaRepoModel.write(timeUnit, "");
            this.write = AudioAttributesCompatParcelizer(timeUnit.toSeconds(2147483647L));
            return this;
        }

        public final AudioAttributesCompatParcelizer AudioAttributesCompatParcelizer() {
            this.AudioAttributesImplBaseParcelizer = true;
            return this;
        }

        public final getEncryptedLicenseTimeInfo RemoteActionCompatParcelizer() {
            return new getEncryptedLicenseTimeInfo(this.MediaBrowserCompatCustomActionResultReceiver, this.MediaBrowserCompatItemReceiver, this.RemoteActionCompatParcelizer, -1, false, false, false, this.write, this.AudioAttributesImplApi21Parcelizer, this.AudioAttributesImplBaseParcelizer, false, false, null, null);
        }

        public static int write() {
            int i = IconCompatParcelizer;
            int i2 = i % 7313228;
            IconCompatParcelizer = i + 1;
            if (i2 != 0) {
                return AudioAttributesCompatParcelizer;
            }
            int iNextInt = new Random().nextInt(1142474427);
            AudioAttributesCompatParcelizer = iNextInt;
            return iNextInt;
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ#\u0010\f\u001a\u00020\n*\u00020\t2\u0006\u0010\u0005\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\f\u0010\rR\u0011\u0010\u000e\u001a\u00020\u00068\u0006¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0010\u001a\u00020\u00068\u0006¢\u0006\u0006\n\u0004\b\u0010\u0010\u000f"}, d2 = {"Lo/getEncryptedLicenseTimeInfo$Companion;", "", "<init>", "()V", "Lo/ShapeKt;", "p0", "Lo/getEncryptedLicenseTimeInfo;", "write", "(Lo/ShapeKt;)Lo/getEncryptedLicenseTimeInfo;", "", "", "p1", "AudioAttributesCompatParcelizer", "(Ljava/lang/String;Ljava/lang/String;I)I", "FORCE_CACHE", "Lo/getEncryptedLicenseTimeInfo;", "FORCE_NETWORK"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x0048  */
        @kotlin.getMagicModuleMeta
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static kotlin.getEncryptedLicenseTimeInfo write(kotlin.ShapeKt r26) {
            /*
                Method dump skipped, instruction units count: 379
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.getEncryptedLicenseTimeInfo.Companion.write(o.ShapeKt):o.getEncryptedLicenseTimeInfo");
        }

        private static int AudioAttributesCompatParcelizer(String str, String str2, int i) {
            int length = str.length();
            while (i < length) {
                if (TestGroupLSModel.RemoteActionCompatParcelizer(str2, str.charAt(i), false)) {
                    return i;
                }
                i++;
            }
            return str.length();
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }

    public /* synthetic */ getEncryptedLicenseTimeInfo(boolean z, boolean z2, int i, int i2, boolean z3, boolean z4, boolean z5, int i3, int i4, boolean z6, boolean z7, boolean z8, String str, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this(z, z2, i, i2, z3, z4, z5, i3, i4, z6, z7, z8, str);
    }
}
