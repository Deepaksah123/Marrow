package kotlin;

import kotlin.anyIgnorals;

/* JADX INFO: loaded from: classes2.dex */
public final class withoutNext implements findAccess, AutoCloseable {
    private final String AudioAttributesCompatParcelizer;
    private final POJOPropertyBuilder5 RemoteActionCompatParcelizer;
    private boolean write;

    @Override // java.lang.AutoCloseable
    public final void close() {
    }

    public withoutNext(String str, POJOPropertyBuilder5 pOJOPropertyBuilder5) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(pOJOPropertyBuilder5, "");
        this.AudioAttributesCompatParcelizer = str;
        this.RemoteActionCompatParcelizer = pOJOPropertyBuilder5;
    }

    public final POJOPropertyBuilder5 AudioAttributesCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    public final boolean read() {
        return this.write;
    }

    public final void RemoteActionCompatParcelizer(setOnChartValueSelectedListener setonchartvalueselectedlistener, anyIgnorals anyignorals) {
        toMagicModuleMetaRepoModel.write(setonchartvalueselectedlistener, "");
        toMagicModuleMetaRepoModel.write(anyignorals, "");
        if (this.write) {
            throw new IllegalStateException("Already attached to lifecycleOwner".toString());
        }
        this.write = true;
        anyignorals.IconCompatParcelizer(this);
        setonchartvalueselectedlistener.IconCompatParcelizer(this.AudioAttributesCompatParcelizer, this.RemoteActionCompatParcelizer.IconCompatParcelizer());
    }

    @Override // kotlin.findAccess
    public final void read(hasGetter hasgetter, anyIgnorals.read readVar) {
        toMagicModuleMetaRepoModel.write(hasgetter, "");
        toMagicModuleMetaRepoModel.write(readVar, "");
        if (readVar == anyIgnorals.read.ON_DESTROY) {
            this.write = false;
            hasgetter.getLifecycle().AudioAttributesCompatParcelizer(this);
        }
    }
}
