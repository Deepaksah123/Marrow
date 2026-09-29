package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\bJ\r\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\bR\u0011\u0010\f\u001a\u00020\u00028\u0006¢\u0006\u0006\n\u0004\b\u0007\u0010\u000bR\u0011\u0010\t\u001a\u00020\r8G¢\u0006\u0006\u001a\u0004\b\f\u0010\u000e"}, d2 = {"Lo/builder;", "Lo/timesTwoToThe;", "Lo/multiplyInto;", "p0", "<init>", "(Lo/multiplyInto;)V", "", "IconCompatParcelizer", "()V", "RemoteActionCompatParcelizer", "AudioAttributesCompatParcelizer", "Lo/multiplyInto;", "write", "", "()Z"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class builder implements timesTwoToThe {
    public static final int AudioAttributesCompatParcelizer = multiplyInto.RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final multiplyInto write;

    public builder(multiplyInto multiplyinto) {
        this.write = multiplyinto;
        multiplyinto.read();
    }

    public /* synthetic */ builder(multiplyInto multiplyinto, int i, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this((i & 1) != 0 ? new multiplyInto() : multiplyinto);
    }

    public final boolean write() {
        return this.write.IconCompatParcelizer();
    }

    public final void IconCompatParcelizer() {
        this.write.write();
    }

    public final void RemoteActionCompatParcelizer() {
        this.write.read();
    }

    public final void AudioAttributesCompatParcelizer() {
        this.write.AudioAttributesCompatParcelizer();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public builder() {
        this(null, 1, 0 == true ? 1 : 0);
    }
}
