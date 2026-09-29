package kotlin;

import java.util.Iterator;
import kotlin.getQuote;
import kotlin.getZenArea;

/* JADX INFO: loaded from: classes4.dex */
public final class HomeCardModel implements getQuote {
    private final boolean AudioAttributesCompatParcelizer;
    private final getFeaturedCards RemoteActionCompatParcelizer;
    private final SchemaQbankItem<RecentUpdatesReferences, dummyEditor> read;
    private final HomeQbankModel write;

    public /* synthetic */ HomeCardModel(getFeaturedCards getfeaturedcards, HomeQbankModel homeQbankModel) {
        this(getfeaturedcards, homeQbankModel, false);
    }

    public HomeCardModel(getFeaturedCards getfeaturedcards, HomeQbankModel homeQbankModel, boolean z) {
        toMagicModuleMetaRepoModel.write(getfeaturedcards, "");
        toMagicModuleMetaRepoModel.write(homeQbankModel, "");
        this.RemoteActionCompatParcelizer = getfeaturedcards;
        this.write = homeQbankModel;
        this.AudioAttributesCompatParcelizer = z;
        this.read = getfeaturedcards.IconCompatParcelizer().onPlayFromMediaId().IconCompatParcelizer(new write());
    }

    @Override // kotlin.getQuote
    public final boolean AudioAttributesCompatParcelizer(getNotesCount getnotescount) {
        return getQuote.read.write(this, getnotescount);
    }

    static final class write extends MagicModuleUseCase implements getAnswerMap<RecentUpdatesReferences, dummyEditor> {
        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
        public dummyEditor invoke(RecentUpdatesReferences recentUpdatesReferences) {
            toMagicModuleMetaRepoModel.write(recentUpdatesReferences, "");
            getUserInitiatedExamStartedOn getuserinitiatedexamstartedon = getUserInitiatedExamStartedOn.write;
            return getUserInitiatedExamStartedOn.read(recentUpdatesReferences, HomeCardModel.this.RemoteActionCompatParcelizer, HomeCardModel.this.AudioAttributesCompatParcelizer);
        }

        write() {
            super(1);
        }
    }

    @Override // kotlin.getQuote
    public final dummyEditor IconCompatParcelizer(getNotesCount getnotescount) {
        dummyEditor dummyeditorInvoke;
        toMagicModuleMetaRepoModel.write(getnotescount, "");
        RecentUpdatesReferences recentUpdatesReferencesWrite = this.write.write(getnotescount);
        if (recentUpdatesReferencesWrite != null && (dummyeditorInvoke = this.read.invoke(recentUpdatesReferencesWrite)) != null) {
            return dummyeditorInvoke;
        }
        getUserInitiatedExamStartedOn getuserinitiatedexamstartedon = getUserInitiatedExamStartedOn.write;
        return getUserInitiatedExamStartedOn.AudioAttributesCompatParcelizer(getnotescount, this.write, this.RemoteActionCompatParcelizer);
    }

    @Override // java.lang.Iterable
    public final Iterator<dummyEditor> iterator() {
        getTopRankers gettoprankersWrite = StateResult.write(IntermediateLoginResponseBody.AudioAttributesImplBaseParcelizer(this.write.read()), this.read);
        getUserInitiatedExamStartedOn getuserinitiatedexamstartedon = getUserInitiatedExamStartedOn.write;
        return StateResult.AudioAttributesImplApi26Parcelizer(StateResult.IconCompatParcelizer((getTopRankers<? extends dummyEditor>) gettoprankersWrite, getUserInitiatedExamStartedOn.AudioAttributesCompatParcelizer(getZenArea.RemoteActionCompatParcelizer.MediaMetadataCompat, this.write, this.RemoteActionCompatParcelizer))).write();
    }

    @Override // kotlin.getQuote
    public final boolean RemoteActionCompatParcelizer() {
        return this.write.read().isEmpty() && !this.write.IconCompatParcelizer();
    }
}
