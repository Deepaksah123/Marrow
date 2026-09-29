package kotlin;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.getMcqContentBody;

/* JADX INFO: loaded from: classes4.dex */
public abstract class setStatusUpdateStartTimeMs extends setStatusUpdateEndTimeMs {
    private static /* synthetic */ isResolutionNotSupported<Object>[] AudioAttributesCompatParcelizer = {toMagicModuleMetaDataUcModel.write(new downloadMagicModuleMetalambda0(toMagicModuleMetaDataUcModel.write(setStatusUpdateStartTimeMs.class), "allDescriptors", "getAllDescriptors()Ljava/util/List;"))};
    private final PageValue RemoteActionCompatParcelizer;
    private final CourseConfigV2CustomModuleQuestionSource write;

    protected abstract List<CourseConfigV2NavDrawerItemRateUs> read();

    protected final CourseConfigV2CustomModuleQuestionSource IconCompatParcelizer() {
        return this.write;
    }

    public setStatusUpdateStartTimeMs(getMini getmini, CourseConfigV2CustomModuleQuestionSource courseConfigV2CustomModuleQuestionSource) {
        toMagicModuleMetaRepoModel.write(getmini, "");
        toMagicModuleMetaRepoModel.write(courseConfigV2CustomModuleQuestionSource, "");
        this.write = courseConfigV2CustomModuleQuestionSource;
        this.RemoteActionCompatParcelizer = getmini.read(new RemoteActionCompatParcelizer());
    }

    static final class RemoteActionCompatParcelizer extends MagicModuleUseCase implements getCreatedOnDateMs<List<? extends getVariant>> {
        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public List<getVariant> invoke() {
            List<CourseConfigV2NavDrawerItemRateUs> list = setStatusUpdateStartTimeMs.this.read();
            return IntermediateLoginResponseBody.AudioAttributesCompatParcelizer((Collection) list, (Iterable) setStatusUpdateStartTimeMs.this.read(list));
        }

        RemoteActionCompatParcelizer() {
            super(0);
        }
    }

