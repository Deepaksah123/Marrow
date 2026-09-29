package kotlin;

/* JADX INFO: loaded from: classes3.dex */
public enum setDownloadsPaused {
    DOUBLE(0, IconCompatParcelizer.SCALAR, getCurrentDownloads.DOUBLE),
    FLOAT(1, IconCompatParcelizer.SCALAR, getCurrentDownloads.FLOAT),
    INT64(2, IconCompatParcelizer.SCALAR, getCurrentDownloads.LONG),
    UINT64(3, IconCompatParcelizer.SCALAR, getCurrentDownloads.LONG),
    INT32(4, IconCompatParcelizer.SCALAR, getCurrentDownloads.INT),
    FIXED64(5, IconCompatParcelizer.SCALAR, getCurrentDownloads.LONG),
    FIXED32(6, IconCompatParcelizer.SCALAR, getCurrentDownloads.INT),
    BOOL(7, IconCompatParcelizer.SCALAR, getCurrentDownloads.BOOLEAN),
    STRING(8, IconCompatParcelizer.SCALAR, getCurrentDownloads.STRING),
    MESSAGE(9, IconCompatParcelizer.SCALAR, getCurrentDownloads.MESSAGE),
    BYTES(10, IconCompatParcelizer.SCALAR, getCurrentDownloads.BYTE_STRING),
    UINT32(11, IconCompatParcelizer.SCALAR, getCurrentDownloads.INT),
    ENUM(12, IconCompatParcelizer.SCALAR, getCurrentDownloads.ENUM),
    SFIXED32(13, IconCompatParcelizer.SCALAR, getCurrentDownloads.INT),
    SFIXED64(14, IconCompatParcelizer.SCALAR, getCurrentDownloads.LONG),
    SINT32(15, IconCompatParcelizer.SCALAR, getCurrentDownloads.INT),
    SINT64(16, IconCompatParcelizer.SCALAR, getCurrentDownloads.LONG),
    GROUP(17, IconCompatParcelizer.SCALAR, getCurrentDownloads.MESSAGE),
    DOUBLE_LIST(18, IconCompatParcelizer.VECTOR, getCurrentDownloads.DOUBLE),
    FLOAT_LIST(19, IconCompatParcelizer.VECTOR, getCurrentDownloads.FLOAT),
    INT64_LIST(20, IconCompatParcelizer.VECTOR, getCurrentDownloads.LONG),
    UINT64_LIST(21, IconCompatParcelizer.VECTOR, getCurrentDownloads.LONG),
    INT32_LIST(22, IconCompatParcelizer.VECTOR, getCurrentDownloads.INT),
    FIXED64_LIST(23, IconCompatParcelizer.VECTOR, getCurrentDownloads.LONG),
    FIXED32_LIST(24, IconCompatParcelizer.VECTOR, getCurrentDownloads.INT),
    BOOL_LIST(25, IconCompatParcelizer.VECTOR, getCurrentDownloads.BOOLEAN),
    STRING_LIST(26, IconCompatParcelizer.VECTOR, getCurrentDownloads.STRING),
    MESSAGE_LIST(27, IconCompatParcelizer.VECTOR, getCurrentDownloads.MESSAGE),
    BYTES_LIST(28, IconCompatParcelizer.VECTOR, getCurrentDownloads.BYTE_STRING),
    UINT32_LIST(29, IconCompatParcelizer.VECTOR, getCurrentDownloads.INT),
    ENUM_LIST(30, IconCompatParcelizer.VECTOR, getCurrentDownloads.ENUM),
    SFIXED32_LIST(31, IconCompatParcelizer.VECTOR, getCurrentDownloads.INT),
    SFIXED64_LIST(32, IconCompatParcelizer.VECTOR, getCurrentDownloads.LONG),
    SINT32_LIST(33, IconCompatParcelizer.VECTOR, getCurrentDownloads.INT),
    SINT64_LIST(34, IconCompatParcelizer.VECTOR, getCurrentDownloads.LONG),
    DOUBLE_LIST_PACKED(35, IconCompatParcelizer.PACKED_VECTOR, getCurrentDownloads.DOUBLE),
    FLOAT_LIST_PACKED(36, IconCompatParcelizer.PACKED_VECTOR, getCurrentDownloads.FLOAT),
    INT64_LIST_PACKED(37, IconCompatParcelizer.PACKED_VECTOR, getCurrentDownloads.LONG),
    UINT64_LIST_PACKED(38, IconCompatParcelizer.PACKED_VECTOR, getCurrentDownloads.LONG),
    INT32_LIST_PACKED(39, IconCompatParcelizer.PACKED_VECTOR, getCurrentDownloads.INT),
    FIXED64_LIST_PACKED(40, IconCompatParcelizer.PACKED_VECTOR, getCurrentDownloads.LONG),
    FIXED32_LIST_PACKED(41, IconCompatParcelizer.PACKED_VECTOR, getCurrentDownloads.INT),
    BOOL_LIST_PACKED(42, IconCompatParcelizer.PACKED_VECTOR, getCurrentDownloads.BOOLEAN),
    UINT32_LIST_PACKED(43, IconCompatParcelizer.PACKED_VECTOR, getCurrentDownloads.INT),
    ENUM_LIST_PACKED(44, IconCompatParcelizer.PACKED_VECTOR, getCurrentDownloads.ENUM),
    SFIXED32_LIST_PACKED(45, IconCompatParcelizer.PACKED_VECTOR, getCurrentDownloads.INT),
    SFIXED64_LIST_PACKED(46, IconCompatParcelizer.PACKED_VECTOR, getCurrentDownloads.LONG),
    SINT32_LIST_PACKED(47, IconCompatParcelizer.PACKED_VECTOR, getCurrentDownloads.INT),
    SINT64_LIST_PACKED(48, IconCompatParcelizer.PACKED_VECTOR, getCurrentDownloads.LONG),
    GROUP_LIST(49, IconCompatParcelizer.VECTOR, getCurrentDownloads.MESSAGE),
    MAP(50, IconCompatParcelizer.MAP, getCurrentDownloads.VOID);

