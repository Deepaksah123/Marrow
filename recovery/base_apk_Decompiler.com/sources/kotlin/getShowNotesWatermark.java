package kotlin;

import java.util.Set;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r4v0 o.getShowNotesWatermark, still in use, count: 1, list:
  (r4v0 o.getShowNotesWatermark) from 0x006b: FILLED_NEW_ARRAY 
  (r4v0 o.getShowNotesWatermark)
  (r5v0 o.getShowNotesWatermark)
  (r6v0 o.getShowNotesWatermark)
  (r7v0 o.getShowNotesWatermark)
  (r8v0 o.getShowNotesWatermark)
  (r9v0 o.getShowNotesWatermark)
  (r10v0 o.getShowNotesWatermark)
 A[WRAPPED] (LINE:32) elemType: o.getShowNotesWatermark
	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:99)
	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:98)
	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:252)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:180)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes4.dex */
public final class getShowNotesWatermark {
    BOOLEAN("Boolean"),
    CHAR("Char"),
    BYTE("Byte"),
    SHORT("Short"),
    INT("Int"),
    FLOAT("Float"),
    LONG("Long"),
    DOUBLE("Double");

    public static final Set<getShowNotesWatermark> MediaBrowserCompatCustomActionResultReceiver;
    private final getRelatedLessonId MediaBrowserCompatMediaItem;
    private final RenewEligible MediaBrowserCompatSearchResultReceiver;
    private final getRelatedLessonId MediaDescriptionCompat;
    private final RenewEligible RatingCompat;

    private getShowNotesWatermark(String str) {
        getRelatedLessonId getrelatedlessonidRemoteActionCompatParcelizer = getRelatedLessonId.RemoteActionCompatParcelizer(str);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(getrelatedlessonidRemoteActionCompatParcelizer, "");
        this.MediaDescriptionCompat = getrelatedlessonidRemoteActionCompatParcelizer;
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("Array");
        getRelatedLessonId getrelatedlessonidRemoteActionCompatParcelizer2 = getRelatedLessonId.RemoteActionCompatParcelizer(sb.toString());
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(getrelatedlessonidRemoteActionCompatParcelizer2, "");
        this.MediaBrowserCompatMediaItem = getrelatedlessonidRemoteActionCompatParcelizer2;
        this.RatingCompat = getRenewExpiresOn.write(RenewEligibleCompanion.write, new write());
        this.MediaBrowserCompatSearchResultReceiver = getRenewExpiresOn.write(RenewEligibleCompanion.write, new read());
    }

    static {
        new RemoteActionCompatParcelizer((byte) 0);
        MediaBrowserCompatCustomActionResultReceiver = getKycMessage.IconCompatParcelizer(new getShowNotesWatermark("Char"), new getShowNotesWatermark("Byte"), new getShowNotesWatermark("Short"), new getShowNotesWatermark("Int"), new getShowNotesWatermark("Float"), new getShowNotesWatermark("Long"), new getShowNotesWatermark("Double"));
    }

    public final getRelatedLessonId write() {
        return this.MediaDescriptionCompat;
    }

    public final getRelatedLessonId read() {
        return this.MediaBrowserCompatMediaItem;
    }

    static final class write extends MagicModuleUseCase implements getCreatedOnDateMs<getNotesCount> {
        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
        public getNotesCount invoke() {
            getNotesCount getnotescountWrite = getZenArea.IconCompatParcelizer.write(getShowNotesWatermark.this.write());
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(getnotescountWrite, "");
            return getnotescountWrite;
        }

        write() {
            super(0);
        }
    }

    public final getNotesCount AudioAttributesCompatParcelizer() {
        return (getNotesCount) this.RatingCompat.RemoteActionCompatParcelizer();
    }

    static final class read extends MagicModuleUseCase implements getCreatedOnDateMs<getNotesCount> {
        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public getNotesCount invoke() {
            getNotesCount getnotescountWrite = getZenArea.IconCompatParcelizer.write(getShowNotesWatermark.this.read());
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(getnotescountWrite, "");
            return getnotescountWrite;
        }

        read() {
            super(0);
        }
    }

    public final getNotesCount RemoteActionCompatParcelizer() {
        return (getNotesCount) this.MediaBrowserCompatSearchResultReceiver.RemoteActionCompatParcelizer();
    }

    public static final class RemoteActionCompatParcelizer {
        private RemoteActionCompatParcelizer() {
        }

        public /* synthetic */ RemoteActionCompatParcelizer(byte b) {
            this();
        }
    }

    public static getShowNotesWatermark valueOf(String str) {
        return (getShowNotesWatermark) Enum.valueOf(getShowNotesWatermark.class, str);
    }

    public static getShowNotesWatermark[] values() {
        return (getShowNotesWatermark[]) AudioAttributesImplBaseParcelizer.clone();
    }
}
