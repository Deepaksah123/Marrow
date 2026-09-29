package kotlin;

import java.util.List;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.RecentUpdatesImageResponse;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002J\u000f\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002H\u0096\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0011\u0010\u0010\u001a\u00020\r8\u0006¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0015\u0010\u0012\u001a\u0006\u0012\u0002\b\u00030\u00118\u0006¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u0086\f¢\u0006\u0006\n\u0004\b\u0014\u0010\u000fR\u0011\u0010\u0017\u001a\u00020\u00168\u0006¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R \u0010\u0014\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00110\u00198\u0006@\u0006X\u0086\f¢\u0006\u0006\n\u0004\b\u0015\u0010\u001aR\"\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00000\u001b8\u0007@\u0006X\u0086\f¢\u0006\f\n\u0004\b\u0010\u0010\u001c\u001a\u0004\b\u0014\u0010\u001d"}, d2 = {"Lo/McqRemoteSourceImpl;", "T", "", "", "toString", "()Ljava/lang/String;", "p0", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lo/CourseConfigV2RepoModelKt;", "AudioAttributesImplBaseParcelizer", "Lo/CourseConfigV2RepoModelKt;", "AudioAttributesCompatParcelizer", "Lo/isHdPlaybackError;", "IconCompatParcelizer", "Lo/isHdPlaybackError;", "write", "read", "Lo/updateBookmark;", "RemoteActionCompatParcelizer", "Lo/updateBookmark;", "", "Ljava/util/List;", "Lo/McqService;", "Lo/McqService;", "()Lo/McqService;", "MediaBrowserCompatCustomActionResultReceiver"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class McqRemoteSourceImpl<T> {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private McqService<T> MediaBrowserCompatCustomActionResultReceiver;

    /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: from kotlin metadata */
    private final CourseConfigV2RepoModelKt AudioAttributesCompatParcelizer;
    private final isHdPlaybackError<?> IconCompatParcelizer;
    private final updateBookmark RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    public List<? extends isHdPlaybackError<?>> write;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    public CourseConfigV2RepoModelKt read;

    public final McqService<T> write() {
        return this.MediaBrowserCompatCustomActionResultReceiver;
    }

    public final String toString() {
        Objects.toString(this.RemoteActionCompatParcelizer);
        RecentUpdatesResponse.AudioAttributesCompatParcelizer(this.IconCompatParcelizer);
        CourseConfigV2RepoModelKt courseConfigV2RepoModelKt = this.AudioAttributesCompatParcelizer;
        RecentUpdatesImageResponse.RemoteActionCompatParcelizer remoteActionCompatParcelizer = RecentUpdatesImageResponse.AudioAttributesCompatParcelizer;
        if (!toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(courseConfigV2RepoModelKt, RecentUpdatesImageResponse.RemoteActionCompatParcelizer.read())) {
            Objects.toString(this.AudioAttributesCompatParcelizer);
        }
        throw null;
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        toMagicModuleMetaRepoModel.read(p0, "");
        McqRemoteSourceImpl mcqRemoteSourceImpl = (McqRemoteSourceImpl) p0;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.IconCompatParcelizer, mcqRemoteSourceImpl.IconCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.read, mcqRemoteSourceImpl.read) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.AudioAttributesCompatParcelizer, mcqRemoteSourceImpl.AudioAttributesCompatParcelizer);
    }

    public final int hashCode() {
        throw null;
    }
}
