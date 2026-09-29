package kotlin;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.SchemaSubjectMap;
import kotlin.getQuote;
import kotlin.getTopSection;

/* JADX INFO: loaded from: classes4.dex */
public final class isServerContentUpdated extends getBooleanMap implements getTopSection {
    private getExams AudioAttributesCompatParcelizer;
    private final getListOfLessonCompletions<getNotesCount, CourseConfigV2SearchItem> AudioAttributesImplApi21Parcelizer;
    private final SchemaSubjectMap AudioAttributesImplApi26Parcelizer;
    private final getRelatedLessonId AudioAttributesImplBaseParcelizer;
    private boolean IconCompatParcelizer;
    private final isResumeExplanation MediaBrowserCompatCustomActionResultReceiver;
    private final RenewEligible MediaBrowserCompatItemReceiver;
    private final getMini MediaDescriptionCompat;
    private CourseConfigV2PracticalItems RemoteActionCompatParcelizer;
    private final getTestTabItems read;
    private final Map<getBottomSection<?>, Object> write;

    @Override // kotlin.getVariant
    public final getVariant AudioAttributesImplApi21Parcelizer() {
        return null;
    }

    @Override // kotlin.getVariant
    public final <R, D> R AudioAttributesCompatParcelizer(CourseConfigV2NavDrawerItemAddVideo<R, D> courseConfigV2NavDrawerItemAddVideo, D d) {
        return (R) getTopSection.write.read(this, courseConfigV2NavDrawerItemAddVideo, d);
    }

    @Override // kotlin.getTopSection
    public final getTestTabItems write() {
        return this.read;
    }

