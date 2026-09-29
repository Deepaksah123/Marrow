package kotlin;

import java.util.Collection;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public abstract class McqParentInfo implements CourseConfigV2QbankItem {
    private final getMini AudioAttributesCompatParcelizer;
    private getPearlId IconCompatParcelizer;
    private final FilterItemRecordCompanion RemoteActionCompatParcelizer;
    private final SchemaQbankItem<getNotesCount, getShouldShowEmptyPlanScreen> read;
    private final getTopSection write;

    protected abstract QaPair read(getNotesCount getnotescount);

    public McqParentInfo(getMini getmini, FilterItemRecordCompanion filterItemRecordCompanion, getTopSection gettopsection) {
        toMagicModuleMetaRepoModel.write(getmini, "");
        toMagicModuleMetaRepoModel.write(filterItemRecordCompanion, "");
        toMagicModuleMetaRepoModel.write(gettopsection, "");
        this.AudioAttributesCompatParcelizer = getmini;
        this.RemoteActionCompatParcelizer = filterItemRecordCompanion;
        this.write = gettopsection;
        this.read = getmini.IconCompatParcelizer(new write());
    }

    protected final getMini AudioAttributesCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    protected final FilterItemRecordCompanion read() {
        return this.RemoteActionCompatParcelizer;
    }

    protected final getTopSection IconCompatParcelizer() {
        return this.write;
    }

    protected final getPearlId RemoteActionCompatParcelizer() {
        getPearlId getpearlid = this.IconCompatParcelizer;
        if (getpearlid != null) {
            return getpearlid;
        }
        toMagicModuleMetaRepoModel.IconCompatParcelizer("");
        return null;
    }

    protected final void read(getPearlId getpearlid) {
        toMagicModuleMetaRepoModel.write(getpearlid, "");
        this.IconCompatParcelizer = getpearlid;
    }

    static final class write extends MagicModuleUseCase implements getAnswerMap<getNotesCount, getShouldShowEmptyPlanScreen> {
        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
        public getShouldShowEmptyPlanScreen invoke(getNotesCount getnotescount) {
            toMagicModuleMetaRepoModel.write(getnotescount, "");
            QaPair qaPair = McqParentInfo.this.read(getnotescount);
            if (qaPair != null) {
                qaPair.read(McqParentInfo.this.RemoteActionCompatParcelizer());
            } else {
                qaPair = null;
            }
            return qaPair;
        }

        write() {
            super(1);
        }
    }

    @Override // kotlin.CourseConfigV2QbankItem
    public final void write(getNotesCount getnotescount, Collection<getShouldShowEmptyPlanScreen> collection) {
        toMagicModuleMetaRepoModel.write(getnotescount, "");
        toMagicModuleMetaRepoModel.write(collection, "");
        SubjectGroupTypeConstant.write(collection, this.read.invoke(getnotescount));
    }

    @Override // kotlin.CourseConfigV2QbankItem
    public final boolean RemoteActionCompatParcelizer(getNotesCount getnotescount) {
        CourseConfigV2NavDrawerItemAboutUs courseConfigV2NavDrawerItemAboutUs;
        toMagicModuleMetaRepoModel.write(getnotescount, "");
        if (this.read.write(getnotescount)) {
            courseConfigV2NavDrawerItemAboutUs = (getShouldShowEmptyPlanScreen) this.read.invoke(getnotescount);
        } else {
            courseConfigV2NavDrawerItemAboutUs = read(getnotescount);
        }
        return courseConfigV2NavDrawerItemAboutUs == null;
    }

    @Override // kotlin.CourseConfigV2PracticalItems
    @getRenewGrpId
    public final List<getShouldShowEmptyPlanScreen> IconCompatParcelizer(getNotesCount getnotescount) {
        toMagicModuleMetaRepoModel.write(getnotescount, "");
        return IntermediateLoginResponseBody.AudioAttributesCompatParcelizer(this.read.invoke(getnotescount));
    }

    @Override // kotlin.CourseConfigV2PracticalItems
    public final Collection<getNotesCount> RemoteActionCompatParcelizer(getNotesCount getnotescount, getAnswerMap<? super getRelatedLessonId, Boolean> getanswermap) {
        toMagicModuleMetaRepoModel.write(getnotescount, "");
        toMagicModuleMetaRepoModel.write(getanswermap, "");
        return getKycMessage.read();
    }
}
