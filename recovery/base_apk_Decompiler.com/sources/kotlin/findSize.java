package kotlin;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087@\u0018\u0000 \u00122\u00020\u0001:\u0004\u0012\u0014\u0010\u0004B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\n\u001a\u00020\t2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\u0005R\u0014\u0010\n\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0011\u0010\u0010\u001a\u00020\u000f8G¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0005R\u0011\u0010\u0012\u001a\u00020\u00118G¢\u0006\u0006\u001a\u0004\b\n\u0010\u0005R\u0011\u0010\u0004\u001a\u00020\u00138G¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0005\u0088\u0001\u0015\u0092\u0001\u00020\u0002"}, d2 = {"Lo/findSize;", "", "", "p0", "AudioAttributesCompatParcelizer", "(I)I", "", "MediaBrowserCompatCustomActionResultReceiver", "(I)Ljava/lang/String;", "", "write", "(ILjava/lang/Object;)Z", "AudioAttributesImplApi21Parcelizer", "MediaBrowserCompatItemReceiver", "I", "Lo/findSize$read;", "IconCompatParcelizer", "Lo/findSize$IconCompatParcelizer;", "RemoteActionCompatParcelizer", "Lo/findSize$AudioAttributesCompatParcelizer;", "read", "mask"}, k = 1, mv = {2, 0, 0}, xi = 48)
@submitMagicModule
public final class findSize {

    /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: from kotlin metadata */
    private final int write;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final int write = AudioAttributesCompatParcelizer(_rename.IconCompatParcelizer(read.INSTANCE.IconCompatParcelizer(), IconCompatParcelizer.INSTANCE.read(), AudioAttributesCompatParcelizer.INSTANCE.AudioAttributesCompatParcelizer()));
    private static final int read = AudioAttributesCompatParcelizer(_rename.IconCompatParcelizer(read.INSTANCE.read(), IconCompatParcelizer.INSTANCE.IconCompatParcelizer(), AudioAttributesCompatParcelizer.INSTANCE.write()));
    private static final int IconCompatParcelizer = AudioAttributesCompatParcelizer(_rename.IconCompatParcelizer(read.INSTANCE.RemoteActionCompatParcelizer(), IconCompatParcelizer.INSTANCE.write(), AudioAttributesCompatParcelizer.INSTANCE.AudioAttributesCompatParcelizer()));
    private static final int AudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(0);

    public static int AudioAttributesCompatParcelizer(int i) {
        return i;
    }

    public static final boolean IconCompatParcelizer(int i, int i2) {
        return i == i2;
    }

    private /* synthetic */ findSize(int i) {
        this.write = i;
    }

    public static final int IconCompatParcelizer(int i) {
        return read.RemoteActionCompatParcelizer(_rename.RemoteActionCompatParcelizer(i));
    }

    public static final int write(int i) {
        return IconCompatParcelizer.read(_rename.read(i));
    }

    public static final int read(int i) {
        return AudioAttributesCompatParcelizer.write(_rename.MediaBrowserCompatCustomActionResultReceiver(i));
    }

    public final String toString() {
        return MediaBrowserCompatCustomActionResultReceiver(this.write);
    }

    public static String MediaBrowserCompatCustomActionResultReceiver(int i) {
        StringBuilder sb = new StringBuilder("LineBreak(strategy=");
        sb.append((Object) read.read(IconCompatParcelizer(i)));
        sb.append(", strictness=");
        sb.append((Object) IconCompatParcelizer.RemoteActionCompatParcelizer(write(i)));
        sb.append(", wordBreak=");
        sb.append((Object) AudioAttributesCompatParcelizer.read(read(i)));
        sb.append(')');
        return sb.toString();
    }