    private final List<getVariant> write() {
        return (List) Pearl.RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer, AudioAttributesCompatParcelizer[0]);
    }

    @Override // kotlin.setStatusUpdateEndTimeMs, kotlin.getMcqContentBody
    public final Collection<getVariant> read(setOption6AnsweredCount setoption6answeredcount, getAnswerMap<? super getRelatedLessonId, Boolean> getanswermap) {
        toMagicModuleMetaRepoModel.write(setoption6answeredcount, "");
        toMagicModuleMetaRepoModel.write(getanswermap, "");
        return !setoption6answeredcount.AudioAttributesCompatParcelizer(setOption6AnsweredCount.AudioAttributesCompatParcelizer.MediaBrowserCompatSearchResultReceiver()) ? IntermediateLoginResponseBody.RemoteActionCompatParcelizer() : write();
    }

    @Override // kotlin.setStatusUpdateEndTimeMs, kotlin.setTags, kotlin.getMcqContentBody
    public final Collection<CourseConfigV2SupportItem> read(getRelatedLessonId getrelatedlessonid, getTimeStamp gettimestamp) {
        toMagicModuleMetaRepoModel.write(getrelatedlessonid, "");
        toMagicModuleMetaRepoModel.write(gettimestamp, "");
        List<getVariant> listWrite = write();
        getMonthTimeStamp getmonthtimestamp = new getMonthTimeStamp();
        for (Object obj : listWrite) {
            if ((obj instanceof CourseConfigV2SupportItem) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(((CourseConfigV2SupportItem) obj).aQ_(), getrelatedlessonid)) {
                getmonthtimestamp.add(obj);
            }
        }
        return getmonthtimestamp;
    }

    @Override // kotlin.setStatusUpdateEndTimeMs, kotlin.setTags
    public final Collection<CourseConfigV2SettingsItems> IconCompatParcelizer(getRelatedLessonId getrelatedlessonid, getTimeStamp gettimestamp) {
        toMagicModuleMetaRepoModel.write(getrelatedlessonid, "");
        toMagicModuleMetaRepoModel.write(gettimestamp, "");
        List<getVariant> listWrite = write();
        getMonthTimeStamp getmonthtimestamp = new getMonthTimeStamp();
        for (Object obj : listWrite) {
            if ((obj instanceof CourseConfigV2SettingsItems) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(((CourseConfigV2SettingsItems) obj).aQ_(), getrelatedlessonid)) {
                getmonthtimestamp.add(obj);
            }
        }
        return getmonthtimestamp;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<getVariant> read(List<? extends CourseConfigV2NavDrawerItemRateUs> list) {
        ArrayList arrayListRemoteActionCompatParcelizer;
        ArrayList arrayList = new ArrayList(3);
        Collection<getLink> collectionAV_ = this.write.MediaBrowserCompatSearchResultReceiver().aV_();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(collectionAV_, "");
        ArrayList arrayList2 = new ArrayList();
        Iterator<T> it = collectionAV_.iterator();
        while (it.hasNext()) {
            IntermediateLoginResponseBody.IconCompatParcelizer((Collection) arrayList2, (Iterable) getMcqContentBody.IconCompatParcelizer.RemoteActionCompatParcelizer(((getLink) it.next()).read(), null, null, 3));
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object obj : arrayList2) {
            if (obj instanceof getTestHeaderTitle) {
                arrayList3.add(obj);
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj2 : arrayList3) {
            getRelatedLessonId getrelatedlessonidAQ_ = ((getTestHeaderTitle) obj2).aQ_();
            Object obj3 = linkedHashMap.get(getrelatedlessonidAQ_);
            if (obj3 == null) {
                obj3 = (List) new ArrayList();
                linkedHashMap.put(getrelatedlessonidAQ_, obj3);
            }
            ((List) obj3).add(obj2);
        }
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            getRelatedLessonId getrelatedlessonid = (getRelatedLessonId) entry.getKey();
            List list2 = (List) entry.getValue();
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            for (Object obj4 : list2) {
                Boolean boolValueOf = Boolean.valueOf(((getTestHeaderTitle) obj4) instanceof CourseConfigV2NavDrawerItemRateUs);
                Object obj5 = linkedHashMap2.get(boolValueOf);
                if (obj5 == null) {
                    obj5 = (List) new ArrayList();
                    linkedHashMap2.put(boolValueOf, obj5);
                }
                ((List) obj5).add(obj4);
            }
            for (Map.Entry entry2 : linkedHashMap2.entrySet()) {
                boolean zBooleanValue = ((Boolean) entry2.getKey()).booleanValue();
                List list3 = (List) entry2.getValue();
                getOptions getoptions = getOptions.RemoteActionCompatParcelizer;
                List list4 = list3;
                if (!zBooleanValue) {
                    arrayListRemoteActionCompatParcelizer = IntermediateLoginResponseBody.RemoteActionCompatParcelizer();
                } else {
                    ArrayList arrayList4 = new ArrayList();
                    for (Object obj6 : list) {
                        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(((CourseConfigV2NavDrawerItemRateUs) obj6).aQ_(), getrelatedlessonid)) {
                            arrayList4.add(obj6);
                        }
                    }
                    arrayListRemoteActionCompatParcelizer = arrayList4;
                }
                getoptions.RemoteActionCompatParcelizer(getrelatedlessonid, list4, arrayListRemoteActionCompatParcelizer, this.write, new IconCompatParcelizer(arrayList, this));
            }
        }
        return SubjectGroupTypeConstant.IconCompatParcelizer(arrayList);
    }

    public static final class IconCompatParcelizer extends setAnswerDescription {
        private /* synthetic */ setStatusUpdateStartTimeMs AudioAttributesCompatParcelizer;
        private /* synthetic */ ArrayList<getVariant> IconCompatParcelizer;

        IconCompatParcelizer(ArrayList<getVariant> arrayList, setStatusUpdateStartTimeMs setstatusupdatestarttimems) {
            this.IconCompatParcelizer = arrayList;
            this.AudioAttributesCompatParcelizer = setstatusupdatestarttimems;
        }

        @Override // kotlin.getOption4
        public final void AudioAttributesCompatParcelizer(getTestHeaderTitle gettestheadertitle) {
            toMagicModuleMetaRepoModel.write(gettestheadertitle, "");
            getOptions.RemoteActionCompatParcelizer(gettestheadertitle, (getAnswerMap<getTestHeaderTitle, getShowPopup>) null);
            this.IconCompatParcelizer.add(gettestheadertitle);
        }

        @Override // kotlin.setAnswerDescription
        public final void read(getTestHeaderTitle gettestheadertitle, getTestHeaderTitle gettestheadertitle2) {
            toMagicModuleMetaRepoModel.write(gettestheadertitle, "");
            toMagicModuleMetaRepoModel.write(gettestheadertitle2, "");
            StringBuilder sb = new StringBuilder("Conflict in scope of ");
            sb.append(this.AudioAttributesCompatParcelizer.IconCompatParcelizer());
            sb.append(": ");
            sb.append(gettestheadertitle);
            sb.append(" vs ");
            sb.append(gettestheadertitle2);
            throw new IllegalStateException(sb.toString().toString());
        }
    }
}
