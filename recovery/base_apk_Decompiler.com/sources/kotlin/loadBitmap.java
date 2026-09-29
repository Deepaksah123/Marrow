package kotlin;

import com.google.android.exoplayer2.source.rtsp.SessionDescription;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\n\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\t\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\f\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0011\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u000f\u0010\u0012J\u001f\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\n\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\n\u0010\b"}, d2 = {"Lo/loadBitmap;", "", "<init>", "()V", "", "p0", "", "write", "(J)Ljava/lang/String;", "p1", "RemoteActionCompatParcelizer", "(JLjava/lang/String;)Ljava/lang/String;", "AudioAttributesCompatParcelizer", "(J)J", "", "IconCompatParcelizer", "(J)I", "AudioAttributesImplBaseParcelizer", "(I)Ljava/lang/String;", "", "read", "(J)Z"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class loadBitmap {
    public static final loadBitmap INSTANCE = new loadBitmap();

    public static long AudioAttributesImplBaseParcelizer(long p0) {
        return p0 * 1000;
    }

    private loadBitmap() {
    }

    @getMagicModuleMeta
    public static final String write(long p0) {
        int i = ((int) (p0 / 1000)) % 60;
        int i2 = (int) ((p0 / 60000) % 60);
        int i3 = (int) ((p0 / 3600000) % 24);
        String str = i3 < 10 ? SessionDescription.SUPPORTED_SDP_VERSION : "";
        String str2 = i2 < 10 ? SessionDescription.SUPPORTED_SDP_VERSION : "";
        String str3 = i < 10 ? SessionDescription.SUPPORTED_SDP_VERSION : "";
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(i3);
        sb.append(":");
        sb.append(str2);
        sb.append(i2);
        sb.append(":");
        sb.append(str3);
        sb.append(i);
        return sb.toString();
    }

    @getMagicModuleMeta
    public static final String RemoteActionCompatParcelizer(long p0, String p1) {
        String str = new SimpleDateFormat(p1, Locale.getDefault()).format(new Date(p0));
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(str, "");
        return str;
    }

    @getMagicModuleMeta
    public static final long AudioAttributesCompatParcelizer(long p0) {
        return ((p0 + 999) / 1000) * 1000;
    }

    @getMagicModuleMeta
    public static final int IconCompatParcelizer(long p0) {
        return (int) (p0 / 86400000);
    }

    @getMagicModuleMeta
    public static final String IconCompatParcelizer(int p0) {
        if (p0 >= 60) {
            int i = p0 / 60;
            String str = i == 1 ? " min" : " mins";
            StringBuilder sb = new StringBuilder();
            sb.append(i);
            sb.append(str);
            return sb.toString();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(p0);
        sb2.append(" s");
        return sb2.toString();
    }

    @getMagicModuleMeta
    public static final boolean read(long j) {
        return System.currentTimeMillis() >= j + 21600000;
    }

    @getMagicModuleMeta
    public static final String RemoteActionCompatParcelizer(long p0) {
        if (p0 <= 0) {
            return "ended";
        }
        if (p0 < 5000) {
            return "in few seconds";
        }
        if (p0 < 60000) {
            StringBuilder sb = new StringBuilder("in ");
            sb.append((int) (p0 / 1000));
            sb.append(" seconds");
            return sb.toString();
        }
        if (p0 < 3600000) {
            StringBuilder sb2 = new StringBuilder("in ");
            sb2.append(((int) (p0 / 60000)) + 1);
            sb2.append(" minutes");
            return sb2.toString();
        }
        if (p0 < 86400000) {
            StringBuilder sb3 = new StringBuilder("in ");
            sb3.append(((int) (p0 / 3600000)) + 1);
            sb3.append(" hours");
            return sb3.toString();
        }
        if (p0 < 604800000) {
            StringBuilder sb4 = new StringBuilder("in ");
            sb4.append(((int) (p0 / 86400000)) + 1);
            sb4.append(" days");
            return sb4.toString();
        }
        if (p0 < 31536000000L) {
            StringBuilder sb5 = new StringBuilder("in ");
            sb5.append(((int) (p0 / 604800000)) + 1);
            sb5.append(" weeks");
            return sb5.toString();
        }
        StringBuilder sb6 = new StringBuilder("in ");
        sb6.append(((int) (p0 / 31536000000L)) + 1);
        sb6.append(" years");
        return sb6.toString();
    }
}
