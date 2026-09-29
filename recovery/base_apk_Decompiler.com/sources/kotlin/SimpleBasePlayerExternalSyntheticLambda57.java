package kotlin;

import kotlin.getContentPositionMsInternal;

/* JADX INFO: loaded from: classes2.dex */
public final class SimpleBasePlayerExternalSyntheticLambda57 implements SimpleBasePlayerExternalSyntheticLambda60 {

    public final /* synthetic */ class RemoteActionCompatParcelizer {
        public static final /* synthetic */ int[] write;

        static {
            int[] iArr = new int[lambdaaddMediaItems3comgoogleandroidexoplayer2SimpleBasePlayer.values().length];
            try {
                iArr[lambdaaddMediaItems3comgoogleandroidexoplayer2SimpleBasePlayer.IconCompatParcelizer.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[lambdaaddMediaItems3comgoogleandroidexoplayer2SimpleBasePlayer.read.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[lambdaaddMediaItems3comgoogleandroidexoplayer2SimpleBasePlayer.RemoteActionCompatParcelizer.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            write = iArr;
        }
    }

    @Override // kotlin.SimpleBasePlayerExternalSyntheticLambda60
    public final SimpleExoPlayer read(Pair<String, ? extends lambdaaddMediaItems3comgoogleandroidexoplayer2SimpleBasePlayer> pair) {
        getContentPositionMsInternal.RemoteActionCompatParcelizer remoteActionCompatParcelizer;
        toMagicModuleMetaRepoModel.write(pair, "");
        SeekParameters seekParameters = new SeekParameters(pair.write(), false, null, null, 0L, 0, 62, null);
        int i = RemoteActionCompatParcelizer.write[pair.IconCompatParcelizer().ordinal()];
        if (i == 1 || i == 2) {
            remoteActionCompatParcelizer = getContentPositionMsInternal.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer;
        } else {
            if (i != 3) {
                throw new RenewEligibleCreator();
            }
            remoteActionCompatParcelizer = getContentPositionMsInternal.RemoteActionCompatParcelizer.IconCompatParcelizer;
        }
        return getContentPositionMsInternal.RemoteActionCompatParcelizer(remoteActionCompatParcelizer, seekParameters);
    }
}
