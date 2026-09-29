package kotlin;

import android.content.Context;
import com.clevertap.android.sdk.CleverTapInstanceConfig;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes.dex */
public final class setPlaylist {
    private final CleverTapInstanceConfig AudioAttributesCompatParcelizer;
    private final getUids AudioAttributesImplApi21Parcelizer;
    private final copyWithPlaceholderTimeline AudioAttributesImplApi26Parcelizer;
    private final Context AudioAttributesImplBaseParcelizer;
    private final PlaybackParameters IconCompatParcelizer;
    private final setSurfaceSize MediaBrowserCompatCustomActionResultReceiver;
    private final PlayerListener MediaBrowserCompatItemReceiver;
    private final r8lambda3EoLwxJB4A25pAog2xOLUUC2nk MediaBrowserCompatMediaItem;
    private final getChildTimelines MediaBrowserCompatSearchResultReceiver;
    private final lambdaprepare7 MediaDescriptionCompat;
    private final getContentResumeOffsetUs MediaMetadataCompat;
    private final setPlayerError RatingCompat;
    private final addAllCommands RemoteActionCompatParcelizer;
    private final RendererCapabilitiesTunnelingSupport handleMediaPlayPauseIfPendingOnHandler;
    private final lambdaonAudioCodecError11 onAddQueueItem;
    private String read = null;
    private final lambdasetVideoSurface17 write;

    public setPlaylist(Context context, CleverTapInstanceConfig cleverTapInstanceConfig, getChildTimelines getchildtimelines, lambdaonAudioCodecError11 lambdaonaudiocodecerror11, lambdasetVideoSurface17 lambdasetvideosurface17, PlaybackParameters playbackParameters, copyWithPlaceholderTimeline copywithplaceholdertimeline, getUids getuids, RendererCapabilitiesTunnelingSupport rendererCapabilitiesTunnelingSupport, r8lambda3EoLwxJB4A25pAog2xOLUUC2nk r8lambda3eolwxjb4a25paog2xoluuc2nk, addAllCommands addallcommands, lambdasetDeviceMuted28 lambdasetdevicemuted28, PlayerListener playerListener, setPlayerError setplayererror, setSurfaceSize setsurfacesize) {
        this.AudioAttributesCompatParcelizer = cleverTapInstanceConfig;
        this.AudioAttributesImplBaseParcelizer = context;
        this.MediaBrowserCompatSearchResultReceiver = getchildtimelines;
        this.onAddQueueItem = lambdaonaudiocodecerror11;
        this.write = lambdasetvideosurface17;
        this.IconCompatParcelizer = playbackParameters;
        this.AudioAttributesImplApi26Parcelizer = copywithplaceholdertimeline;
        this.MediaMetadataCompat = getuids.AudioAttributesImplBaseParcelizer();
        this.handleMediaPlayPauseIfPendingOnHandler = rendererCapabilitiesTunnelingSupport;
        this.MediaBrowserCompatMediaItem = r8lambda3eolwxjb4a25paog2xoluuc2nk;
        this.RemoteActionCompatParcelizer = addallcommands;
        this.MediaDescriptionCompat = lambdasetdevicemuted28;
        this.AudioAttributesImplApi21Parcelizer = getuids;
        this.MediaBrowserCompatItemReceiver = playerListener;
        this.RatingCompat = setplayererror;
        this.MediaBrowserCompatCustomActionResultReceiver = setsurfacesize;
    }

