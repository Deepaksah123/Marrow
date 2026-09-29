package kotlin;

import com.google.android.exoplayer2.source.rtsp.RtspHeaders;
import com.marrow.data.models.custommodule.FilterParams;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ShapeKt;
import kotlin.ThemeAlphaConstantsKt;
import kotlin.getEncryptedLicenseTimeInfo;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000e\u0018\u00002\u00020\u0001:\u0001(BC\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0016\u0010\f\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000b\u0012\u0004\u0012\u00020\u00010\n¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u000f\u0010\u0010J\u001b\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00040\u00112\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0017\u0010\u0018J%\u0010\u001a\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u00192\u000e\u0010\u0003\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u000b¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u001c\u0010\u001dR\u0019\u0010\u001e\u001a\u0004\u0018\u00010\b8\u0007¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u000f\u0010 R\u0011\u0010\"\u001a\u00020!8G¢\u0006\u0006\u001a\u0004\b\"\u0010#R\u001a\u0010$\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b\u0012\u0010&R\u0011\u0010\u000f\u001a\u00020'8G¢\u0006\u0006\u001a\u0004\b(\u0010)R\u0018\u0010*\u001a\u0004\u0018\u00010!8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b*\u0010+R\u001a\u0010,\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010\u001dR*\u0010/\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000b\u0012\u0004\u0012\u00020\u00010\n8\u0001X\u0081\u0004¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b\u001a\u00101R\u001a\u00102\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105"}, d2 = {"Lo/ThemeKtExternalSyntheticLambda0;", "", "Lo/ThemeAlphaConstantsKt;", "p0", "", "p1", "Lo/ShapeKt;", "p2", "Lo/ThemeKtExternalSyntheticLambda2;", "p3", "", "Ljava/lang/Class;", "p4", "<init>", "(Lo/ThemeAlphaConstantsKt;Ljava/lang/String;Lo/ShapeKt;Lo/ThemeKtExternalSyntheticLambda2;Ljava/util/Map;)V", "AudioAttributesCompatParcelizer", "(Ljava/lang/String;)Ljava/lang/String;", "", "RemoteActionCompatParcelizer", "(Ljava/lang/String;)Ljava/util/List;", "Lo/ThemeKtExternalSyntheticLambda0$IconCompatParcelizer;", "MediaBrowserCompatItemReceiver", "()Lo/ThemeKtExternalSyntheticLambda0$IconCompatParcelizer;", "MediaBrowserCompatCustomActionResultReceiver", "()Ljava/lang/Object;", "T", "read", "(Ljava/lang/Class;)Ljava/lang/Object;", "toString", "()Ljava/lang/String;", "body", "Lo/ThemeKtExternalSyntheticLambda2;", "()Lo/ThemeKtExternalSyntheticLambda2;", "Lo/getEncryptedLicenseTimeInfo;", "write", "()Lo/getEncryptedLicenseTimeInfo;", "headers", "Lo/ShapeKt;", "()Lo/ShapeKt;", "", "IconCompatParcelizer", "()Z", "lazyCacheControl", "Lo/getEncryptedLicenseTimeInfo;", "method", "Ljava/lang/String;", "AudioAttributesImplApi21Parcelizer", FilterParams.KEY_TAGS, "Ljava/util/Map;", "()Ljava/util/Map;", "url", "Lo/ThemeAlphaConstantsKt;", "AudioAttributesImplApi26Parcelizer", "()Lo/ThemeAlphaConstantsKt;"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class ThemeKtExternalSyntheticLambda0 {
    private final ThemeKtExternalSyntheticLambda2 body;
    private final ShapeKt headers;
    private getEncryptedLicenseTimeInfo lazyCacheControl;
    private final String method;
    private final Map<Class<?>, Object> tags;
    private final ThemeAlphaConstantsKt url;

    public ThemeKtExternalSyntheticLambda0(ThemeAlphaConstantsKt themeAlphaConstantsKt, String str, ShapeKt shapeKt, ThemeKtExternalSyntheticLambda2 themeKtExternalSyntheticLambda2, Map<Class<?>, ? extends Object> map) {
        toMagicModuleMetaRepoModel.write(themeAlphaConstantsKt, "");
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(shapeKt, "");
        toMagicModuleMetaRepoModel.write(map, "");
        this.url = themeAlphaConstantsKt;
        this.method = str;
        this.headers = shapeKt;
        this.body = themeKtExternalSyntheticLambda2;
        this.tags = map;
    }

    /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: from getter */
    public final ThemeAlphaConstantsKt getUrl() {
        return this.url;
    }

    /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: from getter */
    public final String getMethod() {
        return this.method;
    }

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from getter */
    public final ShapeKt getHeaders() {
        return this.headers;
    }

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from getter */
    public final ThemeKtExternalSyntheticLambda2 getBody() {
        return this.body;
    }

    public final Map<Class<?>, Object> read() {
        return this.tags;
    }

    public final boolean IconCompatParcelizer() {
        return this.url.getIsHttps();
    }

    public final String AudioAttributesCompatParcelizer(String p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        return this.headers.IconCompatParcelizer(p0);
    }

    public final List<String> RemoteActionCompatParcelizer(String p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        return this.headers.AudioAttributesCompatParcelizer(p0);
    }

    public final Object MediaBrowserCompatCustomActionResultReceiver() {
        return read(Object.class);
    }

    public final <T> T read(Class<? extends T> p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        return p0.cast(this.tags.get(p0));
    }

    public final IconCompatParcelizer MediaBrowserCompatItemReceiver() {
        return new IconCompatParcelizer(this);
    }

    public final getEncryptedLicenseTimeInfo write() {
        getEncryptedLicenseTimeInfo getencryptedlicensetimeinfo = this.lazyCacheControl;
        if (getencryptedlicensetimeinfo != null) {
            return getencryptedlicensetimeinfo;
        }
        getEncryptedLicenseTimeInfo.Companion companion = getEncryptedLicenseTimeInfo.INSTANCE;
        getEncryptedLicenseTimeInfo getencryptedlicensetimeinfoWrite = getEncryptedLicenseTimeInfo.Companion.write(this.headers);
        this.lazyCacheControl = getencryptedlicensetimeinfoWrite;
        return getencryptedlicensetimeinfoWrite;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Request{method=");
        sb.append(this.method);
        sb.append(", url=");
        sb.append(this.url);
        if (this.headers.IconCompatParcelizer() != 0) {
            sb.append(", headers=[");
            int i = 0;
            for (Pair<? extends String, ? extends String> pair : this.headers) {
                if (i < 0) {
                    IntermediateLoginResponseBody.read();
                }
                Pair<? extends String, ? extends String> pair2 = pair;
                String strRemoteActionCompatParcelizer = pair2.RemoteActionCompatParcelizer();
                String str = pair2.read();
                if (i > 0) {
                    sb.append(", ");
                }
                sb.append(strRemoteActionCompatParcelizer);
                sb.append(':');
                sb.append(str);
                i++;
            }
            sb.append(']');
        }
        if (!this.tags.isEmpty()) {
            sb.append(", tags=");
            sb.append(this.tags);
        }
        sb.append('}');
        String string = sb.toString();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string, "");
        return string;
    }

    /* JADX INFO: loaded from: classes4.dex */
    @Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u0001B\t\b\u0016¢\u0006\u0004\b\u0002\u0010\u0003B\u0011\b\u0010\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0002\u0010\u0006J\u001f\u0010\t\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000e\u0010\nJ\u0017\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J!\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u0013H\u0016¢\u0006\u0004\b\u000e\u0010\u0014J\u0017\u0010\t\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\t\u0010\u0015J\u0017\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000e\u0010\u0016J/\u0010\t\u001a\u00020\u0000\"\u0004\b\u0000\u0010\u00172\u000e\u0010\u0005\u001a\n\u0012\u0006\b\u0000\u0012\u00028\u00000\u00182\b\u0010\b\u001a\u0004\u0018\u00018\u0000H\u0016¢\u0006\u0004\b\t\u0010\u0019J\u0019\u0010\u0011\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0001H\u0016¢\u0006\u0004\b\u0011\u0010\u001aJ\u0017\u0010\t\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\u0016J\u0017\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dR\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u00138\u0000@\u0000X\u0080\f¢\u0006\u0006\n\u0004\b\u0011\u0010\u001eR\u0016\u0010\t\u001a\u00020\u001f8\u0000@\u0000X\u0080\f¢\u0006\u0006\n\u0004\b\t\u0010 R\u0016\u0010\u0011\u001a\u00020\u00078\u0000@\u0000X\u0080\f¢\u0006\u0006\n\u0004\b\u000e\u0010!R&\u0010\u000e\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0018\u0012\u0004\u0012\u00020\u00010\"8\u0000@\u0000X\u0080\f¢\u0006\u0006\n\u0004\b\u001c\u0010#R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u001b8\u0000@\u0000X\u0080\f¢\u0006\u0006\n\u0004\b\u000b\u0010$"}, d2 = {"Lo/ThemeKtExternalSyntheticLambda0$IconCompatParcelizer;", "", "<init>", "()V", "Lo/ThemeKtExternalSyntheticLambda0;", "p0", "(Lo/ThemeKtExternalSyntheticLambda0;)V", "", "p1", "IconCompatParcelizer", "(Ljava/lang/String;Ljava/lang/String;)Lo/ThemeKtExternalSyntheticLambda0$IconCompatParcelizer;", "RemoteActionCompatParcelizer", "()Lo/ThemeKtExternalSyntheticLambda0;", "Lo/getEncryptedLicenseTimeInfo;", "AudioAttributesCompatParcelizer", "(Lo/getEncryptedLicenseTimeInfo;)Lo/ThemeKtExternalSyntheticLambda0$IconCompatParcelizer;", "Lo/ShapeKt;", "read", "(Lo/ShapeKt;)Lo/ThemeKtExternalSyntheticLambda0$IconCompatParcelizer;", "Lo/ThemeKtExternalSyntheticLambda2;", "(Ljava/lang/String;Lo/ThemeKtExternalSyntheticLambda2;)Lo/ThemeKtExternalSyntheticLambda0$IconCompatParcelizer;", "(Lo/ThemeKtExternalSyntheticLambda2;)Lo/ThemeKtExternalSyntheticLambda0$IconCompatParcelizer;", "(Ljava/lang/String;)Lo/ThemeKtExternalSyntheticLambda0$IconCompatParcelizer;", "T", "Ljava/lang/Class;", "(Ljava/lang/Class;Ljava/lang/Object;)Lo/ThemeKtExternalSyntheticLambda0$IconCompatParcelizer;", "(Ljava/lang/Object;)Lo/ThemeKtExternalSyntheticLambda0$IconCompatParcelizer;", "Lo/ThemeAlphaConstantsKt;", "write", "(Lo/ThemeAlphaConstantsKt;)Lo/ThemeKtExternalSyntheticLambda0$IconCompatParcelizer;", "Lo/ThemeKtExternalSyntheticLambda2;", "Lo/ShapeKt$RemoteActionCompatParcelizer;", "Lo/ShapeKt$RemoteActionCompatParcelizer;", "Ljava/lang/String;", "", "Ljava/util/Map;", "Lo/ThemeAlphaConstantsKt;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static class IconCompatParcelizer {

        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
        public String read;
        public ShapeKt.RemoteActionCompatParcelizer IconCompatParcelizer;
        public ThemeAlphaConstantsKt RemoteActionCompatParcelizer;

        /* JADX INFO: renamed from: read, reason: from kotlin metadata */
        public ThemeKtExternalSyntheticLambda2 write;

        /* JADX INFO: renamed from: write, reason: from kotlin metadata */
        public Map<Class<?>, Object> AudioAttributesCompatParcelizer;

        public IconCompatParcelizer() {
            this.AudioAttributesCompatParcelizer = new LinkedHashMap();
            this.read = "GET";
            this.IconCompatParcelizer = new ShapeKt.RemoteActionCompatParcelizer();
        }

        public IconCompatParcelizer(ThemeKtExternalSyntheticLambda0 themeKtExternalSyntheticLambda0) {
            LinkedHashMap linkedHashMapIconCompatParcelizer;
            toMagicModuleMetaRepoModel.write(themeKtExternalSyntheticLambda0, "");
            this.AudioAttributesCompatParcelizer = new LinkedHashMap();
            this.RemoteActionCompatParcelizer = themeKtExternalSyntheticLambda0.getUrl();
            this.read = themeKtExternalSyntheticLambda0.getMethod();
            this.write = themeKtExternalSyntheticLambda0.getBody();
            if (themeKtExternalSyntheticLambda0.read().isEmpty()) {
                linkedHashMapIconCompatParcelizer = new LinkedHashMap();
            } else {
                linkedHashMapIconCompatParcelizer = VideoTimelineResponseBody.IconCompatParcelizer(themeKtExternalSyntheticLambda0.read());
            }
            this.AudioAttributesCompatParcelizer = linkedHashMapIconCompatParcelizer;
            this.IconCompatParcelizer = themeKtExternalSyntheticLambda0.getHeaders().AudioAttributesCompatParcelizer();
        }

        public final IconCompatParcelizer write(ThemeAlphaConstantsKt p0) {
            toMagicModuleMetaRepoModel.write(p0, "");
            this.RemoteActionCompatParcelizer = p0;
            return this;
        }

        public final IconCompatParcelizer IconCompatParcelizer(String p0) {
            toMagicModuleMetaRepoModel.write(p0, "");
            if (TestGroupLSModel.AudioAttributesCompatParcelizer(p0, "ws:", true)) {
                StringBuilder sb = new StringBuilder("http:");
                String strSubstring = p0.substring(3);
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(strSubstring, "");
                sb.append(strSubstring);
                p0 = sb.toString();
            } else if (TestGroupLSModel.AudioAttributesCompatParcelizer(p0, "wss:", true)) {
                StringBuilder sb2 = new StringBuilder("https:");
                String strSubstring2 = p0.substring(4);
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(strSubstring2, "");
                sb2.append(strSubstring2);
                p0 = sb2.toString();
            }
            ThemeAlphaConstantsKt.Companion companion = ThemeAlphaConstantsKt.INSTANCE;
            return write(ThemeAlphaConstantsKt.Companion.write(p0));
        }

        public final IconCompatParcelizer AudioAttributesCompatParcelizer(String p0, String p1) {
            toMagicModuleMetaRepoModel.write(p0, "");
            toMagicModuleMetaRepoModel.write(p1, "");
            this.IconCompatParcelizer.AudioAttributesCompatParcelizer(p0, p1);
            return this;
        }

        public final IconCompatParcelizer IconCompatParcelizer(String p0, String p1) {
            toMagicModuleMetaRepoModel.write(p0, "");
            toMagicModuleMetaRepoModel.write(p1, "");
            this.IconCompatParcelizer.IconCompatParcelizer(p0, p1);
            return this;
        }

        public final IconCompatParcelizer AudioAttributesCompatParcelizer(String p0) {
            toMagicModuleMetaRepoModel.write(p0, "");
            this.IconCompatParcelizer.AudioAttributesCompatParcelizer(p0);
            return this;
        }

        public final IconCompatParcelizer read(ShapeKt p0) {
            toMagicModuleMetaRepoModel.write(p0, "");
            this.IconCompatParcelizer = p0.AudioAttributesCompatParcelizer();
            return this;
        }

        public final IconCompatParcelizer AudioAttributesCompatParcelizer(getEncryptedLicenseTimeInfo p0) {
            toMagicModuleMetaRepoModel.write(p0, "");
            String string = p0.toString();
            return string.length() == 0 ? AudioAttributesCompatParcelizer(RtspHeaders.CACHE_CONTROL) : AudioAttributesCompatParcelizer(RtspHeaders.CACHE_CONTROL, string);
        }

        public final IconCompatParcelizer IconCompatParcelizer(ThemeKtExternalSyntheticLambda2 p0) {
            toMagicModuleMetaRepoModel.write(p0, "");
            return AudioAttributesCompatParcelizer("POST", p0);
        }

        public final IconCompatParcelizer AudioAttributesCompatParcelizer(String p0, ThemeKtExternalSyntheticLambda2 p1) {
            toMagicModuleMetaRepoModel.write(p0, "");
            if (p0.length() <= 0) {
                throw new IllegalArgumentException("method.isEmpty() == true".toString());
            }
            if (p1 == null) {
                if (ServicePresenterModule.RemoteActionCompatParcelizer(p0)) {
                    StringBuilder sb = new StringBuilder("method ");
                    sb.append(p0);
                    sb.append(" must have a request body.");
                    throw new IllegalArgumentException(sb.toString().toString());
                }
            } else if (!ServicePresenterModule.AudioAttributesCompatParcelizer(p0)) {
                StringBuilder sb2 = new StringBuilder("method ");
                sb2.append(p0);
                sb2.append(" must not have a request body.");
                throw new IllegalArgumentException(sb2.toString().toString());
            }
            this.read = p0;
            this.write = p1;
            return this;
        }

        public final IconCompatParcelizer read(Object p0) {
            return IconCompatParcelizer((Class<? super Object>) Object.class, p0);
        }

        public final <T> IconCompatParcelizer IconCompatParcelizer(Class<? super T> p0, T p1) {
            toMagicModuleMetaRepoModel.write(p0, "");
            if (p1 == null) {
                this.AudioAttributesCompatParcelizer.remove(p0);
                return this;
            }
            if (this.AudioAttributesCompatParcelizer.isEmpty()) {
                this.AudioAttributesCompatParcelizer = new LinkedHashMap();
            }
            Map<Class<?>, Object> map = this.AudioAttributesCompatParcelizer;
            T tCast = p0.cast(p1);
            toMagicModuleMetaRepoModel.write(tCast);
            map.put(p0, tCast);
            return this;
        }

        public final ThemeKtExternalSyntheticLambda0 RemoteActionCompatParcelizer() {
            ThemeAlphaConstantsKt themeAlphaConstantsKt = this.RemoteActionCompatParcelizer;
            if (themeAlphaConstantsKt != null) {
                return new ThemeKtExternalSyntheticLambda0(themeAlphaConstantsKt, this.read, this.IconCompatParcelizer.AudioAttributesCompatParcelizer(), this.write, FirebaseDataModule.AudioAttributesCompatParcelizer(this.AudioAttributesCompatParcelizer));
            }
            throw new IllegalStateException("url == null".toString());
        }
    }
}
