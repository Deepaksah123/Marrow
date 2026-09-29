package kotlin;

/* JADX INFO: loaded from: classes4.dex */
public final class isIndividualPlan extends isPlanContainsAnyVideo {
    private final getLink AudioAttributesCompatParcelizer;
    private final getTotalSubject write;

    @Override // kotlin.setDefault
    public final boolean write() {
        return false;
    }

    public isIndividualPlan(getTotalSubject gettotalsubject, getLink getlink) {
        if (gettotalsubject == null) {
            read(0);
        }
        if (getlink == null) {
            read(1);
        }
        this.write = gettotalsubject;
        this.AudioAttributesCompatParcelizer = getlink;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public isIndividualPlan(getLink getlink) {
        this(getTotalSubject.INVARIANT, getlink);
        if (getlink == null) {
            read(2);
        }
    }

    @Override // kotlin.setDefault
    public final getTotalSubject read() {
        getTotalSubject gettotalsubject = this.write;
        if (gettotalsubject == null) {
            read(4);
        }
        return gettotalsubject;
    }

    @Override // kotlin.setDefault
    public final getLink AudioAttributesCompatParcelizer() {
        getLink getlink = this.AudioAttributesCompatParcelizer;
        if (getlink == null) {
            read(5);
        }
        return getlink;
    }

    @Override // kotlin.setDefault
    public final setDefault IconCompatParcelizer(getCheapestPlan getcheapestplan) {
        if (getcheapestplan == null) {
            read(6);
        }
        return new isIndividualPlan(this.write, getcheapestplan.read(this.AudioAttributesCompatParcelizer));
    }

    private static /* synthetic */ void read(int i) {
        String str = (i == 4 || i == 5) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 4 || i == 5) ? 2 : 3];
        switch (i) {
            case 1:
            case 2:
            case 3:
                objArr[0] = "type";
                break;
            case 4:
            case 5:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/types/TypeProjectionImpl";
                break;
            case 6:
                objArr[0] = "kotlinTypeRefiner";
                break;
            default:
                objArr[0] = "projection";
                break;
        }
        if (i == 4) {
            objArr[1] = "getProjectionKind";
        } else if (i != 5) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/types/TypeProjectionImpl";
        } else {
            objArr[1] = "getType";
        }
        if (i == 3) {
            objArr[2] = "replaceType";
        } else if (i != 4 && i != 5) {
            if (i != 6) {
                objArr[2] = "<init>";
            } else {
                objArr[2] = "refine";
            }
        }
        String str2 = String.format(str, objArr);
        if (i != 4 && i != 5) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }
}
