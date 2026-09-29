package kotlin;

import com.google.android.exoplayer2.upstream.HttpDataSource;
import java.net.ConnectException;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.Locale;
import javax.net.ssl.SSLException;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u000e\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\t\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000b\u0010\bJ\u0017\u0010\f\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\f\u0010\bJ\u0017\u0010\r\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\r\u0010\bJ\u0017\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000e\u0010\bJ\u0017\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000f\u0010\bJ\u001b\u0010\f\u001a\u00020\u0006*\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\f\u0010\u0011"}, d2 = {"Lo/DataSinkFactory;", "", "<init>", "()V", "", "p0", "", "RemoteActionCompatParcelizer", "(Ljava/lang/Throwable;)Z", "IconCompatParcelizer", "(Ljava/lang/Throwable;)Ljava/lang/Throwable;", "MediaBrowserCompatItemReceiver", "read", "write", "MediaBrowserCompatCustomActionResultReceiver", "AudioAttributesCompatParcelizer", "", "(Ljava/lang/Throwable;Ljava/lang/String;)Z"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class DataSinkFactory {
    public static final DataSinkFactory INSTANCE = new DataSinkFactory();

    private DataSinkFactory() {
    }

    @getMagicModuleMeta
    public static final boolean RemoteActionCompatParcelizer(Throwable p0) {
        if (p0 == null) {
            return false;
        }
        DataSinkFactory dataSinkFactory = INSTANCE;
        if (dataSinkFactory.MediaBrowserCompatItemReceiver(p0)) {
            return true;
        }
        Throwable cause = p0.getCause();
        if (cause == null) {
            return false;
        }
        if (dataSinkFactory.MediaBrowserCompatItemReceiver(cause)) {
            return true;
        }
        return !toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(dataSinkFactory.IconCompatParcelizer(cause), cause);
    }

    private final Throwable IconCompatParcelizer(Throwable p0) {
        int i = 0;
        for (Throwable cause = p0; cause != null && i < 5; cause = cause.getCause()) {
            i++;
            if (MediaBrowserCompatItemReceiver(cause)) {
                return cause;
            }
        }
        return p0;
    }

    private final boolean MediaBrowserCompatItemReceiver(Throwable p0) {
        return (p0 instanceof SocketTimeoutException) || (p0 instanceof SocketException) || (p0 instanceof UnknownHostException) || (p0 instanceof SubscriptionRSModelKt) || MediaBrowserCompatCustomActionResultReceiver(p0) || write(p0) || AudioAttributesCompatParcelizer(p0) || read(p0);
    }

    private static boolean read(Throwable p0) {
        if (p0 instanceof SSLException) {
            return read(p0, "connection abort") || read(p0, "connection reset");
        }
        return false;
    }

    private static boolean write(Throwable p0) {
        return (p0 instanceof ConnectException) && read(p0, "failed to connect to");
    }

    private static boolean MediaBrowserCompatCustomActionResultReceiver(Throwable p0) {
        return (p0 instanceof HttpDataSource.HttpDataSourceException) && read(p0, "unable to connect to");
    }

    private static boolean AudioAttributesCompatParcelizer(Throwable p0) {
        return p0 instanceof HttpDataSource.InvalidResponseCodeException;
    }

    private static boolean read(Throwable th, String str) {
        String message = th.getMessage();
        if (message == null) {
            return false;
        }
        String lowerCase = message.toLowerCase(Locale.ROOT);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(lowerCase, "");
        if (lowerCase == null) {
            return false;
        }
        String lowerCase2 = str.toLowerCase(Locale.ROOT);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(lowerCase2, "");
        return TestGroupLSModel.write((CharSequence) lowerCase, (CharSequence) lowerCase2, false);
    }
}
