package kotlin;

/* JADX INFO: loaded from: classes.dex */
public abstract class getBooleanMap extends hasInfo implements getVariant {
    private final getRelatedLessonId IconCompatParcelizer;

    public getVariant aS_() {
        return this;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public getBooleanMap(getQuote getquote, getRelatedLessonId getrelatedlessonid) {
        super(getquote);
        if (getquote == null) {
            write(0);
        }
        if (getrelatedlessonid == null) {
            write(1);
        }
        this.IconCompatParcelizer = getrelatedlessonid;
    }

    @Override // kotlin.getEmptyBuyPlanText
    public final getRelatedLessonId aQ_() {
        getRelatedLessonId getrelatedlessonid = this.IconCompatParcelizer;
        if (getrelatedlessonid == null) {
            write(2);
        }
        return getrelatedlessonid;
    }

    public String toString() {
        return IconCompatParcelizer(this);
    }

    public static String IconCompatParcelizer(getVariant getvariant) {
        try {
            StringBuilder sb = new StringBuilder();
            sb.append(setGuessed.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(getvariant));
            sb.append("[");
            sb.append(getvariant.getClass().getSimpleName());
            sb.append("@");
            sb.append(Integer.toHexString(System.identityHashCode(getvariant)));
            sb.append("]");
            String string = sb.toString();
            if (string == null) {
                write(5);
            }
            return string;
        } catch (Throwable unused) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(getvariant.getClass().getSimpleName());
            sb2.append(" ");
            sb2.append(getvariant.aQ_());
            String string2 = sb2.toString();
            if (string2 == null) {
                write(6);
            }
            return string2;
        }
    }

    private static /* synthetic */ void write(int i) {
        String str = (i == 2 || i == 3 || i == 5 || i == 6) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 2 || i == 3 || i == 5 || i == 6) ? 2 : 3];
        switch (i) {
            case 1:
                objArr[0] = "name";
                break;
            case 2:
            case 3:
            case 5:
            case 6:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/DeclarationDescriptorImpl";
                break;
            case 4:
                objArr[0] = "descriptor";
                break;
            default:
                objArr[0] = "annotations";
                break;
        }
        if (i == 2) {
            objArr[1] = "getName";
        } else if (i == 3) {
            objArr[1] = "getOriginal";
        } else if (i == 5 || i == 6) {
            objArr[1] = "toString";
        } else {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/DeclarationDescriptorImpl";
        }
        if (i != 2 && i != 3) {
            if (i == 4) {
                objArr[2] = "toString";
            } else if (i != 5 && i != 6) {
                objArr[2] = "<init>";
            }
        }
        String str2 = String.format(str, objArr);
        if (i != 2 && i != 3 && i != 5 && i != 6) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }
}
