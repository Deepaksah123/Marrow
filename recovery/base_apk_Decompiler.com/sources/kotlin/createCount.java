package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\t\b\u0004¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\b\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H ¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H ¢\u0006\u0004\b\n\u0010\u0004R$\u0010\u000b\u001a\u00028\u00002\u0006\u0010\u0006\u001a\u00028\u00008'@aX¦\u000e¢\u0006\f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\b\u0010\rR\u0016\u0010\b\u001a\u00028\u00008'@`X¦\f¢\u0006\u0006\u001a\u0004\b\u000e\u0010\fR+\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0006\u001a\u00020\u000f8A@AX\u0081\u008e\u0002¢\u0006\u0012\n\u0004\b\u000e\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\b\u0010\u0013\u0082\u0001\u0002\u0014\u0015"}, d2 = {"Lo/createCount;", "S", "", "<init>", "()V", "Lo/setLayoutInflater;", "p0", "", "IconCompatParcelizer", "(Lo/setLayoutInflater;)V", "write", "read", "()Ljava/lang/Object;", "(Ljava/lang/Object;)V", "AudioAttributesCompatParcelizer", "", "Lo/InputAccessor;", "AudioAttributesImplApi21Parcelizer", "()Z", "(Z)V", "Lo/setCollapseIcon;", "Lo/setContentInsetEndWithActions;"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class createCount<S> {
    private final InputAccessor AudioAttributesCompatParcelizer;

    public abstract S AudioAttributesCompatParcelizer();

    public abstract void IconCompatParcelizer(S s);

    public abstract void IconCompatParcelizer(setLayoutInflater<S> p0);

    public abstract S read();

    public abstract void write();

    private createCount() {
        this.AudioAttributesCompatParcelizer = available.RemoteActionCompatParcelizer$default(Boolean.FALSE, null, 2, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean AudioAttributesImplApi21Parcelizer() {
        return ((Boolean) this.AudioAttributesCompatParcelizer.getRemoteActionCompatParcelizer()).booleanValue();
    }

    public final void IconCompatParcelizer(boolean z) {
        this.AudioAttributesCompatParcelizer.write(Boolean.valueOf(z));
    }

    public /* synthetic */ createCount(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this();
    }
}
