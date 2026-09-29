package kotlin;

/* JADX INFO: loaded from: classes4.dex */
public abstract class isUploaded extends AbstractC0174getFilename {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public isUploaded(getMini getmini, getVariant getvariant, getQuote getquote, getRelatedLessonId getrelatedlessonid, getTotalSubject gettotalsubject, boolean z, int i, getIntroDurationSeconds getintrodurationseconds, CourseConfigV2VideoSubjectPageItem courseConfigV2VideoSubjectPageItem) {
        super(getmini, getvariant, getquote, getrelatedlessonid, gettotalsubject, z, i, getintrodurationseconds, courseConfigV2VideoSubjectPageItem);
        if (getmini == null) {
            AudioAttributesCompatParcelizer(0);
        }
        if (getvariant == null) {
            AudioAttributesCompatParcelizer(1);
        }
        if (getquote == null) {
            AudioAttributesCompatParcelizer(2);
        }
        if (getrelatedlessonid == null) {
            AudioAttributesCompatParcelizer(3);
        }
        if (gettotalsubject == null) {
            AudioAttributesCompatParcelizer(4);
        }
        if (getintrodurationseconds == null) {
            AudioAttributesCompatParcelizer(5);
        }
        if (courseConfigV2VideoSubjectPageItem == null) {
            AudioAttributesCompatParcelizer(6);
        }
    }

    @Override // kotlin.getBooleanMap
    public String toString() {
        String string = "";
        String str = aZ_() ? "reified " : "";
        if (MediaBrowserCompatMediaItem() != getTotalSubject.INVARIANT) {
            StringBuilder sb = new StringBuilder();
            sb.append(MediaBrowserCompatMediaItem());
            sb.append(" ");
            string = sb.toString();
        }
        return String.format("%s%s%s", str, string, aQ_());
    }

    private static /* synthetic */ void AudioAttributesCompatParcelizer(int i) {
        Object[] objArr = new Object[3];
        switch (i) {
            case 1:
                objArr[0] = "containingDeclaration";
                break;
            case 2:
                objArr[0] = "annotations";
                break;
            case 3:
                objArr[0] = "name";
                break;
            case 4:
                objArr[0] = "variance";
                break;
            case 5:
                objArr[0] = "source";
                break;
            case 6:
                objArr[0] = "supertypeLoopChecker";
                break;
            default:
                objArr[0] = "storageManager";
                break;
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractLazyTypeParameterDescriptor";
        objArr[2] = "<init>";
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }
}
