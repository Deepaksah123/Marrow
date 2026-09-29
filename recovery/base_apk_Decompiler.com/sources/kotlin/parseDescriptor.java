package kotlin;

import android.system.ErrnoException;
import android.system.OsConstants;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.upstream.HttpDataSource;
import com.marrow.data.models.ResponseError;
import com.marrow.data.utils.product.exceptions.ResponseErrorException;
import java.net.ConnectException;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import javax.net.ssl.SSLException;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated(since = "Use NetworkUtilsV2.kt")
public final class parseDescriptor {
    public static boolean read(Throwable th) {
        if (th == null) {
            return false;
        }
        if (AudioAttributesImplApi21Parcelizer(th)) {
            return true;
        }
        Throwable cause = th.getCause();
        if (cause == null) {
            return false;
        }
        return AudioAttributesImplApi21Parcelizer(cause) || IconCompatParcelizer(cause) != cause;
    }

    private static Throwable IconCompatParcelizer(Throwable th) {
        if (th != null) {
            int i = 0;
            for (Throwable cause = th; cause != null && i < 5; cause = cause.getCause()) {
                i++;
                if (AudioAttributesImplApi21Parcelizer(cause)) {
                    return cause;
                }
            }
        }
        return th;
    }

    private static boolean AudioAttributesImplApi21Parcelizer(Throwable th) {
        return (th instanceof SocketTimeoutException) || (th instanceof SocketException) || (th instanceof UnknownHostException) || (th instanceof SubscriptionRSModelKt) || MediaBrowserCompatItemReceiver(th) || AudioAttributesImplApi26Parcelizer(th) || RemoteActionCompatParcelizer(th) || AudioAttributesImplBaseParcelizer(th);
    }

    private static boolean AudioAttributesImplBaseParcelizer(Throwable th) {
        if (th instanceof SSLException) {
            return AudioAttributesCompatParcelizer(th, "connection abort") || AudioAttributesCompatParcelizer(th, "connection reset");
        }
        return false;
    }

    private static boolean AudioAttributesImplApi26Parcelizer(Throwable th) {
        return (th instanceof ConnectException) && AudioAttributesCompatParcelizer(th, "failed to connect to");
    }

    private static boolean MediaBrowserCompatItemReceiver(Throwable th) {
        return (th instanceof HttpDataSource.HttpDataSourceException) && AudioAttributesCompatParcelizer(th, "unable to connect to");
    }

    private static boolean RemoteActionCompatParcelizer(Throwable th) {
        return th instanceof HttpDataSource.InvalidResponseCodeException;
    }

    public static ResponseErrorException AudioAttributesCompatParcelizer(Throwable th) {
        ResponseError responseErrorCustomError;
        Throwable thIconCompatParcelizer = IconCompatParcelizer(th);
        if (thIconCompatParcelizer instanceof SocketTimeoutException) {
            responseErrorCustomError = ResponseError.customError("Unable to communicate with App services.");
        } else if (thIconCompatParcelizer instanceof UnknownHostException) {
            responseErrorCustomError = ResponseError.customError("Please check your internet connection");
        } else if (thIconCompatParcelizer instanceof HttpDataSource.HttpDataSourceException) {
            if (MediaBrowserCompatItemReceiver(thIconCompatParcelizer)) {
                responseErrorCustomError = ResponseError.customError("Please check your internet connection");
            } else {
                responseErrorCustomError = ResponseError.customError("Unable to communicate with App services.");
            }
        } else if (thIconCompatParcelizer instanceof ConnectException) {
            if (RemoteActionCompatParcelizer((ConnectException) thIconCompatParcelizer)) {
                responseErrorCustomError = ResponseError.customError("Please check your internet connection");
            } else {
                responseErrorCustomError = ResponseError.customError("Unable to communicate with App services.");
            }
        } else if (thIconCompatParcelizer instanceof SocketException) {
            responseErrorCustomError = ResponseError.customError("Unable to communicate with App services.");
        } else {
            responseErrorCustomError = ResponseError.customError("Some error occurred");
        }
        return new ResponseErrorException(responseErrorCustomError, thIconCompatParcelizer);
    }

    public static boolean write(Throwable th) {
        Throwable thIconCompatParcelizer = IconCompatParcelizer(th);
        if (thIconCompatParcelizer instanceof SocketTimeoutException) {
            return true;
        }
        if (thIconCompatParcelizer instanceof UnknownHostException) {
            return false;
        }
        if (thIconCompatParcelizer instanceof HttpDataSource.HttpDataSourceException) {
            return MediaBrowserCompatItemReceiver(thIconCompatParcelizer) || RemoteActionCompatParcelizer(thIconCompatParcelizer);
        }
        if (thIconCompatParcelizer instanceof ConnectException) {
            return !RemoteActionCompatParcelizer((ConnectException) thIconCompatParcelizer);
        }
        return thIconCompatParcelizer instanceof SocketException;
    }

    private static boolean RemoteActionCompatParcelizer(ConnectException connectException) {
        Throwable cause = connectException.getCause();
        for (int i = 0; i < 3; i++) {
            if (cause instanceof ErrnoException) {
                int i2 = ((ErrnoException) cause).errno;
                if (i2 == OsConstants.ECONNABORTED || i2 == OsConstants.ENETUNREACH) {
                    return true;
                }
            } else {
                if (cause == null) {
                    break;
                }
                cause = cause.getCause();
            }
        }
        return false;
    }

    private static boolean AudioAttributesCompatParcelizer(Throwable th, String str) {
        String message;
        return (th == null || (message = th.getMessage()) == null || !message.toLowerCase().contains(str.toLowerCase())) ? false : true;
    }

    public static boolean RemoteActionCompatParcelizer(ExoPlaybackException exoPlaybackException) {
        return (exoPlaybackException.getCause() instanceof HttpDataSource.InvalidResponseCodeException) && ((HttpDataSource.InvalidResponseCodeException) exoPlaybackException.getCause()).responseCode == 403;
    }
}
