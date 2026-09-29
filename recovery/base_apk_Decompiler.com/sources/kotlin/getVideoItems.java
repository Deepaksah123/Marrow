package kotlin;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'RemoteActionCompatParcelizer' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByField(EnumVisitor.java:372)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:337)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:322)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInvoke(EnumVisitor.java:293)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:266)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes4.dex */
public final class getVideoItems {
    private static getVideoItems AudioAttributesCompatParcelizer;
    private static getVideoItems IconCompatParcelizer;
    private static getVideoItems RemoteActionCompatParcelizer;
    private static getVideoItems read;
    private static final /* synthetic */ getVideoItems[] write;
    private final RevisionSubjectStatusModel AudioAttributesImplApi21Parcelizer;
    private final RevisionSubjectStatusModel AudioAttributesImplApi26Parcelizer;
    private final getRelatedLessonId MediaBrowserCompatItemReceiver;

    private getVideoItems(String str, int i, RevisionSubjectStatusModel revisionSubjectStatusModel) {
        this.AudioAttributesImplApi26Parcelizer = revisionSubjectStatusModel;
        getRelatedLessonId getrelatedlessonidAudioAttributesImplApi26Parcelizer = revisionSubjectStatusModel.AudioAttributesImplApi26Parcelizer();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(getrelatedlessonidAudioAttributesImplApi26Parcelizer, "");
        this.MediaBrowserCompatItemReceiver = getrelatedlessonidAudioAttributesImplApi26Parcelizer;
        getNotesCount getnotescountRemoteActionCompatParcelizer = revisionSubjectStatusModel.RemoteActionCompatParcelizer();
        StringBuilder sb = new StringBuilder();
        sb.append(getrelatedlessonidAudioAttributesImplApi26Parcelizer.AudioAttributesCompatParcelizer());
        sb.append("Array");
        this.AudioAttributesImplApi21Parcelizer = new RevisionSubjectStatusModel(getnotescountRemoteActionCompatParcelizer, getRelatedLessonId.RemoteActionCompatParcelizer(sb.toString()));
    }

    public final RevisionSubjectStatusModel write() {
        return this.AudioAttributesImplApi26Parcelizer;
    }

    static {
        RevisionSubjectStatusModel revisionSubjectStatusModelIconCompatParcelizer = RevisionSubjectStatusModel.IconCompatParcelizer("kotlin/UByte");
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(revisionSubjectStatusModelIconCompatParcelizer, "");
        RemoteActionCompatParcelizer = new getVideoItems("UBYTE", 0, revisionSubjectStatusModelIconCompatParcelizer);
        RevisionSubjectStatusModel revisionSubjectStatusModelIconCompatParcelizer2 = RevisionSubjectStatusModel.IconCompatParcelizer("kotlin/UShort");
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(revisionSubjectStatusModelIconCompatParcelizer2, "");
        read = new getVideoItems("USHORT", 1, revisionSubjectStatusModelIconCompatParcelizer2);
        RevisionSubjectStatusModel revisionSubjectStatusModelIconCompatParcelizer3 = RevisionSubjectStatusModel.IconCompatParcelizer("kotlin/UInt");
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(revisionSubjectStatusModelIconCompatParcelizer3, "");
        IconCompatParcelizer = new getVideoItems("UINT", 2, revisionSubjectStatusModelIconCompatParcelizer3);
        RevisionSubjectStatusModel revisionSubjectStatusModelIconCompatParcelizer4 = RevisionSubjectStatusModel.IconCompatParcelizer("kotlin/ULong");
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(revisionSubjectStatusModelIconCompatParcelizer4, "");
        AudioAttributesCompatParcelizer = new getVideoItems("ULONG", 3, revisionSubjectStatusModelIconCompatParcelizer4);
        write = IconCompatParcelizer();
    }

    public final getRelatedLessonId AudioAttributesCompatParcelizer() {
        return this.MediaBrowserCompatItemReceiver;
    }

    public final RevisionSubjectStatusModel RemoteActionCompatParcelizer() {
        return this.AudioAttributesImplApi21Parcelizer;
    }

    private static final /* synthetic */ getVideoItems[] IconCompatParcelizer() {
        return new getVideoItems[]{RemoteActionCompatParcelizer, read, IconCompatParcelizer, AudioAttributesCompatParcelizer};
    }

    public static getVideoItems valueOf(String str) {
        return (getVideoItems) Enum.valueOf(getVideoItems.class, str);
    }

    public static getVideoItems[] values() {
        return (getVideoItems[]) write.clone();
    }
}
