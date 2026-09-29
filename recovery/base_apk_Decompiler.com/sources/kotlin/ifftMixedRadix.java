package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bR\"\u0010\u000e\u001a\u00020\u00028\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u0005"}, d2 = {"Lo/ifftMixedRadix;", "", "", "p0", "<init>", "(I)V", "", "toString", "()Ljava/lang/String;", "write", "I", "RemoteActionCompatParcelizer", "()I", "read", "AudioAttributesCompatParcelizer"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ifftMixedRadix {

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private int AudioAttributesCompatParcelizer;

    public ifftMixedRadix(int i) {
        this.AudioAttributesCompatParcelizer = i;
    }

    public /* synthetic */ ifftMixedRadix(int i, int i2, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this((i2 & 1) != 0 ? 0 : i);
    }

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from getter */
    public final int getAudioAttributesCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    public final void read(int i) {
        this.AudioAttributesCompatParcelizer = i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("IntRef(element = ");
        sb.append(this.AudioAttributesCompatParcelizer);
        sb.append(")@");
        String string = Integer.toString(hashCode(), setStatusTimestamp.RemoteActionCompatParcelizer(16));
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string, "");
        sb.append(string);
        return sb.toString();
    }

    public ifftMixedRadix() {
        this(0, 1, null);
    }
}
