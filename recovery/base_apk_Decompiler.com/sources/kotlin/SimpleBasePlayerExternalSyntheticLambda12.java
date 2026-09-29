package kotlin;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u0010\b\u0086\u0001\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000bB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\n\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\fj\u0002\b\nj\u0002\b\rj\u0002\b\u000ej\u0002\b\bj\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012"}, d2 = {"Lo/SimpleBasePlayerExternalSyntheticLambda12;", "", "", "p0", "<init>", "(Ljava/lang/String;II)V", "MediaBrowserCompatMediaItem", "I", "AudioAttributesCompatParcelizer", "()I", "write", "read", "IconCompatParcelizer", "AudioAttributesImplBaseParcelizer", "RemoteActionCompatParcelizer", "MediaBrowserCompatCustomActionResultReceiver", "AudioAttributesImplApi21Parcelizer", "AudioAttributesImplApi26Parcelizer", "MediaBrowserCompatItemReceiver"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SimpleBasePlayerExternalSyntheticLambda12 {
    private static final /* synthetic */ SimpleBasePlayerExternalSyntheticLambda12[] MediaDescriptionCompat;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    public static final Companion INSTANCE;

    /* JADX INFO: renamed from: MediaBrowserCompatMediaItem, reason: from kotlin metadata */
    private final int write;
    public static final SimpleBasePlayerExternalSyntheticLambda12 IconCompatParcelizer = new SimpleBasePlayerExternalSyntheticLambda12("GreaterThan", 0, 0);
    public static final SimpleBasePlayerExternalSyntheticLambda12 write = new SimpleBasePlayerExternalSyntheticLambda12("Equals", 1, 1);
    public static final SimpleBasePlayerExternalSyntheticLambda12 AudioAttributesImplBaseParcelizer = new SimpleBasePlayerExternalSyntheticLambda12("LessThan", 2, 2);
    public static final SimpleBasePlayerExternalSyntheticLambda12 RemoteActionCompatParcelizer = new SimpleBasePlayerExternalSyntheticLambda12("Contains", 3, 3);
    public static final SimpleBasePlayerExternalSyntheticLambda12 AudioAttributesCompatParcelizer = new SimpleBasePlayerExternalSyntheticLambda12("Between", 4, 4);
    public static final SimpleBasePlayerExternalSyntheticLambda12 MediaBrowserCompatCustomActionResultReceiver = new SimpleBasePlayerExternalSyntheticLambda12("NotEquals", 5, 15);
    public static final SimpleBasePlayerExternalSyntheticLambda12 AudioAttributesImplApi21Parcelizer = new SimpleBasePlayerExternalSyntheticLambda12("Set", 6, 26);
    public static final SimpleBasePlayerExternalSyntheticLambda12 AudioAttributesImplApi26Parcelizer = new SimpleBasePlayerExternalSyntheticLambda12("NotSet", 7, 27);
    public static final SimpleBasePlayerExternalSyntheticLambda12 MediaBrowserCompatItemReceiver = new SimpleBasePlayerExternalSyntheticLambda12("NotContains", 8, 28);

    private SimpleBasePlayerExternalSyntheticLambda12(String str, int i, int i2) {
        this.write = i2;
    }

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from getter */
    public final int getWrite() {
        return this.write;
    }

    static {
        SimpleBasePlayerExternalSyntheticLambda12[] simpleBasePlayerExternalSyntheticLambda12ArrWrite = write();
        MediaDescriptionCompat = simpleBasePlayerExternalSyntheticLambda12ArrWrite;
        getMagicModuleTimeline.IconCompatParcelizer(simpleBasePlayerExternalSyntheticLambda12ArrWrite);
        INSTANCE = new Companion(null);
    }

    /* JADX INFO: renamed from: o.SimpleBasePlayerExternalSyntheticLambda12$read, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lo/SimpleBasePlayerExternalSyntheticLambda12$read;", "", "<init>", "()V", "", "p0", "Lo/SimpleBasePlayerExternalSyntheticLambda12;", "write", "(I)Lo/SimpleBasePlayerExternalSyntheticLambda12;"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static SimpleBasePlayerExternalSyntheticLambda12 write(int p0) {
            SimpleBasePlayerExternalSyntheticLambda12 simpleBasePlayerExternalSyntheticLambda12;
            SimpleBasePlayerExternalSyntheticLambda12[] simpleBasePlayerExternalSyntheticLambda12ArrValues = SimpleBasePlayerExternalSyntheticLambda12.values();
            int length = simpleBasePlayerExternalSyntheticLambda12ArrValues.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    simpleBasePlayerExternalSyntheticLambda12 = null;
                    break;
                }
                simpleBasePlayerExternalSyntheticLambda12 = simpleBasePlayerExternalSyntheticLambda12ArrValues[i];
                if (simpleBasePlayerExternalSyntheticLambda12.getWrite() == p0) {
                    break;
                }
                i++;
            }
            return simpleBasePlayerExternalSyntheticLambda12 == null ? SimpleBasePlayerExternalSyntheticLambda12.write : simpleBasePlayerExternalSyntheticLambda12;
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }

    public static SimpleBasePlayerExternalSyntheticLambda12 valueOf(String str) {
        return (SimpleBasePlayerExternalSyntheticLambda12) Enum.valueOf(SimpleBasePlayerExternalSyntheticLambda12.class, str);
    }

    public static SimpleBasePlayerExternalSyntheticLambda12[] values() {
        return (SimpleBasePlayerExternalSyntheticLambda12[]) MediaDescriptionCompat.clone();
    }

    private static final /* synthetic */ SimpleBasePlayerExternalSyntheticLambda12[] write() {
        return new SimpleBasePlayerExternalSyntheticLambda12[]{IconCompatParcelizer, write, AudioAttributesImplBaseParcelizer, RemoteActionCompatParcelizer, AudioAttributesCompatParcelizer, MediaBrowserCompatCustomActionResultReceiver, AudioAttributesImplApi21Parcelizer, AudioAttributesImplApi26Parcelizer, MediaBrowserCompatItemReceiver};
    }
}
