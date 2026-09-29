package kotlin;

import com.google.android.exoplayer2.source.rtsp.RtspHeaders;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import kotlin.C0156TypeKt;
import kotlin.Metadata;
import kotlin.ShapeKt;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u0000 \u000b2\u00020\u0001:\u0002\u000b\u0010B\u001d\b\u0000\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00048\u0007¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\b\u0010\nR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f"}, d2 = {"Lo/PlanDataModule;", "", "Lo/ThemeKtExternalSyntheticLambda0;", "p0", "Lo/TypeKt;", "p1", "<init>", "(Lo/ThemeKtExternalSyntheticLambda0;Lo/TypeKt;)V", "IconCompatParcelizer", "Lo/TypeKt;", "()Lo/TypeKt;", "read", "write", "Lo/ThemeKtExternalSyntheticLambda0;", "RemoteActionCompatParcelizer", "()Lo/ThemeKtExternalSyntheticLambda0;", "AudioAttributesCompatParcelizer"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class PlanDataModule {

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final C0156TypeKt read;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final ThemeKtExternalSyntheticLambda0 RemoteActionCompatParcelizer;

    public PlanDataModule(ThemeKtExternalSyntheticLambda0 themeKtExternalSyntheticLambda0, C0156TypeKt c0156TypeKt) {
        this.RemoteActionCompatParcelizer = themeKtExternalSyntheticLambda0;
        this.read = c0156TypeKt;
    }

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from getter */
    public final ThemeKtExternalSyntheticLambda0 getRemoteActionCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from getter */
    public final C0156TypeKt getRead() {
        return this.read;
    }

    public static final class AudioAttributesCompatParcelizer {
        private int AudioAttributesCompatParcelizer;
        private final ThemeKtExternalSyntheticLambda0 AudioAttributesImplApi21Parcelizer;
        private final long AudioAttributesImplApi26Parcelizer;
        private String AudioAttributesImplBaseParcelizer;
        private Date IconCompatParcelizer;
        private long MediaBrowserCompatCustomActionResultReceiver;
        private long MediaBrowserCompatItemReceiver;
        private String MediaBrowserCompatSearchResultReceiver;
        private Date RatingCompat;
        private final C0156TypeKt RemoteActionCompatParcelizer;
        private String read;
        private Date write;

        public AudioAttributesCompatParcelizer(long j, ThemeKtExternalSyntheticLambda0 themeKtExternalSyntheticLambda0, C0156TypeKt c0156TypeKt) {
            toMagicModuleMetaRepoModel.write(themeKtExternalSyntheticLambda0, "");
            this.AudioAttributesImplApi26Parcelizer = j;
            this.AudioAttributesImplApi21Parcelizer = themeKtExternalSyntheticLambda0;
            this.RemoteActionCompatParcelizer = c0156TypeKt;
            this.AudioAttributesCompatParcelizer = -1;
            if (c0156TypeKt != null) {
                this.MediaBrowserCompatCustomActionResultReceiver = c0156TypeKt.getSentRequestAtMillis();
                this.MediaBrowserCompatItemReceiver = c0156TypeKt.getReceivedResponseAtMillis();
                ShapeKt headers = c0156TypeKt.getHeaders();
                int iIconCompatParcelizer = headers.IconCompatParcelizer();
                for (int i = 0; i < iIconCompatParcelizer; i++) {
                    String strIconCompatParcelizer = headers.IconCompatParcelizer(i);
                    String strAudioAttributesCompatParcelizer = headers.AudioAttributesCompatParcelizer(i);
                    if (TestGroupLSModel.read(strIconCompatParcelizer, RtspHeaders.DATE, true)) {
                        this.RatingCompat = FragmentPresenterModule.read(strAudioAttributesCompatParcelizer);
                        this.MediaBrowserCompatSearchResultReceiver = strAudioAttributesCompatParcelizer;
                    } else if (TestGroupLSModel.read(strIconCompatParcelizer, RtspHeaders.EXPIRES, true)) {
                        this.IconCompatParcelizer = FragmentPresenterModule.read(strAudioAttributesCompatParcelizer);
                    } else if (TestGroupLSModel.read(strIconCompatParcelizer, "Last-Modified", true)) {
                        this.write = FragmentPresenterModule.read(strAudioAttributesCompatParcelizer);
                        this.AudioAttributesImplBaseParcelizer = strAudioAttributesCompatParcelizer;
                    } else if (TestGroupLSModel.read(strIconCompatParcelizer, "ETag", true)) {
                        this.read = strAudioAttributesCompatParcelizer;
                    } else if (TestGroupLSModel.read(strIconCompatParcelizer, "Age", true)) {
                        this.AudioAttributesCompatParcelizer = FirebaseDataModule.read(strAudioAttributesCompatParcelizer, -1);
                    }
                }
            }
        }

        private final boolean read() {
            C0156TypeKt c0156TypeKt = this.RemoteActionCompatParcelizer;
            toMagicModuleMetaRepoModel.write(c0156TypeKt);
            return c0156TypeKt.AudioAttributesCompatParcelizer().getMaxAgeSeconds() == -1 && this.IconCompatParcelizer == null;
        }

        public final PlanDataModule AudioAttributesCompatParcelizer() {
            PlanDataModule planDataModuleIconCompatParcelizer = IconCompatParcelizer();
            return (planDataModuleIconCompatParcelizer.getRemoteActionCompatParcelizer() == null || !this.AudioAttributesImplApi21Parcelizer.write().getOnlyIfCached()) ? planDataModuleIconCompatParcelizer : new PlanDataModule(null, null);
        }

        private final PlanDataModule IconCompatParcelizer() {
            String str;
            if (this.RemoteActionCompatParcelizer == null) {
                return new PlanDataModule(this.AudioAttributesImplApi21Parcelizer, null);
            }
            if (this.AudioAttributesImplApi21Parcelizer.IconCompatParcelizer() && this.RemoteActionCompatParcelizer.getHandshake() == null) {
                return new PlanDataModule(this.AudioAttributesImplApi21Parcelizer, null);
            }
            Companion companion = PlanDataModule.INSTANCE;
            if (!Companion.IconCompatParcelizer(this.RemoteActionCompatParcelizer, this.AudioAttributesImplApi21Parcelizer)) {
                return new PlanDataModule(this.AudioAttributesImplApi21Parcelizer, null);
            }
            getEncryptedLicenseTimeInfo getencryptedlicensetimeinfoWrite = this.AudioAttributesImplApi21Parcelizer.write();
            if (getencryptedlicensetimeinfoWrite.getNoCache() || write(this.AudioAttributesImplApi21Parcelizer)) {
                return new PlanDataModule(this.AudioAttributesImplApi21Parcelizer, null);
            }
            getEncryptedLicenseTimeInfo getencryptedlicensetimeinfoAudioAttributesCompatParcelizer = this.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer();
            long jRemoteActionCompatParcelizer = RemoteActionCompatParcelizer();
            long jWrite = write();
            if (getencryptedlicensetimeinfoWrite.getMaxAgeSeconds() != -1) {
                jWrite = Math.min(jWrite, TimeUnit.SECONDS.toMillis(getencryptedlicensetimeinfoWrite.getMaxAgeSeconds()));
            }
            long millis = 0;
            long millis2 = getencryptedlicensetimeinfoWrite.getMinFreshSeconds() != -1 ? TimeUnit.SECONDS.toMillis(getencryptedlicensetimeinfoWrite.getMinFreshSeconds()) : 0L;
            if (!getencryptedlicensetimeinfoAudioAttributesCompatParcelizer.getMustRevalidate() && getencryptedlicensetimeinfoWrite.getMaxStaleSeconds() != -1) {
                millis = TimeUnit.SECONDS.toMillis(getencryptedlicensetimeinfoWrite.getMaxStaleSeconds());
            }
            if (!getencryptedlicensetimeinfoAudioAttributesCompatParcelizer.getNoCache()) {
                long j = millis2 + jRemoteActionCompatParcelizer;
                if (j < millis + jWrite) {
                    C0156TypeKt.IconCompatParcelizer iconCompatParcelizerMediaDescriptionCompat = this.RemoteActionCompatParcelizer.MediaDescriptionCompat();
                    if (j >= jWrite) {
                        iconCompatParcelizerMediaDescriptionCompat.AudioAttributesCompatParcelizer("Warning", "110 HttpURLConnection \"Response is stale\"");
                    }
                    if (jRemoteActionCompatParcelizer > 86400000 && read()) {
                        iconCompatParcelizerMediaDescriptionCompat.AudioAttributesCompatParcelizer("Warning", "113 HttpURLConnection \"Heuristic expiration\"");
                    }
                    return new PlanDataModule(null, iconCompatParcelizerMediaDescriptionCompat.IconCompatParcelizer());
                }
            }
            String str2 = this.read;
            if (str2 != null) {
                str = "If-None-Match";
            } else {
                if (this.write != null) {
                    str2 = this.AudioAttributesImplBaseParcelizer;
                } else if (this.RatingCompat != null) {
                    str2 = this.MediaBrowserCompatSearchResultReceiver;
                } else {
                    return new PlanDataModule(this.AudioAttributesImplApi21Parcelizer, null);
                }
                str = "If-Modified-Since";
            }
            ShapeKt.RemoteActionCompatParcelizer remoteActionCompatParcelizerAudioAttributesCompatParcelizer = this.AudioAttributesImplApi21Parcelizer.getHeaders().AudioAttributesCompatParcelizer();
            toMagicModuleMetaRepoModel.write((Object) str2);
            remoteActionCompatParcelizerAudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(str, str2);
            return new PlanDataModule(this.AudioAttributesImplApi21Parcelizer.MediaBrowserCompatItemReceiver().read(remoteActionCompatParcelizerAudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer()).RemoteActionCompatParcelizer(), this.RemoteActionCompatParcelizer);
        }

        private final long write() {
            C0156TypeKt c0156TypeKt = this.RemoteActionCompatParcelizer;
            toMagicModuleMetaRepoModel.write(c0156TypeKt);
            if (c0156TypeKt.AudioAttributesCompatParcelizer().getMaxAgeSeconds() != -1) {
                return TimeUnit.SECONDS.toMillis(r0.getMaxAgeSeconds());
            }
            Date date = this.IconCompatParcelizer;
            if (date != null) {
                Date date2 = this.RatingCompat;
                long time = date.getTime() - (date2 != null ? date2.getTime() : this.MediaBrowserCompatItemReceiver);
                if (time > 0) {
                    return time;
                }
                return 0L;
            }
            if (this.write != null && this.RemoteActionCompatParcelizer.getRequest().getUrl().MediaBrowserCompatMediaItem() == null) {
                Date date3 = this.RatingCompat;
                long time2 = date3 != null ? date3.getTime() : this.MediaBrowserCompatCustomActionResultReceiver;
                Date date4 = this.write;
                toMagicModuleMetaRepoModel.write(date4);
                long time3 = time2 - date4.getTime();
                if (time3 > 0) {
                    return time3 / 10;
                }
            }
            return 0L;
        }

        private final long RemoteActionCompatParcelizer() {
            Date date = this.RatingCompat;
            long jMax = date != null ? Math.max(0L, this.MediaBrowserCompatItemReceiver - date.getTime()) : 0L;
            if (this.AudioAttributesCompatParcelizer != -1) {
                jMax = Math.max(jMax, TimeUnit.SECONDS.toMillis(this.AudioAttributesCompatParcelizer));
            }
            long j = this.MediaBrowserCompatItemReceiver;
            return jMax + (j - this.MediaBrowserCompatCustomActionResultReceiver) + (this.AudioAttributesImplApi26Parcelizer - j);
        }

        private static boolean write(ThemeKtExternalSyntheticLambda0 themeKtExternalSyntheticLambda0) {
            return (themeKtExternalSyntheticLambda0.AudioAttributesCompatParcelizer("If-Modified-Since") == null && themeKtExternalSyntheticLambda0.AudioAttributesCompatParcelizer("If-None-Match") == null) ? false : true;
        }
    }

    /* JADX INFO: renamed from: o.PlanDataModule$read, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Lo/PlanDataModule$read;", "", "<init>", "()V", "Lo/TypeKt;", "p0", "Lo/ThemeKtExternalSyntheticLambda0;", "p1", "", "IconCompatParcelizer", "(Lo/TypeKt;Lo/ThemeKtExternalSyntheticLambda0;)Z"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        /* JADX WARN: Removed duplicated region for block: B:24:0x0039  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static boolean IconCompatParcelizer(kotlin.C0156TypeKt r3, kotlin.ThemeKtExternalSyntheticLambda0 r4) {
            /*
                java.lang.String r0 = ""
                kotlin.toMagicModuleMetaRepoModel.write(r3, r0)
                kotlin.toMagicModuleMetaRepoModel.write(r4, r0)
                int r0 = r3.getCode()
                r1 = 200(0xc8, float:2.8E-43)
                r2 = 0
                if (r0 == r1) goto L61
                r1 = 410(0x19a, float:5.75E-43)
                if (r0 == r1) goto L61
                r1 = 414(0x19e, float:5.8E-43)
                if (r0 == r1) goto L61
                r1 = 501(0x1f5, float:7.02E-43)
                if (r0 == r1) goto L61
                r1 = 203(0xcb, float:2.84E-43)
                if (r0 == r1) goto L61
                r1 = 204(0xcc, float:2.86E-43)
                if (r0 == r1) goto L61
                r1 = 307(0x133, float:4.3E-43)
                if (r0 == r1) goto L39
                r1 = 308(0x134, float:4.32E-43)
                if (r0 == r1) goto L61
                r1 = 404(0x194, float:5.66E-43)
                if (r0 == r1) goto L61
                r1 = 405(0x195, float:5.68E-43)
                if (r0 == r1) goto L61
                switch(r0) {
                    case 300: goto L61;
                    case 301: goto L61;
                    case 302: goto L39;
                    default: goto L38;
                }
            L38:
                return r2
            L39:
                java.lang.String r0 = "Expires"
                java.lang.String r0 = kotlin.C0156TypeKt.IconCompatParcelizer(r3, r0)
                if (r0 != 0) goto L61
                o.getEncryptedLicenseTimeInfo r0 = r3.AudioAttributesCompatParcelizer()
                int r0 = r0.getMaxAgeSeconds()
                r1 = -1
                if (r0 != r1) goto L61
                o.getEncryptedLicenseTimeInfo r0 = r3.AudioAttributesCompatParcelizer()
                boolean r0 = r0.getIsPublic()
                if (r0 != 0) goto L61
                o.getEncryptedLicenseTimeInfo r0 = r3.AudioAttributesCompatParcelizer()
                boolean r0 = r0.getIsPrivate()
                if (r0 != 0) goto L61
                return r2
            L61:
                o.getEncryptedLicenseTimeInfo r3 = r3.AudioAttributesCompatParcelizer()
                boolean r3 = r3.getNoStore()
                if (r3 != 0) goto L77
                o.getEncryptedLicenseTimeInfo r3 = r4.write()
                boolean r3 = r3.getNoStore()
                if (r3 != 0) goto L77
                r3 = 1
                return r3
            L77:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.PlanDataModule.Companion.IconCompatParcelizer(o.TypeKt, o.ThemeKtExternalSyntheticLambda0):boolean");
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }
}
