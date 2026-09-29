package kotlin;

import java.util.Collection;

/* JADX INFO: loaded from: classes.dex */
public interface getTestHeaderTitle extends getVideoPageNotesTitle, CourseConfigV2NavDrawerItemYourCourse {
    @Override // kotlin.getVideoPageNotesTitle
    Collection<? extends getTestHeaderTitle> AudioAttributesImplApi26Parcelizer();

    RemoteActionCompatParcelizer handleMediaPlayPauseIfPendingOnHandler();

    getTestHeaderTitle onAddQueueItem();

    getTestHeaderTitle write(getVariant getvariant, CourseConfigV2NavDrawerItems courseConfigV2NavDrawerItems, CourseConfigV2NavDrawerItemFreeExtension courseConfigV2NavDrawerItemFreeExtension, RemoteActionCompatParcelizer remoteActionCompatParcelizer);

    void write(Collection<? extends getTestHeaderTitle> collection);

    /* JADX INFO: loaded from: classes4.dex */
    public enum RemoteActionCompatParcelizer {
        DECLARATION,
        FAKE_OVERRIDE,
        DELEGATION,
        SYNTHESIZED;

        public final boolean AudioAttributesCompatParcelizer() {
            return this != FAKE_OVERRIDE;
        }
    }
}
