package kotlin;

import android.content.Context;
import android.content.pm.PackageItemInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import com.google.android.exoplayer2.source.rtsp.SessionDescription;
import java.security.GeneralSecurityException;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;

/* JADX INFO: loaded from: classes4.dex */
public final class PlanResponsePromo {
    public static boolean read = false;
    private final long AudioAttributesCompatParcelizer;
    private String AudioAttributesImplApi21Parcelizer;
    private final int AudioAttributesImplApi26Parcelizer;
    private String AudioAttributesImplBaseParcelizer;
    private final int IconCompatParcelizer;
    private int MediaBrowserCompatCustomActionResultReceiver;
    private final boolean MediaBrowserCompatItemReceiver;
    private FreeVideoListResponse MediaBrowserCompatMediaItem;
    private final int MediaBrowserCompatSearchResultReceiver;
    private final boolean MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
    private String MediaDescriptionCompat;
    private int MediaMetadataCompat;
    private final int RatingCompat;
    private final boolean RemoteActionCompatParcelizer;
    private boolean handleMediaPlayPauseIfPendingOnHandler = true;
    private final int onAddQueueItem;
    private SSLSocketFactory onCommand;
    private final String onCustomAction;
    private boolean onFastForward;
    private final boolean write;

    public static PlanResponsePromo AudioAttributesCompatParcelizer(Context context) {
        return read(context.getApplicationContext());
    }

    private PlanResponsePromo(Bundle bundle) {
        long jFloatValue;
        SSLSocketFactory socketFactory = null;
        try {
            SSLContext sSLContext = SSLContext.getInstance("TLS");
            sSLContext.init(null, null, null);
            socketFactory = sSLContext.getSocketFactory();
        } catch (GeneralSecurityException unused) {
        }
        this.onCommand = socketFactory;
        read = bundle.getBoolean("com.mixpanel.android.MPConfig.EnableDebugLogging", false);
        bundle.containsKey("com.mixpanel.android.MPConfig.DebugFlushInterval");
        this.IconCompatParcelizer = bundle.getInt("com.mixpanel.android.MPConfig.BulkUploadLimit", 40);
        this.AudioAttributesImplApi26Parcelizer = bundle.getInt("com.mixpanel.android.MPConfig.FlushInterval", 60000);
        this.MediaBrowserCompatCustomActionResultReceiver = bundle.getInt("com.mixpanel.android.MPConfig.FlushBatchSize", 50);
        this.MediaBrowserCompatItemReceiver = bundle.getBoolean("com.mixpanel.android.MPConfig.FlushOnBackground", true);
        this.MediaBrowserCompatSearchResultReceiver = bundle.getInt("com.mixpanel.android.MPConfig.MinimumDatabaseLimit", 20971520);
        this.MediaMetadataCompat = bundle.getInt("com.mixpanel.android.MPConfig.MaximumDatabaseLimit", Integer.MAX_VALUE);
        this.onCustomAction = bundle.getString("com.mixpanel.android.MPConfig.ResourcePackageName");
        this.RemoteActionCompatParcelizer = bundle.getBoolean("com.mixpanel.android.MPConfig.DisableAppOpenEvent", true);
        this.write = bundle.getBoolean("com.mixpanel.android.MPConfig.DisableExceptionHandler", false);
        this.RatingCompat = bundle.getInt("com.mixpanel.android.MPConfig.MinimumSessionDuration", 10000);
        this.onAddQueueItem = bundle.getInt("com.mixpanel.android.MPConfig.SessionTimeoutDuration", Integer.MAX_VALUE);
        this.onFastForward = bundle.getBoolean("com.mixpanel.android.MPConfig.UseIpAddressForGeolocation", true);
        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = bundle.getBoolean("com.mixpanel.android.MPConfig.RemoveLegacyResidualFiles", false);
        Object obj = bundle.get("com.mixpanel.android.MPConfig.DataExpiration");
        if (obj != null) {
            try {
                if (obj instanceof Integer) {
                    jFloatValue = ((Integer) obj).intValue();
                } else if (obj instanceof Float) {
                    jFloatValue = (long) ((Float) obj).floatValue();
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append(obj.toString());
                    sb.append(" is not a number.");
                    throw new NumberFormatException(sb.toString());
                }
            } catch (Exception unused2) {
                jFloatValue = 432000000;
            }
        } else {
            jFloatValue = 432000000;
        }
        this.AudioAttributesCompatParcelizer = jFloatValue;
        boolean zContainsKey = bundle.containsKey("com.mixpanel.android.MPConfig.UseIpAddressForGeolocation");
        String string = bundle.getString("com.mixpanel.android.MPConfig.EventsEndpoint");
        if (string != null) {
            read(zContainsKey ? write(string, onAddQueueItem()) : string);
        } else {
            IconCompatParcelizer("https://api.mixpanel.com");
        }
        String string2 = bundle.getString("com.mixpanel.android.MPConfig.PeopleEndpoint");
        if (string2 != null) {
            AudioAttributesCompatParcelizer(zContainsKey ? write(string2, onAddQueueItem()) : string2);
        } else {
            MediaBrowserCompatCustomActionResultReceiver("https://api.mixpanel.com");
        }
        String string3 = bundle.getString("com.mixpanel.android.MPConfig.GroupsEndpoint");
        if (string3 != null) {
            write(zContainsKey ? write(string3, onAddQueueItem()) : string3);
        } else {
            RemoteActionCompatParcelizer("https://api.mixpanel.com");
        }
    }

