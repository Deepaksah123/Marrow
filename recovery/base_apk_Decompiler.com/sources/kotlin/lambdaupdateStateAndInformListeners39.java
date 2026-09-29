package kotlin;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.clevertap.android.sdk.CleverTapInstanceConfig;
import in.juspay.hyper.constants.LogCategory;
import java.util.Set;
import kotlin.Metadata;
import kotlin.getTunnelingSupport;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001(B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0003J\u0006\u0010\u0015\u001a\u00020\u0011JN\u0010\u0016\u001a\u00020\u00172\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u001928\u0010\u001a\u001a4\u0012*\u0012(\u0018\u00010 j\u0013\u0018\u0001`\u001c¢\u0006\f\b\u001d\u0012\b\b\u001e\u0012\u0004\b\b(\u001f¢\u0006\f\b\u001d\u0012\b\b\u001e\u0012\u0004\b\b(\u001f\u0012\u0004\u0012\u00020\u00170\u001bJ\u0006\u0010!\u001a\u00020\u0011J\u0006\u0010\"\u001a\u00020\u0017J\u000e\u0010#\u001a\u00020\u00112\u0006\u0010$\u001a\u00020\u0011J \u0010#\u001a\u00020\u00112\u0006\u0010$\u001a\u00020\u00112\b\b\u0002\u0010%\u001a\u00020\u00112\u0006\u0010&\u001a\u00020'R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\f\u001a\n \u000e*\u0004\u0018\u00010\r0\rX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u000f¨\u0006)"}, d2 = {"Lcom/clevertap/android/sdk/inapp/InAppActionHandler;", "", LogCategory.CONTEXT, "Landroid/content/Context;", "ctConfig", "Lcom/clevertap/android/sdk/CleverTapInstanceConfig;", "pushPermissionHandler", "Lcom/clevertap/android/sdk/PushPermissionHandler;", "playStoreReviewHandler", "Lcom/clevertap/android/sdk/utils/PlayStoreReviewHandler;", "<init>", "(Landroid/content/Context;Lcom/clevertap/android/sdk/CleverTapInstanceConfig;Lcom/clevertap/android/sdk/PushPermissionHandler;Lcom/clevertap/android/sdk/utils/PlayStoreReviewHandler;)V", "logger", "Lcom/clevertap/android/sdk/Logger;", "kotlin.jvm.PlatformType", "Lcom/clevertap/android/sdk/Logger;", "openUrl", "", "url", "", "launchContext", "isPlayStoreReviewLibraryAvailable", "launchPlayStoreReviewFlow", "", "onCompleted", "Lkotlin/Function0;", "onError", "Lkotlin/Function1;", "Lkotlin/Exception;", "Lkotlin/ParameterName;", "name", "e", "Ljava/lang/Exception;", "arePushNotificationsEnabled", "notifyPushPermissionListeners", "launchPushPermissionPrompt", "fallbackToSettings", "alwaysRequestIfNotGranted", "presenter", "Lcom/clevertap/android/sdk/inapp/InAppActionHandler$PushPermissionPromptPresenter;", "PushPermissionPromptPresenter", "clevertap-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class lambdaupdateStateAndInformListeners39 {
    private final CleverTapInstanceConfig AudioAttributesCompatParcelizer;
    private final getTunnelingSupport IconCompatParcelizer;
    private final Context RemoteActionCompatParcelizer;
    private final RendererWakeupListener read;
    private final generateLoadingMediaPeriodEventTime write;

    public interface IconCompatParcelizer {
        void IconCompatParcelizer(Activity activity);
    }

    private lambdaupdateStateAndInformListeners39(Context context, CleverTapInstanceConfig cleverTapInstanceConfig, getTunnelingSupport gettunnelingsupport, generateLoadingMediaPeriodEventTime generateloadingmediaperiodeventtime) {
        toMagicModuleMetaRepoModel.write(context, "");
        toMagicModuleMetaRepoModel.write(cleverTapInstanceConfig, "");
        toMagicModuleMetaRepoModel.write(gettunnelingsupport, "");
        toMagicModuleMetaRepoModel.write(generateloadingmediaperiodeventtime, "");
        this.RemoteActionCompatParcelizer = context;
        this.AudioAttributesCompatParcelizer = cleverTapInstanceConfig;
        this.IconCompatParcelizer = gettunnelingsupport;
        this.write = generateloadingmediaperiodeventtime;
        this.read = cleverTapInstanceConfig.MediaBrowserCompatItemReceiver();
    }

    public /* synthetic */ lambdaupdateStateAndInformListeners39(Context context, CleverTapInstanceConfig cleverTapInstanceConfig, getTunnelingSupport gettunnelingsupport, generateLoadingMediaPeriodEventTime generateloadingmediaperiodeventtime, int i, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this(context, cleverTapInstanceConfig, gettunnelingsupport, (i & 8) != 0 ? new generateLoadingMediaPeriodEventTime() : generateloadingmediaperiodeventtime);
    }

    public final boolean write(String str, Context context) {
        toMagicModuleMetaRepoModel.write(str, "");
        try {
            Uri uri = Uri.parse(TestGroupLSModel.read(TestGroupLSModel.read(str, "\n", "", false), "\r", "", false));
            Set<String> queryParameterNames = uri.getQueryParameterNames();
            Bundle bundle = new Bundle();
            Set<String> set = queryParameterNames;
            if (set != null && !set.isEmpty()) {
                for (String str2 : queryParameterNames) {
                    bundle.putString(str2, uri.getQueryParameter(str2));
                }
            }
            Intent intent = new Intent("android.intent.action.VIEW", uri);
            if (!bundle.isEmpty()) {
                intent.putExtras(bundle);
            }
            if (context == null) {
                intent.setFlags(268435456);
                context = this.RemoteActionCompatParcelizer;
            }
            RendererCapabilitiesListener.RemoteActionCompatParcelizer(context, intent);
            context.startActivity(intent);
            return true;
        } catch (Exception unused) {
            if (TestGroupLSModel.MediaBrowserCompatCustomActionResultReceiver(str, "wzrk://")) {
                return true;
            }
            RendererWakeupListener.handleMediaPlayPauseIfPendingOnHandler();
            return false;
        }
    }

    public final boolean read() {
        return this.write.AudioAttributesCompatParcelizer();
    }

    public final void read(getCreatedOnDateMs<getShowPopup> getcreatedondatems, getAnswerMap<? super Exception, getShowPopup> getanswermap) {
        toMagicModuleMetaRepoModel.write(getcreatedondatems, "");
        toMagicModuleMetaRepoModel.write(getanswermap, "");
        generateLoadingMediaPeriodEventTime generateloadingmediaperiodeventtime = this.write;
        Context context = this.RemoteActionCompatParcelizer;
        RendererWakeupListener rendererWakeupListener = this.read;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(rendererWakeupListener, "");
        generateloadingmediaperiodeventtime.RemoteActionCompatParcelizer(context, rendererWakeupListener, getcreatedondatems, getanswermap);
    }

    public final boolean RemoteActionCompatParcelizer() {
        return this.IconCompatParcelizer.AudioAttributesCompatParcelizer(this.RemoteActionCompatParcelizer);
    }

    public final void write() {
        this.IconCompatParcelizer.IconCompatParcelizer(this.RemoteActionCompatParcelizer);
    }

    public final boolean write(final boolean z) {
        return AudioAttributesCompatParcelizer(this, z, new IconCompatParcelizer() { // from class: o.lambdaupdateStateAndInformListeners40
            @Override // o.lambdaupdateStateAndInformListeners39.IconCompatParcelizer
            public final void IconCompatParcelizer(Activity activity) {
                lambdaupdateStateAndInformListeners39.AudioAttributesCompatParcelizer(z, this, activity);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void AudioAttributesCompatParcelizer(boolean z, lambdaupdateStateAndInformListeners39 lambdaupdatestateandinformlisteners39, Activity activity) {
        toMagicModuleMetaRepoModel.write(lambdaupdatestateandinformlisteners39, "");
        toMagicModuleMetaRepoModel.write(activity, "");
        if (activity instanceof Rstyle) {
            ((Rstyle) activity).IconCompatParcelizer(z);
        } else {
            Rstyle.RemoteActionCompatParcelizer(activity, lambdaupdatestateandinformlisteners39.AudioAttributesCompatParcelizer, z);
        }
    }

    private static /* synthetic */ boolean AudioAttributesCompatParcelizer(lambdaupdateStateAndInformListeners39 lambdaupdatestateandinformlisteners39, boolean z, IconCompatParcelizer iconCompatParcelizer) {
        return lambdaupdatestateandinformlisteners39.AudioAttributesCompatParcelizer(z, false, iconCompatParcelizer);
    }

    private boolean AudioAttributesCompatParcelizer(boolean z, boolean z2, IconCompatParcelizer iconCompatParcelizer) {
        toMagicModuleMetaRepoModel.write(iconCompatParcelizer, "");
        Activity activityIconCompatParcelizer = copyWithPlaceholderTimeline.IconCompatParcelizer();
        if (activityIconCompatParcelizer == null) {
            RendererWakeupListener.handleMediaPlayPauseIfPendingOnHandler();
            return false;
        }
        return this.IconCompatParcelizer.read(activityIconCompatParcelizer, z, new RemoteActionCompatParcelizer(iconCompatParcelizer, activityIconCompatParcelizer), false);
    }

    public static final class RemoteActionCompatParcelizer implements getTunnelingSupport.RemoteActionCompatParcelizer {
        private /* synthetic */ Activity RemoteActionCompatParcelizer;
        private /* synthetic */ IconCompatParcelizer read;

        RemoteActionCompatParcelizer(IconCompatParcelizer iconCompatParcelizer, Activity activity) {
            this.read = iconCompatParcelizer;
            this.RemoteActionCompatParcelizer = activity;
        }

        @Override // o.getTunnelingSupport.RemoteActionCompatParcelizer
        public final void IconCompatParcelizer() {
            this.read.IconCompatParcelizer(this.RemoteActionCompatParcelizer);
        }
    }
}
