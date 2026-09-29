package kotlin;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Metadata;

/* JADX INFO: renamed from: o.ExtendedColors, reason: from Kotlin metadata */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B-\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007¢\u0006\u0002\u0010\bJ\u0016\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\fH\u0007J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0011\u001a\u00020\u0012H\u0016J\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0014\u001a\u00020\u0003J\r\u0010\u0005\u001a\u00020\u0003H\u0007¢\u0006\u0002\b\u0015J\b\u0010\u0016\u001a\u00020\u0003H\u0016J\r\u0010\u0004\u001a\u00020\u0003H\u0007¢\u0006\u0002\b\u0017R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\tR\u0013\u0010\u0005\u001a\u00020\u00038\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\nR\u0013\u0010\u0004\u001a\u00020\u00038\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\n¨\u0006\u0019"}, d2 = {"Lokhttp3/MediaType;", "", "mediaType", "", "type", "subtype", "parameterNamesAndValues", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)V", "[Ljava/lang/String;", "()Ljava/lang/String;", "charset", "Ljava/nio/charset/Charset;", "defaultValue", "equals", "", "other", "hashCode", "", "parameter", "name", "-deprecated_subtype", "toString", "-deprecated_type", "Companion", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class MediaType {
    private final String[] AudioAttributesCompatParcelizer;
    private final String AudioAttributesImplApi21Parcelizer;
    private final String MediaBrowserCompatCustomActionResultReceiver;
    private final String RemoteActionCompatParcelizer;
    public static final write write = new write(null);
    private static final Pattern read = Pattern.compile("([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)/([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)");
    private static final Pattern IconCompatParcelizer = Pattern.compile(";\\s*(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)=(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)|\"([^\"]*)\"))?");

    private MediaType(String str, String str2, String str3, String[] strArr) {
        this.RemoteActionCompatParcelizer = str;
        this.AudioAttributesImplApi21Parcelizer = str2;
        this.MediaBrowserCompatCustomActionResultReceiver = str3;
        this.AudioAttributesCompatParcelizer = strArr;
    }

    /* JADX INFO: renamed from: write, reason: from getter */
    public final String getAudioAttributesImplApi21Parcelizer() {
        return this.AudioAttributesImplApi21Parcelizer;
    }

    public final Charset read(Charset charset) {
        String strAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer("charset");
        if (strAudioAttributesCompatParcelizer == null) {
            return charset;
        }
        try {
            return Charset.forName(strAudioAttributesCompatParcelizer);
        } catch (IllegalArgumentException unused) {
            return charset;
        }
    }

    private String AudioAttributesCompatParcelizer(String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        int i = 0;
        int i2 = saveMagicModuleTimeline.read(0, this.AudioAttributesCompatParcelizer.length - 1, 2);
        if (i2 < 0) {
            return null;
        }
        while (!TestGroupLSModel.read(this.AudioAttributesCompatParcelizer[i], str, true)) {
            if (i == i2) {
                return null;
            }
            i += 2;
        }
        return this.AudioAttributesCompatParcelizer[i + 1];
    }

    /* JADX INFO: renamed from: toString, reason: from getter */
    public final String getRemoteActionCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    public final boolean equals(Object other) {
        return (other instanceof MediaType) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) ((MediaType) other).RemoteActionCompatParcelizer, (Object) this.RemoteActionCompatParcelizer);
    }

    public final int hashCode() {
        return this.RemoteActionCompatParcelizer.hashCode();
    }

    /* JADX INFO: renamed from: o.ExtendedColors$write */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\b\u001a\u0004\u0018\u00010\u0005*\u00020\u0004H\u0007¢\u0006\u0004\b\b\u0010\u0007R\u0018\u0010\b\u001a\u0006*\u00020\t0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0018\u0010\u0006\u001a\u0006*\u00020\t0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u000b"}, d2 = {"Lo/ExtendedColors$write;", "", "<init>", "()V", "", "Lo/ExtendedColors;", "RemoteActionCompatParcelizer", "(Ljava/lang/String;)Lo/ExtendedColors;", "AudioAttributesCompatParcelizer", "Ljava/util/regex/Pattern;", "IconCompatParcelizer", "Ljava/util/regex/Pattern;", "read"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class write {
        private write() {
        }

        @getMagicModuleMeta
        public static MediaType RemoteActionCompatParcelizer(String str) {
            toMagicModuleMetaRepoModel.write(str, "");
            String str2 = str;
            Matcher matcher = MediaType.read.matcher(str2);
            if (!matcher.lookingAt()) {
                StringBuilder sb = new StringBuilder("No subtype found for: \"");
                sb.append(str);
                sb.append('\"');
                throw new IllegalArgumentException(sb.toString().toString());
            }
            String strGroup = matcher.group(1);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(strGroup, "");
            Locale locale = Locale.US;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(locale, "");
            String lowerCase = strGroup.toLowerCase(locale);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(lowerCase, "");
            String strGroup2 = matcher.group(2);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(strGroup2, "");
            Locale locale2 = Locale.US;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(locale2, "");
            String lowerCase2 = strGroup2.toLowerCase(locale2);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(lowerCase2, "");
            ArrayList arrayList = new ArrayList();
            Matcher matcher2 = MediaType.IconCompatParcelizer.matcher(str2);
            int iEnd = matcher.end();
            while (iEnd < str.length()) {
                matcher2.region(iEnd, str.length());
                if (!matcher2.lookingAt()) {
                    StringBuilder sb2 = new StringBuilder("Parameter is not formatted correctly: \"");
                    String strSubstring = str.substring(iEnd);
                    toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(strSubstring, "");
                    sb2.append(strSubstring);
                    sb2.append("\" for: \"");
                    sb2.append(str);
                    sb2.append('\"');
                    throw new IllegalArgumentException(sb2.toString().toString());
                }
                String strGroup3 = matcher2.group(1);
                if (strGroup3 == null) {
                    iEnd = matcher2.end();
                } else {
                    String strGroup4 = matcher2.group(2);
                    if (strGroup4 == null) {
                        strGroup4 = matcher2.group(3);
                    } else if (TestGroupLSModel.MediaBrowserCompatCustomActionResultReceiver(strGroup4, "'") && TestGroupLSModel.AudioAttributesImplApi21Parcelizer(strGroup4, "'") && strGroup4.length() > 2) {
                        strGroup4 = strGroup4.substring(1, strGroup4.length() - 1);
                        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(strGroup4, "");
                    }
                    ArrayList arrayList2 = arrayList;
                    arrayList2.add(strGroup3);
                    arrayList2.add(strGroup4);
                    iEnd = matcher2.end();
                }
            }
            return new MediaType(str, lowerCase, lowerCase2, (String[]) arrayList.toArray(new String[0]), null);
        }

        @getMagicModuleMeta
        public static MediaType AudioAttributesCompatParcelizer(String str) {
            toMagicModuleMetaRepoModel.write(str, "");
            try {
                return RemoteActionCompatParcelizer(str);
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }

        public /* synthetic */ write(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }

    public /* synthetic */ MediaType(String str, String str2, String str3, String[] strArr, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this(str, str2, str3, strArr);
    }

    @getMagicModuleMeta
    public static final MediaType read(String str) {
        return write.RemoteActionCompatParcelizer(str);
    }

    @getMagicModuleMeta
    public static final MediaType RemoteActionCompatParcelizer(String str) {
        return write.AudioAttributesCompatParcelizer(str);
    }
}
