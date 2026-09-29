package kotlin;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0001\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\tB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\b\u001a\u00020\u00028\u0006¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\nj\u0002\b\u000bj\u0002\b\f"}, d2 = {"Lo/StarRating;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "MediaBrowserCompatItemReceiver", "Ljava/lang/String;", "AudioAttributesCompatParcelizer", "RemoteActionCompatParcelizer", "IconCompatParcelizer", "AudioAttributesImplApi21Parcelizer", "write"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class StarRating {

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final /* synthetic */ StarRating[] read;

    /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: from kotlin metadata */
    private final String AudioAttributesCompatParcelizer;
    public static final StarRating AudioAttributesCompatParcelizer = new StarRating("ENDPOINT_SPIKY", 0, "-spiky");
    public static final StarRating IconCompatParcelizer = new StarRating("ENDPOINT_A1", 1, "/a1");
    private static StarRating AudioAttributesImplApi21Parcelizer = new StarRating("ENDPOINT_HELLO", 2, "/hello");
    public static final StarRating write = new StarRating("ENDPOINT_DEFINE_VARS", 3, "/defineVars");

    private StarRating(String str, int i, String str2) {
        this.AudioAttributesCompatParcelizer = str2;
    }

    static {
        StarRating[] starRatingArrWrite = write();
        read = starRatingArrWrite;
        getMagicModuleTimeline.IconCompatParcelizer(starRatingArrWrite);
        INSTANCE = new Companion(null);
    }

    /* JADX INFO: renamed from: o.StarRating$RemoteActionCompatParcelizer, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lo/StarRating$RemoteActionCompatParcelizer;", "", "<init>", "()V", "Lo/lambdasetVideoSurfaceHolder18;", "p0", "Lo/StarRating;", "read", "(Lo/lambdasetVideoSurfaceHolder18;)Lo/StarRating;"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: o.StarRating$RemoteActionCompatParcelizer$read */
        public final /* synthetic */ class read {
            public static final /* synthetic */ int[] RemoteActionCompatParcelizer;

            static {
                int[] iArr = new int[lambdasetVideoSurfaceHolder18.values().length];
                try {
                    iArr[lambdasetVideoSurfaceHolder18.PUSH_NOTIFICATION_VIEWED.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[lambdasetVideoSurfaceHolder18.REGULAR.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[lambdasetVideoSurfaceHolder18.VARIABLES.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                RemoteActionCompatParcelizer = iArr;
            }
        }

        private Companion() {
        }

        @getMagicModuleMeta
        public static StarRating read(lambdasetVideoSurfaceHolder18 p0) {
            toMagicModuleMetaRepoModel.write(p0, "");
            int i = read.RemoteActionCompatParcelizer[p0.ordinal()];
            if (i == 1) {
                return StarRating.AudioAttributesCompatParcelizer;
            }
            if (i == 2) {
                return StarRating.IconCompatParcelizer;
            }
            if (i != 3) {
                throw new RenewEligibleCreator();
            }
            return StarRating.write;
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }

    public static StarRating valueOf(String str) {
        return (StarRating) Enum.valueOf(StarRating.class, str);
    }

    public static StarRating[] values() {
        return (StarRating[]) read.clone();
    }

    private static final /* synthetic */ StarRating[] write() {
        return new StarRating[]{AudioAttributesCompatParcelizer, IconCompatParcelizer, AudioAttributesImplApi21Parcelizer, write};
    }
}
