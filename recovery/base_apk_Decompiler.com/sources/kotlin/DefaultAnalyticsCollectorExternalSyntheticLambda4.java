package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0014\n\u0002\b\u0006\u0018\u0000 \n2\u00020\u0001:\u0001\nB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\u0005R\u0016\u0010\u0007\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\fR$\u0010\u000b\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\r8\u0007@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0007\u0010\u000e\u001a\u0004\b\n\u0010\u000fR\u0016\u0010\u0010\u001a\u00020\u00028\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0013\u001a\u00020\u00068G¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0012"}, d2 = {"Lo/DefaultAnalyticsCollectorExternalSyntheticLambda4;", "", "", "p0", "<init>", "([I)V", "", "AudioAttributesCompatParcelizer", "(I)I", "", "IconCompatParcelizer", "read", "I", "", "[F", "()[F", "RemoteActionCompatParcelizer", "[I", "()I", "write"}, k = 1, mv = {1, 4, 0})
public final class DefaultAnalyticsCollectorExternalSyntheticLambda4 {

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private float[] read;
    private int[] RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private int AudioAttributesCompatParcelizer;

    public DefaultAnalyticsCollectorExternalSyntheticLambda4(int[] iArr) {
        toMagicModuleMetaRepoModel.write(iArr, "");
        this.RemoteActionCompatParcelizer = iArr;
        int iAudioAttributesCompatParcelizer = Companion.AudioAttributesCompatParcelizer(iArr);
        this.AudioAttributesCompatParcelizer = iAudioAttributesCompatParcelizer;
        this.read = new float[iAudioAttributesCompatParcelizer];
    }

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from getter */
    public final float[] getRead() {
        return this.read;
    }

    public final int AudioAttributesCompatParcelizer() {
        return this.RemoteActionCompatParcelizer.length;
    }

    public final int AudioAttributesCompatParcelizer(int p0) {
        return this.RemoteActionCompatParcelizer[p0];
    }

    public final void IconCompatParcelizer(int[] p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        this.RemoteActionCompatParcelizer = p0;
        int iAudioAttributesCompatParcelizer = Companion.AudioAttributesCompatParcelizer(p0);
        float[] fArr = new float[iAudioAttributesCompatParcelizer];
        System.arraycopy(this.read, 0, fArr, 0, Math.min(this.AudioAttributesCompatParcelizer, iAudioAttributesCompatParcelizer));
        this.read = fArr;
        this.AudioAttributesCompatParcelizer = iAudioAttributesCompatParcelizer;
    }

    /* JADX INFO: renamed from: o.DefaultAnalyticsCollectorExternalSyntheticLambda4$IconCompatParcelizer, reason: from kotlin metadata */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lo/DefaultAnalyticsCollectorExternalSyntheticLambda4$IconCompatParcelizer;", "", "<init>", "()V", "", "p0", "", "AudioAttributesCompatParcelizer", "([I)I"}, k = 1, mv = {1, 4, 0})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static int AudioAttributesCompatParcelizer(int[] p0) {
            if (p0.length == 0) {
                throw new UnsupportedOperationException("Empty array can't be reduced.");
            }
            int i = p0[0];
            int iAudioAttributesImplBaseParcelizer = getOrderDetails.AudioAttributesImplBaseParcelizer(p0);
            if (iAudioAttributesImplBaseParcelizer > 0) {
                int i2 = 1;
                while (true) {
                    i *= p0[i2];
                    if (i2 == iAudioAttributesImplBaseParcelizer) {
                        break;
                    }
                    i2++;
                }
            }
            return i;
        }
    }
}
