package kotlin;

import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes2.dex */
public final class ExoPlayerBuilderExternalSyntheticLambda7 extends ExoPlayerDeviceComponent {
    private final ExoPlayerBuilderExternalSyntheticLambda15 AudioAttributesCompatParcelizer;
    private final Drawable IconCompatParcelizer;
    private final boolean write;

    public final Drawable IconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExoPlayerBuilderExternalSyntheticLambda7(Drawable drawable, boolean z, ExoPlayerBuilderExternalSyntheticLambda15 exoPlayerBuilderExternalSyntheticLambda15) {
        super(null);
        toMagicModuleMetaRepoModel.write(drawable, "");
        toMagicModuleMetaRepoModel.write(exoPlayerBuilderExternalSyntheticLambda15, "");
        this.IconCompatParcelizer = drawable;
        this.write = z;
        this.AudioAttributesCompatParcelizer = exoPlayerBuilderExternalSyntheticLambda15;
    }

    public final Drawable AudioAttributesCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    public final boolean read() {
        return this.write;
    }

    public final ExoPlayerBuilderExternalSyntheticLambda15 write() {
        return this.AudioAttributesCompatParcelizer;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static ExoPlayerBuilderExternalSyntheticLambda7 AudioAttributesCompatParcelizer(Drawable drawable, boolean z, ExoPlayerBuilderExternalSyntheticLambda15 exoPlayerBuilderExternalSyntheticLambda15) {
        toMagicModuleMetaRepoModel.write(drawable, "");
        toMagicModuleMetaRepoModel.write(exoPlayerBuilderExternalSyntheticLambda15, "");
        return new ExoPlayerBuilderExternalSyntheticLambda7(drawable, z, exoPlayerBuilderExternalSyntheticLambda15);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ExoPlayerBuilderExternalSyntheticLambda7)) {
            return false;
        }
        ExoPlayerBuilderExternalSyntheticLambda7 exoPlayerBuilderExternalSyntheticLambda7 = (ExoPlayerBuilderExternalSyntheticLambda7) obj;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.IconCompatParcelizer, exoPlayerBuilderExternalSyntheticLambda7.IconCompatParcelizer) && this.write == exoPlayerBuilderExternalSyntheticLambda7.write && this.AudioAttributesCompatParcelizer == exoPlayerBuilderExternalSyntheticLambda7.AudioAttributesCompatParcelizer;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    public final int hashCode() {
        int iHashCode = this.IconCompatParcelizer.hashCode();
        boolean z = this.write;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        return (((iHashCode * 31) + r1) * 31) + this.AudioAttributesCompatParcelizer.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DrawableResult(drawable=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", isSampled=");
        sb.append(this.write);
        sb.append(", dataSource=");
        sb.append(this.AudioAttributesCompatParcelizer);
        sb.append(')');
        return sb.toString();
    }
}
