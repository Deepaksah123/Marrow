package kotlin;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.C0177getRfBanners;

/* JADX INFO: loaded from: classes4.dex */
public class ThemeStateCompanion<T> extends TimelineCreator<getHasMultipleThemes> implements ThemeState<T>, UserShortInfoJsonParser<T>, getPbConfig<T> {
    private final setAddressLine2 AudioAttributesCompatParcelizer;
    private int AudioAttributesImplApi26Parcelizer;
    private final int AudioAttributesImplBaseParcelizer;
    private final int IconCompatParcelizer;
    private long MediaBrowserCompatItemReceiver;
    private Object[] RemoteActionCompatParcelizer;
    private long read;
    private int write;

    static final class AudioAttributesCompatParcelizer<T> extends getTotalMcq {
        Object AudioAttributesCompatParcelizer;
        /* synthetic */ Object AudioAttributesImplApi21Parcelizer;
        Object IconCompatParcelizer;
        private /* synthetic */ ThemeStateCompanion<T> MediaBrowserCompatItemReceiver;
        Object RemoteActionCompatParcelizer;
        Object read;
        int write;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AudioAttributesCompatParcelizer(ThemeStateCompanion<T> themeStateCompanion, SampleVideos<? super AudioAttributesCompatParcelizer> sampleVideos) {
            super(sampleVideos);
            this.MediaBrowserCompatItemReceiver = themeStateCompanion;
        }

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            this.AudioAttributesImplApi21Parcelizer = obj;
            this.write |= Integer.MIN_VALUE;
            return ThemeStateCompanion.write(this.MediaBrowserCompatItemReceiver, (getValidationToken) null, this);
        }
    }

    public final /* synthetic */ class RemoteActionCompatParcelizer {
        public static final /* synthetic */ int[] write;

        static {
            int[] iArr = new int[setAddressLine2.values().length];
            try {
                iArr[setAddressLine2.read.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[setAddressLine2.IconCompatParcelizer.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[setAddressLine2.AudioAttributesCompatParcelizer.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            write = iArr;
        }
    }

    @Override // kotlin.TimelineCreator
    public final /* synthetic */ getDecoderName[] read() {
        return write(2);
    }

    @Override // kotlin.TimelineCreator
    public final /* synthetic */ getDecoderName write() {
        return onCommand();
    }

    public ThemeStateCompanion(int i, int i2, setAddressLine2 setaddressline2) {
        this.AudioAttributesImplBaseParcelizer = i;
        this.IconCompatParcelizer = i2;
        this.AudioAttributesCompatParcelizer = setaddressline2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long MediaMetadataCompat() {
        return Math.min(this.read, this.MediaBrowserCompatItemReceiver);
    }

    private final int handleMediaPlayPauseIfPendingOnHandler() {
        return (int) ((MediaMetadataCompat() + ((long) this.write)) - this.MediaBrowserCompatItemReceiver);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver() {
        return this.write + this.AudioAttributesImplApi26Parcelizer;
    }

    private final long RatingCompat() {
        return MediaMetadataCompat() + ((long) this.write);
    }

    private final long MediaBrowserCompatSearchResultReceiver() {
        return MediaMetadataCompat() + ((long) this.write) + ((long) this.AudioAttributesImplApi26Parcelizer);
    }

    protected final T MediaBrowserCompatCustomActionResultReceiver() {
        Object[] objArr = this.RemoteActionCompatParcelizer;
        toMagicModuleMetaRepoModel.write(objArr);
        return (T) getThemeState.write(objArr, (this.MediaBrowserCompatItemReceiver + ((long) handleMediaPlayPauseIfPendingOnHandler())) - 1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0084, code lost:
    
        if (((kotlin.TimelinePYTMap) r9).IconCompatParcelizer(r0) != r1) goto L31;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00b3 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a2 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    static /* synthetic */ <T> java.lang.Object write(kotlin.ThemeStateCompanion<T> r8, kotlin.getValidationToken<? super T> r9, kotlin.SampleVideos<?> r10) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 213
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.ThemeStateCompanion.write(o.ThemeStateCompanion, o.getValidationToken, o.SampleVideos):java.lang.Object");
    }

    @Override // kotlin.ThemeState
    public final boolean RemoteActionCompatParcelizer(T t) {
        int i;
        boolean z;
        SampleVideos<getShowPopup>[] sampleVideosArrWrite = getFirstBufferDurationMs.read;
        synchronized (this) {
            if (read(t)) {
                sampleVideosArrWrite = write(sampleVideosArrWrite);
                z = true;
            } else {
                z = false;
            }
        }
        for (SampleVideos<getShowPopup> sampleVideos : sampleVideosArrWrite) {
            if (sampleVideos != null) {
                C0177getRfBanners.IconCompatParcelizer iconCompatParcelizer = C0177getRfBanners.IconCompatParcelizer;
                sampleVideos.resumeWith(C0177getRfBanners.read(getShowPopup.INSTANCE));
            }
        }
        return z;
    }

    private static /* synthetic */ <T> Object RemoteActionCompatParcelizer(ThemeStateCompanion<T> themeStateCompanion, T t, SampleVideos<? super getShowPopup> sampleVideos) {
        Object obj;
        return (!themeStateCompanion.RemoteActionCompatParcelizer(t) && (obj = themeStateCompanion.read(t, sampleVideos)) == getYear.IconCompatParcelizer()) ? obj : getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean read(T t) {
        if (MediaBrowserCompatItemReceiver() == 0) {
            return write(t);
        }
        if (this.write >= this.IconCompatParcelizer && this.read <= this.MediaBrowserCompatItemReceiver) {
            int i = RemoteActionCompatParcelizer.write[this.AudioAttributesCompatParcelizer.ordinal()];
            if (i == 1) {
                return false;
            }
            if (i == 2) {
                return true;
            }
            if (i != 3) {
                throw new RenewEligibleCreator();
            }
        }
        AudioAttributesCompatParcelizer(t);
        int i2 = this.write + 1;
        this.write = i2;
        if (i2 > this.IconCompatParcelizer) {
            MediaBrowserCompatMediaItem();
        }
        if (handleMediaPlayPauseIfPendingOnHandler() > this.AudioAttributesImplBaseParcelizer) {
            write(this.MediaBrowserCompatItemReceiver + 1, this.read, RatingCompat(), MediaBrowserCompatSearchResultReceiver());
        }
        return true;
    }

    private final boolean write(T t) {
        getCollegeId.write();
        if (this.AudioAttributesImplBaseParcelizer == 0) {
            return true;
        }
        AudioAttributesCompatParcelizer(t);
        int i = this.write + 1;
        this.write = i;
        if (i > this.AudioAttributesImplBaseParcelizer) {
            MediaBrowserCompatMediaItem();
        }
        this.read = MediaMetadataCompat() + ((long) this.write);
        return true;
    }

    private final void MediaBrowserCompatMediaItem() {
        Object[] objArr = this.RemoteActionCompatParcelizer;
        toMagicModuleMetaRepoModel.write(objArr);
        getThemeState.IconCompatParcelizer(objArr, MediaMetadataCompat(), null);
        this.write--;
        long jMediaMetadataCompat = MediaMetadataCompat() + 1;
        if (this.MediaBrowserCompatItemReceiver < jMediaMetadataCompat) {
            this.MediaBrowserCompatItemReceiver = jMediaMetadataCompat;
        }
        if (this.read < jMediaMetadataCompat) {
            write(jMediaMetadataCompat);
        }
        getCollegeId.write();
    }

    private final void write(long j) {
        getDecoderName[] getdecodernameArr;
        ThemeStateCompanion<T> themeStateCompanion = this;
        if (((TimelineCreator) themeStateCompanion).AudioAttributesCompatParcelizer != 0 && (getdecodernameArr = ((TimelineCreator) themeStateCompanion).RemoteActionCompatParcelizer) != null) {
            for (getDecoderName getdecodername : getdecodernameArr) {
                if (getdecodername != null) {
                    getHasMultipleThemes gethasmultiplethemes = (getHasMultipleThemes) getdecodername;
                    if (gethasmultiplethemes.AudioAttributesCompatParcelizer >= 0 && gethasmultiplethemes.AudioAttributesCompatParcelizer < j) {
                        gethasmultiplethemes.AudioAttributesCompatParcelizer = j;
                    }
                }
            }
        }
        this.read = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void AudioAttributesCompatParcelizer(Object obj) {
        int iMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver();
        Object[] objArrAudioAttributesCompatParcelizer = this.RemoteActionCompatParcelizer;
        if (objArrAudioAttributesCompatParcelizer == null) {
            objArrAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(null, 0, 2);
        } else if (iMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver >= objArrAudioAttributesCompatParcelizer.length) {
            objArrAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(objArrAudioAttributesCompatParcelizer, iMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, objArrAudioAttributesCompatParcelizer.length << 1);
        }
        getThemeState.IconCompatParcelizer(objArrAudioAttributesCompatParcelizer, MediaMetadataCompat() + ((long) iMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver), obj);
    }

    private final Object[] AudioAttributesCompatParcelizer(Object[] objArr, int i, int i2) {
        if (i2 <= 0) {
            throw new IllegalStateException("Buffer size overflow".toString());
        }
        Object[] objArr2 = new Object[i2];
        this.RemoteActionCompatParcelizer = objArr2;
        if (objArr != null) {
            long jMediaMetadataCompat = MediaMetadataCompat();
            for (int i3 = 0; i3 < i; i3++) {
                long j = ((long) i3) + jMediaMetadataCompat;
                getThemeState.IconCompatParcelizer(objArr2, j, getThemeState.write(objArr, j));
            }
        }
        return objArr2;
    }

    public final long AudioAttributesImplApi26Parcelizer() {
        long j = this.MediaBrowserCompatItemReceiver;
        if (j < this.read) {
            this.read = j;
        }
        return j;
    }

    public final SampleVideos<getShowPopup>[] read(long j) {
        int iMin;
        long j2;
        long j3;
        getDecoderName[] getdecodernameArr;
        getCollegeId.write();
        if (j > this.read) {
            return getFirstBufferDurationMs.read;
        }
        long jMediaMetadataCompat = MediaMetadataCompat();
        long j4 = ((long) this.write) + jMediaMetadataCompat;
        if (this.IconCompatParcelizer == 0 && this.AudioAttributesImplApi26Parcelizer > 0) {
            j4++;
        }
        ThemeStateCompanion<T> themeStateCompanion = this;
        int i = 0;
        if (((TimelineCreator) themeStateCompanion).AudioAttributesCompatParcelizer != 0 && (getdecodernameArr = ((TimelineCreator) themeStateCompanion).RemoteActionCompatParcelizer) != null) {
            for (getDecoderName getdecodername : getdecodernameArr) {
                if (getdecodername != null) {
                    getHasMultipleThemes gethasmultiplethemes = (getHasMultipleThemes) getdecodername;
                    if (gethasmultiplethemes.AudioAttributesCompatParcelizer >= 0 && gethasmultiplethemes.AudioAttributesCompatParcelizer < j4) {
                        j4 = gethasmultiplethemes.AudioAttributesCompatParcelizer;
                    }
                }
            }
        }
        getCollegeId.write();
        if (j4 <= this.read) {
            return getFirstBufferDurationMs.read;
        }
        long jRatingCompat = RatingCompat();
        if (MediaBrowserCompatItemReceiver() > 0) {
            iMin = Math.min(this.AudioAttributesImplApi26Parcelizer, this.IconCompatParcelizer - ((int) (jRatingCompat - j4)));
        } else {
            iMin = this.AudioAttributesImplApi26Parcelizer;
        }
        SampleVideos<getShowPopup>[] sampleVideosArr = getFirstBufferDurationMs.read;
        long j5 = ((long) this.AudioAttributesImplApi26Parcelizer) + jRatingCompat;
        if (iMin > 0) {
            sampleVideosArr = new SampleVideos[iMin];
            Object[] objArr = this.RemoteActionCompatParcelizer;
            toMagicModuleMetaRepoModel.write(objArr);
            long j6 = jRatingCompat;
            while (true) {
                if (jRatingCompat >= j5) {
                    j2 = j4;
                    break;
                }
                Object objWrite = getThemeState.write(objArr, jRatingCompat);
                j2 = j4;
                if (objWrite != getThemeState.read) {
                    toMagicModuleMetaRepoModel.read(objWrite, "");
                    read readVar = (read) objWrite;
                    int i2 = i + 1;
                    sampleVideosArr[i] = readVar.RemoteActionCompatParcelizer;
                    getThemeState.IconCompatParcelizer(objArr, jRatingCompat, getThemeState.read);
                    getThemeState.IconCompatParcelizer(objArr, j6, readVar.IconCompatParcelizer);
                    j3 = 1;
                    j6++;
                    if (i2 >= iMin) {
                        break;
                    }
                    i = i2;
                } else {
                    j3 = 1;
                }
                jRatingCompat += j3;
                j4 = j2;
            }
            jRatingCompat = j6;
        } else {
            j2 = j4;
        }
        long j7 = jRatingCompat;
        SampleVideos<getShowPopup>[] sampleVideosArr2 = sampleVideosArr;
        int i3 = (int) (j7 - jMediaMetadataCompat);
        if (MediaBrowserCompatItemReceiver() == 0) {
            j2 = j7;
        }
        long jMax = Math.max(this.MediaBrowserCompatItemReceiver, j7 - ((long) Math.min(this.AudioAttributesImplBaseParcelizer, i3)));
        if (this.IconCompatParcelizer == 0 && jMax < j5) {
            Object[] objArr2 = this.RemoteActionCompatParcelizer;
            toMagicModuleMetaRepoModel.write(objArr2);
            if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(getThemeState.write(objArr2, jMax), getThemeState.read)) {
                j7++;
                jMax++;
            }
        }
        write(jMax, j2, j7, j5);
        MediaDescriptionCompat();
        return sampleVideosArr2.length == 0 ? sampleVideosArr2 : write(sampleVideosArr2);
    }

    private final void write(long j, long j2, long j3, long j4) {
        long jMin = Math.min(j2, j);
        getCollegeId.write();
        for (long jMediaMetadataCompat = MediaMetadataCompat(); jMediaMetadataCompat < jMin; jMediaMetadataCompat++) {
            Object[] objArr = this.RemoteActionCompatParcelizer;
            toMagicModuleMetaRepoModel.write(objArr);
            getThemeState.IconCompatParcelizer(objArr, jMediaMetadataCompat, null);
        }
        this.MediaBrowserCompatItemReceiver = j;
        this.read = j2;
        this.write = (int) (j3 - jMin);
        this.AudioAttributesImplApi26Parcelizer = (int) (j4 - j3);
        getCollegeId.write();
        getCollegeId.write();
        getCollegeId.write();
    }

    private final void MediaDescriptionCompat() {
        if (this.IconCompatParcelizer != 0 || this.AudioAttributesImplApi26Parcelizer > 1) {
            Object[] objArr = this.RemoteActionCompatParcelizer;
            toMagicModuleMetaRepoModel.write(objArr);
            while (this.AudioAttributesImplApi26Parcelizer > 0 && getThemeState.write(objArr, (MediaMetadataCompat() + ((long) MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver())) - 1) == getThemeState.read) {
                this.AudioAttributesImplApi26Parcelizer--;
                getThemeState.IconCompatParcelizer(objArr, MediaMetadataCompat() + ((long) MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver()), null);
            }
        }
    }

    private final Object RemoteActionCompatParcelizer(getHasMultipleThemes gethasmultiplethemes) {
        Object obj;
        SampleVideos<getShowPopup>[] sampleVideosArr = getFirstBufferDurationMs.read;
        synchronized (this) {
            long jWrite = write(gethasmultiplethemes);
            if (jWrite < 0) {
                obj = getThemeState.read;
            } else {
                long j = gethasmultiplethemes.AudioAttributesCompatParcelizer;
                Object objRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(jWrite);
                gethasmultiplethemes.AudioAttributesCompatParcelizer = jWrite + 1;
                sampleVideosArr = read(j);
                obj = objRemoteActionCompatParcelizer;
            }
        }
        for (SampleVideos<getShowPopup> sampleVideos : sampleVideosArr) {
            if (sampleVideos != null) {
                C0177getRfBanners.IconCompatParcelizer iconCompatParcelizer = C0177getRfBanners.IconCompatParcelizer;
                sampleVideos.resumeWith(C0177getRfBanners.read(getShowPopup.INSTANCE));
            }
        }
        return obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long write(getHasMultipleThemes gethasmultiplethemes) {
        long j = gethasmultiplethemes.AudioAttributesCompatParcelizer;
        if (j < RatingCompat() || (this.IconCompatParcelizer <= 0 && j <= MediaMetadataCompat() && this.AudioAttributesImplApi26Parcelizer != 0)) {
            return j;
        }
        return -1L;
    }

    private final Object RemoteActionCompatParcelizer(long j) {
        Object[] objArr = this.RemoteActionCompatParcelizer;
        toMagicModuleMetaRepoModel.write(objArr);
        Object objWrite = getThemeState.write(objArr, j);
        return objWrite instanceof read ? ((read) objWrite).IconCompatParcelizer : objWrite;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [o.SampleVideos<o.getShowPopup>[]] */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v10 */
    /* JADX WARN: Type inference failed for: r11v3, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r11v7 */
    /* JADX WARN: Type inference failed for: r11v8 */
    /* JADX WARN: Type inference failed for: r11v9 */
    /* JADX WARN: Type inference failed for: r6v3 */
    public final SampleVideos<getShowPopup>[] write(SampleVideos<getShowPopup>[] sampleVideosArr) {
        getDecoderName[] getdecodernameArr;
        getHasMultipleThemes gethasmultiplethemes;
        SampleVideos<? super getShowPopup> sampleVideos;
        int length = sampleVideosArr.length;
        ThemeStateCompanion<T> themeStateCompanion = this;
        if (((TimelineCreator) themeStateCompanion).AudioAttributesCompatParcelizer != 0 && (getdecodernameArr = ((TimelineCreator) themeStateCompanion).RemoteActionCompatParcelizer) != null) {
            int length2 = getdecodernameArr.length;
            int i = 0;
            sampleVideosArr = sampleVideosArr;
            while (i < length2) {
                getDecoderName getdecodername = getdecodernameArr[i];
                if (getdecodername != null && (sampleVideos = (gethasmultiplethemes = (getHasMultipleThemes) getdecodername).read) != null && write(gethasmultiplethemes) >= 0) {
                    int length3 = sampleVideosArr.length;
                    sampleVideosArr = sampleVideosArr;
                    if (length >= length3) {
                        Object[] objArrCopyOf = Arrays.copyOf((Object[]) sampleVideosArr, Math.max(2, sampleVideosArr.length << 1));
                        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(objArrCopyOf, "");
                        sampleVideosArr = objArrCopyOf;
                    }
                    ((SampleVideos[]) sampleVideosArr)[length] = sampleVideos;
                    gethasmultiplethemes.read = null;
                    length++;
                }
                i++;
                sampleVideosArr = sampleVideosArr;
            }
        }
        return (SampleVideos[]) sampleVideosArr;
    }

    private static getHasMultipleThemes onCommand() {
        return new getHasMultipleThemes();
    }

    private static getHasMultipleThemes[] write(int i) {
        return new getHasMultipleThemes[2];
    }

    @Override // kotlin.getPbConfig
    public final NewNumberOtpResendRequest<T> write(CurrentQuery currentQuery, int i, setAddressLine2 setaddressline2) {
        return getThemeState.write(this, currentQuery, i, setaddressline2);
    }

    static final class read implements setYearOfPassout {
        private ThemeStateCompanion<?> AudioAttributesCompatParcelizer;
        public final Object IconCompatParcelizer;
        public final SampleVideos<getShowPopup> RemoteActionCompatParcelizer;
        public long write;

        /* JADX WARN: Multi-variable type inference failed */
        public read(ThemeStateCompanion<?> themeStateCompanion, long j, Object obj, SampleVideos<? super getShowPopup> sampleVideos) {
            this.AudioAttributesCompatParcelizer = themeStateCompanion;
            this.write = j;
            this.IconCompatParcelizer = obj;
            this.RemoteActionCompatParcelizer = sampleVideos;
        }

        @Override // kotlin.setYearOfPassout
        public final void write() {
            this.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(this);
        }
    }

    @Override // kotlin.isDark
    public final List<T> bm_() {
        synchronized (this) {
            int iHandleMediaPlayPauseIfPendingOnHandler = handleMediaPlayPauseIfPendingOnHandler();
            if (iHandleMediaPlayPauseIfPendingOnHandler == 0) {
                return IntermediateLoginResponseBody.RemoteActionCompatParcelizer();
            }
            ArrayList arrayList = new ArrayList(iHandleMediaPlayPauseIfPendingOnHandler);
            Object[] objArr = this.RemoteActionCompatParcelizer;
            toMagicModuleMetaRepoModel.write(objArr);
            for (int i = 0; i < iHandleMediaPlayPauseIfPendingOnHandler; i++) {
                arrayList.add(getThemeState.write(objArr, this.MediaBrowserCompatItemReceiver + ((long) i)));
            }
            return arrayList;
        }
    }

    private final Object read(T t, SampleVideos<? super getShowPopup> sampleVideos) {
        SampleVideos<getShowPopup>[] sampleVideosArrWrite;
        read readVar;
        setStateSolvedCount setstatesolvedcount = new setStateSolvedCount(getYear.IconCompatParcelizer(sampleVideos), 1);
        setstatesolvedcount.MediaBrowserCompatCustomActionResultReceiver();
        setStateSolvedCount setstatesolvedcount2 = setstatesolvedcount;
        SampleVideos<getShowPopup>[] sampleVideosArrWrite2 = getFirstBufferDurationMs.read;
        synchronized (this) {
            try {
                if (read(t)) {
                    C0177getRfBanners.IconCompatParcelizer iconCompatParcelizer = C0177getRfBanners.IconCompatParcelizer;
                    setstatesolvedcount2.resumeWith(C0177getRfBanners.read(getShowPopup.INSTANCE));
                    sampleVideosArrWrite = write(sampleVideosArrWrite2);
                    readVar = null;
                } else {
                    read readVar2 = new read(this, ((long) MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver()) + MediaMetadataCompat(), t, setstatesolvedcount2);
                    AudioAttributesCompatParcelizer(readVar2);
                    this.AudioAttributesImplApi26Parcelizer++;
                    if (this.IconCompatParcelizer == 0) {
                        sampleVideosArrWrite2 = write(sampleVideosArrWrite2);
                    }
                    sampleVideosArrWrite = sampleVideosArrWrite2;
                    readVar = readVar2;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (readVar != null) {
            setStatePercentile.AudioAttributesCompatParcelizer(setstatesolvedcount2, readVar);
        }
        for (SampleVideos<getShowPopup> sampleVideos2 : sampleVideosArrWrite) {
            if (sampleVideos2 != null) {
                C0177getRfBanners.IconCompatParcelizer iconCompatParcelizer2 = C0177getRfBanners.IconCompatParcelizer;
                sampleVideos2.resumeWith(C0177getRfBanners.read(getShowPopup.INSTANCE));
            }
        }
        Object objAudioAttributesCompatParcelizer = setstatesolvedcount.AudioAttributesCompatParcelizer();
        if (objAudioAttributesCompatParcelizer == getYear.IconCompatParcelizer()) {
            getAnsweredMcqCount.write(sampleVideos);
        }
        return objAudioAttributesCompatParcelizer == getYear.IconCompatParcelizer() ? objAudioAttributesCompatParcelizer : getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void RemoteActionCompatParcelizer(read readVar) {
        synchronized (this) {
            if (readVar.write < MediaMetadataCompat()) {
                return;
            }
            Object[] objArr = this.RemoteActionCompatParcelizer;
            toMagicModuleMetaRepoModel.write(objArr);
            if (getThemeState.write(objArr, readVar.write) != readVar) {
                return;
            }
            getThemeState.IconCompatParcelizer(objArr, readVar.write, getThemeState.read);
            MediaDescriptionCompat();
            getShowPopup getshowpopup = getShowPopup.INSTANCE;
        }
    }

    private final Object RemoteActionCompatParcelizer(getHasMultipleThemes gethasmultiplethemes, SampleVideos<? super getShowPopup> sampleVideos) {
        setStateSolvedCount setstatesolvedcount = new setStateSolvedCount(getYear.IconCompatParcelizer(sampleVideos), 1);
        setstatesolvedcount.MediaBrowserCompatCustomActionResultReceiver();
        setStateSolvedCount setstatesolvedcount2 = setstatesolvedcount;
        synchronized (this) {
            if (write(gethasmultiplethemes) < 0) {
                gethasmultiplethemes.read = setstatesolvedcount2;
                gethasmultiplethemes.read = setstatesolvedcount2;
            } else {
                C0177getRfBanners.IconCompatParcelizer iconCompatParcelizer = C0177getRfBanners.IconCompatParcelizer;
                setstatesolvedcount2.resumeWith(C0177getRfBanners.read(getShowPopup.INSTANCE));
            }
            getShowPopup getshowpopup = getShowPopup.INSTANCE;
        }
        Object objAudioAttributesCompatParcelizer = setstatesolvedcount.AudioAttributesCompatParcelizer();
        if (objAudioAttributesCompatParcelizer == getYear.IconCompatParcelizer()) {
            getAnsweredMcqCount.write(sampleVideos);
        }
        return objAudioAttributesCompatParcelizer == getYear.IconCompatParcelizer() ? objAudioAttributesCompatParcelizer : getShowPopup.INSTANCE;
    }

    @Override // kotlin.ThemeState
    public final void AudioAttributesCompatParcelizer() {
        synchronized (this) {
            write(RatingCompat(), this.read, RatingCompat(), MediaBrowserCompatSearchResultReceiver());
            getShowPopup getshowpopup = getShowPopup.INSTANCE;
        }
    }

    @Override // kotlin.isDark, kotlin.NewNumberOtpResendRequest
    public final Object write(getValidationToken<? super T> getvalidationtoken, SampleVideos<?> sampleVideos) {
        return write(this, getvalidationtoken, sampleVideos);
    }

    @Override // kotlin.ThemeState, kotlin.getValidationToken
    public Object IconCompatParcelizer(T t, SampleVideos<? super getShowPopup> sampleVideos) {
        return RemoteActionCompatParcelizer(this, t, sampleVideos);
    }
}
