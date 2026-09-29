package kotlin;

/* JADX INFO: loaded from: classes4.dex */
public abstract class toMap extends FeaturedCardLabel {
    private final boolean AudioAttributesCompatParcelizer;
    private final getVariant read;
    private final getIntroDurationSeconds write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public toMap(getMini getmini, getVariant getvariant, getRelatedLessonId getrelatedlessonid, getIntroDurationSeconds getintrodurationseconds, boolean z) {
        super(getmini, getrelatedlessonid);
        if (getmini == null) {
            write(0);
        }
        if (getvariant == null) {
            write(1);
        }
        if (getrelatedlessonid == null) {
            write(2);
        }
        if (getintrodurationseconds == null) {
            write(3);
        }
        this.read = getvariant;
        this.write = getintrodurationseconds;
        this.AudioAttributesCompatParcelizer = false;
    }

    public boolean onMediaButtonEvent() {
        return this.AudioAttributesCompatParcelizer;
    }

    @Override // kotlin.CourseConfigV2CustomModuleQuestionSource, kotlin.CourseConfigV2NavDrawerItemAboutUs, kotlin.getVariant
    public final getVariant AudioAttributesImplApi21Parcelizer() {
        getVariant getvariant = this.read;
        if (getvariant == null) {
            write(4);
        }
        return getvariant;
    }

    @Override // kotlin.CourseConfigV2HomePageItems
    public final getIntroDurationSeconds RatingCompat() {
        getIntroDurationSeconds getintrodurationseconds = this.write;
        if (getintrodurationseconds == null) {
            write(5);
        }
        return getintrodurationseconds;
    }

    private static /* synthetic */ void write(int i) {
        String str = (i == 4 || i == 5) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 4 || i == 5) ? 2 : 3];
        if (i == 1) {
            objArr[0] = "containingDeclaration";
        } else if (i == 2) {
            objArr[0] = "name";
        } else if (i == 3) {
            objArr[0] = "source";
        } else if (i == 4 || i == 5) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ClassDescriptorBase";
        } else {
            objArr[0] = "storageManager";
        }
        if (i == 4) {
            objArr[1] = "getContainingDeclaration";
        } else if (i != 5) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ClassDescriptorBase";
        } else {
            objArr[1] = "getSource";
        }
        if (i != 4 && i != 5) {
            objArr[2] = "<init>";
        }
        String str2 = String.format(str, objArr);
        if (i != 4 && i != 5) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }
}
