package kotlin;

import com.clevertap.android.sdk.CleverTapInstanceConfig;
import com.clevertap.android.sdk.inapp.CTInAppNotification;
import com.clevertap.android.sdk.inapp.customtemplates.CustomTemplateInAppData;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.verifyApplicationThreadAndInitState;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0000\n\u0002\u0010%\n\u0000\b\u0000\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB\u001d\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\t¢\u0006\u0004\b\r\u0010\u000eJ%\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0004\u001a\u00020\u000f2\u0006\u0010\u0006\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0004\u001a\u00020\u000f¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u000b\u001a\u00020\u00132\u0006\u0010\u0004\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u000b\u0010\u0019J)\u0010\r\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u0004\u001a\u00020\u000f2\u0006\u0010\u0006\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\r\u0010\u001aR\u0014\u0010\u000b\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u001bR \u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00030\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u001dR \u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00180\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u001d"}, d2 = {"Lo/handleRelease;", "Lo/verifyApplicationThreadAndInitState$IconCompatParcelizer;", "", "Lo/updateStateAndInformListeners;", "p0", "Lo/RendererWakeupListener;", "p1", "<init>", "(Ljava/util/Collection;Lo/RendererWakeupListener;)V", "", "", "AudioAttributesCompatParcelizer", "(Ljava/lang/String;)Z", "read", "(Ljava/lang/String;)Lo/updateStateAndInformListeners;", "Lcom/clevertap/android/sdk/inapp/CTInAppNotification;", "Lo/lambdaupdateStateAndInformListeners54;", "Lo/SimpleBasePlayerExternalSyntheticLambda6;", "p2", "", "IconCompatParcelizer", "(Lcom/clevertap/android/sdk/inapp/CTInAppNotification;Lo/lambdaupdateStateAndInformListeners54;Lo/SimpleBasePlayerExternalSyntheticLambda6;)V", "write", "(Lcom/clevertap/android/sdk/inapp/CTInAppNotification;)V", "Lo/verifyApplicationThreadAndInitState;", "(Lo/verifyApplicationThreadAndInitState;)V", "(Lcom/clevertap/android/sdk/inapp/CTInAppNotification;Lo/lambdaupdateStateAndInformListeners54;Lo/SimpleBasePlayerExternalSyntheticLambda6;)Lo/verifyApplicationThreadAndInitState;", "Lo/RendererWakeupListener;", "", "Ljava/util/Map;", "", "RemoteActionCompatParcelizer"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class handleRelease implements verifyApplicationThreadAndInitState.IconCompatParcelizer {

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final List<handlePrepare> read = new ArrayList();

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final Map<String, updateStateAndInformListeners> write;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final Map<String, verifyApplicationThreadAndInitState> RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final RendererWakeupListener AudioAttributesCompatParcelizer;

    public handleRelease(Collection<updateStateAndInformListeners> collection, RendererWakeupListener rendererWakeupListener) {
        toMagicModuleMetaRepoModel.write(collection, "");
        toMagicModuleMetaRepoModel.write(rendererWakeupListener, "");
        this.AudioAttributesCompatParcelizer = rendererWakeupListener;
        Collection<updateStateAndInformListeners> collection2 = collection;
        LinkedHashMap linkedHashMap = new LinkedHashMap(getQues.write(VideoTimelineResponseBody.read(IntermediateLoginResponseBody.RemoteActionCompatParcelizer(collection2, 10)), 16));
        for (Object obj : collection2) {
            linkedHashMap.put(((updateStateAndInformListeners) obj).getIconCompatParcelizer(), obj);
        }
        this.write = linkedHashMap;
        this.RemoteActionCompatParcelizer = new LinkedHashMap();
    }

    /* JADX INFO: renamed from: o.handleRelease$RemoteActionCompatParcelizer, reason: from kotlin metadata */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0007¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f"}, d2 = {"Lo/handleRelease$RemoteActionCompatParcelizer;", "", "<init>", "()V", "Lcom/clevertap/android/sdk/CleverTapInstanceConfig;", "p0", "", "Lo/updateStateAndInformListeners;", "p1", "Lo/handleRelease;", "IconCompatParcelizer", "(Lcom/clevertap/android/sdk/CleverTapInstanceConfig;Ljava/util/Set;)Lo/handleRelease;", "", "Lo/handlePrepare;", "read", "Ljava/util/List;", "write"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @getMagicModuleMeta
        public static handleRelease IconCompatParcelizer(CleverTapInstanceConfig p0, Set<updateStateAndInformListeners> p1) {
            toMagicModuleMetaRepoModel.write(p0, "");
            toMagicModuleMetaRepoModel.write(p1, "");
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            Iterator it = handleRelease.read.iterator();
            while (it.hasNext()) {
                for (updateStateAndInformListeners updatestateandinformlisteners : ((handlePrepare) it.next()).IconCompatParcelizer()) {
                    if (updatestateandinformlisteners.getAudioAttributesImplApi26Parcelizer()) {
                        StringBuilder sb = new StringBuilder("Cannot define system template with a name \"");
                        sb.append(updatestateandinformlisteners.getIconCompatParcelizer());
                        sb.append("\".");
                        throw new getPlaceholderMediaItemData(sb.toString(), null, 2, null);
                    }
                    if (p1.contains(updatestateandinformlisteners)) {
                        StringBuilder sb2 = new StringBuilder("CustomTemplate with a name \"");
                        sb2.append(updatestateandinformlisteners.getIconCompatParcelizer());
                        sb2.append("\" is a system template.");
                        throw new getPlaceholderMediaItemData(sb2.toString(), null, 2, null);
                    }
                    if (linkedHashSet.contains(updatestateandinformlisteners)) {
                        StringBuilder sb3 = new StringBuilder("CustomTemplate with a name \"");
                        sb3.append(updatestateandinformlisteners.getIconCompatParcelizer());
                        sb3.append("\" is already registered.");
                        throw new getPlaceholderMediaItemData(sb3.toString(), null, 2, null);
                    }
                    linkedHashSet.add(updatestateandinformlisteners);
                }
            }
            linkedHashSet.addAll(p1);
            RendererWakeupListener rendererWakeupListenerMediaBrowserCompatItemReceiver = p0.MediaBrowserCompatItemReceiver();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(rendererWakeupListenerMediaBrowserCompatItemReceiver, "");
            return new handleRelease(linkedHashSet, rendererWakeupListenerMediaBrowserCompatItemReceiver);
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }

    public final boolean AudioAttributesCompatParcelizer(String p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        return this.write.containsKey(p0);
    }

    public final updateStateAndInformListeners read(String p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        return this.write.get(p0);
    }

    public final void IconCompatParcelizer(CTInAppNotification p0, lambdaupdateStateAndInformListeners54 p1, SimpleBasePlayerExternalSyntheticLambda6 p2) {
        toMagicModuleMetaRepoModel.write(p0, "");
        toMagicModuleMetaRepoModel.write(p1, "");
        toMagicModuleMetaRepoModel.write(p2, "");
        verifyApplicationThreadAndInitState verifyapplicationthreadandinitstate = read(p0, p1, p2);
        if (verifyapplicationthreadandinitstate != null) {
            updateStateAndInformListeners updatestateandinformlisteners = this.write.get(verifyapplicationthreadandinitstate.getAudioAttributesCompatParcelizer());
            if (updatestateandinformlisteners == null) {
                RendererWakeupListener rendererWakeupListener = this.AudioAttributesCompatParcelizer;
                verifyapplicationthreadandinitstate.getAudioAttributesCompatParcelizer();
                rendererWakeupListener.AudioAttributesCompatParcelizer();
                return;
            }
            shouldHandleCommand<?> shouldhandlecommandAudioAttributesCompatParcelizer = updatestateandinformlisteners.AudioAttributesCompatParcelizer();
            if (shouldhandlecommandAudioAttributesCompatParcelizer instanceof handleReplaceMediaItems) {
                if (verifyapplicationthreadandinitstate instanceof verifyApplicationThreadAndInitState.read) {
                    this.RemoteActionCompatParcelizer.put(updatestateandinformlisteners.getIconCompatParcelizer(), verifyapplicationthreadandinitstate);
                    ((handleReplaceMediaItems) shouldhandlecommandAudioAttributesCompatParcelizer).read(verifyapplicationthreadandinitstate);
                    return;
                }
                return;
            }
            if ((shouldhandlecommandAudioAttributesCompatParcelizer instanceof handleDecreaseDeviceVolume) && (verifyapplicationthreadandinitstate instanceof verifyApplicationThreadAndInitState.write)) {
                this.RemoteActionCompatParcelizer.put(updatestateandinformlisteners.getIconCompatParcelizer(), verifyapplicationthreadandinitstate);
                ((handleDecreaseDeviceVolume) shouldhandlecommandAudioAttributesCompatParcelizer).read(verifyapplicationthreadandinitstate);
            }
        }
    }

    public final void write(CTInAppNotification p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        CustomTemplateInAppData onFastForward = p0.getOnFastForward();
        String remoteActionCompatParcelizer = onFastForward != null ? onFastForward.getRemoteActionCompatParcelizer() : null;
        if (remoteActionCompatParcelizer == null) {
            this.AudioAttributesCompatParcelizer.IconCompatParcelizer("CustomTemplates", "Cannot close custom template from notification without template name");
            return;
        }
        verifyApplicationThreadAndInitState verifyapplicationthreadandinitstate = this.RemoteActionCompatParcelizer.get(remoteActionCompatParcelizer);
        if (verifyapplicationthreadandinitstate == null) {
            this.AudioAttributesCompatParcelizer.IconCompatParcelizer("CustomTemplates", "Cannot close custom template without active context");
            return;
        }
        updateStateAndInformListeners updatestateandinformlisteners = this.write.get(remoteActionCompatParcelizer);
        if (updatestateandinformlisteners == null) {
            this.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer();
            return;
        }
        shouldHandleCommand<?> shouldhandlecommandAudioAttributesCompatParcelizer = updatestateandinformlisteners.AudioAttributesCompatParcelizer();
        if ((shouldhandlecommandAudioAttributesCompatParcelizer instanceof handleReplaceMediaItems) && (verifyapplicationthreadandinitstate instanceof verifyApplicationThreadAndInitState.read)) {
        }
    }

    @Override // o.verifyApplicationThreadAndInitState.IconCompatParcelizer
    public final void AudioAttributesCompatParcelizer(verifyApplicationThreadAndInitState p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        this.RemoteActionCompatParcelizer.remove(p0.getAudioAttributesCompatParcelizer());
    }

    private final verifyApplicationThreadAndInitState read(CTInAppNotification p0, lambdaupdateStateAndInformListeners54 p1, SimpleBasePlayerExternalSyntheticLambda6 p2) {
        CustomTemplateInAppData onFastForward = p0.getOnFastForward();
        String remoteActionCompatParcelizer = onFastForward != null ? onFastForward.getRemoteActionCompatParcelizer() : null;
        if (remoteActionCompatParcelizer == null) {
            this.AudioAttributesCompatParcelizer.IconCompatParcelizer("CustomTemplates", "Cannot create TemplateContext from notification without template name");
            return null;
        }
        updateStateAndInformListeners updatestateandinformlisteners = this.write.get(remoteActionCompatParcelizer);
        if (updatestateandinformlisteners == null) {
            this.AudioAttributesCompatParcelizer.IconCompatParcelizer("CustomTemplates", "Cannot create TemplateContext for non-registered template: ".concat(String.valueOf(remoteActionCompatParcelizer)));
            return null;
        }
        verifyApplicationThreadAndInitState.Companion companion = verifyApplicationThreadAndInitState.INSTANCE;
        return verifyApplicationThreadAndInitState.Companion.AudioAttributesCompatParcelizer(updatestateandinformlisteners, p0, p1, p2, this, this.AudioAttributesCompatParcelizer);
    }
}
