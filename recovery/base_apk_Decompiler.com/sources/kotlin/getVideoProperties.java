package kotlin;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'AudioAttributesCompatParcelizer' uses external variables
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
public final class getVideoProperties {
    public static final getVideoProperties AudioAttributesCompatParcelizer;
    public static final getVideoProperties IconCompatParcelizer;
    private static final /* synthetic */ getVideoProperties[] RemoteActionCompatParcelizer;
    public static final getVideoProperties read;
    public static final getVideoProperties write;
    private final RevisionSubjectStatusModel AudioAttributesImplApi21Parcelizer;
    private final getRelatedLessonId MediaBrowserCompatCustomActionResultReceiver;

    private getVideoProperties(String str, int i, RevisionSubjectStatusModel revisionSubjectStatusModel) {
        this.AudioAttributesImplApi21Parcelizer = revisionSubjectStatusModel;
        getRelatedLessonId getrelatedlessonidAudioAttributesImplApi26Parcelizer = revisionSubjectStatusModel.AudioAttributesImplApi26Parcelizer();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(getrelatedlessonidAudioAttributesImplApi26Parcelizer, "");
        this.MediaBrowserCompatCustomActionResultReceiver = getrelatedlessonidAudioAttributesImplApi26Parcelizer;
    }

    static {
        RevisionSubjectStatusModel revisionSubjectStatusModelIconCompatParcelizer = RevisionSubjectStatusModel.IconCompatParcelizer("kotlin/UByteArray");
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(revisionSubjectStatusModelIconCompatParcelizer, "");
        AudioAttributesCompatParcelizer = new getVideoProperties("UBYTEARRAY", 0, revisionSubjectStatusModelIconCompatParcelizer);
        RevisionSubjectStatusModel revisionSubjectStatusModelIconCompatParcelizer2 = RevisionSubjectStatusModel.IconCompatParcelizer("kotlin/UShortArray");
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(revisionSubjectStatusModelIconCompatParcelizer2, "");
        read = new getVideoProperties("USHORTARRAY", 1, revisionSubjectStatusModelIconCompatParcelizer2);
        RevisionSubjectStatusModel revisionSubjectStatusModelIconCompatParcelizer3 = RevisionSubjectStatusModel.IconCompatParcelizer("kotlin/UIntArray");
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(revisionSubjectStatusModelIconCompatParcelizer3, "");
        write = new getVideoProperties("UINTARRAY", 2, revisionSubjectStatusModelIconCompatParcelizer3);
        RevisionSubjectStatusModel revisionSubjectStatusModelIconCompatParcelizer4 = RevisionSubjectStatusModel.IconCompatParcelizer("kotlin/ULongArray");
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(revisionSubjectStatusModelIconCompatParcelizer4, "");
        IconCompatParcelizer = new getVideoProperties("ULONGARRAY", 3, revisionSubjectStatusModelIconCompatParcelizer4);
        RemoteActionCompatParcelizer = read();
    }

    public final getRelatedLessonId IconCompatParcelizer() {
        return this.MediaBrowserCompatCustomActionResultReceiver;
    }

    private static final /* synthetic */ getVideoProperties[] read() {
        return new getVideoProperties[]{AudioAttributesCompatParcelizer, read, write, IconCompatParcelizer};
    }

    public static getVideoProperties valueOf(String str) {
        return (getVideoProperties) Enum.valueOf(getVideoProperties.class, str);
    }

    public static getVideoProperties[] values() {
        return (getVideoProperties[]) RemoteActionCompatParcelizer.clone();
    }
}
