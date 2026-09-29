package kotlin;

import com.marrow.ui.activities.learn.video.overlay.VideoTimelineItem;
import com.marrow.ui.fragments.learn.model.ActiveRecallQbankLessonUiModel;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\t\u0010\u0014\u001a\u00020\bHÆ\u0003J\t\u0010\u0015\u001a\u00020\bHÆ\u0003J9\u0010\u0016\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0017\u001a\u00020\b2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\t\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0011¨\u0006\u001d"}, d2 = {"Lcom/marrow/ui/activities/learn/video/overlay/timelines/VideoTimelineUiState;", "", "timelineList", "", "Lcom/marrow/ui/activities/learn/video/overlay/VideoTimelineItem;", "activeRecallQbankLessonUiModel", "Lcom/marrow/ui/fragments/learn/model/ActiveRecallQbankLessonUiModel;", "showBackOption", "", "isTimelineBookmarkExpandButtonVisible", "<init>", "(Ljava/util/List;Lcom/marrow/ui/fragments/learn/model/ActiveRecallQbankLessonUiModel;ZZ)V", "getTimelineList", "()Ljava/util/List;", "getActiveRecallQbankLessonUiModel", "()Lcom/marrow/ui/fragments/learn/model/ActiveRecallQbankLessonUiModel;", "getShowBackOption", "()Z", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class attachFontFace {
    private final boolean AudioAttributesCompatParcelizer;
    private final boolean IconCompatParcelizer;
    private final List<VideoTimelineItem> read;
    private final ActiveRecallQbankLessonUiModel write;

    private attachFontFace(List<VideoTimelineItem> list, ActiveRecallQbankLessonUiModel activeRecallQbankLessonUiModel, boolean z, boolean z2) {
        toMagicModuleMetaRepoModel.write(list, "");
        this.read = list;
        this.write = activeRecallQbankLessonUiModel;
        this.IconCompatParcelizer = z;
        this.AudioAttributesCompatParcelizer = z2;
    }

    public /* synthetic */ attachFontFace(List list, ActiveRecallQbankLessonUiModel activeRecallQbankLessonUiModel, boolean z, boolean z2, int i, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this((i & 1) != 0 ? IntermediateLoginResponseBody.RemoteActionCompatParcelizer() : list, (i & 2) != 0 ? null : activeRecallQbankLessonUiModel, (i & 4) != 0 ? false : z, (i & 8) != 0 ? false : z2);
    }

    public final List<VideoTimelineItem> AudioAttributesCompatParcelizer() {
        return this.read;
    }

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from getter */
    public final ActiveRecallQbankLessonUiModel getWrite() {
        return this.write;
    }

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from getter */
    public final boolean getIconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    /* JADX INFO: renamed from: write, reason: from getter */
    public final boolean getAudioAttributesCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    public attachFontFace() {
        this(null, null, false, false, 15, null);
    }

    public static /* synthetic */ attachFontFace RemoteActionCompatParcelizer(attachFontFace attachfontface, List list, ActiveRecallQbankLessonUiModel activeRecallQbankLessonUiModel, boolean z, boolean z2, int i) {
        if ((i & 1) != 0) {
            list = attachfontface.read;
        }
        if ((i & 2) != 0) {
            activeRecallQbankLessonUiModel = attachfontface.write;
        }
        if ((i & 4) != 0) {
            z = attachfontface.IconCompatParcelizer;
        }
        if ((i & 8) != 0) {
            z2 = attachfontface.AudioAttributesCompatParcelizer;
        }
        return IconCompatParcelizer(list, activeRecallQbankLessonUiModel, z, z2);
    }

    private static attachFontFace IconCompatParcelizer(List<VideoTimelineItem> list, ActiveRecallQbankLessonUiModel activeRecallQbankLessonUiModel, boolean z, boolean z2) {
        toMagicModuleMetaRepoModel.write(list, "");
        return new attachFontFace(list, activeRecallQbankLessonUiModel, z, z2);
    }

    public final boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof attachFontFace)) {
            return false;
        }
        attachFontFace attachfontface = (attachFontFace) other;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.read, attachfontface.read) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.write, attachfontface.write) && this.IconCompatParcelizer == attachfontface.IconCompatParcelizer && this.AudioAttributesCompatParcelizer == attachfontface.AudioAttributesCompatParcelizer;
    }

    public final int hashCode() {
        int iHashCode = this.read.hashCode();
        ActiveRecallQbankLessonUiModel activeRecallQbankLessonUiModel = this.write;
        return (((((iHashCode * 31) + (activeRecallQbankLessonUiModel == null ? 0 : activeRecallQbankLessonUiModel.hashCode())) * 31) + Boolean.hashCode(this.IconCompatParcelizer)) * 31) + Boolean.hashCode(this.AudioAttributesCompatParcelizer);
    }

    public final String toString() {
        List<VideoTimelineItem> list = this.read;
        ActiveRecallQbankLessonUiModel activeRecallQbankLessonUiModel = this.write;
        boolean z = this.IconCompatParcelizer;
        boolean z2 = this.AudioAttributesCompatParcelizer;
        StringBuilder sb = new StringBuilder("VideoTimelineUiState(timelineList=");
        sb.append(list);
        sb.append(", activeRecallQbankLessonUiModel=");
        sb.append(activeRecallQbankLessonUiModel);
        sb.append(", showBackOption=");
        sb.append(z);
        sb.append(", isTimelineBookmarkExpandButtonVisible=");
        sb.append(z2);
        sb.append(")");
        return sb.toString();
    }
}
