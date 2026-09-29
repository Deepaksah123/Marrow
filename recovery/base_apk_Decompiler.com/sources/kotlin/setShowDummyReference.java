package kotlin;

import java.lang.annotation.Annotation;

/* JADX INFO: loaded from: classes4.dex */
public final class setShowDummyReference extends setMsInterimHtmlStartTime implements RecentUpdatesModelCreator {
    private final Annotation RemoteActionCompatParcelizer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public setShowDummyReference(getRelatedLessonId getrelatedlessonid, Annotation annotation) {
        super(getrelatedlessonid, (byte) 0);
        toMagicModuleMetaRepoModel.write(annotation, "");
        this.RemoteActionCompatParcelizer = annotation;
    }

    @Override // kotlin.RecentUpdatesModelCreator
    public final RecentUpdatesReferences write() {
        return new getAspectRatio(this.RemoteActionCompatParcelizer);
    }
}
