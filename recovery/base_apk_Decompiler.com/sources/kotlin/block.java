package kotlin;

/* JADX INFO: loaded from: classes3.dex */
public final class block {

    public static final /* synthetic */ class read {
        public static final /* synthetic */ int[] write;

        static {
            int[] iArr = new int[RepeatModeUtil.values().length];
            try {
                iArr[RepeatModeUtil.RemoteActionCompatParcelizer.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[RepeatModeUtil.IconCompatParcelizer.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[RepeatModeUtil.read.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[RepeatModeUtil.AudioAttributesImplBaseParcelizer.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[RepeatModeUtil.AudioAttributesCompatParcelizer.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            write = iArr;
        }
    }

    public static final CopyOnWriteMultiset read(RepeatModeUtil repeatModeUtil) {
        toMagicModuleMetaRepoModel.write(repeatModeUtil, "");
        int i = read.write[repeatModeUtil.ordinal()];
        int i2 = 1;
        if (i != 1) {
            int i3 = 2;
            if (i != 2) {
                i2 = 3;
                if (i != 3) {
                    i3 = 4;
                    if (i != 4) {
                        if (i != 5) {
                            throw new RenewEligibleCreator();
                        }
                        i2 = i3;
                    }
                } else {
                    i2 = i3;
                }
            }
        } else {
            i2 = -1;
        }
        return new CopyOnWriteMultiset(i2);
    }
}