    /* JADX INFO: renamed from: o.findSize$RemoteActionCompatParcelizer, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u001a\u0010\u000b\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b\u000b\u0010\b"}, d2 = {"Lo/findSize$RemoteActionCompatParcelizer;", "", "<init>", "()V", "Lo/findSize;", "write", "I", "RemoteActionCompatParcelizer", "()I", "read", "AudioAttributesCompatParcelizer", "IconCompatParcelizer"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final int RemoteActionCompatParcelizer() {
            return findSize.write;
        }

        public final int IconCompatParcelizer() {
            return findSize.AudioAttributesCompatParcelizer;
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }

    public static final /* synthetic */ findSize RemoteActionCompatParcelizer(int i) {
        return new findSize(i);
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087@\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\u0007\u001a\u00020\t2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0007\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\u0005R\u0014\u0010\u0007\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r\u0088\u0001\u000e\u0092\u0001\u00020\u0002"}, d2 = {"Lo/findSize$read;", "", "", "p0", "RemoteActionCompatParcelizer", "(I)I", "", "read", "(I)Ljava/lang/String;", "", "(ILjava/lang/Object;)Z", "AudioAttributesCompatParcelizer", "MediaBrowserCompatItemReceiver", "I", AppMeasurementSdk.ConditionalUserProperty.VALUE}, k = 1, mv = {2, 0, 0}, xi = 48)
    @submitMagicModule
    public static final class read {

        /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: from kotlin metadata */
        private final int read;

        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final int RemoteActionCompatParcelizer = RemoteActionCompatParcelizer(1);
        private static final int write = RemoteActionCompatParcelizer(2);
        private static final int read = RemoteActionCompatParcelizer(3);
        private static final int IconCompatParcelizer = RemoteActionCompatParcelizer(0);

        public static int RemoteActionCompatParcelizer(int i) {
            return i;
        }

        public static final boolean write(int i, int i2) {
            return i == i2;
        }

        /* JADX INFO: renamed from: o.findSize$read$AudioAttributesCompatParcelizer, reason: from kotlin metadata */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0007\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\t\u0010\bR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b\n\u0010\bR\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006"}, d2 = {"Lo/findSize$read$AudioAttributesCompatParcelizer;", "", "<init>", "()V", "Lo/findSize$read;", "write", "I", "IconCompatParcelizer", "()I", "RemoteActionCompatParcelizer", "read", "AudioAttributesCompatParcelizer"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public final int IconCompatParcelizer() {
                return read.RemoteActionCompatParcelizer;
            }

            public final int RemoteActionCompatParcelizer() {
                return read.write;
            }

            public final int read() {
                return read.read;
            }

            public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
                this();
            }
        }

        public final String toString() {
            return read(this.read);
        }

        public static String read(int i) {
            return write(i, RemoteActionCompatParcelizer) ? "Strategy.Simple" : write(i, write) ? "Strategy.HighQuality" : write(i, read) ? "Strategy.Balanced" : write(i, IconCompatParcelizer) ? "Strategy.Unspecified" : "Invalid";
        }

        public static boolean read(int i, Object obj) {
            return (obj instanceof read) && i == ((read) obj).getRead();
        }

        public static int AudioAttributesCompatParcelizer(int i) {
            return Integer.hashCode(i);
        }

        public final boolean equals(Object obj) {
            return read(this.read, obj);
        }

        public final int hashCode() {
            return AudioAttributesCompatParcelizer(this.read);
        }

        /* JADX INFO: renamed from: write, reason: from getter */
        public final /* synthetic */ int getRead() {
            return this.read;
        }
    }

    public static boolean write(int i, Object obj) {
        return (obj instanceof findSize) && i == ((findSize) obj).getWrite();
    }

    public static int AudioAttributesImplApi21Parcelizer(int i) {
        return Integer.hashCode(i);
    }

    public final boolean equals(Object obj) {
        return write(this.write, obj);
    }

    public final int hashCode() {
        return AudioAttributesImplApi21Parcelizer(this.write);
    }

    /* JADX INFO: renamed from: write, reason: from getter */
    public final /* synthetic */ int getWrite() {
        return this.write;
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087@\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\n\u001a\u00020\t2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\u0005R\u0014\u0010\u0007\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e\u0088\u0001\u000f\u0092\u0001\u00020\u0002"}, d2 = {"Lo/findSize$IconCompatParcelizer;", "", "", "p0", "read", "(I)I", "", "RemoteActionCompatParcelizer", "(I)Ljava/lang/String;", "", "IconCompatParcelizer", "(ILjava/lang/Object;)Z", "AudioAttributesCompatParcelizer", "AudioAttributesImplBaseParcelizer", "I", AppMeasurementSdk.ConditionalUserProperty.VALUE}, k = 1, mv = {2, 0, 0}, xi = 48)
    @submitMagicModule
    public static final class IconCompatParcelizer {

        /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: from kotlin metadata */
        private final int RemoteActionCompatParcelizer;

        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final int IconCompatParcelizer = read(1);
        private static final int read = read(2);
        private static final int AudioAttributesCompatParcelizer = read(3);
        private static final int write = read(4);
        private static final int MediaBrowserCompatItemReceiver = read(0);

        public static int read(int i) {
            return i;
        }

        public static final boolean write(int i, int i2) {
            return i == i2;
        }

        /* JADX INFO: renamed from: o.findSize$IconCompatParcelizer$RemoteActionCompatParcelizer, reason: from kotlin metadata */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0007\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\u0005\u0010\bR\u001a\u0010\u000b\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b\t\u0010\bR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\u000b\u0010\bR\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0006"}, d2 = {"Lo/findSize$IconCompatParcelizer$RemoteActionCompatParcelizer;", "", "<init>", "()V", "Lo/findSize$IconCompatParcelizer;", "IconCompatParcelizer", "I", "RemoteActionCompatParcelizer", "()I", "read", "AudioAttributesCompatParcelizer", "write"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public final int RemoteActionCompatParcelizer() {
                return IconCompatParcelizer.IconCompatParcelizer;
            }

            public final int IconCompatParcelizer() {
                return IconCompatParcelizer.read;
            }

            public final int read() {
                return IconCompatParcelizer.AudioAttributesCompatParcelizer;
            }

            public final int write() {
                return IconCompatParcelizer.write;
            }

            public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
                this();
            }
        }

        public final String toString() {
            return RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer);
        }

        public static String RemoteActionCompatParcelizer(int i) {
            return write(i, IconCompatParcelizer) ? "Strictness.None" : write(i, read) ? "Strictness.Loose" : write(i, AudioAttributesCompatParcelizer) ? "Strictness.Normal" : write(i, write) ? "Strictness.Strict" : write(i, MediaBrowserCompatItemReceiver) ? "Strictness.Unspecified" : "Invalid";
        }

        public static boolean IconCompatParcelizer(int i, Object obj) {
            return (obj instanceof IconCompatParcelizer) && i == ((IconCompatParcelizer) obj).getRemoteActionCompatParcelizer();
        }

        public static int AudioAttributesCompatParcelizer(int i) {
            return Integer.hashCode(i);
        }

        public final boolean equals(Object obj) {
            return IconCompatParcelizer(this.RemoteActionCompatParcelizer, obj);
        }

        public final int hashCode() {
            return AudioAttributesCompatParcelizer(this.RemoteActionCompatParcelizer);
        }

        /* JADX INFO: renamed from: IconCompatParcelizer, reason: from getter */
        public final /* synthetic */ int getRemoteActionCompatParcelizer() {
            return this.RemoteActionCompatParcelizer;
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087@\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\n\u001a\u00020\t2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\u0005R\u0014\u0010\f\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e\u0088\u0001\u000f\u0092\u0001\u00020\u0002"}, d2 = {"Lo/findSize$AudioAttributesCompatParcelizer;", "", "", "p0", "write", "(I)I", "", "read", "(I)Ljava/lang/String;", "", "AudioAttributesCompatParcelizer", "(ILjava/lang/Object;)Z", "IconCompatParcelizer", "RemoteActionCompatParcelizer", "I", AppMeasurementSdk.ConditionalUserProperty.VALUE}, k = 1, mv = {2, 0, 0}, xi = 48)
    @submitMagicModule
    public static final class AudioAttributesCompatParcelizer {

        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
        private final int IconCompatParcelizer;

        /* JADX INFO: renamed from: write, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final int read = write(1);
        private static final int AudioAttributesCompatParcelizer = write(2);
        private static final int IconCompatParcelizer = write(0);

        public static final boolean read(int i, int i2) {
            return i == i2;
        }

        public static int write(int i) {
            return i;
        }

        /* JADX INFO: renamed from: o.findSize$AudioAttributesCompatParcelizer$write, reason: from kotlin metadata */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\t\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\u0007\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\t\u0010\bR\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006"}, d2 = {"Lo/findSize$AudioAttributesCompatParcelizer$write;", "", "<init>", "()V", "Lo/findSize$AudioAttributesCompatParcelizer;", "read", "I", "AudioAttributesCompatParcelizer", "()I", "write", "RemoteActionCompatParcelizer"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public final int AudioAttributesCompatParcelizer() {
                return AudioAttributesCompatParcelizer.read;
            }

            public final int write() {
                return AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer;
            }

            public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
                this();
            }
        }

        public final String toString() {
            return read(this.IconCompatParcelizer);
        }

        public static String read(int i) {
            return read(i, read) ? "WordBreak.None" : read(i, AudioAttributesCompatParcelizer) ? "WordBreak.Phrase" : read(i, IconCompatParcelizer) ? "WordBreak.Unspecified" : "Invalid";
        }

        public static boolean AudioAttributesCompatParcelizer(int i, Object obj) {
            return (obj instanceof AudioAttributesCompatParcelizer) && i == ((AudioAttributesCompatParcelizer) obj).getIconCompatParcelizer();
        }

        public static int IconCompatParcelizer(int i) {
            return Integer.hashCode(i);
        }

        public final boolean equals(Object obj) {
            return AudioAttributesCompatParcelizer(this.IconCompatParcelizer, obj);
        }

        public final int hashCode() {
            return IconCompatParcelizer(this.IconCompatParcelizer);
        }

        /* JADX INFO: renamed from: read, reason: from getter */
        public final /* synthetic */ int getIconCompatParcelizer() {
            return this.IconCompatParcelizer;
        }
    }
}
