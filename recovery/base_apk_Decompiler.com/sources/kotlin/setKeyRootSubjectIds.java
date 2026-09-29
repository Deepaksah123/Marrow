package kotlin;

/* JADX INFO: loaded from: classes4.dex */
public final class setKeyRootSubjectIds extends getTopicId implements getNoteEdition {
    private final getTopicId AudioAttributesCompatParcelizer;
    private final getLink write;

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.getNoteEdition
    /* JADX INFO: renamed from: MediaMetadataCompat, reason: merged with bridge method [inline-methods] */
    public getTopicId MediaBrowserCompatItemReceiver() {
        return this.AudioAttributesCompatParcelizer;
    }

    @Override // kotlin.getNoteEdition
    public final getLink MediaBrowserCompatCustomActionResultReceiver() {
        return this.write;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public setKeyRootSubjectIds(getTopicId gettopicid, getLink getlink) {
        super(gettopicid.AudioAttributesImplBaseParcelizer(), gettopicid.AudioAttributesImplApi26Parcelizer());
        toMagicModuleMetaRepoModel.write(gettopicid, "");
        toMagicModuleMetaRepoModel.write(getlink, "");
        this.AudioAttributesCompatParcelizer = gettopicid;
        this.write = getlink;
    }

    @Override // kotlin.PlanAddOnsCompanion
    public final PlanAddOnsCompanion AudioAttributesCompatParcelizer(getGroupDescription getgroupdescription) {
        toMagicModuleMetaRepoModel.write(getgroupdescription, "");
        return setPlanType.RemoteActionCompatParcelizer(MediaBrowserCompatItemReceiver().AudioAttributesCompatParcelizer(getgroupdescription), MediaBrowserCompatCustomActionResultReceiver());
    }

    @Override // kotlin.PlanAddOnsCompanion
    /* JADX INFO: renamed from: RemoteActionCompatParcelizer */
    public final PlanAddOnsCompanion write(boolean z) {
        return setPlanType.RemoteActionCompatParcelizer(MediaBrowserCompatItemReceiver().write(z), MediaBrowserCompatCustomActionResultReceiver().MediaBrowserCompatMediaItem().write(z));
    }

    @Override // kotlin.getTopicId
    public final String read(setGuessed setguessed, setFirstAnswer setfirstanswer) {
        toMagicModuleMetaRepoModel.write(setguessed, "");
        toMagicModuleMetaRepoModel.write(setfirstanswer, "");
        if (setfirstanswer.AudioAttributesCompatParcelizer()) {
            return setguessed.read(MediaBrowserCompatCustomActionResultReceiver());
        }
        return MediaBrowserCompatItemReceiver().read(setguessed, setfirstanswer);
    }

    @Override // kotlin.getTopicId
    public final getHref IconCompatParcelizer() {
        return MediaBrowserCompatItemReceiver().IconCompatParcelizer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.PlanAddOnsCompanion
    /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
    public setKeyRootSubjectIds write(getCheapestPlan getcheapestplan) {
        toMagicModuleMetaRepoModel.write(getcheapestplan, "");
        getLink getlink = getcheapestplan.read(MediaBrowserCompatItemReceiver());
        toMagicModuleMetaRepoModel.read(getlink, "");
        return new setKeyRootSubjectIds((getTopicId) getlink, getcheapestplan.read(MediaBrowserCompatCustomActionResultReceiver()));
    }

    @Override // kotlin.getTopicId
    public final String toString() {
        StringBuilder sb = new StringBuilder("[@EnhancedForWarnings(");
        sb.append(MediaBrowserCompatCustomActionResultReceiver());
        sb.append(")] ");
        sb.append(MediaBrowserCompatItemReceiver());
        return sb.toString();
    }
}
