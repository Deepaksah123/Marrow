package kotlin;

import com.google.android.gms.measurement.api.AppMeasurementSdk;

/* JADX INFO: loaded from: classes4.dex */
public final class getCorrectnessScore extends setUploaded {
    private getStartIndex AudioAttributesCompatParcelizer;
    private final getVariant IconCompatParcelizer;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public getCorrectnessScore(getVariant getvariant, getStartIndex getstartindex, getQuote getquote) {
        this(getvariant, getstartindex, getquote, getVideoMetaEncrypt.MediaBrowserCompatCustomActionResultReceiver);
        if (getvariant == null) {
            write(0);
        }
        if (getquote == null) {
            write(2);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public getCorrectnessScore(getVariant getvariant, getStartIndex getstartindex, getQuote getquote, getRelatedLessonId getrelatedlessonid) {
        super(getquote, getrelatedlessonid);
        if (getvariant == null) {
            write(3);
        }
        if (getstartindex == null) {
            write(4);
        }
        if (getquote == null) {
            write(5);
        }
        if (getrelatedlessonid == null) {
            write(6);
        }
        this.IconCompatParcelizer = getvariant;
        this.AudioAttributesCompatParcelizer = getstartindex;
    }

    @Override // kotlin.CourseConfigV2TestTabItem
    public final getStartIndex IconCompatParcelizer() {
        getStartIndex getstartindex = this.AudioAttributesCompatParcelizer;
        if (getstartindex == null) {
            write(7);
        }
        return getstartindex;
    }

    @Override // kotlin.getVariant
    public final getVariant AudioAttributesImplApi21Parcelizer() {
        getVariant getvariant = this.IconCompatParcelizer;
        if (getvariant == null) {
            write(8);
        }
        return getvariant;
    }

    private static /* synthetic */ void write(int i) {
        String str = (i == 7 || i == 8) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 7 || i == 8) ? 2 : 3];
        switch (i) {
            case 1:
            case 4:
                objArr[0] = AppMeasurementSdk.ConditionalUserProperty.VALUE;
                break;
            case 2:
            case 5:
                objArr[0] = "annotations";
                break;
            case 3:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case 6:
                objArr[0] = "name";
                break;
            case 7:
            case 8:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ReceiverParameterDescriptorImpl";
                break;
            case 9:
                objArr[0] = "newOwner";
                break;
            case 10:
                objArr[0] = "outType";
                break;
        }
        if (i == 7) {
            objArr[1] = "getValue";
        } else if (i != 8) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ReceiverParameterDescriptorImpl";
        } else {
            objArr[1] = "getContainingDeclaration";
        }
        switch (i) {
            case 7:
            case 8:
                break;
            case 9:
                objArr[2] = "copy";
                break;
            case 10:
                objArr[2] = "setOutType";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i != 7 && i != 8) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }
}
