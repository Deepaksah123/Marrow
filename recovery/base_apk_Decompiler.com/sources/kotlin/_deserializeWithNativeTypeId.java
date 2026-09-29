package kotlin;

import android.text.TextUtils;
import com.google.android.exoplayer2.PlaybackException;
import com.google.android.exoplayer2.util.MimeTypes;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin._hasTypeResolver;

/* JADX INFO: loaded from: classes2.dex */
public interface _deserializeWithNativeTypeId extends _hasTypeResolver {

    public interface AudioAttributesCompatParcelizer extends _hasTypeResolver.write {
        @Override // o._hasTypeResolver.write
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
        _deserializeWithNativeTypeId write();
    }

    public static final class MediaBrowserCompatCustomActionResultReceiver {
        private Map<String, String> RemoteActionCompatParcelizer;
        private final Map<String, String> read = new HashMap();

        public final Map<String, String> write() {
            Map<String, String> map;
            synchronized (this) {
                if (this.RemoteActionCompatParcelizer == null) {
                    this.RemoteActionCompatParcelizer = Collections.unmodifiableMap(new HashMap(this.read));
                }
                map = this.RemoteActionCompatParcelizer;
            }
            return map;
        }
    }

    static {
        new parseTraks() { // from class: o._findDefaultImplDeserializer
            @Override // kotlin.parseTraks
            public final boolean apply(Object obj) {
                return _deserializeWithNativeTypeId.write((String) obj);
            }
        };
    }

    static /* synthetic */ boolean write(String str) {
        if (str == null) {
            return false;
        }
        String str2 = parseMdhd.read(str);
        return (TextUtils.isEmpty(str2) || (str2.contains("text") && !str2.contains(MimeTypes.TEXT_VTT)) || str2.contains("html") || str2.contains("xml")) ? false : true;
    }

    public static class read extends idResolver {
        public final int IconCompatParcelizer;
        public final SubTypeValidator write;

        private static int write(int i, int i2) {
            return (i == 2000 && i2 == 1) ? PlaybackException.ERROR_CODE_IO_NETWORK_CONNECTION_FAILED : i;
        }

        public static read IconCompatParcelizer(IOException iOException, SubTypeValidator subTypeValidator, int i) {
            int i2;
            String message = iOException.getMessage();
            if (iOException instanceof SocketTimeoutException) {
                i2 = PlaybackException.ERROR_CODE_IO_NETWORK_CONNECTION_TIMEOUT;
            } else if (iOException instanceof InterruptedIOException) {
                i2 = 1004;
            } else {
                i2 = (message == null || !parseMdhd.read(message).matches("cleartext.*not permitted.*")) ? PlaybackException.ERROR_CODE_IO_NETWORK_CONNECTION_FAILED : 2007;
            }
            if (i2 == 2007) {
                return new IconCompatParcelizer(iOException, subTypeValidator);
            }
            return new read(iOException, subTypeValidator, i2, i);
        }

        public read(SubTypeValidator subTypeValidator, int i) {
            super(write(i, 1));
            this.write = subTypeValidator;
            this.IconCompatParcelizer = 1;
        }

        public read(String str, SubTypeValidator subTypeValidator, int i) {
            super(str, write(i, 1));
            this.write = subTypeValidator;
            this.IconCompatParcelizer = 1;
        }

        public read(IOException iOException, SubTypeValidator subTypeValidator, int i, int i2) {
            super(iOException, write(i, i2));
            this.write = subTypeValidator;
            this.IconCompatParcelizer = i2;
        }

        public read(String str, IOException iOException, SubTypeValidator subTypeValidator, int i) {
            super(str, iOException, write(i, 1));
            this.write = subTypeValidator;
            this.IconCompatParcelizer = 1;
        }
    }

    public static final class IconCompatParcelizer extends read {
        public IconCompatParcelizer(IOException iOException, SubTypeValidator subTypeValidator) {
            super("Cleartext HTTP traffic not permitted. See https://developer.android.com/guide/topics/media/issues/cleartext-not-permitted", iOException, subTypeValidator, PlaybackException.ERROR_CODE_IO_CLEARTEXT_NOT_PERMITTED);
        }
    }

    public static final class RemoteActionCompatParcelizer extends read {
        public final String RemoteActionCompatParcelizer;

        public RemoteActionCompatParcelizer(String str, SubTypeValidator subTypeValidator) {
            super("Invalid content type: ".concat(String.valueOf(str)), subTypeValidator, PlaybackException.ERROR_CODE_IO_INVALID_HTTP_CONTENT_TYPE);
            this.RemoteActionCompatParcelizer = str;
        }
    }

    public static final class write extends read {
        public final byte[] AudioAttributesCompatParcelizer;
        public final int AudioAttributesImplApi26Parcelizer;
        public final String MediaBrowserCompatCustomActionResultReceiver;
        public final Map<String, List<String>> RemoteActionCompatParcelizer;

        public write(int i, String str, IOException iOException, Map<String, List<String>> map, SubTypeValidator subTypeValidator, byte[] bArr) {
            super("Response code: ".concat(String.valueOf(i)), iOException, subTypeValidator, PlaybackException.ERROR_CODE_IO_BAD_HTTP_STATUS);
            this.AudioAttributesImplApi26Parcelizer = i;
            this.MediaBrowserCompatCustomActionResultReceiver = str;
            this.RemoteActionCompatParcelizer = map;
            this.AudioAttributesCompatParcelizer = bArr;
        }
    }
}
