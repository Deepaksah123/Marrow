package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0005\u0018\u0000 \n2\u00060\u0001j\u0002`\u0002:\u0001\nB\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lcom/marrow/keyattestation/lang/AttestationException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "code", "", "cause", "", "(ILjava/lang/Throwable;)V", "getCode", "()I", "Companion", "attestation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class parseNextLine extends RuntimeException {
    public static final IconCompatParcelizer read = new IconCompatParcelizer(null);
    private final int write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public parseNextLine(int i, Throwable th) {
        super(th);
        toMagicModuleMetaRepoModel.write(th, "");
        this.write = i;
    }

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from getter */
    public final int getWrite() {
        return this.write;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/parseNextLine$IconCompatParcelizer;", "", "<init>", "()V"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class IconCompatParcelizer {
        private IconCompatParcelizer() {
        }

        public /* synthetic */ IconCompatParcelizer(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }
}
