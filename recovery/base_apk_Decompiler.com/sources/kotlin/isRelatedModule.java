package kotlin;

/* JADX INFO: loaded from: classes4.dex */
final class isRelatedModule extends TestSubModel<dummyEditor> {
    private final fromJSONArray AudioAttributesCompatParcelizer;
    private final setSectionName IconCompatParcelizer;
    private final boolean RemoteActionCompatParcelizer;
    private final getFeaturedCards read;
    private final boolean write;

    public /* synthetic */ isRelatedModule(fromJSONArray fromjsonarray, boolean z, getFeaturedCards getfeaturedcards, setSectionName setsectionname) {
        this(fromjsonarray, z, getfeaturedcards, setsectionname, false);
    }

    @Override // kotlin.TestSubModel
    public final /* synthetic */ Preference AudioAttributesCompatParcelizer(Preference preference) {
        return MediaBrowserCompatItemReceiver(preference);
    }

    @Override // kotlin.TestSubModel
    public final /* synthetic */ getFilterText AudioAttributesImplBaseParcelizer() {
        return MediaDescriptionCompat();
    }

    @Override // kotlin.TestSubModel
    public final boolean AudioAttributesImplApi26Parcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    @Override // kotlin.TestSubModel
    public final setSectionName IconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    @Override // kotlin.TestSubModel
    public final boolean MediaBrowserCompatItemReceiver() {
        return this.write;
    }

    public isRelatedModule(fromJSONArray fromjsonarray, boolean z, getFeaturedCards getfeaturedcards, setSectionName setsectionname, boolean z2) {
        toMagicModuleMetaRepoModel.write(getfeaturedcards, "");
        toMagicModuleMetaRepoModel.write(setsectionname, "");
        this.AudioAttributesCompatParcelizer = fromjsonarray;
        this.RemoteActionCompatParcelizer = z;
        this.read = getfeaturedcards;
        this.IconCompatParcelizer = setsectionname;
        this.write = z2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.TestSubModel
    /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: merged with bridge method [inline-methods] */
    public getSectionName read() {
        return this.read.IconCompatParcelizer().AudioAttributesCompatParcelizer();
    }

    @Override // kotlin.TestSubModel
    public final boolean MediaBrowserCompatCustomActionResultReceiver() {
        return this.read.IconCompatParcelizer().onAddQueueItem().IconCompatParcelizer();
    }

    @Override // kotlin.TestSubModel
    public final Iterable<dummyEditor> AudioAttributesCompatParcelizer() {
        getQuote getquoteRemoteActionCompatParcelizer;
        fromJSONArray fromjsonarray = this.AudioAttributesCompatParcelizer;
        return (fromjsonarray == null || (getquoteRemoteActionCompatParcelizer = fromjsonarray.RemoteActionCompatParcelizer()) == null) ? IntermediateLoginResponseBody.RemoteActionCompatParcelizer() : getquoteRemoteActionCompatParcelizer;
    }

    @Override // kotlin.TestSubModel
    public final VideoInfoJsonParser RemoteActionCompatParcelizer() {
        return this.read.AudioAttributesCompatParcelizer();
    }

    @Override // kotlin.TestSubModel
    public final boolean write() {
        fromJSONArray fromjsonarray = this.AudioAttributesCompatParcelizer;
        return (fromjsonarray instanceof getMeta) && ((getMeta) fromjsonarray).handleMediaPlayPauseIfPendingOnHandler() != null;
    }

    private static setFilterText MediaDescriptionCompat() {
        return getPlanGroups.RemoteActionCompatParcelizer;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.TestSubModel
    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public boolean RemoteActionCompatParcelizer(dummyEditor dummyeditor, Preference preference) {
        toMagicModuleMetaRepoModel.write(dummyeditor, "");
        if ((dummyeditor instanceof FilterParamsCompanion) && ((FilterParamsCompanion) dummyeditor).MediaBrowserCompatCustomActionResultReceiver()) {
            return true;
        }
        if ((dummyeditor instanceof setMainModel) && !MediaBrowserCompatCustomActionResultReceiver() && (((setMainModel) dummyeditor).AudioAttributesCompatParcelizer() || IconCompatParcelizer() == setSectionName.TYPE_PARAMETER_BOUNDS)) {
            return true;
        }
        if (preference == null || !getTestTabItems.MediaBrowserCompatCustomActionResultReceiver((getLink) preference) || !read().write(dummyeditor)) {
            return false;
        }
        this.read.IconCompatParcelizer().onAddQueueItem();
        return true;
    }

    @Override // kotlin.TestSubModel
    public final Iterable<dummyEditor> read(Preference preference) {
        toMagicModuleMetaRepoModel.write(preference, "");
        return ((getLink) preference).RemoteActionCompatParcelizer();
    }

    private static getLink MediaBrowserCompatItemReceiver(Preference preference) {
        toMagicModuleMetaRepoModel.write(preference, "");
        return setPlanType.RemoteActionCompatParcelizer((getLink) preference);
    }

    @Override // kotlin.TestSubModel
    public final getSlidesCount RemoteActionCompatParcelizer(Preference preference) {
        toMagicModuleMetaRepoModel.write(preference, "");
        CourseConfigV2CustomModuleQuestionSource courseConfigV2CustomModuleQuestionSourceIconCompatParcelizer = setPlanAddOns.IconCompatParcelizer((getLink) preference);
        if (courseConfigV2CustomModuleQuestionSourceIconCompatParcelizer != null) {
            return getAnswerDescription.RemoteActionCompatParcelizer((getVariant) courseConfigV2CustomModuleQuestionSourceIconCompatParcelizer);
        }
        return null;
    }

    @Override // kotlin.TestSubModel
    public final boolean write(Preference preference) {
        toMagicModuleMetaRepoModel.write(preference, "");
        return ((getLink) preference).MediaBrowserCompatMediaItem() instanceof getDurationText;
    }

    @Override // kotlin.TestSubModel
    public final boolean read(Preference preference, Preference preference2) {
        toMagicModuleMetaRepoModel.write(preference, "");
        toMagicModuleMetaRepoModel.write(preference2, "");
        return this.read.IconCompatParcelizer().RatingCompat().IconCompatParcelizer((getLink) preference, (getLink) preference2);
    }

    @Override // kotlin.TestSubModel
    public final boolean IconCompatParcelizer(Preference preference) {
        toMagicModuleMetaRepoModel.write(preference, "");
        return getTestTabItems.AudioAttributesCompatParcelizer((getLink) preference);
    }

    @Override // kotlin.TestSubModel
    public final boolean write(getValueBoolean getvalueboolean) {
        toMagicModuleMetaRepoModel.write(getvalueboolean, "");
        return getvalueboolean instanceof RecentUpdatesModel;
    }
}
