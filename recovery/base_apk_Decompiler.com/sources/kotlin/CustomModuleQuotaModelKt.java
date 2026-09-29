package kotlin;

import android.content.Context;
import in.juspay.hyper.constants.LogCategory;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00052\b\u0010\t\u001a\u0004\u0018\u00010\u0005J\u001e\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u0005J6\u0010\r\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u0012J(\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J0\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J(\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J0\u0010\u0019\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J \u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u00052\u0006\u0010\u001d\u001a\u00020\u00052\u0006\u0010\u001e\u001a\u00020\u0005H\u0002J$\u0010\u001f\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u00052\u0006\u0010\u001d\u001a\u00020\u00052\n\u0010 \u001a\u00060!j\u0002`\"H\u0002J7\u0010#\u001a\u0002H$\"\u0004\b\u0000\u0010$2\f\u0010%\u001a\b\u0012\u0004\u0012\u0002H$0&2\f\u0010'\u001a\b\u0012\u0004\u0012\u0002H$0&2\u0006\u0010(\u001a\u00020\u0005H\u0002¢\u0006\u0002\u0010)¨\u0006*"}, d2 = {"Lorg/dailyrounds/crypto/CryptoHelper;", "", "<init>", "()V", "encrypt", "", "encryptionVersion", "Lorg/dailyrounds/crypto/CryptoType;", "salt", "plain", "decryptLegacy", "decryptVersion", "encryptedPayload", "decrypt", LogCategory.CONTEXT, "Landroid/content/Context;", "requestUrl", "isNativeAesDecryptEnabled", "", "decrypt44", "input", "decrypt45", "locale", "crypto44ReleaseDecrypt", "inputUrl", "crypto45ReleaseDecrypt", "log", "", "milestone", "simplifiedUrl", "msg", "logFailed", "ex", "Ljava/lang/Exception;", "Lkotlin/Exception;", "doOrFallback", "T", "primaryAction", "Lkotlin/Function0;", "secondaryAction", "tag", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Ljava/lang/String;)Ljava/lang/Object;", "crypto_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CustomModuleQuotaModelKt {
    public static final CustomModuleQuotaModelKt read = new CustomModuleQuotaModelKt();

    public static final /* synthetic */ class read {
        public static final /* synthetic */ int[] RemoteActionCompatParcelizer;

        static {
            int[] iArr = new int[FilterParamsCreator.values().length];
            try {
                iArr[FilterParamsCreator.read.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[FilterParamsCreator.RemoteActionCompatParcelizer.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[FilterParamsCreator.IconCompatParcelizer.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[FilterParamsCreator.AudioAttributesImplApi26Parcelizer.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[FilterParamsCreator.MediaBrowserCompatItemReceiver.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            RemoteActionCompatParcelizer = iArr;
        }
    }

    private CustomModuleQuotaModelKt() {
    }

    public static String AudioAttributesCompatParcelizer(FilterParamsCreator filterParamsCreator, String str, String str2) {
        toMagicModuleMetaRepoModel.write(filterParamsCreator, "");
        toMagicModuleMetaRepoModel.write(str, "");
        if (str2 == null) {
            return "";
        }
        int i = read.RemoteActionCompatParcelizer[filterParamsCreator.ordinal()];
        if (i == 1) {
            String str3 = AuthBridgeOtpResponseBody.read(str, str2);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(str3, "");
            return str3;
        }
        if (i != 2) {
            return i != 3 ? str2 : AliasesKt.write(str, str2);
        }
        String strRemoteActionCompatParcelizer = KycUploadRequestBody.RemoteActionCompatParcelizer(str2);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(strRemoteActionCompatParcelizer, "");
        return strRemoteActionCompatParcelizer;
    }

    public static String RemoteActionCompatParcelizer(FilterParamsCreator filterParamsCreator, String str, String str2) {
        toMagicModuleMetaRepoModel.write(filterParamsCreator, "");
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(str2, "");
        int i = read.RemoteActionCompatParcelizer[filterParamsCreator.ordinal()];
        if (i == 1) {
            String strRemoteActionCompatParcelizer = getVideoThreshold.RemoteActionCompatParcelizer(str, str2);
            toMagicModuleMetaRepoModel.write((Object) strRemoteActionCompatParcelizer);
            return strRemoteActionCompatParcelizer;
        }
        if (i == 2) {
            String strAudioAttributesCompatParcelizer = AuthBridgeOtpVerifyRequestBody.AudioAttributesCompatParcelizer(str, str2);
            toMagicModuleMetaRepoModel.write((Object) strAudioAttributesCompatParcelizer);
            return strAudioAttributesCompatParcelizer;
        }
        if (i != 3) {
            return str2;
        }
        AuthBridgeOtpRequestBody authBridgeOtpRequestBody = AuthBridgeOtpRequestBody.INSTANCE;
        return AuthBridgeOtpRequestBody.AudioAttributesCompatParcelizer(str, str2);
    }

    public final String write(Context context, FilterParamsCreator filterParamsCreator, String str, String str2, String str3, boolean z) {
        toMagicModuleMetaRepoModel.write(context, "");
        toMagicModuleMetaRepoModel.write(filterParamsCreator, "");
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(str2, "");
        toMagicModuleMetaRepoModel.write(str3, "");
        int i = read.RemoteActionCompatParcelizer[filterParamsCreator.ordinal()];
        if (i == 4) {
            return write(context, str3, str, z);
        }
        if (i == 5) {
            return AudioAttributesCompatParcelizer(context, str3, str2, str, z);
        }
        return RemoteActionCompatParcelizer(filterParamsCreator, str2, str3);
    }

    private final String write(Context context, String str, String str2, boolean z) {
        return AudioAttributesCompatParcelizer(context, str, str2, z);
    }

    private final String AudioAttributesCompatParcelizer(Context context, String str, String str2, String str3, boolean z) {
        return IconCompatParcelizer(context, str, str3, str2, z);
    }

    private final String AudioAttributesCompatParcelizer(final Context context, final String str, String str2, boolean z) throws getNoOfQuestions {
        String strWrite;
        final setTestId settestid = new setTestId();
        String str3 = TestGroupLSModel.read(str2, "v3.1/", str2);
        TestGroupLSModel.write(str3, "?", str3);
        try {
            if (z) {
                strWrite = (String) RemoteActionCompatParcelizer(new getCreatedOnDateMs() { // from class: o.getCategoryTypes
                    @Override // kotlin.getCreatedOnDateMs
                    public final Object invoke() {
                        return CustomModuleQuotaModelKt.IconCompatParcelizer(settestid, context, str);
                    }
                }, new getCreatedOnDateMs() { // from class: o.getDifficulty
                    @Override // kotlin.getCreatedOnDateMs
                    public final Object invoke() {
                        return CustomModuleQuotaModelKt.RemoteActionCompatParcelizer(settestid, context, str);
                    }
                });
            } else {
                strWrite = settestid.write(context, str);
                toMagicModuleMetaRepoModel.write((Object) strWrite);
            }
            return strWrite;
        } catch (Exception e) {
            throw new getNoOfQuestions(e, null, null, 6, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String IconCompatParcelizer(setTestId settestid, Context context, String str) {
        String str2 = settestid.read(context, str);
        toMagicModuleMetaRepoModel.write((Object) str2);
        return str2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String RemoteActionCompatParcelizer(setTestId settestid, Context context, String str) {
        String strWrite = settestid.write(context, str);
        toMagicModuleMetaRepoModel.write((Object) strWrite);
        return strWrite;
    }

    private final String IconCompatParcelizer(final Context context, final String str, String str2, final String str3, boolean z) throws getNoOfQuestions {
        String strOnCommand;
        final setTestId settestid = new setTestId();
        String str4 = TestGroupLSModel.read(str2, "v3.1/", str2);
        TestGroupLSModel.write(str4, "?", str4);
        try {
            if (z) {
                strOnCommand = (String) RemoteActionCompatParcelizer(new getCreatedOnDateMs() { // from class: o.getRootSubjects
                    @Override // kotlin.getCreatedOnDateMs
                    public final Object invoke() {
                        return CustomModuleQuotaModelKt.write(settestid, context, str, str3);
                    }
                }, new getCreatedOnDateMs() { // from class: o.getMode
                    @Override // kotlin.getCreatedOnDateMs
                    public final Object invoke() {
                        return CustomModuleQuotaModelKt.IconCompatParcelizer(settestid, context, str, str3);
                    }
                });
            } else {
                strOnCommand = settestid.onCommand(context, str, str3);
                toMagicModuleMetaRepoModel.write((Object) strOnCommand);
            }
            return strOnCommand;
        } catch (Exception e) {
            throw new getNoOfQuestions(e, null, null, 6, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String write(setTestId settestid, Context context, String str, String str2) {
        String strOnPlay = settestid.onPlay(context, str, str2);
        toMagicModuleMetaRepoModel.write((Object) strOnPlay);
        return strOnPlay;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String IconCompatParcelizer(setTestId settestid, Context context, String str, String str2) {
        String strOnCommand = settestid.onCommand(context, str, str2);
        toMagicModuleMetaRepoModel.write((Object) strOnCommand);
        return strOnCommand;
    }

    private static <T> T RemoteActionCompatParcelizer(getCreatedOnDateMs<? extends T> getcreatedondatems, getCreatedOnDateMs<? extends T> getcreatedondatems2) {
        try {
            return getcreatedondatems.invoke();
        } catch (Exception unused) {
            return getcreatedondatems2.invoke();
        }
    }
}
