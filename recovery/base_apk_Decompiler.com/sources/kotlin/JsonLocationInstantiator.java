package kotlin;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import kotlin.JdkDeserializers;

/* JADX INFO: loaded from: classes2.dex */
public final class JsonLocationInstantiator {
    protected boolean AudioAttributesCompatParcelizer;
    protected JdkDeserializers AudioAttributesImplApi21Parcelizer;
    protected JdkDeserializers AudioAttributesImplApi26Parcelizer;
    protected JdkDeserializers AudioAttributesImplBaseParcelizer;
    protected boolean IconCompatParcelizer;
    protected JdkDeserializers MediaBrowserCompatCustomActionResultReceiver;
    protected float MediaBrowserCompatItemReceiver = BitmapDescriptorFactory.HUE_RED;
    protected int MediaBrowserCompatMediaItem;
    protected ArrayList<JdkDeserializers> MediaBrowserCompatSearchResultReceiver;
    private boolean MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
    private boolean MediaDescriptionCompat;
    private boolean MediaMetadataCompat;
    protected int RatingCompat;
    protected JdkDeserializers RemoteActionCompatParcelizer;
    private int handleMediaPlayPauseIfPendingOnHandler;
    private boolean onAddQueueItem;
    private int onCommand;
    private boolean onCustomAction;
    private int onFastForward;
    private int onMediaButtonEvent;
    protected JdkDeserializers read;
    protected JdkDeserializers write;

    public JsonLocationInstantiator(JdkDeserializers jdkDeserializers, int i, boolean z) {
        this.read = jdkDeserializers;
        this.onCommand = i;
        this.onAddQueueItem = z;
    }

    private static boolean RemoteActionCompatParcelizer(JdkDeserializers jdkDeserializers, int i) {
        if (jdkDeserializers.onRewind() == 8 || jdkDeserializers.MediaBrowserCompatSearchResultReceiver[i] != JdkDeserializers.IconCompatParcelizer.MATCH_CONSTRAINT) {
            return false;
        }
        return jdkDeserializers.onPrepareFromSearch[i] == 0 || jdkDeserializers.onPrepareFromSearch[i] == 3;
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x0114  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void write() {
        /*
            Method dump skipped, instruction units count: 392
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.JsonLocationInstantiator.write():void");
    }

    public final void RemoteActionCompatParcelizer() {
        if (!this.MediaDescriptionCompat) {
            write();
        }
        this.MediaDescriptionCompat = true;
    }
}
