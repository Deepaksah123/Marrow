package kotlin;

import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u0000 /2\u00020\u0001:\u0002/\tB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000b\u0010\nJ\u0017\u0010\f\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000b\u0010\rJ\u001f\u0010\f\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\f\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0010\u0010\rJ\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\t\u0010\rJ1\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J9\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0018\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0016\u0010\u0019J'\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0010\u0010\u0017J\u001f\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u000b\u0010\u001bJ\u001f\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u0016\u0010\u001bJ-\u0010\f\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u001c2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001dH\u0016¢\u0006\u0004\b\f\u0010\u001fJ\u001f\u0010\f\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\f\u0010 J-\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020!2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u001dH\u0016¢\u0006\u0004\b\t\u0010\"J\u001f\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020!H\u0016¢\u0006\u0004\b\u0010\u0010#J\u001f\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020$H\u0016¢\u0006\u0004\b\u0016\u0010\rJ\u0017\u0010%\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b%\u0010\rJ\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\t\u0010\u000fJ\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020&H\u0016¢\u0006\u0004\b\t\u0010'J\u0017\u0010(\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b(\u0010\rJ\u001f\u0010)\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020$H\u0016¢\u0006\u0004\b)\u0010\rJ\u0017\u0010*\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b*\u0010\rJ\u001f\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0016\u0010\u000fJ\u001f\u0010\f\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\f\u0010\nJ\u0017\u0010+\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b+\u0010\rJ\u001f\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0010\u0010\nJ!\u0010-\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010,H\u0016¢\u0006\u0004\b-\u0010\rJ\u0017\u0010.\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b.\u0010\r"}, d2 = {"Lo/AppThemeKt;", "", "<init>", "()V", "Lo/toDownloadInfo;", "p0", "Lo/TypeKt;", "p1", "", "RemoteActionCompatParcelizer", "(Lo/toDownloadInfo;Lo/TypeKt;)V", "IconCompatParcelizer", "AudioAttributesCompatParcelizer", "(Lo/toDownloadInfo;)V", "Ljava/io/IOException;", "(Lo/toDownloadInfo;Ljava/io/IOException;)V", "read", "Ljava/net/InetSocketAddress;", "Ljava/net/Proxy;", "p2", "Lo/ThemeKtExternalSyntheticLambda1;", "p3", "write", "(Lo/toDownloadInfo;Ljava/net/InetSocketAddress;Ljava/net/Proxy;)V", "p4", "(Lo/toDownloadInfo;Ljava/net/InetSocketAddress;Ljava/net/Proxy;Ljava/io/IOException;)V", "Lo/UserLoggedOutException;", "(Lo/toDownloadInfo;Lo/UserLoggedOutException;)V", "", "", "Ljava/net/InetAddress;", "(Lo/toDownloadInfo;Ljava/lang/String;Ljava/util/List;)V", "(Lo/toDownloadInfo;Ljava/lang/String;)V", "Lo/ThemeAlphaConstantsKt;", "(Lo/toDownloadInfo;Lo/ThemeAlphaConstantsKt;Ljava/util/List;)V", "(Lo/toDownloadInfo;Lo/ThemeAlphaConstantsKt;)V", "", "AudioAttributesImplApi26Parcelizer", "Lo/ThemeKtExternalSyntheticLambda0;", "(Lo/toDownloadInfo;Lo/ThemeKtExternalSyntheticLambda0;)V", "MediaBrowserCompatItemReceiver", "MediaBrowserCompatCustomActionResultReceiver", "AudioAttributesImplApi21Parcelizer", "AudioAttributesImplBaseParcelizer", "Lo/ThemeKt;", "MediaBrowserCompatMediaItem", "MediaDescriptionCompat", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class AppThemeKt {
    public static final AppThemeKt NONE = new write();

    public interface RemoteActionCompatParcelizer {
        AppThemeKt AudioAttributesCompatParcelizer(toDownloadInfo todownloadinfo);
    }

    public static final class write extends AppThemeKt {
        write() {
        }
    }

    public static void RemoteActionCompatParcelizer(toDownloadInfo p0, C0156TypeKt p1) {
        toMagicModuleMetaRepoModel.write(p0, "");
        toMagicModuleMetaRepoModel.write(p1, "");
    }

    public static void IconCompatParcelizer(toDownloadInfo p0, C0156TypeKt p1) {
        toMagicModuleMetaRepoModel.write(p0, "");
        toMagicModuleMetaRepoModel.write(p1, "");
    }

    public static void AudioAttributesCompatParcelizer(toDownloadInfo p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
    }

    public static void IconCompatParcelizer(toDownloadInfo p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
    }

    public static void AudioAttributesCompatParcelizer(toDownloadInfo p0, IOException p1) {
        toMagicModuleMetaRepoModel.write(p0, "");
        toMagicModuleMetaRepoModel.write(p1, "");
    }

    public static void read(toDownloadInfo p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
    }

    public static void RemoteActionCompatParcelizer(toDownloadInfo p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
    }

    public static void write(toDownloadInfo todownloadinfo, InetSocketAddress inetSocketAddress, Proxy proxy) {
        toMagicModuleMetaRepoModel.write(todownloadinfo, "");
        toMagicModuleMetaRepoModel.write(inetSocketAddress, "");
        toMagicModuleMetaRepoModel.write(proxy, "");
    }

    public static void write(toDownloadInfo todownloadinfo, InetSocketAddress inetSocketAddress, Proxy proxy, IOException iOException) {
        toMagicModuleMetaRepoModel.write(todownloadinfo, "");
        toMagicModuleMetaRepoModel.write(inetSocketAddress, "");
        toMagicModuleMetaRepoModel.write(proxy, "");
        toMagicModuleMetaRepoModel.write(iOException, "");
    }

    public static void read(toDownloadInfo p0, InetSocketAddress p1, Proxy p2) {
        toMagicModuleMetaRepoModel.write(p0, "");
        toMagicModuleMetaRepoModel.write(p1, "");
        toMagicModuleMetaRepoModel.write(p2, "");
    }

    public static void IconCompatParcelizer(toDownloadInfo p0, UserLoggedOutException p1) {
        toMagicModuleMetaRepoModel.write(p0, "");
        toMagicModuleMetaRepoModel.write(p1, "");
    }

    public static void write(toDownloadInfo p0, UserLoggedOutException p1) {
        toMagicModuleMetaRepoModel.write(p0, "");
        toMagicModuleMetaRepoModel.write(p1, "");
    }

    public static void AudioAttributesCompatParcelizer(toDownloadInfo p0, String p1, List<InetAddress> p2) {
        toMagicModuleMetaRepoModel.write(p0, "");
        toMagicModuleMetaRepoModel.write(p1, "");
        toMagicModuleMetaRepoModel.write(p2, "");
    }

    public static void AudioAttributesCompatParcelizer(toDownloadInfo p0, String p1) {
        toMagicModuleMetaRepoModel.write(p0, "");
        toMagicModuleMetaRepoModel.write(p1, "");
    }

    public static void RemoteActionCompatParcelizer(toDownloadInfo p0, ThemeAlphaConstantsKt p1, List<Proxy> p2) {
        toMagicModuleMetaRepoModel.write(p0, "");
        toMagicModuleMetaRepoModel.write(p1, "");
        toMagicModuleMetaRepoModel.write(p2, "");
    }

    public static void read(toDownloadInfo p0, ThemeAlphaConstantsKt p1) {
        toMagicModuleMetaRepoModel.write(p0, "");
        toMagicModuleMetaRepoModel.write(p1, "");
    }

    public static void write(toDownloadInfo todownloadinfo) {
        toMagicModuleMetaRepoModel.write(todownloadinfo, "");
    }

    public static void AudioAttributesImplApi26Parcelizer(toDownloadInfo p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
    }

    public static void RemoteActionCompatParcelizer(toDownloadInfo p0, IOException p1) {
        toMagicModuleMetaRepoModel.write(p0, "");
        toMagicModuleMetaRepoModel.write(p1, "");
    }

    public static void RemoteActionCompatParcelizer(toDownloadInfo p0, ThemeKtExternalSyntheticLambda0 p1) {
        toMagicModuleMetaRepoModel.write(p0, "");
        toMagicModuleMetaRepoModel.write(p1, "");
    }

    public static void MediaBrowserCompatItemReceiver(toDownloadInfo p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
    }

    public static void MediaBrowserCompatCustomActionResultReceiver(toDownloadInfo todownloadinfo) {
        toMagicModuleMetaRepoModel.write(todownloadinfo, "");
    }

    public static void AudioAttributesImplApi21Parcelizer(toDownloadInfo p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
    }

    public static void write(toDownloadInfo p0, IOException p1) {
        toMagicModuleMetaRepoModel.write(p0, "");
        toMagicModuleMetaRepoModel.write(p1, "");
    }

    public static void AudioAttributesCompatParcelizer(toDownloadInfo p0, C0156TypeKt p1) {
        toMagicModuleMetaRepoModel.write(p0, "");
        toMagicModuleMetaRepoModel.write(p1, "");
    }

    public static void AudioAttributesImplBaseParcelizer(toDownloadInfo p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
    }

    public static void read(toDownloadInfo p0, C0156TypeKt p1) {
        toMagicModuleMetaRepoModel.write(p0, "");
        toMagicModuleMetaRepoModel.write(p1, "");
    }

    public static void MediaBrowserCompatMediaItem(toDownloadInfo todownloadinfo) {
        toMagicModuleMetaRepoModel.write(todownloadinfo, "");
    }

    public static void MediaDescriptionCompat(toDownloadInfo p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
    }
}
