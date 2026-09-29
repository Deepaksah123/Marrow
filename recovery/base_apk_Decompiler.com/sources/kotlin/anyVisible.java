package kotlin;

import kotlin.anyIgnorals;

/* JADX INFO: loaded from: classes2.dex */
public final class anyVisible implements findAccess {
    private final findAccess AudioAttributesCompatParcelizer;
    private final addGetter read;

    public final /* synthetic */ class IconCompatParcelizer {
        public static final /* synthetic */ int[] IconCompatParcelizer;

        static {
            int[] iArr = new int[anyIgnorals.read.values().length];
            try {
                iArr[anyIgnorals.read.ON_CREATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[anyIgnorals.read.ON_START.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[anyIgnorals.read.ON_RESUME.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[anyIgnorals.read.ON_PAUSE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[anyIgnorals.read.ON_STOP.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[anyIgnorals.read.ON_DESTROY.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[anyIgnorals.read.ON_ANY.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            IconCompatParcelizer = iArr;
        }
    }

    public anyVisible(addGetter addgetter, findAccess findaccess) {
        toMagicModuleMetaRepoModel.write(addgetter, "");
        this.read = addgetter;
        this.AudioAttributesCompatParcelizer = findaccess;
    }

    @Override // kotlin.findAccess
    public final void read(hasGetter hasgetter, anyIgnorals.read readVar) {
        toMagicModuleMetaRepoModel.write(hasgetter, "");
        toMagicModuleMetaRepoModel.write(readVar, "");
        switch (IconCompatParcelizer.IconCompatParcelizer[readVar.ordinal()]) {
            case 1:
                this.read.write(hasgetter);
                break;
            case 2:
                this.read.IconCompatParcelizer(hasgetter);
                break;
            case 3:
                this.read.read(hasgetter);
                break;
            case 4:
                this.read.AudioAttributesImplBaseParcelizer(hasgetter);
                break;
            case 5:
                this.read.RemoteActionCompatParcelizer(hasgetter);
                break;
            case 6:
                this.read.AudioAttributesCompatParcelizer(hasgetter);
                break;
            case 7:
                throw new IllegalArgumentException("ON_ANY must not been send by anybody");
            default:
                throw new RenewEligibleCreator();
        }
        findAccess findaccess = this.AudioAttributesCompatParcelizer;
        if (findaccess != null) {
            findaccess.read(hasgetter, readVar);
        }
    }
}
