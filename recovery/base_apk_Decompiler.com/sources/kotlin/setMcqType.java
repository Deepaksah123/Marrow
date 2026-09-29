package kotlin;

/* JADX INFO: loaded from: classes4.dex */
public final class setMcqType {
    private final String AudioAttributesCompatParcelizer;
    private getNotesCount IconCompatParcelizer;

    public static setMcqType read(String str) {
        if (str == null) {
            IconCompatParcelizer(0);
        }
        return new setMcqType(str);
    }

    public static setMcqType RemoteActionCompatParcelizer(RevisionSubjectStatusModel revisionSubjectStatusModel) {
        if (revisionSubjectStatusModel == null) {
            IconCompatParcelizer(1);
        }
        getNotesCount getnotescountRemoteActionCompatParcelizer = revisionSubjectStatusModel.RemoteActionCompatParcelizer();
        String strReplace = revisionSubjectStatusModel.IconCompatParcelizer().RemoteActionCompatParcelizer().replace('.', '$');
        if (getnotescountRemoteActionCompatParcelizer.read()) {
            return new setMcqType(strReplace);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(getnotescountRemoteActionCompatParcelizer.RemoteActionCompatParcelizer().replace('.', '/'));
        sb.append("/");
        sb.append(strReplace);
        return new setMcqType(sb.toString());
    }

    public static setMcqType read(getNotesCount getnotescount) {
        if (getnotescount == null) {
            IconCompatParcelizer(2);
        }
        setMcqType setmcqtype = new setMcqType(getnotescount.RemoteActionCompatParcelizer().replace('.', '/'));
        setmcqtype.IconCompatParcelizer = getnotescount;
        return setmcqtype;
    }

    private setMcqType(String str) {
        if (str == null) {
            IconCompatParcelizer(5);
        }
        this.AudioAttributesCompatParcelizer = str;
    }

    public final getNotesCount RemoteActionCompatParcelizer() {
        return new getNotesCount(this.AudioAttributesCompatParcelizer.replace('/', '.'));
    }

    public final getNotesCount read() {
        int iLastIndexOf = this.AudioAttributesCompatParcelizer.lastIndexOf("/");
        if (iLastIndexOf == -1) {
            getNotesCount getnotescount = getNotesCount.read;
            if (getnotescount == null) {
                IconCompatParcelizer(7);
            }
            return getnotescount;
        }
        return new getNotesCount(this.AudioAttributesCompatParcelizer.substring(0, iLastIndexOf).replace('/', '.'));
    }

    public final String AudioAttributesCompatParcelizer() {
        String str = this.AudioAttributesCompatParcelizer;
        if (str == null) {
            IconCompatParcelizer(8);
        }
        return str;
    }

    public final String toString() {
        return this.AudioAttributesCompatParcelizer;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.AudioAttributesCompatParcelizer.equals(((setMcqType) obj).AudioAttributesCompatParcelizer);
    }

    public final int hashCode() {
        return this.AudioAttributesCompatParcelizer.hashCode();
    }

    private static /* synthetic */ void IconCompatParcelizer(int i) {
        String str = (i == 3 || i == 6 || i == 7 || i == 8) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 3 || i == 6 || i == 7 || i == 8) ? 2 : 3];
        switch (i) {
            case 1:
                objArr[0] = "classId";
                break;
            case 2:
            case 4:
                objArr[0] = "fqName";
                break;
            case 3:
            case 6:
            case 7:
            case 8:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/jvm/JvmClassName";
                break;
            case 5:
            default:
                objArr[0] = "internalName";
                break;
        }
        if (i == 3) {
            objArr[1] = "byFqNameWithoutInnerClasses";
        } else if (i == 6) {
            objArr[1] = "getFqNameForClassNameWithoutDollars";
        } else if (i == 7) {
            objArr[1] = "getPackageFqName";
        } else if (i != 8) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/jvm/JvmClassName";
        } else {
            objArr[1] = "getInternalName";
        }
        switch (i) {
            case 1:
                objArr[2] = "byClassId";
                break;
            case 2:
            case 4:
                objArr[2] = "byFqNameWithoutInnerClasses";
                break;
            case 3:
            case 6:
            case 7:
            case 8:
                break;
            case 5:
                objArr[2] = "<init>";
                break;
            default:
                objArr[2] = "byInternalName";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i != 3 && i != 6 && i != 7 && i != 8) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }
}
