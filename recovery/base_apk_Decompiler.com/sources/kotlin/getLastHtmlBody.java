package kotlin;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class getLastHtmlBody extends ContentBody implements getMeta {
    private final boolean AudioAttributesCompatParcelizer;
    private final int IconCompatParcelizer;
    private final getLink MediaBrowserCompatCustomActionResultReceiver;
    private final boolean RemoteActionCompatParcelizer;
    private final boolean read;
    private final getMeta write;

    @Override // kotlin.Editor
    public final boolean onPrepare() {
        return false;
    }

    @Override // kotlin.Editor
    public final /* synthetic */ getMagicLine onPrepareFromSearch() {
        return null;
    }

    @Override // kotlin.Editor
    public final boolean onRewind() {
        return false;
    }

    @Override // kotlin.getMeta
    public final int onCommand() {
        return this.IconCompatParcelizer;
    }

    @Override // kotlin.getMeta
    public final boolean MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver() {
        return this.AudioAttributesCompatParcelizer;
    }

    @Override // kotlin.getMeta
    public final boolean onMediaButtonEvent() {
        return this.RemoteActionCompatParcelizer;
    }

    @Override // kotlin.getMeta
    public final getLink handleMediaPlayPauseIfPendingOnHandler() {
        return this.MediaBrowserCompatCustomActionResultReceiver;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public getLastHtmlBody(getVideoPageNotesTitle getvideopagenotestitle, getMeta getmeta, int i, getQuote getquote, getRelatedLessonId getrelatedlessonid, getLink getlink, boolean z, boolean z2, boolean z3, getLink getlink2, getIntroDurationSeconds getintrodurationseconds) {
        super(getvideopagenotestitle, getquote, getrelatedlessonid, getlink, getintrodurationseconds);
        toMagicModuleMetaRepoModel.write(getvideopagenotestitle, "");
        toMagicModuleMetaRepoModel.write(getquote, "");
        toMagicModuleMetaRepoModel.write(getrelatedlessonid, "");
        toMagicModuleMetaRepoModel.write(getlink, "");
        toMagicModuleMetaRepoModel.write(getintrodurationseconds, "");
        this.IconCompatParcelizer = i;
        this.read = z;
        this.AudioAttributesCompatParcelizer = z2;
        this.RemoteActionCompatParcelizer = z3;
        this.MediaBrowserCompatCustomActionResultReceiver = getlink2;
        this.write = getmeta == null ? this : getmeta;
    }

    public static final class write {
        private write() {
        }

        @getMagicModuleMeta
        public static getLastHtmlBody AudioAttributesCompatParcelizer(getVideoPageNotesTitle getvideopagenotestitle, getMeta getmeta, int i, getQuote getquote, getRelatedLessonId getrelatedlessonid, getLink getlink, boolean z, boolean z2, boolean z3, getLink getlink2, getIntroDurationSeconds getintrodurationseconds, getCreatedOnDateMs<? extends List<? extends Editor>> getcreatedondatems) {
            toMagicModuleMetaRepoModel.write(getvideopagenotestitle, "");
            toMagicModuleMetaRepoModel.write(getquote, "");
            toMagicModuleMetaRepoModel.write(getrelatedlessonid, "");
            toMagicModuleMetaRepoModel.write(getlink, "");
            toMagicModuleMetaRepoModel.write(getintrodurationseconds, "");
            if (getcreatedondatems == null) {
                return new getLastHtmlBody(getvideopagenotestitle, getmeta, i, getquote, getrelatedlessonid, getlink, z, z2, z3, getlink2, getintrodurationseconds);
            }
            return new read(getvideopagenotestitle, getmeta, i, getquote, getrelatedlessonid, getlink, z, z2, z3, getlink2, getintrodurationseconds, getcreatedondatems);
        }

        public /* synthetic */ write(byte b) {
            this();
        }
    }

    public static final class read extends getLastHtmlBody {
        private final RenewEligible RemoteActionCompatParcelizer;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public read(getVideoPageNotesTitle getvideopagenotestitle, getMeta getmeta, int i, getQuote getquote, getRelatedLessonId getrelatedlessonid, getLink getlink, boolean z, boolean z2, boolean z3, getLink getlink2, getIntroDurationSeconds getintrodurationseconds, getCreatedOnDateMs<? extends List<? extends Editor>> getcreatedondatems) {
            super(getvideopagenotestitle, getmeta, i, getquote, getrelatedlessonid, getlink, z, z2, z3, getlink2, getintrodurationseconds);
            toMagicModuleMetaRepoModel.write(getvideopagenotestitle, "");
            toMagicModuleMetaRepoModel.write(getquote, "");
            toMagicModuleMetaRepoModel.write(getrelatedlessonid, "");
            toMagicModuleMetaRepoModel.write(getlink, "");
            toMagicModuleMetaRepoModel.write(getintrodurationseconds, "");
            toMagicModuleMetaRepoModel.write(getcreatedondatems, "");
            this.RemoteActionCompatParcelizer = getRenewExpiresOn.RemoteActionCompatParcelizer(getcreatedondatems);
        }

        public final List<Editor> onPause() {
            return (List) this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer();
        }

        @Override // kotlin.getLastHtmlBody, kotlin.getMeta
        public final getMeta read(getVideoPageNotesTitle getvideopagenotestitle, getRelatedLessonId getrelatedlessonid, int i) {
            toMagicModuleMetaRepoModel.write(getvideopagenotestitle, "");
            toMagicModuleMetaRepoModel.write(getrelatedlessonid, "");
            getQuote getquoteRemoteActionCompatParcelizer = RemoteActionCompatParcelizer();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(getquoteRemoteActionCompatParcelizer, "");
            getLink getlinkOnPrepareFromMediaId = onPrepareFromMediaId();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(getlinkOnPrepareFromMediaId, "");
            boolean zIconCompatParcelizer = IconCompatParcelizer();
            boolean zMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver();
            boolean zOnMediaButtonEvent = onMediaButtonEvent();
            getLink getlinkHandleMediaPlayPauseIfPendingOnHandler = handleMediaPlayPauseIfPendingOnHandler();
            getIntroDurationSeconds getintrodurationseconds = getIntroDurationSeconds.AudioAttributesCompatParcelizer;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(getintrodurationseconds, "");
            return new read(getvideopagenotestitle, null, i, getquoteRemoteActionCompatParcelizer, getrelatedlessonid, getlinkOnPrepareFromMediaId, zIconCompatParcelizer, zMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, zOnMediaButtonEvent, getlinkHandleMediaPlayPauseIfPendingOnHandler, getintrodurationseconds, new write());
        }

        static final class write extends MagicModuleUseCase implements getCreatedOnDateMs<List<? extends Editor>> {
            /* JADX INFO: Access modifiers changed from: private */
            @Override // kotlin.getCreatedOnDateMs
            /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
            public List<Editor> invoke() {
                return read.this.onPause();
            }

            write() {
                super(0);
            }
        }
    }

    @Override // kotlin.PresenterBundle, kotlin.getVariant
    /* JADX INFO: renamed from: MediaBrowserCompatMediaItem, reason: merged with bridge method [inline-methods] */
    public final getVideoPageNotesTitle onPlayFromMediaId() {
        getVariant getvariantAudioAttributesImplApi21Parcelizer = super.onPlayFromMediaId();
        toMagicModuleMetaRepoModel.read(getvariantAudioAttributesImplApi21Parcelizer, "");
        return (getVideoPageNotesTitle) getvariantAudioAttributesImplApi21Parcelizer;
    }

    @Override // kotlin.getMeta
    public final boolean IconCompatParcelizer() {
        if (!this.read) {
            return false;
        }
        getVideoPageNotesTitle getvideopagenotestitleAudioAttributesImplApi21Parcelizer = AudioAttributesImplApi21Parcelizer();
        toMagicModuleMetaRepoModel.read(getvideopagenotestitleAudioAttributesImplApi21Parcelizer, "");
        return ((getTestHeaderTitle) getvideopagenotestitleAudioAttributesImplApi21Parcelizer).handleMediaPlayPauseIfPendingOnHandler().AudioAttributesCompatParcelizer();
    }

    @Override // kotlin.ContentBody
    /* JADX INFO: renamed from: onAddQueueItem, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final getMeta onPrepareFromMediaId() {
        getMeta getmeta = this.write;
        return getmeta == this ? this : getmeta.aS_();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.ContentBody, kotlin.CourseConfigV2VideoItem
    /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
    public getMeta write(setDesriptionList setdesriptionlist) {
        toMagicModuleMetaRepoModel.write(setdesriptionlist, "");
        if (setdesriptionlist.read()) {
            return this;
        }
        throw new UnsupportedOperationException();
    }

    @Override // kotlin.getVariant
    public final <R, D> R AudioAttributesCompatParcelizer(CourseConfigV2NavDrawerItemAddVideo<R, D> courseConfigV2NavDrawerItemAddVideo, D d) {
        toMagicModuleMetaRepoModel.write(courseConfigV2NavDrawerItemAddVideo, "");
        return courseConfigV2NavDrawerItemAddVideo.write(this, d);
    }

    @Override // kotlin.getMeta
    public getMeta read(getVideoPageNotesTitle getvideopagenotestitle, getRelatedLessonId getrelatedlessonid, int i) {
        toMagicModuleMetaRepoModel.write(getvideopagenotestitle, "");
        toMagicModuleMetaRepoModel.write(getrelatedlessonid, "");
        getQuote getquoteRemoteActionCompatParcelizer = RemoteActionCompatParcelizer();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(getquoteRemoteActionCompatParcelizer, "");
        getLink getlinkOnPrepareFromMediaId = onPrepareFromMediaId();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(getlinkOnPrepareFromMediaId, "");
        boolean zIconCompatParcelizer = IconCompatParcelizer();
        boolean zMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver();
        boolean zOnMediaButtonEvent = onMediaButtonEvent();
        getLink getlinkHandleMediaPlayPauseIfPendingOnHandler = handleMediaPlayPauseIfPendingOnHandler();
        getIntroDurationSeconds getintrodurationseconds = getIntroDurationSeconds.AudioAttributesCompatParcelizer;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(getintrodurationseconds, "");
        return new getLastHtmlBody(getvideopagenotestitle, null, i, getquoteRemoteActionCompatParcelizer, getrelatedlessonid, getlinkOnPrepareFromMediaId, zIconCompatParcelizer, zMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, zOnMediaButtonEvent, getlinkHandleMediaPlayPauseIfPendingOnHandler, getintrodurationseconds);
    }

    @Override // kotlin.getSubText
    public final CourseConfigV2NavDrawerItemFreeExtension onCustomAction() {
        CourseConfigV2NavDrawerItemFreeExtension courseConfigV2NavDrawerItemFreeExtension = CourseConfigV2NavDrawerItemFaq.AudioAttributesImplApi21Parcelizer;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(courseConfigV2NavDrawerItemFreeExtension, "");
        return courseConfigV2NavDrawerItemFreeExtension;
    }

    @Override // kotlin.ContentBody, kotlin.getVideoPageNotesTitle
    public final Collection<getMeta> AudioAttributesImplApi26Parcelizer() {
        Collection<? extends getVideoPageNotesTitle> collectionAudioAttributesImplApi26Parcelizer = AudioAttributesImplApi21Parcelizer().AudioAttributesImplApi26Parcelizer();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(collectionAudioAttributesImplApi26Parcelizer, "");
        Collection<? extends getVideoPageNotesTitle> collection = collectionAudioAttributesImplApi26Parcelizer;
        ArrayList arrayList = new ArrayList(IntermediateLoginResponseBody.RemoteActionCompatParcelizer(collection, 10));
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(((getVideoPageNotesTitle) it.next()).aX_().get(onCommand()));
        }
        return arrayList;
    }

    static {
        new write((byte) 0);
    }

    @getMagicModuleMeta
    public static final getLastHtmlBody read(getVideoPageNotesTitle getvideopagenotestitle, getMeta getmeta, int i, getQuote getquote, getRelatedLessonId getrelatedlessonid, getLink getlink, boolean z, boolean z2, boolean z3, getLink getlink2, getIntroDurationSeconds getintrodurationseconds, getCreatedOnDateMs<? extends List<? extends Editor>> getcreatedondatems) {
        return write.AudioAttributesCompatParcelizer(getvideopagenotestitle, getmeta, i, getquote, getrelatedlessonid, getlink, z, z2, z3, getlink2, getintrodurationseconds, getcreatedondatems);
    }
}
