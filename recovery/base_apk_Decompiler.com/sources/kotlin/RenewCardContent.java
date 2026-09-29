package kotlin;

/* JADX INFO: loaded from: classes.dex */
public class RenewCardContent {

    /* JADX INFO: loaded from: classes4.dex */
    public static final /* synthetic */ class read {
        public static final /* synthetic */ int[] IconCompatParcelizer;

        static {
            int[] iArr = new int[RenewEligibleCompanion.values().length];
            try {
                iArr[RenewEligibleCompanion.RemoteActionCompatParcelizer.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[RenewEligibleCompanion.write.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[RenewEligibleCompanion.read.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            IconCompatParcelizer = iArr;
        }
    }

    public static final <T> RenewEligible<T> RemoteActionCompatParcelizer(getCreatedOnDateMs<? extends T> getcreatedondatems) {
        toMagicModuleMetaRepoModel.write(getcreatedondatems, "");
        MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0 = null;
        return new SynchronizedLazyImpl(getcreatedondatems, magicModuleRepositoryImplExternalSyntheticLambda0, 2, magicModuleRepositoryImplExternalSyntheticLambda0);
    }

    public static final <T> RenewEligible<T> write(RenewEligibleCompanion renewEligibleCompanion, getCreatedOnDateMs<? extends T> getcreatedondatems) {
        toMagicModuleMetaRepoModel.write(renewEligibleCompanion, "");
        toMagicModuleMetaRepoModel.write(getcreatedondatems, "");
        int i = read.IconCompatParcelizer[renewEligibleCompanion.ordinal()];
        int i2 = 2;
        if (i == 1) {
            MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0 = null;
            return new SynchronizedLazyImpl(getcreatedondatems, magicModuleRepositoryImplExternalSyntheticLambda0, i2, magicModuleRepositoryImplExternalSyntheticLambda0);
        }
        if (i == 2) {
            return new SafePublicationLazyImpl(getcreatedondatems);
        }
        if (i != 3) {
            throw new RenewEligibleCreator();
        }
        return new UnsafeLazyImpl(getcreatedondatems);
    }
}
