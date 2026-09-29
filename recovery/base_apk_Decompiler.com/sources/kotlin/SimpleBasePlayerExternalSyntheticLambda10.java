package kotlin;

import com.google.android.exoplayer2.source.rtsp.RtspHeaders;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0010\b\u0086\u0001\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000bB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\n\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\nj\u0002\b\u000fj\u0002\b\bj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012"}, d2 = {"Lo/SimpleBasePlayerExternalSyntheticLambda10;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "MediaBrowserCompatSearchResultReceiver", "Ljava/lang/String;", "AudioAttributesCompatParcelizer", "()Ljava/lang/String;", "IconCompatParcelizer", "write", "read", "AudioAttributesImplApi21Parcelizer", "MediaBrowserCompatCustomActionResultReceiver", "RemoteActionCompatParcelizer", "AudioAttributesImplBaseParcelizer", "AudioAttributesImplApi26Parcelizer", "MediaBrowserCompatItemReceiver"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SimpleBasePlayerExternalSyntheticLambda10 {
    private static final /* synthetic */ SimpleBasePlayerExternalSyntheticLambda10[] MediaMetadataCompat;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    public static final Companion INSTANCE;

    /* JADX INFO: renamed from: MediaBrowserCompatSearchResultReceiver, reason: from kotlin metadata */
    private final String IconCompatParcelizer;
    public static final SimpleBasePlayerExternalSyntheticLambda10 read = new SimpleBasePlayerExternalSyntheticLambda10("Ever", 0, "ever");
    public static final SimpleBasePlayerExternalSyntheticLambda10 AudioAttributesImplApi21Parcelizer = new SimpleBasePlayerExternalSyntheticLambda10(RtspHeaders.SESSION, 1, "session");
    public static final SimpleBasePlayerExternalSyntheticLambda10 MediaBrowserCompatCustomActionResultReceiver = new SimpleBasePlayerExternalSyntheticLambda10("Seconds", 2, "seconds");
    public static final SimpleBasePlayerExternalSyntheticLambda10 IconCompatParcelizer = new SimpleBasePlayerExternalSyntheticLambda10("Minutes", 3, "minutes");
    public static final SimpleBasePlayerExternalSyntheticLambda10 RemoteActionCompatParcelizer = new SimpleBasePlayerExternalSyntheticLambda10("Hours", 4, "hours");
    public static final SimpleBasePlayerExternalSyntheticLambda10 AudioAttributesCompatParcelizer = new SimpleBasePlayerExternalSyntheticLambda10("Days", 5, "days");
    public static final SimpleBasePlayerExternalSyntheticLambda10 AudioAttributesImplBaseParcelizer = new SimpleBasePlayerExternalSyntheticLambda10("Weeks", 6, "weeks");
    public static final SimpleBasePlayerExternalSyntheticLambda10 AudioAttributesImplApi26Parcelizer = new SimpleBasePlayerExternalSyntheticLambda10("OnEvery", 7, "onEvery");
    public static final SimpleBasePlayerExternalSyntheticLambda10 MediaBrowserCompatItemReceiver = new SimpleBasePlayerExternalSyntheticLambda10("OnExactly", 8, "onExactly");

    private SimpleBasePlayerExternalSyntheticLambda10(String str, int i, String str2) {
        this.IconCompatParcelizer = str2;
    }

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from getter */
    public final String getIconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    static {
        SimpleBasePlayerExternalSyntheticLambda10[] simpleBasePlayerExternalSyntheticLambda10ArrIconCompatParcelizer = IconCompatParcelizer();
        MediaMetadataCompat = simpleBasePlayerExternalSyntheticLambda10ArrIconCompatParcelizer;
        getMagicModuleTimeline.IconCompatParcelizer(simpleBasePlayerExternalSyntheticLambda10ArrIconCompatParcelizer);
        INSTANCE = new Companion(null);
    }

    /* JADX INFO: renamed from: o.SimpleBasePlayerExternalSyntheticLambda10$write, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lo/SimpleBasePlayerExternalSyntheticLambda10$write;", "", "<init>", "()V", "", "p0", "Lo/SimpleBasePlayerExternalSyntheticLambda10;", "read", "(Ljava/lang/String;)Lo/SimpleBasePlayerExternalSyntheticLambda10;"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static SimpleBasePlayerExternalSyntheticLambda10 read(String p0) {
            SimpleBasePlayerExternalSyntheticLambda10 simpleBasePlayerExternalSyntheticLambda10;
            toMagicModuleMetaRepoModel.write(p0, "");
            SimpleBasePlayerExternalSyntheticLambda10[] simpleBasePlayerExternalSyntheticLambda10ArrValues = SimpleBasePlayerExternalSyntheticLambda10.values();
            int length = simpleBasePlayerExternalSyntheticLambda10ArrValues.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    simpleBasePlayerExternalSyntheticLambda10 = null;
                    break;
                }
                simpleBasePlayerExternalSyntheticLambda10 = simpleBasePlayerExternalSyntheticLambda10ArrValues[i];
                if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) simpleBasePlayerExternalSyntheticLambda10.getIconCompatParcelizer(), (Object) p0)) {
                    break;
                }
                i++;
            }
            return simpleBasePlayerExternalSyntheticLambda10 == null ? SimpleBasePlayerExternalSyntheticLambda10.read : simpleBasePlayerExternalSyntheticLambda10;
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }

    public static SimpleBasePlayerExternalSyntheticLambda10 valueOf(String str) {
        return (SimpleBasePlayerExternalSyntheticLambda10) Enum.valueOf(SimpleBasePlayerExternalSyntheticLambda10.class, str);
    }

    public static SimpleBasePlayerExternalSyntheticLambda10[] values() {
        return (SimpleBasePlayerExternalSyntheticLambda10[]) MediaMetadataCompat.clone();
    }

    private static final /* synthetic */ SimpleBasePlayerExternalSyntheticLambda10[] IconCompatParcelizer() {
        return new SimpleBasePlayerExternalSyntheticLambda10[]{read, AudioAttributesImplApi21Parcelizer, MediaBrowserCompatCustomActionResultReceiver, IconCompatParcelizer, RemoteActionCompatParcelizer, AudioAttributesCompatParcelizer, AudioAttributesImplBaseParcelizer, AudioAttributesImplApi26Parcelizer, MediaBrowserCompatItemReceiver};
    }
}
