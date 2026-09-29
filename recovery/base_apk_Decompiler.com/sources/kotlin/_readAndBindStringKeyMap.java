package kotlin;

import java.util.HashSet;
import kotlin.JdkDeserializers;
import kotlin._readAndBind;

/* JADX INFO: loaded from: classes2.dex */
public class _readAndBindStringKeyMap extends JsonNodeDeserializerArrayDeserializer {
    private int PlaybackStateCompatCustomAction = 0;
    private int PlaybackStateCompat = 0;
    private int r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM = 0;
    private int r8lambdaKUbBm7ckfqTc9QCgukC86fguu4 = 0;
    private int ResultReceiver = 0;
    private int ParcelableVolumeInfo = 0;
    private int r8lambda4IRRzyoWeWaykEOcgWGjbNoGAkw = 0;
    private int r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8 = 0;
    private boolean MediaSessionCompatToken = false;
    private int MediaSessionCompatResultReceiverWrapper = 0;
    private int onSkipToPrevious = 0;
    private _readAndBind.IconCompatParcelizer onSkipToQueueItem = new _readAndBind.IconCompatParcelizer();
    private _readAndBind.write MediaSessionCompatQueueItem = null;

    public void read(int i, int i2, int i3, int i4) {
    }

    public final void onSetCaptioningEnabled(int i) {
        this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM = i;
        this.PlaybackStateCompatCustomAction = i;
        this.r8lambdaKUbBm7ckfqTc9QCgukC86fguu4 = i;
        this.PlaybackStateCompat = i;
        this.ResultReceiver = i;
        this.ParcelableVolumeInfo = i;
    }

    public final void onSkipToQueueItem(int i) {
        this.ResultReceiver = i;
        this.r8lambda4IRRzyoWeWaykEOcgWGjbNoGAkw = i;
        this.r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8 = i;
    }

    public final void onSetShuffleMode(int i) {
        this.ParcelableVolumeInfo = i;
    }

    public final void onSetRepeatMode(int i) {
        this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM = i;
        this.r8lambda4IRRzyoWeWaykEOcgWGjbNoGAkw = i;
    }

    public final void write(boolean z) {
        int i = this.ResultReceiver;
        if (i > 0 || this.ParcelableVolumeInfo > 0) {
            if (z) {
                this.r8lambda4IRRzyoWeWaykEOcgWGjbNoGAkw = this.ParcelableVolumeInfo;
                this.r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8 = i;
            } else {
                this.r8lambda4IRRzyoWeWaykEOcgWGjbNoGAkw = i;
                this.r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8 = this.ParcelableVolumeInfo;
            }
        }
    }

    public final void onStop(int i) {
        this.PlaybackStateCompatCustomAction = i;
    }

    public final void onSkipToPrevious(int i) {
        this.r8lambdaKUbBm7ckfqTc9QCgukC86fguu4 = i;
        this.r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8 = i;
    }

    public final void onSetPlaybackSpeed(int i) {
        this.PlaybackStateCompat = i;
    }

    public final int r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28() {
        return this.PlaybackStateCompatCustomAction;
    }

    public final int AudioAttributesCompatParcelizer() {
        return this.PlaybackStateCompat;
    }

    public final int AudioAttributesImplBaseParcelizer() {
        return this.r8lambda4IRRzyoWeWaykEOcgWGjbNoGAkw;
    }

    public final int AudioAttributesImplApi26Parcelizer() {
        return this.r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8;
    }

    protected final void RemoteActionCompatParcelizer(boolean z) {
        this.MediaSessionCompatToken = z;
    }

    public final boolean _init_lambda5() {
        return this.MediaSessionCompatToken;
    }

    @Override // kotlin.JsonNodeDeserializerArrayDeserializer, kotlin.JsonNodeDeserializer
    public final void MediaBrowserCompatMediaItem() {
        write();
    }

    public final void write() {
        for (int i = 0; i < ((JsonNodeDeserializerArrayDeserializer) this).onStop; i++) {
            JdkDeserializers jdkDeserializers = ((JsonNodeDeserializerArrayDeserializer) this).setSessionImpl[i];
            if (jdkDeserializers != null) {
                jdkDeserializers._init_lambda3();
            }
        }
    }

    public final int RemoteActionCompatParcelizer() {
        return this.MediaSessionCompatResultReceiverWrapper;
    }

    public final int IconCompatParcelizer() {
        return this.onSkipToPrevious;
    }

    public final void MediaBrowserCompatItemReceiver(int i, int i2) {
        this.MediaSessionCompatResultReceiverWrapper = i;
        this.onSkipToPrevious = i2;
    }