    public final void write(final Map<String, Object> map, final String str, final String str2) {
        TracksExternalSyntheticLambda0.AudioAttributesCompatParcelizer(this.AudioAttributesCompatParcelizer).read().read("resetProfile", new Callable<Void>() { // from class: o.setPlaylist.2
            /* JADX INFO: Access modifiers changed from: private */
            @Override // java.util.concurrent.Callable
            /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
            public Void call() {
                String string;
                try {
                    RendererWakeupListener rendererWakeupListenerMediaBrowserCompatItemReceiver = setPlaylist.this.AudioAttributesCompatParcelizer.MediaBrowserCompatItemReceiver();
                    String strWrite = setPlaylist.this.AudioAttributesCompatParcelizer.write();
                    StringBuilder sb = new StringBuilder("asyncProfileSwitchUser:[profile ");
                    sb.append(map);
                    sb.append(" with Cached GUID ");
                    if (str != null) {
                        string = setPlaylist.this.read;
                    } else {
                        StringBuilder sb2 = new StringBuilder("NULL and cleverTapID ");
                        sb2.append(str2);
                        string = sb2.toString();
                    }
                    sb.append(string);
                    rendererWakeupListenerMediaBrowserCompatItemReceiver.write(strWrite, sb.toString());
                    setPlaylist.this.AudioAttributesImplApi26Parcelizer.write(false);
                    setPlaylist.this.MediaMetadataCompat.AudioAttributesCompatParcelizer(false);
                    setPlaylist.this.write.RemoteActionCompatParcelizer(setPlaylist.this.AudioAttributesImplBaseParcelizer, lambdasetVideoSurfaceHolder18.REGULAR, null, true);
                    setPlaylist.this.write.RemoteActionCompatParcelizer(setPlaylist.this.AudioAttributesImplBaseParcelizer, lambdasetVideoSurfaceHolder18.PUSH_NOTIFICATION_VIEWED, null, true);
                    setPlaylist.this.MediaBrowserCompatCustomActionResultReceiver.write();
                    setPlaylist.this.MediaDescriptionCompat.write(setPlaylist.this.AudioAttributesImplBaseParcelizer);
                    copyWithPlaceholderTimeline.MediaBrowserCompatCustomActionResultReceiver();
                    setPlaylist.this.handleMediaPlayPauseIfPendingOnHandler.read();
                    if (str != null) {
                        setPlaylist.this.MediaBrowserCompatSearchResultReceiver.IconCompatParcelizer(str);
                        setPlaylist.this.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer(str);
                    } else if (setPlaylist.this.AudioAttributesCompatParcelizer.read()) {
                        setPlaylist.this.MediaBrowserCompatSearchResultReceiver.RemoteActionCompatParcelizer(str2);
                    } else {
                        setPlaylist.this.MediaBrowserCompatSearchResultReceiver.write();
                    }
                    setPlaylist.this.MediaBrowserCompatMediaItem.write();
                    setPlaylist.this.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer(setPlaylist.this.MediaBrowserCompatSearchResultReceiver.MediaBrowserCompatCustomActionResultReceiver());
                    setPlaylist.this.MediaBrowserCompatSearchResultReceiver.onPrepareFromMediaId();
                    setPlaylist.this.MediaBrowserCompatSearchResultReceiver.onRemoveQueueItem();
                    setPlaylist.this.MediaBrowserCompatCustomActionResultReceiver();
                    setPlaylist.this.IconCompatParcelizer.read();
                    if (map != null) {
                        setPlaylist.this.IconCompatParcelizer.AudioAttributesCompatParcelizer(map);
                    }
                    setPlaylist.this.MediaMetadataCompat.AudioAttributesCompatParcelizer(true);
                    setPlaylist.this.write();
                    setPlaylist.this.AudioAttributesCompatParcelizer();
                    setPlaylist.this.AudioAttributesImplBaseParcelizer();
                    setPlaylist.this.RemoteActionCompatParcelizer();
                    setPlaylist.this.IconCompatParcelizer();
                    setPlaylist.this.read();
                    setPlaylist.this.AudioAttributesImplApi21Parcelizer.MediaBrowserCompatItemReceiver().AudioAttributesCompatParcelizer(setPlaylist.this.MediaBrowserCompatSearchResultReceiver.MediaBrowserCompatCustomActionResultReceiver());
                } catch (Throwable unused) {
                    RendererWakeupListener rendererWakeupListenerMediaBrowserCompatItemReceiver2 = setPlaylist.this.AudioAttributesCompatParcelizer.MediaBrowserCompatItemReceiver();
                    setPlaylist.this.AudioAttributesCompatParcelizer.write();
                    rendererWakeupListenerMediaBrowserCompatItemReceiver2.IconCompatParcelizer();
                }
                return null;
            }
        });
    }

