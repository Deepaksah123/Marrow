package kotlin;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\u0018\u0000 \u001b2\u00020\u0001:\u0004\u001b\u0016\u0018\u0014B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tB\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\nJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0014\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\u001a\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u0010R\u001a\u0010\u0016\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0019\u001a\u0004\b\u001b\u0010\u0010"}, d2 = {"Lo/find;", "", "Lo/find$IconCompatParcelizer;", "p0", "Lo/find$write;", "p1", "Lo/find$read;", "p2", "<init>", "(FIILo/MagicModuleRepositoryImplExternalSyntheticLambda0;)V", "(FILo/MagicModuleRepositoryImplExternalSyntheticLambda0;)V", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "read", "F", "write", "()F", "IconCompatParcelizer", "I", "RemoteActionCompatParcelizer", "AudioAttributesCompatParcelizer"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class find {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final find RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final int RemoteActionCompatParcelizer;
    private final float read;
    private final int write;

    private find(float f, int i, int i2) {
        this.read = f;
        this.RemoteActionCompatParcelizer = i;
        this.write = i2;
    }

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from getter */
    public final int getWrite() {
        return this.write;
    }

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from getter */
    public final int getRemoteActionCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    /* JADX INFO: renamed from: write, reason: from getter */
    public final float getRead() {
        return this.read;
    }

    private find(float f, int i) {
        this(f, i, read.INSTANCE.AudioAttributesCompatParcelizer(), null);
    }

    /* JADX INFO: renamed from: o.find$AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\b\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0005\u0010\u0007"}, d2 = {"Lo/find$AudioAttributesCompatParcelizer;", "", "<init>", "()V", "Lo/find;", "RemoteActionCompatParcelizer", "Lo/find;", "()Lo/find;", "write"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final find RemoteActionCompatParcelizer() {
            return find.RemoteActionCompatParcelizer;
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }

    static {
        MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0 = null;
        INSTANCE = new Companion(magicModuleRepositoryImplExternalSyntheticLambda0);
        RemoteActionCompatParcelizer = new find(IconCompatParcelizer.INSTANCE.IconCompatParcelizer(), write.INSTANCE.write(), read.INSTANCE.AudioAttributesCompatParcelizer(), magicModuleRepositoryImplExternalSyntheticLambda0);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof find)) {
            return false;
        }
        find findVar = (find) p0;
        return IconCompatParcelizer.read(this.read, findVar.read) && write.AudioAttributesCompatParcelizer(this.RemoteActionCompatParcelizer, findVar.RemoteActionCompatParcelizer) && read.write(this.write, findVar.write);
    }

    public final int hashCode() {
        return (((IconCompatParcelizer.IconCompatParcelizer(this.read) * 31) + write.read(this.RemoteActionCompatParcelizer)) * 31) + read.IconCompatParcelizer(this.write);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LineHeightStyle(alignment=");
        sb.append((Object) IconCompatParcelizer.AudioAttributesCompatParcelizer(this.read));
        sb.append(", trim=");
        sb.append((Object) write.MediaBrowserCompatItemReceiver(this.RemoteActionCompatParcelizer));
        sb.append(",mode=");
        sb.append((Object) read.RemoteActionCompatParcelizer(this.write));
        sb.append(')');
        return sb.toString();
    }

    public /* synthetic */ find(float f, int i, int i2, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this(f, i, i2);
    }

    public /* synthetic */ find(float f, int i, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this(f, i);
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087@\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0000¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH\u0000¢\u0006\u0004\b\f\u0010\u000bJ\u001a\u0010\r\u001a\u00020\t2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0004\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012\u0088\u0001\u0013\u0092\u0001\u00020\u0002"}, d2 = {"Lo/find$write;", "", "", "p0", "write", "(I)I", "", "MediaBrowserCompatItemReceiver", "(I)Ljava/lang/String;", "", "AudioAttributesCompatParcelizer", "(I)Z", "RemoteActionCompatParcelizer", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "MediaBrowserCompatCustomActionResultReceiver", "I", AppMeasurementSdk.ConditionalUserProperty.VALUE}, k = 1, mv = {2, 0, 0}, xi = 48)
    @submitMagicModule
    public static final class write {

        /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from kotlin metadata */
        private final int write;

        /* JADX INFO: renamed from: write, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final int IconCompatParcelizer = write(1);
        private static final int AudioAttributesCompatParcelizer = write(16);
        private static final int read = write(17);
        private static final int RemoteActionCompatParcelizer = write(0);

        public static final boolean AudioAttributesCompatParcelizer(int i) {
            return (i & 1) > 0;
        }

        public static final boolean AudioAttributesCompatParcelizer(int i, int i2) {
            return i == i2;
        }

        public static final boolean RemoteActionCompatParcelizer(int i) {
            return (i & 16) > 0;
        }

        public static int write(int i) {
            return i;
        }

        private /* synthetic */ write(int i) {
            this.write = i;
        }

        public final String toString() {
            return MediaBrowserCompatItemReceiver(this.write);
        }

        public static String MediaBrowserCompatItemReceiver(int i) {
            return i == IconCompatParcelizer ? "LineHeightStyle.Trim.FirstLineTop" : i == AudioAttributesCompatParcelizer ? "LineHeightStyle.Trim.LastLineBottom" : i == read ? "LineHeightStyle.Trim.Both" : i == RemoteActionCompatParcelizer ? "LineHeightStyle.Trim.None" : "Invalid";
        }

        /* JADX INFO: renamed from: o.find$write$write, reason: collision with other inner class name and from kotlin metadata */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u001a\u0010\t\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0006\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\u0007\u0010\n"}, d2 = {"Lo/find$write$write;", "", "<init>", "()V", "Lo/find$write;", "IconCompatParcelizer", "I", "AudioAttributesCompatParcelizer", "read", "write", "()I", "RemoteActionCompatParcelizer"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public final int write() {
                return write.read;
            }

            public final int AudioAttributesCompatParcelizer() {
                return write.RemoteActionCompatParcelizer;
            }

            public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
                this();
            }
        }

        public static final /* synthetic */ write IconCompatParcelizer(int i) {
            return new write(i);
        }

        public static boolean write(int i, Object obj) {
            return (obj instanceof write) && i == ((write) obj).getWrite();
        }

        public static int read(int i) {
            return Integer.hashCode(i);
        }

        public final boolean equals(Object p0) {
            return write(this.write, p0);
        }

        public final int hashCode() {
            return read(this.write);
        }

        /* JADX INFO: renamed from: read, reason: from getter */
        public final /* synthetic */ int getWrite() {
            return this.write;
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0087@\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\n\u001a\u00020\t2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0004\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010\u0088\u0001\u0012\u0092\u0001\u00020\u0002"}, d2 = {"Lo/find$IconCompatParcelizer;", "", "", "p0", "read", "(F)F", "", "AudioAttributesCompatParcelizer", "(F)Ljava/lang/String;", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "MediaBrowserCompatItemReceiver", "F", "RemoteActionCompatParcelizer", "topRatio"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @submitMagicModule
    public static final class IconCompatParcelizer {

        /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: from kotlin metadata */
        private final float read;

        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final float AudioAttributesCompatParcelizer = read(BitmapDescriptorFactory.HUE_RED);
        private static final float write = read(0.5f);
        private static final float read = read(-1.0f);
        private static final float IconCompatParcelizer = read(1.0f);

        private /* synthetic */ IconCompatParcelizer(float f) {
            this.read = f;
        }

        public final String toString() {
            return AudioAttributesCompatParcelizer(this.read);
        }

        public static String AudioAttributesCompatParcelizer(float f) {
            if (f == AudioAttributesCompatParcelizer) {
                return "LineHeightStyle.Alignment.Top";
            }
            if (f == write) {
                return "LineHeightStyle.Alignment.Center";
            }
            if (f == read) {
                return "LineHeightStyle.Alignment.Proportional";
            }
            if (f == IconCompatParcelizer) {
                return "LineHeightStyle.Alignment.Bottom";
            }
            StringBuilder sb = new StringBuilder("LineHeightStyle.Alignment(topPercentage = ");
            sb.append(f);
            sb.append(')');
            return sb.toString();
        }

        /* JADX INFO: renamed from: o.find$IconCompatParcelizer$RemoteActionCompatParcelizer, reason: from kotlin metadata */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u001a\u0010\b\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0006\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\u000b\u0010\nR\u0014\u0010\u000b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006"}, d2 = {"Lo/find$IconCompatParcelizer$RemoteActionCompatParcelizer;", "", "<init>", "()V", "Lo/find$IconCompatParcelizer;", "AudioAttributesCompatParcelizer", "F", "RemoteActionCompatParcelizer", "write", "read", "()F", "IconCompatParcelizer"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public final float read() {
                return IconCompatParcelizer.write;
            }

            public final float IconCompatParcelizer() {
                return IconCompatParcelizer.read;
            }

            public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
                this();
            }
        }

        public static float read(float f) {
            if ((BitmapDescriptorFactory.HUE_RED > f || f > 1.0f) && f != -1.0f) {
                withStackTrace.AudioAttributesCompatParcelizer("topRatio should be in [0..1] range or -1");
            }
            return f;
        }

        public static final /* synthetic */ IconCompatParcelizer write(float f) {
            return new IconCompatParcelizer(f);
        }

        public static boolean AudioAttributesCompatParcelizer(float f, Object obj) {
            return (obj instanceof IconCompatParcelizer) && Float.compare(f, ((IconCompatParcelizer) obj).getRead()) == 0;
        }

        public static final boolean read(float f, float f2) {
            return Float.compare(f, f2) == 0;
        }

        public static int IconCompatParcelizer(float f) {
            return Float.hashCode(f);
        }

        public final boolean equals(Object p0) {
            return AudioAttributesCompatParcelizer(this.read, p0);
        }

        public final int hashCode() {
            return IconCompatParcelizer(this.read);
        }

        /* JADX INFO: renamed from: write, reason: from getter */
        public final /* synthetic */ float getRead() {
            return this.read;
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087@\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\n\u001a\u00020\t2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u000f\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u000e\u0088\u0001\u0011\u0092\u0001\u00020\u0002"}, d2 = {"Lo/find$read;", "", "", "p0", "write", "(I)I", "", "RemoteActionCompatParcelizer", "(I)Ljava/lang/String;", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "I", "AudioAttributesCompatParcelizer", "IconCompatParcelizer", AppMeasurementSdk.ConditionalUserProperty.VALUE}, k = 1, mv = {2, 0, 0}, xi = 48)
    @submitMagicModule
    public static final class read {

        /* JADX INFO: renamed from: write, reason: from kotlin metadata */
        private final int AudioAttributesCompatParcelizer;

        /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final int read = write(0);
        private static final int RemoteActionCompatParcelizer = write(1);
        private static final int AudioAttributesCompatParcelizer = write(2);

        public static int write(int i) {
            return i;
        }

        public static final boolean write(int i, int i2) {
            return i == i2;
        }

        private /* synthetic */ read(int i) {
            this.AudioAttributesCompatParcelizer = i;
        }

        public final String toString() {
            return RemoteActionCompatParcelizer(this.AudioAttributesCompatParcelizer);
        }

        public static String RemoteActionCompatParcelizer(int i) {
            return write(i, read) ? "LineHeightStyle.Mode.Fixed" : write(i, RemoteActionCompatParcelizer) ? "LineHeightStyle.Mode.Minimum" : write(i, AudioAttributesCompatParcelizer) ? "LineHeightStyle.Mode.Tight" : "Invalid";
        }

        /* JADX INFO: renamed from: o.find$read$IconCompatParcelizer, reason: from kotlin metadata */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\n\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\u0005\u0010\bR\u001a\u0010\u000b\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\t\u0010\b"}, d2 = {"Lo/find$read$IconCompatParcelizer;", "", "<init>", "()V", "Lo/find$read;", "read", "I", "AudioAttributesCompatParcelizer", "()I", "RemoteActionCompatParcelizer", "write", "IconCompatParcelizer"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public final int AudioAttributesCompatParcelizer() {
                return read.read;
            }

            public final int read() {
                return read.RemoteActionCompatParcelizer;
            }

            public final int RemoteActionCompatParcelizer() {
                return read.AudioAttributesCompatParcelizer;
            }

            public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
                this();
            }
        }

        public static final /* synthetic */ read AudioAttributesCompatParcelizer(int i) {
            return new read(i);
        }

        public static boolean read(int i, Object obj) {
            return (obj instanceof read) && i == ((read) obj).getAudioAttributesCompatParcelizer();
        }

        public static int IconCompatParcelizer(int i) {
            return Integer.hashCode(i);
        }

        public final boolean equals(Object p0) {
            return read(this.AudioAttributesCompatParcelizer, p0);
        }

        public final int hashCode() {
            return IconCompatParcelizer(this.AudioAttributesCompatParcelizer);
        }

        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from getter */
        public final /* synthetic */ int getAudioAttributesCompatParcelizer() {
            return this.AudioAttributesCompatParcelizer;
        }
    }
}
