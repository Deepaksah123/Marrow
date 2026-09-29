package kotlin;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import com.clevertap.android.sdk.CleverTapInstanceConfig;
import in.juspay.hyper.constants.LogCategory;
import in.juspay.hypersdk.core.PaymentConstants;
import java.lang.ref.WeakReference;
import java.util.List;
import kotlin.Metadata;
import kotlin.getTunnelingSupport;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0015\n\u0002\b\b\b\u0000\u0018\u0000 ,2\u00020\u0001:\u0004*+,-BO\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0010\u0010\u0004\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\u000e\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u000bJ\u000e\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0016\u001a\u00020\u000bJ\u000e\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0016\u001a\u00020\u000bJ(\u0010\u001a\u001a\u00020\u00142\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u00142\u0006\u0010\u001e\u001a\u00020\u001f2\b\b\u0002\u0010 \u001a\u00020\u0014J\u0016\u0010\u001a\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0014J\u000e\u0010!\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001cJ\u001e\u0010\"\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&J\u0010\u0010'\u001a\u00020\u00182\u0006\u0010(\u001a\u00020\u0014H\u0002J\u0010\u0010)\u001a\u00020\u00182\u0006\u0010(\u001a\u00020\u0014H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\u0004\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006."}, d2 = {"Lcom/clevertap/android/sdk/PushPermissionHandler;", "", PaymentConstants.Category.CONFIG, "Lcom/clevertap/android/sdk/CleverTapInstanceConfig;", "ctListeners", "", "Lcom/clevertap/android/sdk/PushPermissionResponseListener;", "callback", "Lcom/clevertap/android/sdk/PushPermissionHandler$PushPermissionResultCallback;", "cacheProvider", "Lkotlin/Function1;", "Landroid/content/Context;", "Lcom/clevertap/android/sdk/CTPreferenceCache;", "systemPermissionInterface", "Lcom/clevertap/android/sdk/PushPermissionHandler$SystemPushPermissionInterface;", "<init>", "(Lcom/clevertap/android/sdk/CleverTapInstanceConfig;Ljava/util/List;Lcom/clevertap/android/sdk/PushPermissionHandler$PushPermissionResultCallback;Lkotlin/jvm/functions/Function1;Lcom/clevertap/android/sdk/PushPermissionHandler$SystemPushPermissionInterface;)V", "pushPermissionCallback", "Ljava/lang/ref/WeakReference;", "isFromNotificationSettingsActivity", "", "isPushPermissionGranted", LogCategory.CONTEXT, "notifyPushPermissionListeners", "", "notifyPushPermissionExternalListeners", "requestPermission", "activity", "Landroid/app/Activity;", "fallbackToSettings", "requestCallback", "Lcom/clevertap/android/sdk/PushPermissionHandler$PushPermissionRequestCallback;", "alwaysRequestIfNotGranted", "onActivityResume", "onRequestPermissionsResult", "requestCode", "", "grantResults", "", "notifyListeners", "isPermissionGranted", "notifyExternalListeners", "PushPermissionResultCallback", "PushPermissionRequestCallback", "Companion", "SystemPushPermissionInterface", "clevertap-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class getTunnelingSupport {
    public static final read RemoteActionCompatParcelizer = new read(null);
    private boolean AudioAttributesCompatParcelizer;
    private final WeakReference<AudioAttributesCompatParcelizer> AudioAttributesImplApi21Parcelizer;
    private final IconCompatParcelizer AudioAttributesImplBaseParcelizer;
    private final List<getFormatSupport> IconCompatParcelizer;
    private final getAnswerMap<Context, PlayerEvent> read;
    private final CleverTapInstanceConfig write;

    public interface AudioAttributesCompatParcelizer {
        void read();
    }

    public interface IconCompatParcelizer {
        boolean AudioAttributesCompatParcelizer(Activity activity);

        boolean AudioAttributesCompatParcelizer(Context context);

        void IconCompatParcelizer(Activity activity);

        void write(Activity activity);
    }

    public interface RemoteActionCompatParcelizer {
        void IconCompatParcelizer();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private getTunnelingSupport(CleverTapInstanceConfig cleverTapInstanceConfig, List<? extends getFormatSupport> list, AudioAttributesCompatParcelizer audioAttributesCompatParcelizer, getAnswerMap<? super Context, PlayerEvent> getanswermap, IconCompatParcelizer iconCompatParcelizer) {
        toMagicModuleMetaRepoModel.write(cleverTapInstanceConfig, "");
        toMagicModuleMetaRepoModel.write(getanswermap, "");
        toMagicModuleMetaRepoModel.write(iconCompatParcelizer, "");
        this.write = cleverTapInstanceConfig;
        this.IconCompatParcelizer = list;
        this.read = getanswermap;
        this.AudioAttributesImplBaseParcelizer = iconCompatParcelizer;
        this.AudioAttributesImplApi21Parcelizer = new WeakReference<>(audioAttributesCompatParcelizer);
    }

    public /* synthetic */ getTunnelingSupport(CleverTapInstanceConfig cleverTapInstanceConfig, List list, AudioAttributesCompatParcelizer audioAttributesCompatParcelizer, getAnswerMap getanswermap, IconCompatParcelizer iconCompatParcelizer, int i, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this(cleverTapInstanceConfig, list, (i & 4) != 0 ? null : audioAttributesCompatParcelizer, (i & 8) != 0 ? read.RemoteActionCompatParcelizer(cleverTapInstanceConfig) : getanswermap, (i & 16) != 0 ? read.AudioAttributesCompatParcelizer() : iconCompatParcelizer);
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\r"}, d2 = {"Lo/getTunnelingSupport$read;", "", "<init>", "()V", "Lcom/clevertap/android/sdk/CleverTapInstanceConfig;", "p0", "Lkotlin/Function1;", "Landroid/content/Context;", "Lo/PlayerEvent;", "RemoteActionCompatParcelizer", "(Lcom/clevertap/android/sdk/CleverTapInstanceConfig;)Lo/getAnswerMap;", "Lo/getTunnelingSupport$IconCompatParcelizer;", "AudioAttributesCompatParcelizer", "()Lo/getTunnelingSupport$IconCompatParcelizer;"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class read {
        private read() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static getAnswerMap<Context, PlayerEvent> RemoteActionCompatParcelizer(final CleverTapInstanceConfig p0) {
            return new getAnswerMap() { // from class: o.getHardwareAccelerationSupport
                @Override // kotlin.getAnswerMap
                public final Object invoke(Object obj) {
                    return getTunnelingSupport.read.read(p0, (Context) obj);
                }
            };
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final PlayerEvent read(CleverTapInstanceConfig cleverTapInstanceConfig, Context context) {
            toMagicModuleMetaRepoModel.write(cleverTapInstanceConfig, "");
            toMagicModuleMetaRepoModel.write(context, "");
            return PlayerEvent.INSTANCE.write(context, cleverTapInstanceConfig);
        }

        public static final class write implements IconCompatParcelizer {
            write() {
            }

            @Override // o.getTunnelingSupport.IconCompatParcelizer
            public final boolean AudioAttributesCompatParcelizer(Context context) {
                toMagicModuleMetaRepoModel.write(context, "");
                return _isNaN.checkSelfPermission(context, "android.permission.POST_NOTIFICATIONS") == 0;
            }

            @Override // o.getTunnelingSupport.IconCompatParcelizer
            public final void IconCompatParcelizer(Activity activity) {
                toMagicModuleMetaRepoModel.write(activity, "");
                _checkBooleanToStringCoercion.AudioAttributesCompatParcelizer(activity, new String[]{"android.permission.POST_NOTIFICATIONS"}, 102);
            }

            @Override // o.getTunnelingSupport.IconCompatParcelizer
            public final void write(Activity activity) {
                toMagicModuleMetaRepoModel.write(activity, "");
                RendererCapabilitiesListener.read((Context) activity);
            }

            @Override // o.getTunnelingSupport.IconCompatParcelizer
            public final boolean AudioAttributesCompatParcelizer(Activity activity) {
                toMagicModuleMetaRepoModel.write(activity, "");
                return _checkBooleanToStringCoercion.write(activity, "android.permission.POST_NOTIFICATIONS");
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static IconCompatParcelizer AudioAttributesCompatParcelizer() {
            return new write();
        }

        public /* synthetic */ read(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }

    public final boolean AudioAttributesCompatParcelizer(Context context) {
        toMagicModuleMetaRepoModel.write(context, "");
        return this.AudioAttributesImplBaseParcelizer.AudioAttributesCompatParcelizer(context);
    }

    public final void IconCompatParcelizer(Context context) {
        toMagicModuleMetaRepoModel.write(context, "");
        AudioAttributesCompatParcelizer(AudioAttributesCompatParcelizer(context));
    }

    public final void RemoteActionCompatParcelizer(Context context) {
        toMagicModuleMetaRepoModel.write(context, "");
        AudioAttributesCompatParcelizer(context);
        AudioAttributesCompatParcelizer();
    }

    private static /* synthetic */ boolean IconCompatParcelizer(getTunnelingSupport gettunnelingsupport, Activity activity, boolean z, RemoteActionCompatParcelizer remoteActionCompatParcelizer) {
        return gettunnelingsupport.read(activity, z, remoteActionCompatParcelizer, false);
    }

    public final boolean read(Activity activity, boolean z, RemoteActionCompatParcelizer remoteActionCompatParcelizer, boolean z2) {
        toMagicModuleMetaRepoModel.write(activity, "");
        toMagicModuleMetaRepoModel.write(remoteActionCompatParcelizer, "");
        if (AudioAttributesCompatParcelizer(activity)) {
            AudioAttributesCompatParcelizer(true);
            return false;
        }
        this.read.invoke(activity);
        boolean zIconCompatParcelizer = PlayerEvent.IconCompatParcelizer();
        boolean zAudioAttributesCompatParcelizer = this.AudioAttributesImplBaseParcelizer.AudioAttributesCompatParcelizer(activity);
        if (z2 || zIconCompatParcelizer || zAudioAttributesCompatParcelizer) {
            remoteActionCompatParcelizer.IconCompatParcelizer();
            return true;
        }
        if (z) {
            this.AudioAttributesCompatParcelizer = true;
            this.AudioAttributesImplBaseParcelizer.write(activity);
            return true;
        }
        AudioAttributesCompatParcelizer(false);
        return false;
    }

    public static final class write implements RemoteActionCompatParcelizer {
        private /* synthetic */ Activity RemoteActionCompatParcelizer;

        write(Activity activity) {
            this.RemoteActionCompatParcelizer = activity;
        }

        @Override // o.getTunnelingSupport.RemoteActionCompatParcelizer
        public final void IconCompatParcelizer() {
            getTunnelingSupport.this.AudioAttributesImplBaseParcelizer.IconCompatParcelizer(this.RemoteActionCompatParcelizer);
        }
    }

    public final void RemoteActionCompatParcelizer(Activity activity, boolean z) {
        toMagicModuleMetaRepoModel.write(activity, "");
        IconCompatParcelizer(this, activity, z, new write(activity));
    }

    public final void write(Activity activity) {
        toMagicModuleMetaRepoModel.write(activity, "");
        if (this.AudioAttributesCompatParcelizer) {
            this.AudioAttributesCompatParcelizer = false;
            if (Build.VERSION.SDK_INT >= 33) {
                AudioAttributesCompatParcelizer(AudioAttributesCompatParcelizer(activity));
            }
        }
    }

    public final void write(Activity activity, int i, int[] iArr) {
        toMagicModuleMetaRepoModel.write(activity, "");
        toMagicModuleMetaRepoModel.write(iArr, "");
        this.read.invoke(activity);
        PlayerEvent.write();
        PlayerEvent.read(activity, this.write);
        if (i == 102) {
            Integer num = getOrderDetails.read(iArr);
            AudioAttributesCompatParcelizer(num != null && num.intValue() == 0);
        }
    }

    private final void AudioAttributesCompatParcelizer(boolean z) {
        AudioAttributesCompatParcelizer();
        AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = this.AudioAttributesImplApi21Parcelizer.get();
        if (audioAttributesCompatParcelizer != null) {
            audioAttributesCompatParcelizer.read();
        }
    }

    private final void AudioAttributesCompatParcelizer() {
        List<getFormatSupport> list = this.IconCompatParcelizer;
        if (list != null) {
            for (getFormatSupport getformatsupport : list) {
            }
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public getTunnelingSupport(CleverTapInstanceConfig cleverTapInstanceConfig, List<? extends getFormatSupport> list) {
        this(cleverTapInstanceConfig, list, null, null, null, 28, null);
        toMagicModuleMetaRepoModel.write(cleverTapInstanceConfig, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public getTunnelingSupport(CleverTapInstanceConfig cleverTapInstanceConfig, List<? extends getFormatSupport> list, AudioAttributesCompatParcelizer audioAttributesCompatParcelizer) {
        this(cleverTapInstanceConfig, list, audioAttributesCompatParcelizer, null, null, 24, null);
        toMagicModuleMetaRepoModel.write(cleverTapInstanceConfig, "");
    }
}