    public final int write() {
        return this.IconCompatParcelizer;
    }

    public final int AudioAttributesImplBaseParcelizer() {
        return this.AudioAttributesImplApi26Parcelizer;
    }

    public final boolean AudioAttributesImplApi21Parcelizer() {
        return this.MediaBrowserCompatItemReceiver;
    }

    public final int MediaBrowserCompatCustomActionResultReceiver() {
        return this.MediaBrowserCompatCustomActionResultReceiver;
    }

    public final long AudioAttributesCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    public final int MediaMetadataCompat() {
        return this.MediaBrowserCompatSearchResultReceiver;
    }

    public final int MediaBrowserCompatItemReceiver() {
        return this.MediaMetadataCompat;
    }

    public final boolean IconCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    public final String RemoteActionCompatParcelizer() {
        return this.AudioAttributesImplBaseParcelizer;
    }

    private boolean onCustomAction() {
        return this.handleMediaPlayPauseIfPendingOnHandler;
    }

    private static String write(String str, boolean z) {
        boolean zContains = str.contains("?ip=");
        String str2 = SessionDescription.SUPPORTED_SDP_VERSION;
        if (zContains) {
            StringBuilder sb = new StringBuilder();
            sb.append(str.substring(0, str.indexOf("?ip=")));
            sb.append("?ip=");
            if (z) {
                str2 = IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE;
            }
            sb.append(str2);
            return sb.toString();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append("?ip=");
        if (z) {
            str2 = IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE;
        }
        sb2.append(str2);
        return sb2.toString();
    }

    private void IconCompatParcelizer(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("/track/");
        read(write(sb.toString(), onAddQueueItem()));
    }

    private void read(String str) {
        this.AudioAttributesImplBaseParcelizer = str;
    }

    public final String RatingCompat() {
        return this.MediaDescriptionCompat;
    }

    private void MediaBrowserCompatCustomActionResultReceiver(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("/engage/");
        AudioAttributesCompatParcelizer(write(sb.toString(), onAddQueueItem()));
    }

    private void AudioAttributesCompatParcelizer(String str) {
        this.MediaDescriptionCompat = str;
    }

    public final String AudioAttributesImplApi26Parcelizer() {
        return this.AudioAttributesImplApi21Parcelizer;
    }

    private void RemoteActionCompatParcelizer(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("/groups/");
        write(write(sb.toString(), onAddQueueItem()));
    }

    private void write(String str) {
        this.AudioAttributesImplApi21Parcelizer = str;
    }

    public final int MediaBrowserCompatMediaItem() {
        return this.RatingCompat;
    }

    public final int MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver() {
        return this.onAddQueueItem;
    }

    public final boolean read() {
        return this.write;
    }

    private boolean onAddQueueItem() {
        return this.onFastForward;
    }

    public final boolean MediaBrowserCompatSearchResultReceiver() {
        return this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
    }

    public final SSLSocketFactory handleMediaPlayPauseIfPendingOnHandler() {
        SSLSocketFactory sSLSocketFactory;
        synchronized (this) {
            sSLSocketFactory = this.onCommand;
        }
        return sSLSocketFactory;
    }

    public final FreeVideoListResponse MediaDescriptionCompat() {
        synchronized (this) {
        }
        return null;
    }

    private static PlanResponsePromo read(Context context) {
        String packageName = context.getPackageName();
        try {
            Bundle bundle = ((PackageItemInfo) context.getPackageManager().getApplicationInfo(packageName, 128)).metaData;
            if (bundle == null) {
                bundle = new Bundle();
            }
            return new PlanResponsePromo(bundle);
        } catch (PackageManager.NameNotFoundException e) {
            throw new RuntimeException("Can't configure Mixpanel with package name ".concat(String.valueOf(packageName)), e);
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Mixpanel (7.4.1) configured with:\n    TrackAutomaticEvents: ");
        sb.append(onCustomAction());
        sb.append("\n    BulkUploadLimit ");
        sb.append(write());
        sb.append("\n    FlushInterval ");
        sb.append(AudioAttributesImplBaseParcelizer());
        sb.append("\n    FlushInterval ");
        sb.append(MediaBrowserCompatCustomActionResultReceiver());
        sb.append("\n    DataExpiration ");
        sb.append(AudioAttributesCompatParcelizer());
        sb.append("\n    MinimumDatabaseLimit ");
        sb.append(MediaMetadataCompat());
        sb.append("\n    MaximumDatabaseLimit ");
        sb.append(MediaBrowserCompatItemReceiver());
        sb.append("\n    DisableAppOpenEvent ");
        sb.append(IconCompatParcelizer());
        sb.append("\n    EnableDebugLogging ");
        sb.append(read);
        sb.append("\n    EventsEndpoint ");
        sb.append(RemoteActionCompatParcelizer());
        sb.append("\n    PeopleEndpoint ");
        sb.append(RatingCompat());
        sb.append("\n    MinimumSessionDuration: ");
        sb.append(MediaBrowserCompatMediaItem());
        sb.append("\n    SessionTimeoutDuration: ");
        sb.append(MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver());
        sb.append("\n    DisableExceptionHandler: ");
        sb.append(read());
        sb.append("\n    FlushOnBackground: ");
        sb.append(AudioAttributesImplApi21Parcelizer());
        return sb.toString();
    }
}
