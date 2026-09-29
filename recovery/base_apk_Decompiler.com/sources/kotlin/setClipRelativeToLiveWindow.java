package kotlin;

import android.content.ContentResolver;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class setClipRelativeToLiveWindow {
    private static final MediaItemBuilder AudioAttributesCompatParcelizer = new MediaItemBuilder();
    private final setClippingConfiguration IconCompatParcelizer;
    private final MediaItemBuilder MediaBrowserCompatCustomActionResultReceiver;
    private final ContentResolver RemoteActionCompatParcelizer;
    private final setSubtitleConfigurations read;
    private final List<ImageHeaderParser> write;

    setClipRelativeToLiveWindow(List<ImageHeaderParser> list, setClippingConfiguration setclippingconfiguration, setSubtitleConfigurations setsubtitleconfigurations, ContentResolver contentResolver) {
        this(list, AudioAttributesCompatParcelizer, setclippingconfiguration, setsubtitleconfigurations, contentResolver);
    }

    private setClipRelativeToLiveWindow(List<ImageHeaderParser> list, MediaItemBuilder mediaItemBuilder, setClippingConfiguration setclippingconfiguration, setSubtitleConfigurations setsubtitleconfigurations, ContentResolver contentResolver) {
        this.MediaBrowserCompatCustomActionResultReceiver = mediaItemBuilder;
        this.IconCompatParcelizer = setclippingconfiguration;
        this.read = setsubtitleconfigurations;
        this.RemoteActionCompatParcelizer = contentResolver;
        this.write = list;
    }

    final int write(Uri uri) {
        InputStream inputStreamOpenInputStream = null;
        try {
            try {
                inputStreamOpenInputStream = this.RemoteActionCompatParcelizer.openInputStream(uri);
                int iWrite = isHeart.write(this.write, inputStreamOpenInputStream, this.read);
                if (inputStreamOpenInputStream != null) {
                    try {
                        inputStreamOpenInputStream.close();
                    } catch (IOException unused) {
                    }
                }
                return iWrite;
            } catch (IOException | NullPointerException unused2) {
                if (Log.isLoggable("ThumbStreamOpener", 3)) {
                    Objects.toString(uri);
                }
                if (inputStreamOpenInputStream == null) {
                    return -1;
                }
                try {
                    inputStreamOpenInputStream.close();
                    return -1;
                } catch (IOException unused3) {
                    return -1;
                }
            }
        } catch (Throwable th) {
            if (inputStreamOpenInputStream != null) {
                try {
                    inputStreamOpenInputStream.close();
                } catch (IOException unused4) {
                }
            }
            throw th;
        }
    }

    public final InputStream RemoteActionCompatParcelizer(Uri uri) throws Throwable {
        String strIconCompatParcelizer = IconCompatParcelizer(uri);
        if (TextUtils.isEmpty(strIconCompatParcelizer)) {
            return null;
        }
        File fileWrite = MediaItemBuilder.write(strIconCompatParcelizer);
        if (!RemoteActionCompatParcelizer(fileWrite)) {
            return null;
        }
        Uri uriFromFile = Uri.fromFile(fileWrite);
        try {
            return this.RemoteActionCompatParcelizer.openInputStream(uriFromFile);
        } catch (NullPointerException e) {
            StringBuilder sb = new StringBuilder("NPE opening uri: ");
            sb.append(uri);
            sb.append(" -> ");
            sb.append(uriFromFile);
            throw ((FileNotFoundException) new FileNotFoundException(sb.toString()).initCause(e));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x003a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private java.lang.String IconCompatParcelizer(android.net.Uri r4) throws java.lang.Throwable {
        /*
            r3 = this;
            r0 = 0
            o.setClippingConfiguration r3 = r3.IconCompatParcelizer     // Catch: java.lang.Throwable -> L20 java.lang.SecurityException -> L22
            android.database.Cursor r3 = r3.AudioAttributesCompatParcelizer(r4)     // Catch: java.lang.Throwable -> L20 java.lang.SecurityException -> L22
            if (r3 == 0) goto L1a
            boolean r1 = r3.moveToFirst()     // Catch: java.lang.SecurityException -> L23 java.lang.Throwable -> L35
            if (r1 == 0) goto L1a
            r1 = 0
            java.lang.String r4 = r3.getString(r1)     // Catch: java.lang.SecurityException -> L23 java.lang.Throwable -> L35
            if (r3 == 0) goto L19
            r3.close()
        L19:
            return r4
        L1a:
            if (r3 == 0) goto L1f
            r3.close()
        L1f:
            return r0
        L20:
            r3 = move-exception
            goto L38
        L22:
            r3 = r0
        L23:
            java.lang.String r1 = "ThumbStreamOpener"
            r2 = 3
            boolean r1 = android.util.Log.isLoggable(r1, r2)     // Catch: java.lang.Throwable -> L35
            if (r1 == 0) goto L2f
            java.util.Objects.toString(r4)     // Catch: java.lang.Throwable -> L35
        L2f:
            if (r3 == 0) goto L34
            r3.close()
        L34:
            return r0
        L35:
            r4 = move-exception
            r0 = r3
            r3 = r4
        L38:
            if (r0 == 0) goto L3d
            r0.close()
        L3d:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.setClipRelativeToLiveWindow.IconCompatParcelizer(android.net.Uri):java.lang.String");
    }

    private boolean RemoteActionCompatParcelizer(File file) {
        return MediaItemBuilder.AudioAttributesCompatParcelizer(file) && 0 < MediaItemBuilder.IconCompatParcelizer(file);
    }
}
