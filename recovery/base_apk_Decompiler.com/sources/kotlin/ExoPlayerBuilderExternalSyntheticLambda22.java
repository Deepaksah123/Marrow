package kotlin;

import coil.size.OriginalSize;
import coil.size.PixelSize;
import coil.size.Size;
import kotlin.Metadata;
import kotlin.getRelatedModuleAdapter;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J7\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\fJ/\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000f\u0010\u0010J7\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0005\u001a\u00020\u00112\u0006\u0010\u0006\u001a\u00020\u00112\u0006\u0010\u0007\u001a\u00020\u00112\u0006\u0010\b\u001a\u00020\u00112\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u0012\u0010\u0013J7\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0005\u001a\u00020\u00142\u0006\u0010\u0006\u001a\u00020\u00142\u0006\u0010\u0007\u001a\u00020\u00142\u0006\u0010\b\u001a\u00020\u00142\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u0015\u0010\u0016J7\u0010\u000f\u001a\u00020\u00112\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000f\u0010\u0017"}, d2 = {"Lo/ExoPlayerBuilderExternalSyntheticLambda22;", "", "<init>", "()V", "", "p0", "p1", "p2", "p3", "Lo/lambdaupdatePlaybackInfo16;", "p4", "IconCompatParcelizer", "(IIIILo/lambdaupdatePlaybackInfo16;)I", "Lcoil/size/Size;", "Lcoil/size/PixelSize;", "read", "(IILcoil/size/Size;Lo/lambdaupdatePlaybackInfo16;)Lcoil/size/PixelSize;", "", "write", "(DDDDLo/lambdaupdatePlaybackInfo16;)D", "", "RemoteActionCompatParcelizer", "(FFFFLo/lambdaupdatePlaybackInfo16;)F", "(IIIILo/lambdaupdatePlaybackInfo16;)D"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class ExoPlayerBuilderExternalSyntheticLambda22 {
    public static final ExoPlayerBuilderExternalSyntheticLambda22 INSTANCE = new ExoPlayerBuilderExternalSyntheticLambda22();

    public final /* synthetic */ class IconCompatParcelizer {
        public static final /* synthetic */ int[] AudioAttributesCompatParcelizer;

        static {
            int[] iArr = new int[lambdaupdatePlaybackInfo16.valuesCustom().length];
            iArr[lambdaupdatePlaybackInfo16.FILL.ordinal()] = 1;
            iArr[lambdaupdatePlaybackInfo16.FIT.ordinal()] = 2;
            AudioAttributesCompatParcelizer = iArr;
        }
    }

    private ExoPlayerBuilderExternalSyntheticLambda22() {
    }

    static {
        getRelatedModuleAdapter.Companion companion = getRelatedModuleAdapter.INSTANCE;
        getRelatedModuleAdapter.Companion.RemoteActionCompatParcelizer("GIF87a");
        getRelatedModuleAdapter.Companion companion2 = getRelatedModuleAdapter.INSTANCE;
        getRelatedModuleAdapter.Companion.RemoteActionCompatParcelizer("GIF89a");
        getRelatedModuleAdapter.Companion companion3 = getRelatedModuleAdapter.INSTANCE;
        getRelatedModuleAdapter.Companion.RemoteActionCompatParcelizer("RIFF");
        getRelatedModuleAdapter.Companion companion4 = getRelatedModuleAdapter.INSTANCE;
        getRelatedModuleAdapter.Companion.RemoteActionCompatParcelizer("WEBP");
        getRelatedModuleAdapter.Companion companion5 = getRelatedModuleAdapter.INSTANCE;
        getRelatedModuleAdapter.Companion.RemoteActionCompatParcelizer("VP8X");
        getRelatedModuleAdapter.Companion companion6 = getRelatedModuleAdapter.INSTANCE;
        getRelatedModuleAdapter.Companion.RemoteActionCompatParcelizer("ftyp");
        getRelatedModuleAdapter.Companion companion7 = getRelatedModuleAdapter.INSTANCE;
        getRelatedModuleAdapter.Companion.RemoteActionCompatParcelizer("msf1");
        getRelatedModuleAdapter.Companion companion8 = getRelatedModuleAdapter.INSTANCE;
        getRelatedModuleAdapter.Companion.RemoteActionCompatParcelizer("hevc");
        getRelatedModuleAdapter.Companion companion9 = getRelatedModuleAdapter.INSTANCE;
        getRelatedModuleAdapter.Companion.RemoteActionCompatParcelizer("hevx");
    }

    @getMagicModuleMeta
    public static final int IconCompatParcelizer(int p0, int p1, int p2, int p3, lambdaupdatePlaybackInfo16 p4) {
        toMagicModuleMetaRepoModel.write(p4, "");
        int iWrite = getQues.write(Integer.highestOneBit(p0 / p2), 1);
        int iWrite2 = getQues.write(Integer.highestOneBit(p1 / p3), 1);
        int i = IconCompatParcelizer.AudioAttributesCompatParcelizer[p4.ordinal()];
        if (i == 1) {
            return Math.min(iWrite, iWrite2);
        }
        if (i == 2) {
            return Math.max(iWrite, iWrite2);
        }
        throw new RenewEligibleCreator();
    }

    @getMagicModuleMeta
    public static final double read(int p0, int p1, int p2, int p3, lambdaupdatePlaybackInfo16 p4) {
        toMagicModuleMetaRepoModel.write(p4, "");
        double d = ((double) p2) / ((double) p0);
        double d2 = ((double) p3) / ((double) p1);
        int i = IconCompatParcelizer.AudioAttributesCompatParcelizer[p4.ordinal()];
        if (i == 1) {
            return Math.max(d, d2);
        }
        if (i == 2) {
            return Math.min(d, d2);
        }
        throw new RenewEligibleCreator();
    }

    @getMagicModuleMeta
    public static final float RemoteActionCompatParcelizer(float p0, float p1, float p2, float p3, lambdaupdatePlaybackInfo16 p4) {
        toMagicModuleMetaRepoModel.write(p4, "");
        float f = p2 / p0;
        float f2 = p3 / p1;
        int i = IconCompatParcelizer.AudioAttributesCompatParcelizer[p4.ordinal()];
        if (i == 1) {
            return Math.max(f, f2);
        }
        if (i == 2) {
            return Math.min(f, f2);
        }
        throw new RenewEligibleCreator();
    }

    @getMagicModuleMeta
    public static final double write(double p0, double p1, double p2, double p3, lambdaupdatePlaybackInfo16 p4) {
        toMagicModuleMetaRepoModel.write(p4, "");
        double d = p2 / p0;
        double d2 = p3 / p1;
        int i = IconCompatParcelizer.AudioAttributesCompatParcelizer[p4.ordinal()];
        if (i == 1) {
            return Math.max(d, d2);
        }
        if (i == 2) {
            return Math.min(d, d2);
        }
        throw new RenewEligibleCreator();
    }

    @getMagicModuleMeta
    public static final PixelSize read(int p0, int p1, Size p2, lambdaupdatePlaybackInfo16 p3) {
        toMagicModuleMetaRepoModel.write(p2, "");
        toMagicModuleMetaRepoModel.write(p3, "");
        if (p2 instanceof OriginalSize) {
            return new PixelSize(p0, p1);
        }
        if (!(p2 instanceof PixelSize)) {
            throw new RenewEligibleCreator();
        }
        PixelSize pixelSize = (PixelSize) p2;
        double d = read(p0, p1, pixelSize.getRead(), pixelSize.getWrite(), p3);
        return new PixelSize(getOnline.read(((double) p0) * d), getOnline.read(d * ((double) p1)));
    }
}
