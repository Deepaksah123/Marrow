package kotlin;

/* JADX INFO: loaded from: classes4.dex */
public final class ReviewFilter {

    public final /* synthetic */ class AudioAttributesCompatParcelizer {
        public static final /* synthetic */ int[] RemoteActionCompatParcelizer;

        static {
            int[] iArr = new int[getTotalSubject.values().length];
            try {
                iArr[getTotalSubject.INVARIANT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[getTotalSubject.IN_VARIANCE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[getTotalSubject.OUT_VARIANCE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            RemoteActionCompatParcelizer = iArr;
        }
    }

    public static final getItemTitle AudioAttributesCompatParcelizer(getTotalSubject gettotalsubject) {
        toMagicModuleMetaRepoModel.write(gettotalsubject, "");
        int i = AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer[gettotalsubject.ordinal()];
        if (i == 1) {
            return getItemTitle.INV;
        }
        if (i == 2) {
            return getItemTitle.IN;
        }
        if (i == 3) {
            return getItemTitle.OUT;
        }
        throw new RenewEligibleCreator();
    }
}
