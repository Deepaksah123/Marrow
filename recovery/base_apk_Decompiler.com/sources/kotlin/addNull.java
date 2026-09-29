package kotlin;

import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import com.google.android.exoplayer2.analytics.AnalyticsListener;
import java.io.IOException;
import kotlin.StdKeySerializers;

/* JADX INFO: loaded from: classes2.dex */
public final class addNull extends validateSubClassName {
    final boolean AudioAttributesCompatParcelizer;
    public final int AudioAttributesImplApi21Parcelizer;
    public final int AudioAttributesImplApi26Parcelizer;
    public final String AudioAttributesImplBaseParcelizer;
    public final int MediaBrowserCompatCustomActionResultReceiver;
    public final C0170format MediaBrowserCompatItemReceiver;
    public final StdKeySerializers.write RemoteActionCompatParcelizer;

    public static addNull write(IOException iOException, int i) {
        return new addNull(0, iOException, i);
    }

    public static addNull read(Throwable th, String str, int i, C0170format c0170format, int i2, boolean z, int i3) {
        if (c0170format == null) {
            i2 = 4;
        }
        return new addNull(1, th, i3, str, i, c0170format, i2, z);
    }

    public static addNull RemoteActionCompatParcelizer(RuntimeException runtimeException, int i) {
        return new addNull(2, runtimeException, i);
    }

    private addNull(int i, Throwable th, int i2) {
        this(i, th, i2, null, -1, null, 4, false);
    }

    private addNull(int i, Throwable th, int i2, String str, int i3, C0170format c0170format, int i4, boolean z) {
        this(write(i, null, str, i3, c0170format, i4), th, i2, i, str, i3, c0170format, i4, null, SystemClock.elapsedRealtime(), z);
    }

    private addNull(String str, Throwable th, int i, int i2, String str2, int i3, C0170format c0170format, int i4, StdKeySerializers.write writeVar, long j, boolean z) {
        super(str, th, i, Bundle.EMPTY, j);
        buildTypeSerializer.IconCompatParcelizer(!z || i2 == 1);
        buildTypeSerializer.IconCompatParcelizer(th != null || i2 == 3);
        this.AudioAttributesImplApi26Parcelizer = i2;
        this.AudioAttributesImplBaseParcelizer = str2;
        this.MediaBrowserCompatCustomActionResultReceiver = i3;
        this.MediaBrowserCompatItemReceiver = c0170format;
        this.AudioAttributesImplApi21Parcelizer = i4;
        this.RemoteActionCompatParcelizer = writeVar;
        this.AudioAttributesCompatParcelizer = z;
    }

    final addNull RemoteActionCompatParcelizer(StdKeySerializers.write writeVar) {
        return new addNull((String) LaissezFaireSubTypeValidator.IconCompatParcelizer(getMessage()), getCause(), this.IconCompatParcelizer, this.AudioAttributesImplApi26Parcelizer, this.AudioAttributesImplBaseParcelizer, this.MediaBrowserCompatCustomActionResultReceiver, this.MediaBrowserCompatItemReceiver, this.AudioAttributesImplApi21Parcelizer, writeVar, this.write, this.AudioAttributesCompatParcelizer);
    }

    private static String write(int i, String str, String str2, int i2, C0170format c0170format, int i3) {
        String string;
        if (i == 0) {
            string = "Source error";
        } else if (i == 1) {
            StringBuilder sb = new StringBuilder();
            sb.append(str2);
            sb.append(" error, index=");
            sb.append(i2);
            sb.append(", format=");
            sb.append(c0170format);
            sb.append(", format_supported=");
            sb.append(LaissezFaireSubTypeValidator.write(i3));
            string = sb.toString();
        } else if (i == 3) {
            string = "Remote error";
        } else {
            string = "Unexpected runtime error";
        }
        if (TextUtils.isEmpty(null)) {
            return string;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(string);
        sb2.append(": ");
        sb2.append((String) null);
        return sb2.toString();
    }

    static {
        LaissezFaireSubTypeValidator.AudioAttributesImplApi26Parcelizer(1001);
        LaissezFaireSubTypeValidator.AudioAttributesImplApi26Parcelizer(1002);
        LaissezFaireSubTypeValidator.AudioAttributesImplApi26Parcelizer(1003);
        LaissezFaireSubTypeValidator.AudioAttributesImplApi26Parcelizer(1004);
        LaissezFaireSubTypeValidator.AudioAttributesImplApi26Parcelizer(1005);
        LaissezFaireSubTypeValidator.AudioAttributesImplApi26Parcelizer(AnalyticsListener.EVENT_BANDWIDTH_ESTIMATE);
    }
}
