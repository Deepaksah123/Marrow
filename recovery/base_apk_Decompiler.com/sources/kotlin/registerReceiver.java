package kotlin;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.MagicModuleUseCaseImplWhenMappings;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001BO\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\n0\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0011\u0010\u0016\u001a\u00020\u0015*\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0011\u0010\u0016\u001a\u00020\u0015*\u00020\u0015¢\u0006\u0004\b\u0016\u0010\u0018J\u0011\u0010\u0019\u001a\u00020\u0014*\u00020\u0015¢\u0006\u0004\b\u0019\u0010\u001aJ\u0011\u0010\u001b\u001a\u00020\u0014*\u00020\u0015¢\u0006\u0004\b\u001b\u0010\u001aJ\u0011\u0010\u0019\u001a\u00020\u001c*\u00020\u0014¢\u0006\u0004\b\u0019\u0010\u0017J\u0013\u0010\u001d\u001a\u00020\u0014*\u00020\u001cH\u0002¢\u0006\u0004\b\u001d\u0010\u001aJ\u0013\u0010\u001e\u001a\u00020\u001c*\u00020\u001cH\u0002¢\u0006\u0004\b\u001e\u0010\u0018J\u001b\u0010\u001f\u001a\u00020\u001c*\u00020\u001c2\u0006\u0010\u0003\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u001f\u0010 J\u0011\u0010\u001b\u001a\u00020\u0014*\u00020\u0014¢\u0006\u0004\b\u001b\u0010!J\u0011\u0010\u001f\u001a\u00020\u0015*\u00020\u0015¢\u0006\u0004\b\u001f\u0010\u0018J#\u0010\u0016\u001a\u00020\u0015*\u00020\"2\u0006\u0010\u0003\u001a\u00020\u00152\u0006\u0010\u0005\u001a\u00020#H\u0002¢\u0006\u0004\b\u0016\u0010$J\u0017\u0010%\u001a\u00020\u00152\u0006\u0010\u0003\u001a\u00020\u0015H\u0016¢\u0006\u0004\b%\u0010\u0018J\u0017\u0010&\u001a\u00020\u00152\u0006\u0010\u0003\u001a\u00020\u0015H\u0002¢\u0006\u0004\b&\u0010\u0018J \u0010\u0019\u001a\u00020'2\u0006\u0010\u0003\u001a\u00020\u001c2\u0006\u0010\u0005\u001a\u00020\nH\u0086@¢\u0006\u0004\b\u0019\u0010(J\u0018\u0010%\u001a\u00020\u001c2\u0006\u0010\u0003\u001a\u00020\u001cH\u0096@¢\u0006\u0004\b%\u0010)J\r\u0010\u0019\u001a\u00020\n¢\u0006\u0004\b\u0019\u0010*J<\u0010\u001b\u001a\u00020'2\u0006\u0010\u0003\u001a\u00020+2\"\u0010\u0005\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020-\u0012\n\u0012\b\u0012\u0004\u0012\u00020'0.\u0012\u0006\u0012\u0004\u0018\u00010/0,H\u0086@¢\u0006\u0004\b\u001b\u00100J?\u0010\u001f\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00042\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u001f\u00101J\r\u0010\u001f\u001a\u00020\n¢\u0006\u0004\b\u001f\u0010*R\u001c\u0010\u0016\u001a\u00020\u00028\u0007@\u0006X\u0086\f¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b%\u00104R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b&\u00105R\u0016\u0010%\u001a\u00020\u00068\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u001b\u00106R\u0016\u0010\u001f\u001a\u00020\b8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u001d\u00107R\u0016\u0010\u0019\u001a\u00020\n8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b8\u00109R\u0016\u0010\u001e\u001a\u00020\f8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010:R\u0016\u0010&\u001a\u00020\u000e8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010;R\u001a\u0010=\u001a\b\u0012\u0004\u0012\u00020\n0\u00108\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010<R$\u0010>\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\n8\u0017@RX\u0097\u000e¢\u0006\f\n\u0004\b\u0016\u00109\u001a\u0004\b\u001b\u0010*R\u0016\u0010\u001d\u001a\u00020#8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b%\u0010?R\u0016\u0010A\u001a\u00020\"8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b>\u0010@R\u0014\u00102\u001a\u00020B8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b=\u0010CR \u00108\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00150D8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bA\u0010ER\u0014\u0010F\u001a\u00020\n8CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010*"}, d2 = {"Lo/registerReceiver;", "Lo/createDeviceProtectedStorageContext;", "Lo/getNoBackupFilesDir;", "p0", "Lo/setLastHorizontalStyle;", "p1", "Lo/CoordinatorLayout;", "p2", "Lo/superDispatchKeyEvent;", "p3", "", "p4", "Lo/reportBadDefinition;", "p5", "Lo/putExtraData;", "p6", "Lkotlin/Function0;", "p7", "<init>", "(Lo/getNoBackupFilesDir;Lo/setLastHorizontalStyle;Lo/CoordinatorLayout;Lo/superDispatchKeyEvent;ZLo/reportBadDefinition;Lo/putExtraData;Lo/getCreatedOnDateMs;)V", "", "Lo/getReferencedType;", "RemoteActionCompatParcelizer", "(F)J", "(J)J", "IconCompatParcelizer", "(J)F", "read", "Lo/UnsupportedTypeDeserializer;", "MediaBrowserCompatCustomActionResultReceiver", "AudioAttributesImplApi21Parcelizer", "write", "(JF)J", "(F)F", "Lo/checkSelfPermission;", "Lo/findCoercionAction;", "(Lo/checkSelfPermission;JI)J", "AudioAttributesCompatParcelizer", "AudioAttributesImplBaseParcelizer", "", "(JZLo/SampleVideos;)Ljava/lang/Object;", "(JLo/SampleVideos;)Ljava/lang/Object;", "()Z", "Lo/Flow;", "Lkotlin/Function2;", "Lo/shouldSkipDump;", "Lo/SampleVideos;", "", "(Lo/Flow;Lo/MagicModuleSubmissionRequestBody;Lo/SampleVideos;)Ljava/lang/Object;", "(Lo/getNoBackupFilesDir;Lo/superDispatchKeyEvent;Lo/setLastHorizontalStyle;ZLo/CoordinatorLayout;Lo/reportBadDefinition;)Z", "RatingCompat", "Lo/getNoBackupFilesDir;", "()Lo/getNoBackupFilesDir;", "Lo/setLastHorizontalStyle;", "Lo/CoordinatorLayout;", "Lo/superDispatchKeyEvent;", "MediaBrowserCompatSearchResultReceiver", "Z", "Lo/reportBadDefinition;", "Lo/putExtraData;", "Lo/getCreatedOnDateMs;", "AudioAttributesImplApi26Parcelizer", "MediaBrowserCompatItemReceiver", "I", "Lo/checkSelfPermission;", "MediaMetadataCompat", "Lo/registerReceiver$AudioAttributesCompatParcelizer;", "Lo/registerReceiver$AudioAttributesCompatParcelizer;", "Lkotlin/Function1;", "Lo/getAnswerMap;", "MediaBrowserCompatMediaItem"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class registerReceiver implements createDeviceProtectedStorageContext {

    /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: from kotlin metadata */
    private putExtraData AudioAttributesImplBaseParcelizer;

    /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: from kotlin metadata */
    private setLastHorizontalStyle read;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private reportBadDefinition AudioAttributesImplApi21Parcelizer;

    /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from kotlin metadata */
    private superDispatchKeyEvent write;

    /* JADX INFO: renamed from: MediaBrowserCompatSearchResultReceiver, reason: from kotlin metadata */
    private boolean IconCompatParcelizer;

    /* JADX INFO: renamed from: RatingCompat, reason: from kotlin metadata */
    private getNoBackupFilesDir RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private boolean MediaBrowserCompatItemReceiver;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private CoordinatorLayout AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final getCreatedOnDateMs<Boolean> AudioAttributesImplApi26Parcelizer;

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private int MediaBrowserCompatCustomActionResultReceiver = findCoercionAction.INSTANCE.AudioAttributesCompatParcelizer();

    /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: from kotlin metadata */
    private checkSelfPermission MediaMetadataCompat = getColor.RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: from kotlin metadata */
    private final AudioAttributesCompatParcelizer RatingCompat = new AudioAttributesCompatParcelizer();

    /* JADX INFO: renamed from: MediaMetadataCompat, reason: from kotlin metadata */
    private final getAnswerMap<getReferencedType, getReferencedType> MediaBrowserCompatSearchResultReceiver = new getAnswerMap() { // from class: o.startActivity
        @Override // kotlin.getAnswerMap
        public final Object invoke(Object obj) {
            return registerReceiver.IconCompatParcelizer(this.RemoteActionCompatParcelizer, (getReferencedType) obj);
        }
    };

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class RemoteActionCompatParcelizer extends getTotalMcq {
        /* synthetic */ Object IconCompatParcelizer;
        Object RemoteActionCompatParcelizer;
        int write;

        RemoteActionCompatParcelizer(SampleVideos<? super RemoteActionCompatParcelizer> sampleVideos) {
            super(sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            this.IconCompatParcelizer = obj;
            this.write |= Integer.MIN_VALUE;
            return registerReceiver.this.AudioAttributesCompatParcelizer(0L, this);
        }
    }

    public registerReceiver(getNoBackupFilesDir getnobackupfilesdir, setLastHorizontalStyle setlasthorizontalstyle, CoordinatorLayout coordinatorLayout, superDispatchKeyEvent superdispatchkeyevent, boolean z, reportBadDefinition reportbaddefinition, putExtraData putextradata, getCreatedOnDateMs<Boolean> getcreatedondatems) {
        this.RemoteActionCompatParcelizer = getnobackupfilesdir;
        this.read = setlasthorizontalstyle;
        this.AudioAttributesCompatParcelizer = coordinatorLayout;
        this.write = superdispatchkeyevent;
        this.IconCompatParcelizer = z;
        this.AudioAttributesImplApi21Parcelizer = reportbaddefinition;
        this.AudioAttributesImplBaseParcelizer = putextradata;
        this.AudioAttributesImplApi26Parcelizer = getcreatedondatems;
    }

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from getter */
    public final getNoBackupFilesDir getRemoteActionCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    @Override // kotlin.createDeviceProtectedStorageContext
    /* JADX INFO: renamed from: read, reason: from getter */
    public final boolean getMediaBrowserCompatItemReceiver() {
        return this.MediaBrowserCompatItemReceiver;
    }

    public final long RemoteActionCompatParcelizer(float f) {
        if (f == BitmapDescriptorFactory.HUE_RED) {
            return getReferencedType.INSTANCE.write();
        }
        if (this.write == superDispatchKeyEvent.AudioAttributesCompatParcelizer) {
            long j = -1;
            return getReferencedType.AudioAttributesCompatParcelizer((((long) Float.floatToRawIntBits(f)) << 32) | (((long) Float.floatToRawIntBits(BitmapDescriptorFactory.HUE_RED)) & ((((long) 0) << 32) | (j - ((j >> 63) << 32)))));
        }
        long j2 = -1;
        return getReferencedType.AudioAttributesCompatParcelizer((((long) Float.floatToRawIntBits(f)) & ((((long) 0) << 32) | (j2 - ((j2 >> 63) << 32)))) | (((long) Float.floatToRawIntBits(BitmapDescriptorFactory.HUE_RED)) << 32));
    }

    public final long RemoteActionCompatParcelizer(long j) {
        return this.write == superDispatchKeyEvent.AudioAttributesCompatParcelizer ? getReferencedType.read$default(j, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 1, null) : getReferencedType.read$default(j, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 2, null);
    }

    public final float IconCompatParcelizer(long j) {
        long j2;
        if (this.write == superDispatchKeyEvent.AudioAttributesCompatParcelizer) {
            j2 = j >> 32;
        } else {
            long j3 = -1;
            j2 = j & ((((long) 0) << 32) | (j3 - ((j3 >> 63) << 32)));
        }
        return Float.intBitsToFloat((int) j2);
    }

    public final long IconCompatParcelizer(float f) {
        if (f == BitmapDescriptorFactory.HUE_RED) {
            return UnsupportedTypeDeserializer.INSTANCE.write();
        }
        return this.write == superDispatchKeyEvent.AudioAttributesCompatParcelizer ? ValueInjector.read(f, BitmapDescriptorFactory.HUE_RED) : ValueInjector.read(BitmapDescriptorFactory.HUE_RED, f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final float MediaBrowserCompatCustomActionResultReceiver(long j) {
        return this.write == superDispatchKeyEvent.AudioAttributesCompatParcelizer ? UnsupportedTypeDeserializer.read(j) : UnsupportedTypeDeserializer.AudioAttributesCompatParcelizer(j);
    }

    private final long AudioAttributesImplApi21Parcelizer(long j) {
        return this.write == superDispatchKeyEvent.AudioAttributesCompatParcelizer ? UnsupportedTypeDeserializer.write$default(j, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 1, null) : UnsupportedTypeDeserializer.write$default(j, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long write(long j, float f) {
        return this.write == superDispatchKeyEvent.AudioAttributesCompatParcelizer ? UnsupportedTypeDeserializer.write$default(j, f, BitmapDescriptorFactory.HUE_RED, 2, null) : UnsupportedTypeDeserializer.write$default(j, BitmapDescriptorFactory.HUE_RED, f, 1, null);
    }

    public final float read(float f) {
        return this.IconCompatParcelizer ? -f : f;
    }

    public final long write(long j) {
        return this.IconCompatParcelizer ? getReferencedType.read(j, -1.0f) : j;
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\b\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\b\u0010\u0007"}, d2 = {"Lo/registerReceiver$AudioAttributesCompatParcelizer;", "Lo/shouldSkipDump;", "Lo/getReferencedType;", "p0", "Lo/findCoercionAction;", "p1", "write", "(JI)J", "RemoteActionCompatParcelizer"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class AudioAttributesCompatParcelizer implements shouldSkipDump {
        AudioAttributesCompatParcelizer() {
        }

        @Override // kotlin.shouldSkipDump
        public final long write(long p0, int p1) {
            return registerReceiver.this.RemoteActionCompatParcelizer(registerReceiver.this.MediaMetadataCompat, p0, p1);
        }

        @Override // kotlin.shouldSkipDump
        public final long RemoteActionCompatParcelizer(long p0, int p1) {
            registerReceiver.this.MediaBrowserCompatCustomActionResultReceiver = p1;
            setLastHorizontalStyle setlasthorizontalstyle = registerReceiver.this.read;
            if (setlasthorizontalstyle == null || !registerReceiver.this.RemoteActionCompatParcelizer()) {
                return registerReceiver.this.RemoteActionCompatParcelizer(registerReceiver.this.MediaMetadataCompat, p0, p1);
            }
            return setlasthorizontalstyle.IconCompatParcelizer(p0, registerReceiver.this.MediaBrowserCompatCustomActionResultReceiver, registerReceiver.this.MediaBrowserCompatSearchResultReceiver);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getReferencedType IconCompatParcelizer(registerReceiver registerreceiver, getReferencedType getreferencedtype) {
        return getReferencedType.read(registerreceiver.RemoteActionCompatParcelizer(registerreceiver.MediaMetadataCompat, getreferencedtype.getWrite(), registerreceiver.MediaBrowserCompatCustomActionResultReceiver));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long RemoteActionCompatParcelizer(checkSelfPermission checkselfpermission, long j, int i) {
        long jAudioAttributesCompatParcelizer = this.AudioAttributesImplApi21Parcelizer.AudioAttributesCompatParcelizer(j, i);
        long jAudioAttributesCompatParcelizer2 = getReferencedType.AudioAttributesCompatParcelizer(j, jAudioAttributesCompatParcelizer);
        long jWrite = write(RemoteActionCompatParcelizer(checkselfpermission.IconCompatParcelizer(IconCompatParcelizer(write(RemoteActionCompatParcelizer(jAudioAttributesCompatParcelizer2))))));
        this.AudioAttributesImplBaseParcelizer.read(jWrite);
        return getReferencedType.RemoteActionCompatParcelizer(getReferencedType.RemoteActionCompatParcelizer(jAudioAttributesCompatParcelizer, jWrite), this.AudioAttributesImplApi21Parcelizer.read(jWrite, getReferencedType.AudioAttributesCompatParcelizer(jAudioAttributesCompatParcelizer2, jWrite), i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean RemoteActionCompatParcelizer() {
        return this.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer() || this.RemoteActionCompatParcelizer.read();
    }

    @Override // kotlin.createDeviceProtectedStorageContext
    public final long AudioAttributesCompatParcelizer(long p0) {
        if (this.RemoteActionCompatParcelizer.AudioAttributesImplApi26Parcelizer()) {
            return getReferencedType.INSTANCE.write();
        }
        return AudioAttributesImplBaseParcelizer(p0);
    }

    private final long AudioAttributesImplBaseParcelizer(long p0) {
        return RemoteActionCompatParcelizer(read(this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(read(IconCompatParcelizer(p0)))));
    }

    public final Object IconCompatParcelizer(long j, boolean z, SampleVideos<? super getShowPopup> sampleVideos) {
        if (z && !getColor.read(this.AudioAttributesCompatParcelizer)) {
            return getShowPopup.INSTANCE;
        }
        long jAudioAttributesImplApi21Parcelizer = AudioAttributesImplApi21Parcelizer(j);
        IconCompatParcelizer iconCompatParcelizer = new IconCompatParcelizer(null);
        setLastHorizontalStyle setlasthorizontalstyle = this.read;
        if (setlasthorizontalstyle != null && RemoteActionCompatParcelizer()) {
            Object objIconCompatParcelizer = setlasthorizontalstyle.IconCompatParcelizer(jAudioAttributesImplApi21Parcelizer, iconCompatParcelizer, sampleVideos);
            return objIconCompatParcelizer == getYear.IconCompatParcelizer() ? objIconCompatParcelizer : getShowPopup.INSTANCE;
        }
        Object objInvoke = iconCompatParcelizer.invoke(UnsupportedTypeDeserializer.RemoteActionCompatParcelizer(jAudioAttributesImplApi21Parcelizer), sampleVideos);
        return objInvoke == getYear.IconCompatParcelizer() ? objInvoke : getShowPopup.INSTANCE;
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", "Landroidx/compose/ui/unit/Velocity;", "velocity"}, k = 3, mv = {2, 0, 0}, xi = 48)
    static final class IconCompatParcelizer extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<UnsupportedTypeDeserializer, SampleVideos<? super UnsupportedTypeDeserializer>, Object> {
        int AudioAttributesCompatParcelizer;
        long RemoteActionCompatParcelizer;
        /* synthetic */ long write;

        /* JADX WARN: Removed duplicated region for block: B:20:0x0094  */
        @Override // kotlin.getMonthName
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r19) {
            /*
                r18 = this;
                r0 = r18
                java.lang.Object r1 = kotlin.getYear.IconCompatParcelizer()
                int r2 = r0.AudioAttributesCompatParcelizer
                r3 = 3
                r4 = 2
                r5 = 1
                if (r2 == 0) goto L3d
                if (r2 == r5) goto L35
                if (r2 == r4) goto L26
                if (r2 != r3) goto L1e
                long r1 = r0.RemoteActionCompatParcelizer
                long r3 = r0.write
                kotlin.SdkPayloadData.IconCompatParcelizer(r19)
                r0 = r19
                goto L96
            L1e:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
                r0.<init>(r1)
                throw r0
            L26:
                long r4 = r0.RemoteActionCompatParcelizer
                long r6 = r0.write
                kotlin.SdkPayloadData.IconCompatParcelizer(r19)
                r2 = r19
                r16 = r4
                r5 = r6
                r7 = r16
                goto L71
            L35:
                long r5 = r0.write
                kotlin.SdkPayloadData.IconCompatParcelizer(r19)
                r2 = r19
                goto L56
            L3d:
                kotlin.SdkPayloadData.IconCompatParcelizer(r19)
                long r6 = r0.write
                o.registerReceiver r2 = kotlin.registerReceiver.this
                o.reportBadDefinition r2 = kotlin.registerReceiver.IconCompatParcelizer(r2)
                r8 = r0
                o.SampleVideos r8 = (kotlin.SampleVideos) r8
                r0.write = r6
                r0.AudioAttributesCompatParcelizer = r5
                java.lang.Object r2 = r2.RemoteActionCompatParcelizer(r6, r8)
                if (r2 == r1) goto La9
                r5 = r6
            L56:
                o.UnsupportedTypeDeserializer r2 = (kotlin.UnsupportedTypeDeserializer) r2
                long r7 = r2.getIconCompatParcelizer()
                long r7 = kotlin.UnsupportedTypeDeserializer.RemoteActionCompatParcelizer(r5, r7)
                o.registerReceiver r2 = kotlin.registerReceiver.this
                r9 = r0
                o.SampleVideos r9 = (kotlin.SampleVideos) r9
                r0.write = r5
                r0.RemoteActionCompatParcelizer = r7
                r0.AudioAttributesCompatParcelizer = r4
                java.lang.Object r2 = r2.AudioAttributesCompatParcelizer(r7, r9)
                if (r2 == r1) goto La9
            L71:
                o.UnsupportedTypeDeserializer r2 = (kotlin.UnsupportedTypeDeserializer) r2
                long r14 = r2.getIconCompatParcelizer()
                o.registerReceiver r2 = kotlin.registerReceiver.this
                o.reportBadDefinition r9 = kotlin.registerReceiver.IconCompatParcelizer(r2)
                long r10 = kotlin.UnsupportedTypeDeserializer.RemoteActionCompatParcelizer(r7, r14)
                r2 = r0
                o.SampleVideos r2 = (kotlin.SampleVideos) r2
                r0.write = r5
                r0.RemoteActionCompatParcelizer = r14
                r0.AudioAttributesCompatParcelizer = r3
                r12 = r14
                r3 = r14
                r14 = r2
                java.lang.Object r0 = r9.write(r10, r12, r14)
                if (r0 != r1) goto L94
                goto La9
            L94:
                r1 = r3
                r3 = r5
            L96:
                o.UnsupportedTypeDeserializer r0 = (kotlin.UnsupportedTypeDeserializer) r0
                long r5 = r0.getIconCompatParcelizer()
                long r0 = kotlin.UnsupportedTypeDeserializer.RemoteActionCompatParcelizer(r1, r5)
                long r0 = kotlin.UnsupportedTypeDeserializer.RemoteActionCompatParcelizer(r3, r0)
                o.UnsupportedTypeDeserializer r0 = kotlin.UnsupportedTypeDeserializer.RemoteActionCompatParcelizer(r0)
                return r0
            La9:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: o.registerReceiver.IconCompatParcelizer.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        IconCompatParcelizer(SampleVideos<? super IconCompatParcelizer> sampleVideos) {
            super(2, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            IconCompatParcelizer iconCompatParcelizer = registerReceiver.this.new IconCompatParcelizer(sampleVideos);
            iconCompatParcelizer.write = ((UnsupportedTypeDeserializer) obj).getIconCompatParcelizer();
            return iconCompatParcelizer;
        }

        @Override // kotlin.MagicModuleSubmissionRequestBody
        public final /* synthetic */ Object invoke(UnsupportedTypeDeserializer unsupportedTypeDeserializer, SampleVideos<? super UnsupportedTypeDeserializer> sampleVideos) {
            return write(unsupportedTypeDeserializer.getIconCompatParcelizer(), sampleVideos);
        }

        public final Object write(long j, SampleVideos<? super UnsupportedTypeDeserializer> sampleVideos) {
            return ((IconCompatParcelizer) create(UnsupportedTypeDeserializer.RemoteActionCompatParcelizer(j), sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /* JADX WARN: Type inference failed for: r12v3, types: [java.lang.Object, o.UnsupportedTypeDeserializer] */
    @Override // kotlin.createDeviceProtectedStorageContext
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object AudioAttributesCompatParcelizer(long r13, kotlin.SampleVideos<? super kotlin.UnsupportedTypeDeserializer> r15) {
        /*
            r12 = this;
            boolean r0 = r15 instanceof o.registerReceiver.RemoteActionCompatParcelizer
            if (r0 == 0) goto L14
            r0 = r15
            o.registerReceiver$RemoteActionCompatParcelizer r0 = (o.registerReceiver.RemoteActionCompatParcelizer) r0
            int r1 = r0.write
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r15 = r0.write
            int r15 = r15 + r2
            r0.write = r15
            goto L19
        L14:
            o.registerReceiver$RemoteActionCompatParcelizer r0 = new o.registerReceiver$RemoteActionCompatParcelizer
            r0.<init>(r15)
        L19:
            java.lang.Object r15 = r0.IconCompatParcelizer
            java.lang.Object r1 = kotlin.getYear.IconCompatParcelizer()
            int r2 = r0.write
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L39
            if (r2 != r4) goto L31
            java.lang.Object r13 = r0.RemoteActionCompatParcelizer
            o.MagicModuleUseCaseImplWhenMappings$read r13 = (o.MagicModuleUseCaseImplWhenMappings.read) r13
            kotlin.SdkPayloadData.IconCompatParcelizer(r15)     // Catch: java.lang.Throwable -> L2f
            goto L5f
        L2f:
            r13 = move-exception
            goto L68
        L31:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L39:
            kotlin.SdkPayloadData.IconCompatParcelizer(r15)
            o.MagicModuleUseCaseImplWhenMappings$read r15 = new o.MagicModuleUseCaseImplWhenMappings$read
            r15.<init>()
            r15.IconCompatParcelizer = r13
            r12.MediaBrowserCompatItemReceiver = r4
            o.Flow r2 = kotlin.Flow.read     // Catch: java.lang.Throwable -> L2f
            o.registerReceiver$read r11 = new o.registerReceiver$read     // Catch: java.lang.Throwable -> L2f
            r10 = 0
            r5 = r11
            r6 = r12
            r7 = r15
            r8 = r13
            r5.<init>(r7, r8, r10)     // Catch: java.lang.Throwable -> L2f
            o.MagicModuleSubmissionRequestBody r11 = (kotlin.MagicModuleSubmissionRequestBody) r11     // Catch: java.lang.Throwable -> L2f
            r0.RemoteActionCompatParcelizer = r15     // Catch: java.lang.Throwable -> L2f
            r0.write = r4     // Catch: java.lang.Throwable -> L2f
            java.lang.Object r13 = r12.read(r2, r11, r0)     // Catch: java.lang.Throwable -> L2f
            if (r13 != r1) goto L5e
            return r1
        L5e:
            r13 = r15
        L5f:
            r12.MediaBrowserCompatItemReceiver = r3
            long r12 = r13.IconCompatParcelizer
            o.UnsupportedTypeDeserializer r12 = kotlin.UnsupportedTypeDeserializer.RemoteActionCompatParcelizer(r12)
            return r12
        L68:
            r12.MediaBrowserCompatItemReceiver = r3
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.registerReceiver.AudioAttributesCompatParcelizer(long, o.SampleVideos):java.lang.Object");
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Landroidx/compose/foundation/gestures/NestedScrollScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    static final class read extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<shouldSkipDump, SampleVideos<? super getShowPopup>, Object> {
        long AudioAttributesCompatParcelizer;
        private /* synthetic */ Object AudioAttributesImplApi21Parcelizer;
        final /* synthetic */ long IconCompatParcelizer;
        int MediaBrowserCompatCustomActionResultReceiver;
        Object RemoteActionCompatParcelizer;
        final /* synthetic */ MagicModuleUseCaseImplWhenMappings.read read;
        Object write;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            registerReceiver registerreceiver;
            MagicModuleUseCaseImplWhenMappings.read readVar;
            long j;
            registerReceiver registerreceiver2;
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.MediaBrowserCompatCustomActionResultReceiver;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                IconCompatParcelizer iconCompatParcelizer = new IconCompatParcelizer(registerReceiver.this, (shouldSkipDump) this.AudioAttributesImplApi21Parcelizer);
                registerreceiver = registerReceiver.this;
                MagicModuleUseCaseImplWhenMappings.read readVar2 = this.read;
                long j2 = this.IconCompatParcelizer;
                CoordinatorLayout coordinatorLayout = registerreceiver.AudioAttributesCompatParcelizer;
                long j3 = readVar2.IconCompatParcelizer;
                float f = registerreceiver.read(registerreceiver.MediaBrowserCompatCustomActionResultReceiver(j2));
                this.AudioAttributesImplApi21Parcelizer = registerreceiver;
                this.write = registerreceiver;
                this.RemoteActionCompatParcelizer = readVar2;
                this.AudioAttributesCompatParcelizer = j3;
                this.MediaBrowserCompatCustomActionResultReceiver = 1;
                Object objAudioAttributesCompatParcelizer = coordinatorLayout.AudioAttributesCompatParcelizer(iconCompatParcelizer, f, this);
                if (objAudioAttributesCompatParcelizer == objIconCompatParcelizer) {
                    return objIconCompatParcelizer;
                }
                readVar = readVar2;
                j = j3;
                obj = objAudioAttributesCompatParcelizer;
                registerreceiver2 = registerreceiver;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                j = this.AudioAttributesCompatParcelizer;
                readVar = (MagicModuleUseCaseImplWhenMappings.read) this.RemoteActionCompatParcelizer;
                registerreceiver = (registerReceiver) this.write;
                registerreceiver2 = (registerReceiver) this.AudioAttributesImplApi21Parcelizer;
                SdkPayloadData.IconCompatParcelizer(obj);
            }
            readVar.IconCompatParcelizer = registerreceiver.write(j, registerreceiver2.read(((Number) obj).floatValue()));
            return getShowPopup.INSTANCE;
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lo/registerReceiver$read$IconCompatParcelizer;", "Lo/checkSelfPermission;", "", "p0", "IconCompatParcelizer", "(F)F"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class IconCompatParcelizer implements checkSelfPermission {
            final /* synthetic */ shouldSkipDump IconCompatParcelizer;
            final /* synthetic */ registerReceiver RemoteActionCompatParcelizer;

            IconCompatParcelizer(registerReceiver registerreceiver, shouldSkipDump shouldskipdump) {
                this.RemoteActionCompatParcelizer = registerreceiver;
                this.IconCompatParcelizer = shouldskipdump;
            }

            @Override // kotlin.checkSelfPermission
            public final float IconCompatParcelizer(float p0) {
                if (Math.abs(p0) != BitmapDescriptorFactory.HUE_RED && !((Boolean) this.RemoteActionCompatParcelizer.AudioAttributesImplApi26Parcelizer.invoke()).booleanValue()) {
                    throw new setAttributeId();
                }
                registerReceiver registerreceiver = this.RemoteActionCompatParcelizer;
                return registerreceiver.read(registerreceiver.IconCompatParcelizer(this.IconCompatParcelizer.RemoteActionCompatParcelizer(registerreceiver.write(registerreceiver.RemoteActionCompatParcelizer(p0)), findCoercionAction.INSTANCE.write())));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        read(MagicModuleUseCaseImplWhenMappings.read readVar, long j, SampleVideos<? super read> sampleVideos) {
            super(2, sampleVideos);
            this.read = readVar;
            this.IconCompatParcelizer = j;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            read readVar = registerReceiver.this.new read(this.read, this.IconCompatParcelizer, sampleVideos);
            readVar.AudioAttributesImplApi21Parcelizer = obj;
            return readVar;
        }

        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
        public final Object invoke(shouldSkipDump shouldskipdump, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((read) create(shouldskipdump, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    public final boolean IconCompatParcelizer() {
        if (this.RemoteActionCompatParcelizer.AudioAttributesImplApi26Parcelizer()) {
            return true;
        }
        setLastHorizontalStyle setlasthorizontalstyle = this.read;
        return setlasthorizontalstyle != null && setlasthorizontalstyle.read();
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Landroidx/compose/foundation/gestures/ScrollScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    static final class write extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<checkSelfPermission, SampleVideos<? super getShowPopup>, Object> {
        int AudioAttributesCompatParcelizer;
        final /* synthetic */ MagicModuleSubmissionRequestBody<shouldSkipDump, SampleVideos<? super getShowPopup>, Object> read;
        private /* synthetic */ Object write;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.AudioAttributesCompatParcelizer;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                registerReceiver.this.MediaMetadataCompat = (checkSelfPermission) this.write;
                MagicModuleSubmissionRequestBody<shouldSkipDump, SampleVideos<? super getShowPopup>, Object> magicModuleSubmissionRequestBody = this.read;
                AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = registerReceiver.this.RatingCompat;
                this.AudioAttributesCompatParcelizer = 1;
                if (magicModuleSubmissionRequestBody.invoke(audioAttributesCompatParcelizer, this) == objIconCompatParcelizer) {
                    return objIconCompatParcelizer;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                SdkPayloadData.IconCompatParcelizer(obj);
            }
            return getShowPopup.INSTANCE;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        write(MagicModuleSubmissionRequestBody<? super shouldSkipDump, ? super SampleVideos<? super getShowPopup>, ? extends Object> magicModuleSubmissionRequestBody, SampleVideos<? super write> sampleVideos) {
            super(2, sampleVideos);
            this.read = magicModuleSubmissionRequestBody;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            write writeVar = registerReceiver.this.new write(this.read, sampleVideos);
            writeVar.write = obj;
            return writeVar;
        }

        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final Object invoke(checkSelfPermission checkselfpermission, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((write) create(checkselfpermission, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    public final Object read(Flow flow, MagicModuleSubmissionRequestBody<? super shouldSkipDump, ? super SampleVideos<? super getShowPopup>, ? extends Object> magicModuleSubmissionRequestBody, SampleVideos<? super getShowPopup> sampleVideos) {
        Object objAudioAttributesCompatParcelizer = this.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer(flow, new write(magicModuleSubmissionRequestBody, null), sampleVideos);
        return objAudioAttributesCompatParcelizer == getYear.IconCompatParcelizer() ? objAudioAttributesCompatParcelizer : getShowPopup.INSTANCE;
    }

    public final boolean write(getNoBackupFilesDir p0, superDispatchKeyEvent p1, setLastHorizontalStyle p2, boolean p3, CoordinatorLayout p4, reportBadDefinition p5) {
        boolean z;
        boolean z2 = true;
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer, p0)) {
            z = false;
        } else {
            this.RemoteActionCompatParcelizer = p0;
            z = true;
        }
        this.read = p2;
        if (this.write != p1) {
            this.write = p1;
            z = true;
        }
        if (this.IconCompatParcelizer != p3) {
            this.IconCompatParcelizer = p3;
        } else {
            z2 = z;
        }
        this.AudioAttributesCompatParcelizer = p4;
        this.AudioAttributesImplApi21Parcelizer = p5;
        return z2;
    }

    public final boolean write() {
        return this.write == superDispatchKeyEvent.write;
    }

    public final float read(long j) {
        long j2 = -1;
        int i = (int) (((((long) 0) << 32) | (j2 - ((j2 >> 63) << 32))) & j);
        int i2 = (int) (j >> 32);
        return ((double) ((float) Math.atan2((double) Math.abs(Float.intBitsToFloat(i)), (double) Math.abs(Float.intBitsToFloat(i2))))) >= 0.7853981633974483d ? this.write == superDispatchKeyEvent.write ? Float.intBitsToFloat(i) : BitmapDescriptorFactory.HUE_RED : this.write == superDispatchKeyEvent.AudioAttributesCompatParcelizer ? Float.intBitsToFloat(i2) : BitmapDescriptorFactory.HUE_RED;
    }
}
