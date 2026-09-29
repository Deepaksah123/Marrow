package kotlin;

import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import com.marrow.data.models.common.ImageUpload;
import com.marrow.data.models.user.LoggedUser;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class withAdDurationsUs implements withAdLoadError {
    private final getNextChunkIndex IconCompatParcelizer;
    private final onUtcTimestampResolved write;

    @setSdkPayload
    public withAdDurationsUs(onUtcTimestampResolved onutctimestampresolved, getNextChunkIndex getnextchunkindex) {
        toMagicModuleMetaRepoModel.write(onutctimestampresolved, "");
        toMagicModuleMetaRepoModel.write(getnextchunkindex, "");
        this.write = onutctimestampresolved;
        this.IconCompatParcelizer = getnextchunkindex;
    }

    @Override // kotlin.withAdLoadError
    public final void RemoteActionCompatParcelizer(long j) {
        this.write.IconCompatParcelizer(String.valueOf(j));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List RemoteActionCompatParcelizer(ImageUpload[] imageUploadArr) {
        toMagicModuleMetaRepoModel.write(imageUploadArr, "");
        return getOrderDetails.onCommand(imageUploadArr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List write(getAnswerMap getanswermap, Object obj) {
        toMagicModuleMetaRepoModel.write(obj, "");
        return (List) getanswermap.invoke(obj);
    }

    @Override // kotlin.withAdLoadError
    public final accessgetEmptyStatecp<List<ImageUpload>> IconCompatParcelizer(int i) {
        accessgetEmptyStatecp<ImageUpload[]> accessgetemptystatecpRemoteActionCompatParcelizer = this.write.RemoteActionCompatParcelizer("_type", IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE);
        final getAnswerMap getanswermap = new getAnswerMap() { // from class: o.withAdCount
            @Override // kotlin.getAnswerMap
            public final Object invoke(Object obj) {
                return withAdDurationsUs.RemoteActionCompatParcelizer((ImageUpload[]) obj);
            }
        };
        accessgetEmptyStatecp accessgetemptystatecpRemoteActionCompatParcelizer2 = accessgetemptystatecpRemoteActionCompatParcelizer.RemoteActionCompatParcelizer(new getSubjectTitle() { // from class: o.withContentResumeOffsetUs
            @Override // kotlin.getSubjectTitle
            public final Object apply(Object obj) {
                return withAdDurationsUs.write(getanswermap, obj);
            }
        });
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(accessgetemptystatecpRemoteActionCompatParcelizer2, "");
        return accessgetemptystatecpRemoteActionCompatParcelizer2;
    }

    @Override // kotlin.withAdLoadError
    public final String read(String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        return this.write.MediaBrowserCompatCustomActionResultReceiver(str);
    }

    @Override // kotlin.withAdLoadError
    public final void RemoteActionCompatParcelizer(LoggedUser loggedUser) {
        toMagicModuleMetaRepoModel.write(loggedUser, "");
        this.IconCompatParcelizer.read(loggedUser);
    }

    @Override // kotlin.withAdLoadError
    public final LoggedUser write() {
        return this.IconCompatParcelizer.IconCompatParcelizer();
    }
}
