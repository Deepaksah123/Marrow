package kotlin;

import android.content.Context;
import in.juspay.hyper.constants.LogCategory;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\b\u0000\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tJ\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tJ&\u0010\f\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\tJ\u001e\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\tJ\u0016\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tJ\u0018\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\tH\u0007J\"\u0010\u0018\u001a\u00020\t2\u0006\u0010\u0019\u001a\u00020\u001a2\b\b\u0002\u0010\u0010\u001a\u00020\t2\b\b\u0002\u0010\b\u001a\u00020\t¨\u0006\u001c"}, d2 = {"Lcom/clevertap/android/sdk/StoreProvider;", "", "<init>", "()V", "provideInAppAssetsStore", "Lcom/clevertap/android/sdk/inapp/store/preference/InAppAssetsStore;", LogCategory.CONTEXT, "Landroid/content/Context;", "accountId", "", "provideFileStore", "Lcom/clevertap/android/sdk/inapp/store/preference/FileStore;", "provideInAppStore", "Lcom/clevertap/android/sdk/inapp/store/preference/InAppStore;", "cryptHandler", "Lcom/clevertap/android/sdk/cryption/CryptHandler;", "deviceId", "provideImpressionStore", "Lcom/clevertap/android/sdk/inapp/store/preference/ImpressionStore;", "provideLegacyInAppStore", "Lcom/clevertap/android/sdk/inapp/store/preference/LegacyInAppStore;", "getCTPreference", "Lcom/clevertap/android/sdk/store/preference/CTPreference;", "prefName", "constructStorePreferenceName", "storeType", "", "Companion", "clevertap-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class RendererCapabilitiesDecoderSupport {
    public static final read read = new read(null);
    private static volatile RendererCapabilitiesDecoderSupport write;

    /* JADX INFO: loaded from: classes2.dex */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u0007"}, d2 = {"Lo/RendererCapabilitiesDecoderSupport$read;", "", "<init>", "()V", "Lo/RendererCapabilitiesDecoderSupport;", "write", "()Lo/RendererCapabilitiesDecoderSupport;", "Lo/RendererCapabilitiesDecoderSupport;", "AudioAttributesCompatParcelizer"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class read {
        private read() {
        }

        @getMagicModuleMeta
        public final RendererCapabilitiesDecoderSupport write() {
            RendererCapabilitiesDecoderSupport rendererCapabilitiesDecoderSupport;
            RendererCapabilitiesDecoderSupport rendererCapabilitiesDecoderSupport2 = RendererCapabilitiesDecoderSupport.write;
            if (rendererCapabilitiesDecoderSupport2 != null) {
                return rendererCapabilitiesDecoderSupport2;
            }
            synchronized (this) {
                rendererCapabilitiesDecoderSupport = RendererCapabilitiesDecoderSupport.write;
                if (rendererCapabilitiesDecoderSupport == null) {
                    rendererCapabilitiesDecoderSupport = new RendererCapabilitiesDecoderSupport();
                    read readVar = RendererCapabilitiesDecoderSupport.read;
                    RendererCapabilitiesDecoderSupport.write = rendererCapabilitiesDecoderSupport;
                }
            }
            return rendererCapabilitiesDecoderSupport;
        }

        public /* synthetic */ read(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }

    public final setUid write(Context context, String str) {
        toMagicModuleMetaRepoModel.write(context, "");
        toMagicModuleMetaRepoModel.write(str, "");
        return new setUid(AudioAttributesCompatParcelizer(context, read(4, null, str, 2)));
    }

    public final setWindowStartTimeMs read(Context context, String str) {
        toMagicModuleMetaRepoModel.write(context, "");
        toMagicModuleMetaRepoModel.write(str, "");
        return new setWindowStartTimeMs(AudioAttributesCompatParcelizer(context, read(5, null, str, 2)));
    }

    public static access6500 IconCompatParcelizer(Context context, getPeriodIndexFromWindowPosition getperiodindexfromwindowposition, String str, String str2) {
        toMagicModuleMetaRepoModel.write(context, "");
        toMagicModuleMetaRepoModel.write(getperiodindexfromwindowposition, "");
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(str2, "");
        return new access6500(AudioAttributesCompatParcelizer(context, RemoteActionCompatParcelizer(1, str, str2)), getperiodindexfromwindowposition);
    }

    public static setTracks read(Context context, String str, String str2) {
        toMagicModuleMetaRepoModel.write(context, "");
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(str2, "");
        return new setTracks(AudioAttributesCompatParcelizer(context, RemoteActionCompatParcelizer(2, str, str2)));
    }

    public final access6700 RemoteActionCompatParcelizer(Context context, String str) {
        toMagicModuleMetaRepoModel.write(context, "");
        toMagicModuleMetaRepoModel.write(str, "");
        return new access6700(AudioAttributesCompatParcelizer(context, read(3, null, null, 6)), str);
    }

    private static TimelineWindowExternalSyntheticLambda0 AudioAttributesCompatParcelizer(Context context, String str) {
        toMagicModuleMetaRepoModel.write(context, "");
        toMagicModuleMetaRepoModel.write(str, "");
        return new TimelineWindowExternalSyntheticLambda0(context, str);
    }

    private static /* synthetic */ String read(int i, String str, String str2, int i2) {
        if ((i2 & 2) != 0) {
            str = "";
        }
        if ((i2 & 4) != 0) {
            str2 = "";
        }
        return RemoteActionCompatParcelizer(i, str, str2);
    }

    public static String RemoteActionCompatParcelizer(int i, String str, String str2) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(str2, "");
        if (i == 1) {
            StringBuilder sb = new StringBuilder("inApp:");
            sb.append(str);
            sb.append(':');
            sb.append(str2);
            return sb.toString();
        }
        if (i == 2) {
            StringBuilder sb2 = new StringBuilder("counts_per_inapp:");
            sb2.append(str);
            sb2.append(':');
            sb2.append(str2);
            return sb2.toString();
        }
        if (i == 3) {
            return "WizRocket";
        }
        if (i == 4) {
            return "inapp_assets:".concat(String.valueOf(str2));
        }
        if (i != 5) {
            return "WizRocket";
        }
        return "ct_files:".concat(String.valueOf(str2));
    }

    @getMagicModuleMeta
    public static final RendererCapabilitiesDecoderSupport read() {
        return read.write();
    }
}
