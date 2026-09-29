package kotlin;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public abstract class _collectAndResolveByTypeId implements _hasTypeResolver {
    private final boolean IconCompatParcelizer;
    private SubTypeValidator RemoteActionCompatParcelizer;
    private int read;
    private final ArrayList<TypeNameIdResolver> write = new ArrayList<>(1);

    public _collectAndResolveByTypeId(boolean z) {
        this.IconCompatParcelizer = z;
    }

    @Override // kotlin._hasTypeResolver
    public final void read(TypeNameIdResolver typeNameIdResolver) {
        if (this.write.contains(typeNameIdResolver)) {
            return;
        }
        this.write.add(typeNameIdResolver);
        this.read++;
    }

    protected final void write() {
        for (int i = 0; i < this.read; i++) {
            this.write.get(i);
        }
    }

    protected final void IconCompatParcelizer(SubTypeValidator subTypeValidator) {
        this.RemoteActionCompatParcelizer = subTypeValidator;
        for (int i = 0; i < this.read; i++) {
            this.write.get(i).IconCompatParcelizer(subTypeValidator, this.IconCompatParcelizer);
        }
    }

    protected final void AudioAttributesCompatParcelizer(int i) {
        SubTypeValidator subTypeValidator = (SubTypeValidator) LaissezFaireSubTypeValidator.IconCompatParcelizer(this.RemoteActionCompatParcelizer);
        for (int i2 = 0; i2 < this.read; i2++) {
            this.write.get(i2).read(subTypeValidator, this.IconCompatParcelizer, i);
        }
    }

    protected final void RemoteActionCompatParcelizer() {
        SubTypeValidator subTypeValidator = (SubTypeValidator) LaissezFaireSubTypeValidator.IconCompatParcelizer(this.RemoteActionCompatParcelizer);
        for (int i = 0; i < this.read; i++) {
            this.write.get(i).write(subTypeValidator, this.IconCompatParcelizer);
        }
        this.RemoteActionCompatParcelizer = null;
    }
}