    private static final setDownloadsPaused[] ResultReceiver;
    private final boolean _init_lambda2;
    private final getCurrentDownloads _init_lambda3;
    private final IconCompatParcelizer r8lambda4IRRzyoWeWaykEOcgWGjbNoGAkw;
    private final Class<?> r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;
    private final int r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28;

    static {
        setDownloadsPaused[] setdownloadspausedArrValues = values();
        ResultReceiver = new setDownloadsPaused[setdownloadspausedArrValues.length];
        for (setDownloadsPaused setdownloadspaused : setdownloadspausedArrValues) {
            ResultReceiver[setdownloadspaused.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28] = setdownloadspaused;
        }
    }

    setDownloadsPaused(int i, IconCompatParcelizer iconCompatParcelizer, getCurrentDownloads getcurrentdownloads) {
        int i2;
        this.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28 = i;
        this.r8lambda4IRRzyoWeWaykEOcgWGjbNoGAkw = iconCompatParcelizer;
        this._init_lambda3 = getcurrentdownloads;
        int i3 = AnonymousClass5.RemoteActionCompatParcelizer[iconCompatParcelizer.ordinal()];
        if (i3 == 1 || i3 == 2) {
            this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM = getcurrentdownloads.RemoteActionCompatParcelizer();
        } else {
            this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM = null;
        }
        this._init_lambda2 = (iconCompatParcelizer != IconCompatParcelizer.SCALAR || (i2 = AnonymousClass5.IconCompatParcelizer[getcurrentdownloads.ordinal()]) == 1 || i2 == 2 || i2 == 3) ? false : true;
    }

    /* JADX INFO: renamed from: o.setDownloadsPaused$5, reason: invalid class name */
    static /* synthetic */ class AnonymousClass5 {
        static final /* synthetic */ int[] IconCompatParcelizer;
        static final /* synthetic */ int[] RemoteActionCompatParcelizer;

        static {
            int[] iArr = new int[getCurrentDownloads.values().length];
            IconCompatParcelizer = iArr;
            try {
                iArr[getCurrentDownloads.BYTE_STRING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                IconCompatParcelizer[getCurrentDownloads.MESSAGE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                IconCompatParcelizer[getCurrentDownloads.STRING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[IconCompatParcelizer.values().length];
            RemoteActionCompatParcelizer = iArr2;
            try {
                iArr2[IconCompatParcelizer.MAP.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                RemoteActionCompatParcelizer[IconCompatParcelizer.VECTOR.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                RemoteActionCompatParcelizer[IconCompatParcelizer.SCALAR.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public final int write() {
        return this.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28;
    }

    public final boolean read() {
        return this.r8lambda4IRRzyoWeWaykEOcgWGjbNoGAkw.AudioAttributesCompatParcelizer();
    }

    public final boolean AudioAttributesCompatParcelizer() {
        return this.r8lambda4IRRzyoWeWaykEOcgWGjbNoGAkw == IconCompatParcelizer.MAP;
    }

    enum IconCompatParcelizer {
        SCALAR(false),
        VECTOR(true),
        PACKED_VECTOR(true),
        MAP(false);

        private final boolean MediaBrowserCompatItemReceiver;

        IconCompatParcelizer(boolean z) {
            this.MediaBrowserCompatItemReceiver = z;
        }

        public final boolean AudioAttributesCompatParcelizer() {
            return this.MediaBrowserCompatItemReceiver;
        }
    }
}
