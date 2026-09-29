package kotlin;

/* JADX INFO: loaded from: classes3.dex */
public final class onNewBytesCached {

    public static final /* synthetic */ class IconCompatParcelizer {
        public static final /* synthetic */ int[] read;

        static {
            int[] iArr = new int[TextOutput.values().length];
            try {
                iArr[TextOutput.MediaBrowserCompatCustomActionResultReceiver.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TextOutput.AudioAttributesImplBaseParcelizer.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[TextOutput.AudioAttributesCompatParcelizer.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[TextOutput.write.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[TextOutput.IconCompatParcelizer.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[TextOutput.RemoteActionCompatParcelizer.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[TextOutput.read.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            read = iArr;
        }
    }

    public static final readBlockToCache read(TextOutput textOutput) {
        toMagicModuleMetaRepoModel.write(textOutput, "");
        switch (IconCompatParcelizer.read[textOutput.ordinal()]) {
            case 1:
                return readBlockToCache.AudioAttributesImplBaseParcelizer;
            case 2:
                return readBlockToCache.AudioAttributesImplApi26Parcelizer;
            case 3:
                return readBlockToCache.IconCompatParcelizer;
            case 4:
                return readBlockToCache.RemoteActionCompatParcelizer;
            case 5:
                return readBlockToCache.MediaBrowserCompatItemReceiver;
            case 6:
                return readBlockToCache.AudioAttributesCompatParcelizer;
            case 7:
                return readBlockToCache.write;
            default:
                throw new RenewEligibleCreator();
        }
    }
}
