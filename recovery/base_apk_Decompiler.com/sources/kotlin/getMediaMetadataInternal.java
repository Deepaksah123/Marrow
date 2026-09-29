package kotlin;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.getPeriodIndexFromWindowPosition;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010%\n\u0002\b\u0002\b\u0000\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\r\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R \u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0014"}, d2 = {"Lo/getMediaMetadataInternal;", "", "", "p0", "Lo/getCurrentPeriodOrAdPositionMs;", "p1", "<init>", "(Ljava/lang/String;Lo/getCurrentPeriodOrAdPositionMs;)V", "Lo/getPeriodIndexFromWindowPosition$AudioAttributesCompatParcelizer;", "Lo/getPeriodOrAdDurationMs;", "read", "(Lo/getPeriodIndexFromWindowPosition$AudioAttributesCompatParcelizer;)Lo/getPeriodOrAdDurationMs;", "Lo/getCurrentTracksInternal;", "AudioAttributesCompatParcelizer", "()Lo/getCurrentTracksInternal;", "RemoteActionCompatParcelizer", "Ljava/lang/String;", "IconCompatParcelizer", "Lo/getCurrentPeriodOrAdPositionMs;", "", "Ljava/util/Map;", "write"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class getMediaMetadataInternal {

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final getCurrentPeriodOrAdPositionMs read;
    private final String RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final Map<getPeriodIndexFromWindowPosition.AudioAttributesCompatParcelizer, getPeriodOrAdDurationMs> AudioAttributesCompatParcelizer;

    public getMediaMetadataInternal(String str, getCurrentPeriodOrAdPositionMs getcurrentperiodoradpositionms) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(getcurrentperiodoradpositionms, "");
        this.RemoteActionCompatParcelizer = str;
        this.read = getcurrentperiodoradpositionms;
        this.AudioAttributesCompatParcelizer = new LinkedHashMap();
    }

    /* JADX INFO: renamed from: o.getMediaMetadataInternal$write, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lo/getMediaMetadataInternal$write;", "", "<init>", "()V", "Lo/getPeriodIndexFromWindowPosition$AudioAttributesCompatParcelizer;", "p0", "", "p1", "Lo/getCurrentPeriodOrAdPositionMs;", "p2", "Lo/getPeriodOrAdDurationMs;", "RemoteActionCompatParcelizer", "(Lo/getPeriodIndexFromWindowPosition$AudioAttributesCompatParcelizer;Ljava/lang/String;Lo/getCurrentPeriodOrAdPositionMs;)Lo/getPeriodOrAdDurationMs;"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: o.getMediaMetadataInternal$write$IconCompatParcelizer */
        public final /* synthetic */ class IconCompatParcelizer {
            public static final /* synthetic */ int[] AudioAttributesCompatParcelizer;

            static {
                int[] iArr = new int[getPeriodIndexFromWindowPosition.AudioAttributesCompatParcelizer.values().length];
                try {
                    iArr[getPeriodIndexFromWindowPosition.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[getPeriodIndexFromWindowPosition.AudioAttributesCompatParcelizer.read.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                AudioAttributesCompatParcelizer = iArr;
            }
        }

        private Companion() {
        }

        @getMagicModuleMeta
        public static getPeriodOrAdDurationMs RemoteActionCompatParcelizer(getPeriodIndexFromWindowPosition.AudioAttributesCompatParcelizer p0, String p1, getCurrentPeriodOrAdPositionMs p2) {
            toMagicModuleMetaRepoModel.write(p0, "");
            toMagicModuleMetaRepoModel.write(p1, "");
            toMagicModuleMetaRepoModel.write(p2, "");
            int i = IconCompatParcelizer.AudioAttributesCompatParcelizer[p0.ordinal()];
            if (i == 1) {
                return new getMediaItemIndexInNewPlaylist(p1);
            }
            if (i != 2) {
                throw new RenewEligibleCreator();
            }
            return new getCurrentTracksInternal(p2);
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }

    public final getPeriodOrAdDurationMs read(getPeriodIndexFromWindowPosition.AudioAttributesCompatParcelizer p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        Map<getPeriodIndexFromWindowPosition.AudioAttributesCompatParcelizer, getPeriodOrAdDurationMs> map = this.AudioAttributesCompatParcelizer;
        getPeriodOrAdDurationMs getperiodoraddurationmsRemoteActionCompatParcelizer = map.get(p0);
        if (getperiodoraddurationmsRemoteActionCompatParcelizer == null) {
            getperiodoraddurationmsRemoteActionCompatParcelizer = Companion.RemoteActionCompatParcelizer(p0, this.RemoteActionCompatParcelizer, this.read);
            map.put(p0, getperiodoraddurationmsRemoteActionCompatParcelizer);
        }
        return getperiodoraddurationmsRemoteActionCompatParcelizer;
    }

    public final getCurrentTracksInternal AudioAttributesCompatParcelizer() {
        Map<getPeriodIndexFromWindowPosition.AudioAttributesCompatParcelizer, getPeriodOrAdDurationMs> map = this.AudioAttributesCompatParcelizer;
        getPeriodIndexFromWindowPosition.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = getPeriodIndexFromWindowPosition.AudioAttributesCompatParcelizer.read;
        getPeriodOrAdDurationMs getperiodoraddurationmsRemoteActionCompatParcelizer = map.get(audioAttributesCompatParcelizer);
        if (getperiodoraddurationmsRemoteActionCompatParcelizer == null) {
            getperiodoraddurationmsRemoteActionCompatParcelizer = Companion.RemoteActionCompatParcelizer(getPeriodIndexFromWindowPosition.AudioAttributesCompatParcelizer.read, this.RemoteActionCompatParcelizer, this.read);
            map.put(audioAttributesCompatParcelizer, getperiodoraddurationmsRemoteActionCompatParcelizer);
        }
        toMagicModuleMetaRepoModel.read(getperiodoraddurationmsRemoteActionCompatParcelizer, "");
        return (getCurrentTracksInternal) getperiodoraddurationmsRemoteActionCompatParcelizer;
    }
}
