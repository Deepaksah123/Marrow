package kotlin;

import com.marrow.data.models.common.CourseConfigV2;

/* JADX INFO: loaded from: classes3.dex */
public final class withLivePostrollPlaceholderAppended extends withSkippedAdGroup {
    private CourseConfigV2 IconCompatParcelizer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @setSdkPayload
    public withLivePostrollPlaceholderAppended(getStreamPositionUsForContent getstreampositionusforcontent, parseLongAttr parselongattr) {
        super(getstreampositionusforcontent, parselongattr);
        toMagicModuleMetaRepoModel.write(getstreampositionusforcontent, "");
        toMagicModuleMetaRepoModel.write(parselongattr, "");
    }

    @Override // kotlin.withSkippedAdGroup, kotlin.withLastAdRemoved
    public final CourseConfigV2 IconCompatParcelizer() {
        CourseConfigV2 courseConfigV2 = this.IconCompatParcelizer;
        if (courseConfigV2 != null) {
            return courseConfigV2;
        }
        CourseConfigV2 courseConfigV2IconCompatParcelizer = super.IconCompatParcelizer();
        this.IconCompatParcelizer = courseConfigV2IconCompatParcelizer;
        return courseConfigV2IconCompatParcelizer;
    }

    @Override // kotlin.withSkippedAdGroup, kotlin.withLastAdRemoved
    public final void RemoteActionCompatParcelizer(CourseConfigV2 courseConfigV2) {
        toMagicModuleMetaRepoModel.write(courseConfigV2, "");
        this.IconCompatParcelizer = courseConfigV2;
        super.RemoteActionCompatParcelizer(courseConfigV2);
    }

    @Override // kotlin.withSkippedAdGroup, kotlin.withLastAdRemoved
    public final void AudioAttributesCompatParcelizer(boolean z) {
        this.IconCompatParcelizer = null;
        if (z) {
            super.AudioAttributesCompatParcelizer(z);
        }
    }
}
