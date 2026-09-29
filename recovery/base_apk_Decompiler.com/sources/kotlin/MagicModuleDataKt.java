package kotlin;

import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import com.marrow.data.api.models.response.user.LoggedUserResponse;
import kotlin.Metadata;
import kotlin.setMap;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b%\n\u0002\u0010\u0002\n\u0002\b$\b\u0086\b\u0018\u00002\u00020\u0001B\u009b\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0014\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\b\u0010;\u001a\u00020<H\u0002J\u000e\u0010=\u001a\u00020\u0003HÀ\u0003¢\u0006\u0002\b>J\u000e\u0010?\u001a\u00020\u0003HÀ\u0003¢\u0006\u0002\b@J\u000e\u0010A\u001a\u00020\u0003HÀ\u0003¢\u0006\u0002\bBJ\u000e\u0010C\u001a\u00020\u0003HÀ\u0003¢\u0006\u0002\bDJ\u000e\u0010E\u001a\u00020\u0003HÀ\u0003¢\u0006\u0002\bFJ\u000e\u0010G\u001a\u00020\u0003HÀ\u0003¢\u0006\u0002\bHJ\u000e\u0010I\u001a\u00020\nHÀ\u0003¢\u0006\u0002\bJJ\u0010\u0010K\u001a\u0004\u0018\u00010\u0003HÀ\u0003¢\u0006\u0002\bLJ\u0010\u0010M\u001a\u0004\u0018\u00010\u0003HÀ\u0003¢\u0006\u0002\bNJ\u0010\u0010O\u001a\u0004\u0018\u00010\u0003HÀ\u0003¢\u0006\u0002\bPJ\u0010\u0010Q\u001a\u0004\u0018\u00010\u000fHÀ\u0003¢\u0006\u0002\bRJ\u000e\u0010S\u001a\u00020\u0011HÀ\u0003¢\u0006\u0002\bTJ\u000e\u0010U\u001a\u00020\u0011HÀ\u0003¢\u0006\u0002\bVJ\u000e\u0010W\u001a\u00020\u0014HÀ\u0003¢\u0006\u0002\bXJ\u0010\u0010Y\u001a\u0004\u0018\u00010\u0016HÀ\u0003¢\u0006\u0002\bZJ©\u0001\u0010[\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0013\u001a\u00020\u00142\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÆ\u0001J\u0013\u0010\\\u001a\u00020\n2\b\u0010]\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010^\u001a\u00020\u0014HÖ\u0001J\t\u0010_\u001a\u00020\u0003HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0004\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001aR\u0014\u0010\u0005\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001aR\u0014\u0010\u0006\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001aR\u0014\u0010\u0007\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001aR\u0014\u0010\b\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001aR\u0014\u0010\t\u001a\u00020\nX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u0003X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u001a\"\u0004\b#\u0010$R\u001c\u0010\f\u001a\u0004\u0018\u00010\u0003X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u001a\"\u0004\b&\u0010$R\u001c\u0010\r\u001a\u0004\u0018\u00010\u0003X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010\u001a\"\u0004\b(\u0010$R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\u001a\u0010\u0010\u001a\u00020\u0011X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\u001a\u0010\u0012\u001a\u00020\u0011X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b1\u0010.\"\u0004\b2\u00100R\u001a\u0010\u0013\u001a\u00020\u0014X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b3\u00104\"\u0004\b5\u00106R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b7\u00108\"\u0004\b9\u0010:¨\u0006`"}, d2 = {"Lorg/dailyrounds/network/model/NetworkParams;", "", "appValue", "", "deviceId", "userAgent", "versionCode", "baseUrl", "cdnBaseUrl", "isDebug", "", "refreshToken", LoggedUserResponse.KEY_TOKEN, "userId", "errorHandler", "Lorg/dailyrounds/network/interceptor/ErrorDetection;", "defaultEncryptionVersion", "Lorg/dailyrounds/crypto/CryptoType;", "defaultDecryptionVersion", "retryCount", "", "networkLogging", "Lorg/dailyrounds/network/interceptor/LoggingAction;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/dailyrounds/network/interceptor/ErrorDetection;Lorg/dailyrounds/crypto/CryptoType;Lorg/dailyrounds/crypto/CryptoType;ILorg/dailyrounds/network/interceptor/LoggingAction;)V", "getAppValue$dr_network_2_release", "()Ljava/lang/String;", "getDeviceId$dr_network_2_release", "getUserAgent$dr_network_2_release", "getVersionCode$dr_network_2_release", "getBaseUrl$dr_network_2_release", "getCdnBaseUrl$dr_network_2_release", "isDebug$dr_network_2_release", "()Z", "getRefreshToken$dr_network_2_release", "setRefreshToken$dr_network_2_release", "(Ljava/lang/String;)V", "getToken$dr_network_2_release", "setToken$dr_network_2_release", "getUserId$dr_network_2_release", "setUserId$dr_network_2_release", "getErrorHandler$dr_network_2_release", "()Lorg/dailyrounds/network/interceptor/ErrorDetection;", "setErrorHandler$dr_network_2_release", "(Lorg/dailyrounds/network/interceptor/ErrorDetection;)V", "getDefaultEncryptionVersion$dr_network_2_release", "()Lorg/dailyrounds/crypto/CryptoType;", "setDefaultEncryptionVersion$dr_network_2_release", "(Lorg/dailyrounds/crypto/CryptoType;)V", "getDefaultDecryptionVersion$dr_network_2_release", "setDefaultDecryptionVersion$dr_network_2_release", "getRetryCount$dr_network_2_release", "()I", "setRetryCount$dr_network_2_release", "(I)V", "getNetworkLogging$dr_network_2_release", "()Lorg/dailyrounds/network/interceptor/LoggingAction;", "setNetworkLogging$dr_network_2_release", "(Lorg/dailyrounds/network/interceptor/LoggingAction;)V", "findItems", "", "component1", "component1$dr_network_2_release", "component2", "component2$dr_network_2_release", "component3", "component3$dr_network_2_release", "component4", "component4$dr_network_2_release", "component5", "component5$dr_network_2_release", "component6", "component6$dr_network_2_release", "component7", "component7$dr_network_2_release", "component8", "component8$dr_network_2_release", "component9", "component9$dr_network_2_release", "component10", "component10$dr_network_2_release", "component11", "component11$dr_network_2_release", "component12", "component12$dr_network_2_release", "component13", "component13$dr_network_2_release", "component14", "component14$dr_network_2_release", "component15", "component15$dr_network_2_release", "copy", "equals", "other", "hashCode", "toString", "dr-network-2_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class MagicModuleDataKt {
    private static int handleMediaPlayPauseIfPendingOnHandler = 1;
    private static int onAddQueueItem;
    private FilterParamsCreator AudioAttributesCompatParcelizer;
    private final String AudioAttributesImplApi21Parcelizer;
    private isSolved AudioAttributesImplApi26Parcelizer;
    private final boolean AudioAttributesImplBaseParcelizer;
    private final String IconCompatParcelizer;
    private String MediaBrowserCompatCustomActionResultReceiver;
    private setSolved MediaBrowserCompatItemReceiver;
    private String MediaBrowserCompatMediaItem;
    private String MediaBrowserCompatSearchResultReceiver;
    private int MediaDescriptionCompat;
    private final String MediaMetadataCompat;
    private final String RatingCompat;
    private final String RemoteActionCompatParcelizer;
    private FilterParamsCreator read;
    private final String write;

    public static /* synthetic */ Object read(int i, int i2, int i3, int i4, int i5, Object[] objArr, int i6) {
        int i7 = ~i5;
        int i8 = ~(i7 | i4);
        int i9 = (~(i7 | i6)) | i8;
        int i10 = ~i4;
        int i11 = ~i6;
        int i12 = i9 | (~(i10 | i11 | i5));
        int i13 = ~(i7 | i10 | i11);
        int i14 = i10 | i5;
        int i15 = (~(i6 | i14)) | i13;
        int i16 = (~i14) | i8;
        int i17 = i5 + i4 + i + ((-327997910) * i2) + ((-604038433) * i3);
        int i18 = i17 * i17;
        int i19 = ((i5 * 234895570) - 128974848) + (234895570 * i4) + (i12 * 695176798) + (695176798 * i15) + ((-347588399) * i16) + (582483968 * i) + (36700160 * i2) + ((-297271296) * i3) + (1302134784 * i18);
        int i20 = (i5 * (-238133666)) + 182491156 + (i4 * (-238133666)) + (i12 * (-1294)) + (i15 * (-1294)) + (i16 * 647) + (i * (-238134313)) + (i2 * (-1022231738)) + (i3 * 4118089) + (i18 * (-35979264));
        switch (i19 + (i20 * i20 * 1404239872)) {
            case 1:
                return IconCompatParcelizer(objArr);
            case 2:
                return RemoteActionCompatParcelizer(objArr);
            case 3:
                return read(objArr);
            case 4:
                return write(objArr);
            case 5:
                return MediaBrowserCompatCustomActionResultReceiver(objArr);
            case 6:
                return AudioAttributesImplBaseParcelizer(objArr);
            case 7:
                return AudioAttributesImplApi21Parcelizer(objArr);
            case 8:
                return MediaBrowserCompatItemReceiver(objArr);
            case 9:
                return AudioAttributesImplApi26Parcelizer(objArr);
            case 10:
                return MediaBrowserCompatSearchResultReceiver(objArr);
            case 11:
                return MediaMetadataCompat(objArr);
            case 12:
                return RatingCompat(objArr);
            case 13:
                return MediaDescriptionCompat(objArr);
            case 14:
                return MediaBrowserCompatMediaItem(objArr);
            case 15:
                return onCommand(objArr);
            case 16:
                return onCustomAction(objArr);
            case 17:
                return handleMediaPlayPauseIfPendingOnHandler(objArr);
            case 18:
                return MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver(objArr);
            default:
                return AudioAttributesCompatParcelizer(objArr);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ MagicModuleDataKt(String str, String str2, String str3, String str4, String str5, String str6, boolean z, String str7, String str8, String str9, isSolved issolved, FilterParamsCreator filterParamsCreator, FilterParamsCreator filterParamsCreator2, int i, setSolved setsolved, int i2, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        boolean z2;
        String str10;
        String str11;
        String str12;
        isSolved issolved2;
        FilterParamsCreator filterParamsCreator3;
        FilterParamsCreator filterParamsCreator4;
        int i3;
        setSolved setsolved2;
        if ((i2 & 64) != 0) {
            int i4 = handleMediaPlayPauseIfPendingOnHandler;
            int i5 = (i4 & (-102)) | ((~i4) & 101);
            int i6 = (i4 & 101) << 1;
            int i7 = (i5 ^ i6) + ((i5 & i6) << 1);
            onAddQueueItem = i7 % 128;
            int i8 = i7 % 2;
            int i9 = i4 & 59;
            int i10 = ((i4 | 59) & (~i9)) + (i9 << 1);
            onAddQueueItem = i10 % 128;
            if (i10 % 2 == 0) {
                int i11 = 2 % 2;
            }
            z2 = false;
        } else {
            z2 = z;
        }
        Object obj = null;
        if ((i2 & 128) != 0) {
            int i12 = handleMediaPlayPauseIfPendingOnHandler;
            int i13 = (((i12 | 116) << 1) - (i12 ^ 116)) - 1;
            onAddQueueItem = i13 % 128;
            if (i13 % 2 != 0) {
                int i14 = 36 / 0;
            }
            int i15 = 2 % 2;
            str10 = null;
        } else {
            str10 = str7;
        }
        if ((i2 & 256) != 0) {
            int i16 = onAddQueueItem;
            int i17 = (i16 & 51) + (i16 | 51);
            handleMediaPlayPauseIfPendingOnHandler = i17 % 128;
            int i18 = i17 % 2;
            int i19 = i16 & 61;
            int i20 = -(-(i16 | 61));
            int i21 = ((i19 | i20) << 1) - (i20 ^ i19);
            handleMediaPlayPauseIfPendingOnHandler = i21 % 128;
            if (i21 % 2 == 0) {
                int i22 = 3 / 2;
            } else {
                int i23 = 2 % 2;
            }
            str11 = null;
        } else {
            str11 = str8;
        }
        if ((i2 & 512) != 0) {
            int i24 = handleMediaPlayPauseIfPendingOnHandler;
            int i25 = (i24 & (-86)) | ((~i24) & 85);
            int i26 = (i24 & 85) << 1;
            int i27 = (i25 ^ i26) + ((i25 & i26) << 1);
            onAddQueueItem = i27 % 128;
            if (i27 % 2 != 0) {
                obj.hashCode();
                throw null;
            }
            int i28 = ((i24 ^ 86) + ((i24 & 86) << 1)) - 1;
            onAddQueueItem = i28 % 128;
            int i29 = i28 % 2;
            int i30 = 2 % 2;
            str12 = null;
        } else {
            str12 = str9;
        }
        if ((i2 & 1024) != 0) {
            int i31 = handleMediaPlayPauseIfPendingOnHandler;
            int i32 = i31 & 39;
            int i33 = (((i31 | 39) & (~i32)) - (~(i32 << 1))) - 1;
            int i34 = i33 % 128;
            onAddQueueItem = i34;
            int i35 = i33 % 2;
            int i36 = i34 ^ 81;
            int i37 = -(-((i34 & 81) << 1));
            int i38 = (i36 ^ i37) + ((i36 & i37) << 1);
            handleMediaPlayPauseIfPendingOnHandler = i38 % 128;
            if (i38 % 2 != 0) {
                int i39 = 2 % 2;
            }
            issolved2 = null;
        } else {
            issolved2 = issolved;
        }
        if ((i2 & 2048) != 0) {
            int i40 = onAddQueueItem;
            int i41 = i40 & 123;
            int i42 = ((i40 ^ 123) | i41) << 1;
            int i43 = -((i40 | 123) & (~i41));
            int i44 = ((i42 | i43) << 1) - (i43 ^ i42);
            handleMediaPlayPauseIfPendingOnHandler = i44 % 128;
            int i45 = i44 % 2;
            FilterParamsCreator filterParamsCreator5 = FilterParamsCreator.read;
            int i46 = onAddQueueItem + 83;
            handleMediaPlayPauseIfPendingOnHandler = i46 % 128;
            if (i46 % 2 != 0) {
                int i47 = 2 % 2;
            }
            filterParamsCreator3 = filterParamsCreator5;
        } else {
            filterParamsCreator3 = filterParamsCreator;
        }
        if ((i2 & 4096) != 0) {
            int i48 = onAddQueueItem;
            int i49 = (i48 ^ 57) + ((i48 & 57) << 1);
            handleMediaPlayPauseIfPendingOnHandler = i49 % 128;
            if (i49 % 2 == 0) {
                FilterParamsCreator filterParamsCreator6 = FilterParamsCreator.RemoteActionCompatParcelizer;
                obj.hashCode();
                throw null;
            }
            int i50 = 2 % 2;
            filterParamsCreator4 = FilterParamsCreator.RemoteActionCompatParcelizer;
        } else {
            filterParamsCreator4 = filterParamsCreator2;
        }
        if ((i2 & 8192) != 0) {
            int i51 = onAddQueueItem;
            int i52 = (((i51 & (-100)) | ((~i51) & 99)) - (~((i51 & 99) << 1))) - 1;
            handleMediaPlayPauseIfPendingOnHandler = i52 % 128;
            int i53 = i52 % 2;
            int i54 = i51 & 45;
            int i55 = (i51 | 45) & (~i54);
            int i56 = -(-(i54 << 1));
            int i57 = (i55 ^ i56) + ((i55 & i56) << 1);
            handleMediaPlayPauseIfPendingOnHandler = i57 % 128;
            if (i57 % 2 == 0) {
                int i58 = 5 % 3;
            } else {
                int i59 = 2 % 2;
            }
            i3 = 0;
        } else {
            i3 = i;
        }
        if ((i2 & 16384) != 0) {
            int i60 = handleMediaPlayPauseIfPendingOnHandler;
            int i61 = i60 & 67;
            int i62 = (i60 | 67) & (~i61);
            int i63 = -(-(i61 << 1));
            int i64 = ((i62 | i63) << 1) - (i62 ^ i63);
            int i65 = i64 % 128;
            onAddQueueItem = i65;
            if (i64 % 2 != 0) {
                int i66 = 56 / 0;
            }
            int i67 = i65 + 87;
            handleMediaPlayPauseIfPendingOnHandler = i67 % 128;
            if (i67 % 2 != 0) {
                int i68 = 2 % 2;
            }
            setsolved2 = null;
        } else {
            setsolved2 = setsolved;
        }
        int i69 = handleMediaPlayPauseIfPendingOnHandler;
        int i70 = (i69 & 39) + (i69 | 39);
        onAddQueueItem = i70 % 128;
        if (i70 % 2 != 0) {
            int i71 = 3 / 0;
        }
        this(str, str2, str3, str4, str5, str6, z2, str10, str11, str12, issolved2, filterParamsCreator3, filterParamsCreator4, i3, setsolved2);
    }

    private static /* synthetic */ Object IconCompatParcelizer(Object[] objArr) {
        MagicModuleDataKt magicModuleDataKt = (MagicModuleDataKt) objArr[0];
        int i = 2 % 2;
        int i2 = handleMediaPlayPauseIfPendingOnHandler;
        int i3 = ((i2 ^ 37) | (i2 & 37)) << 1;
        int i4 = -(((~i2) & 37) | (i2 & (-38)));
        int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
        onAddQueueItem = i5 % 128;
        int i6 = i5 % 2;
        String str = magicModuleDataKt.IconCompatParcelizer;
        if (i6 == 0) {
            return str;
        }
        throw null;
    }

    private static /* synthetic */ Object onCommand(Object[] objArr) {
        MagicModuleDataKt magicModuleDataKt = (MagicModuleDataKt) objArr[0];
        int i = 2 % 2;
        int i2 = onAddQueueItem;
        int i3 = ((i2 & 69) - (~(-(-(i2 | 69))))) - 1;
        int i4 = i3 % 128;
        handleMediaPlayPauseIfPendingOnHandler = i4;
        int i5 = i3 % 2;
        String str = magicModuleDataKt.AudioAttributesImplApi21Parcelizer;
        int i6 = i4 + 17;
        onAddQueueItem = i6 % 128;
        int i7 = i6 % 2;
        return str;
    }

    private static /* synthetic */ Object MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver(Object[] objArr) {
        MagicModuleDataKt magicModuleDataKt = (MagicModuleDataKt) objArr[0];
        int i = 2 % 2;
        int i2 = handleMediaPlayPauseIfPendingOnHandler;
        int i3 = i2 & 39;
        int i4 = (((i2 ^ 39) | i3) << 1) - ((~i3) & (i2 | 39));
        onAddQueueItem = i4 % 128;
        int i5 = i4 % 2;
        String str = magicModuleDataKt.MediaMetadataCompat;
        int i6 = i2 + 39;
        onAddQueueItem = i6 % 128;
        int i7 = i6 % 2;
        return str;
    }

    private static /* synthetic */ Object write(Object[] objArr) {
        MagicModuleDataKt magicModuleDataKt = (MagicModuleDataKt) objArr[0];
        int i = 2 % 2;
        int i2 = onAddQueueItem;
        int i3 = i2 & 5;
        int i4 = (((i2 ^ 5) | i3) << 1) - ((i2 | 5) & (~i3));
        int i5 = i4 % 128;
        handleMediaPlayPauseIfPendingOnHandler = i5;
        int i6 = i4 % 2;
        String str = magicModuleDataKt.RatingCompat;
        if (i6 == 0) {
            throw null;
        }
        int i7 = (((i5 | 114) << 1) - (i5 ^ 114)) - 1;
        onAddQueueItem = i7 % 128;
        if (i7 % 2 != 0) {
            int i8 = 36 / 0;
        }
        return str;
    }

    private static /* synthetic */ Object MediaDescriptionCompat(Object[] objArr) {
        MagicModuleDataKt magicModuleDataKt = (MagicModuleDataKt) objArr[0];
        int i = 2 % 2;
        int i2 = onAddQueueItem;
        int i3 = (-2) - ((i2 + 56) ^ (-1));
        handleMediaPlayPauseIfPendingOnHandler = i3 % 128;
        int i4 = i3 % 2;
        String str = magicModuleDataKt.RemoteActionCompatParcelizer;
        if (i4 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i5 = ((i2 ^ 93) | (i2 & 93)) << 1;
        int i6 = -(((~i2) & 93) | (i2 & (-94)));
        int i7 = (i5 ^ i6) + ((i6 & i5) << 1);
        handleMediaPlayPauseIfPendingOnHandler = i7 % 128;
        int i8 = i7 % 2;
        return str;
    }

    private static /* synthetic */ Object handleMediaPlayPauseIfPendingOnHandler(Object[] objArr) {
        MagicModuleDataKt magicModuleDataKt = (MagicModuleDataKt) objArr[0];
        int i = 2 % 2;
        int i2 = onAddQueueItem;
        int i3 = ((i2 ^ 8) + ((i2 & 8) << 1)) - 1;
        int i4 = i3 % 128;
        handleMediaPlayPauseIfPendingOnHandler = i4;
        int i5 = i3 % 2;
        String str = magicModuleDataKt.write;
        int i6 = i4 ^ 43;
        int i7 = ((i4 & 43) | i6) << 1;
        int i8 = -i6;
        int i9 = ((i7 | i8) << 1) - (i7 ^ i8);
        onAddQueueItem = i9 % 128;
        int i10 = i9 % 2;
        return str;
    }

    private static /* synthetic */ Object AudioAttributesImplApi21Parcelizer(Object[] objArr) {
        MagicModuleDataKt magicModuleDataKt = (MagicModuleDataKt) objArr[0];
        int i = 2 % 2;
        int i2 = handleMediaPlayPauseIfPendingOnHandler;
        int i3 = (i2 & (-120)) | ((~i2) & 119);
        int i4 = -(-((i2 & 119) << 1));
        int i5 = (i3 & i4) + (i4 | i3);
        int i6 = i5 % 128;
        onAddQueueItem = i6;
        int i7 = i5 % 2;
        boolean z = magicModuleDataKt.AudioAttributesImplBaseParcelizer;
        int i8 = (i6 & 36) + (i6 | 36);
        int i9 = (i8 ^ (-1)) + (i8 << 1);
        handleMediaPlayPauseIfPendingOnHandler = i9 % 128;
        if (i9 % 2 != 0) {
            return Boolean.valueOf(z);
        }
        int i10 = 30 / 0;
        return Boolean.valueOf(z);
    }

    private static /* synthetic */ Object read(Object[] objArr) {
        MagicModuleDataKt magicModuleDataKt = (MagicModuleDataKt) objArr[0];
        int i = 2 % 2;
        int i2 = handleMediaPlayPauseIfPendingOnHandler;
        int i3 = (((i2 | 44) << 1) - (i2 ^ 44)) - 1;
        int i4 = i3 % 128;
        onAddQueueItem = i4;
        int i5 = i3 % 2;
        String str = magicModuleDataKt.MediaBrowserCompatCustomActionResultReceiver;
        int i6 = i4 + 93;
        handleMediaPlayPauseIfPendingOnHandler = i6 % 128;
        int i7 = i6 % 2;
        return str;
    }

    private static /* synthetic */ Object MediaBrowserCompatItemReceiver(Object[] objArr) {
        MagicModuleDataKt magicModuleDataKt = (MagicModuleDataKt) objArr[0];
        int i = 2 % 2;
        int i2 = onAddQueueItem;
        int i3 = (i2 & 31) + (i2 | 31);
        handleMediaPlayPauseIfPendingOnHandler = i3 % 128;
        int i4 = i3 % 2;
        String str = magicModuleDataKt.MediaBrowserCompatSearchResultReceiver;
        int i5 = (i2 & (-8)) | ((~i2) & 7);
        int i6 = -(-((i2 & 7) << 1));
        int i7 = (i5 & i6) + (i6 | i5);
        handleMediaPlayPauseIfPendingOnHandler = i7 % 128;
        int i8 = i7 % 2;
        return str;
    }

    private static /* synthetic */ Object MediaMetadataCompat(Object[] objArr) {
        MagicModuleDataKt magicModuleDataKt = (MagicModuleDataKt) objArr[0];
        int i = 2 % 2;
        int i2 = onAddQueueItem;
        int i3 = (((i2 ^ 99) | (i2 & 99)) << 1) - (((~i2) & 99) | (i2 & (-100)));
        int i4 = i3 % 128;
        handleMediaPlayPauseIfPendingOnHandler = i4;
        int i5 = i3 % 2;
        String str = magicModuleDataKt.MediaBrowserCompatMediaItem;
        if (i5 == 0) {
            int i6 = 98 / 0;
        }
        int i7 = i4 + 7;
        onAddQueueItem = i7 % 128;
        int i8 = i7 % 2;
        return str;
    }

    private static /* synthetic */ Object AudioAttributesImplApi26Parcelizer(Object[] objArr) {
        MagicModuleDataKt magicModuleDataKt = (MagicModuleDataKt) objArr[0];
        int i = 2 % 2;
        int i2 = handleMediaPlayPauseIfPendingOnHandler;
        int i3 = ((i2 | 4) << 1) - (i2 ^ 4);
        int i4 = (i3 ^ (-1)) + (i3 << 1);
        onAddQueueItem = i4 % 128;
        int i5 = i4 % 2;
        isSolved issolved = magicModuleDataKt.AudioAttributesImplApi26Parcelizer;
        int i6 = i2 & 109;
        int i7 = (i2 ^ 109) | i6;
        int i8 = (i6 ^ i7) + ((i7 & i6) << 1);
        onAddQueueItem = i8 % 128;
        int i9 = i8 % 2;
        return issolved;
    }

    private static /* synthetic */ Object MediaBrowserCompatMediaItem(Object[] objArr) {
        MagicModuleDataKt magicModuleDataKt = (MagicModuleDataKt) objArr[0];
        int i = 2 % 2;
        int i2 = onAddQueueItem;
        int i3 = i2 & 123;
        int i4 = (i2 | 123) & (~i3);
        int i5 = -(-(i3 << 1));
        int i6 = (i4 & i5) + (i4 | i5);
        int i7 = i6 % 128;
        handleMediaPlayPauseIfPendingOnHandler = i7;
        int i8 = i6 % 2;
        FilterParamsCreator filterParamsCreator = magicModuleDataKt.AudioAttributesCompatParcelizer;
        int i9 = i7 & 27;
        int i10 = -(-((i7 ^ 27) | i9));
        int i11 = (i9 ^ i10) + ((i10 & i9) << 1);
        onAddQueueItem = i11 % 128;
        if (i11 % 2 == 0) {
            return filterParamsCreator;
        }
        throw null;
    }

    private static /* synthetic */ Object MediaBrowserCompatSearchResultReceiver(Object[] objArr) {
        MagicModuleDataKt magicModuleDataKt = (MagicModuleDataKt) objArr[0];
        int i = 2 % 2;
        int i2 = handleMediaPlayPauseIfPendingOnHandler;
        int i3 = i2 ^ 13;
        int i4 = (i2 & 13) << 1;
        int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
        int i6 = i5 % 128;
        onAddQueueItem = i6;
        int i7 = i5 % 2;
        FilterParamsCreator filterParamsCreator = magicModuleDataKt.read;
        int i8 = i6 + 77;
        handleMediaPlayPauseIfPendingOnHandler = i8 % 128;
        if (i8 % 2 != 0) {
            return filterParamsCreator;
        }
        throw null;
    }

    private MagicModuleDataKt(String str, String str2, String str3, String str4, String str5, String str6, boolean z, String str7, String str8, String str9, isSolved issolved, FilterParamsCreator filterParamsCreator, FilterParamsCreator filterParamsCreator2, int i, setSolved setsolved) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(str2, "");
        toMagicModuleMetaRepoModel.write(str3, "");
        int i2 = onAddQueueItem;
        int i3 = i2 & 91;
        int i4 = ((i2 ^ 91) | i3) << 1;
        int i5 = -((i2 | 91) & (~i3));
        int i6 = ((i4 | i5) << 1) - (i5 ^ i4);
        handleMediaPlayPauseIfPendingOnHandler = i6 % 128;
        int i7 = i6 % 2;
        toMagicModuleMetaRepoModel.write(str4, "");
        toMagicModuleMetaRepoModel.write(str5, "");
        toMagicModuleMetaRepoModel.write(str6, "");
        toMagicModuleMetaRepoModel.write(filterParamsCreator, "");
        toMagicModuleMetaRepoModel.write(filterParamsCreator2, "");
        this.IconCompatParcelizer = str;
        this.AudioAttributesImplApi21Parcelizer = str2;
        this.MediaMetadataCompat = str3;
        this.RatingCompat = str4;
        this.RemoteActionCompatParcelizer = str5;
        this.write = str6;
        this.AudioAttributesImplBaseParcelizer = z;
        this.MediaBrowserCompatCustomActionResultReceiver = str7;
        this.MediaBrowserCompatSearchResultReceiver = str8;
        this.MediaBrowserCompatMediaItem = str9;
        this.AudioAttributesImplApi26Parcelizer = issolved;
        this.AudioAttributesCompatParcelizer = filterParamsCreator;
        this.read = filterParamsCreator2;
        this.MediaDescriptionCompat = i;
        this.MediaBrowserCompatItemReceiver = setsolved;
    }

    private static /* synthetic */ Object onCustomAction(Object[] objArr) {
        MagicModuleDataKt magicModuleDataKt = (MagicModuleDataKt) objArr[0];
        int i = 2 % 2;
        int i2 = handleMediaPlayPauseIfPendingOnHandler;
        int i3 = ((i2 ^ 126) + ((i2 & 126) << 1)) - 1;
        int i4 = i3 % 128;
        onAddQueueItem = i4;
        int i5 = i3 % 2;
        setSolved setsolved = magicModuleDataKt.MediaBrowserCompatItemReceiver;
        int i6 = (i4 & (-114)) | ((~i4) & 113);
        int i7 = (i4 & 113) << 1;
        int i8 = (i6 & i7) + (i7 | i6);
        handleMediaPlayPauseIfPendingOnHandler = i8 % 128;
        if (i8 % 2 == 0) {
            int i9 = 1 / 0;
        }
        return setsolved;
    }

    public static /* synthetic */ MagicModuleDataKt IconCompatParcelizer(MagicModuleDataKt magicModuleDataKt, String str, String str2, String str3, String str4, String str5, String str6, boolean z, String str7, String str8, String str9, isSolved issolved, FilterParamsCreator filterParamsCreator, FilterParamsCreator filterParamsCreator2, int i, setSolved setsolved, int i2) {
        return (MagicModuleDataKt) read(setMap.AudioAttributesCompatParcelizer.read(), setMap.AudioAttributesCompatParcelizer.read(), setMap.AudioAttributesCompatParcelizer.read(), -1129835483, 1129835488, new Object[]{magicModuleDataKt, str, str2, str3, str4, str5, str6, Boolean.valueOf(z), str7, str8, str9, issolved, filterParamsCreator, filterParamsCreator2, Integer.valueOf(i), setsolved, Integer.valueOf(i2)}, setMap.AudioAttributesCompatParcelizer.read());
    }

    private static MagicModuleDataKt IconCompatParcelizer(String str, String str2, String str3, String str4, String str5, String str6, boolean z, String str7, String str8, String str9, isSolved issolved, FilterParamsCreator filterParamsCreator, FilterParamsCreator filterParamsCreator2, int i, setSolved setsolved) {
        return (MagicModuleDataKt) read(setMap.AudioAttributesCompatParcelizer.read(), setMap.AudioAttributesCompatParcelizer.read(), setMap.AudioAttributesCompatParcelizer.read(), -1698160591, 1698160597, new Object[]{str, str2, str3, str4, str5, str6, Boolean.valueOf(z), str7, str8, str9, issolved, filterParamsCreator, filterParamsCreator2, Integer.valueOf(i), setsolved}, setMap.AudioAttributesCompatParcelizer.read());
    }

    public final boolean equals(Object other) {
        int i = setMap.AudioAttributesCompatParcelizer.read();
        return ((Boolean) read(setMap.AudioAttributesCompatParcelizer.read(), setMap.AudioAttributesCompatParcelizer.read(), setMap.AudioAttributesCompatParcelizer.read(), -732241853, 732241855, new Object[]{this, other}, i)).booleanValue();
    }

    public final String RemoteActionCompatParcelizer() {
        int i = setMap.AudioAttributesCompatParcelizer.read();
        return (String) read(setMap.AudioAttributesCompatParcelizer.read(), setMap.AudioAttributesCompatParcelizer.read(), setMap.AudioAttributesCompatParcelizer.read(), 1330996813, -1330996812, new Object[]{this}, i);
    }

    public final String read() {
        int i = setMap.AudioAttributesCompatParcelizer.read();
        return (String) read(setMap.AudioAttributesCompatParcelizer.read(), setMap.AudioAttributesCompatParcelizer.read(), setMap.AudioAttributesCompatParcelizer.read(), 781772554, -781772541, new Object[]{this}, i);
    }

    public final String AudioAttributesCompatParcelizer() {
        int i = setMap.AudioAttributesCompatParcelizer.read();
        return (String) read(setMap.AudioAttributesCompatParcelizer.read(), setMap.AudioAttributesCompatParcelizer.read(), setMap.AudioAttributesCompatParcelizer.read(), 568938068, -568938051, new Object[]{this}, i);
    }

    public final FilterParamsCreator IconCompatParcelizer() {
        int i = setMap.AudioAttributesCompatParcelizer.read();
        return (FilterParamsCreator) read(setMap.AudioAttributesCompatParcelizer.read(), setMap.AudioAttributesCompatParcelizer.read(), setMap.AudioAttributesCompatParcelizer.read(), 1441505314, -1441505304, new Object[]{this}, i);
    }

    public final FilterParamsCreator write() {
        int i = setMap.AudioAttributesCompatParcelizer.read();
        return (FilterParamsCreator) read(setMap.AudioAttributesCompatParcelizer.read(), setMap.AudioAttributesCompatParcelizer.read(), setMap.AudioAttributesCompatParcelizer.read(), 1555743069, -1555743055, new Object[]{this}, i);
    }

    public final String AudioAttributesImplApi21Parcelizer() {
        int i = setMap.AudioAttributesCompatParcelizer.read();
        return (String) read(setMap.AudioAttributesCompatParcelizer.read(), setMap.AudioAttributesCompatParcelizer.read(), setMap.AudioAttributesCompatParcelizer.read(), -904747516, 904747531, new Object[]{this}, i);
    }

    public final isSolved AudioAttributesImplApi26Parcelizer() {
        int i = setMap.AudioAttributesCompatParcelizer.read();
        return (isSolved) read(setMap.AudioAttributesCompatParcelizer.read(), setMap.AudioAttributesCompatParcelizer.read(), setMap.AudioAttributesCompatParcelizer.read(), -1182640170, 1182640179, new Object[]{this}, i);
    }

    public final setSolved MediaBrowserCompatItemReceiver() {
        int i = setMap.AudioAttributesCompatParcelizer.read();
        return (setSolved) read(setMap.AudioAttributesCompatParcelizer.read(), setMap.AudioAttributesCompatParcelizer.read(), setMap.AudioAttributesCompatParcelizer.read(), -1871084051, 1871084067, new Object[]{this}, i);
    }

    public final String AudioAttributesImplBaseParcelizer() {
        int i = setMap.AudioAttributesCompatParcelizer.read();
        return (String) read(setMap.AudioAttributesCompatParcelizer.read(), setMap.AudioAttributesCompatParcelizer.read(), setMap.AudioAttributesCompatParcelizer.read(), 341259885, -341259882, new Object[]{this}, i);
    }

    public final String MediaBrowserCompatCustomActionResultReceiver() {
        int i = setMap.AudioAttributesCompatParcelizer.read();
        return (String) read(setMap.AudioAttributesCompatParcelizer.read(), setMap.AudioAttributesCompatParcelizer.read(), setMap.AudioAttributesCompatParcelizer.read(), 313683738, -313683730, new Object[]{this}, i);
    }

    public final String MediaBrowserCompatSearchResultReceiver() {
        int i = setMap.AudioAttributesCompatParcelizer.read();
        return (String) read(setMap.AudioAttributesCompatParcelizer.read(), setMap.AudioAttributesCompatParcelizer.read(), setMap.AudioAttributesCompatParcelizer.read(), 263483979, -263483961, new Object[]{this}, i);
    }

    public final String RatingCompat() {
        int i = setMap.AudioAttributesCompatParcelizer.read();
        return (String) read(setMap.AudioAttributesCompatParcelizer.read(), setMap.AudioAttributesCompatParcelizer.read(), setMap.AudioAttributesCompatParcelizer.read(), -562119872, 562119883, new Object[]{this}, i);
    }

    public final String MediaMetadataCompat() {
        int i = setMap.AudioAttributesCompatParcelizer.read();
        return (String) read(setMap.AudioAttributesCompatParcelizer.read(), setMap.AudioAttributesCompatParcelizer.read(), setMap.AudioAttributesCompatParcelizer.read(), 1779999332, -1779999328, new Object[]{this}, i);
    }

    public final int hashCode() {
        int i = setMap.AudioAttributesCompatParcelizer.read();
        return ((Integer) read(setMap.AudioAttributesCompatParcelizer.read(), setMap.AudioAttributesCompatParcelizer.read(), setMap.AudioAttributesCompatParcelizer.read(), -1249343002, 1249343014, new Object[]{this}, i)).intValue();
    }

    public final boolean MediaDescriptionCompat() {
        int i = setMap.AudioAttributesCompatParcelizer.read();
        return ((Boolean) read(setMap.AudioAttributesCompatParcelizer.read(), setMap.AudioAttributesCompatParcelizer.read(), setMap.AudioAttributesCompatParcelizer.read(), 1464953866, -1464953859, new Object[]{this}, i)).booleanValue();
    }

    public final String toString() {
        int i = setMap.AudioAttributesCompatParcelizer.read();
        return (String) read(setMap.AudioAttributesCompatParcelizer.read(), setMap.AudioAttributesCompatParcelizer.read(), setMap.AudioAttributesCompatParcelizer.read(), -1880330691, 1880330691, new Object[]{this}, i);
    }

    private static /* synthetic */ Object AudioAttributesCompatParcelizer(Object[] objArr) {
        MagicModuleDataKt magicModuleDataKt = (MagicModuleDataKt) objArr[0];
        int i = 2 % 2;
        int i2 = onAddQueueItem + 83;
        handleMediaPlayPauseIfPendingOnHandler = i2 % 128;
        if (i2 % 2 == 0) {
            String str = magicModuleDataKt.IconCompatParcelizer;
            String str2 = magicModuleDataKt.AudioAttributesImplApi21Parcelizer;
            String str3 = magicModuleDataKt.MediaMetadataCompat;
            String str4 = magicModuleDataKt.RatingCompat;
            String str5 = magicModuleDataKt.RemoteActionCompatParcelizer;
            String str6 = magicModuleDataKt.write;
            throw null;
        }
        String str7 = magicModuleDataKt.IconCompatParcelizer;
        String str8 = magicModuleDataKt.AudioAttributesImplApi21Parcelizer;
        String str9 = magicModuleDataKt.MediaMetadataCompat;
        String str10 = magicModuleDataKt.RatingCompat;
        String str11 = magicModuleDataKt.RemoteActionCompatParcelizer;
        String str12 = magicModuleDataKt.write;
        boolean z = magicModuleDataKt.AudioAttributesImplBaseParcelizer;
        String str13 = magicModuleDataKt.MediaBrowserCompatCustomActionResultReceiver;
        String str14 = magicModuleDataKt.MediaBrowserCompatSearchResultReceiver;
        String str15 = magicModuleDataKt.MediaBrowserCompatMediaItem;
        isSolved issolved = magicModuleDataKt.AudioAttributesImplApi26Parcelizer;
        FilterParamsCreator filterParamsCreator = magicModuleDataKt.AudioAttributesCompatParcelizer;
        FilterParamsCreator filterParamsCreator2 = magicModuleDataKt.read;
        int i3 = magicModuleDataKt.MediaDescriptionCompat;
        setSolved setsolved = magicModuleDataKt.MediaBrowserCompatItemReceiver;
        StringBuilder sb = new StringBuilder("NetworkParams(appValue=");
        int i4 = onAddQueueItem;
        int i5 = ((i4 & (-116)) | ((~i4) & 115)) + ((i4 & 115) << 1);
        handleMediaPlayPauseIfPendingOnHandler = i5 % 128;
        int i6 = i5 % 2;
        sb.append(str7);
        sb.append(", deviceId=");
        sb.append(str8);
        sb.append(", userAgent=");
        sb.append(str9);
        sb.append(", versionCode=");
        int i7 = onAddQueueItem;
        int i8 = (i7 & 125) + (i7 | 125);
        handleMediaPlayPauseIfPendingOnHandler = i8 % 128;
        if (i8 % 2 == 0) {
            Object obj = null;
            sb.append(str10);
            sb.append(", baseUrl=");
            sb.append(str11);
            sb.append(", cdnBaseUrl=");
            sb.append(str12);
            sb.append(", isDebug=");
            sb.append(z);
            obj.hashCode();
            throw null;
        }
        sb.append(str10);
        sb.append(", baseUrl=");
        sb.append(str11);
        sb.append(", cdnBaseUrl=");
        sb.append(str12);
        sb.append(", isDebug=");
        sb.append(z);
        int i9 = onAddQueueItem;
        int i10 = (i9 & 5) + (i9 | 5);
        handleMediaPlayPauseIfPendingOnHandler = i10 % 128;
        int i11 = i10 % 2;
        sb.append(", refreshToken=");
        sb.append(str13);
        sb.append(", token=");
        sb.append(str14);
        sb.append(", userId=");
        sb.append(str15);
        if (i11 == 0) {
            int i12 = 80 / 0;
        }
        sb.append(", errorHandler=");
        sb.append(issolved);
        sb.append(", defaultEncryptionVersion=");
        sb.append(filterParamsCreator);
        sb.append(", defaultDecryptionVersion=");
        sb.append(filterParamsCreator2);
        sb.append(", retryCount=");
        int i13 = onAddQueueItem + 49;
        handleMediaPlayPauseIfPendingOnHandler = i13 % 128;
        if (i13 % 2 == 0) {
            sb.append(i3);
            sb.append(", networkLogging=");
            sb.append(setsolved);
            sb.append(")");
            sb.toString();
            throw null;
        }
        sb.append(i3);
        sb.append(", networkLogging=");
        sb.append(setsolved);
        sb.append(")");
        String string = sb.toString();
        int i14 = onAddQueueItem;
        int i15 = ((i14 & (-76)) | ((~i14) & 75)) + ((i14 & 75) << 1);
        handleMediaPlayPauseIfPendingOnHandler = i15 % 128;
        if (i15 % 2 == 0) {
            int i16 = 90 / 0;
        }
        return string;
    }

    private static /* synthetic */ Object RemoteActionCompatParcelizer(Object[] objArr) {
        MagicModuleDataKt magicModuleDataKt = (MagicModuleDataKt) objArr[0];
        Object obj = objArr[1];
        int i = 2 % 2;
        int i2 = handleMediaPlayPauseIfPendingOnHandler;
        int i3 = i2 ^ 9;
        int i4 = ((((i2 & 9) | i3) << 1) - (~(-i3))) - 1;
        int i5 = i4 % 128;
        onAddQueueItem = i5;
        int i6 = i4 % 2;
        if (magicModuleDataKt == obj) {
            int i7 = i2 + 31;
            int i8 = i7 % 128;
            onAddQueueItem = i8;
            int i9 = i7 % 2;
            int i10 = i8 ^ 1;
            int i11 = -(-((i8 & 1) << 1));
            int i12 = (i10 & i11) + (i11 | i10);
            handleMediaPlayPauseIfPendingOnHandler = i12 % 128;
            int i13 = i12 % 2;
            return true;
        }
        if (!(obj instanceof MagicModuleDataKt)) {
            int i14 = i5 ^ 49;
            int i15 = (i5 & 49) << 1;
            int i16 = (i14 & i15) + (i14 | i15);
            int i17 = i16 % 128;
            handleMediaPlayPauseIfPendingOnHandler = i17;
            int i18 = i16 % 2;
            int i19 = i17 & 49;
            int i20 = (i17 | 49) & (~i19);
            int i21 = i19 << 1;
            int i22 = (i20 & i21) + (i20 | i21);
            onAddQueueItem = i22 % 128;
            int i23 = i22 % 2;
            return false;
        }
        MagicModuleDataKt magicModuleDataKt2 = (MagicModuleDataKt) obj;
        String str = magicModuleDataKt.IconCompatParcelizer;
        String str2 = magicModuleDataKt2.IconCompatParcelizer;
        int i24 = ((i5 | 67) << 1) - (((~i5) & 67) | (i5 & (-68)));
        handleMediaPlayPauseIfPendingOnHandler = i24 % 128;
        int i25 = i24 % 2;
        if (!toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) str, (Object) str2)) {
            int i26 = onAddQueueItem;
            int i27 = (((i26 | 14) << 1) - (i26 ^ 14)) - 1;
            int i28 = i27 % 128;
            handleMediaPlayPauseIfPendingOnHandler = i28;
            int i29 = i27 % 2;
            int i30 = i28 + 57;
            onAddQueueItem = i30 % 128;
            int i31 = i30 % 2;
            return false;
        }
        if (!toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) magicModuleDataKt.AudioAttributesImplApi21Parcelizer, (Object) magicModuleDataKt2.AudioAttributesImplApi21Parcelizer)) {
            int i32 = handleMediaPlayPauseIfPendingOnHandler;
            int i33 = (i32 & (-36)) | ((~i32) & 35);
            int i34 = (i32 & 35) << 1;
            int i35 = (i33 & i34) + (i33 | i34);
            onAddQueueItem = i35 % 128;
            int i36 = i35 % 2;
            int i37 = ((i32 | 97) << 1) - (i32 ^ 97);
            onAddQueueItem = i37 % 128;
            int i38 = i37 % 2;
            return false;
        }
        if (!toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) magicModuleDataKt.MediaMetadataCompat, (Object) magicModuleDataKt2.MediaMetadataCompat)) {
            int i39 = (-2) - ((onAddQueueItem + 22) ^ (-1));
            int i40 = i39 % 128;
            handleMediaPlayPauseIfPendingOnHandler = i40;
            int i41 = i39 % 2;
            int i42 = i40 & 95;
            int i43 = (i40 | 95) & (~i42);
            int i44 = -(-(i42 << 1));
            int i45 = (i43 ^ i44) + ((i44 & i43) << 1);
            onAddQueueItem = i45 % 128;
            if (i45 % 2 != 0) {
                int i46 = 70 / 0;
            }
            return false;
        }
        Object obj2 = null;
        if (!toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) magicModuleDataKt.RatingCompat, (Object) magicModuleDataKt2.RatingCompat)) {
            int i47 = onAddQueueItem;
            int i48 = (-2) - (((i47 & 116) + (i47 | 116)) ^ (-1));
            int i49 = i48 % 128;
            handleMediaPlayPauseIfPendingOnHandler = i49;
            int i50 = i48 % 2;
            int i51 = (((i49 | 84) << 1) - (i49 ^ 84)) - 1;
            onAddQueueItem = i51 % 128;
            if (i51 % 2 == 0) {
                return false;
            }
            throw null;
        }
        if (!toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) magicModuleDataKt.RemoteActionCompatParcelizer, (Object) magicModuleDataKt2.RemoteActionCompatParcelizer)) {
            int i52 = handleMediaPlayPauseIfPendingOnHandler;
            int i53 = i52 ^ 73;
            int i54 = ((i52 & 73) | i53) << 1;
            int i55 = -i53;
            int i56 = (i54 & i55) + (i55 | i54);
            onAddQueueItem = i56 % 128;
            int i57 = i56 % 2;
            int i58 = i52 + 7;
            onAddQueueItem = i58 % 128;
            int i59 = i58 % 2;
            return false;
        }
        if (!toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) magicModuleDataKt.write, (Object) magicModuleDataKt2.write)) {
            setMap.AudioAttributesCompatParcelizer.read();
            System.identityHashCode(magicModuleDataKt);
            int i60 = handleMediaPlayPauseIfPendingOnHandler;
            int i61 = i60 & 73;
            int i62 = i60 | 73;
            int i63 = (i61 ^ i62) + ((i62 & i61) << 1);
            onAddQueueItem = i63 % 128;
            int i64 = i63 % 2;
            return false;
        }
        if (magicModuleDataKt.AudioAttributesImplBaseParcelizer != magicModuleDataKt2.AudioAttributesImplBaseParcelizer) {
            int i65 = handleMediaPlayPauseIfPendingOnHandler;
            int i66 = i65 & 1;
            int i67 = i65 | 1;
            int i68 = (i66 & i67) + (i66 | i67);
            onAddQueueItem = i68 % 128;
            int i69 = i68 % 2;
            int i70 = ((i65 ^ 84) + ((i65 & 84) << 1)) - 1;
            onAddQueueItem = i70 % 128;
            if (i70 % 2 == 0) {
                return false;
            }
            obj2.hashCode();
            throw null;
        }
        if (!toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) magicModuleDataKt.MediaBrowserCompatCustomActionResultReceiver, (Object) magicModuleDataKt2.MediaBrowserCompatCustomActionResultReceiver)) {
            int i71 = handleMediaPlayPauseIfPendingOnHandler;
            int i72 = i71 ^ 51;
            int i73 = ((((i71 & 51) | i72) << 1) - (~(-i72))) - 1;
            onAddQueueItem = i73 % 128;
            int i74 = i73 % 2;
            int i75 = i71 + 77;
            onAddQueueItem = i75 % 128;
            if (i75 % 2 != 0) {
                int i76 = 91 / 0;
            }
            return false;
        }
        if (!toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) magicModuleDataKt.MediaBrowserCompatSearchResultReceiver, (Object) magicModuleDataKt2.MediaBrowserCompatSearchResultReceiver)) {
            int i77 = handleMediaPlayPauseIfPendingOnHandler;
            int i78 = (((i77 | 81) << 1) - (~(-(((~i77) & 81) | (i77 & (-82)))))) - 1;
            onAddQueueItem = i78 % 128;
            return Boolean.valueOf(!(i78 % 2 == 0));
        }
        if (!toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) magicModuleDataKt.MediaBrowserCompatMediaItem, (Object) magicModuleDataKt2.MediaBrowserCompatMediaItem)) {
            int i79 = onAddQueueItem;
            int i80 = i79 & 41;
            int i81 = ((((i79 ^ 41) | i80) << 1) - (~(-((~i80) & (i79 | 41))))) - 1;
            handleMediaPlayPauseIfPendingOnHandler = i81 % 128;
            int i82 = i81 % 2;
            int i83 = (i79 & (-68)) | ((~i79) & 67);
            int i84 = (i79 & 67) << 1;
            int i85 = ((i83 | i84) << 1) - (i84 ^ i83);
            handleMediaPlayPauseIfPendingOnHandler = i85 % 128;
            int i86 = i85 % 2;
            return false;
        }
        if (!toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(magicModuleDataKt.AudioAttributesImplApi26Parcelizer, magicModuleDataKt2.AudioAttributesImplApi26Parcelizer)) {
            int i87 = handleMediaPlayPauseIfPendingOnHandler;
            int i88 = (((i87 | 80) << 1) - (i87 ^ 80)) - 1;
            onAddQueueItem = i88 % 128;
            int i89 = i88 % 2;
            int i90 = (i87 ^ 11) + ((i87 & 11) << 1);
            onAddQueueItem = i90 % 128;
            if (i90 % 2 == 0) {
                return false;
            }
            throw null;
        }
        if (magicModuleDataKt.AudioAttributesCompatParcelizer != magicModuleDataKt2.AudioAttributesCompatParcelizer) {
            int i91 = onAddQueueItem;
            int i92 = (i91 & 43) + (i91 | 43);
            handleMediaPlayPauseIfPendingOnHandler = i92 % 128;
            int i93 = i92 % 2;
            return false;
        }
        if (magicModuleDataKt.read != magicModuleDataKt2.read) {
            int i94 = handleMediaPlayPauseIfPendingOnHandler + 7;
            onAddQueueItem = i94 % 128;
            return Boolean.valueOf(i94 % 2 != 0);
        }
        if (magicModuleDataKt.MediaDescriptionCompat != magicModuleDataKt2.MediaDescriptionCompat) {
            int i95 = onAddQueueItem;
            int i96 = ((i95 | 59) << 1) - (i95 ^ 59);
            handleMediaPlayPauseIfPendingOnHandler = i96 % 128;
            return Boolean.valueOf(i96 % 2 == 0);
        }
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(magicModuleDataKt.MediaBrowserCompatItemReceiver, magicModuleDataKt2.MediaBrowserCompatItemReceiver)) {
            int i97 = handleMediaPlayPauseIfPendingOnHandler + 73;
            onAddQueueItem = i97 % 128;
            if (i97 % 2 != 0) {
                int i98 = 23 / 0;
            }
            return true;
        }
        int i99 = handleMediaPlayPauseIfPendingOnHandler;
        int i100 = i99 & 105;
        int i101 = -(-(i99 | 105));
        int i102 = ((i100 | i101) << 1) - (i100 ^ i101);
        onAddQueueItem = i102 % 128;
        int i103 = i102 % 2;
        int i104 = i99 ^ 43;
        int i105 = ((i99 & 43) | i104) << 1;
        int i106 = -i104;
        int i107 = (i105 ^ i106) + ((i105 & i106) << 1);
        onAddQueueItem = i107 % 128;
        if (i107 % 2 == 0) {
            return false;
        }
        throw null;
    }

    private static /* synthetic */ Object MediaBrowserCompatCustomActionResultReceiver(Object[] objArr) {
        MagicModuleDataKt magicModuleDataKt = (MagicModuleDataKt) objArr[0];
        ((Boolean) objArr[7]).booleanValue();
        String str = (String) objArr[9];
        String str2 = (String) objArr[10];
        ((Number) objArr[14]).intValue();
        ((Number) objArr[16]).intValue();
        int i = 2 % 2;
        int i2 = onAddQueueItem;
        int i3 = ((i2 ^ 87) | (i2 & 87)) << 1;
        int i4 = -((i2 & (-88)) | ((~i2) & 87));
        int i5 = (i3 ^ i4) + ((i3 & i4) << 1);
        handleMediaPlayPauseIfPendingOnHandler = i5 % 128;
        if (i5 % 2 == 0) {
            String str3 = magicModuleDataKt.IconCompatParcelizer;
            String str4 = magicModuleDataKt.AudioAttributesImplApi21Parcelizer;
            String str5 = magicModuleDataKt.MediaMetadataCompat;
            throw null;
        }
        String str6 = magicModuleDataKt.IconCompatParcelizer;
        String str7 = magicModuleDataKt.AudioAttributesImplApi21Parcelizer;
        String str8 = magicModuleDataKt.MediaMetadataCompat;
        String str9 = magicModuleDataKt.RatingCompat;
        String str10 = magicModuleDataKt.RemoteActionCompatParcelizer;
        int i6 = ((((~i2) & 57) | (i2 & (-58))) - (~(-(-((i2 & 57) << 1))))) - 1;
        handleMediaPlayPauseIfPendingOnHandler = i6 % 128;
        if (i6 % 2 == 0) {
            String str11 = magicModuleDataKt.write;
            boolean z = magicModuleDataKt.AudioAttributesImplBaseParcelizer;
            String str12 = magicModuleDataKt.MediaBrowserCompatCustomActionResultReceiver;
            throw null;
        }
        String str13 = magicModuleDataKt.write;
        boolean z2 = magicModuleDataKt.AudioAttributesImplBaseParcelizer;
        String str14 = magicModuleDataKt.MediaBrowserCompatCustomActionResultReceiver;
        isSolved issolved = magicModuleDataKt.AudioAttributesImplApi26Parcelizer;
        FilterParamsCreator filterParamsCreator = magicModuleDataKt.AudioAttributesCompatParcelizer;
        int i7 = i2 & 81;
        int i8 = ((i2 ^ 81) | i7) << 1;
        int i9 = -((~i7) & (i2 | 81));
        int i10 = ((i8 | i9) << 1) - (i8 ^ i9);
        handleMediaPlayPauseIfPendingOnHandler = i10 % 128;
        int i11 = i10 % 2;
        FilterParamsCreator filterParamsCreator2 = magicModuleDataKt.read;
        int i12 = magicModuleDataKt.MediaDescriptionCompat;
        setSolved setsolved = magicModuleDataKt.MediaBrowserCompatItemReceiver;
        int i13 = i2 & 1;
        int i14 = ((i2 ^ 1) | i13) << 1;
        int i15 = -((~i13) & (i2 | 1));
        int i16 = (i14 & i15) + (i14 | i15);
        int i17 = i16 % 128;
        handleMediaPlayPauseIfPendingOnHandler = i17;
        int i18 = i16 % 2;
        int i19 = i17 & 119;
        int i20 = ((i17 ^ 119) | i19) << 1;
        int i21 = -((~i19) & (i17 | 119));
        int i22 = ((i20 | i21) << 1) - (i21 ^ i20);
        onAddQueueItem = i22 % 128;
        if (i22 % 2 != 0) {
            int i23 = 10 / 0;
        }
        int i24 = i17 + 15;
        onAddQueueItem = i24 % 128;
        int i25 = i24 % 2;
        MagicModuleDataKt magicModuleDataKt2 = (MagicModuleDataKt) read(setMap.AudioAttributesCompatParcelizer.read(), setMap.AudioAttributesCompatParcelizer.read(), setMap.AudioAttributesCompatParcelizer.read(), -1698160591, 1698160597, new Object[]{str6, str7, str8, str9, str10, str13, Boolean.valueOf(z2), str14, str, str2, issolved, filterParamsCreator, filterParamsCreator2, Integer.valueOf(i12), setsolved}, setMap.AudioAttributesCompatParcelizer.read());
        int i26 = handleMediaPlayPauseIfPendingOnHandler;
        int i27 = i26 & 87;
        int i28 = ((i26 | 87) & (~i27)) + (i27 << 1);
        onAddQueueItem = i28 % 128;
        int i29 = i28 % 2;
        return magicModuleDataKt2;
    }

    private static /* synthetic */ Object AudioAttributesImplBaseParcelizer(Object[] objArr) {
        String str = (String) objArr[0];
        String str2 = (String) objArr[1];
        String str3 = (String) objArr[2];
        String str4 = (String) objArr[3];
        String str5 = (String) objArr[4];
        String str6 = (String) objArr[5];
        boolean zBooleanValue = ((Boolean) objArr[6]).booleanValue();
        String str7 = (String) objArr[7];
        String str8 = (String) objArr[8];
        String str9 = (String) objArr[9];
        isSolved issolved = (isSolved) objArr[10];
        FilterParamsCreator filterParamsCreator = (FilterParamsCreator) objArr[11];
        FilterParamsCreator filterParamsCreator2 = (FilterParamsCreator) objArr[12];
        int iIntValue = ((Number) objArr[13]).intValue();
        setSolved setsolved = (setSolved) objArr[14];
        int i = 2 % 2;
        int i2 = handleMediaPlayPauseIfPendingOnHandler;
        int i3 = i2 & 9;
        int i4 = -(-((i2 ^ 9) | i3));
        int i5 = (i3 & i4) + (i3 | i4);
        onAddQueueItem = i5 % 128;
        if (i5 % 2 != 0) {
            Object obj = null;
            toMagicModuleMetaRepoModel.write(str, "");
            toMagicModuleMetaRepoModel.write(str2, "");
            obj.hashCode();
            throw null;
        }
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(str2, "");
        int i6 = handleMediaPlayPauseIfPendingOnHandler;
        int i7 = ((i6 ^ 31) | (i6 & 31)) << 1;
        int i8 = -((i6 & (-32)) | (31 & (~i6)));
        int i9 = ((i7 | i8) << 1) - (i7 ^ i8);
        onAddQueueItem = i9 % 128;
        if (i9 % 2 != 0) {
            Object obj2 = null;
            toMagicModuleMetaRepoModel.write(str3, "");
            toMagicModuleMetaRepoModel.write(str4, "");
            obj2.hashCode();
            throw null;
        }
        toMagicModuleMetaRepoModel.write(str3, "");
        toMagicModuleMetaRepoModel.write(str4, "");
        int i10 = handleMediaPlayPauseIfPendingOnHandler;
        int i11 = (((i10 | 126) << 1) - (i10 ^ 126)) - 1;
        onAddQueueItem = i11 % 128;
        int i12 = i11 % 2;
        toMagicModuleMetaRepoModel.write(str5, "");
        toMagicModuleMetaRepoModel.write(str6, "");
        int i13 = onAddQueueItem;
        int i14 = i13 & 101;
        int i15 = -(-((i13 ^ 101) | i14));
        int i16 = ((i14 | i15) << 1) - (i15 ^ i14);
        handleMediaPlayPauseIfPendingOnHandler = i16 % 128;
        int i17 = i16 % 2;
        toMagicModuleMetaRepoModel.write(filterParamsCreator, "");
        toMagicModuleMetaRepoModel.write(filterParamsCreator2, "");
        if (i17 == 0) {
            int i18 = 92 / 0;
        }
        MagicModuleDataKt magicModuleDataKt = new MagicModuleDataKt(str, str2, str3, str4, str5, str6, zBooleanValue, str7, str8, str9, issolved, filterParamsCreator, filterParamsCreator2, iIntValue, setsolved);
        int i19 = handleMediaPlayPauseIfPendingOnHandler + 115;
        onAddQueueItem = i19 % 128;
        if (i19 % 2 == 0) {
            return magicModuleDataKt;
        }
        Object obj3 = null;
        obj3.hashCode();
        throw null;
    }

    private static /* synthetic */ Object RatingCompat(Object[] objArr) {
        boolean z;
        int iHashCode;
        int iHashCode2;
        int iHashCode3;
        int iHashCode4;
        int i;
        int i2;
        int iHashCode5;
        MagicModuleDataKt magicModuleDataKt = (MagicModuleDataKt) objArr[0];
        int i3 = 2 % 2;
        int i4 = onAddQueueItem;
        int i5 = i4 ^ 117;
        int i6 = (i4 & 117) << 1;
        int i7 = ((i5 | i6) << 1) - (i6 ^ i5);
        handleMediaPlayPauseIfPendingOnHandler = i7 % 128;
        if (i7 % 2 == 0) {
            magicModuleDataKt.IconCompatParcelizer.hashCode();
            String str = magicModuleDataKt.AudioAttributesImplApi21Parcelizer;
            throw null;
        }
        int iHashCode6 = magicModuleDataKt.IconCompatParcelizer.hashCode();
        int iHashCode7 = magicModuleDataKt.AudioAttributesImplApi21Parcelizer.hashCode();
        int iHashCode8 = magicModuleDataKt.MediaMetadataCompat.hashCode();
        setMap.AudioAttributesCompatParcelizer.read();
        System.identityHashCode(magicModuleDataKt);
        int iHashCode9 = magicModuleDataKt.RatingCompat.hashCode();
        int iHashCode10 = magicModuleDataKt.RemoteActionCompatParcelizer.hashCode();
        int i8 = handleMediaPlayPauseIfPendingOnHandler;
        int i9 = i8 & 51;
        int i10 = (i9 - (~((i8 ^ 51) | i9))) - 1;
        onAddQueueItem = i10 % 128;
        int i11 = i10 % 2;
        int iHashCode11 = magicModuleDataKt.write.hashCode();
        if (i11 != 0) {
            z = magicModuleDataKt.AudioAttributesImplBaseParcelizer;
            int i12 = 3 / 0;
        } else {
            z = magicModuleDataKt.AudioAttributesImplBaseParcelizer;
        }
        int iHashCode12 = Boolean.hashCode(z);
        String str2 = magicModuleDataKt.MediaBrowserCompatCustomActionResultReceiver;
        if (str2 == null) {
            int i13 = handleMediaPlayPauseIfPendingOnHandler;
            int i14 = i13 | 117;
            int i15 = (i14 << 1) - (i14 & (~(i13 & 117)));
            onAddQueueItem = i15 % 128;
            int i16 = i15 % 2;
            int i17 = (i13 ^ 101) + ((i13 & 101) << 1);
            onAddQueueItem = i17 % 128;
            int i18 = i17 % 2;
            iHashCode = 0;
        } else {
            iHashCode = str2.hashCode();
            int i19 = handleMediaPlayPauseIfPendingOnHandler;
            int i20 = i19 ^ 125;
            int i21 = ((i19 & 125) | i20) << 1;
            int i22 = -i20;
            int i23 = (i21 & i22) + (i21 | i22);
            onAddQueueItem = i23 % 128;
            int i24 = i23 % 2;
        }
        String str3 = magicModuleDataKt.MediaBrowserCompatSearchResultReceiver;
        if (str3 == null) {
            int i25 = onAddQueueItem;
            int i26 = i25 & 87;
            int i27 = ((i25 ^ 87) | i26) << 1;
            int i28 = -((i25 | 87) & (~i26));
            int i29 = (i27 & i28) + (i28 | i27);
            int i30 = i29 % 128;
            handleMediaPlayPauseIfPendingOnHandler = i30;
            int i31 = i29 % 2;
            int i32 = i30 ^ 125;
            int i33 = -(-((i30 & 125) << 1));
            int i34 = ((i32 | i33) << 1) - (i33 ^ i32);
            onAddQueueItem = i34 % 128;
            int i35 = i34 % 2;
            iHashCode2 = 0;
        } else {
            iHashCode2 = str3.hashCode();
            System.identityHashCode(magicModuleDataKt);
            System.identityHashCode(magicModuleDataKt);
        }
        String str4 = magicModuleDataKt.MediaBrowserCompatMediaItem;
        if (str4 == null) {
            int i36 = handleMediaPlayPauseIfPendingOnHandler;
            int i37 = ((i36 & (-34)) | (33 & (~i36))) + ((i36 & 33) << 1);
            onAddQueueItem = i37 % 128;
            int i38 = i37 % 2;
            setMap.AudioAttributesCompatParcelizer.read();
            setMap.AudioAttributesCompatParcelizer.read();
            iHashCode3 = 0;
        } else {
            iHashCode3 = str4.hashCode();
            int i39 = handleMediaPlayPauseIfPendingOnHandler;
            int i40 = ((i39 ^ 10) + ((i39 & 10) << 1)) - 1;
            onAddQueueItem = i40 % 128;
            int i41 = i40 % 2;
        }
        isSolved issolved = magicModuleDataKt.AudioAttributesImplApi26Parcelizer;
        if (issolved == null) {
            setMap.AudioAttributesCompatParcelizer.read();
            System.identityHashCode(magicModuleDataKt);
            int i42 = handleMediaPlayPauseIfPendingOnHandler;
            int i43 = i42 & 39;
            int i44 = ((i42 ^ 39) | i43) << 1;
            int i45 = -((~i43) & (i42 | 39));
            int i46 = (i44 ^ i45) + ((i45 & i44) << 1);
            onAddQueueItem = i46 % 128;
            int i47 = i46 % 2;
            iHashCode4 = 0;
        } else {
            iHashCode4 = issolved.hashCode();
            int i48 = onAddQueueItem;
            int i49 = (i48 & 57) + (i48 | 57);
            handleMediaPlayPauseIfPendingOnHandler = i49 % 128;
            int i50 = i49 % 2;
        }
        int iHashCode13 = magicModuleDataKt.AudioAttributesCompatParcelizer.hashCode();
        FilterParamsCreator filterParamsCreator = magicModuleDataKt.read;
        int i51 = handleMediaPlayPauseIfPendingOnHandler;
        int i52 = (((i51 & (-50)) | ((~i51) & 49)) - (~((i51 & 49) << 1))) - 1;
        onAddQueueItem = i52 % 128;
        if (i52 % 2 != 0) {
            filterParamsCreator.hashCode();
            Integer.hashCode(magicModuleDataKt.MediaDescriptionCompat);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int iHashCode14 = filterParamsCreator.hashCode();
        int iHashCode15 = Integer.hashCode(magicModuleDataKt.MediaDescriptionCompat);
        setSolved setsolved = magicModuleDataKt.MediaBrowserCompatItemReceiver;
        if (setsolved != null) {
            int i53 = handleMediaPlayPauseIfPendingOnHandler;
            i2 = iHashCode15;
            int i54 = ((i53 ^ 29) - (~(-(-((i53 & 29) << 1))))) - 1;
            i = iHashCode14;
            onAddQueueItem = i54 % 128;
            int i55 = i54 % 2;
            iHashCode5 = setsolved.hashCode();
            if (i55 != 0) {
                int i56 = 2 / 0;
            }
        } else {
            i = iHashCode14;
            i2 = iHashCode15;
            iHashCode5 = 0;
        }
        int i57 = iHashCode6 * 31;
        int i58 = -(-iHashCode7);
        int i59 = i57 & i58;
        int i60 = (((i58 | i57) & (~i59)) + (i59 << 1)) * 31;
        int i61 = i60 ^ iHashCode8;
        int i62 = ((i60 & iHashCode8) | i61) << 1;
        int i63 = -i61;
        int i64 = (((i62 ^ i63) + ((i62 & i63) << 1)) * 31) + iHashCode9;
        int i65 = i64 * 31;
        int iIdentityHashCode = System.identityHashCode(magicModuleDataKt);
        int i66 = iHashCode10 * (-751);
        int i67 = -(-(i64 * (-23281)));
        int i68 = (((~i67) & i66) | ((~i66) & i67)) + ((i67 & i66) << 1);
        int i69 = ~iHashCode10;
        int i70 = ~iHashCode10;
        int i71 = i69 & (i70 | iHashCode10);
        int i72 = iHashCode5;
        int i73 = ((~i65) | i65) & (~i65);
        int i74 = i71 & i73;
        int i75 = (~i74) & (i71 | i73);
        int i76 = ~((i75 ^ i74) | (i75 & i74));
        int i77 = ~iHashCode10;
        int i78 = ~((i77 ^ iIdentityHashCode) | (i77 & iIdentityHashCode));
        int i79 = (i68 - (~(((i76 ^ i78) | (i76 & i78)) * 1504))) - 1;
        int i80 = i71 ^ i65;
        int i81 = i71 & i65;
        int i82 = (i81 & i80) | (i80 ^ i81);
        int i83 = -(-((~((iIdentityHashCode & i82) | (i82 ^ iIdentityHashCode))) * (-1504)));
        int i84 = i79 & i83;
        int i85 = (i84 - (~((i83 ^ i79) | i84))) - 1;
        setMap.AudioAttributesCompatParcelizer.read();
        setMap.AudioAttributesCompatParcelizer.read();
        int i86 = i65 | i70;
        int i87 = (i86 | (~i86)) & (~i86);
        int i88 = (i73 & iHashCode10) | (i73 ^ iHashCode10);
        int i89 = (i88 | (~i88)) & (~i88);
        int i90 = -(-(752 * ((i89 & i87) | (i87 ^ i89))));
        int i91 = i85 | i90;
        int i92 = ((i91 << 1) - (~(-((~(i90 & i85)) & i91)))) - 1;
        int i93 = i92 * 31;
        int i94 = setMap.AudioAttributesCompatParcelizer.read();
        int i95 = iHashCode11 * (-244);
        int i96 = i92 * 7626;
        int i97 = i95 & i96;
        int i98 = ((i95 ^ i96) | i97) << 1;
        int i99 = -((i96 | i95) & (~i97));
        int i100 = ((i98 | i99) << 1) - (i99 ^ i98);
        int i101 = ~i93;
        int i102 = ~i94;
        int i103 = (i101 ^ i102) | (i101 & i102);
        int i104 = (i103 | (~i103)) & (~i103);
        int i105 = ~i93;
        int i106 = ((~iHashCode11) & i105) | ((~i105) & iHashCode11);
        int i107 = i105 & iHashCode11;
        int i108 = (i106 & i107) | (i106 ^ i107);
        int i109 = (i108 | (~i108)) & (~i108);
        int i110 = -(~(-(-(((i104 & i109) | ((~i109) & i104) | ((~i104) & i109)) * (-245)))));
        int i111 = ((i100 ^ i110) + ((i100 & i110) << 1)) - 1;
        int i112 = (i101 & i102) | ((~i101) & i94);
        int i113 = i101 & i94;
        int i114 = (~((i113 & i112) | (i112 ^ i113))) * (-245);
        int i115 = i111 ^ i114;
        int i116 = -(-((i114 & i111) << 1));
        int i117 = (i115 ^ i116) + ((i116 & i115) << 1);
        int i118 = handleMediaPlayPauseIfPendingOnHandler;
        int i119 = ((i118 & (-32)) | ((~i118) & 31)) + ((i118 & 31) << 1);
        onAddQueueItem = i119 % 128;
        int i120 = i119 % 2;
        int i121 = i105 & i94;
        int i122 = ((i105 | i94) & (~i121)) | i121;
        int i123 = (i122 | (~i122)) & (~i122);
        int i124 = -(~(245 * ((i123 & iHashCode11) | (iHashCode11 ^ i123))));
        int i125 = (((i117 ^ i124) + ((i124 & i117) << 1)) - 1) * 31;
        int i126 = i125 & iHashCode12;
        int i127 = (i125 | iHashCode12) & (~i126);
        int i128 = i126 << 1;
        int i129 = (i127 ^ i128) + ((i128 & i127) << 1);
        int i130 = i129 * 31;
        int iIdentityHashCode2 = System.identityHashCode(magicModuleDataKt);
        int i131 = iHashCode * 450;
        int i132 = i129 * (-13888);
        int i133 = i131 & i132;
        int i134 = ((i131 ^ i132) | i133) << 1;
        int i135 = -((i132 | i131) & (~i133));
        int i136 = (i134 ^ i135) + ((i135 & i134) << 1);
        int i137 = ~iHashCode;
        int i138 = ~iHashCode;
        int i139 = i137 & (i138 | iHashCode);
        int i140 = (i139 & i130) | (i139 ^ i130);
        int i141 = ~i140;
        int i142 = ~i130;
        int i143 = (i142 & iHashCode) | (i142 ^ iHashCode);
        int i144 = ((~iIdentityHashCode2) & i143) | ((~i143) & iIdentityHashCode2);
        int i145 = i143 & iIdentityHashCode2;
        int i146 = ~((i145 & i144) | (i144 ^ i145));
        int i147 = ((~i146) & i141) | ((~i141) & i146);
        int i148 = i141 & i146;
        int i149 = -(-(((i148 & i147) | (i147 ^ i148)) * 449));
        int i150 = i136 & i149;
        int i151 = (i136 | i149) & (~i150);
        int i152 = i150 << 1;
        int i153 = (i151 ^ i152) + ((i151 & i152) << 1) + ((~i140) * (-1347));
        int i154 = i138 & i130;
        int i155 = i154 | ((~i154) & (i138 | i130));
        int i156 = handleMediaPlayPauseIfPendingOnHandler;
        int i157 = i156 ^ 111;
        int i158 = ((i156 & 111) | i157) << 1;
        int i159 = -i157;
        int i160 = (i158 & i159) + (i158 | i159);
        onAddQueueItem = i160 % 128;
        int i161 = i160 % 2;
        int i162 = ~i155;
        int i163 = ~i130;
        int i164 = ~iIdentityHashCode2;
        int i165 = i163 & i164;
        int i166 = (i163 | i164) & (~i165);
        int i167 = (i166 & i165) | (i166 ^ i165);
        int i168 = i167 & iHashCode;
        int i169 = (i167 | iHashCode) & (~i168);
        int i170 = ~((i169 & i168) | (i169 ^ i168));
        int i171 = i162 & i170;
        int i172 = 449 * (((i170 | i162) & (~i171)) | i171);
        int i173 = ((i153 | i172) << 1) - (i153 ^ i172);
        int i174 = i173 * 31;
        int i175 = setMap.AudioAttributesCompatParcelizer.read();
        int i176 = iHashCode2 * (-515);
        int i177 = -(-(i173 * 16027));
        int i178 = i176 & i177;
        int i179 = (i177 | i176) & (~i178);
        int i180 = -(-(i178 << 1));
        int i181 = (i179 & i180) + (i179 | i180);
        int i182 = ~i174;
        int i183 = ~i174;
        int i184 = i182 & (i183 | i174);
        int i185 = i184 & i175;
        int i186 = (~i185) & (i184 | i175);
        int i187 = ~i175;
        int i188 = ~((i185 & i186) | (i186 ^ i185));
        int i189 = i187 ^ iHashCode2;
        int i190 = ~iHashCode2;
        int i191 = i187 & iHashCode2;
        int i192 = ~((i189 & i191) | (i189 ^ i191));
        int i193 = i188 & i192;
        int i194 = (i188 | i192) & (~i193);
        int i195 = (i194 & i193) | (i194 ^ i193);
        int i196 = (i187 ^ i174) | (i187 & i174);
        int i197 = (i196 | (~i196)) & (~i196);
        int i198 = ((i195 & i197) | (i195 ^ i197)) * (-516);
        int i199 = i181 & i198;
        int i200 = (i181 ^ i198) | i199;
        int i201 = (i199 & i200) + (i200 | i199);
        int i202 = i184 | i190;
        int i203 = i202 & i175;
        int i204 = ~(((i202 | i175) & (~i203)) | i203);
        int i205 = onAddQueueItem;
        int i206 = (i205 & (-76)) | ((~i205) & 75);
        int i207 = (i205 & 75) << 1;
        int i208 = (i206 & i207) + (i207 | i206);
        handleMediaPlayPauseIfPendingOnHandler = i208 % 128;
        int i209 = i208 % 2;
        int i210 = ~iHashCode2;
        int i211 = ((~i187) & i210) | ((~i210) & i187);
        int i212 = i210 & i187;
        int i213 = (i212 & i211) | (i211 ^ i212);
        int i214 = ~((i213 & i174) | (i213 ^ i174));
        int i215 = i204 & i214;
        int i216 = (i204 | i214) & (~i215);
        int i217 = ((i216 & i215) | (i216 ^ i215)) * 516;
        int i218 = i201 & i217;
        int i219 = ((i201 ^ i217) | i218) << 1;
        int i220 = -((i217 | i201) & (~i218));
        int i221 = (i219 & i220) + (i220 | i219);
        int i222 = i190 & i174;
        int i223 = (~i222) & (i190 | i174);
        int i224 = ~((i222 & i223) | (i223 ^ i222));
        int i225 = (i175 | i187) & (~i175);
        int i226 = ~((i174 & i225) | (i183 & i225) | ((~i225) & i174));
        int i227 = i224 & i226;
        int i228 = (i224 | i226) & (~i227);
        int i229 = -(-(((i228 & i227) | (i228 ^ i227)) * 516));
        int i230 = i221 & i229;
        int i231 = (i229 | i221) & (~i230);
        int i232 = -(-(i230 << 1));
        int i233 = ((i231 | i232) << 1) - (i231 ^ i232);
        int i234 = i233 * 31;
        int iIdentityHashCode3 = System.identityHashCode(magicModuleDataKt);
        int i235 = iHashCode3 * 371;
        int i236 = i233 * 11501;
        int i237 = ((i235 | i236) << 1) - (i236 ^ i235);
        int i238 = ~i234;
        int i239 = ~iIdentityHashCode3;
        int i240 = i238 & i239;
        int i241 = (~i240) & (i238 | i239);
        int i242 = ~((i240 & i241) | (i241 ^ i240));
        int i243 = ~iHashCode3;
        int i244 = (i239 & i243) | ((~i243) & iIdentityHashCode3);
        int i245 = i243 & iIdentityHashCode3;
        int i246 = (i244 & i245) | (i244 ^ i245);
        int i247 = (i246 | (~i246)) & (~i246);
        int i248 = ((~i247) & i242) | ((~i242) & i247);
        int i249 = i247 & i242;
        int i250 = ((i249 & i248) | (i248 ^ i249)) * (-370);
        int i251 = (i237 & i250) + (i250 | i237);
        int i252 = onAddQueueItem + 121;
        handleMediaPlayPauseIfPendingOnHandler = i252 % 128;
        int i253 = i252 % 2;
        int i254 = ~iIdentityHashCode3;
        int i255 = ((~i254) & i243) | ((~i243) & i254);
        int i256 = i254 & i243;
        int i257 = ~((i256 & i255) | (i255 ^ i256));
        int i258 = ~i234;
        int i259 = ~((iIdentityHashCode3 & i258) | (i258 ^ iIdentityHashCode3));
        int i260 = (i259 & i257) | (i257 ^ i259);
        int i261 = iHashCode3 ^ i234;
        int i262 = iHashCode3 & i234;
        int i263 = ~((i261 & i262) | (i261 ^ i262));
        int i264 = i260 & i263;
        int i265 = (i260 | i263) & (~i264);
        int i266 = (i251 - (~(((i265 & i264) | (i265 ^ i264)) * (-370)))) - 1;
        int i267 = (~((i234 & i243) | (iHashCode3 & i238) | i262)) * 370;
        int i268 = i266 & i267;
        int i269 = (i267 | i266) & (~i268);
        int i270 = i268 << 1;
        int i271 = ((i269 & i270) + (i269 | i270)) * 31;
        int i272 = -(-iHashCode4);
        int i273 = i271 ^ i272;
        int i274 = -(-((i272 & i271) << 1));
        int i275 = ((i273 | i274) << 1) - (i274 ^ i273);
        int i276 = i275 * 31;
        int i277 = setMap.AudioAttributesCompatParcelizer.read();
        int i278 = iHashCode13 * 141;
        int i279 = i275 * (-4309);
        int i280 = i278 & i279;
        int i281 = (i279 | i278) & (~i280);
        int i282 = -(-(i280 << 1));
        int i283 = (i281 ^ i282) + ((i281 & i282) << 1);
        int i284 = ~iHashCode13;
        int i285 = ~i284;
        int i286 = i284 ^ i276;
        int i287 = ~i276;
        int i288 = i284 & i276;
        int i289 = ~((i286 & i288) | (i286 ^ i288));
        int i290 = ~iHashCode13;
        int i291 = handleMediaPlayPauseIfPendingOnHandler;
        int i292 = i291 & 27;
        int i293 = i291 | 27;
        int i294 = (i292 ^ i293) + ((i293 & i292) << 1);
        onAddQueueItem = i294 % 128;
        int i295 = i294 % 2;
        int i296 = ~i277;
        int i297 = (i290 & i296) | ((~i290) & i277) | (i290 & i277);
        int i298 = (i297 | (~i297)) & (~i297);
        int i299 = (-280) * ((i289 & i298) | (i289 ^ i298));
        int i300 = i283 ^ i299;
        int i301 = -(-((i283 & i299) << 1));
        int i302 = (i300 & i301) + (i301 | i300);
        int i303 = (i285 & i277) | (i284 & i296);
        int i304 = i284 & i277;
        int i305 = (i303 & i304) | (i303 ^ i304);
        int i306 = (i305 | (~i305)) & (~i305);
        int i307 = i287 | i276;
        int i308 = (~i276) & i307;
        int i309 = i308 ^ i277;
        int i310 = i308 & i277;
        int i311 = (i310 & i309) | (i309 ^ i310);
        int i312 = (i311 | (~i311)) & (~i311);
        int i313 = i306 & i312;
        int i314 = (i306 | i312) & (~i313);
        int i315 = ((i314 & i313) | (i314 ^ i313)) * 140;
        int i316 = (i302 ^ i315) + ((i315 & i302) << 1);
        int i317 = ~iHashCode13;
        int i318 = (i317 & i287) | (i317 ^ i287);
        int i319 = ~((i318 & i277) | (i318 ^ i277));
        int i320 = (~i277) & (i296 | i277);
        int i321 = ((~i320) & i284) | ((~i284) & i320);
        int i322 = i284 & i320;
        int i323 = (i322 & i321) | (i321 ^ i322);
        int i324 = i323 & i276;
        int i325 = (i323 | i276) & (~i324);
        int i326 = (~((i325 & i324) | (i325 ^ i324))) | i319;
        int i327 = (~i276) & i307;
        int i328 = ~i277;
        int i329 = (i327 & i328) | (i327 ^ i328);
        int i330 = (i329 & i290) | ((~i329) & iHashCode13);
        int i331 = i329 & iHashCode13;
        int i332 = (i331 & i330) | (i330 ^ i331);
        int i333 = (i332 | (~i332)) & (~i332);
        int i334 = i326 & i333;
        int i335 = i316 & ((((i333 | i326) & (~i334)) | i334) * 140);
        int i336 = ((i335 - (~(-(-((r0 ^ i316) | i335))))) - 1) * 31;
        int i337 = -(-i);
        int i338 = i336 & i337;
        int i339 = ((i336 ^ i337) | i338) << 1;
        int i340 = -((i337 | i336) & (~i338));
        int i341 = (i339 ^ i340) + ((i340 & i339) << 1);
        int i342 = i341 * 31;
        int iIdentityHashCode4 = System.identityHashCode(magicModuleDataKt);
        int i343 = onAddQueueItem;
        int i344 = (-2) - ((((i343 | 84) << 1) - (i343 ^ 84)) ^ (-1));
        int i345 = i344 % 128;
        handleMediaPlayPauseIfPendingOnHandler = i345;
        int i346 = i344 % 2;
        int i347 = i2;
        int i348 = i347 * (-129);
        int i349 = -(-(i341 * 4061));
        int i350 = i348 & i349;
        int i351 = (i350 - (~(-(-((i349 ^ i348) | i350))))) - 1;
        int i352 = ~i342;
        int i353 = ~iIdentityHashCode4;
        int i354 = (i353 & i352) | ((~i353) & i352) | ((~i352) & i353);
        int i355 = (~((i354 & i347) | (i354 ^ i347))) * TsExtractor.TS_STREAM_TYPE_HDMV_DTS;
        int i356 = i351 & i355;
        int i357 = (i355 | i351) & (~i356);
        int i358 = -(-(i356 << 1));
        int i359 = (i357 & i358) + (i357 | i358);
        int i360 = ~i347;
        int i361 = -(-((~((i352 ^ i347) | (i352 & i347))) * (-260)));
        int i362 = (((i359 ^ i361) | (i359 & i361)) << 1) - ((i361 & (~i359)) | ((~i361) & i359));
        int i363 = (i342 & i360) | (i360 & i352) | ((~i360) & i342);
        int i364 = (i363 | (~i363)) & (~i363);
        int i365 = (i352 & i347) | (i352 & i360) | ((~i352) & i347);
        int i366 = ~((iIdentityHashCode4 & i365) | (i365 ^ iIdentityHashCode4));
        int i367 = ((~i366) & i364) | ((~i364) & i366);
        int i368 = i364 & i366;
        int i369 = (i362 + (((i368 & i367) | (i367 ^ i368)) * TsExtractor.TS_STREAM_TYPE_HDMV_DTS)) * 31;
        int i370 = -(-i72);
        int i371 = ((i369 | i370) << 1) - (i370 ^ i369);
        int i372 = i345 + 3;
        onAddQueueItem = i372 % 128;
        int i373 = i372 % 2;
        return Integer.valueOf(i371);
    }
}
