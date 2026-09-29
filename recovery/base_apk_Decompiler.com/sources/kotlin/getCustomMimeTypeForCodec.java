package kotlin;

/* JADX INFO: loaded from: classes3.dex */
public final class getCustomMimeTypeForCodec {

    public static final /* synthetic */ class RemoteActionCompatParcelizer {
        public static final /* synthetic */ int[] IconCompatParcelizer;

        static {
            int[] iArr = new int[getMediaMimeType.values().length];
            try {
                iArr[getMediaMimeType.AudioAttributesImplBaseParcelizer.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[getMediaMimeType.AudioAttributesCompatParcelizer.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[getMediaMimeType.AudioAttributesImplApi26Parcelizer.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[getMediaMimeType.MediaMetadataCompat.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[getMediaMimeType.MediaBrowserCompatItemReceiver.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[getMediaMimeType.AudioAttributesImplApi21Parcelizer.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[getMediaMimeType.read.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[getMediaMimeType.RemoteActionCompatParcelizer.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[getMediaMimeType.write.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[getMediaMimeType.MediaBrowserCompatCustomActionResultReceiver.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[getMediaMimeType.IconCompatParcelizer.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            IconCompatParcelizer = iArr;
        }
    }

    public static final int read(getMediaMimeType getmediamimetype) {
        toMagicModuleMetaRepoModel.write(getmediamimetype, "");
        switch (RemoteActionCompatParcelizer.IconCompatParcelizer[getmediamimetype.ordinal()]) {
            case 1:
                return 0;
            case 2:
                return -6;
            case 3:
                return -4;
            case 4:
                return -3;
            case 5:
                return -5;
            case 6:
                return -11;
            case 7:
                return -10;
            case 8:
                return -9;
            case 9:
                return -8;
            case 10:
                return -7;
            case 11:
                return -12;
            default:
                throw new RenewEligibleCreator();
        }
    }
}
