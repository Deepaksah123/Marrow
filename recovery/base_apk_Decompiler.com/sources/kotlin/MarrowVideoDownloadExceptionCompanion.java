package kotlin;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0015\u0018\u0000 #2\u00020\u0001:\u0001#BQ\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\t\u0012\u0006\u0010\r\u001a\u00020\t¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0010\u001a\u00020\t2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\tH\u0000¢\u0006\u0004\b\u0017\u0010\u0016R\u0011\u0010\u001a\u001a\u00020\u00028\u0007¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0011\u0010\u001d\u001a\u00020\u00058\u0007¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0011\u0010\u001f\u001a\u00020\t8\u0007¢\u0006\u0006\n\u0004\b\u0017\u0010\u001eR\u0011\u0010!\u001a\u00020\t8\u0007¢\u0006\u0006\n\u0004\b \u0010\u001eR\u0017\u0010#\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\"\u0010\u0019\u001a\u0004\b\u001d\u0010\u0016R\u0014\u0010\u001b\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b$\u0010\u0019R\u0014\u0010\u0017\u001a\u00020\t8\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b%\u0010\u001eR\u0014\u0010 \u001a\u00020\t8\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b&\u0010\u001eR\u001a\u0010\"\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b'\u0010\u0019\u001a\u0004\b \u0010\u0016"}, d2 = {"Lo/MarrowVideoDownloadExceptionCompanion;", "", "", "p0", "p1", "", "p2", "p3", "p4", "", "p5", "p6", "p7", "p8", "<init>", "(Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;ZZZZ)V", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "AudioAttributesImplApi21Parcelizer", "MediaBrowserCompatItemReceiver", "Ljava/lang/String;", "write", "MediaBrowserCompatCustomActionResultReceiver", "J", "IconCompatParcelizer", "Z", "AudioAttributesCompatParcelizer", "AudioAttributesImplApi26Parcelizer", "RemoteActionCompatParcelizer", "AudioAttributesImplBaseParcelizer", "read", "MediaBrowserCompatMediaItem", "MediaDescriptionCompat", "MediaMetadataCompat", "MediaBrowserCompatSearchResultReceiver"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class MarrowVideoDownloadExceptionCompanion {

    /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: from kotlin metadata */
    private final boolean AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: from kotlin metadata */
    private final boolean RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: from kotlin metadata */
    private final String read;

    /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from kotlin metadata */
    private final long IconCompatParcelizer;

    /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: from kotlin metadata */
    private final String write;

    /* JADX INFO: renamed from: MediaBrowserCompatMediaItem, reason: from kotlin metadata */
    private final String MediaBrowserCompatCustomActionResultReceiver;

    /* JADX INFO: renamed from: MediaBrowserCompatSearchResultReceiver, reason: from kotlin metadata */
    private final String AudioAttributesImplBaseParcelizer;

    /* JADX INFO: renamed from: MediaDescriptionCompat, reason: from kotlin metadata */
    private final boolean AudioAttributesImplApi21Parcelizer;

    /* JADX INFO: renamed from: MediaMetadataCompat, reason: from kotlin metadata */
    private final boolean AudioAttributesImplApi26Parcelizer;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final Pattern RemoteActionCompatParcelizer = Pattern.compile("(\\d{2,4})[^\\d]*");
    private static final Pattern AudioAttributesCompatParcelizer = Pattern.compile("(?i)(jan|feb|mar|apr|may|jun|jul|aug|sep|oct|nov|dec).*");
    private static final Pattern IconCompatParcelizer = Pattern.compile("(\\d{1,2})[^\\d]*");
    private static final Pattern write = Pattern.compile("(\\d{1,2}):(\\d{1,2}):(\\d{1,2})[^\\d]*");

    private MarrowVideoDownloadExceptionCompanion(String str, String str2, long j, String str3, String str4, boolean z, boolean z2, boolean z3, boolean z4) {
        this.read = str;
        this.AudioAttributesImplBaseParcelizer = str2;
        this.IconCompatParcelizer = j;
        this.write = str3;
        this.MediaBrowserCompatCustomActionResultReceiver = str4;
        this.AudioAttributesImplApi26Parcelizer = z;
        this.RemoteActionCompatParcelizer = z2;
        this.AudioAttributesImplApi21Parcelizer = z3;
        this.AudioAttributesCompatParcelizer = z4;
    }

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from getter */
    public final String getRead() {
        return this.read;
    }

    /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: from getter */
    public final String getAudioAttributesImplBaseParcelizer() {
        return this.AudioAttributesImplBaseParcelizer;
    }

    public final boolean equals(Object p0) {
        if (!(p0 instanceof MarrowVideoDownloadExceptionCompanion)) {
            return false;
        }
        MarrowVideoDownloadExceptionCompanion marrowVideoDownloadExceptionCompanion = (MarrowVideoDownloadExceptionCompanion) p0;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) marrowVideoDownloadExceptionCompanion.read, (Object) this.read) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) marrowVideoDownloadExceptionCompanion.AudioAttributesImplBaseParcelizer, (Object) this.AudioAttributesImplBaseParcelizer) && marrowVideoDownloadExceptionCompanion.IconCompatParcelizer == this.IconCompatParcelizer && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) marrowVideoDownloadExceptionCompanion.write, (Object) this.write) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) marrowVideoDownloadExceptionCompanion.MediaBrowserCompatCustomActionResultReceiver, (Object) this.MediaBrowserCompatCustomActionResultReceiver) && marrowVideoDownloadExceptionCompanion.AudioAttributesImplApi26Parcelizer == this.AudioAttributesImplApi26Parcelizer && marrowVideoDownloadExceptionCompanion.RemoteActionCompatParcelizer == this.RemoteActionCompatParcelizer && marrowVideoDownloadExceptionCompanion.AudioAttributesImplApi21Parcelizer == this.AudioAttributesImplApi21Parcelizer && marrowVideoDownloadExceptionCompanion.AudioAttributesCompatParcelizer == this.AudioAttributesCompatParcelizer;
    }

    public final int hashCode() {
        int iHashCode = this.read.hashCode();
        int iHashCode2 = this.AudioAttributesImplBaseParcelizer.hashCode();
        int iHashCode3 = Long.hashCode(this.IconCompatParcelizer);
        int iHashCode4 = this.write.hashCode();
        int iHashCode5 = this.MediaBrowserCompatCustomActionResultReceiver.hashCode();
        int iHashCode6 = Boolean.hashCode(this.AudioAttributesImplApi26Parcelizer);
        return ((((((((((((((((iHashCode + 527) * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + Boolean.hashCode(this.RemoteActionCompatParcelizer)) * 31) + Boolean.hashCode(this.AudioAttributesImplApi21Parcelizer)) * 31) + Boolean.hashCode(this.AudioAttributesCompatParcelizer);
    }

    public final String toString() {
        return AudioAttributesImplApi21Parcelizer();
    }

    private String AudioAttributesImplApi21Parcelizer() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.read);
        sb.append('=');
        sb.append(this.AudioAttributesImplBaseParcelizer);
        if (this.AudioAttributesImplApi21Parcelizer) {
            if (this.IconCompatParcelizer == Long.MIN_VALUE) {
                sb.append("; max-age=0");
            } else {
                sb.append("; expires=");
                sb.append(FragmentPresenterModule.read(new Date(this.IconCompatParcelizer)));
            }
        }
        if (!this.AudioAttributesCompatParcelizer) {
            sb.append("; domain=");
            sb.append(this.write);
        }
        sb.append("; path=");
        sb.append(this.MediaBrowserCompatCustomActionResultReceiver);
        if (this.AudioAttributesImplApi26Parcelizer) {
            sb.append("; secure");
        }
        if (this.RemoteActionCompatParcelizer) {
            sb.append("; httponly");
        }
        String string = sb.toString();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string, "");
        return string;
    }

    /* JADX INFO: renamed from: o.MarrowVideoDownloadExceptionCompanion$read, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J/\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\r\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\r\u0010\u000eJ)\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0005\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\u00102\u0006\u0010\b\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0012\u0010\u0013J!\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0005\u001a\u00020\u00102\u0006\u0010\u0007\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0012\u0010\u0014J%\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00162\u0006\u0010\u0005\u001a\u00020\u00102\u0006\u0010\u0007\u001a\u00020\u0015H\u0007¢\u0006\u0004\b\u0012\u0010\u0017J\u0017\u0010\r\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\r\u0010\u0018J'\u0010\u0019\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001b\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u001b\u0010\u001cR\u0018\u0010\u001b\u001a\u0006*\u00020\u001d0\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001eR\u0018\u0010\u0019\u001a\u0006*\u00020\u001d0\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u001eR\u0018\u0010\u000b\u001a\u0006*\u00020\u001d0\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u001eR\u0018\u0010\u0012\u001a\u0006*\u00020\u001d0\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001e"}, d2 = {"Lo/MarrowVideoDownloadExceptionCompanion$read;", "", "<init>", "()V", "", "p0", "", "p1", "p2", "", "p3", "read", "(Ljava/lang/String;IIZ)I", "AudioAttributesCompatParcelizer", "(Ljava/lang/String;Ljava/lang/String;)Z", "", "Lo/ThemeAlphaConstantsKt;", "Lo/MarrowVideoDownloadExceptionCompanion;", "write", "(JLo/ThemeAlphaConstantsKt;Ljava/lang/String;)Lo/MarrowVideoDownloadExceptionCompanion;", "(Lo/ThemeAlphaConstantsKt;Ljava/lang/String;)Lo/MarrowVideoDownloadExceptionCompanion;", "Lo/ShapeKt;", "", "(Lo/ThemeAlphaConstantsKt;Lo/ShapeKt;)Ljava/util/List;", "(Ljava/lang/String;)Ljava/lang/String;", "RemoteActionCompatParcelizer", "(Ljava/lang/String;I)J", "IconCompatParcelizer", "(Ljava/lang/String;)J", "Ljava/util/regex/Pattern;", "Ljava/util/regex/Pattern;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        private static boolean AudioAttributesCompatParcelizer(String p0, String p1) {
            if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) p0, (Object) p1)) {
                return true;
            }
            return TestGroupLSModel.AudioAttributesImplApi21Parcelizer(p0, p1) && p0.charAt((p0.length() - p1.length()) - 1) == '.' && !FirebaseDataModule.IconCompatParcelizer(p0);
        }

        @getMagicModuleMeta
        private MarrowVideoDownloadExceptionCompanion write(ThemeAlphaConstantsKt p0, String p1) {
            toMagicModuleMetaRepoModel.write(p0, "");
            toMagicModuleMetaRepoModel.write(p1, "");
            return write(System.currentTimeMillis(), p0, p1);
        }

        /* JADX WARN: Removed duplicated region for block: B:55:0x00f5 A[PHI: r23
          0x00f5: PHI (r23v2 long) = (r23v1 long), (r23v3 long) binds: [B:45:0x00d4, B:53:0x00f1] A[DONT_GENERATE, DONT_INLINE]] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private kotlin.MarrowVideoDownloadExceptionCompanion write(long r26, kotlin.ThemeAlphaConstantsKt r28, java.lang.String r29) {
            /*
                Method dump skipped, instruction units count: 341
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.MarrowVideoDownloadExceptionCompanion.Companion.write(long, o.ThemeAlphaConstantsKt, java.lang.String):o.MarrowVideoDownloadExceptionCompanion");
        }

        private static long RemoteActionCompatParcelizer(String str, int i) {
            int i2 = read(str, 0, i, false);
            Matcher matcher = MarrowVideoDownloadExceptionCompanion.write.matcher(str);
            int i3 = -1;
            int i4 = -1;
            int i5 = -1;
            int i6 = -1;
            int i7 = -1;
            int i8 = -1;
            while (i2 < i) {
                int i9 = read(str, i2 + 1, i, true);
                matcher.region(i2, i9);
                if (i4 != -1 || !matcher.usePattern(MarrowVideoDownloadExceptionCompanion.write).matches()) {
                    if (i5 != -1 || !matcher.usePattern(MarrowVideoDownloadExceptionCompanion.IconCompatParcelizer).matches()) {
                        if (i6 != -1 || !matcher.usePattern(MarrowVideoDownloadExceptionCompanion.AudioAttributesCompatParcelizer).matches()) {
                            if (i3 == -1 && matcher.usePattern(MarrowVideoDownloadExceptionCompanion.RemoteActionCompatParcelizer).matches()) {
                                String strGroup = matcher.group(1);
                                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(strGroup, "");
                                i3 = Integer.parseInt(strGroup);
                            }
                        } else {
                            String strGroup2 = matcher.group(1);
                            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(strGroup2, "");
                            Locale locale = Locale.US;
                            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(locale, "");
                            String lowerCase = strGroup2.toLowerCase(locale);
                            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(lowerCase, "");
                            String strPattern = MarrowVideoDownloadExceptionCompanion.AudioAttributesCompatParcelizer.pattern();
                            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(strPattern, "");
                            i6 = TestGroupLSModel.read((CharSequence) strPattern, lowerCase, 0, false, 6) / 4;
                        }
                    } else {
                        String strGroup3 = matcher.group(1);
                        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(strGroup3, "");
                        i5 = Integer.parseInt(strGroup3);
                    }
                } else {
                    String strGroup4 = matcher.group(1);
                    toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(strGroup4, "");
                    i4 = Integer.parseInt(strGroup4);
                    String strGroup5 = matcher.group(2);
                    toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(strGroup5, "");
                    i7 = Integer.parseInt(strGroup5);
                    String strGroup6 = matcher.group(3);
                    toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(strGroup6, "");
                    i8 = Integer.parseInt(strGroup6);
                }
                i2 = read(str, i9 + 1, i, false);
            }
            if (70 <= i3 && i3 < 100) {
                i3 += 1900;
            }
            if (i3 >= 0 && i3 < 70) {
                i3 += 2000;
            }
            if (i3 < 1601) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            if (i6 == -1) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            if (i5 <= 0 || i5 >= 32) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            if (i4 < 0 || i4 >= 24) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            if (i7 < 0 || i7 >= 60) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            if (i8 < 0 || i8 >= 60) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            GregorianCalendar gregorianCalendar = new GregorianCalendar(FirebaseDataModule.IconCompatParcelizer);
            gregorianCalendar.setLenient(false);
            gregorianCalendar.set(1, i3);
            gregorianCalendar.set(2, i6 - 1);
            gregorianCalendar.set(5, i5);
            gregorianCalendar.set(11, i4);
            gregorianCalendar.set(12, i7);
            gregorianCalendar.set(13, i8);
            gregorianCalendar.set(14, 0);
            return gregorianCalendar.getTimeInMillis();
        }

        private static int read(String p0, int p1, int p2, boolean p3) {
            while (p1 < p2) {
                char cCharAt = p0.charAt(p1);
                if (((cCharAt < ' ' && cCharAt != '\t') || cCharAt >= 127 || ('0' <= cCharAt && cCharAt < ':') || (('a' <= cCharAt && cCharAt < '{') || (('A' <= cCharAt && cCharAt < '[') || cCharAt == ':'))) == (!p3)) {
                    return p1;
                }
                p1++;
            }
            return p2;
        }

        private static long IconCompatParcelizer(String p0) {
            try {
                long j = Long.parseLong(p0);
                if (j <= 0) {
                    return Long.MIN_VALUE;
                }
                return j;
            } catch (NumberFormatException e) {
                if (new newYearNameItem("-?\\d+").write(p0)) {
                    return !TestGroupLSModel.MediaBrowserCompatCustomActionResultReceiver(p0, "-") ? Long.MAX_VALUE : Long.MIN_VALUE;
                }
                throw e;
            }
        }

        private static String AudioAttributesCompatParcelizer(String p0) {
            if (TestGroupLSModel.AudioAttributesImplApi21Parcelizer(p0, ".")) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            String strWrite = InterceptorModule.write(TestGroupLSModel.IconCompatParcelizer(p0, (CharSequence) "."));
            if (strWrite != null) {
                return strWrite;
            }
            throw new IllegalArgumentException();
        }

        @getMagicModuleMeta
        public final List<MarrowVideoDownloadExceptionCompanion> write(ThemeAlphaConstantsKt p0, ShapeKt p1) {
            toMagicModuleMetaRepoModel.write(p0, "");
            toMagicModuleMetaRepoModel.write(p1, "");
            List<String> listAudioAttributesCompatParcelizer = p1.AudioAttributesCompatParcelizer("Set-Cookie");
            int size = listAudioAttributesCompatParcelizer.size();
            ArrayList arrayList = null;
            for (int i = 0; i < size; i++) {
                MarrowVideoDownloadExceptionCompanion marrowVideoDownloadExceptionCompanionWrite = write(p0, listAudioAttributesCompatParcelizer.get(i));
                if (marrowVideoDownloadExceptionCompanionWrite != null) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(marrowVideoDownloadExceptionCompanionWrite);
                }
            }
            if (arrayList != null) {
                List<MarrowVideoDownloadExceptionCompanion> listUnmodifiableList = Collections.unmodifiableList(arrayList);
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(listUnmodifiableList, "");
                return listUnmodifiableList;
            }
            return IntermediateLoginResponseBody.RemoteActionCompatParcelizer();
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }

    public /* synthetic */ MarrowVideoDownloadExceptionCompanion(String str, String str2, long j, String str3, String str4, boolean z, boolean z2, boolean z3, boolean z4, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this(str, str2, j, str3, str4, z, z2, z3, z4);
    }
}
