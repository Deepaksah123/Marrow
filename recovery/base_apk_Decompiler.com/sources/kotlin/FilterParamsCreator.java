package kotlin;

import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import com.google.android.exoplayer2.source.rtsp.SessionDescription;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0086\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\b\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\u000bj\u0002\b\bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010"}, d2 = {"Lo/FilterParamsCreator;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "AudioAttributesImplApi21Parcelizer", "Ljava/lang/String;", "read", "()Ljava/lang/String;", "write", "AudioAttributesCompatParcelizer", "RemoteActionCompatParcelizer", "IconCompatParcelizer", "AudioAttributesImplApi26Parcelizer", "MediaBrowserCompatItemReceiver", "MediaBrowserCompatCustomActionResultReceiver"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class FilterParamsCreator {
    private static final /* synthetic */ FilterParamsCreator[] AudioAttributesImplBaseParcelizer;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    public static final Companion INSTANCE;

    /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: from kotlin metadata */
    private final String read;
    public static final FilterParamsCreator AudioAttributesCompatParcelizer = new FilterParamsCreator("NO_ENCRYPTION", 0, SessionDescription.SUPPORTED_SDP_VERSION);
    public static final FilterParamsCreator read = new FilterParamsCreator("VERSION_1", 1, IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE);
    public static final FilterParamsCreator RemoteActionCompatParcelizer = new FilterParamsCreator("VERSION_2", 2, "2");
    public static final FilterParamsCreator IconCompatParcelizer = new FilterParamsCreator("VERSION_3", 3, "3");
    public static final FilterParamsCreator AudioAttributesImplApi26Parcelizer = new FilterParamsCreator("VERSION_4d4", 4, "4.4");
    public static final FilterParamsCreator MediaBrowserCompatItemReceiver = new FilterParamsCreator("VERSION_4d5", 5, "4.5");
    public static final FilterParamsCreator MediaBrowserCompatCustomActionResultReceiver = new FilterParamsCreator("VERSION_4d6", 6, "4.6");

    private FilterParamsCreator(String str, int i, String str2) {
        this.read = str2;
    }

    /* JADX INFO: renamed from: read, reason: from getter */
    public final String getRead() {
        return this.read;
    }

    static {
        FilterParamsCreator[] filterParamsCreatorArrRemoteActionCompatParcelizer = RemoteActionCompatParcelizer();
        AudioAttributesImplBaseParcelizer = filterParamsCreatorArrRemoteActionCompatParcelizer;
        getMagicModuleTimeline.IconCompatParcelizer(filterParamsCreatorArrRemoteActionCompatParcelizer);
        INSTANCE = new Companion(null);
    }

    /* JADX INFO: renamed from: o.FilterParamsCreator$write, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lo/FilterParamsCreator$write;", "", "<init>", "()V", "", "p0", "Lo/FilterParamsCreator;", "AudioAttributesCompatParcelizer", "(Ljava/lang/String;)Lo/FilterParamsCreator;"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static FilterParamsCreator AudioAttributesCompatParcelizer(String p0) {
            toMagicModuleMetaRepoModel.write(p0, "");
            for (FilterParamsCreator filterParamsCreator : FilterParamsCreator.values()) {
                if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) filterParamsCreator.getRead(), (Object) p0)) {
                    return filterParamsCreator;
                }
            }
            return FilterParamsCreator.AudioAttributesCompatParcelizer;
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }

    private static final /* synthetic */ FilterParamsCreator[] RemoteActionCompatParcelizer() {
        return new FilterParamsCreator[]{AudioAttributesCompatParcelizer, read, RemoteActionCompatParcelizer, IconCompatParcelizer, AudioAttributesImplApi26Parcelizer, MediaBrowserCompatItemReceiver, MediaBrowserCompatCustomActionResultReceiver};
    }

    public static FilterParamsCreator valueOf(String str) {
        return (FilterParamsCreator) Enum.valueOf(FilterParamsCreator.class, str);
    }

    public static FilterParamsCreator[] values() {
        return (FilterParamsCreator[]) AudioAttributesImplBaseParcelizer.clone();
    }
}
