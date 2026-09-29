package kotlin;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.Arrays;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0014\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\n\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u0003\u001a\u0004\u0018\u00010\u000bH\u0096\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0016\u001a\u00020\u00028\u0006¢\u0006\u0006\n\u0004\b\n\u0010\u0015R\u0011\u0010\u0018\u001a\u00020\u00028\u0006¢\u0006\u0006\n\u0004\b\u0017\u0010\u0015"}, d2 = {"Lo/withResolved;", "Lo/TypeWrappedDeserializer;", "", "p0", "p1", "<init>", "([F[F)V", "", "AudioAttributesCompatParcelizer", "(F)F", "RemoteActionCompatParcelizer", "", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "[F", "IconCompatParcelizer", "read", "write"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class withResolved implements TypeWrappedDeserializer {

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int write = 8;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final float[] IconCompatParcelizer;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final float[] write;

    public withResolved(float[] fArr, float[] fArr2) {
        if (fArr.length != fArr2.length || fArr.length == 0) {
            throw new IllegalArgumentException("Array lengths must match and be nonzero".toString());
        }
        this.IconCompatParcelizer = fArr;
        this.write = fArr2;
    }

    @Override // kotlin.TypeWrappedDeserializer
    public final float AudioAttributesCompatParcelizer(float p0) {
        return INSTANCE.RemoteActionCompatParcelizer(p0, this.write, this.IconCompatParcelizer);
    }

    @Override // kotlin.TypeWrappedDeserializer
    public final float RemoteActionCompatParcelizer(float p0) {
        return INSTANCE.RemoteActionCompatParcelizer(p0, this.IconCompatParcelizer, this.write);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (p0 == null || !(p0 instanceof withResolved)) {
            return false;
        }
        withResolved withresolved = (withResolved) p0;
        return Arrays.equals(this.IconCompatParcelizer, withresolved.IconCompatParcelizer) && Arrays.equals(this.write, withresolved.write);
    }

    public final int hashCode() {
        return (Arrays.hashCode(this.IconCompatParcelizer) * 31) + Arrays.hashCode(this.write);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FontScaleConverter{fromSpValues=");
        String string = Arrays.toString(this.IconCompatParcelizer);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string, "");
        sb.append(string);
        sb.append(", toDpValues=");
        String string2 = Arrays.toString(this.write);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string2, "");
        sb.append(string2);
        sb.append('}');
        return sb.toString();
    }

    /* JADX INFO: renamed from: o.withResolved$IconCompatParcelizer, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0014\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Lo/withResolved$IconCompatParcelizer;", "", "<init>", "()V", "", "p0", "", "p1", "p2", "RemoteActionCompatParcelizer", "(F[F[F)F"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final float RemoteActionCompatParcelizer(float p0, float[] p1, float[] p2) {
            float f;
            float f2;
            float f3;
            float f4;
            float fAbs = Math.abs(p0);
            float fSignum = Math.signum(p0);
            int iBinarySearch = Arrays.binarySearch(p1, fAbs);
            if (iBinarySearch >= 0) {
                f4 = p2[iBinarySearch];
            } else {
                int i = -(iBinarySearch + 1);
                int i2 = i - 1;
                int length = p1.length - 1;
                float f5 = BitmapDescriptorFactory.HUE_RED;
                if (i2 >= length) {
                    float f6 = p1[p1.length - 1];
                    return f6 == BitmapDescriptorFactory.HUE_RED ? BitmapDescriptorFactory.HUE_RED : p0 * (p2[p1.length - 1] / f6);
                }
                if (i2 == -1) {
                    float f7 = p1[0];
                    f3 = p2[0];
                    f2 = f7;
                    f = 0.0f;
                } else {
                    float f8 = p1[i2];
                    float f9 = p1[i];
                    f = p2[i2];
                    f5 = f8;
                    f2 = f9;
                    f3 = p2[i];
                }
                f4 = inject.INSTANCE.read(f, f3, f5, f2, fAbs);
            }
            return fSignum * f4;
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }
}
