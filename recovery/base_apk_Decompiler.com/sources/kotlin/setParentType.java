package kotlin;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.HomeLessonIndexV2;
import kotlin.getBookmarkCount;
import kotlin.setActiveRecallQbankId;

/* JADX INFO: loaded from: classes4.dex */
public final class setParentType implements setStartIndex<dummyEditor, getMagicLine<?>> {
    private final setMCQId IconCompatParcelizer;
    private final isResumeExplnation RemoteActionCompatParcelizer;

    public final /* synthetic */ class AudioAttributesCompatParcelizer {
        public static final /* synthetic */ int[] IconCompatParcelizer;

        static {
            int[] iArr = new int[getMCQId.values().length];
            try {
                iArr[getMCQId.PROPERTY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[getMCQId.PROPERTY_GETTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[getMCQId.PROPERTY_SETTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            IconCompatParcelizer = iArr;
        }
    }

    public setParentType(getTopSection gettopsection, CourseConfigV2PlanScreenConfig courseConfigV2PlanScreenConfig, isResumeExplnation isresumeexplnation) {
        toMagicModuleMetaRepoModel.write(gettopsection, "");
        toMagicModuleMetaRepoModel.write(courseConfigV2PlanScreenConfig, "");
        toMagicModuleMetaRepoModel.write(isresumeexplnation, "");
        this.RemoteActionCompatParcelizer = isresumeexplnation;
        this.IconCompatParcelizer = new setMCQId(gettopsection, courseConfigV2PlanScreenConfig);
    }

    @Override // kotlin.setStartIndex
    public final /* synthetic */ getMagicLine<?> AudioAttributesCompatParcelizer(getBookmarkCount getbookmarkcount, setActiveRecallQbankId.MediaBrowserCompatMediaItem mediaBrowserCompatMediaItem, getLink getlink) {
        return write(getbookmarkcount, mediaBrowserCompatMediaItem, getlink);
    }

    @Override // kotlin.getParentType
    public final List<dummyEditor> RemoteActionCompatParcelizer(getBookmarkCount.write writeVar) {
        toMagicModuleMetaRepoModel.write(writeVar, "");
        List listRemoteActionCompatParcelizer = (List) writeVar.AudioAttributesImplBaseParcelizer().IconCompatParcelizer(this.RemoteActionCompatParcelizer.IconCompatParcelizer());
        if (listRemoteActionCompatParcelizer == null) {
            listRemoteActionCompatParcelizer = IntermediateLoginResponseBody.RemoteActionCompatParcelizer();
        }
        List list = listRemoteActionCompatParcelizer;
        ArrayList arrayList = new ArrayList(IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Iterable) list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(this.IconCompatParcelizer.RemoteActionCompatParcelizer((setActiveRecallQbankId.IconCompatParcelizer) it.next(), writeVar.write()));
        }
        return arrayList;
    }

    @Override // kotlin.getParentType
    public final List<dummyEditor> IconCompatParcelizer(getBookmarkCount getbookmarkcount, BookReference bookReference, getMCQId getmcqid) {
        List listRemoteActionCompatParcelizer;
        toMagicModuleMetaRepoModel.write(getbookmarkcount, "");
        toMagicModuleMetaRepoModel.write(bookReference, "");
        toMagicModuleMetaRepoModel.write(getmcqid, "");
        if (bookReference instanceof setActiveRecallQbankId.write) {
            listRemoteActionCompatParcelizer = (List) ((setActiveRecallQbankId.write) bookReference).IconCompatParcelizer(this.RemoteActionCompatParcelizer.read());
        } else if (bookReference instanceof setActiveRecallQbankId.AudioAttributesImplApi26Parcelizer) {
            listRemoteActionCompatParcelizer = (List) ((setActiveRecallQbankId.AudioAttributesImplApi26Parcelizer) bookReference).IconCompatParcelizer(this.RemoteActionCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver());
        } else {
            if (!(bookReference instanceof setActiveRecallQbankId.MediaBrowserCompatMediaItem)) {
                throw new IllegalStateException("Unknown message: ".concat(String.valueOf(bookReference)).toString());
            }
            int i = AudioAttributesCompatParcelizer.IconCompatParcelizer[getmcqid.ordinal()];
            if (i == 1) {
                listRemoteActionCompatParcelizer = (List) ((setActiveRecallQbankId.MediaBrowserCompatMediaItem) bookReference).IconCompatParcelizer(this.RemoteActionCompatParcelizer.AudioAttributesImplApi26Parcelizer());
            } else if (i == 2) {
                listRemoteActionCompatParcelizer = (List) ((setActiveRecallQbankId.MediaBrowserCompatMediaItem) bookReference).IconCompatParcelizer(this.RemoteActionCompatParcelizer.MediaBrowserCompatSearchResultReceiver());
            } else if (i == 3) {
                listRemoteActionCompatParcelizer = (List) ((setActiveRecallQbankId.MediaBrowserCompatMediaItem) bookReference).IconCompatParcelizer(this.RemoteActionCompatParcelizer.MediaMetadataCompat());
            } else {
                throw new IllegalStateException("Unsupported callable kind with property proto".toString());
            }
        }
        if (listRemoteActionCompatParcelizer == null) {
            listRemoteActionCompatParcelizer = IntermediateLoginResponseBody.RemoteActionCompatParcelizer();
        }
        List list = listRemoteActionCompatParcelizer;
        ArrayList arrayList = new ArrayList(IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Iterable) list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(this.IconCompatParcelizer.RemoteActionCompatParcelizer((setActiveRecallQbankId.IconCompatParcelizer) it.next(), getbookmarkcount.write()));
        }
        return arrayList;
    }

    @Override // kotlin.getParentType
    public final List<dummyEditor> write(getBookmarkCount getbookmarkcount, setActiveRecallQbankId.MediaBrowserCompatMediaItem mediaBrowserCompatMediaItem) {
        toMagicModuleMetaRepoModel.write(getbookmarkcount, "");
        toMagicModuleMetaRepoModel.write(mediaBrowserCompatMediaItem, "");
        HomeLessonIndexV2.IconCompatParcelizer<setActiveRecallQbankId.MediaBrowserCompatMediaItem, List<setActiveRecallQbankId.IconCompatParcelizer>> iconCompatParcelizerMediaBrowserCompatItemReceiver = this.RemoteActionCompatParcelizer.MediaBrowserCompatItemReceiver();
        List listRemoteActionCompatParcelizer = iconCompatParcelizerMediaBrowserCompatItemReceiver != null ? (List) mediaBrowserCompatMediaItem.IconCompatParcelizer(iconCompatParcelizerMediaBrowserCompatItemReceiver) : null;
        if (listRemoteActionCompatParcelizer == null) {
            listRemoteActionCompatParcelizer = IntermediateLoginResponseBody.RemoteActionCompatParcelizer();
        }
        List list = listRemoteActionCompatParcelizer;
        ArrayList arrayList = new ArrayList(IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Iterable) list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(this.IconCompatParcelizer.RemoteActionCompatParcelizer((setActiveRecallQbankId.IconCompatParcelizer) it.next(), getbookmarkcount.write()));
        }
        return arrayList;
    }

    @Override // kotlin.getParentType
    public final List<dummyEditor> AudioAttributesCompatParcelizer(getBookmarkCount getbookmarkcount, setActiveRecallQbankId.MediaBrowserCompatMediaItem mediaBrowserCompatMediaItem) {
        toMagicModuleMetaRepoModel.write(getbookmarkcount, "");
        toMagicModuleMetaRepoModel.write(mediaBrowserCompatMediaItem, "");
        HomeLessonIndexV2.IconCompatParcelizer<setActiveRecallQbankId.MediaBrowserCompatMediaItem, List<setActiveRecallQbankId.IconCompatParcelizer>> iconCompatParcelizerMediaDescriptionCompat = this.RemoteActionCompatParcelizer.MediaDescriptionCompat();
        List listRemoteActionCompatParcelizer = iconCompatParcelizerMediaDescriptionCompat != null ? (List) mediaBrowserCompatMediaItem.IconCompatParcelizer(iconCompatParcelizerMediaDescriptionCompat) : null;
        if (listRemoteActionCompatParcelizer == null) {
            listRemoteActionCompatParcelizer = IntermediateLoginResponseBody.RemoteActionCompatParcelizer();
        }
        List list = listRemoteActionCompatParcelizer;
        ArrayList arrayList = new ArrayList(IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Iterable) list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(this.IconCompatParcelizer.RemoteActionCompatParcelizer((setActiveRecallQbankId.IconCompatParcelizer) it.next(), getbookmarkcount.write()));
        }
        return arrayList;
    }

