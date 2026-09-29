package kotlin;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class lambdaupdateStateForPendingOperation61comgoogleandroidexoplayer2SimpleBasePlayer {
    private final lambdaupdateStateAndInformListeners37 IconCompatParcelizer;
    private final lambdaupdateStateAndInformListeners59 read;

    public final /* synthetic */ class AudioAttributesCompatParcelizer {
        public static final /* synthetic */ int[] read;

        static {
            int[] iArr = new int[SimpleBasePlayerExternalSyntheticLambda10.values().length];
            try {
                iArr[SimpleBasePlayerExternalSyntheticLambda10.AudioAttributesImplApi21Parcelizer.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SimpleBasePlayerExternalSyntheticLambda10.MediaBrowserCompatCustomActionResultReceiver.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[SimpleBasePlayerExternalSyntheticLambda10.IconCompatParcelizer.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[SimpleBasePlayerExternalSyntheticLambda10.RemoteActionCompatParcelizer.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[SimpleBasePlayerExternalSyntheticLambda10.AudioAttributesCompatParcelizer.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[SimpleBasePlayerExternalSyntheticLambda10.AudioAttributesImplBaseParcelizer.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[SimpleBasePlayerExternalSyntheticLambda10.read.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[SimpleBasePlayerExternalSyntheticLambda10.AudioAttributesImplApi26Parcelizer.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[SimpleBasePlayerExternalSyntheticLambda10.MediaBrowserCompatItemReceiver.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            read = iArr;
        }
    }

    public lambdaupdateStateForPendingOperation61comgoogleandroidexoplayer2SimpleBasePlayer(lambdaupdateStateAndInformListeners37 lambdaupdatestateandinformlisteners37, lambdaupdateStateAndInformListeners59 lambdaupdatestateandinformlisteners59) {
        toMagicModuleMetaRepoModel.write(lambdaupdatestateandinformlisteners37, "");
        toMagicModuleMetaRepoModel.write(lambdaupdatestateandinformlisteners59, "");
        this.IconCompatParcelizer = lambdaupdatestateandinformlisteners37;
        this.read = lambdaupdatestateandinformlisteners59;
    }

    public final boolean IconCompatParcelizer(List<lambdanew0comgoogleandroidexoplayer2SimpleBasePlayer> list, String str) {
        toMagicModuleMetaRepoModel.write(list, "");
        toMagicModuleMetaRepoModel.write(str, "");
        List<lambdanew0comgoogleandroidexoplayer2SimpleBasePlayer> list2 = list;
        if ((list2 instanceof Collection) && list2.isEmpty()) {
            return true;
        }
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            if (!write((lambdanew0comgoogleandroidexoplayer2SimpleBasePlayer) it.next(), str)) {
                return false;
            }
        }
        return true;
    }

    private final boolean write(lambdanew0comgoogleandroidexoplayer2SimpleBasePlayer lambdanew0comgoogleandroidexoplayer2simplebaseplayer, String str) {
        switch (AudioAttributesCompatParcelizer.read[lambdanew0comgoogleandroidexoplayer2simplebaseplayer.write().ordinal()]) {
            case 1:
                return this.IconCompatParcelizer.IconCompatParcelizer(str) < lambdanew0comgoogleandroidexoplayer2simplebaseplayer.IconCompatParcelizer();
            case 2:
                return this.IconCompatParcelizer.read(str, lambdanew0comgoogleandroidexoplayer2simplebaseplayer.RemoteActionCompatParcelizer()) < lambdanew0comgoogleandroidexoplayer2simplebaseplayer.IconCompatParcelizer();
            case 3:
                return this.IconCompatParcelizer.RemoteActionCompatParcelizer(str, lambdanew0comgoogleandroidexoplayer2simplebaseplayer.RemoteActionCompatParcelizer()) < lambdanew0comgoogleandroidexoplayer2simplebaseplayer.IconCompatParcelizer();
            case 4:
                return this.IconCompatParcelizer.AudioAttributesCompatParcelizer(str, lambdanew0comgoogleandroidexoplayer2simplebaseplayer.RemoteActionCompatParcelizer()) < lambdanew0comgoogleandroidexoplayer2simplebaseplayer.IconCompatParcelizer();
            case 5:
                return this.IconCompatParcelizer.write(str, lambdanew0comgoogleandroidexoplayer2simplebaseplayer.RemoteActionCompatParcelizer()) < lambdanew0comgoogleandroidexoplayer2simplebaseplayer.IconCompatParcelizer();
            case 6:
                return this.IconCompatParcelizer.IconCompatParcelizer(str, lambdanew0comgoogleandroidexoplayer2simplebaseplayer.RemoteActionCompatParcelizer()) < lambdanew0comgoogleandroidexoplayer2simplebaseplayer.IconCompatParcelizer();
            case 7:
                return this.IconCompatParcelizer.read(str).size() < lambdanew0comgoogleandroidexoplayer2simplebaseplayer.IconCompatParcelizer();
            case 8:
                return this.read.write(str) % lambdanew0comgoogleandroidexoplayer2simplebaseplayer.IconCompatParcelizer() == 0;
            case 9:
                return this.read.write(str) == lambdanew0comgoogleandroidexoplayer2simplebaseplayer.IconCompatParcelizer();
            default:
                throw new RenewEligibleCreator();
        }
    }

    public final boolean RemoteActionCompatParcelizer(List<lambdanew0comgoogleandroidexoplayer2SimpleBasePlayer> list, String str) {
        toMagicModuleMetaRepoModel.write(list, "");
        toMagicModuleMetaRepoModel.write(str, "");
        while (true) {
            boolean z = false;
            for (lambdanew0comgoogleandroidexoplayer2SimpleBasePlayer lambdanew0comgoogleandroidexoplayer2simplebaseplayer : list) {
                if (!z) {
                    if (AudioAttributesCompatParcelizer.read[lambdanew0comgoogleandroidexoplayer2simplebaseplayer.write().ordinal()] != 7 || write(lambdanew0comgoogleandroidexoplayer2simplebaseplayer, str)) {
                        break;
                    }
                }
                z = true;
            }
            return z;
        }
    }
}
