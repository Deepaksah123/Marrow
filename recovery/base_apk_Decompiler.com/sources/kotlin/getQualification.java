package kotlin;

import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class getQualification implements dummyEditor {
    private final getTestTabItems AudioAttributesCompatParcelizer;
    private final getNotesCount IconCompatParcelizer;
    private final RenewEligible RemoteActionCompatParcelizer;
    private final Map<getRelatedLessonId, getMagicLine<?>> write;

    /* JADX WARN: Multi-variable type inference failed */
    public getQualification(getTestTabItems gettesttabitems, getNotesCount getnotescount, Map<getRelatedLessonId, ? extends getMagicLine<?>> map) {
        toMagicModuleMetaRepoModel.write(gettesttabitems, "");
        toMagicModuleMetaRepoModel.write(getnotescount, "");
        toMagicModuleMetaRepoModel.write(map, "");
        this.AudioAttributesCompatParcelizer = gettesttabitems;
        this.IconCompatParcelizer = getnotescount;
        this.write = map;
        this.RemoteActionCompatParcelizer = getRenewExpiresOn.write(RenewEligibleCompanion.write, new RemoteActionCompatParcelizer());
    }

    @Override // kotlin.dummyEditor
    public final getNotesCount write() {
        return this.IconCompatParcelizer;
    }

    @Override // kotlin.dummyEditor
    public final Map<getRelatedLessonId, getMagicLine<?>> read() {
        return this.write;
    }

    static final class RemoteActionCompatParcelizer extends MagicModuleUseCase implements getCreatedOnDateMs<getHref> {
        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
        public getHref invoke() {
            return getQualification.this.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer(getQualification.this.write()).aP_();
        }

        RemoteActionCompatParcelizer() {
            super(0);
        }
    }

    @Override // kotlin.dummyEditor
    public final getLink RemoteActionCompatParcelizer() {
        Object objRemoteActionCompatParcelizer = this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(objRemoteActionCompatParcelizer, "");
        return (getLink) objRemoteActionCompatParcelizer;
    }

    @Override // kotlin.dummyEditor
    public final getIntroDurationSeconds IconCompatParcelizer() {
        getIntroDurationSeconds getintrodurationseconds = getIntroDurationSeconds.AudioAttributesCompatParcelizer;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(getintrodurationseconds, "");
        return getintrodurationseconds;
    }
}
