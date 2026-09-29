package kotlin;

/* JADX INFO: loaded from: classes3.dex */
public final class NonNullApi {

    public static final /* synthetic */ class RemoteActionCompatParcelizer {
        public static final /* synthetic */ int[] RemoteActionCompatParcelizer;

        static {
            int[] iArr = new int[onDisplayInfoChanged.values().length];
            try {
                iArr[onDisplayInfoChanged.read.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[onDisplayInfoChanged.AudioAttributesCompatParcelizer.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[onDisplayInfoChanged.IconCompatParcelizer.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[onDisplayInfoChanged.write.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            RemoteActionCompatParcelizer = iArr;
        }
    }

    public static final onDisplayInfoChanged AudioAttributesCompatParcelizer(isHoleSpan isholespan) {
        toMagicModuleMetaRepoModel.write(isholespan, "");
        int mediaBrowserCompatCustomActionResultReceiver = isholespan.getMediaBrowserCompatCustomActionResultReceiver();
        if (mediaBrowserCompatCustomActionResultReceiver == 1) {
            return onDisplayInfoChanged.AudioAttributesCompatParcelizer;
        }
        if (mediaBrowserCompatCustomActionResultReceiver == 2) {
            return onDisplayInfoChanged.IconCompatParcelizer;
        }
        if (mediaBrowserCompatCustomActionResultReceiver == 3) {
            return onDisplayInfoChanged.write;
        }
        return onDisplayInfoChanged.read;
    }

    public static final int IconCompatParcelizer(onDisplayInfoChanged ondisplayinfochanged) {
        toMagicModuleMetaRepoModel.write(ondisplayinfochanged, "");
        int i = RemoteActionCompatParcelizer.RemoteActionCompatParcelizer[ondisplayinfochanged.ordinal()];
        if (i == 1) {
            return 0;
        }
        if (i == 2) {
            return 1;
        }
        if (i == 3) {
            return 2;
        }
        if (i == 4) {
            return 3;
        }
        throw new RenewEligibleCreator();
    }

    public static final onDisplayInfoChanged IconCompatParcelizer(int i) {
        if (i == 1) {
            return onDisplayInfoChanged.AudioAttributesCompatParcelizer;
        }
        if (i == 2) {
            return onDisplayInfoChanged.IconCompatParcelizer;
        }
        if (i == 3) {
            return onDisplayInfoChanged.write;
        }
        return onDisplayInfoChanged.read;
    }
}
