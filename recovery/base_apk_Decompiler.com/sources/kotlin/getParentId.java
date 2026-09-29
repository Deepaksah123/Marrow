package kotlin;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.HomeLessonIndexV2;
import kotlin.getBookmarkCount;
import kotlin.getMasterOrder;
import kotlin.getMyRating;
import kotlin.getSchemaTitle;
import kotlin.setActiveRecallQbankId;
import kotlin.toHomeLessonIndex;
import o.getParentId.RemoteActionCompatParcelizer;

/* JADX INFO: loaded from: classes4.dex */
public abstract class getParentId<A, S extends RemoteActionCompatParcelizer<? extends A>> implements getParentType<A> {
    private final getLessonActivityStatus IconCompatParcelizer;

    enum IconCompatParcelizer {
        PROPERTY,
        BACKING_FIELD,
        DELEGATE_FIELD
    }

    public static abstract class RemoteActionCompatParcelizer<A> {
        public abstract Map<getMyRating, List<A>> IconCompatParcelizer();
    }

    public final /* synthetic */ class write {
        public static final /* synthetic */ int[] write;

        static {
            int[] iArr = new int[getMCQId.values().length];
            try {
                iArr[getMCQId.PROPERTY_GETTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[getMCQId.PROPERTY_SETTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[getMCQId.PROPERTY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            write = iArr;
        }
    }

    public abstract incrementTotalCount IconCompatParcelizer();

    protected abstract A RemoteActionCompatParcelizer(setActiveRecallQbankId.IconCompatParcelizer iconCompatParcelizer, setRatingCount setratingcount);

    protected abstract getMasterOrder.AudioAttributesCompatParcelizer write(RevisionSubjectStatusModel revisionSubjectStatusModel, getIntroDurationSeconds getintrodurationseconds, List<A> list);

    protected abstract S write(getMasterOrder getmasterorder);

    public getParentId(getLessonActivityStatus getlessonactivitystatus) {
        toMagicModuleMetaRepoModel.write(getlessonactivitystatus, "");
        this.IconCompatParcelizer = getlessonactivitystatus;
    }

    protected final getMasterOrder.AudioAttributesCompatParcelizer read(RevisionSubjectStatusModel revisionSubjectStatusModel, getIntroDurationSeconds getintrodurationseconds, List<A> list) {
        toMagicModuleMetaRepoModel.write(revisionSubjectStatusModel, "");
        toMagicModuleMetaRepoModel.write(getintrodurationseconds, "");
        toMagicModuleMetaRepoModel.write(list, "");
        getSearchItems getsearchitems = getSearchItems.IconCompatParcelizer;
        if (getSearchItems.read().contains(revisionSubjectStatusModel)) {
            return null;
        }
        return write(revisionSubjectStatusModel, getintrodurationseconds, list);
    }

    private static getMasterOrder IconCompatParcelizer(getBookmarkCount.write writeVar) {
        getIntroDurationSeconds getintrodurationsecondsIconCompatParcelizer = writeVar.IconCompatParcelizer();
        getLessonReadTimeText getlessonreadtimetext = getintrodurationsecondsIconCompatParcelizer instanceof getLessonReadTimeText ? (getLessonReadTimeText) getintrodurationsecondsIconCompatParcelizer : null;
        if (getlessonreadtimetext != null) {
            return getlessonreadtimetext.RemoteActionCompatParcelizer();
        }
        return null;
    }

    @Override // kotlin.getParentType
    public final List<A> RemoteActionCompatParcelizer(getBookmarkCount.write writeVar) {
        toMagicModuleMetaRepoModel.write(writeVar, "");
        getMasterOrder getmasterorderIconCompatParcelizer = IconCompatParcelizer(writeVar);
        if (getmasterorderIconCompatParcelizer == null) {
            StringBuilder sb = new StringBuilder("Class for loading annotations is not found: ");
            sb.append(writeVar.RemoteActionCompatParcelizer());
            throw new IllegalStateException(sb.toString().toString());
        }
        ArrayList arrayList = new ArrayList(1);
        AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = new AudioAttributesCompatParcelizer(this, arrayList);
        RemoteActionCompatParcelizer(getmasterorderIconCompatParcelizer);
        getmasterorderIconCompatParcelizer.write(audioAttributesCompatParcelizer);
        return arrayList;
    }

    public static final class AudioAttributesCompatParcelizer implements getMasterOrder.RemoteActionCompatParcelizer {
        private /* synthetic */ getParentId<A, S> AudioAttributesCompatParcelizer;
        private /* synthetic */ ArrayList<A> IconCompatParcelizer;

        @Override // o.getMasterOrder.RemoteActionCompatParcelizer
        public final void RemoteActionCompatParcelizer() {
        }

        AudioAttributesCompatParcelizer(getParentId<A, S> getparentid, ArrayList<A> arrayList) {
            this.AudioAttributesCompatParcelizer = getparentid;
            this.IconCompatParcelizer = arrayList;
        }

        @Override // o.getMasterOrder.RemoteActionCompatParcelizer
        public final getMasterOrder.AudioAttributesCompatParcelizer IconCompatParcelizer(RevisionSubjectStatusModel revisionSubjectStatusModel, getIntroDurationSeconds getintrodurationseconds) {
            toMagicModuleMetaRepoModel.write(revisionSubjectStatusModel, "");
            toMagicModuleMetaRepoModel.write(getintrodurationseconds, "");
            return this.AudioAttributesCompatParcelizer.read(revisionSubjectStatusModel, getintrodurationseconds, this.IconCompatParcelizer);
        }
    }

    @Override // kotlin.getParentType
    public final List<A> IconCompatParcelizer(getBookmarkCount getbookmarkcount, BookReference bookReference, getMCQId getmcqid) {
        toMagicModuleMetaRepoModel.write(getbookmarkcount, "");
        toMagicModuleMetaRepoModel.write(bookReference, "");
        toMagicModuleMetaRepoModel.write(getmcqid, "");
        if (getmcqid == getMCQId.PROPERTY) {
            return write(getbookmarkcount, (setActiveRecallQbankId.MediaBrowserCompatMediaItem) bookReference, IconCompatParcelizer.PROPERTY);
        }
        getMyRating getmyratingRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(bookReference, getbookmarkcount.write(), getbookmarkcount.AudioAttributesCompatParcelizer(), getmcqid);
        return getmyratingRemoteActionCompatParcelizer == null ? IntermediateLoginResponseBody.RemoteActionCompatParcelizer() : IconCompatParcelizer(this, getbookmarkcount, getmyratingRemoteActionCompatParcelizer, false, null, false, 60);
    }

    @Override // kotlin.getParentType
    public final List<A> write(getBookmarkCount getbookmarkcount, setActiveRecallQbankId.MediaBrowserCompatMediaItem mediaBrowserCompatMediaItem) {
        toMagicModuleMetaRepoModel.write(getbookmarkcount, "");
        toMagicModuleMetaRepoModel.write(mediaBrowserCompatMediaItem, "");
        return write(getbookmarkcount, mediaBrowserCompatMediaItem, IconCompatParcelizer.BACKING_FIELD);
    }

    @Override // kotlin.getParentType
    public final List<A> AudioAttributesCompatParcelizer(getBookmarkCount getbookmarkcount, setActiveRecallQbankId.MediaBrowserCompatMediaItem mediaBrowserCompatMediaItem) {
        toMagicModuleMetaRepoModel.write(getbookmarkcount, "");
        toMagicModuleMetaRepoModel.write(mediaBrowserCompatMediaItem, "");
        return write(getbookmarkcount, mediaBrowserCompatMediaItem, IconCompatParcelizer.DELEGATE_FIELD);
    }

    private final List<A> write(getBookmarkCount getbookmarkcount, setActiveRecallQbankId.MediaBrowserCompatMediaItem mediaBrowserCompatMediaItem, IconCompatParcelizer iconCompatParcelizer) {
        Boolean boolIconCompatParcelizer = setPeopleSolved.AudioAttributesImplBaseParcelizer.IconCompatParcelizer(mediaBrowserCompatMediaItem.AudioAttributesCompatParcelizer());
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(boolIconCompatParcelizer, "");
        boolean zBooleanValue = boolIconCompatParcelizer.booleanValue();
        boolean zIconCompatParcelizer = getCompletedARQBankCount.IconCompatParcelizer(mediaBrowserCompatMediaItem);
        if (iconCompatParcelizer == IconCompatParcelizer.PROPERTY) {
            getMyRating getmyratingRemoteActionCompatParcelizer = setHasVideo.RemoteActionCompatParcelizer(mediaBrowserCompatMediaItem, getbookmarkcount.write(), getbookmarkcount.AudioAttributesCompatParcelizer(), false, true, false, 40);
            return getmyratingRemoteActionCompatParcelizer == null ? IntermediateLoginResponseBody.RemoteActionCompatParcelizer() : IconCompatParcelizer(this, getbookmarkcount, getmyratingRemoteActionCompatParcelizer, true, Boolean.valueOf(zBooleanValue), zIconCompatParcelizer, 8);
        }
        getMyRating getmyratingRemoteActionCompatParcelizer2 = setHasVideo.RemoteActionCompatParcelizer(mediaBrowserCompatMediaItem, getbookmarkcount.write(), getbookmarkcount.AudioAttributesCompatParcelizer(), true, false, false, 48);
        if (getmyratingRemoteActionCompatParcelizer2 == null) {
            return IntermediateLoginResponseBody.RemoteActionCompatParcelizer();
        }
        return TestGroupLSModel.write((CharSequence) getmyratingRemoteActionCompatParcelizer2.IconCompatParcelizer(), (CharSequence) "$delegate", false) != (iconCompatParcelizer == IconCompatParcelizer.DELEGATE_FIELD) ? IntermediateLoginResponseBody.RemoteActionCompatParcelizer() : IconCompatParcelizer(getbookmarkcount, getmyratingRemoteActionCompatParcelizer2, true, true, Boolean.valueOf(zBooleanValue), zIconCompatParcelizer);
    }

    @Override // kotlin.getParentType
    public final List<A> read(getBookmarkCount getbookmarkcount, setActiveRecallQbankId.AudioAttributesImplApi21Parcelizer audioAttributesImplApi21Parcelizer) {
        toMagicModuleMetaRepoModel.write(getbookmarkcount, "");
        toMagicModuleMetaRepoModel.write(audioAttributesImplApi21Parcelizer, "");
        getMyRating.IconCompatParcelizer iconCompatParcelizer = getMyRating.AudioAttributesCompatParcelizer;
        String strAudioAttributesCompatParcelizer = getbookmarkcount.write().AudioAttributesCompatParcelizer(audioAttributesImplApi21Parcelizer.AudioAttributesCompatParcelizer());
        String str = ((getBookmarkCount.write) getbookmarkcount).read().read();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(str, "");
        return IconCompatParcelizer(this, getbookmarkcount, getMyRating.IconCompatParcelizer.IconCompatParcelizer(strAudioAttributesCompatParcelizer, getHighYieldId.RemoteActionCompatParcelizer(str)), false, null, false, 60);
    }

    private static /* synthetic */ List IconCompatParcelizer(getParentId getparentid, getBookmarkCount getbookmarkcount, getMyRating getmyrating, boolean z, Boolean bool, boolean z2, int i) {
        boolean z3 = (i & 4) != 0 ? false : z;
        if ((i & 16) != 0) {
            bool = null;
        }
        return getparentid.IconCompatParcelizer(getbookmarkcount, getmyrating, z3, false, bool, (i & 32) != 0 ? false : z2);
    }

    private final List<A> IconCompatParcelizer(getBookmarkCount getbookmarkcount, getMyRating getmyrating, boolean z, boolean z2, Boolean bool, boolean z3) {
        getMasterOrder getmasterorderIconCompatParcelizer = IconCompatParcelizer(getbookmarkcount, AudioAttributesCompatParcelizer(getbookmarkcount, z, z2, bool, z3));
        if (getmasterorderIconCompatParcelizer == null) {
            return IntermediateLoginResponseBody.RemoteActionCompatParcelizer();
        }
        List<A> list = write(getmasterorderIconCompatParcelizer).IconCompatParcelizer().get(getmyrating);
        return list == null ? IntermediateLoginResponseBody.RemoteActionCompatParcelizer() : list;
    }

    @Override // kotlin.getParentType
    public final List<A> RemoteActionCompatParcelizer(getBookmarkCount getbookmarkcount, BookReference bookReference, getMCQId getmcqid, int i, setActiveRecallQbankId.handleMediaPlayPauseIfPendingOnHandler handlemediaplaypauseifpendingonhandler) {
        toMagicModuleMetaRepoModel.write(getbookmarkcount, "");
        toMagicModuleMetaRepoModel.write(bookReference, "");
        toMagicModuleMetaRepoModel.write(getmcqid, "");
        toMagicModuleMetaRepoModel.write(handlemediaplaypauseifpendingonhandler, "");
        getMyRating getmyratingRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(bookReference, getbookmarkcount.write(), getbookmarkcount.AudioAttributesCompatParcelizer(), getmcqid);
        if (getmyratingRemoteActionCompatParcelizer != null) {
            int iRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(getbookmarkcount, bookReference);
            getMyRating.IconCompatParcelizer iconCompatParcelizer = getMyRating.AudioAttributesCompatParcelizer;
            return IconCompatParcelizer(this, getbookmarkcount, getMyRating.IconCompatParcelizer.RemoteActionCompatParcelizer(getmyratingRemoteActionCompatParcelizer, i + iRemoteActionCompatParcelizer), false, null, false, 60);
        }
        return IntermediateLoginResponseBody.RemoteActionCompatParcelizer();
    }

    private static int RemoteActionCompatParcelizer(getBookmarkCount getbookmarkcount, BookReference bookReference) {
        if (bookReference instanceof setActiveRecallQbankId.AudioAttributesImplApi26Parcelizer) {
            return setTagExpiryMs.write((setActiveRecallQbankId.AudioAttributesImplApi26Parcelizer) bookReference) ? 1 : 0;
        }
        if (bookReference instanceof setActiveRecallQbankId.MediaBrowserCompatMediaItem) {
            return setTagExpiryMs.read((setActiveRecallQbankId.MediaBrowserCompatMediaItem) bookReference) ? 1 : 0;
        }
        if (bookReference instanceof setActiveRecallQbankId.write) {
            toMagicModuleMetaRepoModel.read(getbookmarkcount, "");
            getBookmarkCount.write writeVar = (getBookmarkCount.write) getbookmarkcount;
            if (writeVar.AudioAttributesImplApi26Parcelizer() == setActiveRecallQbankId.RemoteActionCompatParcelizer.write.ENUM_CLASS) {
                return 2;
            }
            return writeVar.MediaBrowserCompatItemReceiver() ? 1 : 0;
        }
        StringBuilder sb = new StringBuilder("Unsupported message: ");
        sb.append(bookReference.getClass());
        throw new UnsupportedOperationException(sb.toString());
    }

    @Override // kotlin.getParentType
    public final List<A> read(getBookmarkCount getbookmarkcount, BookReference bookReference, getMCQId getmcqid) {
        toMagicModuleMetaRepoModel.write(getbookmarkcount, "");
        toMagicModuleMetaRepoModel.write(bookReference, "");
        toMagicModuleMetaRepoModel.write(getmcqid, "");
        getMyRating getmyratingRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(bookReference, getbookmarkcount.write(), getbookmarkcount.AudioAttributesCompatParcelizer(), getmcqid);
        if (getmyratingRemoteActionCompatParcelizer != null) {
            getMyRating.IconCompatParcelizer iconCompatParcelizer = getMyRating.AudioAttributesCompatParcelizer;
            return IconCompatParcelizer(this, getbookmarkcount, getMyRating.IconCompatParcelizer.RemoteActionCompatParcelizer(getmyratingRemoteActionCompatParcelizer, 0), false, null, false, 60);
        }
        return IntermediateLoginResponseBody.RemoteActionCompatParcelizer();
    }

    @Override // kotlin.getParentType
    public final List<A> IconCompatParcelizer(setActiveRecallQbankId.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, setRatingCount setratingcount) {
        toMagicModuleMetaRepoModel.write(mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, "");
        toMagicModuleMetaRepoModel.write(setratingcount, "");
        Object objIconCompatParcelizer = mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.IconCompatParcelizer(toHomeLessonIndex.MediaBrowserCompatCustomActionResultReceiver);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(objIconCompatParcelizer, "");
        Iterable<setActiveRecallQbankId.IconCompatParcelizer> iterable = (Iterable) objIconCompatParcelizer;
        ArrayList arrayList = new ArrayList(IntermediateLoginResponseBody.RemoteActionCompatParcelizer(iterable, 10));
        for (setActiveRecallQbankId.IconCompatParcelizer iconCompatParcelizer : iterable) {
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(iconCompatParcelizer, "");
            arrayList.add(RemoteActionCompatParcelizer(iconCompatParcelizer, setratingcount));
        }
        return arrayList;
    }

    @Override // kotlin.getParentType
    public final List<A> AudioAttributesCompatParcelizer(setActiveRecallQbankId.onCustomAction oncustomaction, setRatingCount setratingcount) {
        toMagicModuleMetaRepoModel.write(oncustomaction, "");
        toMagicModuleMetaRepoModel.write(setratingcount, "");
        Object objIconCompatParcelizer = oncustomaction.IconCompatParcelizer(toHomeLessonIndex.MediaBrowserCompatMediaItem);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(objIconCompatParcelizer, "");
        Iterable<setActiveRecallQbankId.IconCompatParcelizer> iterable = (Iterable) objIconCompatParcelizer;
        ArrayList arrayList = new ArrayList(IntermediateLoginResponseBody.RemoteActionCompatParcelizer(iterable, 10));
        for (setActiveRecallQbankId.IconCompatParcelizer iconCompatParcelizer : iterable) {
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(iconCompatParcelizer, "");
            arrayList.add(RemoteActionCompatParcelizer(iconCompatParcelizer, setratingcount));
        }
        return arrayList;
    }

    protected static getMasterOrder IconCompatParcelizer(getBookmarkCount getbookmarkcount, getMasterOrder getmasterorder) {
        toMagicModuleMetaRepoModel.write(getbookmarkcount, "");
        if (getmasterorder != null) {
            return getmasterorder;
        }
        if (getbookmarkcount instanceof getBookmarkCount.write) {
            return IconCompatParcelizer((getBookmarkCount.write) getbookmarkcount);
        }
        return null;
    }

    protected final getMasterOrder AudioAttributesCompatParcelizer(getBookmarkCount getbookmarkcount, boolean z, boolean z2, Boolean bool, boolean z3) {
        getBookmarkCount.write writeVarMediaBrowserCompatCustomActionResultReceiver;
        toMagicModuleMetaRepoModel.write(getbookmarkcount, "");
        if (z) {
            if (bool == null) {
                StringBuilder sb = new StringBuilder("isConst should not be null for property (container=");
                sb.append(getbookmarkcount);
                sb.append(')');
                throw new IllegalStateException(sb.toString().toString());
            }
            if (getbookmarkcount instanceof getBookmarkCount.write) {
                getBookmarkCount.write writeVar = (getBookmarkCount.write) getbookmarkcount;
                if (writeVar.AudioAttributesImplApi26Parcelizer() == setActiveRecallQbankId.RemoteActionCompatParcelizer.write.INTERFACE) {
                    getLessonActivityStatus getlessonactivitystatus = this.IconCompatParcelizer;
                    RevisionSubjectStatusModel revisionSubjectStatusModel = writeVar.read().read(getRelatedLessonId.RemoteActionCompatParcelizer("DefaultImpls"));
                    toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(revisionSubjectStatusModel, "");
                    return getLessonType.RemoteActionCompatParcelizer(getlessonactivitystatus, revisionSubjectStatusModel, IconCompatParcelizer());
                }
            }
            if (bool.booleanValue() && (getbookmarkcount instanceof getBookmarkCount.IconCompatParcelizer)) {
                getIntroDurationSeconds getintrodurationsecondsIconCompatParcelizer = getbookmarkcount.IconCompatParcelizer();
                getIntro getintro = getintrodurationsecondsIconCompatParcelizer instanceof getIntro ? (getIntro) getintrodurationsecondsIconCompatParcelizer : null;
                setMcqType setmcqtypeRemoteActionCompatParcelizer = getintro != null ? getintro.RemoteActionCompatParcelizer() : null;
                if (setmcqtypeRemoteActionCompatParcelizer != null) {
                    getLessonActivityStatus getlessonactivitystatus2 = this.IconCompatParcelizer;
                    String strAudioAttributesCompatParcelizer = setmcqtypeRemoteActionCompatParcelizer.AudioAttributesCompatParcelizer();
                    toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(strAudioAttributesCompatParcelizer, "");
                    RevisionSubjectStatusModel revisionSubjectStatusModelRemoteActionCompatParcelizer = RevisionSubjectStatusModel.RemoteActionCompatParcelizer(new getNotesCount(TestGroupLSModel.AudioAttributesCompatParcelizer(strAudioAttributesCompatParcelizer, '/', '.', false)));
                    toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(revisionSubjectStatusModelRemoteActionCompatParcelizer, "");
                    return getLessonType.RemoteActionCompatParcelizer(getlessonactivitystatus2, revisionSubjectStatusModelRemoteActionCompatParcelizer, IconCompatParcelizer());
                }
            }
        }
        if (z2 && (getbookmarkcount instanceof getBookmarkCount.write)) {
            getBookmarkCount.write writeVar2 = (getBookmarkCount.write) getbookmarkcount;
            if (writeVar2.AudioAttributesImplApi26Parcelizer() == setActiveRecallQbankId.RemoteActionCompatParcelizer.write.COMPANION_OBJECT && (writeVarMediaBrowserCompatCustomActionResultReceiver = writeVar2.MediaBrowserCompatCustomActionResultReceiver()) != null && (writeVarMediaBrowserCompatCustomActionResultReceiver.AudioAttributesImplApi26Parcelizer() == setActiveRecallQbankId.RemoteActionCompatParcelizer.write.CLASS || writeVarMediaBrowserCompatCustomActionResultReceiver.AudioAttributesImplApi26Parcelizer() == setActiveRecallQbankId.RemoteActionCompatParcelizer.write.ENUM_CLASS || (z3 && (writeVarMediaBrowserCompatCustomActionResultReceiver.AudioAttributesImplApi26Parcelizer() == setActiveRecallQbankId.RemoteActionCompatParcelizer.write.INTERFACE || writeVarMediaBrowserCompatCustomActionResultReceiver.AudioAttributesImplApi26Parcelizer() == setActiveRecallQbankId.RemoteActionCompatParcelizer.write.ANNOTATION_CLASS)))) {
                return IconCompatParcelizer(writeVarMediaBrowserCompatCustomActionResultReceiver);
            }
        }
        if (!(getbookmarkcount instanceof getBookmarkCount.IconCompatParcelizer) || !(getbookmarkcount.IconCompatParcelizer() instanceof getIntro)) {
            return null;
        }
        getIntroDurationSeconds getintrodurationsecondsIconCompatParcelizer2 = getbookmarkcount.IconCompatParcelizer();
        toMagicModuleMetaRepoModel.read(getintrodurationsecondsIconCompatParcelizer2, "");
        getIntro getintro2 = (getIntro) getintrodurationsecondsIconCompatParcelizer2;
        getMasterOrder getmasterorder = getintro2.read();
        return getmasterorder == null ? getLessonType.RemoteActionCompatParcelizer(this.IconCompatParcelizer, getintro2.write(), IconCompatParcelizer()) : getmasterorder;
    }

    private static /* synthetic */ getMyRating RemoteActionCompatParcelizer(BookReference bookReference, setRatingCount setratingcount, setTagActive settagactive, getMCQId getmcqid) {
        return AudioAttributesCompatParcelizer(bookReference, setratingcount, settagactive, getmcqid, false);
    }

    protected static getMyRating AudioAttributesCompatParcelizer(BookReference bookReference, setRatingCount setratingcount, setTagActive settagactive, getMCQId getmcqid, boolean z) {
        toMagicModuleMetaRepoModel.write(bookReference, "");
        toMagicModuleMetaRepoModel.write(setratingcount, "");
        toMagicModuleMetaRepoModel.write(settagactive, "");
        toMagicModuleMetaRepoModel.write(getmcqid, "");
        if (bookReference instanceof setActiveRecallQbankId.write) {
            getMyRating.IconCompatParcelizer iconCompatParcelizer = getMyRating.AudioAttributesCompatParcelizer;
            getCompletedARQBankCount getcompletedarqbankcount = getCompletedARQBankCount.IconCompatParcelizer;
            getSchemaTitle.IconCompatParcelizer iconCompatParcelizerAudioAttributesCompatParcelizer = getCompletedARQBankCount.AudioAttributesCompatParcelizer((setActiveRecallQbankId.write) bookReference, setratingcount, settagactive);
            if (iconCompatParcelizerAudioAttributesCompatParcelizer == null) {
                return null;
            }
            return getMyRating.IconCompatParcelizer.read(iconCompatParcelizerAudioAttributesCompatParcelizer);
        }
        if (bookReference instanceof setActiveRecallQbankId.AudioAttributesImplApi26Parcelizer) {
            getMyRating.IconCompatParcelizer iconCompatParcelizer2 = getMyRating.AudioAttributesCompatParcelizer;
            getCompletedARQBankCount getcompletedarqbankcount2 = getCompletedARQBankCount.IconCompatParcelizer;
            getSchemaTitle.IconCompatParcelizer iconCompatParcelizerAudioAttributesCompatParcelizer2 = getCompletedARQBankCount.AudioAttributesCompatParcelizer((setActiveRecallQbankId.AudioAttributesImplApi26Parcelizer) bookReference, setratingcount, settagactive);
            if (iconCompatParcelizerAudioAttributesCompatParcelizer2 == null) {
                return null;
            }
            return getMyRating.IconCompatParcelizer.read(iconCompatParcelizerAudioAttributesCompatParcelizer2);
        }
        if (bookReference instanceof setActiveRecallQbankId.MediaBrowserCompatMediaItem) {
            HomeLessonIndexV2.IconCompatParcelizer<setActiveRecallQbankId.MediaBrowserCompatMediaItem, toHomeLessonIndex.AudioAttributesCompatParcelizer> iconCompatParcelizer3 = toHomeLessonIndex.AudioAttributesImplBaseParcelizer;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(iconCompatParcelizer3, "");
            toHomeLessonIndex.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = (toHomeLessonIndex.AudioAttributesCompatParcelizer) setTagLabel.read((HomeLessonIndexV2.read) bookReference, iconCompatParcelizer3);
            if (audioAttributesCompatParcelizer == null) {
                return null;
            }
            int i = write.write[getmcqid.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        return null;
                    }
                    return setHasVideo.read((setActiveRecallQbankId.MediaBrowserCompatMediaItem) bookReference, setratingcount, settagactive, true, true, z);
                }
                if (!audioAttributesCompatParcelizer.MediaBrowserCompatMediaItem()) {
                    return null;
                }
                getMyRating.IconCompatParcelizer iconCompatParcelizer4 = getMyRating.AudioAttributesCompatParcelizer;
                toHomeLessonIndex.IconCompatParcelizer iconCompatParcelizerAudioAttributesImplBaseParcelizer = audioAttributesCompatParcelizer.AudioAttributesImplBaseParcelizer();
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(iconCompatParcelizerAudioAttributesImplBaseParcelizer, "");
                return getMyRating.IconCompatParcelizer.write(setratingcount, iconCompatParcelizerAudioAttributesImplBaseParcelizer);
            }
            if (audioAttributesCompatParcelizer.MediaBrowserCompatSearchResultReceiver()) {
                getMyRating.IconCompatParcelizer iconCompatParcelizer5 = getMyRating.AudioAttributesCompatParcelizer;
                toHomeLessonIndex.IconCompatParcelizer iconCompatParcelizerRemoteActionCompatParcelizer = audioAttributesCompatParcelizer.RemoteActionCompatParcelizer();
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(iconCompatParcelizerRemoteActionCompatParcelizer, "");
                return getMyRating.IconCompatParcelizer.write(setratingcount, iconCompatParcelizerRemoteActionCompatParcelizer);
            }
        }
        return null;
    }

    protected final boolean IconCompatParcelizer(RevisionSubjectStatusModel revisionSubjectStatusModel) {
        getMasterOrder getmasterorderRemoteActionCompatParcelizer;
        toMagicModuleMetaRepoModel.write(revisionSubjectStatusModel, "");
        if (revisionSubjectStatusModel.write() == null || !toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) revisionSubjectStatusModel.AudioAttributesImplApi26Parcelizer().AudioAttributesCompatParcelizer(), (Object) "Container") || (getmasterorderRemoteActionCompatParcelizer = getLessonType.RemoteActionCompatParcelizer(this.IconCompatParcelizer, revisionSubjectStatusModel, IconCompatParcelizer())) == null) {
            return false;
        }
        getSearchItems getsearchitems = getSearchItems.IconCompatParcelizer;
        return getSearchItems.write(getmasterorderRemoteActionCompatParcelizer);
    }

    protected static byte[] RemoteActionCompatParcelizer(getMasterOrder getmasterorder) {
        toMagicModuleMetaRepoModel.write(getmasterorder, "");
        return null;
    }
}
