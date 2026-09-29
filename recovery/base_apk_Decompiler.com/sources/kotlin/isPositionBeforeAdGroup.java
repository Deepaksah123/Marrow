package kotlin;

import com.marrow.data.api.models.MarrowResponse;
import com.marrow.data.api.models.response.lesson.VideoBookmarkTimeline;
import com.marrow.data.api.models.response.timeline.VideoTimelineResponseBody;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u00062\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J#\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\t2\u0006\u0010\u0002\u001a\u00020\bH\u0016¢\u0006\u0004\b\f\u0010\rJ#\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\t2\u0006\u0010\u0002\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000e\u0010\rJ+\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\t2\u0006\u0010\u0002\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0006\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013"}, d2 = {"Lo/isPositionBeforeAdGroup;", "Lo/createEmptyAdGroups;", "p0", "<init>", "(Lo/createEmptyAdGroups;)V", "", "IconCompatParcelizer", "()I", "Lcom/marrow/data/api/models/response/lesson/VideoBookmarkTimeline;", "Lo/accessgetEmptyStatecp;", "Lcom/marrow/data/api/models/MarrowResponse;", "Lcom/marrow/data/api/models/response/timeline/VideoTimelineResponseBody;", "RemoteActionCompatParcelizer", "(Lcom/marrow/data/api/models/response/lesson/VideoBookmarkTimeline;)Lo/accessgetEmptyStatecp;", "AudioAttributesCompatParcelizer", "p1", "read", "(Lcom/marrow/data/api/models/response/lesson/VideoBookmarkTimeline;I)Lo/accessgetEmptyStatecp;", "write", "Lo/createEmptyAdGroups;"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class isPositionBeforeAdGroup implements createEmptyAdGroups {

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final createEmptyAdGroups IconCompatParcelizer;

    public static final /* synthetic */ void write() {
    }

    public isPositionBeforeAdGroup(createEmptyAdGroups createemptyadgroups) {
        toMagicModuleMetaRepoModel.write(createemptyadgroups, "");
        this.IconCompatParcelizer = createemptyadgroups;
    }

    @Override // kotlin.createEmptyAdGroups
    public final int IconCompatParcelizer() {
        return this.IconCompatParcelizer.IconCompatParcelizer();
    }

    @Override // kotlin.createEmptyAdGroups
    public final accessgetEmptyStatecp<MarrowResponse<VideoTimelineResponseBody>> RemoteActionCompatParcelizer(VideoBookmarkTimeline p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        return this.IconCompatParcelizer.RemoteActionCompatParcelizer(p0);
    }

    @Override // kotlin.createEmptyAdGroups
    public final accessgetEmptyStatecp<MarrowResponse<VideoTimelineResponseBody>> AudioAttributesCompatParcelizer(VideoBookmarkTimeline p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        return this.IconCompatParcelizer.AudioAttributesCompatParcelizer(p0);
    }

    @Override // kotlin.createEmptyAdGroups
    public final accessgetEmptyStatecp<MarrowResponse<VideoTimelineResponseBody>> read(VideoBookmarkTimeline p0, int p1) {
        toMagicModuleMetaRepoModel.write(p0, "");
        return this.IconCompatParcelizer.read(p0, p1);
    }

    /* JADX INFO: renamed from: o.isPositionBeforeAdGroup$IconCompatParcelizer, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0003"}, d2 = {"Lo/isPositionBeforeAdGroup$IconCompatParcelizer;", "", "<init>", "()V", "", "RemoteActionCompatParcelizer"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @getMagicModuleMeta
        public static void RemoteActionCompatParcelizer() {
            isPositionBeforeAdGroup.write();
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }

    @getMagicModuleMeta
    public static final void RemoteActionCompatParcelizer() {
        Companion.RemoteActionCompatParcelizer();
    }
}
