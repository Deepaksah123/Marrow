package kotlin;

import android.content.Context;
import com.clevertap.android.sdk.CleverTapInstanceConfig;
import kotlin.Metadata;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0000\u0018\u0000 !2\u00020\u0001:\u0001!B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J1\u0010\u0012\u001a\u00020\u00152\u0006\u0010\u0003\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u00142\b\u0010\u0007\u001a\u0004\u0018\u00010\u00152\u0006\u0010\n\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0012\u0010\u0017J)\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0003\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u00142\b\u0010\u0007\u001a\u0004\u0018\u00010\u0015H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J1\u0010\u001b\u001a\u00020\u00152\u0006\u0010\u0003\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u001a2\u0006\u0010\u0007\u001a\u00020\u00142\b\u0010\n\u001a\u0004\u0018\u00010\u0015H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ'\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u001d2\u0006\u0010\u0007\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0012\u0010\u001eJ\u001f\u0010\u0018\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u0018\u0010\u001fJ)\u0010\u001b\u001a\u00020\u00152\u0006\u0010\u0003\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u00142\b\u0010\u0007\u001a\u0004\u0018\u00010\u0015H\u0016¢\u0006\u0004\b\u001b\u0010\u0019J\u0017\u0010\u001b\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u001b\u0010\u0013J\u000f\u0010\u0018\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0018\u0010 J\u0017\u0010!\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u000eH\u0002¢\u0006\u0004\b!\u0010\u0013J\u000f\u0010!\u001a\u00020\tH\u0002¢\u0006\u0004\b!\u0010 J'\u0010\u001b\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u001d2\u0006\u0010\u0007\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001b\u0010\"R\u0014\u0010\u0018\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010#R\u0014\u0010\u0010\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010$R\u0014\u0010\u001b\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010'R\u001a\u0010!\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010'R\u0018\u0010*\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)"}, d2 = {"Lo/lambdasetDeviceMuted28;", "Lo/lambdaprepare7;", "Lcom/clevertap/android/sdk/CleverTapInstanceConfig;", "p0", "Lo/PlayerListener;", "p1", "Lo/getMaxStars;", "p2", "Lkotlin/Function0;", "", "p3", "p4", "<init>", "(Lcom/clevertap/android/sdk/CleverTapInstanceConfig;Lo/PlayerListener;Lo/getMaxStars;Lo/getCreatedOnDateMs;Lo/getCreatedOnDateMs;)V", "Landroid/content/Context;", "Lo/lambdasetDeviceMuted29;", "AudioAttributesCompatParcelizer", "(Landroid/content/Context;)Lo/lambdasetDeviceMuted29;", "write", "(Landroid/content/Context;)V", "", "Lo/lambdasetDeviceVolume22;", "Lo/lambdasetVideoSurfaceHolder18;", "(Landroid/content/Context;Lo/lambdasetDeviceVolume22;Lo/lambdasetVideoSurfaceHolder18;)Lo/lambdasetDeviceVolume22;", "IconCompatParcelizer", "(Landroid/content/Context;ILo/lambdasetDeviceVolume22;)Lo/lambdasetDeviceVolume22;", "Lo/lambdasetDeviceVolume23;", "RemoteActionCompatParcelizer", "(Landroid/content/Context;Lo/lambdasetDeviceVolume23;ILo/lambdasetDeviceVolume22;)Lo/lambdasetDeviceVolume22;", "Lorg/json/JSONObject;", "(Landroid/content/Context;Lorg/json/JSONObject;I)V", "(Landroid/content/Context;Lorg/json/JSONObject;)V", "()V", "read", "(Landroid/content/Context;Lorg/json/JSONObject;Lo/lambdasetDeviceVolume23;)V", "Lcom/clevertap/android/sdk/CleverTapInstanceConfig;", "Lo/PlayerListener;", "AudioAttributesImplApi26Parcelizer", "Lo/getMaxStars;", "Lo/getCreatedOnDateMs;", "AudioAttributesImplBaseParcelizer", "Lo/lambdasetDeviceMuted29;", "MediaBrowserCompatItemReceiver"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class lambdasetDeviceMuted28 implements lambdaprepare7 {
    private static final read read = new read(null);

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final CleverTapInstanceConfig IconCompatParcelizer;

    /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: from kotlin metadata */
    private final getMaxStars RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: from kotlin metadata */
    private lambdasetDeviceMuted29 MediaBrowserCompatItemReceiver;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final getCreatedOnDateMs<getShowPopup> write;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final PlayerListener AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final getCreatedOnDateMs<getShowPopup> read;

    public lambdasetDeviceMuted28(CleverTapInstanceConfig cleverTapInstanceConfig, PlayerListener playerListener, getMaxStars getmaxstars, getCreatedOnDateMs<getShowPopup> getcreatedondatems, getCreatedOnDateMs<getShowPopup> getcreatedondatems2) {
        toMagicModuleMetaRepoModel.write(cleverTapInstanceConfig, "");
        toMagicModuleMetaRepoModel.write(playerListener, "");
        toMagicModuleMetaRepoModel.write(getmaxstars, "");
        toMagicModuleMetaRepoModel.write(getcreatedondatems, "");
        toMagicModuleMetaRepoModel.write(getcreatedondatems2, "");
        this.IconCompatParcelizer = cleverTapInstanceConfig;
        this.AudioAttributesCompatParcelizer = playerListener;
        this.RemoteActionCompatParcelizer = getmaxstars;
        this.write = getcreatedondatems;
        this.read = getcreatedondatems2;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/lambdasetDeviceMuted28$read;", "", "<init>", "()V"}, k = 1, mv = {2, 0, 0}, xi = 48)
    static final class read {
        private read() {
        }

        public /* synthetic */ read(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }

    @Override // kotlin.lambdaprepare7
    public final lambdasetDeviceMuted29 AudioAttributesCompatParcelizer(Context p0) {
        lambdasetDeviceMuted29 lambdasetdevicemuted29;
        synchronized (this) {
            toMagicModuleMetaRepoModel.write(p0, "");
            lambdasetdevicemuted29 = this.MediaBrowserCompatItemReceiver;
            if (lambdasetdevicemuted29 == null) {
                lambdasetdevicemuted29 = new lambdasetDeviceMuted29(p0, this.IconCompatParcelizer);
                this.MediaBrowserCompatItemReceiver = lambdasetdevicemuted29;
                lambdasetdevicemuted29.IconCompatParcelizer(lambdasetDeviceVolume23.RemoteActionCompatParcelizer);
                lambdasetdevicemuted29.IconCompatParcelizer(lambdasetDeviceVolume23.read);
                lambdasetdevicemuted29.IconCompatParcelizer(lambdasetDeviceVolume23.AudioAttributesCompatParcelizer);
                lambdasetdevicemuted29.RemoteActionCompatParcelizer();
                lambdasetdevicemuted29.read().RemoteActionCompatParcelizer();
            }
        }
        return lambdasetdevicemuted29;
    }

    @Override // kotlin.lambdaprepare7
    public final void write(Context p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        Object objIconCompatParcelizer = this.AudioAttributesCompatParcelizer.IconCompatParcelizer();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(objIconCompatParcelizer, "");
        synchronized (objIconCompatParcelizer) {
            lambdasetDeviceMuted29 lambdasetdevicemuted29AudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(p0);
            lambdasetdevicemuted29AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(lambdasetDeviceVolume23.RemoteActionCompatParcelizer);
            lambdasetdevicemuted29AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(lambdasetDeviceVolume23.read);
            read(p0);
            getShowPopup getshowpopup = getShowPopup.INSTANCE;
        }
    }

    @Override // kotlin.lambdaprepare7
    public final lambdasetDeviceVolume22 write(Context context, lambdasetDeviceVolume22 lambdasetdevicevolume22, lambdasetVideoSurfaceHolder18 lambdasetvideosurfaceholder18) {
        toMagicModuleMetaRepoModel.write(context, "");
        toMagicModuleMetaRepoModel.write(lambdasetvideosurfaceholder18, "");
        if (lambdasetvideosurfaceholder18 == lambdasetVideoSurfaceHolder18.PUSH_NOTIFICATION_VIEWED) {
            this.IconCompatParcelizer.MediaBrowserCompatItemReceiver().write(this.IconCompatParcelizer.write(), "Returning Queued Notification Viewed events");
            return RemoteActionCompatParcelizer(context, 50, lambdasetdevicevolume22);
        }
        this.IconCompatParcelizer.MediaBrowserCompatItemReceiver().write(this.IconCompatParcelizer.write(), "Returning Queued events");
        return IconCompatParcelizer(context, 50, lambdasetdevicevolume22);
    }

    private lambdasetDeviceVolume22 IconCompatParcelizer(Context p0, int p1, lambdasetDeviceVolume22 p2) {
        lambdasetDeviceVolume22 lambdasetdevicevolume22RemoteActionCompatParcelizer;
        toMagicModuleMetaRepoModel.write(p0, "");
        Object objIconCompatParcelizer = this.AudioAttributesCompatParcelizer.IconCompatParcelizer();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(objIconCompatParcelizer, "");
        synchronized (objIconCompatParcelizer) {
            lambdasetdevicevolume22RemoteActionCompatParcelizer = RemoteActionCompatParcelizer(p0, lambdasetDeviceVolume23.RemoteActionCompatParcelizer, 50, p2);
            if (lambdasetdevicevolume22RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer() && lambdasetdevicevolume22RemoteActionCompatParcelizer.IconCompatParcelizer() == lambdasetDeviceVolume23.RemoteActionCompatParcelizer) {
                lambdasetdevicevolume22RemoteActionCompatParcelizer = RemoteActionCompatParcelizer(p0, lambdasetDeviceVolume23.read, 50, null);
            }
        }
        return lambdasetdevicevolume22RemoteActionCompatParcelizer;
    }

    private lambdasetDeviceVolume22 RemoteActionCompatParcelizer(Context p0, lambdasetDeviceVolume23 p1, int p2, lambdasetDeviceVolume22 p3) {
        lambdasetDeviceVolume22 lambdasetdevicevolume22;
        String strRemoteActionCompatParcelizer;
        lambdasetDeviceVolume23 lambdasetdevicevolume23IconCompatParcelizer;
        toMagicModuleMetaRepoModel.write(p0, "");
        toMagicModuleMetaRepoModel.write(p1, "");
        Object objIconCompatParcelizer = this.AudioAttributesCompatParcelizer.IconCompatParcelizer();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(objIconCompatParcelizer, "");
        synchronized (objIconCompatParcelizer) {
            lambdasetDeviceMuted29 lambdasetdevicemuted29AudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(p0);
            if (p3 != null && (lambdasetdevicevolume23IconCompatParcelizer = p3.IconCompatParcelizer()) != null) {
                p1 = lambdasetdevicevolume23IconCompatParcelizer;
            }
            if (p3 != null && (strRemoteActionCompatParcelizer = p3.RemoteActionCompatParcelizer()) != null) {
                lambdasetdevicemuted29AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(strRemoteActionCompatParcelizer, p3.IconCompatParcelizer());
            }
            JSONObject jSONObject = lambdasetdevicemuted29AudioAttributesCompatParcelizer.read(p1, p2);
            lambdasetdevicevolume22 = new lambdasetDeviceVolume22(p1);
            lambdasetdevicevolume22.read(jSONObject);
        }
        return lambdasetdevicevolume22;
    }

    @Override // kotlin.lambdaprepare7
    public final void write(Context p0, JSONObject p1, int p2) {
        toMagicModuleMetaRepoModel.write(p0, "");
        toMagicModuleMetaRepoModel.write(p1, "");
        RemoteActionCompatParcelizer(p0, p1, p2 == 3 ? lambdasetDeviceVolume23.read : lambdasetDeviceVolume23.RemoteActionCompatParcelizer);
    }

    @Override // kotlin.lambdaprepare7
    public final void IconCompatParcelizer(Context p0, JSONObject p1) {
        toMagicModuleMetaRepoModel.write(p0, "");
        toMagicModuleMetaRepoModel.write(p1, "");
        RemoteActionCompatParcelizer(p0, p1, lambdasetDeviceVolume23.AudioAttributesCompatParcelizer);
    }

    private lambdasetDeviceVolume22 RemoteActionCompatParcelizer(Context p0, int p1, lambdasetDeviceVolume22 p2) {
        toMagicModuleMetaRepoModel.write(p0, "");
        return RemoteActionCompatParcelizer(p0, lambdasetDeviceVolume23.AudioAttributesCompatParcelizer, 50, p2);
    }

    private final void RemoteActionCompatParcelizer(Context p0) {
        getMaxStars.AudioAttributesCompatParcelizer(p0);
    }

    private final void IconCompatParcelizer() {
        this.read.invoke();
    }

    private final void read(Context p0) {
        RemoteActionCompatParcelizer(p0);
        read();
        IconCompatParcelizer();
    }

    private final void read() {
        this.write.invoke();
    }

    private final void RemoteActionCompatParcelizer(Context p0, JSONObject p1, lambdasetDeviceVolume23 p2) {
        Object objIconCompatParcelizer = this.AudioAttributesCompatParcelizer.IconCompatParcelizer();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(objIconCompatParcelizer, "");
        synchronized (objIconCompatParcelizer) {
            if (AudioAttributesCompatParcelizer(p0).write(p1, p2) > 0) {
                RendererWakeupListener rendererWakeupListenerMediaBrowserCompatItemReceiver = this.IconCompatParcelizer.MediaBrowserCompatItemReceiver();
                String strWrite = this.IconCompatParcelizer.write();
                StringBuilder sb = new StringBuilder("Queued event: ");
                sb.append(p1);
                rendererWakeupListenerMediaBrowserCompatItemReceiver.IconCompatParcelizer(strWrite, sb.toString());
                RendererWakeupListener rendererWakeupListenerMediaBrowserCompatItemReceiver2 = this.IconCompatParcelizer.MediaBrowserCompatItemReceiver();
                String strWrite2 = this.IconCompatParcelizer.write();
                StringBuilder sb2 = new StringBuilder("Queued event to DB table ");
                sb2.append(p2);
                sb2.append(": ");
                sb2.append(p1);
                rendererWakeupListenerMediaBrowserCompatItemReceiver2.write(strWrite2, sb2.toString());
            }
            getShowPopup getshowpopup = getShowPopup.INSTANCE;
        }
    }
}
