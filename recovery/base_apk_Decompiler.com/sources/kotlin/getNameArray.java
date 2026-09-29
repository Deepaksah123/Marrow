package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0087@\u0018\u0000 \b*\u0006\b\u0000\u0010\u0001 \u00012\u00020\u0002:\u0003\u0013\u0006\bB\u0013\b\u0000\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0006\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\u0006\u0010\u0005J\u000f\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0000X\u0080\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0011\u0010\b\u001a\u00020\r8G¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\r8G¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u000f\u0088\u0001\u0016\u0092\u0001\u0004\u0018\u00010\u0002"}, d2 = {"Lo/getNameArray;", "T", "", "p0", "write", "(Ljava/lang/Object;)Ljava/lang/Object;", "AudioAttributesCompatParcelizer", "", "read", "(Ljava/lang/Object;)Ljava/lang/Throwable;", "", "AudioAttributesImplBaseParcelizer", "(Ljava/lang/Object;)Ljava/lang/String;", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "IconCompatParcelizer", "Ljava/lang/Object;", "MediaBrowserCompatCustomActionResultReceiver", "holder"}, k = 1, mv = {2, 0, 0}, xi = 48)
@submitMagicModule
public final class getNameArray<T> {

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final Object write;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final IconCompatParcelizer AudioAttributesCompatParcelizer = new IconCompatParcelizer();

    public static <T> Object write(Object obj) {
        return obj;
    }

    private /* synthetic */ getNameArray(Object obj) {
        this.write = obj;
    }

    public static final boolean MediaBrowserCompatCustomActionResultReceiver(Object obj) {
        return !(obj instanceof IconCompatParcelizer);
    }

    public static final boolean IconCompatParcelizer(Object obj) {
        return obj instanceof AudioAttributesCompatParcelizer;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final T AudioAttributesCompatParcelizer(Object obj) {
        if (obj instanceof IconCompatParcelizer) {
            return null;
        }
        return obj;
    }

    public static final Throwable read(Object obj) {
        AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = obj instanceof AudioAttributesCompatParcelizer ? (AudioAttributesCompatParcelizer) obj : null;
        if (audioAttributesCompatParcelizer != null) {
            return audioAttributesCompatParcelizer.RemoteActionCompatParcelizer;
        }
        return null;
    }

    public static class IconCompatParcelizer {
        public String toString() {
            return "Failed";
        }
    }

    public static final class AudioAttributesCompatParcelizer extends IconCompatParcelizer {
        public final Throwable RemoteActionCompatParcelizer;

        public AudioAttributesCompatParcelizer(Throwable th) {
            this.RemoteActionCompatParcelizer = th;
        }

        public final boolean equals(Object obj) {
            return (obj instanceof AudioAttributesCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer, ((AudioAttributesCompatParcelizer) obj).RemoteActionCompatParcelizer);
        }

        public final int hashCode() {
            Throwable th = this.RemoteActionCompatParcelizer;
            if (th != null) {
                return th.hashCode();
            }
            return 0;
        }

        @Override // o.getNameArray.IconCompatParcelizer
        public final String toString() {
            StringBuilder sb = new StringBuilder("Closed(");
            sb.append(this.RemoteActionCompatParcelizer);
            sb.append(')');
            return sb.toString();
        }
    }

    /* JADX INFO: renamed from: o.getNameArray$read, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00010\u0006\"\u0004\b\u0001\u0010\u00042\u0006\u0010\u0005\u001a\u00028\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00010\u0006\"\u0004\b\u0001\u0010\u0004¢\u0006\u0004\b\u0007\u0010\tJ#\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00010\u0006\"\u0004\b\u0001\u0010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0007\u001a\u00020\r8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u000e"}, d2 = {"Lo/getNameArray$read;", "", "<init>", "()V", "E", "p0", "Lo/getNameArray;", "read", "(Ljava/lang/Object;)Ljava/lang/Object;", "()Ljava/lang/Object;", "", "AudioAttributesCompatParcelizer", "(Ljava/lang/Throwable;)Ljava/lang/Object;", "Lo/getNameArray$IconCompatParcelizer;", "Lo/getNameArray$IconCompatParcelizer;"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static <E> Object read(E p0) {
            return getNameArray.write(p0);
        }

        public static <E> Object read() {
            return getNameArray.write(getNameArray.AudioAttributesCompatParcelizer);
        }

        public static <E> Object AudioAttributesCompatParcelizer(Throwable p0) {
            return getNameArray.write(new AudioAttributesCompatParcelizer(p0));
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }

    public final String toString() {
        return AudioAttributesImplBaseParcelizer(this.write);
    }

    private static String AudioAttributesImplBaseParcelizer(Object obj) {
        if (obj instanceof AudioAttributesCompatParcelizer) {
            return ((AudioAttributesCompatParcelizer) obj).toString();
        }
        StringBuilder sb = new StringBuilder("Value(");
        sb.append(obj);
        sb.append(')');
        return sb.toString();
    }

    public static final /* synthetic */ getNameArray RemoteActionCompatParcelizer(Object obj) {
        return new getNameArray(obj);
    }

    private static boolean write(Object obj, Object obj2) {
        return (obj2 instanceof getNameArray) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(obj, ((getNameArray) obj2).getWrite());
    }

    private static int AudioAttributesImplApi26Parcelizer(Object obj) {
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final boolean equals(Object p0) {
        return write(this.write, p0);
    }

    public final int hashCode() {
        return AudioAttributesImplApi26Parcelizer(this.write);
    }

    /* JADX INFO: renamed from: read, reason: from getter */
    public final /* synthetic */ Object getWrite() {
        return this.write;
    }
}
