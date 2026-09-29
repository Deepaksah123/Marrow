package kotlin;

import com.marrow.data.models.common.ApplicationData;
import java.util.HashMap;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\r"}, d2 = {"Lo/parseMediaPlaylist;", "Lo/getTrackOutputProvider;", "Lo/setTreatLoadErrorsAsEndOfStream;", "p0", "Lo/TrackGroupExternalSyntheticLambda0;", "p1", "Lcom/marrow/data/models/common/ApplicationData;", "p2", "Lo/getRepresentations;", "p3", "Lo/getStreamPositionUsForContent;", "p4", "<init>", "(Lo/setTreatLoadErrorsAsEndOfStream;Lo/TrackGroupExternalSyntheticLambda0;Lcom/marrow/data/models/common/ApplicationData;Lo/getRepresentations;Lo/getStreamPositionUsForContent;)V", "read"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class parseMediaPlaylist extends getTrackOutputProvider {

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final HashMap<String, String> write = new HashMap<>();

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public parseMediaPlaylist(setTreatLoadErrorsAsEndOfStream settreatloaderrorsasendofstream, TrackGroupExternalSyntheticLambda0 trackGroupExternalSyntheticLambda0, ApplicationData applicationData, getRepresentations getrepresentations, getStreamPositionUsForContent getstreampositionusforcontent) {
        super(settreatloaderrorsasendofstream, trackGroupExternalSyntheticLambda0, applicationData, getstreampositionusforcontent, getrepresentations);
        toMagicModuleMetaRepoModel.write(settreatloaderrorsasendofstream, "");
    }

    /* JADX INFO: renamed from: o.parseMediaPlaylist$read, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0003R\"\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t"}, d2 = {"Lo/parseMediaPlaylist$read;", "", "<init>", "()V", "", "RemoteActionCompatParcelizer", "Ljava/util/HashMap;", "", "write", "Ljava/util/HashMap;", "read"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @getMagicModuleMeta
        public static void RemoteActionCompatParcelizer() {
            parseMediaPlaylist.write.clear();
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }

    @getMagicModuleMeta
    public static final void AudioAttributesImplApi26Parcelizer() {
        Companion.RemoteActionCompatParcelizer();
    }
}