    public final void read() {
        List<setMaxSeekToPreviousPositionMs> listRemoteActionCompatParcelizer = this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer();
        synchronized (listRemoteActionCompatParcelizer) {
            for (setMaxSeekToPreviousPositionMs setmaxseektopreviouspositionms : listRemoteActionCompatParcelizer) {
                if (setmaxseektopreviouspositionms != null) {
                    setmaxseektopreviouspositionms.write(this.MediaBrowserCompatSearchResultReceiver.MediaBrowserCompatCustomActionResultReceiver(), this.AudioAttributesCompatParcelizer.write());
                }
            }
        }
    }

    public final void write(final Map<String, Object> map, String str) {
        if (this.AudioAttributesCompatParcelizer.read()) {
            RendererWakeupListener.MediaBrowserCompatCustomActionResultReceiver();
        }
        final String str2 = null;
        TracksExternalSyntheticLambda0.AudioAttributesCompatParcelizer(this.AudioAttributesCompatParcelizer).read().read("_onUserLogin", new Callable<Void>() { // from class: o.setPlaylist.3
            /* JADX INFO: Access modifiers changed from: private */
            @Override // java.util.concurrent.Callable
            /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
            public Void call() {
                setPlaylist.this.read(map, str2);
                return null;
            }
        });
    }

