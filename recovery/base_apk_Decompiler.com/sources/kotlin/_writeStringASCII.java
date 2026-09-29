package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\f\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\t\u0010\u000bR$\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\r8\u0007@BX\u0087\u000e¢\u0006\f\n\u0004\b\f\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010"}, d2 = {"Lo/_writeStringASCII;", "Lo/_appendLongName;", "Lo/_checkNeedForRehash;", "p0", "<init>", "(ILo/MagicModuleRepositoryImplExternalSyntheticLambda0;)V", "", "read", "()V", "write", "I", "()I", "AudioAttributesCompatParcelizer", "", "Z", "RemoteActionCompatParcelizer", "()Z", "IconCompatParcelizer"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class _writeStringASCII implements _appendLongName {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private boolean IconCompatParcelizer;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final int AudioAttributesCompatParcelizer;

    private _writeStringASCII(int i) {
        this.AudioAttributesCompatParcelizer = i;
    }

    @Override // kotlin._appendLongName
    /* JADX INFO: renamed from: write, reason: from getter */
    public final int getAudioAttributesCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from getter */
    public final boolean getIconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    @Override // kotlin._appendLongName
    public final void read() {
        this.IconCompatParcelizer = true;
    }

    public /* synthetic */ _writeStringASCII(int i, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this(i);
    }
}
