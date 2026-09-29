package kotlin;

import java.util.Arrays;
import java.util.Collection;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public final class setContentNameForEvent extends setItemExpanded {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public setContentNameForEvent(Subscription subscription, String... strArr) {
        super(subscription, (String[]) Arrays.copyOf(strArr, strArr.length));
        toMagicModuleMetaRepoModel.write(subscription, "");
        toMagicModuleMetaRepoModel.write(strArr, "");
    }

    @Override // kotlin.setItemExpanded, kotlin.setTags
    public final /* synthetic */ Collection IconCompatParcelizer(getRelatedLessonId getrelatedlessonid, getTimeStamp gettimestamp) {
        return IconCompatParcelizer(getrelatedlessonid, gettimestamp);
    }

    @Override // kotlin.setItemExpanded, kotlin.getMcqContentBody
    public final /* synthetic */ void RemoteActionCompatParcelizer(getRelatedLessonId getrelatedlessonid, getTimeStamp gettimestamp) {
        MediaBrowserCompatCustomActionResultReceiver(getrelatedlessonid, gettimestamp);
    }

    @Override // kotlin.setItemExpanded, kotlin.setTags, kotlin.getMcqContentBody
    public final /* synthetic */ Collection read(getRelatedLessonId getrelatedlessonid, getTimeStamp gettimestamp) {
        return read(getrelatedlessonid, gettimestamp);
    }

    @Override // kotlin.setItemExpanded, kotlin.getMcqContentBody
    public final getQuestionLimit AudioAttributesCompatParcelizer(getRelatedLessonId getrelatedlessonid, getTimeStamp gettimestamp) {
        toMagicModuleMetaRepoModel.write(getrelatedlessonid, "");
        toMagicModuleMetaRepoModel.write(gettimestamp, "");
        StringBuilder sb = new StringBuilder();
        sb.append(IconCompatParcelizer());
        sb.append(", required name: ");
        sb.append(getrelatedlessonid);
        throw new IllegalStateException(sb.toString());
    }

    @Override // kotlin.setItemExpanded
    /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer */
    public final Set<CourseConfigV2SettingsItems> IconCompatParcelizer(getRelatedLessonId getrelatedlessonid, getTimeStamp gettimestamp) {
        toMagicModuleMetaRepoModel.write(getrelatedlessonid, "");
        toMagicModuleMetaRepoModel.write(gettimestamp, "");
        StringBuilder sb = new StringBuilder();
        sb.append(IconCompatParcelizer());
        sb.append(", required name: ");
        sb.append(getrelatedlessonid);
        throw new IllegalStateException(sb.toString());
    }

    @Override // kotlin.setItemExpanded
    /* JADX INFO: renamed from: write */
    public final Set<CourseConfigV2SupportItem> read(getRelatedLessonId getrelatedlessonid, getTimeStamp gettimestamp) {
        toMagicModuleMetaRepoModel.write(getrelatedlessonid, "");
        toMagicModuleMetaRepoModel.write(gettimestamp, "");
        StringBuilder sb = new StringBuilder();
        sb.append(IconCompatParcelizer());
        sb.append(", required name: ");
        sb.append(getrelatedlessonid);
        throw new IllegalStateException(sb.toString());
    }

    @Override // kotlin.setItemExpanded, kotlin.getMcqContentBody
    public final Collection<getVariant> read(setOption6AnsweredCount setoption6answeredcount, getAnswerMap<? super getRelatedLessonId, Boolean> getanswermap) {
        toMagicModuleMetaRepoModel.write(setoption6answeredcount, "");
        toMagicModuleMetaRepoModel.write(getanswermap, "");
        throw new IllegalStateException(IconCompatParcelizer());
    }

    @Override // kotlin.setItemExpanded, kotlin.setTags
    public final Set<getRelatedLessonId> aY_() {
        throw new IllegalStateException();
    }

    @Override // kotlin.setItemExpanded, kotlin.setTags
    public final Set<getRelatedLessonId> AudioAttributesCompatParcelizer() {
        throw new IllegalStateException();
    }

    @Override // kotlin.setItemExpanded, kotlin.setTags
    public final Set<getRelatedLessonId> aW_() {
        throw new IllegalStateException();
    }

    private static Void MediaBrowserCompatCustomActionResultReceiver(getRelatedLessonId getrelatedlessonid, getTimeStamp gettimestamp) {
        toMagicModuleMetaRepoModel.write(getrelatedlessonid, "");
        toMagicModuleMetaRepoModel.write(gettimestamp, "");
        throw new IllegalStateException();
    }

    @Override // kotlin.setItemExpanded
    public final String toString() {
        StringBuilder sb = new StringBuilder("ThrowingScope{");
        sb.append(IconCompatParcelizer());
        sb.append('}');
        return sb.toString();
    }
}