    public final void RemoteActionCompatParcelizer() {
        Iterator<generateMediaPeriodEventTime> it = this.MediaBrowserCompatSearchResultReceiver.onPlayFromMediaId().iterator();
        while (it.hasNext()) {
            this.onAddQueueItem.read(it.next());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void read(Map<String, Object> map, String str) {
        String string;
        if (map != null) {
            try {
                String strMediaBrowserCompatCustomActionResultReceiver = this.MediaBrowserCompatSearchResultReceiver.MediaBrowserCompatCustomActionResultReceiver();
                if (strMediaBrowserCompatCustomActionResultReceiver != null) {
                    setDeviceInfo setdeviceinfoAudioAttributesCompatParcelizer = setIsLoading.AudioAttributesCompatParcelizer(this.AudioAttributesImplBaseParcelizer, this.AudioAttributesCompatParcelizer, this.onAddQueueItem);
                    boolean z = false;
                    for (String str2 : map.keySet()) {
                        Object obj = map.get(str2);
                        if (setdeviceinfoAudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(str2)) {
                            if (obj != null) {
                                try {
                                    string = obj.toString();
                                } catch (Throwable unused) {
                                    continue;
                                }
                            } else {
                                string = null;
                            }
                            if (string != null && !string.isEmpty()) {
                                z = true;
                                String strIconCompatParcelizer = this.RatingCompat.IconCompatParcelizer(str2, string);
                                this.read = strIconCompatParcelizer;
                                if (strIconCompatParcelizer != null) {
                                    break;
                                }
                            }
                        }
                    }
                    if (!this.MediaBrowserCompatSearchResultReceiver.onPrepare() && (!z || this.RatingCompat.AudioAttributesCompatParcelizer())) {
                        this.AudioAttributesCompatParcelizer.MediaBrowserCompatItemReceiver().IconCompatParcelizer(this.AudioAttributesCompatParcelizer.write(), "onUserLogin: no identifier provided or device is anonymous, pushing on current user profile");
                        this.IconCompatParcelizer.AudioAttributesCompatParcelizer(map);
                        return;
                    }
                    String str3 = this.read;
                    if (str3 != null && str3.equals(strMediaBrowserCompatCustomActionResultReceiver)) {
                        RendererWakeupListener rendererWakeupListenerMediaBrowserCompatItemReceiver = this.AudioAttributesCompatParcelizer.MediaBrowserCompatItemReceiver();
                        String strWrite = this.AudioAttributesCompatParcelizer.write();
                        StringBuilder sb = new StringBuilder();
                        sb.append("onUserLogin: ");
                        sb.append(map);
                        sb.append(" maps to current device id ");
                        sb.append(strMediaBrowserCompatCustomActionResultReceiver);
                        sb.append(" pushing on current profile");
                        rendererWakeupListenerMediaBrowserCompatItemReceiver.IconCompatParcelizer(strWrite, sb.toString());
                        this.IconCompatParcelizer.AudioAttributesCompatParcelizer(map);
                        return;
                    }
                    RendererWakeupListener rendererWakeupListenerMediaBrowserCompatItemReceiver2 = this.AudioAttributesCompatParcelizer.MediaBrowserCompatItemReceiver();
                    String strWrite2 = this.AudioAttributesCompatParcelizer.write();
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("onUserLogin: queuing reset profile for ");
                    sb2.append(map);
                    sb2.append(" with Cached GUID ");
                    String str4 = this.read;
                    if (str4 == null) {
                        str4 = "NULL";
                    }
                    sb2.append(str4);
                    rendererWakeupListenerMediaBrowserCompatItemReceiver2.write(strWrite2, sb2.toString());
                    write(map, this.read, str);
                }
            } catch (Throwable unused2) {
                RendererWakeupListener rendererWakeupListenerMediaBrowserCompatItemReceiver3 = this.AudioAttributesCompatParcelizer.MediaBrowserCompatItemReceiver();
                this.AudioAttributesCompatParcelizer.write();
                rendererWakeupListenerMediaBrowserCompatItemReceiver3.IconCompatParcelizer();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void IconCompatParcelizer() {
        if (this.AudioAttributesImplApi21Parcelizer.RemoteActionCompatParcelizer() != null) {
            this.AudioAttributesImplApi21Parcelizer.RemoteActionCompatParcelizer().read();
        } else {
            this.AudioAttributesCompatParcelizer.MediaBrowserCompatItemReceiver().write(this.AudioAttributesCompatParcelizer.write(), "DisplayUnit : Can't reset Display Units, DisplayUnitcontroller is null");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void AudioAttributesCompatParcelizer() {
        lambdasetVideoTextureView20 lambdasetvideotextureview20AudioAttributesCompatParcelizer = this.AudioAttributesImplApi21Parcelizer.AudioAttributesCompatParcelizer();
        if (lambdasetvideotextureview20AudioAttributesCompatParcelizer != null && lambdasetvideotextureview20AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer()) {
            lambdasetvideotextureview20AudioAttributesCompatParcelizer.read(this.MediaBrowserCompatSearchResultReceiver.MediaBrowserCompatCustomActionResultReceiver());
            lambdasetvideotextureview20AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer();
        } else {
            this.AudioAttributesCompatParcelizer.MediaBrowserCompatItemReceiver().write(this.AudioAttributesCompatParcelizer.write(), "DisplayUnit : Can't reset Display Units, CTFeatureFlagsController is null");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void write() {
        synchronized (this.MediaBrowserCompatItemReceiver.RemoteActionCompatParcelizer()) {
            this.AudioAttributesImplApi21Parcelizer.AudioAttributesCompatParcelizer((SimpleBasePlayerPositionSupplier) null);
        }
        this.AudioAttributesImplApi21Parcelizer.AudioAttributesImplApi21Parcelizer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void AudioAttributesImplBaseParcelizer() {
        if (this.AudioAttributesCompatParcelizer.MediaMetadataCompat()) {
            this.AudioAttributesCompatParcelizer.MediaBrowserCompatItemReceiver().IconCompatParcelizer(this.AudioAttributesCompatParcelizer.write(), "Product Config is not enabled for this instance");
            return;
        }
        if (this.AudioAttributesImplApi21Parcelizer.IconCompatParcelizer() != null) {
            this.AudioAttributesImplApi21Parcelizer.IconCompatParcelizer().IconCompatParcelizer();
        }
        this.AudioAttributesImplApi21Parcelizer.write(getNextPeriodIndex.read(this.AudioAttributesImplBaseParcelizer, this.MediaBrowserCompatSearchResultReceiver, this.AudioAttributesCompatParcelizer, this.IconCompatParcelizer, this.AudioAttributesImplApi26Parcelizer, this.RemoteActionCompatParcelizer));
        this.AudioAttributesCompatParcelizer.MediaBrowserCompatItemReceiver().write(this.AudioAttributesCompatParcelizer.write(), "Product Config reset");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void MediaBrowserCompatCustomActionResultReceiver() {
        if (this.AudioAttributesImplApi21Parcelizer.write() != null) {
            this.AudioAttributesImplApi21Parcelizer.write().IconCompatParcelizer();
        }
    }
}
