package kotlin;

import java.util.Map;
import kotlin.getZenArea;

/* JADX INFO: loaded from: classes4.dex */
public final class setExpired extends getStartDateTime {
    private static /* synthetic */ isResolutionNotSupported<Object>[] IconCompatParcelizer = {toMagicModuleMetaDataUcModel.write(new downloadMagicModuleMetalambda0(toMagicModuleMetaDataUcModel.write(setExpired.class), "allValueArguments", "getAllValueArguments()Ljava/util/Map;"))};
    private final PageValue RemoteActionCompatParcelizer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public setExpired(RecentUpdatesReferences recentUpdatesReferences, getFeaturedCards getfeaturedcards) {
        super(getfeaturedcards, recentUpdatesReferences, getZenArea.RemoteActionCompatParcelizer.onSkipToQueueItem);
        toMagicModuleMetaRepoModel.write(recentUpdatesReferences, "");
        toMagicModuleMetaRepoModel.write(getfeaturedcards, "");
        this.RemoteActionCompatParcelizer = getfeaturedcards.read().read(new read());
    }

    static final class read extends MagicModuleUseCase implements getCreatedOnDateMs<Map<getRelatedLessonId, ? extends getMagicLine<?>>> {
        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Map<getRelatedLessonId, getMagicLine<?>> invoke() {
            Map<getRelatedLessonId, getMagicLine<?>> map;
            getResponseParams getresponseparams = getResponseParams.write;
            getMagicLine<?> getmagicline = getResponseParams.read(setExpired.this.AudioAttributesCompatParcelizer());
            if (getmagicline != null) {
                getUserInitiatedExamStartedOn getuserinitiatedexamstartedon = getUserInitiatedExamStartedOn.write;
                map = VideoTimelineResponseBody.read(setAction.write(getUserInitiatedExamStartedOn.IconCompatParcelizer(), getmagicline));
            } else {
                map = null;
            }
            return map == null ? VideoTimelineResponseBody.read() : map;
        }

        read() {
            super(0);
        }
    }

    @Override // kotlin.getStartDateTime, kotlin.dummyEditor
    public final Map<getRelatedLessonId, getMagicLine<?>> read() {
        return (Map) Pearl.RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer, IconCompatParcelizer[0]);
    }
}