    public /* synthetic */ isServerContentUpdated(getRelatedLessonId getrelatedlessonid, getMini getmini, getTestTabItems gettesttabitems, isResumeExplanation isresumeexplanation, Map map, int i) {
        this(getrelatedlessonid, getmini, gettesttabitems, (isResumeExplanation) null, (Map<getBottomSection<?>, ? extends Object>) ((i & 16) != 0 ? VideoTimelineResponseBody.read() : map), (getRelatedLessonId) null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private isServerContentUpdated(getRelatedLessonId getrelatedlessonid, getMini getmini, getTestTabItems gettesttabitems, isResumeExplanation isresumeexplanation, Map<getBottomSection<?>, ? extends Object> map, getRelatedLessonId getrelatedlessonid2) {
        super(getQuote.AudioAttributesCompatParcelizer.read(), getrelatedlessonid);
        toMagicModuleMetaRepoModel.write(getrelatedlessonid, "");
        toMagicModuleMetaRepoModel.write(getmini, "");
        toMagicModuleMetaRepoModel.write(gettesttabitems, "");
        toMagicModuleMetaRepoModel.write(map, "");
        getQuote.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = getQuote.IconCompatParcelizer;
        this.MediaDescriptionCompat = getmini;
        this.read = gettesttabitems;
        this.MediaBrowserCompatCustomActionResultReceiver = isresumeexplanation;
        this.AudioAttributesImplBaseParcelizer = null;
        if (!getrelatedlessonid.read()) {
            throw new IllegalArgumentException("Module name must be special: ".concat(String.valueOf(getrelatedlessonid)));
        }
        this.write = map;
        SchemaSubjectMap.RemoteActionCompatParcelizer remoteActionCompatParcelizer = SchemaSubjectMap.read;
        SchemaSubjectMap.IconCompatParcelizer iconCompatParcelizer = (SchemaSubjectMap) AudioAttributesCompatParcelizer(SchemaSubjectMap.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer());
        this.AudioAttributesImplApi26Parcelizer = iconCompatParcelizer == null ? SchemaSubjectMap.IconCompatParcelizer.write : iconCompatParcelizer;
        this.IconCompatParcelizer = true;
        this.AudioAttributesImplApi21Parcelizer = getmini.AudioAttributesCompatParcelizer(new write());
        this.MediaBrowserCompatItemReceiver = getRenewExpiresOn.RemoteActionCompatParcelizer(new read());
    }

    private boolean MediaBrowserCompatSearchResultReceiver() {
        return this.IconCompatParcelizer;
    }

    public final void read() {
        if (MediaBrowserCompatSearchResultReceiver()) {
            return;
        }
        getAllItems.write(this);
    }

    static final class write extends MagicModuleUseCase implements getAnswerMap<getNotesCount, CourseConfigV2SearchItem> {
        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public CourseConfigV2SearchItem invoke(getNotesCount getnotescount) {
            toMagicModuleMetaRepoModel.write(getnotescount, "");
            SchemaSubjectMap schemaSubjectMap = isServerContentUpdated.this.AudioAttributesImplApi26Parcelizer;
            isServerContentUpdated isservercontentupdated = isServerContentUpdated.this;
            return schemaSubjectMap.RemoteActionCompatParcelizer(isservercontentupdated, getnotescount, isservercontentupdated.MediaDescriptionCompat);
        }

        write() {
            super(1);
        }
    }

    @Override // kotlin.getTopSection
    public final List<getTopSection> IconCompatParcelizer() {
        getExams getexams = this.AudioAttributesCompatParcelizer;
        if (getexams != null) {
            return getexams.AudioAttributesCompatParcelizer();
        }
        StringBuilder sb = new StringBuilder("Dependencies of module ");
        sb.append(AudioAttributesImplBaseParcelizer());
        sb.append(" were not set");
        throw new AssertionError(sb.toString());
    }

    @Override // kotlin.getTopSection
    public final CourseConfigV2SearchItem RemoteActionCompatParcelizer(getNotesCount getnotescount) {
        toMagicModuleMetaRepoModel.write(getnotescount, "");
        read();
        return this.AudioAttributesImplApi21Parcelizer.invoke(getnotescount);
    }

    @Override // kotlin.getTopSection
    public final Collection<getNotesCount> IconCompatParcelizer(getNotesCount getnotescount, getAnswerMap<? super getRelatedLessonId, Boolean> getanswermap) {
        toMagicModuleMetaRepoModel.write(getnotescount, "");
        toMagicModuleMetaRepoModel.write(getanswermap, "");
        read();
        return MediaBrowserCompatItemReceiver().RemoteActionCompatParcelizer(getnotescount, getanswermap);
    }

    static final class read extends MagicModuleUseCase implements getCreatedOnDateMs<getBundleMap> {
        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
        public getBundleMap invoke() {
            getExams getexams = isServerContentUpdated.this.AudioAttributesCompatParcelizer;
            isServerContentUpdated isservercontentupdated = isServerContentUpdated.this;
            if (getexams == null) {
                StringBuilder sb = new StringBuilder("Dependencies of module ");
                sb.append(isservercontentupdated.AudioAttributesImplBaseParcelizer());
                sb.append(" were not set before querying module content");
                throw new AssertionError(sb.toString());
            }
            List<isServerContentUpdated> listIconCompatParcelizer = getexams.IconCompatParcelizer();
            isServerContentUpdated.this.read();
            listIconCompatParcelizer.contains(isServerContentUpdated.this);
            List<isServerContentUpdated> list = listIconCompatParcelizer;
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                ((isServerContentUpdated) it.next()).MediaMetadataCompat();
            }
            ArrayList arrayList = new ArrayList(IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Iterable) list, 10));
            Iterator<T> it2 = list.iterator();
            while (it2.hasNext()) {
                CourseConfigV2PracticalItems courseConfigV2PracticalItems = ((isServerContentUpdated) it2.next()).RemoteActionCompatParcelizer;
                toMagicModuleMetaRepoModel.write(courseConfigV2PracticalItems);
                arrayList.add(courseConfigV2PracticalItems);
            }
            StringBuilder sb2 = new StringBuilder("CompositeProvider@ModuleDescriptor for ");
            sb2.append(isServerContentUpdated.this.aQ_());
            return new getBundleMap(arrayList, sb2.toString());
        }