    protected final boolean accessgetReportFullyDrawnExecutorp() {
        _readAndBind.write writeVarIconCompatParcelizer = this.onPlayFromSearch != null ? ((_long) this.onPlayFromSearch).IconCompatParcelizer() : null;
        if (writeVarIconCompatParcelizer == null) {
            return false;
        }
        for (int i = 0; i < ((JsonNodeDeserializerArrayDeserializer) this).onStop; i++) {
            JdkDeserializers jdkDeserializers = ((JsonNodeDeserializerArrayDeserializer) this).setSessionImpl[i];
            if (jdkDeserializers != null && !(jdkDeserializers instanceof _deserializeUsingCreator)) {
                JdkDeserializers.IconCompatParcelizer iconCompatParcelizerRemoteActionCompatParcelizer = jdkDeserializers.RemoteActionCompatParcelizer(0);
                JdkDeserializers.IconCompatParcelizer iconCompatParcelizerRemoteActionCompatParcelizer2 = jdkDeserializers.RemoteActionCompatParcelizer(1);
                if (iconCompatParcelizerRemoteActionCompatParcelizer != JdkDeserializers.IconCompatParcelizer.MATCH_CONSTRAINT || jdkDeserializers.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver == 1 || iconCompatParcelizerRemoteActionCompatParcelizer2 != JdkDeserializers.IconCompatParcelizer.MATCH_CONSTRAINT || jdkDeserializers.onAddQueueItem == 1) {
                    if (iconCompatParcelizerRemoteActionCompatParcelizer == JdkDeserializers.IconCompatParcelizer.MATCH_CONSTRAINT) {
                        iconCompatParcelizerRemoteActionCompatParcelizer = JdkDeserializers.IconCompatParcelizer.WRAP_CONTENT;
                    }
                    if (iconCompatParcelizerRemoteActionCompatParcelizer2 == JdkDeserializers.IconCompatParcelizer.MATCH_CONSTRAINT) {
                        iconCompatParcelizerRemoteActionCompatParcelizer2 = JdkDeserializers.IconCompatParcelizer.WRAP_CONTENT;
                    }
                    this.onSkipToQueueItem.read = iconCompatParcelizerRemoteActionCompatParcelizer;
                    this.onSkipToQueueItem.AudioAttributesImplApi26Parcelizer = iconCompatParcelizerRemoteActionCompatParcelizer2;
                    this.onSkipToQueueItem.write = jdkDeserializers.onSetShuffleMode();
                    this.onSkipToQueueItem.AudioAttributesImplBaseParcelizer = jdkDeserializers.onAddQueueItem();
                    writeVarIconCompatParcelizer.RemoteActionCompatParcelizer(jdkDeserializers, this.onSkipToQueueItem);
                    jdkDeserializers.onFastForward(this.onSkipToQueueItem.MediaBrowserCompatCustomActionResultReceiver);
                    jdkDeserializers.MediaMetadataCompat(this.onSkipToQueueItem.AudioAttributesImplApi21Parcelizer);
                    jdkDeserializers.MediaBrowserCompatSearchResultReceiver(this.onSkipToQueueItem.RemoteActionCompatParcelizer);
                }
            }
        }
        return true;
    }

    protected final void RemoteActionCompatParcelizer(JdkDeserializers jdkDeserializers, JdkDeserializers.IconCompatParcelizer iconCompatParcelizer, int i, JdkDeserializers.IconCompatParcelizer iconCompatParcelizer2, int i2) {
        while (this.MediaSessionCompatQueueItem == null && onPrepareFromMediaId() != null) {
            this.MediaSessionCompatQueueItem = ((_long) onPrepareFromMediaId()).IconCompatParcelizer();
        }
        this.onSkipToQueueItem.read = iconCompatParcelizer;
        this.onSkipToQueueItem.AudioAttributesImplApi26Parcelizer = iconCompatParcelizer2;
        this.onSkipToQueueItem.write = i;
        this.onSkipToQueueItem.AudioAttributesImplBaseParcelizer = i2;
        this.MediaSessionCompatQueueItem.RemoteActionCompatParcelizer(jdkDeserializers, this.onSkipToQueueItem);
        jdkDeserializers.onFastForward(this.onSkipToQueueItem.MediaBrowserCompatCustomActionResultReceiver);
        jdkDeserializers.MediaMetadataCompat(this.onSkipToQueueItem.AudioAttributesImplApi21Parcelizer);
        jdkDeserializers.read(this.onSkipToQueueItem.IconCompatParcelizer);
        jdkDeserializers.MediaBrowserCompatSearchResultReceiver(this.onSkipToQueueItem.RemoteActionCompatParcelizer);
    }

    public final boolean AudioAttributesCompatParcelizer(HashSet<JdkDeserializers> hashSet) {
        for (int i = 0; i < ((JsonNodeDeserializerArrayDeserializer) this).onStop; i++) {
            if (hashSet.contains(((JsonNodeDeserializerArrayDeserializer) this).setSessionImpl[i])) {
                return true;
            }
        }
        return false;
    }
}
