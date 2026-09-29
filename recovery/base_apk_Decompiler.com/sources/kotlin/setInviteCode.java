package kotlin;

import java.util.List;
import java.util.Map;
import kotlin.getZenArea;

/* JADX INFO: loaded from: classes4.dex */
public final class setInviteCode extends getStartDateTime {
    private static /* synthetic */ isResolutionNotSupported<Object>[] read = {toMagicModuleMetaDataUcModel.write(new downloadMagicModuleMetalambda0(toMagicModuleMetaDataUcModel.write(setInviteCode.class), "allValueArguments", "getAllValueArguments()Ljava/util/Map;"))};
    private final PageValue RemoteActionCompatParcelizer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public setInviteCode(RecentUpdatesReferences recentUpdatesReferences, getFeaturedCards getfeaturedcards) {
        super(getfeaturedcards, recentUpdatesReferences, getZenArea.RemoteActionCompatParcelizer.setSessionImpl);
        toMagicModuleMetaRepoModel.write(recentUpdatesReferences, "");
        toMagicModuleMetaRepoModel.write(getfeaturedcards, "");
        this.RemoteActionCompatParcelizer = getfeaturedcards.read().read(new RemoteActionCompatParcelizer());
    }

    static final class RemoteActionCompatParcelizer extends MagicModuleUseCase implements getCreatedOnDateMs<Map<getRelatedLessonId, ? extends getMagicLine<? extends Object>>> {
        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Map<getRelatedLessonId, getMagicLine<Object>> invoke() {
            getMagicLine<?> getmagicline;
            setTagsList settagslistAudioAttributesCompatParcelizer = setInviteCode.this.AudioAttributesCompatParcelizer();
            Map<getRelatedLessonId, getMagicLine<Object>> map = null;
            if (settagslistAudioAttributesCompatParcelizer instanceof getThumbnail) {
                getResponseParams getresponseparams = getResponseParams.write;
                getmagicline = getResponseParams.read(((getThumbnail) setInviteCode.this.AudioAttributesCompatParcelizer()).RemoteActionCompatParcelizer());
            } else if (settagslistAudioAttributesCompatParcelizer instanceof setSubjectId) {
                getResponseParams getresponseparams2 = getResponseParams.write;
                getmagicline = getResponseParams.read((List<? extends setTagsList>) IntermediateLoginResponseBody.RemoteActionCompatParcelizer(setInviteCode.this.AudioAttributesCompatParcelizer()));
            } else {
                getmagicline = null;
            }
            if (getmagicline != null) {
                getUserInitiatedExamStartedOn getuserinitiatedexamstartedon = getUserInitiatedExamStartedOn.write;
                map = VideoTimelineResponseBody.read(setAction.write(getUserInitiatedExamStartedOn.read(), getmagicline));
            }
            return map == null ? VideoTimelineResponseBody.read() : map;
        }

        RemoteActionCompatParcelizer() {
            super(0);
        }
    }

    @Override // kotlin.getStartDateTime, kotlin.dummyEditor
    public final Map<getRelatedLessonId, getMagicLine<Object>> read() {
        return (Map) Pearl.RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer, read[0]);
    }
}