        read() {
            super(0);
        }
    }

    private final getBundleMap MediaBrowserCompatCustomActionResultReceiver() {
        return (getBundleMap) this.MediaBrowserCompatItemReceiver.RemoteActionCompatParcelizer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean MediaMetadataCompat() {
        return this.RemoteActionCompatParcelizer != null;
    }

    private void IconCompatParcelizer(getExams getexams) {
        toMagicModuleMetaRepoModel.write(getexams, "");
        this.AudioAttributesCompatParcelizer = getexams;
    }

    public final void RemoteActionCompatParcelizer(isServerContentUpdated... isservercontentupdatedArr) {
        toMagicModuleMetaRepoModel.write(isservercontentupdatedArr, "");
        AudioAttributesCompatParcelizer(getOrderDetails.onCommand(isservercontentupdatedArr));
    }

    private void AudioAttributesCompatParcelizer(List<isServerContentUpdated> list) {
        toMagicModuleMetaRepoModel.write(list, "");
        AudioAttributesCompatParcelizer(list, getKycMessage.read());
    }

    private void AudioAttributesCompatParcelizer(List<isServerContentUpdated> list, Set<isServerContentUpdated> set) {
        toMagicModuleMetaRepoModel.write(list, "");
        toMagicModuleMetaRepoModel.write(set, "");
        IconCompatParcelizer(new setServerContentUpdated(list, set, IntermediateLoginResponseBody.RemoteActionCompatParcelizer(), getKycMessage.read()));
    }

    @Override // kotlin.getTopSection
    public final boolean read(getTopSection gettopsection) {
        toMagicModuleMetaRepoModel.write(gettopsection, "");
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this, gettopsection)) {
            return true;
        }
        getExams getexams = this.AudioAttributesCompatParcelizer;
        toMagicModuleMetaRepoModel.write(getexams);
        return IntermediateLoginResponseBody.AudioAttributesCompatParcelizer(getexams.RemoteActionCompatParcelizer(), gettopsection) || IconCompatParcelizer().contains(gettopsection) || gettopsection.IconCompatParcelizer().contains(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String AudioAttributesImplBaseParcelizer() {
        String string = aQ_().toString();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string, "");
        return string;
    }

    public final void read(CourseConfigV2PracticalItems courseConfigV2PracticalItems) {
        toMagicModuleMetaRepoModel.write(courseConfigV2PracticalItems, "");
        MediaMetadataCompat();
        this.RemoteActionCompatParcelizer = courseConfigV2PracticalItems;
    }

    public final CourseConfigV2PracticalItems MediaBrowserCompatItemReceiver() {
        read();
        return MediaBrowserCompatCustomActionResultReceiver();
    }

    @Override // kotlin.getTopSection
    public final <T> T AudioAttributesCompatParcelizer(getBottomSection<T> getbottomsection) {
        toMagicModuleMetaRepoModel.write(getbottomsection, "");
        T t = (T) this.write.get(getbottomsection);
        if (t == null) {
            return null;
        }
        return t;
    }

    @Override // kotlin.getBooleanMap
    public final String toString() {
        String string = super.toString();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string, "");
        if (MediaBrowserCompatSearchResultReceiver()) {
            return string;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(string);
        sb.append(" !isValid");
        return sb.toString();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public isServerContentUpdated(getRelatedLessonId getrelatedlessonid, getMini getmini, getTestTabItems gettesttabitems) {
        this(getrelatedlessonid, getmini, gettesttabitems, (isResumeExplanation) null, (Map) null, 48);
        toMagicModuleMetaRepoModel.write(getrelatedlessonid, "");
        toMagicModuleMetaRepoModel.write(getmini, "");
        toMagicModuleMetaRepoModel.write(gettesttabitems, "");
    }
}
