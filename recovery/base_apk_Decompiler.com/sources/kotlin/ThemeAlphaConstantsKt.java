package kotlin;

import com.google.android.exoplayer2.extractor.ts.PsExtractor;
import java.io.EOFException;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\"\n\u0002\b\u0007\u0018\u0000 D2\u00020\u0001:\u0002\u0018DBc\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\t\u0012\u0010\u0010\u000b\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\r\u001a\u00020\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0018\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\r\u0010\u001c\u001a\u00020\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001e\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u0002H\u0016¢\u0006\u0004\b \u0010\u001dJ\r\u0010\"\u001a\u00020!¢\u0006\u0004\b\"\u0010#J\r\u0010%\u001a\u00020$¢\u0006\u0004\b%\u0010&R\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u00028G¢\u0006\u0006\u001a\u0004\b'\u0010\u001dR\u0011\u0010(\u001a\u00020\u00028G¢\u0006\u0006\u001a\u0004\b(\u0010\u001dR\u0011\u0010\u001e\u001a\u00020\u00028G¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001dR\u0017\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00020\t8G¢\u0006\u0006\u001a\u0004\b\u001e\u0010)R\u0013\u0010*\u001a\u0004\u0018\u00010\u00028G¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u001dR\u0011\u0010+\u001a\u00020\u00028G¢\u0006\u0006\u001a\u0004\b+\u0010\u001dR\u0016\u0010,\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u001a\u0010.\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b.\u0010-\u001a\u0004\b/\u0010\u001dR\u001a\u00100\u001a\u00020\u00108\u0007X\u0087\u0004¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103R\u0014\u00104\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b4\u0010-R \u00105\u001a\b\u0012\u0004\u0012\u00020\u00020\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u0010)R\u001a\u00108\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b:\u0010\u0014R\u0013\u00102\u001a\u0004\u0018\u00010\u00028G¢\u0006\u0006\u001a\u0004\b;\u0010\u001dR\u001e\u0010<\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\t8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b<\u00106R\u0017\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020=8G¢\u0006\u0006\u001a\u0004\b>\u0010?R\u001a\u0010@\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b@\u0010-\u001a\u0004\bA\u0010\u001dR\u0014\u0010B\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bB\u0010-R\u0014\u0010C\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\bC\u0010-"}, d2 = {"Lo/ThemeAlphaConstantsKt;", "", "", "p0", "p1", "p2", "p3", "", "p4", "", "p5", "p6", "p7", "p8", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "Lo/ThemeAlphaConstantsKt$write;", "AudioAttributesImplApi21Parcelizer", "()Lo/ThemeAlphaConstantsKt$write;", "write", "(Ljava/lang/String;)Lo/ThemeAlphaConstantsKt$write;", "RemoteActionCompatParcelizer", "(Ljava/lang/String;)Ljava/lang/String;", "MediaDescriptionCompat", "()Ljava/lang/String;", "read", "(Ljava/lang/String;)Lo/ThemeAlphaConstantsKt;", "toString", "Ljava/net/URI;", "onAddQueueItem", "()Ljava/net/URI;", "Ljava/net/URL;", "onCommand", "()Ljava/net/URL;", "handleMediaPlayPauseIfPendingOnHandler", "AudioAttributesCompatParcelizer", "()Ljava/util/List;", "IconCompatParcelizer", "AudioAttributesImplBaseParcelizer", "fragment", "Ljava/lang/String;", "host", "AudioAttributesImplApi26Parcelizer", "isHttps", "Z", "MediaBrowserCompatCustomActionResultReceiver", "()Z", "password", "pathSegments", "Ljava/util/List;", "MediaBrowserCompatItemReceiver", "port", "I", "RatingCompat", "MediaBrowserCompatMediaItem", "queryNamesAndValues", "", "MediaBrowserCompatSearchResultReceiver", "()Ljava/util/Set;", "scheme", "MediaMetadataCompat", "url", "username", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class ThemeAlphaConstantsKt {
    public static final String FORM_ENCODE_SET = " \"':;<=>@[]^`{}|/\\?#&!$(),~";
    public static final String FRAGMENT_ENCODE_SET = "";
    public static final String FRAGMENT_ENCODE_SET_URI = " \"#<>\\^`{|}";
    public static final String PASSWORD_ENCODE_SET = " \"':;<=>@[]^`{}|/\\?#";
    public static final String PATH_SEGMENT_ENCODE_SET = " \"<>^`{}|/\\?#";
    public static final String PATH_SEGMENT_ENCODE_SET_URI = "[]";
    public static final String QUERY_COMPONENT_ENCODE_SET = " !\"#$&'(),/:;<=>?@[]\\^`{|}~";
    public static final String QUERY_COMPONENT_ENCODE_SET_URI = "\\^`{|}";
    public static final String QUERY_COMPONENT_REENCODE_SET = " \"'<>#&=";
    public static final String QUERY_ENCODE_SET = " \"'<>#";
    public static final String USERNAME_ENCODE_SET = " \"':;<=>@[]^`{}|/\\?#";
    private final String fragment;
    private final String host;
    private final boolean isHttps;
    private final String password;
    private final List<String> pathSegments;
    private final int port;
    private final List<String> queryNamesAndValues;
    private final String scheme;
    private final String url;
    private final String username;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final char[] HEX_DIGITS = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    public ThemeAlphaConstantsKt(String str, String str2, String str3, String str4, int i, List<String> list, List<String> list2, String str5, String str6) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(str2, "");
        toMagicModuleMetaRepoModel.write(str3, "");
        toMagicModuleMetaRepoModel.write(str4, "");
        toMagicModuleMetaRepoModel.write(list, "");
        toMagicModuleMetaRepoModel.write(str6, "");
        this.scheme = str;
        this.username = str2;
        this.password = str3;
        this.host = str4;
        this.port = i;
        this.pathSegments = list;
        this.queryNamesAndValues = list2;
        this.fragment = str5;
        this.url = str6;
        this.isHttps = toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) str, (Object) "https");
    }

    /* JADX INFO: renamed from: MediaMetadataCompat, reason: from getter */
    public final String getScheme() {
        return this.scheme;
    }

    /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: from getter */
    public final String getHost() {
        return this.host;
    }

    /* JADX INFO: renamed from: RatingCompat, reason: from getter */
    public final int getPort() {
        return this.port;
    }

    public final List<String> MediaBrowserCompatItemReceiver() {
        return this.pathSegments;
    }

    /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from getter */
    public final boolean getIsHttps() {
        return this.isHttps;
    }

    public final URL onCommand() {
        try {
            return new URL(this.url);
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
    }

    public final URI onAddQueueItem() {
        String string = AudioAttributesImplApi21Parcelizer().AudioAttributesCompatParcelizer().toString();
        try {
            return new URI(string);
        } catch (URISyntaxException e) {
            try {
                URI uriCreate = URI.create(new newYearNameItem("[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]").RemoteActionCompatParcelizer(string, ""));
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(uriCreate, "");
                return uriCreate;
            } catch (Exception unused) {
                throw new RuntimeException(e);
            }
        }
    }

    public final String AudioAttributesImplBaseParcelizer() {
        if (this.username.length() == 0) {
            return "";
        }
        int length = this.scheme.length() + 3;
        String str = this.url;
        String strSubstring = this.url.substring(length, FirebaseDataModule.RemoteActionCompatParcelizer(str, ":@", length, str.length()));
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(strSubstring, "");
        return strSubstring;
    }

    public final String AudioAttributesCompatParcelizer() {
        if (this.password.length() == 0) {
            return "";
        }
        int iIconCompatParcelizer = TestGroupLSModel.IconCompatParcelizer((CharSequence) this.url, ':', this.scheme.length() + 3, false, 4);
        String strSubstring = this.url.substring(iIconCompatParcelizer + 1, TestGroupLSModel.IconCompatParcelizer((CharSequence) this.url, '@', 0, false, 6));
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(strSubstring, "");
        return strSubstring;
    }

    public final String RemoteActionCompatParcelizer() {
        int iIconCompatParcelizer = TestGroupLSModel.IconCompatParcelizer((CharSequence) this.url, '/', this.scheme.length() + 3, false, 4);
        String str = this.url;
        String strSubstring = this.url.substring(iIconCompatParcelizer, FirebaseDataModule.RemoteActionCompatParcelizer(str, "?#", iIconCompatParcelizer, str.length()));
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(strSubstring, "");
        return strSubstring;
    }

    public final List<String> read() {
        int iIconCompatParcelizer = TestGroupLSModel.IconCompatParcelizer((CharSequence) this.url, '/', this.scheme.length() + 3, false, 4);
        String str = this.url;
        int iRemoteActionCompatParcelizer = FirebaseDataModule.RemoteActionCompatParcelizer(str, "?#", iIconCompatParcelizer, str.length());
        ArrayList arrayList = new ArrayList();
        while (iIconCompatParcelizer < iRemoteActionCompatParcelizer) {
            int i = iIconCompatParcelizer + 1;
            int iWrite = FirebaseDataModule.write(this.url, '/', i, iRemoteActionCompatParcelizer);
            String strSubstring = this.url.substring(i, iWrite);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(strSubstring, "");
            arrayList.add(strSubstring);
            iIconCompatParcelizer = iWrite;
        }
        return arrayList;
    }

    public final String write() {
        if (this.queryNamesAndValues == null) {
            return null;
        }
        int iIconCompatParcelizer = TestGroupLSModel.IconCompatParcelizer((CharSequence) this.url, '?', 0, false, 6) + 1;
        String str = this.url;
        String strSubstring = this.url.substring(iIconCompatParcelizer, FirebaseDataModule.write(str, '#', iIconCompatParcelizer, str.length()));
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(strSubstring, "");
        return strSubstring;
    }

    public final String MediaBrowserCompatMediaItem() {
        if (this.queryNamesAndValues == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        Companion.IconCompatParcelizer(this.queryNamesAndValues, sb);
        return sb.toString();
    }

    public final String RemoteActionCompatParcelizer(String p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        List<String> list = this.queryNamesAndValues;
        if (list == null) {
            return null;
        }
        getDecryptedContent getdecryptedcontentWrite = getQues.write(getQues.IconCompatParcelizer(0, list.size()), 2);
        int read = getdecryptedcontentWrite.getRead();
        int audioAttributesCompatParcelizer = getdecryptedcontentWrite.getAudioAttributesCompatParcelizer();
        int iconCompatParcelizer = getdecryptedcontentWrite.getIconCompatParcelizer();
        if ((iconCompatParcelizer > 0 && read <= audioAttributesCompatParcelizer) || (iconCompatParcelizer < 0 && audioAttributesCompatParcelizer <= read)) {
            while (!toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) p0, (Object) this.queryNamesAndValues.get(read))) {
                if (read != audioAttributesCompatParcelizer) {
                    read += iconCompatParcelizer;
                }
            }
            return this.queryNamesAndValues.get(read + 1);
        }
        return null;
    }

    public final Set<String> MediaBrowserCompatSearchResultReceiver() {
        if (this.queryNamesAndValues == null) {
            return getKycMessage.read();
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        getDecryptedContent getdecryptedcontentWrite = getQues.write(getQues.IconCompatParcelizer(0, this.queryNamesAndValues.size()), 2);
        int read = getdecryptedcontentWrite.getRead();
        int audioAttributesCompatParcelizer = getdecryptedcontentWrite.getAudioAttributesCompatParcelizer();
        int iconCompatParcelizer = getdecryptedcontentWrite.getIconCompatParcelizer();
        if ((iconCompatParcelizer > 0 && read <= audioAttributesCompatParcelizer) || (iconCompatParcelizer < 0 && audioAttributesCompatParcelizer <= read)) {
            while (true) {
                String str = this.queryNamesAndValues.get(read);
                toMagicModuleMetaRepoModel.write((Object) str);
                linkedHashSet.add(str);
                if (read == audioAttributesCompatParcelizer) {
                    break;
                }
                read += iconCompatParcelizer;
            }
        }
        Set<String> setUnmodifiableSet = Collections.unmodifiableSet(linkedHashSet);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(setUnmodifiableSet, "");
        return setUnmodifiableSet;
    }

    private String handleMediaPlayPauseIfPendingOnHandler() {
        if (this.fragment == null) {
            return null;
        }
        String strSubstring = this.url.substring(TestGroupLSModel.IconCompatParcelizer((CharSequence) this.url, '#', 0, false, 6) + 1);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(strSubstring, "");
        return strSubstring;
    }

    public final String MediaDescriptionCompat() {
        write writeVarWrite = write("/...");
        toMagicModuleMetaRepoModel.write(writeVarWrite);
        return writeVarWrite.MediaBrowserCompatSearchResultReceiver("").RemoteActionCompatParcelizer("").read().toString();
    }

    public final ThemeAlphaConstantsKt read(String p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        write writeVarWrite = write(p0);
        if (writeVarWrite != null) {
            return writeVarWrite.read();
        }
        return null;
    }

    public final write AudioAttributesImplApi21Parcelizer() {
        write writeVar = new write();
        writeVar.AudioAttributesImplApi26Parcelizer(this.scheme);
        writeVar.MediaBrowserCompatItemReceiver(AudioAttributesImplBaseParcelizer());
        writeVar.AudioAttributesImplApi21Parcelizer(AudioAttributesCompatParcelizer());
        writeVar.MediaBrowserCompatCustomActionResultReceiver(this.host);
        writeVar.write(this.port != Companion.AudioAttributesCompatParcelizer(this.scheme) ? this.port : -1);
        writeVar.RemoteActionCompatParcelizer().clear();
        writeVar.RemoteActionCompatParcelizer().addAll(read());
        writeVar.AudioAttributesCompatParcelizer(write());
        writeVar.AudioAttributesImplBaseParcelizer(handleMediaPlayPauseIfPendingOnHandler());
        return writeVar;
    }

    public final write write(String p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        try {
            return new write().write(this, p0);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    public final boolean equals(Object p0) {
        return (p0 instanceof ThemeAlphaConstantsKt) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) ((ThemeAlphaConstantsKt) p0).url, (Object) this.url);
    }

    public final int hashCode() {
        return this.url.hashCode();
    }

    /* JADX INFO: renamed from: toString, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u000e\n\u0002\u0010!\n\u0002\b\u0006\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\t\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\t\u0010\bJ\r\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0007\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0011\u0010\u0010J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0016\u0010\u0015J!\u0010\u0017\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0006\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\t\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\u0010J\u000f\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001a\u0010\u0003J\u0015\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\r¢\u0006\u0004\b\u0011\u0010\u001bJ7\u0010\t\u001a\u00020\u00192\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\r2\u0006\u0010\u001c\u001a\u00020\r2\u0006\u0010\u001d\u001a\u00020\u00132\u0006\u0010\u001e\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\t\u0010\u001fJ\u0017\u0010\u0017\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0017\u0010\u0012J\u000f\u0010\u0007\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0007\u0010\u0012J\u0017\u0010 \u001a\u00020\u00192\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b \u0010!J\u0015\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0017\u0010\u0010J'\u0010\u0017\u001a\u00020\u00192\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\r2\u0006\u0010\u001c\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0017\u0010\"J\u0015\u0010\u000b\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\u0010J\u000f\u0010#\u001a\u00020\u0004H\u0016¢\u0006\u0004\b#\u0010$J\u0015\u0010%\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b%\u0010\u0010R\u001e\u0010\t\u001a\u0004\u0018\u00010\u00048\u0000@\u0001X\u0080\u000e¢\u0006\f\n\u0004\b\u0017\u0010&\"\u0004\b'\u0010!R\u001c\u0010\u0011\u001a\u00020\u00048\u0000@\u0001X\u0081\u000e¢\u0006\f\n\u0004\b\u000b\u0010&\"\u0004\b\u001a\u0010!R \u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00040(8\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\t\u0010)\u001a\u0004\b\t\u0010*R \u0010\u0007\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010(8\u0000@\u0000X\u0081\f¢\u0006\u0006\n\u0004\b\u0007\u0010)R\u001c\u0010\u000b\u001a\u00020\u00048\u0000@\u0001X\u0081\u000e¢\u0006\f\n\u0004\b'\u0010&\"\u0004\b+\u0010!R\u001e\u0010+\u001a\u0004\u0018\u00010\u00048\u0000@\u0001X\u0081\u000e¢\u0006\f\n\u0004\b,\u0010&\"\u0004\b,\u0010!R\u001c\u0010\u000e\u001a\u00020\r8\u0000@\u0001X\u0081\u000e¢\u0006\f\n\u0004\b\u000e\u0010-\"\u0004\b\u0017\u0010.R\u001e\u0010\u001a\u001a\u0004\u0018\u00010\u00048\u0000@\u0001X\u0081\u000e¢\u0006\f\n\u0004\b+\u0010&\"\u0004\b\u000e\u0010!"}, d2 = {"Lo/ThemeAlphaConstantsKt$write;", "", "<init>", "()V", "", "p0", "p1", "AudioAttributesCompatParcelizer", "(Ljava/lang/String;Ljava/lang/String;)Lo/ThemeAlphaConstantsKt$write;", "RemoteActionCompatParcelizer", "Lo/ThemeAlphaConstantsKt;", "read", "()Lo/ThemeAlphaConstantsKt;", "", "AudioAttributesImplApi26Parcelizer", "()I", "(Ljava/lang/String;)Lo/ThemeAlphaConstantsKt$write;", "IconCompatParcelizer", "()Lo/ThemeAlphaConstantsKt$write;", "", "MediaDescriptionCompat", "(Ljava/lang/String;)Z", "MediaBrowserCompatMediaItem", "write", "(Lo/ThemeAlphaConstantsKt;Ljava/lang/String;)Lo/ThemeAlphaConstantsKt$write;", "", "AudioAttributesImplApi21Parcelizer", "(I)Lo/ThemeAlphaConstantsKt$write;", "p2", "p3", "p4", "(Ljava/lang/String;IIZ)V", "MediaMetadataCompat", "(Ljava/lang/String;)V", "(Ljava/lang/String;II)V", "toString", "()Ljava/lang/String;", "MediaBrowserCompatSearchResultReceiver", "Ljava/lang/String;", "AudioAttributesImplBaseParcelizer", "", "Ljava/util/List;", "()Ljava/util/List;", "MediaBrowserCompatItemReceiver", "MediaBrowserCompatCustomActionResultReceiver", "I", "(I)V"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class write {

        /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        public List<String> AudioAttributesCompatParcelizer;

        /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from kotlin metadata */
        private String MediaBrowserCompatItemReceiver;

        /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: from kotlin metadata */
        private String AudioAttributesImplApi21Parcelizer;

        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
        private final List<String> write;

        /* JADX INFO: renamed from: write, reason: from kotlin metadata */
        private String RemoteActionCompatParcelizer;

        /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: from kotlin metadata */
        private String read = "";

        /* JADX INFO: renamed from: read, reason: from kotlin metadata */
        private String IconCompatParcelizer = "";
        private int AudioAttributesImplApi26Parcelizer = -1;

        public write() {
            ArrayList arrayList = new ArrayList();
            this.write = arrayList;
            arrayList.add("");
        }

        public final void AudioAttributesImplApi26Parcelizer(String str) {
            this.AudioAttributesImplApi21Parcelizer = str;
        }

        public final void MediaBrowserCompatItemReceiver(String str) {
            toMagicModuleMetaRepoModel.write(str, "");
            this.read = str;
        }

        public final void AudioAttributesImplApi21Parcelizer(String str) {
            toMagicModuleMetaRepoModel.write(str, "");
            this.IconCompatParcelizer = str;
        }

        public final void MediaBrowserCompatCustomActionResultReceiver(String str) {
            this.MediaBrowserCompatItemReceiver = str;
        }

        public final void write(int i) {
            this.AudioAttributesImplApi26Parcelizer = i;
        }

        public final List<String> RemoteActionCompatParcelizer() {
            return this.write;
        }

        public final void AudioAttributesImplBaseParcelizer(String str) {
            this.RemoteActionCompatParcelizer = str;
        }

        public final write read(String p0) {
            toMagicModuleMetaRepoModel.write(p0, "");
            if (TestGroupLSModel.read(p0, "http", true)) {
                this.AudioAttributesImplApi21Parcelizer = "http";
                return this;
            }
            if (TestGroupLSModel.read(p0, "https", true)) {
                this.AudioAttributesImplApi21Parcelizer = "https";
                return this;
            }
            throw new IllegalArgumentException("unexpected scheme: ".concat(String.valueOf(p0)));
        }

        public final write MediaBrowserCompatSearchResultReceiver(String p0) {
            toMagicModuleMetaRepoModel.write(p0, "");
            this.read = Companion.read(ThemeAlphaConstantsKt.INSTANCE, p0, 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, false, null, 251);
            return this;
        }

        public final write RemoteActionCompatParcelizer(String p0) {
            toMagicModuleMetaRepoModel.write(p0, "");
            this.IconCompatParcelizer = Companion.read(ThemeAlphaConstantsKt.INSTANCE, p0, 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, false, null, 251);
            return this;
        }

        public final write IconCompatParcelizer(String p0) {
            toMagicModuleMetaRepoModel.write(p0, "");
            String strWrite = InterceptorModule.write(Companion.write(ThemeAlphaConstantsKt.INSTANCE, p0, 0, 0, false, 7));
            if (strWrite == null) {
                throw new IllegalArgumentException("unexpected host: ".concat(String.valueOf(p0)));
            }
            this.MediaBrowserCompatItemReceiver = strWrite;
            return this;
        }

        public final write IconCompatParcelizer(int p0) {
            if (p0 <= 0 || p0 >= 65536) {
                throw new IllegalArgumentException("unexpected port: ".concat(String.valueOf(p0)).toString());
            }
            this.AudioAttributesImplApi26Parcelizer = p0;
            return this;
        }

        private final int AudioAttributesImplApi26Parcelizer() {
            int i = this.AudioAttributesImplApi26Parcelizer;
            if (i != -1) {
                return i;
            }
            Companion companion = ThemeAlphaConstantsKt.INSTANCE;
            String str = this.AudioAttributesImplApi21Parcelizer;
            toMagicModuleMetaRepoModel.write((Object) str);
            return Companion.AudioAttributesCompatParcelizer(str);
        }

        public final write write() {
            this.AudioAttributesCompatParcelizer = null;
            return this;
        }

        public final write AudioAttributesCompatParcelizer(String p0) {
            List<String> listRemoteActionCompatParcelizer;
            String str;
            if (p0 == null || (str = Companion.read(ThemeAlphaConstantsKt.INSTANCE, p0, 0, 0, ThemeAlphaConstantsKt.QUERY_ENCODE_SET, true, false, true, false, null, 211)) == null) {
                listRemoteActionCompatParcelizer = null;
            } else {
                Companion companion = ThemeAlphaConstantsKt.INSTANCE;
                listRemoteActionCompatParcelizer = Companion.RemoteActionCompatParcelizer(str);
            }
            this.AudioAttributesCompatParcelizer = listRemoteActionCompatParcelizer;
            return this;
        }

        public final write RemoteActionCompatParcelizer(String p0, String p1) {
            toMagicModuleMetaRepoModel.write(p0, "");
            if (this.AudioAttributesCompatParcelizer == null) {
                this.AudioAttributesCompatParcelizer = new ArrayList();
            }
            List<String> list = this.AudioAttributesCompatParcelizer;
            toMagicModuleMetaRepoModel.write(list);
            list.add(Companion.read(ThemeAlphaConstantsKt.INSTANCE, p0, 0, 0, ThemeAlphaConstantsKt.QUERY_COMPONENT_ENCODE_SET, false, false, true, false, null, 219));
            List<String> list2 = this.AudioAttributesCompatParcelizer;
            toMagicModuleMetaRepoModel.write(list2);
            list2.add(p1 != null ? Companion.read(ThemeAlphaConstantsKt.INSTANCE, p1, 0, 0, ThemeAlphaConstantsKt.QUERY_COMPONENT_ENCODE_SET, false, false, true, false, null, 219) : null);
            return this;
        }

        public final write AudioAttributesCompatParcelizer(String p0, String p1) {
            toMagicModuleMetaRepoModel.write(p0, "");
            if (this.AudioAttributesCompatParcelizer == null) {
                this.AudioAttributesCompatParcelizer = new ArrayList();
            }
            List<String> list = this.AudioAttributesCompatParcelizer;
            toMagicModuleMetaRepoModel.write(list);
            list.add(Companion.read(ThemeAlphaConstantsKt.INSTANCE, p0, 0, 0, ThemeAlphaConstantsKt.QUERY_COMPONENT_REENCODE_SET, true, false, true, false, null, 211));
            List<String> list2 = this.AudioAttributesCompatParcelizer;
            toMagicModuleMetaRepoModel.write(list2);
            list2.add(p1 != null ? Companion.read(ThemeAlphaConstantsKt.INSTANCE, p1, 0, 0, ThemeAlphaConstantsKt.QUERY_COMPONENT_REENCODE_SET, true, false, true, false, null, 211) : null);
            return this;
        }

        public final write write(String p0) {
            toMagicModuleMetaRepoModel.write(p0, "");
            if (this.AudioAttributesCompatParcelizer == null) {
                return this;
            }
            MediaMetadataCompat(Companion.read(ThemeAlphaConstantsKt.INSTANCE, p0, 0, 0, ThemeAlphaConstantsKt.QUERY_COMPONENT_ENCODE_SET, false, false, true, false, null, 219));
            return this;
        }

        private final void MediaMetadataCompat(String p0) {
            List<String> list = this.AudioAttributesCompatParcelizer;
            toMagicModuleMetaRepoModel.write(list);
            int size = list.size() - 2;
            int i = saveMagicModuleTimeline.read(size, 0, -2);
            if (i > size) {
                return;
            }
            while (true) {
                List<String> list2 = this.AudioAttributesCompatParcelizer;
                toMagicModuleMetaRepoModel.write(list2);
                if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) p0, (Object) list2.get(size))) {
                    List<String> list3 = this.AudioAttributesCompatParcelizer;
                    toMagicModuleMetaRepoModel.write(list3);
                    list3.remove(size + 1);
                    List<String> list4 = this.AudioAttributesCompatParcelizer;
                    toMagicModuleMetaRepoModel.write(list4);
                    list4.remove(size);
                    List<String> list5 = this.AudioAttributesCompatParcelizer;
                    toMagicModuleMetaRepoModel.write(list5);
                    if (list5.isEmpty()) {
                        this.AudioAttributesCompatParcelizer = null;
                        return;
                    }
                }
                if (size == i) {
                    return;
                } else {
                    size -= 2;
                }
            }
        }

        public final write IconCompatParcelizer() {
            this.RemoteActionCompatParcelizer = null;
            return this;
        }

        public final write AudioAttributesCompatParcelizer() {
            String str = this.MediaBrowserCompatItemReceiver;
            this.MediaBrowserCompatItemReceiver = str != null ? new newYearNameItem("[\"<>^`{|}]").RemoteActionCompatParcelizer(str, "") : null;
            int size = this.write.size();
            for (int i = 0; i < size; i++) {
                this.write.set(i, Companion.read(ThemeAlphaConstantsKt.INSTANCE, this.write.get(i), 0, 0, ThemeAlphaConstantsKt.PATH_SEGMENT_ENCODE_SET_URI, true, true, false, false, null, 227));
            }
            List<String> list = this.AudioAttributesCompatParcelizer;
            if (list != null) {
                int size2 = list.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    String str2 = list.get(i2);
                    list.set(i2, str2 != null ? Companion.read(ThemeAlphaConstantsKt.INSTANCE, str2, 0, 0, ThemeAlphaConstantsKt.QUERY_COMPONENT_ENCODE_SET_URI, true, true, true, false, null, 195) : null);
                }
            }
            String str3 = this.RemoteActionCompatParcelizer;
            this.RemoteActionCompatParcelizer = str3 != null ? Companion.read(ThemeAlphaConstantsKt.INSTANCE, str3, 0, 0, ThemeAlphaConstantsKt.FRAGMENT_ENCODE_SET_URI, true, true, false, true, null, 163) : null;
            return this;
        }

        public final ThemeAlphaConstantsKt read() {
            ArrayList arrayList;
            String str = this.AudioAttributesImplApi21Parcelizer;
            if (str == null) {
                throw new IllegalStateException("scheme == null");
            }
            String strWrite = Companion.write(ThemeAlphaConstantsKt.INSTANCE, this.read, 0, 0, false, 7);
            String strWrite2 = Companion.write(ThemeAlphaConstantsKt.INSTANCE, this.IconCompatParcelizer, 0, 0, false, 7);
            String str2 = this.MediaBrowserCompatItemReceiver;
            if (str2 == null) {
                throw new IllegalStateException("host == null");
            }
            int iAudioAttributesImplApi26Parcelizer = AudioAttributesImplApi26Parcelizer();
            List<String> list = this.write;
            ArrayList arrayList2 = new ArrayList(IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Iterable) list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList2.add(Companion.write(ThemeAlphaConstantsKt.INSTANCE, (String) it.next(), 0, 0, false, 7));
            }
            ArrayList arrayList3 = arrayList2;
            List<String> list2 = this.AudioAttributesCompatParcelizer;
            if (list2 != null) {
                List<String> list3 = list2;
                ArrayList arrayList4 = new ArrayList(IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Iterable) list3, 10));
                for (String str3 : list3) {
                    arrayList4.add(str3 != null ? Companion.write(ThemeAlphaConstantsKt.INSTANCE, str3, 0, 0, true, 3) : null);
                }
                arrayList = arrayList4;
            } else {
                arrayList = null;
            }
            String str4 = this.RemoteActionCompatParcelizer;
            return new ThemeAlphaConstantsKt(str, strWrite, strWrite2, str2, iAudioAttributesImplApi26Parcelizer, arrayList3, arrayList, str4 != null ? Companion.write(ThemeAlphaConstantsKt.INSTANCE, str4, 0, 0, false, 7) : null, toString());
        }

        /* JADX WARN: Removed duplicated region for block: B:28:0x008b  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.String toString() {
            /*
                r4 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = r4.AudioAttributesImplApi21Parcelizer
                if (r1 == 0) goto L12
                r0.append(r1)
                java.lang.String r1 = "://"
                r0.append(r1)
                goto L17
            L12:
                java.lang.String r1 = "//"
                r0.append(r1)
            L17:
                java.lang.String r1 = r4.read
                java.lang.CharSequence r1 = (java.lang.CharSequence) r1
                int r1 = r1.length()
                r2 = 58
                if (r1 > 0) goto L2d
                java.lang.String r1 = r4.IconCompatParcelizer
                java.lang.CharSequence r1 = (java.lang.CharSequence) r1
                int r1 = r1.length()
                if (r1 <= 0) goto L49
            L2d:
                java.lang.String r1 = r4.read
                r0.append(r1)
                java.lang.String r1 = r4.IconCompatParcelizer
                java.lang.CharSequence r1 = (java.lang.CharSequence) r1
                int r1 = r1.length()
                if (r1 <= 0) goto L44
                r0.append(r2)
                java.lang.String r1 = r4.IconCompatParcelizer
                r0.append(r1)
            L44:
                r1 = 64
                r0.append(r1)
            L49:
                java.lang.String r1 = r4.MediaBrowserCompatItemReceiver
                if (r1 == 0) goto L6d
                kotlin.toMagicModuleMetaRepoModel.write(r1)
                java.lang.CharSequence r1 = (java.lang.CharSequence) r1
                boolean r1 = kotlin.TestGroupLSModel.AudioAttributesCompatParcelizer(r1, r2)
                if (r1 == 0) goto L68
                r1 = 91
                r0.append(r1)
                java.lang.String r1 = r4.MediaBrowserCompatItemReceiver
                r0.append(r1)
                r1 = 93
                r0.append(r1)
                goto L6d
            L68:
                java.lang.String r1 = r4.MediaBrowserCompatItemReceiver
                r0.append(r1)
            L6d:
                int r1 = r4.AudioAttributesImplApi26Parcelizer
                r3 = -1
                if (r1 != r3) goto L76
                java.lang.String r1 = r4.AudioAttributesImplApi21Parcelizer
                if (r1 == 0) goto L91
            L76:
                int r1 = r4.AudioAttributesImplApi26Parcelizer()
                java.lang.String r3 = r4.AudioAttributesImplApi21Parcelizer
                if (r3 == 0) goto L8b
                o.ThemeAlphaConstantsKt$Companion r3 = kotlin.ThemeAlphaConstantsKt.INSTANCE
                java.lang.String r3 = r4.AudioAttributesImplApi21Parcelizer
                kotlin.toMagicModuleMetaRepoModel.write(r3)
                int r3 = kotlin.ThemeAlphaConstantsKt.Companion.AudioAttributesCompatParcelizer(r3)
                if (r1 == r3) goto L91
            L8b:
                r0.append(r2)
                r0.append(r1)
            L91:
                o.ThemeAlphaConstantsKt$Companion r1 = kotlin.ThemeAlphaConstantsKt.INSTANCE
                java.util.List<java.lang.String> r1 = r4.write
                kotlin.ThemeAlphaConstantsKt.Companion.read(r1, r0)
                java.util.List<java.lang.String> r1 = r4.AudioAttributesCompatParcelizer
                if (r1 == 0) goto Lab
                r1 = 63
                r0.append(r1)
                o.ThemeAlphaConstantsKt$Companion r1 = kotlin.ThemeAlphaConstantsKt.INSTANCE
                java.util.List<java.lang.String> r1 = r4.AudioAttributesCompatParcelizer
                kotlin.toMagicModuleMetaRepoModel.write(r1)
                kotlin.ThemeAlphaConstantsKt.Companion.IconCompatParcelizer(r1, r0)
            Lab:
                java.lang.String r1 = r4.RemoteActionCompatParcelizer
                if (r1 == 0) goto Lb9
                r1 = 35
                r0.append(r1)
                java.lang.String r4 = r4.RemoteActionCompatParcelizer
                r0.append(r4)
            Lb9:
                java.lang.String r4 = r0.toString()
                java.lang.String r0 = ""
                kotlin.toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(r4, r0)
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: o.ThemeAlphaConstantsKt.write.toString():java.lang.String");
        }

        public final write write(ThemeAlphaConstantsKt p0, String p1) {
            String string;
            int iRemoteActionCompatParcelizer;
            int i;
            char c;
            toMagicModuleMetaRepoModel.write(p1, "");
            int iAudioAttributesCompatParcelizer = FirebaseDataModule.AudioAttributesCompatParcelizer(p1, 0, p1.length());
            int iWrite = FirebaseDataModule.write(p1, iAudioAttributesCompatParcelizer, p1.length());
            int iMediaBrowserCompatCustomActionResultReceiver = Companion.MediaBrowserCompatCustomActionResultReceiver(p1, iAudioAttributesCompatParcelizer, iWrite);
            byte b = -1;
            if (iMediaBrowserCompatCustomActionResultReceiver != -1) {
                if (TestGroupLSModel.AudioAttributesCompatParcelizer(p1, "https:", iAudioAttributesCompatParcelizer, true)) {
                    this.AudioAttributesImplApi21Parcelizer = "https";
                    iAudioAttributesCompatParcelizer += 6;
                } else if (TestGroupLSModel.AudioAttributesCompatParcelizer(p1, "http:", iAudioAttributesCompatParcelizer, true)) {
                    this.AudioAttributesImplApi21Parcelizer = "http";
                    iAudioAttributesCompatParcelizer += 5;
                } else {
                    StringBuilder sb = new StringBuilder("Expected URL scheme 'http' or 'https' but was '");
                    String strSubstring = p1.substring(0, iMediaBrowserCompatCustomActionResultReceiver);
                    toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(strSubstring, "");
                    sb.append(strSubstring);
                    sb.append('\'');
                    throw new IllegalArgumentException(sb.toString());
                }
            } else if (p0 != null) {
                this.AudioAttributesImplApi21Parcelizer = p0.getScheme();
            } else {
                if (p1.length() > 6) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(TestGroupLSModel.RemoteActionCompatParcelizer(p1, 6));
                    sb2.append("...");
                    string = sb2.toString();
                } else {
                    string = p1;
                }
                throw new IllegalArgumentException("Expected URL scheme 'http' or 'https' but no scheme was found for ".concat(String.valueOf(string)));
            }
            int iAudioAttributesImplApi21Parcelizer = Companion.AudioAttributesImplApi21Parcelizer(p1, iAudioAttributesCompatParcelizer, iWrite);
            byte b2 = 63;
            byte b3 = 35;
            if (iAudioAttributesImplApi21Parcelizer < 2 && p0 != null && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) p0.getScheme(), (Object) this.AudioAttributesImplApi21Parcelizer)) {
                this.read = p0.AudioAttributesImplBaseParcelizer();
                this.IconCompatParcelizer = p0.AudioAttributesCompatParcelizer();
                this.MediaBrowserCompatItemReceiver = p0.getHost();
                this.AudioAttributesImplApi26Parcelizer = p0.getPort();
                this.write.clear();
                this.write.addAll(p0.read());
                if (iAudioAttributesCompatParcelizer == iWrite || p1.charAt(iAudioAttributesCompatParcelizer) == '#') {
                    AudioAttributesCompatParcelizer(p0.write());
                }
            } else {
                int i2 = iAudioAttributesCompatParcelizer + iAudioAttributesImplApi21Parcelizer;
                boolean z = false;
                boolean z2 = false;
                while (true) {
                    iRemoteActionCompatParcelizer = FirebaseDataModule.RemoteActionCompatParcelizer(p1, "@/\\?#", i2, iWrite);
                    byte bCharAt = iRemoteActionCompatParcelizer != iWrite ? p1.charAt(iRemoteActionCompatParcelizer) : b;
                    if (bCharAt == b || bCharAt == b3 || bCharAt == 47 || bCharAt == 92 || bCharAt == b2) {
                        break;
                    }
                    if (bCharAt == 64) {
                        if (!z) {
                            int iWrite2 = FirebaseDataModule.write(p1, ':', i2, iRemoteActionCompatParcelizer);
                            String string2 = Companion.read(ThemeAlphaConstantsKt.INSTANCE, p1, i2, iWrite2, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, null, PsExtractor.VIDEO_STREAM_MASK);
                            if (z2) {
                                StringBuilder sb3 = new StringBuilder();
                                sb3.append(this.read);
                                sb3.append("%40");
                                sb3.append(string2);
                                string2 = sb3.toString();
                            }
                            this.read = string2;
                            if (iWrite2 != iRemoteActionCompatParcelizer) {
                                this.IconCompatParcelizer = Companion.read(ThemeAlphaConstantsKt.INSTANCE, p1, iWrite2 + 1, iRemoteActionCompatParcelizer, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, null, PsExtractor.VIDEO_STREAM_MASK);
                                z = true;
                            }
                            i = iRemoteActionCompatParcelizer;
                            z2 = true;
                        } else {
                            i = iRemoteActionCompatParcelizer;
                            StringBuilder sb4 = new StringBuilder();
                            sb4.append(this.IconCompatParcelizer);
                            sb4.append("%40");
                            sb4.append(Companion.read(ThemeAlphaConstantsKt.INSTANCE, p1, i2, i, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, null, PsExtractor.VIDEO_STREAM_MASK));
                            this.IconCompatParcelizer = sb4.toString();
                        }
                        i2 = i + 1;
                        b3 = 35;
                        b2 = 63;
                        b = -1;
                    }
                }
                int iMediaBrowserCompatItemReceiver = Companion.MediaBrowserCompatItemReceiver(p1, i2, iRemoteActionCompatParcelizer);
                int i3 = iMediaBrowserCompatItemReceiver + 1;
                if (i3 < iRemoteActionCompatParcelizer) {
                    this.MediaBrowserCompatItemReceiver = InterceptorModule.write(Companion.write(ThemeAlphaConstantsKt.INSTANCE, p1, i2, iMediaBrowserCompatItemReceiver, false, 4));
                    int iRemoteActionCompatParcelizer2 = Companion.RemoteActionCompatParcelizer(p1, i3, iRemoteActionCompatParcelizer);
                    this.AudioAttributesImplApi26Parcelizer = iRemoteActionCompatParcelizer2;
                    if (iRemoteActionCompatParcelizer2 == -1) {
                        StringBuilder sb5 = new StringBuilder("Invalid URL port: \"");
                        String strSubstring2 = p1.substring(i3, iRemoteActionCompatParcelizer);
                        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(strSubstring2, "this as java.lang.String…ing(startIndex, endIndex)");
                        sb5.append(strSubstring2);
                        sb5.append('\"');
                        throw new IllegalArgumentException(sb5.toString().toString());
                    }
                } else {
                    this.MediaBrowserCompatItemReceiver = InterceptorModule.write(Companion.write(ThemeAlphaConstantsKt.INSTANCE, p1, i2, iMediaBrowserCompatItemReceiver, false, 4));
                    Companion companion = ThemeAlphaConstantsKt.INSTANCE;
                    String str = this.AudioAttributesImplApi21Parcelizer;
                    toMagicModuleMetaRepoModel.write((Object) str);
                    this.AudioAttributesImplApi26Parcelizer = Companion.AudioAttributesCompatParcelizer(str);
                }
                if (this.MediaBrowserCompatItemReceiver == null) {
                    StringBuilder sb6 = new StringBuilder("Invalid URL host: \"");
                    String strSubstring3 = p1.substring(i2, iMediaBrowserCompatItemReceiver);
                    toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(strSubstring3, "this as java.lang.String…ing(startIndex, endIndex)");
                    sb6.append(strSubstring3);
                    sb6.append('\"');
                    throw new IllegalArgumentException(sb6.toString().toString());
                }
                iAudioAttributesCompatParcelizer = iRemoteActionCompatParcelizer;
            }
            int iRemoteActionCompatParcelizer3 = FirebaseDataModule.RemoteActionCompatParcelizer(p1, "?#", iAudioAttributesCompatParcelizer, iWrite);
            write(p1, iAudioAttributesCompatParcelizer, iRemoteActionCompatParcelizer3);
            if (iRemoteActionCompatParcelizer3 >= iWrite || p1.charAt(iRemoteActionCompatParcelizer3) != '?') {
                c = '#';
            } else {
                c = '#';
                int iWrite3 = FirebaseDataModule.write(p1, '#', iRemoteActionCompatParcelizer3, iWrite);
                Companion companion2 = ThemeAlphaConstantsKt.INSTANCE;
                this.AudioAttributesCompatParcelizer = Companion.RemoteActionCompatParcelizer(Companion.read(ThemeAlphaConstantsKt.INSTANCE, p1, iRemoteActionCompatParcelizer3 + 1, iWrite3, ThemeAlphaConstantsKt.QUERY_ENCODE_SET, true, false, true, false, null, 208));
                iRemoteActionCompatParcelizer3 = iWrite3;
            }
            if (iRemoteActionCompatParcelizer3 < iWrite && p1.charAt(iRemoteActionCompatParcelizer3) == c) {
                this.RemoteActionCompatParcelizer = Companion.read(ThemeAlphaConstantsKt.INSTANCE, p1, 1 + iRemoteActionCompatParcelizer3, iWrite, "", true, false, false, true, null, 176);
            }
            return this;
        }

        private final void write(String p0, int p1, int p2) {
            if (p1 != p2) {
                char cCharAt = p0.charAt(p1);
                if (cCharAt == '/' || cCharAt == '\\') {
                    this.write.clear();
                    this.write.add("");
                    p1++;
                } else {
                    List<String> list = this.write;
                    list.set(list.size() - 1, "");
                }
                while (p1 < p2) {
                    int iRemoteActionCompatParcelizer = FirebaseDataModule.RemoteActionCompatParcelizer(p0, "/\\", p1, p2);
                    boolean z = iRemoteActionCompatParcelizer < p2;
                    RemoteActionCompatParcelizer(p0, p1, iRemoteActionCompatParcelizer, z);
                    p1 = z ? iRemoteActionCompatParcelizer + 1 : iRemoteActionCompatParcelizer;
                }
            }
        }

        private final void RemoteActionCompatParcelizer(String str, int i, int i2, boolean z) {
            String str2 = Companion.read(ThemeAlphaConstantsKt.INSTANCE, str, i, i2, ThemeAlphaConstantsKt.PATH_SEGMENT_ENCODE_SET, true, false, false, false, null, PsExtractor.VIDEO_STREAM_MASK);
            if (MediaDescriptionCompat(str2)) {
                return;
            }
            if (MediaBrowserCompatMediaItem(str2)) {
                AudioAttributesImplApi21Parcelizer();
                return;
            }
            if (this.write.get(r13.size() - 1).length() == 0) {
                this.write.set(r13.size() - 1, str2);
            } else {
                this.write.add(str2);
            }
            if (z) {
                this.write.add("");
            }
        }

        private static boolean MediaDescriptionCompat(String p0) {
            return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) p0, (Object) ".") || TestGroupLSModel.read(p0, "%2e", true);
        }

        private static boolean MediaBrowserCompatMediaItem(String p0) {
            return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) p0, (Object) "..") || TestGroupLSModel.read(p0, "%2e.", true) || TestGroupLSModel.read(p0, ".%2e", true) || TestGroupLSModel.read(p0, "%2e%2e", true);
        }

        private final void AudioAttributesImplApi21Parcelizer() {
            if (this.write.remove(r0.size() - 1).length() == 0 && !this.write.isEmpty()) {
                this.write.set(r2.size() - 1, "");
            } else {
                this.write.add("");
            }
        }

        /* JADX INFO: renamed from: o.ThemeAlphaConstantsKt$write$IconCompatParcelizer, reason: from kotlin metadata */
        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\nJ'\u0010\f\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\f\u0010\nJ#\u0010\r\u001a\u00020\u0006*\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\r\u0010\n"}, d2 = {"Lo/ThemeAlphaConstantsKt$write$IconCompatParcelizer;", "", "<init>", "()V", "", "p0", "", "p1", "p2", "RemoteActionCompatParcelizer", "(Ljava/lang/String;II)I", "MediaBrowserCompatItemReceiver", "MediaBrowserCompatCustomActionResultReceiver", "AudioAttributesImplApi21Parcelizer"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static int MediaBrowserCompatCustomActionResultReceiver(String p0, int p1, int p2) {
                if (p2 - p1 < 2) {
                    return -1;
                }
                char cCharAt = p0.charAt(p1);
                if ((toMagicModuleMetaRepoModel.read((int) cCharAt, 97) >= 0 && toMagicModuleMetaRepoModel.read((int) cCharAt, 122) <= 0) || (toMagicModuleMetaRepoModel.read((int) cCharAt, 65) >= 0 && toMagicModuleMetaRepoModel.read((int) cCharAt, 90) <= 0)) {
                    while (true) {
                        p1++;
                        if (p1 >= p2) {
                            break;
                        }
                        char cCharAt2 = p0.charAt(p1);
                        if ('a' > cCharAt2 || cCharAt2 >= '{') {
                            if ('A' > cCharAt2 || cCharAt2 >= '[') {
                                if ('0' > cCharAt2 || cCharAt2 >= ':') {
                                    if (cCharAt2 != '+' && cCharAt2 != '-' && cCharAt2 != '.') {
                                        if (cCharAt2 == ':') {
                                            return p1;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                return -1;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static int AudioAttributesImplApi21Parcelizer(String str, int i, int i2) {
                int i3 = 0;
                while (i < i2) {
                    char cCharAt = str.charAt(i);
                    if (cCharAt != '\\' && cCharAt != '/') {
                        break;
                    }
                    i3++;
                    i++;
                }
                return i3;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static int MediaBrowserCompatItemReceiver(String p0, int p1, int p2) {
                while (p1 < p2) {
                    char cCharAt = p0.charAt(p1);
                    if (cCharAt == '[') {
                        do {
                            p1++;
                            if (p1 < p2) {
                            }
                        } while (p0.charAt(p1) != ']');
                    } else if (cCharAt == ':') {
                        return p1;
                    }
                    p1++;
                }
                return p2;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static int RemoteActionCompatParcelizer(String p0, int p1, int p2) {
                try {
                    int i = Integer.parseInt(Companion.read(ThemeAlphaConstantsKt.INSTANCE, p0, p1, p2, "", false, false, false, false, null, 248));
                    if (i <= 0 || i >= 65536) {
                        return -1;
                    }
                    return i;
                } catch (NumberFormatException unused) {
                    return -1;
                }
            }

            public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
                this();
            }
        }
    }

    @Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0019\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0004H\u0007J\u0017\u0010\u0014\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0007¢\u0006\u0002\b\u0018J\u0017\u0010\u0014\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0019\u001a\u00020\u001aH\u0007¢\u0006\u0002\b\u0018J\u0015\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u0004H\u0007¢\u0006\u0002\b\u0018J\u0017\u0010\u001b\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0019\u001a\u00020\u0004H\u0007¢\u0006\u0002\b\u001cJa\u0010\u001d\u001a\u00020\u0004*\u00020\u00042\b\b\u0002\u0010\u001e\u001a\u00020\u00122\b\b\u0002\u0010\u001f\u001a\u00020\u00122\u0006\u0010 \u001a\u00020\u00042\b\b\u0002\u0010!\u001a\u00020\"2\b\b\u0002\u0010#\u001a\u00020\"2\b\b\u0002\u0010$\u001a\u00020\"2\b\b\u0002\u0010%\u001a\u00020\"2\n\b\u0002\u0010&\u001a\u0004\u0018\u00010'H\u0000¢\u0006\u0002\b(J\u001c\u0010)\u001a\u00020\"*\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u00122\u0006\u0010\u001f\u001a\u00020\u0012H\u0002J/\u0010*\u001a\u00020\u0004*\u00020\u00042\b\b\u0002\u0010\u001e\u001a\u00020\u00122\b\b\u0002\u0010\u001f\u001a\u00020\u00122\b\b\u0002\u0010$\u001a\u00020\"H\u0000¢\u0006\u0002\b+J\u0011\u0010,\u001a\u00020\u0015*\u00020\u0004H\u0007¢\u0006\u0002\b\u0014J\u0013\u0010-\u001a\u0004\u0018\u00010\u0015*\u00020\u0017H\u0007¢\u0006\u0002\b\u0014J\u0013\u0010-\u001a\u0004\u0018\u00010\u0015*\u00020\u001aH\u0007¢\u0006\u0002\b\u0014J\u0013\u0010-\u001a\u0004\u0018\u00010\u0015*\u00020\u0004H\u0007¢\u0006\u0002\b\u001bJ#\u0010.\u001a\u00020/*\b\u0012\u0004\u0012\u00020\u0004002\n\u00101\u001a\u000602j\u0002`3H\u0000¢\u0006\u0002\b4J\u0019\u00105\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000406*\u00020\u0004H\u0000¢\u0006\u0002\b7J%\u00108\u001a\u00020/*\n\u0012\u0006\u0012\u0004\u0018\u00010\u0004002\n\u00101\u001a\u000602j\u0002`3H\u0000¢\u0006\u0002\b9JV\u0010:\u001a\u00020/*\u00020;2\u0006\u0010<\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u00122\u0006\u0010\u001f\u001a\u00020\u00122\u0006\u0010 \u001a\u00020\u00042\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\"2\u0006\u0010%\u001a\u00020\"2\b\u0010&\u001a\u0004\u0018\u00010'H\u0002J,\u0010=\u001a\u00020/*\u00020;2\u0006\u0010>\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u00122\u0006\u0010\u001f\u001a\u00020\u00122\u0006\u0010$\u001a\u00020\"H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000¨\u0006?"}, d2 = {"Lokhttp3/HttpUrl$Companion;", "", "()V", "FORM_ENCODE_SET", "", "FRAGMENT_ENCODE_SET", "FRAGMENT_ENCODE_SET_URI", "HEX_DIGITS", "", "PASSWORD_ENCODE_SET", "PATH_SEGMENT_ENCODE_SET", "PATH_SEGMENT_ENCODE_SET_URI", "QUERY_COMPONENT_ENCODE_SET", "QUERY_COMPONENT_ENCODE_SET_URI", "QUERY_COMPONENT_REENCODE_SET", "QUERY_ENCODE_SET", "USERNAME_ENCODE_SET", "defaultPort", "", "scheme", "get", "Lokhttp3/HttpUrl;", "uri", "Ljava/net/URI;", "-deprecated_get", "url", "Ljava/net/URL;", "parse", "-deprecated_parse", "canonicalize", "pos", "limit", "encodeSet", "alreadyEncoded", "", "strict", "plusIsSpace", "unicodeAllowed", "charset", "Ljava/nio/charset/Charset;", "canonicalize$okhttp", "isPercentEncoded", "percentDecode", "percentDecode$okhttp", "toHttpUrl", "toHttpUrlOrNull", "toPathString", "", "", "out", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "toPathString$okhttp", "toQueryNamesAndValues", "", "toQueryNamesAndValues$okhttp", "toQueryString", "toQueryString$okhttp", "writeCanonicalized", "Lokio/Buffer;", "input", "writePercentDecoded", "encoded", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @getMagicModuleMeta
        public static int AudioAttributesCompatParcelizer(String str) {
            toMagicModuleMetaRepoModel.write(str, "");
            if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) str, (Object) "http")) {
                return 80;
            }
            return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) str, (Object) "https") ? 443 : -1;
        }

        public static void read(List<String> list, StringBuilder sb) {
            toMagicModuleMetaRepoModel.write(list, "");
            toMagicModuleMetaRepoModel.write(sb, "");
            int size = list.size();
            for (int i = 0; i < size; i++) {
                sb.append('/');
                sb.append(list.get(i));
            }
        }

        public static void IconCompatParcelizer(List<String> list, StringBuilder sb) {
            toMagicModuleMetaRepoModel.write(list, "");
            toMagicModuleMetaRepoModel.write(sb, "");
            getDecryptedContent getdecryptedcontentWrite = getQues.write(getQues.IconCompatParcelizer(0, list.size()), 2);
            int read = getdecryptedcontentWrite.getRead();
            int audioAttributesCompatParcelizer = getdecryptedcontentWrite.getAudioAttributesCompatParcelizer();
            int iconCompatParcelizer = getdecryptedcontentWrite.getIconCompatParcelizer();
            if ((iconCompatParcelizer <= 0 || read > audioAttributesCompatParcelizer) && (iconCompatParcelizer >= 0 || audioAttributesCompatParcelizer > read)) {
                return;
            }
            while (true) {
                String str = list.get(read);
                String str2 = list.get(read + 1);
                if (read > 0) {
                    sb.append('&');
                }
                sb.append(str);
                if (str2 != null) {
                    sb.append('=');
                    sb.append(str2);
                }
                if (read == audioAttributesCompatParcelizer) {
                    return;
                } else {
                    read += iconCompatParcelizer;
                }
            }
        }

        public static List<String> RemoteActionCompatParcelizer(String str) {
            toMagicModuleMetaRepoModel.write(str, "");
            ArrayList arrayList = new ArrayList();
            int i = 0;
            while (i <= str.length()) {
                String str2 = str;
                int iIconCompatParcelizer = TestGroupLSModel.IconCompatParcelizer((CharSequence) str2, '&', i, false, 4);
                if (iIconCompatParcelizer == -1) {
                    iIconCompatParcelizer = str.length();
                }
                int iIconCompatParcelizer2 = TestGroupLSModel.IconCompatParcelizer((CharSequence) str2, '=', i, false, 4);
                if (iIconCompatParcelizer2 == -1 || iIconCompatParcelizer2 > iIconCompatParcelizer) {
                    String strSubstring = str.substring(i, iIconCompatParcelizer);
                    toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(strSubstring, "");
                    arrayList.add(strSubstring);
                    arrayList.add(null);
                } else {
                    String strSubstring2 = str.substring(i, iIconCompatParcelizer2);
                    toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(strSubstring2, "");
                    arrayList.add(strSubstring2);
                    String strSubstring3 = str.substring(iIconCompatParcelizer2 + 1, iIconCompatParcelizer);
                    toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(strSubstring3, "");
                    arrayList.add(strSubstring3);
                }
                i = iIconCompatParcelizer + 1;
            }
            return arrayList;
        }

        @getMagicModuleMeta
        public static ThemeAlphaConstantsKt write(String str) {
            toMagicModuleMetaRepoModel.write(str, "");
            return new write().write(null, str).read();
        }

        @getMagicModuleMeta
        public static ThemeAlphaConstantsKt read(String str) {
            toMagicModuleMetaRepoModel.write(str, "");
            try {
                return write(str);
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }

        public static /* synthetic */ String write(Companion companion, String str, int i, int i2, boolean z, int i3) {
            if ((i3 & 1) != 0) {
                i = 0;
            }
            if ((i3 & 2) != 0) {
                i2 = str.length();
            }
            if ((i3 & 4) != 0) {
                z = false;
            }
            return AudioAttributesCompatParcelizer(str, i, i2, z);
        }

        private static String AudioAttributesCompatParcelizer(String str, int i, int i2, boolean z) {
            toMagicModuleMetaRepoModel.write(str, "");
            for (int i3 = i; i3 < i2; i3++) {
                char cCharAt = str.charAt(i3);
                if (cCharAt == '%' || (cCharAt == '+' && z)) {
                    resetCurrentSelectedPosition resetcurrentselectedposition = new resetCurrentSelectedPosition();
                    resetcurrentselectedposition.AudioAttributesCompatParcelizer(str, i, i3);
                    read(resetcurrentselectedposition, str, i3, i2, z);
                    return resetcurrentselectedposition.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver();
                }
            }
            String strSubstring = str.substring(i, i2);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(strSubstring, "");
            return strSubstring;
        }

        private static void read(resetCurrentSelectedPosition resetcurrentselectedposition, String str, int i, int i2, boolean z) {
            int i3;
            while (i < i2) {
                int iCodePointAt = str.codePointAt(i);
                if (iCodePointAt == 37 && (i3 = i + 2) < i2) {
                    int iRemoteActionCompatParcelizer = FirebaseDataModule.RemoteActionCompatParcelizer(str.charAt(i + 1));
                    int iRemoteActionCompatParcelizer2 = FirebaseDataModule.RemoteActionCompatParcelizer(str.charAt(i3));
                    if (iRemoteActionCompatParcelizer != -1 && iRemoteActionCompatParcelizer2 != -1) {
                        resetcurrentselectedposition.read((iRemoteActionCompatParcelizer << 4) + iRemoteActionCompatParcelizer2);
                        i = Character.charCount(iCodePointAt) + i3;
                    } else {
                        resetcurrentselectedposition.MediaBrowserCompatItemReceiver(iCodePointAt);
                        i += Character.charCount(iCodePointAt);
                    }
                } else if (iCodePointAt == 43 && z) {
                    resetcurrentselectedposition.read(32);
                    i++;
                } else {
                    resetcurrentselectedposition.MediaBrowserCompatItemReceiver(iCodePointAt);
                    i += Character.charCount(iCodePointAt);
                }
            }
        }

        private static boolean read(String str, int i, int i2) {
            int i3 = i + 2;
            return i3 < i2 && str.charAt(i) == '%' && FirebaseDataModule.RemoteActionCompatParcelizer(str.charAt(i + 1)) != -1 && FirebaseDataModule.RemoteActionCompatParcelizer(str.charAt(i3)) != -1;
        }

        public static /* synthetic */ String read(Companion companion, String str, int i, int i2, String str2, boolean z, boolean z2, boolean z3, boolean z4, Charset charset, int i3) {
            return companion.RemoteActionCompatParcelizer(str, (i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? str.length() : i2, str2, (i3 & 8) != 0 ? false : z, (i3 & 16) != 0 ? false : z2, (i3 & 32) != 0 ? false : z3, (i3 & 64) != 0 ? false : z4, (i3 & 128) != 0 ? null : charset);
        }

        private String RemoteActionCompatParcelizer(String str, int i, int i2, String str2, boolean z, boolean z2, boolean z3, boolean z4, Charset charset) throws EOFException {
            toMagicModuleMetaRepoModel.write(str, "");
            toMagicModuleMetaRepoModel.write(str2, "");
            int iCharCount = i;
            while (iCharCount < i2) {
                int iCodePointAt = str.codePointAt(iCharCount);
                if (iCodePointAt < 32 || iCodePointAt == 127 || ((iCodePointAt >= 128 && !z4) || TestGroupLSModel.RemoteActionCompatParcelizer(str2, (char) iCodePointAt, false) || ((iCodePointAt == 37 && (!z || (z2 && !read(str, iCharCount, i2)))) || (iCodePointAt == 43 && z3)))) {
                    resetCurrentSelectedPosition resetcurrentselectedposition = new resetCurrentSelectedPosition();
                    resetcurrentselectedposition.AudioAttributesCompatParcelizer(str, i, iCharCount);
                    read(resetcurrentselectedposition, str, iCharCount, i2, str2, z, z2, z3, z4, charset);
                    return resetcurrentselectedposition.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver();
                }
                iCharCount += Character.charCount(iCodePointAt);
            }
            String strSubstring = str.substring(i, i2);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(strSubstring, "");
            return strSubstring;
        }

        private static void read(resetCurrentSelectedPosition resetcurrentselectedposition, String str, int i, int i2, String str2, boolean z, boolean z2, boolean z3, boolean z4, Charset charset) throws EOFException {
            resetCurrentSelectedPosition resetcurrentselectedposition2 = null;
            while (i < i2) {
                int iCodePointAt = str.codePointAt(i);
                if (!z || (iCodePointAt != 9 && iCodePointAt != 10 && iCodePointAt != 12 && iCodePointAt != 13)) {
                    if (iCodePointAt != 43 || !z3) {
                        if (iCodePointAt < 32 || iCodePointAt == 127 || ((iCodePointAt >= 128 && !z4) || TestGroupLSModel.RemoteActionCompatParcelizer(str2, (char) iCodePointAt, false) || (iCodePointAt == 37 && (!z || (z2 && !read(str, i, i2)))))) {
                            if (resetcurrentselectedposition2 == null) {
                                resetcurrentselectedposition2 = new resetCurrentSelectedPosition();
                            }
                            if (charset == null || toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(charset, StandardCharsets.UTF_8)) {
                                resetcurrentselectedposition2.MediaBrowserCompatItemReceiver(iCodePointAt);
                            } else {
                                resetcurrentselectedposition2.write(str, i, Character.charCount(iCodePointAt) + i, charset);
                            }
                            while (!resetcurrentselectedposition2.MediaBrowserCompatCustomActionResultReceiver()) {
                                byte bMediaMetadataCompat = resetcurrentselectedposition2.MediaMetadataCompat();
                                resetcurrentselectedposition.read(37);
                                resetcurrentselectedposition.read((int) ThemeAlphaConstantsKt.HEX_DIGITS[((bMediaMetadataCompat & 255) >> 4) & 15]);
                                resetcurrentselectedposition.read((int) ThemeAlphaConstantsKt.HEX_DIGITS[bMediaMetadataCompat & 15]);
                            }
                        } else {
                            resetcurrentselectedposition.MediaBrowserCompatItemReceiver(iCodePointAt);
                        }
                    } else {
                        resetcurrentselectedposition.read(z ? "+" : "%2B");
                    }
                }
                i += Character.charCount(iCodePointAt);
            }
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }

    @getMagicModuleMeta
    public static final ThemeAlphaConstantsKt AudioAttributesCompatParcelizer(String str) {
        return Companion.write(str);
    }

    @getMagicModuleMeta
    public static final ThemeAlphaConstantsKt IconCompatParcelizer(String str) {
        return Companion.read(str);
    }
}