    @Override // kotlin.getParentType
    public final List<dummyEditor> read(getBookmarkCount getbookmarkcount, setActiveRecallQbankId.AudioAttributesImplApi21Parcelizer audioAttributesImplApi21Parcelizer) {
        toMagicModuleMetaRepoModel.write(getbookmarkcount, "");
        toMagicModuleMetaRepoModel.write(audioAttributesImplApi21Parcelizer, "");
        List listRemoteActionCompatParcelizer = (List) audioAttributesImplApi21Parcelizer.IconCompatParcelizer(this.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer());
        if (listRemoteActionCompatParcelizer == null) {
            listRemoteActionCompatParcelizer = IntermediateLoginResponseBody.RemoteActionCompatParcelizer();
        }
        List list = listRemoteActionCompatParcelizer;
        ArrayList arrayList = new ArrayList(IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Iterable) list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(this.IconCompatParcelizer.RemoteActionCompatParcelizer((setActiveRecallQbankId.IconCompatParcelizer) it.next(), getbookmarkcount.write()));
        }
        return arrayList;
    }

    @Override // kotlin.getParentType
    public final List<dummyEditor> RemoteActionCompatParcelizer(getBookmarkCount getbookmarkcount, BookReference bookReference, getMCQId getmcqid, int i, setActiveRecallQbankId.handleMediaPlayPauseIfPendingOnHandler handlemediaplaypauseifpendingonhandler) {
        toMagicModuleMetaRepoModel.write(getbookmarkcount, "");
        toMagicModuleMetaRepoModel.write(bookReference, "");
        toMagicModuleMetaRepoModel.write(getmcqid, "");
        toMagicModuleMetaRepoModel.write(handlemediaplaypauseifpendingonhandler, "");
        List listRemoteActionCompatParcelizer = (List) handlemediaplaypauseifpendingonhandler.IconCompatParcelizer(this.RemoteActionCompatParcelizer.AudioAttributesImplBaseParcelizer());
        if (listRemoteActionCompatParcelizer == null) {
            listRemoteActionCompatParcelizer = IntermediateLoginResponseBody.RemoteActionCompatParcelizer();
        }
        List list = listRemoteActionCompatParcelizer;
        ArrayList arrayList = new ArrayList(IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Iterable) list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(this.IconCompatParcelizer.RemoteActionCompatParcelizer((setActiveRecallQbankId.IconCompatParcelizer) it.next(), getbookmarkcount.write()));
        }
        return arrayList;
    }

    @Override // kotlin.getParentType
    public final List<dummyEditor> read(getBookmarkCount getbookmarkcount, BookReference bookReference, getMCQId getmcqid) {
        toMagicModuleMetaRepoModel.write(getbookmarkcount, "");
        toMagicModuleMetaRepoModel.write(bookReference, "");
        toMagicModuleMetaRepoModel.write(getmcqid, "");
        List listRemoteActionCompatParcelizer = null;
        if (bookReference instanceof setActiveRecallQbankId.AudioAttributesImplApi26Parcelizer) {
            HomeLessonIndexV2.IconCompatParcelizer<setActiveRecallQbankId.AudioAttributesImplApi26Parcelizer, List<setActiveRecallQbankId.IconCompatParcelizer>> iconCompatParcelizerAudioAttributesImplApi21Parcelizer = this.RemoteActionCompatParcelizer.AudioAttributesImplApi21Parcelizer();
            if (iconCompatParcelizerAudioAttributesImplApi21Parcelizer != null) {
                listRemoteActionCompatParcelizer = (List) ((setActiveRecallQbankId.AudioAttributesImplApi26Parcelizer) bookReference).IconCompatParcelizer(iconCompatParcelizerAudioAttributesImplApi21Parcelizer);
            }
        } else {
            if (!(bookReference instanceof setActiveRecallQbankId.MediaBrowserCompatMediaItem)) {
                throw new IllegalStateException("Unknown message: ".concat(String.valueOf(bookReference)).toString());
            }
            int i = AudioAttributesCompatParcelizer.IconCompatParcelizer[getmcqid.ordinal()];
            if (i == 1 || i == 2 || i == 3) {
                HomeLessonIndexV2.IconCompatParcelizer<setActiveRecallQbankId.MediaBrowserCompatMediaItem, List<setActiveRecallQbankId.IconCompatParcelizer>> iconCompatParcelizerRatingCompat = this.RemoteActionCompatParcelizer.RatingCompat();
                if (iconCompatParcelizerRatingCompat != null) {
                    listRemoteActionCompatParcelizer = (List) ((setActiveRecallQbankId.MediaBrowserCompatMediaItem) bookReference).IconCompatParcelizer(iconCompatParcelizerRatingCompat);
                }
            } else {
                throw new IllegalStateException("Unsupported callable kind with property proto for receiver annotations: ".concat(String.valueOf(getmcqid)).toString());
            }
        }
        if (listRemoteActionCompatParcelizer == null) {
            listRemoteActionCompatParcelizer = IntermediateLoginResponseBody.RemoteActionCompatParcelizer();
        }
        List list = listRemoteActionCompatParcelizer;
        ArrayList arrayList = new ArrayList(IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Iterable) list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(this.IconCompatParcelizer.RemoteActionCompatParcelizer((setActiveRecallQbankId.IconCompatParcelizer) it.next(), getbookmarkcount.write()));
        }
        return arrayList;
    }

    @Override // kotlin.getParentType
    public final List<dummyEditor> IconCompatParcelizer(setActiveRecallQbankId.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, setRatingCount setratingcount) {
        toMagicModuleMetaRepoModel.write(mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, "");
        toMagicModuleMetaRepoModel.write(setratingcount, "");
        List listRemoteActionCompatParcelizer = (List) mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.IconCompatParcelizer(this.RemoteActionCompatParcelizer.MediaBrowserCompatMediaItem());
        if (listRemoteActionCompatParcelizer == null) {
            listRemoteActionCompatParcelizer = IntermediateLoginResponseBody.RemoteActionCompatParcelizer();
        }
        List list = listRemoteActionCompatParcelizer;
        ArrayList arrayList = new ArrayList(IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Iterable) list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(this.IconCompatParcelizer.RemoteActionCompatParcelizer((setActiveRecallQbankId.IconCompatParcelizer) it.next(), setratingcount));
        }
        return arrayList;
    }

    @Override // kotlin.getParentType
    public final List<dummyEditor> AudioAttributesCompatParcelizer(setActiveRecallQbankId.onCustomAction oncustomaction, setRatingCount setratingcount) {
        toMagicModuleMetaRepoModel.write(oncustomaction, "");
        toMagicModuleMetaRepoModel.write(setratingcount, "");
        List listRemoteActionCompatParcelizer = (List) oncustomaction.IconCompatParcelizer(this.RemoteActionCompatParcelizer.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver());
        if (listRemoteActionCompatParcelizer == null) {
            listRemoteActionCompatParcelizer = IntermediateLoginResponseBody.RemoteActionCompatParcelizer();
        }
        List list = listRemoteActionCompatParcelizer;
        ArrayList arrayList = new ArrayList(IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Iterable) list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(this.IconCompatParcelizer.RemoteActionCompatParcelizer((setActiveRecallQbankId.IconCompatParcelizer) it.next(), setratingcount));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.setStartIndex
    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public getMagicLine<?> IconCompatParcelizer(getBookmarkCount getbookmarkcount, setActiveRecallQbankId.MediaBrowserCompatMediaItem mediaBrowserCompatMediaItem, getLink getlink) {
        toMagicModuleMetaRepoModel.write(getbookmarkcount, "");
        toMagicModuleMetaRepoModel.write(mediaBrowserCompatMediaItem, "");
        toMagicModuleMetaRepoModel.write(getlink, "");
        setActiveRecallQbankId.IconCompatParcelizer.C0132IconCompatParcelizer.RemoteActionCompatParcelizer remoteActionCompatParcelizer = (setActiveRecallQbankId.IconCompatParcelizer.C0132IconCompatParcelizer.RemoteActionCompatParcelizer) setTagLabel.read(mediaBrowserCompatMediaItem, this.RemoteActionCompatParcelizer.write());
        if (remoteActionCompatParcelizer == null) {
            return null;
        }
        return this.IconCompatParcelizer.AudioAttributesCompatParcelizer(getlink, remoteActionCompatParcelizer, getbookmarkcount.write());
    }

    private static getMagicLine<?> write(getBookmarkCount getbookmarkcount, setActiveRecallQbankId.MediaBrowserCompatMediaItem mediaBrowserCompatMediaItem, getLink getlink) {
        toMagicModuleMetaRepoModel.write(getbookmarkcount, "");
        toMagicModuleMetaRepoModel.write(mediaBrowserCompatMediaItem, "");
        toMagicModuleMetaRepoModel.write(getlink, "");
        return null;
    }
}
