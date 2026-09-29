package kotlin;

/* JADX INFO: loaded from: classes4.dex */
public final class VideoInfoMini {
    private static final RevisionSubjectStatusModel IconCompatParcelizer;
    public static final getNotesCount RemoteActionCompatParcelizer;
    public static final VideoInfoMini read = new VideoInfoMini();

    private VideoInfoMini() {
    }

    static {
        getNotesCount getnotescount = new getNotesCount("kotlin.jvm.JvmField");
        RemoteActionCompatParcelizer = getnotescount;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(RevisionSubjectStatusModel.RemoteActionCompatParcelizer(getnotescount), "");
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(RevisionSubjectStatusModel.RemoteActionCompatParcelizer(new getNotesCount("kotlin.reflect.jvm.internal.ReflectionFactoryImpl")), "");
        RevisionSubjectStatusModel revisionSubjectStatusModelIconCompatParcelizer = RevisionSubjectStatusModel.IconCompatParcelizer("kotlin/jvm/internal/RepeatableContainer");
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(revisionSubjectStatusModelIconCompatParcelizer, "");
        IconCompatParcelizer = revisionSubjectStatusModelIconCompatParcelizer;
    }

    public static RevisionSubjectStatusModel IconCompatParcelizer() {
        return IconCompatParcelizer;
    }

    @getMagicModuleMeta
    public static final boolean read(String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        return TestGroupLSModel.MediaBrowserCompatCustomActionResultReceiver(str, "get") || TestGroupLSModel.MediaBrowserCompatCustomActionResultReceiver(str, "is");
    }

    @getMagicModuleMeta
    public static final boolean RemoteActionCompatParcelizer(String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        return TestGroupLSModel.MediaBrowserCompatCustomActionResultReceiver(str, "set");
    }

    @getMagicModuleMeta
    public static final String write(String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        if (IconCompatParcelizer(str)) {
            return str;
        }
        StringBuilder sb = new StringBuilder("get");
        sb.append(SubjectIntroSkip.write(str));
        return sb.toString();
    }

    @getMagicModuleMeta
    public static final String AudioAttributesCompatParcelizer(String str) {
        String strWrite;
        toMagicModuleMetaRepoModel.write(str, "");
        StringBuilder sb = new StringBuilder("set");
        if (IconCompatParcelizer(str)) {
            strWrite = str.substring(2);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(strWrite, "");
        } else {
            strWrite = SubjectIntroSkip.write(str);
        }
        sb.append(strWrite);
        return sb.toString();
    }

    @getMagicModuleMeta
    private static boolean IconCompatParcelizer(String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        if (!TestGroupLSModel.MediaBrowserCompatCustomActionResultReceiver(str, "is") || str.length() == 2) {
            return false;
        }
        char cCharAt = str.charAt(2);
        return toMagicModuleMetaRepoModel.read(97, (int) cCharAt) > 0 || toMagicModuleMetaRepoModel.read((int) cCharAt, 122) > 0;
    }
}
