package kotlin;

import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.getZenArea;

/* JADX INFO: loaded from: classes4.dex */
public final class getResponseParams {
    public static final getResponseParams write = new getResponseParams();
    private static final Map<String, EnumSet<FeaturedCard>> IconCompatParcelizer = VideoTimelineResponseBody.RemoteActionCompatParcelizer(setAction.write("PACKAGE", EnumSet.noneOf(FeaturedCard.class)), setAction.write("TYPE", EnumSet.of(FeaturedCard.write, FeaturedCard.IconCompatParcelizer)), setAction.write("ANNOTATION_TYPE", EnumSet.of(FeaturedCard.read)), setAction.write("TYPE_PARAMETER", EnumSet.of(FeaturedCard.MediaDescriptionCompat)), setAction.write("FIELD", EnumSet.of(FeaturedCard.AudioAttributesCompatParcelizer)), setAction.write("LOCAL_VARIABLE", EnumSet.of(FeaturedCard.AudioAttributesImplBaseParcelizer)), setAction.write("PARAMETER", EnumSet.of(FeaturedCard.MediaBrowserCompatMediaItem)), setAction.write("CONSTRUCTOR", EnumSet.of(FeaturedCard.RemoteActionCompatParcelizer)), setAction.write("METHOD", EnumSet.of(FeaturedCard.MediaBrowserCompatItemReceiver, FeaturedCard.AudioAttributesImplApi21Parcelizer, FeaturedCard.AudioAttributesImplApi26Parcelizer)), setAction.write("TYPE_USE", EnumSet.of(FeaturedCard.MediaBrowserCompatCustomActionResultReceiver)));
    private static final Map<String, toEditorInfoJSON> RemoteActionCompatParcelizer = VideoTimelineResponseBody.RemoteActionCompatParcelizer(setAction.write("RUNTIME", toEditorInfoJSON.RUNTIME), setAction.write("CLASS", toEditorInfoJSON.BINARY), setAction.write("SOURCE", toEditorInfoJSON.SOURCE));

    private getResponseParams() {
    }

    private static Set<FeaturedCard> IconCompatParcelizer(String str) {
        EnumSet<FeaturedCard> enumSet = IconCompatParcelizer.get(str);
        return enumSet != null ? enumSet : getKycMessage.read();
    }

    public static getMagicLine<?> read(List<? extends setTagsList> list) {
        toMagicModuleMetaRepoModel.write(list, "");
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof setSubjectId) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            getRelatedLessonId getrelatedlessonidAudioAttributesCompatParcelizer = ((setSubjectId) it.next()).AudioAttributesCompatParcelizer();
            IntermediateLoginResponseBody.IconCompatParcelizer((Collection) arrayList2, (Iterable) IconCompatParcelizer(getrelatedlessonidAudioAttributesCompatParcelizer != null ? getrelatedlessonidAudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer() : null));
        }
        ArrayList<FeaturedCard> arrayList3 = arrayList2;
        ArrayList arrayList4 = new ArrayList(IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Iterable) arrayList3, 10));
        for (FeaturedCard featuredCard : arrayList3) {
            RevisionSubjectStatusModel revisionSubjectStatusModelRemoteActionCompatParcelizer = RevisionSubjectStatusModel.RemoteActionCompatParcelizer(getZenArea.RemoteActionCompatParcelizer.read);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(revisionSubjectStatusModelRemoteActionCompatParcelizer, "");
            getRelatedLessonId getrelatedlessonidRemoteActionCompatParcelizer = getRelatedLessonId.RemoteActionCompatParcelizer(featuredCard.name());
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(getrelatedlessonidRemoteActionCompatParcelizer, "");
            arrayList4.add(new getMcqType(revisionSubjectStatusModelRemoteActionCompatParcelizer, getrelatedlessonidRemoteActionCompatParcelizer));
        }
        return new getAnswerPointer(arrayList4, IconCompatParcelizer.RemoteActionCompatParcelizer);
    }

    static final class IconCompatParcelizer extends MagicModuleUseCase implements getAnswerMap<getTopSection, getLink> {
        public static final IconCompatParcelizer RemoteActionCompatParcelizer = new IconCompatParcelizer();

        @Override // kotlin.getAnswerMap
        public final /* synthetic */ getLink invoke(getTopSection gettopsection) {
            return write(gettopsection);
        }

        private static getLink write(getTopSection gettopsection) {
            toMagicModuleMetaRepoModel.write(gettopsection, "");
            getUserInitiatedExamStartedOn getuserinitiatedexamstartedon = getUserInitiatedExamStartedOn.write;
            getMeta getmetaRemoteActionCompatParcelizer = getExpiredOn.RemoteActionCompatParcelizer(getUserInitiatedExamStartedOn.read(), gettopsection.write().AudioAttributesCompatParcelizer(getZenArea.RemoteActionCompatParcelizer.setSessionImpl));
            getLink getlinkOnPrepareFromMediaId = getmetaRemoteActionCompatParcelizer != null ? getmetaRemoteActionCompatParcelizer.onPrepareFromMediaId() : null;
            return getlinkOnPrepareFromMediaId == null ? SubscriptionType.read(setAccessLevel.UNMAPPED_ANNOTATION_TARGET_TYPE, new String[0]) : getlinkOnPrepareFromMediaId;
        }

        IconCompatParcelizer() {
            super(1);
        }
    }

    public static getMagicLine<?> read(setTagsList settagslist) {
        getMcqType getmcqtype = null;
        setSubjectId setsubjectid = settagslist instanceof setSubjectId ? (setSubjectId) settagslist : null;
        if (setsubjectid != null) {
            Map<String, toEditorInfoJSON> map = RemoteActionCompatParcelizer;
            getRelatedLessonId getrelatedlessonidAudioAttributesCompatParcelizer = setsubjectid.AudioAttributesCompatParcelizer();
            toEditorInfoJSON toeditorinfojson = map.get(getrelatedlessonidAudioAttributesCompatParcelizer != null ? getrelatedlessonidAudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer() : null);
            if (toeditorinfojson != null) {
                RevisionSubjectStatusModel revisionSubjectStatusModelRemoteActionCompatParcelizer = RevisionSubjectStatusModel.RemoteActionCompatParcelizer(getZenArea.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer);
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(revisionSubjectStatusModelRemoteActionCompatParcelizer, "");
                getRelatedLessonId getrelatedlessonidRemoteActionCompatParcelizer = getRelatedLessonId.RemoteActionCompatParcelizer(toeditorinfojson.name());
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(getrelatedlessonidRemoteActionCompatParcelizer, "");
                getmcqtype = new getMcqType(revisionSubjectStatusModelRemoteActionCompatParcelizer, getrelatedlessonidRemoteActionCompatParcelizer);
            }
        }
        return getmcqtype;
    }
}
