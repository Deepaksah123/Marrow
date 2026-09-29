package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0011\b\u0087@\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\t\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0000H\u0086\u0002¢\u0006\u0004\b\t\u0010\bJ\u0018\u0010\u0004\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\nH\u0086\u0002¢\u0006\u0004\b\u0004\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u000f\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0004\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0013R\u0011\u0010\t\u001a\u00020\n8G¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0016\u001a\u00020\n8G¢\u0006\u0006\u001a\u0004\b\t\u0010\u0015R\u0011\u0010\u0007\u001a\u00020\n8G¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0015R\u0011\u0010\u0019\u001a\u00020\n8G¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0015R\u0011\u0010\u001b\u001a\u00020\u00068G¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u0017\u001a\u00020\u00068G¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001aR\u0011\u0010\u001c\u001a\u00020\n8G¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0015\u0088\u0001\u001d\u0092\u0001\u00020\u0002"}, d2 = {"Lo/findProperty;", "", "", "p0", "IconCompatParcelizer", "(J)J", "", "AudioAttributesCompatParcelizer", "(JJ)Z", "read", "", "(JI)Z", "", "RatingCompat", "(J)Ljava/lang/String;", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "J", "AudioAttributesImplBaseParcelizer", "(J)I", "RemoteActionCompatParcelizer", "MediaBrowserCompatCustomActionResultReceiver", "AudioAttributesImplApi26Parcelizer", "write", "(J)Z", "MediaBrowserCompatItemReceiver", "AudioAttributesImplApi21Parcelizer", "packedValue"}, k = 1, mv = {2, 0, 0}, xi = 48)
@submitMagicModule
public final class findProperty {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final long IconCompatParcelizer;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final long RemoteActionCompatParcelizer = getValueInstantiator.IconCompatParcelizer(0);

    public static final int AudioAttributesImplBaseParcelizer(long j) {
        return (int) (j >> 32);
    }

    public static long IconCompatParcelizer(long j) {
        return j;
    }

    public static final boolean IconCompatParcelizer(long j, long j2) {
        return j == j2;
    }

    public static final int read(long j) {
        return (int) j;
    }

    private /* synthetic */ findProperty(long j) {
        this.IconCompatParcelizer = j;
    }

    public static final int MediaBrowserCompatCustomActionResultReceiver(long j) {
        return Math.min(AudioAttributesImplBaseParcelizer(j), read(j));
    }

    public static final int AudioAttributesImplApi26Parcelizer(long j) {
        return Math.max(AudioAttributesImplBaseParcelizer(j), read(j));
    }

    public static final boolean write(long j) {
        return AudioAttributesImplBaseParcelizer(j) == read(j);
    }

    public static final boolean AudioAttributesImplApi21Parcelizer(long j) {
        return AudioAttributesImplBaseParcelizer(j) > read(j);
    }

    public static final int RemoteActionCompatParcelizer(long j) {
        return AudioAttributesImplApi26Parcelizer(j) - MediaBrowserCompatCustomActionResultReceiver(j);
    }

    public static final boolean AudioAttributesCompatParcelizer(long j, long j2) {
        return (MediaBrowserCompatCustomActionResultReceiver(j) < AudioAttributesImplApi26Parcelizer(j2)) & (MediaBrowserCompatCustomActionResultReceiver(j2) < AudioAttributesImplApi26Parcelizer(j));
    }

    public static final boolean read(long j, long j2) {
        return (MediaBrowserCompatCustomActionResultReceiver(j) <= MediaBrowserCompatCustomActionResultReceiver(j2)) & (AudioAttributesImplApi26Parcelizer(j2) <= AudioAttributesImplApi26Parcelizer(j));
    }

    public static final boolean IconCompatParcelizer(long j, int i) {
        return i < AudioAttributesImplApi26Parcelizer(j) && MediaBrowserCompatCustomActionResultReceiver(j) <= i;
    }

    public final String toString() {
        return RatingCompat(this.IconCompatParcelizer);
    }

    public static String RatingCompat(long j) {
        StringBuilder sb = new StringBuilder("TextRange(");
        sb.append(AudioAttributesImplBaseParcelizer(j));
        sb.append(", ");
        sb.append(read(j));
        sb.append(')');
        return sb.toString();
    }

    /* JADX INFO: renamed from: o.findProperty$write, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\t\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b"}, d2 = {"Lo/findProperty$write;", "", "<init>", "()V", "Lo/findProperty;", "RemoteActionCompatParcelizer", "J", "AudioAttributesCompatParcelizer", "()J", "read"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final long AudioAttributesCompatParcelizer() {
            return findProperty.RemoteActionCompatParcelizer;
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }

    public static final /* synthetic */ findProperty AudioAttributesCompatParcelizer(long j) {
        return new findProperty(j);
    }

    public static boolean AudioAttributesCompatParcelizer(long j, Object obj) {
        return (obj instanceof findProperty) && j == ((findProperty) obj).getIconCompatParcelizer();
    }

    public static int MediaBrowserCompatItemReceiver(long j) {
        return Long.hashCode(j);
    }

    public final boolean equals(Object p0) {
        return AudioAttributesCompatParcelizer(this.IconCompatParcelizer, p0);
    }

    public final int hashCode() {
        return MediaBrowserCompatItemReceiver(this.IconCompatParcelizer);
    }

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from getter */
    public final /* synthetic */ long getIconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }
}
