package kotlin;

/* JADX INFO: loaded from: classes.dex */
public abstract class PresenterBundle extends getBooleanMap implements CourseConfigV2NavDrawerItemAboutUs {
    private final getVariant AudioAttributesCompatParcelizer;
    private final getIntroDurationSeconds IconCompatParcelizer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    protected PresenterBundle(getVariant getvariant, getQuote getquote, getRelatedLessonId getrelatedlessonid, getIntroDurationSeconds getintrodurationseconds) {
        super(getquote, getrelatedlessonid);
        if (getvariant == null) {
            IconCompatParcelizer(0);
        }
        if (getquote == null) {
            IconCompatParcelizer(1);
        }
        if (getrelatedlessonid == null) {
            IconCompatParcelizer(2);
        }
        if (getintrodurationseconds == null) {
            IconCompatParcelizer(3);
        }
        this.AudioAttributesCompatParcelizer = getvariant;
        this.IconCompatParcelizer = getintrodurationseconds;
    }

    @Override // kotlin.getBooleanMap, kotlin.getVariant
    /* JADX INFO: renamed from: MediaMetadataCompat, reason: merged with bridge method [inline-methods] */
    public CourseConfigV2HomePageItems aS_() {
        CourseConfigV2HomePageItems courseConfigV2HomePageItems = (CourseConfigV2HomePageItems) super.aS_();
        if (courseConfigV2HomePageItems == null) {
            IconCompatParcelizer(4);
        }
        return courseConfigV2HomePageItems;
    }

    public getVariant AudioAttributesImplApi21Parcelizer() {
        getVariant getvariant = this.AudioAttributesCompatParcelizer;
        if (getvariant == null) {
            IconCompatParcelizer(5);
        }
        return getvariant;
    }

    @Override // kotlin.CourseConfigV2HomePageItems
    public getIntroDurationSeconds RatingCompat() {
        getIntroDurationSeconds getintrodurationseconds = this.IconCompatParcelizer;
        if (getintrodurationseconds == null) {
            IconCompatParcelizer(6);
        }
        return getintrodurationseconds;
    }

    private static /* synthetic */ void IconCompatParcelizer(int i) {
        String str = (i == 4 || i == 5 || i == 6) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 4 || i == 5 || i == 6) ? 2 : 3];
        switch (i) {
            case 1:
                objArr[0] = "annotations";
                break;
            case 2:
                objArr[0] = "name";
                break;
            case 3:
                objArr[0] = "source";
                break;
            case 4:
            case 5:
            case 6:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/DeclarationDescriptorNonRootImpl";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        if (i == 4) {
            objArr[1] = "getOriginal";
        } else if (i == 5) {
            objArr[1] = "getContainingDeclaration";
        } else if (i != 6) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/DeclarationDescriptorNonRootImpl";
        } else {
            objArr[1] = "getSource";
        }
        if (i != 4 && i != 5 && i != 6) {
            objArr[2] = "<init>";
        }
        String str2 = String.format(str, objArr);
        if (i != 4 && i != 5 && i != 6) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }
}
