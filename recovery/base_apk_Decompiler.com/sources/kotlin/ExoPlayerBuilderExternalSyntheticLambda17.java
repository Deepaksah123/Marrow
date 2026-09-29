package kotlin;

import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes2.dex */
public final class ExoPlayerBuilderExternalSyntheticLambda17 {
    private final boolean AudioAttributesCompatParcelizer;
    private final Drawable IconCompatParcelizer;

    public ExoPlayerBuilderExternalSyntheticLambda17(Drawable drawable, boolean z) {
        toMagicModuleMetaRepoModel.write(drawable, "");
        this.IconCompatParcelizer = drawable;
        this.AudioAttributesCompatParcelizer = z;
    }

    public final Drawable AudioAttributesCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    public final boolean RemoteActionCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ExoPlayerBuilderExternalSyntheticLambda17)) {
            return false;
        }
        ExoPlayerBuilderExternalSyntheticLambda17 exoPlayerBuilderExternalSyntheticLambda17 = (ExoPlayerBuilderExternalSyntheticLambda17) obj;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.IconCompatParcelizer, exoPlayerBuilderExternalSyntheticLambda17.IconCompatParcelizer) && this.AudioAttributesCompatParcelizer == exoPlayerBuilderExternalSyntheticLambda17.AudioAttributesCompatParcelizer;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [int] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4 */
    public final int hashCode() {
        int iHashCode = this.IconCompatParcelizer.hashCode();
        boolean z = this.AudioAttributesCompatParcelizer;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        return (iHashCode * 31) + r1;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DecodeResult(drawable=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", isSampled=");
        sb.append(this.AudioAttributesCompatParcelizer);
        sb.append(')');
        return sb.toString();
    }
}
