package kotlin;

/* JADX INFO: loaded from: classes2.dex */
public final class Ac4Util1 extends MagicModuleUseCase implements getCreatedOnDateMs {
    public static final Ac4Util1 write = new Ac4Util1();

    public Ac4Util1() {
        super(0);
    }

    @Override // kotlin.getCreatedOnDateMs
    public final Object invoke() {
        Runtime runtime = Runtime.getRuntime();
        toMagicModuleMetaRepoModel.write(runtime);
        return Integer.valueOf(runtime.availableProcessors());
    }
}
