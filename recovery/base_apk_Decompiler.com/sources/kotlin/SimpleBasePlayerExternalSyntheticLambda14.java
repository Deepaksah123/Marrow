package kotlin;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.TypedValue;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.clevertap.android.sdk.CleverTapInstanceConfig;
import com.clevertap.android.sdk.customviews.CloseImageView;
import com.clevertap.android.sdk.inapp.CTInAppAction;
import com.clevertap.android.sdk.inapp.CTInAppNotification;
import com.clevertap.android.sdk.inapp.CTInAppNotificationButton;
import in.juspay.hypersdk.core.PaymentConstants;
import java.io.UnsupportedEncodingException;
import java.lang.ref.WeakReference;
import java.net.URLDecoder;
import java.util.List;
import kotlin.Metadata;
import kotlin.SimpleBasePlayerExternalSyntheticLambda6;
import org.apache.commons.compress.utils.CharsetNames;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b \u0018\u0000 \u00052\u00020\u0001:\u0002\u0005\u0006B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H$¢\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H$¢\u0006\u0004\b\u0006\u0010\u0003J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ!\u0010\u000e\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0012\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013J)\u0010\u0017\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00142\b\u0010\r\u001a\u0004\u0018\u00010\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u0017\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0019J\u0017\u0010\u0012\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u0012\u0010\u001aJ\u0017\u0010\u001b\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u001b\u0010\u0003J\u000f\u0010\u001d\u001a\u0004\u0018\u00010\u001c¢\u0006\u0004\b\u001d\u0010\u001eJ\u0015\u0010\u0006\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u001c¢\u0006\u0004\b\u0006\u0010\u001fJ\u0015\u0010\u0017\u001a\u00020 2\u0006\u0010\b\u001a\u00020 ¢\u0006\u0004\b\u0017\u0010!J\u0015\u0010\"\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020 ¢\u0006\u0004\b\"\u0010#J\r\u0010%\u001a\u00020$¢\u0006\u0004\b%\u0010&J\u0019\u0010\u0005\u001a\u0004\u0018\u00010\f2\u0006\u0010\b\u001a\u00020'H\u0002¢\u0006\u0004\b\u0005\u0010(J+\u0010\u0006\u001a\u0004\u0018\u00010\f2\u0006\u0010\b\u001a\u00020\u00142\u0006\u0010\r\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\fH\u0002¢\u0006\u0004\b\u0006\u0010)R\"\u0010\u0012\u001a\u00020\u00108\u0005@\u0005X\u0084.¢\u0006\u0012\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-\"\u0004\b\u0017\u0010.R\"\u0010\u0006\u001a\u00020\u00118\u0005@\u0005X\u0085.¢\u0006\u0012\n\u0004\b\"\u0010/\u001a\u0004\b\u0017\u00100\"\u0004\b\u0006\u00101R\u001c\u0010\"\u001a\u00020 8\u0005@\u0004X\u0085\f¢\u0006\f\n\u0004\b\u0012\u00102\u001a\u0004\b\"\u00103R$\u0010\u0005\u001a\u0004\u0018\u0001048\u0005@\u0005X\u0085\u000e¢\u0006\u0012\n\u0004\b\u0006\u00105\u001a\u0004\b\u0012\u00106\"\u0004\b\"\u00107R\u001e\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u001c\u0018\u0001088\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b%\u00109R\u0018\u0010\u001b\u001a\u0004\u0018\u00010:8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010;"}, d2 = {"Lo/SimpleBasePlayerExternalSyntheticLambda14;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "", "read", "AudioAttributesCompatParcelizer", "Landroid/content/Context;", "p0", "onAttach", "(Landroid/content/Context;)V", "Landroid/view/View;", "Landroid/os/Bundle;", "p1", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "Lcom/clevertap/android/sdk/inapp/CTInAppNotification;", "Lcom/clevertap/android/sdk/CleverTapInstanceConfig;", "RemoteActionCompatParcelizer", "(Lcom/clevertap/android/sdk/inapp/CTInAppNotification;Lcom/clevertap/android/sdk/CleverTapInstanceConfig;)V", "Lcom/clevertap/android/sdk/inapp/CTInAppAction;", "", "p2", "write", "(Lcom/clevertap/android/sdk/inapp/CTInAppAction;Ljava/lang/String;Landroid/os/Bundle;)V", "(Ljava/lang/String;)V", "(Landroid/os/Bundle;)V", "AudioAttributesImplApi21Parcelizer", "Lo/lambdaupdateStateAndInformListeners54;", "MediaBrowserCompatItemReceiver", "()Lo/lambdaupdateStateAndInformListeners54;", "(Lo/lambdaupdateStateAndInformListeners54;)V", "", "(I)I", "IconCompatParcelizer", "(I)V", "Lo/SimpleBasePlayerExternalSyntheticLambda6;", "AudioAttributesImplBaseParcelizer", "()Lo/SimpleBasePlayerExternalSyntheticLambda6;", "Lcom/clevertap/android/sdk/inapp/CTInAppNotificationButton;", "(Lcom/clevertap/android/sdk/inapp/CTInAppNotificationButton;)Landroid/os/Bundle;", "(Lcom/clevertap/android/sdk/inapp/CTInAppAction;Ljava/lang/String;Landroid/os/Bundle;)Landroid/os/Bundle;", "MediaBrowserCompatCustomActionResultReceiver", "Lcom/clevertap/android/sdk/inapp/CTInAppNotification;", "AudioAttributesImplApi26Parcelizer", "()Lcom/clevertap/android/sdk/inapp/CTInAppNotification;", "(Lcom/clevertap/android/sdk/inapp/CTInAppNotification;)V", "Lcom/clevertap/android/sdk/CleverTapInstanceConfig;", "()Lcom/clevertap/android/sdk/CleverTapInstanceConfig;", "(Lcom/clevertap/android/sdk/CleverTapInstanceConfig;)V", "I", "()I", "Lcom/clevertap/android/sdk/customviews/CloseImageView;", "Lcom/clevertap/android/sdk/customviews/CloseImageView;", "()Lcom/clevertap/android/sdk/customviews/CloseImageView;", "(Lcom/clevertap/android/sdk/customviews/CloseImageView;)V", "Ljava/lang/ref/WeakReference;", "Ljava/lang/ref/WeakReference;", "Lo/Rarray;", "Lo/Rarray;"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class SimpleBasePlayerExternalSyntheticLambda14 extends Fragment {

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private CloseImageView read;

    /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: from kotlin metadata */
    private WeakReference<lambdaupdateStateAndInformListeners54> write;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private CleverTapInstanceConfig AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from kotlin metadata */
    private CTInAppNotification RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private int IconCompatParcelizer;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private Rarray AudioAttributesImplApi21Parcelizer;

    protected abstract void AudioAttributesCompatParcelizer();

    protected abstract void read();

    /* JADX INFO: renamed from: o.SimpleBasePlayerExternalSyntheticLambda14$read, reason: from kotlin metadata */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J5\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010"}, d2 = {"Lo/SimpleBasePlayerExternalSyntheticLambda14$read;", "", "<init>", "()V", "Lo/SimpleBasePlayerExternalSyntheticLambda14;", "p0", "Landroid/app/Activity;", "p1", "Lcom/clevertap/android/sdk/inapp/CTInAppNotification;", "p2", "Lcom/clevertap/android/sdk/CleverTapInstanceConfig;", "p3", "", "p4", "", "write", "(Lo/SimpleBasePlayerExternalSyntheticLambda14;Landroid/app/Activity;Lcom/clevertap/android/sdk/inapp/CTInAppNotification;Lcom/clevertap/android/sdk/CleverTapInstanceConfig;Ljava/lang/String;)Z"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static boolean write(SimpleBasePlayerExternalSyntheticLambda14 p0, Activity p1, CTInAppNotification p2, CleverTapInstanceConfig p3, String p4) {
            toMagicModuleMetaRepoModel.write(p0, "");
            toMagicModuleMetaRepoModel.write(p1, "");
            toMagicModuleMetaRepoModel.write(p2, "");
            toMagicModuleMetaRepoModel.write(p3, "");
            toMagicModuleMetaRepoModel.write(p4, "");
            try {
                _doAddInjectable _doaddinjectableIconCompatParcelizer = ((maybeGetTypeVariable) p1).getSupportFragmentManager().IconCompatParcelizer();
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(_doaddinjectableIconCompatParcelizer, "");
                p0.RemoteActionCompatParcelizer(p2, p3);
                _doaddinjectableIconCompatParcelizer.MediaBrowserCompatSearchResultReceiver();
                _doaddinjectableIconCompatParcelizer.read(R.id.content, p0, p2.getOnPause());
                p2.getRead();
                RendererWakeupListener.RatingCompat();
                _doaddinjectableIconCompatParcelizer.RemoteActionCompatParcelizer();
                return true;
            } catch (ClassCastException e) {
                RendererWakeupListener.MediaBrowserCompatMediaItem();
                return false;
            } catch (Throwable unused) {
                RendererWakeupListener.MediaBrowserCompatMediaItem();
                return false;
            }
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }

    protected final class AudioAttributesCompatParcelizer implements View.OnClickListener {
        public AudioAttributesCompatParcelizer() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            toMagicModuleMetaRepoModel.write(view, "");
            Object tag = view.getTag();
            Integer num = tag instanceof Integer ? (Integer) tag : null;
            if (num != null) {
                SimpleBasePlayerExternalSyntheticLambda14.this.IconCompatParcelizer(num.intValue());
            }
        }
    }

    private void write(CTInAppNotification cTInAppNotification) {
        toMagicModuleMetaRepoModel.write(cTInAppNotification, "");
        this.RemoteActionCompatParcelizer = cTInAppNotification;
    }

    protected final CTInAppNotification AudioAttributesImplApi26Parcelizer() {
        CTInAppNotification cTInAppNotification = this.RemoteActionCompatParcelizer;
        if (cTInAppNotification != null) {
            return cTInAppNotification;
        }
        toMagicModuleMetaRepoModel.IconCompatParcelizer("");
        return null;
    }

    private void AudioAttributesCompatParcelizer(CleverTapInstanceConfig cleverTapInstanceConfig) {
        toMagicModuleMetaRepoModel.write(cleverTapInstanceConfig, "");
        this.AudioAttributesCompatParcelizer = cleverTapInstanceConfig;
    }

    protected final CleverTapInstanceConfig write() {
        CleverTapInstanceConfig cleverTapInstanceConfig = this.AudioAttributesCompatParcelizer;
        if (cleverTapInstanceConfig != null) {
            return cleverTapInstanceConfig;
        }
        toMagicModuleMetaRepoModel.IconCompatParcelizer("");
        return null;
    }

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from getter */
    protected final int getIconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    protected final void IconCompatParcelizer(CloseImageView closeImageView) {
        this.read = closeImageView;
    }

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from getter */
    protected final CloseImageView getRead() {
        return this.read;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        super.onAttach(p0);
        Bundle arguments = getArguments();
        if (arguments != null) {
            Parcelable parcelable = arguments.getParcelable("inApp");
            toMagicModuleMetaRepoModel.write(parcelable);
            write((CTInAppNotification) parcelable);
            Parcelable parcelable2 = arguments.getParcelable(PaymentConstants.Category.CONFIG);
            toMagicModuleMetaRepoModel.write(parcelable2);
            AudioAttributesCompatParcelizer((CleverTapInstanceConfig) parcelable2);
            this.IconCompatParcelizer = getResources().getConfiguration().orientation;
            AudioAttributesCompatParcelizer();
            if (p0 instanceof Rarray) {
                this.AudioAttributesImplApi21Parcelizer = (Rarray) p0;
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View p0, Bundle p1) {
        toMagicModuleMetaRepoModel.write(p0, "");
        super.onViewCreated(p0, p1);
        AudioAttributesImplApi21Parcelizer();
    }

    public final void RemoteActionCompatParcelizer(CTInAppNotification p0, CleverTapInstanceConfig p1) {
        toMagicModuleMetaRepoModel.write(p0, "");
        toMagicModuleMetaRepoModel.write(p1, "");
        Bundle bundle = new Bundle();
        bundle.putParcelable("inApp", p0);
        bundle.putParcelable(PaymentConstants.Category.CONFIG, p1);
        setArguments(bundle);
    }

    public final void write(CTInAppAction p0, String p1, Bundle p2) throws UnsupportedEncodingException {
        toMagicModuleMetaRepoModel.write(p0, "");
        if (p0.getRemoteActionCompatParcelizer() == lambdaupdateStateAndInformListeners38.AudioAttributesCompatParcelizer) {
            Bundle bundle = getEventTimeForErrorEvent.read(p0.getIconCompatParcelizer(), false);
            String string = bundle.getString("wzrk_c2a");
            bundle.remove("wzrk_c2a");
            if (p2 != null) {
                bundle.putAll(p2);
            }
            if (string != null) {
                List listWrite = TestGroupLSModel.write(string, new String[]{"__dl__"}, 0, 6);
                if (listWrite.size() == 2) {
                    try {
                        string = URLDecoder.decode((String) listWrite.get(0), CharsetNames.UTF_8);
                    } catch (Exception e) {
                        write().MediaBrowserCompatItemReceiver();
                        RendererWakeupListener.onCustomAction();
                    }
                    CTInAppAction.Companion companion = CTInAppAction.INSTANCE;
                    p0 = CTInAppAction.Companion.read((String) listWrite.get(1));
                }
            }
            p2 = bundle;
            if (p1 == null) {
                p1 = string;
            }
        }
        RemoteActionCompatParcelizer(AudioAttributesCompatParcelizer(p0, p1 != null ? p1 : "", p2));
    }

    public final void write(String p0) throws UnsupportedEncodingException {
        toMagicModuleMetaRepoModel.write(p0, "");
        CTInAppAction.Companion companion = CTInAppAction.INSTANCE;
        write(CTInAppAction.Companion.read(p0), null, null);
    }

    public final void RemoteActionCompatParcelizer(Bundle p0) {
        read();
        lambdaupdateStateAndInformListeners54 lambdaupdatestateandinformlisteners54MediaBrowserCompatItemReceiver = MediaBrowserCompatItemReceiver();
        if (lambdaupdatestateandinformlisteners54MediaBrowserCompatItemReceiver != null) {
            lambdaupdatestateandinformlisteners54MediaBrowserCompatItemReceiver.read(AudioAttributesImplApi26Parcelizer(), p0);
        }
    }

    private void AudioAttributesImplApi21Parcelizer() {
        lambdaupdateStateAndInformListeners54 lambdaupdatestateandinformlisteners54MediaBrowserCompatItemReceiver = MediaBrowserCompatItemReceiver();
        if (lambdaupdatestateandinformlisteners54MediaBrowserCompatItemReceiver != null) {
            lambdaupdatestateandinformlisteners54MediaBrowserCompatItemReceiver.AudioAttributesCompatParcelizer(AudioAttributesImplApi26Parcelizer(), null);
        }
    }

    private lambdaupdateStateAndInformListeners54 MediaBrowserCompatItemReceiver() {
        WeakReference<lambdaupdateStateAndInformListeners54> weakReference = this.write;
        lambdaupdateStateAndInformListeners54 lambdaupdatestateandinformlisteners54 = weakReference != null ? weakReference.get() : null;
        if (lambdaupdatestateandinformlisteners54 == null) {
            RendererWakeupListener rendererWakeupListenerMediaBrowserCompatItemReceiver = write().MediaBrowserCompatItemReceiver();
            String strWrite = write().write();
            StringBuilder sb = new StringBuilder("InAppListener is null for notification: ");
            sb.append(AudioAttributesImplApi26Parcelizer().onCustomAction());
            rendererWakeupListenerMediaBrowserCompatItemReceiver.write(strWrite, sb.toString());
        }
        return lambdaupdatestateandinformlisteners54;
    }

    public final void AudioAttributesCompatParcelizer(lambdaupdateStateAndInformListeners54 p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        this.write = new WeakReference<>(p0);
    }

    public final int write(int p0) {
        return (int) TypedValue.applyDimension(1, p0, getResources().getDisplayMetrics());
    }

    public final void IconCompatParcelizer(int p0) {
        Rarray rarray;
        Rarray rarray2;
        try {
            CTInAppNotificationButton cTInAppNotificationButton = AudioAttributesImplApi26Parcelizer().IconCompatParcelizer().get(p0);
            Bundle bundle = read(cTInAppNotificationButton);
            if (AudioAttributesImplApi26Parcelizer().getHandleMediaPlayPauseIfPendingOnHandler() && (rarray2 = this.AudioAttributesImplApi21Parcelizer) != null) {
                if (p0 == 0) {
                    if (rarray2 != null) {
                        rarray2.read(AudioAttributesImplApi26Parcelizer().getOnAddQueueItem());
                        return;
                    }
                    return;
                } else if (p0 == 1 && rarray2 != null) {
                    rarray2.RemoteActionCompatParcelizer();
                }
            }
            CTInAppAction cTInAppAction = cTInAppNotificationButton.AudioAttributesImplBaseParcelizer;
            if (cTInAppAction == null || lambdaupdateStateAndInformListeners38.AudioAttributesImplBaseParcelizer != cTInAppAction.getRemoteActionCompatParcelizer() || (rarray = this.AudioAttributesImplApi21Parcelizer) == null) {
                RemoteActionCompatParcelizer(bundle);
            } else if (rarray != null) {
                rarray.read(cTInAppAction.getWrite());
            }
        } catch (Throwable unused) {
            write().MediaBrowserCompatItemReceiver();
            RendererWakeupListener.onCustomAction();
            RemoteActionCompatParcelizer(null);
        }
    }

    public final SimpleBasePlayerExternalSyntheticLambda6 AudioAttributesImplBaseParcelizer() {
        SimpleBasePlayerExternalSyntheticLambda6.Companion readVar = SimpleBasePlayerExternalSyntheticLambda6.INSTANCE;
        Context contextRequireContext = requireContext();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(contextRequireContext, "");
        return readVar.read(contextRequireContext, write().MediaBrowserCompatItemReceiver());
    }

    private final Bundle read(CTInAppNotificationButton p0) {
        CTInAppAction cTInAppActionRemoteActionCompatParcelizer = p0.AudioAttributesImplBaseParcelizer;
        if (cTInAppActionRemoteActionCompatParcelizer == null) {
            CTInAppAction.Companion companion = CTInAppAction.INSTANCE;
            cTInAppActionRemoteActionCompatParcelizer = CTInAppAction.Companion.RemoteActionCompatParcelizer();
        }
        return AudioAttributesCompatParcelizer(cTInAppActionRemoteActionCompatParcelizer, p0.getIconCompatParcelizer(), null);
    }

    private final Bundle AudioAttributesCompatParcelizer(CTInAppAction p0, String p1, Bundle p2) {
        lambdaupdateStateAndInformListeners54 lambdaupdatestateandinformlisteners54MediaBrowserCompatItemReceiver = MediaBrowserCompatItemReceiver();
        if (lambdaupdatestateandinformlisteners54MediaBrowserCompatItemReceiver != null) {
            return lambdaupdatestateandinformlisteners54MediaBrowserCompatItemReceiver.RemoteActionCompatParcelizer(AudioAttributesImplApi26Parcelizer(), p0, p1, p2, getActivity());
        }
        return null;
    }
}
