package kotlin;

import android.os.Trace;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.Module;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ5\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000e¢\u0006\u0004\b\b\u0010\u0011J\r\u0010\u0012\u001a\u00020\u0007¢\u0006\u0004\b\u0012\u0010\tJ\u0015\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0013¢\u0006\u0004\b\b\u0010\u0014J\r\u0010\u0015\u001a\u00020\u0007¢\u0006\u0004\b\u0015\u0010\tJA\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0004\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\u00162\u0006\u0010\r\u001a\u00020\u00162\u0006\u0010\u000f\u001a\u00020\u00172\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u00070\u0018¢\u0006\u0004\b\u001b\u0010\u001cJ\u0015\u0010\u001b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u001b\u0010\u001dJ%\u0010\u001e\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u00132\u0006\u0010\r\u001a\u00020\u0013¢\u0006\u0004\b\u001e\u0010\u001fJ\u0015\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0015\u0010\u001dJ\u001f\u0010\u001b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u0013¢\u0006\u0004\b\u001b\u0010 J\u0015\u0010\u001e\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u001e\u0010!J\u0013\u0010\"\u001a\u00020\u0007*\u00020\u0003H\u0002¢\u0006\u0004\b\"\u0010\u001dJ\u0017\u0010#\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b#\u0010\u001dJ\u0017\u0010$\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b$\u0010\u001dJ\u001b\u0010\u001b\u001a\u00020\u0007*\u00020%2\u0006\u0010\u0004\u001a\u00020&H\u0002¢\u0006\u0004\b\u001b\u0010'J\u0013\u0010\u0015\u001a\u00020\u0013*\u00020%H\u0002¢\u0006\u0004\b\u0015\u0010(J\u0013\u0010)\u001a\u00020\n*\u00020\u0003H\u0002¢\u0006\u0004\b)\u0010!J\u0015\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0012\u0010\u001dJ\u0015\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\u001dR\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\"\u0010*R\u001a\u0010\u0015\u001a\u00020+8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b\u001e\u0010.R\u0014\u0010\u001e\u001a\u00020/8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b0\u00101R \u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000703028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\b\u00104R\u0016\u0010\b\u001a\u00020\u00138\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u001b\u00105R\u0016\u0010#\u001a\u00020\u00138\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b$\u00105R\u0016\u0010)\u001a\u00020\u00138\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b#\u00105R\u0018\u0010$\u001a\u0004\u0018\u00010\u00018\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u001e\u00106R\u0016\u0010\"\u001a\u00020\u00168\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b)\u00107R\u001a\u0010,\u001a\b\u0012\u0004\u0012\u00020\u0007038\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0015\u00108R\u0014\u0010:\u001a\u00020&8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0012\u00109"}, d2 = {"Lo/getAttributes;", "", "Lo/setExpandedActionViewsExclusive;", "Lo/_assertNotNull;", "p0", "<init>", "(Lo/setExpandedActionViewsExclusive;)V", "", "AudioAttributesCompatParcelizer", "()V", "Lo/hasReferringProperties;", "p1", "Lo/resetWithShared;", "p2", "", "p3", "p4", "(JJ[FII)V", "IconCompatParcelizer", "", "(Z)V", "read", "", "Lo/Module;", "Lkotlin/Function1;", "Lo/getDefaultPropertyIgnorals;", "Lo/Module$AudioAttributesCompatParcelizer;", "RemoteActionCompatParcelizer", "(IJJLo/Module;Lo/getAnswerMap;)Lo/Module$AudioAttributesCompatParcelizer;", "(Lo/_assertNotNull;)V", "write", "(Lo/_assertNotNull;ZZ)V", "(Lo/_assertNotNull;Z)V", "(Lo/_assertNotNull;)J", "AudioAttributesImplApi26Parcelizer", "MediaBrowserCompatItemReceiver", "AudioAttributesImplBaseParcelizer", "Lo/_bindAndClose;", "Lo/getType;", "(Lo/_bindAndClose;Lo/getType;)V", "(Lo/_bindAndClose;)Z", "AudioAttributesImplApi21Parcelizer", "Lo/setExpandedActionViewsExclusive;", "Lo/MapperConfigBase;", "MediaBrowserCompatCustomActionResultReceiver", "Lo/MapperConfigBase;", "()Lo/MapperConfigBase;", "Lo/SerializerFactoryConfig;", "MediaBrowserCompatSearchResultReceiver", "Lo/SerializerFactoryConfig;", "Lo/setDropDownBackgroundResource;", "Lkotlin/Function0;", "Lo/setDropDownBackgroundResource;", "Z", "Ljava/lang/Object;", "J", "Lo/getCreatedOnDateMs;", "Lo/getType;", "RatingCompat"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class getAttributes {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final setDropDownBackgroundResource<getCreatedOnDateMs<getShowPopup>> RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: from kotlin metadata */
    private long AudioAttributesImplApi26Parcelizer;

    /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: from kotlin metadata */
    private final setExpandedActionViewsExclusive<_assertNotNull> IconCompatParcelizer;

    /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: from kotlin metadata */
    private boolean MediaBrowserCompatItemReceiver;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final getType RatingCompat;

    /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from kotlin metadata */
    private final MapperConfigBase read;

    /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: from kotlin metadata */
    private boolean AudioAttributesImplApi21Parcelizer;

    /* JADX INFO: renamed from: MediaBrowserCompatSearchResultReceiver, reason: from kotlin metadata */
    private final SerializerFactoryConfig write;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private boolean AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final getCreatedOnDateMs<getShowPopup> MediaBrowserCompatCustomActionResultReceiver;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private Object AudioAttributesImplBaseParcelizer;

    public getAttributes(setExpandedActionViewsExclusive<_assertNotNull> setexpandedactionviewsexclusive) {
        this.IconCompatParcelizer = setexpandedactionviewsexclusive;
        this.read = new MapperConfigBase();
        this.write = new SerializerFactoryConfig();
        this.RemoteActionCompatParcelizer = new setDropDownBackgroundResource<>(0, 1, null);
        this.AudioAttributesImplApi26Parcelizer = -1L;
        this.MediaBrowserCompatCustomActionResultReceiver = new AnonymousClass5();
        this.RatingCompat = new getType(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
    }

    public /* synthetic */ getAttributes(setExpandedActionViewsExclusive setexpandedactionviewsexclusive, int i, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this((i & 1) != 0 ? ActionMenuView.RemoteActionCompatParcelizer() : setexpandedactionviewsexclusive);
    }

    /* JADX INFO: renamed from: write, reason: from getter */
    public final MapperConfigBase getRead() {
        return this.read;
    }

    /* JADX INFO: renamed from: o.getAttributes$5, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "read", "()V"}, k = 3, mv = {2, 0, 0}, xi = 48)
    static final class AnonymousClass5 extends MagicModuleUseCase implements getCreatedOnDateMs<getShowPopup> {
        @Override // kotlin.getCreatedOnDateMs
        public final /* synthetic */ getShowPopup invoke() {
            read();
            return getShowPopup.INSTANCE;
        }

        public final void read() {
            getAttributes.this.AudioAttributesImplBaseParcelizer = null;
            getAttributes getattributes = getAttributes.this;
            Trace.beginSection("OnPositionedDispatch");
            try {
                getattributes.IconCompatParcelizer();
                getShowPopup getshowpopup = getShowPopup.INSTANCE;
            } finally {
                Trace.endSection();
            }
        }

        AnonymousClass5() {
            super(0);
        }
    }

    public final void AudioAttributesCompatParcelizer() {
        this.AudioAttributesCompatParcelizer = true;
    }

    public final void AudioAttributesCompatParcelizer(long p0, long p1, float[] p2, int p3, int p4) {
        this.MediaBrowserCompatItemReceiver = this.write.RemoteActionCompatParcelizer(p0, p1, (shouldSortPropertiesAlphabetically.RemoteActionCompatParcelizer(p2) & 2) != 0 ? null : p2, p3, p4) || this.MediaBrowserCompatItemReceiver;
    }

    public final void IconCompatParcelizer() {
        int i;
        read();
        long jWrite = _skipLine.write();
        boolean z = this.AudioAttributesCompatParcelizer;
        boolean z2 = z || this.MediaBrowserCompatItemReceiver;
        if (z) {
            this.AudioAttributesCompatParcelizer = false;
            setDropDownBackgroundResource<getCreatedOnDateMs<getShowPopup>> setdropdownbackgroundresource = this.RemoteActionCompatParcelizer;
            Object[] objArr = setdropdownbackgroundresource.IconCompatParcelizer;
            int i2 = setdropdownbackgroundresource.RemoteActionCompatParcelizer;
            for (int i3 = 0; i3 < i2; i3++) {
                ((getCreatedOnDateMs) objArr[i3]).invoke();
            }
            MapperConfigBase mapperConfigBase = this.read;
            long[] jArr = mapperConfigBase.read;
            int i4 = mapperConfigBase.IconCompatParcelizer;
            int i5 = 0;
            while (i5 < jArr.length - 2 && i5 < i4) {
                long j = jArr[i5 + 2];
                if ((((int) (j >> 60)) & 1) != 0) {
                    i = i5;
                    this.write.RemoteActionCompatParcelizer(33554431 & ((int) j), jArr[i5], jArr[i5 + 1], jWrite);
                } else {
                    i = i5;
                }
                i5 = i + 3;
            }
            this.read.IconCompatParcelizer();
        }
        if (this.MediaBrowserCompatItemReceiver) {
            this.MediaBrowserCompatItemReceiver = false;
            this.write.write(jWrite);
        }
        if (z2) {
            this.write.RemoteActionCompatParcelizer(jWrite);
        }
        if (this.AudioAttributesImplApi21Parcelizer) {
            this.AudioAttributesImplApi21Parcelizer = false;
            this.read.RemoteActionCompatParcelizer();
        }
        this.write.AudioAttributesCompatParcelizer(jWrite);
        if (this.write.getRead() > 0) {
            AudioAttributesCompatParcelizer(true);
        }
    }

    public final void AudioAttributesCompatParcelizer(boolean p0) {
        boolean z = (p0 && this.AudioAttributesImplBaseParcelizer == null) ? false : true;
        long jIconCompatParcelizer = this.write.getRead();
        if (jIconCompatParcelizer >= 0 || !z) {
            if (this.AudioAttributesImplApi26Parcelizer == jIconCompatParcelizer && z) {
                return;
            }
            Object obj = this.AudioAttributesImplBaseParcelizer;
            if (obj != null) {
                _skipLine.write(obj);
            }
            long jWrite = _skipLine.write();
            long jMax = Math.max(jIconCompatParcelizer, 16 + jWrite);
            this.AudioAttributesImplApi26Parcelizer = jMax;
            this.AudioAttributesImplBaseParcelizer = _skipLine.read(jMax - jWrite, this.MediaBrowserCompatCustomActionResultReceiver);
        }
    }

    public final void read() {
        Object obj = this.AudioAttributesImplBaseParcelizer;
        if (obj != null) {
            _skipLine.write(obj);
            this.AudioAttributesImplBaseParcelizer = null;
        }
    }

    public final Module.AudioAttributesCompatParcelizer RemoteActionCompatParcelizer(int p0, long p1, long p2, Module p3, getAnswerMap<? super getDefaultPropertyIgnorals, getShowPopup> p4) {
        Module.AudioAttributesCompatParcelizer audioAttributesCompatParcelizerIconCompatParcelizer = this.write.IconCompatParcelizer(p0, p1, p2, p3, p4);
        if (collectLongDefaults.AudioAttributesImplApi26Parcelizer(p3.getRead()).getAudioAttributesImplApi21Parcelizer()) {
            this.read.RemoteActionCompatParcelizer(p0, true);
        }
        AudioAttributesCompatParcelizer();
        AudioAttributesCompatParcelizer(true);
        return audioAttributesCompatParcelizerIconCompatParcelizer;
    }

    public final void RemoteActionCompatParcelizer(_assertNotNull p0) {
        if (p0.getAudioAttributesImplApi21Parcelizer()) {
            this.AudioAttributesCompatParcelizer = true;
            this.read.AudioAttributesCompatParcelizer(p0.getIconCompatParcelizer());
        }
        AudioAttributesCompatParcelizer(true);
    }

    public final void write(_assertNotNull p0, boolean p1, boolean p2) {
        if (p0.AudioAttributesImplApi26Parcelizer()) {
            this.read.RemoteActionCompatParcelizer(p0.getIconCompatParcelizer(), p1, p2);
        }
    }

    public final void read(_assertNotNull p0) {
        if (p0.MediaDescriptionCompat()) {
            long jAudioAttributesImplApi21Parcelizer = AudioAttributesImplApi21Parcelizer(p0);
            if (shouldSortPropertiesAlphabetically.write(jAudioAttributesImplApi21Parcelizer)) {
                p0.RemoteActionCompatParcelizer(jAudioAttributesImplApi21Parcelizer);
                p0.AudioAttributesImplApi21Parcelizer(false);
                UTF32Reader<_assertNotNull> uTF32ReaderAddObserverForBackInvoker = p0.addObserverForBackInvoker();
                _assertNotNull[] _assertnotnullArr = uTF32ReaderAddObserverForBackInvoker.IconCompatParcelizer;
                int iWrite = uTF32ReaderAddObserverForBackInvoker.getAudioAttributesCompatParcelizer();
                for (int i = 0; i < iWrite; i++) {
                    RemoteActionCompatParcelizer$default(this, _assertnotnullArr[i], false, 2, null);
                }
                RemoteActionCompatParcelizer(p0);
                return;
            }
            MediaBrowserCompatItemReceiver(p0);
        }
    }

    public static /* synthetic */ void RemoteActionCompatParcelizer$default(getAttributes getattributes, _assertNotNull _assertnotnull, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        getattributes.RemoteActionCompatParcelizer(_assertnotnull, z);
    }

    public final void RemoteActionCompatParcelizer(_assertNotNull p0, boolean p1) {
        long jRemoteActionCompatParcelizer;
        long j;
        if (p0.MediaDescriptionCompat()) {
            _assertNotNull _assertnotnull_init_lambda4 = p0._init_lambda4();
            if (_assertnotnull_init_lambda4 != null && !_assertnotnull_init_lambda4.getRemoteActionCompatParcelizer()) {
                if (_assertnotnull_init_lambda4.getAudioAttributesImplBaseParcelizer()) {
                    _assertnotnull_init_lambda4.AudioAttributesImplApi21Parcelizer(false);
                    _assertnotnull_init_lambda4.RemoteActionCompatParcelizer(AudioAttributesImplApi21Parcelizer(_assertnotnull_init_lambda4));
                }
                jRemoteActionCompatParcelizer = _assertnotnull_init_lambda4.getAudioAttributesImplApi26Parcelizer();
            } else if (_assertnotnull_init_lambda4 == null) {
                jRemoteActionCompatParcelizer = hasReferringProperties.INSTANCE.write();
            } else {
                jRemoteActionCompatParcelizer = hasReferringProperties.INSTANCE.RemoteActionCompatParcelizer();
            }
            _bindAndClose _bindandcloseR8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8 = p0.r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8();
            if (shouldSortPropertiesAlphabetically.write(jRemoteActionCompatParcelizer) && !read(_bindandcloseR8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8)) {
                if (!p0.getRemoteActionCompatParcelizer()) {
                    long jAudioAttributesCompatParcelizer = hasReferringProperties.AudioAttributesCompatParcelizer(jRemoteActionCompatParcelizer, _bindandcloseR8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8.getRead());
                    getSubtypeResolver getsubtyperesolverParcelableVolumeInfo = p0.ParcelableVolumeInfo();
                    int iMediaBrowserCompatSearchResultReceiver = getsubtyperesolverParcelableVolumeInfo.MediaBrowserCompatSearchResultReceiver();
                    int iAudioAttributesImplBaseParcelizer = getsubtyperesolverParcelableVolumeInfo.AudioAttributesImplBaseParcelizer();
                    long j2 = -1;
                    long j3 = getKey.read((((long) iMediaBrowserCompatSearchResultReceiver) << 32) | (((long) iAudioAttributesImplBaseParcelizer) & ((j2 - ((j2 >> 63) << 32)) | (((long) 0) << 32))));
                    int iconCompatParcelizer = p0.getIconCompatParcelizer();
                    if (p0.getAudioAttributesImplApi21Parcelizer()) {
                        if (p1 || !hasReferringProperties.write(jAudioAttributesCompatParcelizer, p0.getWrite()) || !getKey.AudioAttributesCompatParcelizer(j3, p0.getAudioAttributesCompatParcelizer())) {
                            if (_assertnotnull_init_lambda4 != null) {
                                this.read.read(iconCompatParcelizer, _assertnotnull_init_lambda4.getIconCompatParcelizer(), hasReferringProperties.IconCompatParcelizer(jAudioAttributesCompatParcelizer), hasReferringProperties.AudioAttributesCompatParcelizer(jAudioAttributesCompatParcelizer), iMediaBrowserCompatSearchResultReceiver, iAudioAttributesImplBaseParcelizer);
                            } else {
                                this.read.read(iconCompatParcelizer, hasReferringProperties.IconCompatParcelizer(jAudioAttributesCompatParcelizer), hasReferringProperties.AudioAttributesCompatParcelizer(jAudioAttributesCompatParcelizer), hasReferringProperties.IconCompatParcelizer(jAudioAttributesCompatParcelizer) + iMediaBrowserCompatSearchResultReceiver, hasReferringProperties.AudioAttributesCompatParcelizer(jAudioAttributesCompatParcelizer) + iAudioAttributesImplBaseParcelizer);
                            }
                            AudioAttributesCompatParcelizer();
                        }
                        j = j3;
                    } else {
                        p0.IconCompatParcelizer(true);
                        boolean zWrite = p0.get_init_lambda2().write(_bind.write(1024));
                        boolean zWrite2 = p0.get_init_lambda2().write(_bind.write(16));
                        boolean zIconCompatParcelizer = this.write.RemoteActionCompatParcelizer().IconCompatParcelizer(iconCompatParcelizer);
                        if (_assertnotnull_init_lambda4 != null) {
                            this.read.write(iconCompatParcelizer, _assertnotnull_init_lambda4.getIconCompatParcelizer(), hasReferringProperties.IconCompatParcelizer(jAudioAttributesCompatParcelizer), hasReferringProperties.AudioAttributesCompatParcelizer(jAudioAttributesCompatParcelizer), iMediaBrowserCompatSearchResultReceiver, iAudioAttributesImplBaseParcelizer, zWrite, zWrite2, zIconCompatParcelizer);
                            j = j3;
                        } else {
                            j = j3;
                            this.read.read(iconCompatParcelizer, hasReferringProperties.IconCompatParcelizer(jAudioAttributesCompatParcelizer), hasReferringProperties.AudioAttributesCompatParcelizer(jAudioAttributesCompatParcelizer), hasReferringProperties.IconCompatParcelizer(jAudioAttributesCompatParcelizer) + iMediaBrowserCompatSearchResultReceiver, hasReferringProperties.AudioAttributesCompatParcelizer(jAudioAttributesCompatParcelizer) + iAudioAttributesImplBaseParcelizer, (512 & 32) != 0 ? -1 : 0, (512 & 64) != 0 ? false : zWrite, (512 & 128) != 0 ? false : zWrite2, (512 & 256) != 0 ? false : zIconCompatParcelizer, (512 & 512) != 0 ? -1 : 0);
                        }
                        AudioAttributesCompatParcelizer();
                    }
                    p0.AudioAttributesCompatParcelizer(j);
                    p0.IconCompatParcelizer(jAudioAttributesCompatParcelizer);
                    return;
                }
                MediaBrowserCompatItemReceiver(p0);
                AudioAttributesImplApi26Parcelizer(p0);
                return;
            }
            MediaBrowserCompatItemReceiver(p0);
        }
    }

    public final long write(_assertNotNull p0) {
        long jWrite = this.read.write(p0.getIconCompatParcelizer());
        if (jWrite == Long.MAX_VALUE) {
            return hasReferringProperties.INSTANCE.RemoteActionCompatParcelizer();
        }
        long j = -1;
        return hasReferringProperties.read((((long) ((int) jWrite)) & ((((long) 0) << 32) | (j - ((j >> 63) << 32)))) | (((long) ((int) (jWrite >> 32))) << 32));
    }

    private final void AudioAttributesImplApi26Parcelizer(_assertNotNull _assertnotnull) {
        if (!_assertnotnull.getRemoteActionCompatParcelizer() || read(_assertnotnull.r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8())) {
            return;
        }
        _assertnotnull.RemoteActionCompatParcelizer(false);
        if (_assertnotnull.getAudioAttributesImplBaseParcelizer()) {
            _assertnotnull.RemoteActionCompatParcelizer(AudioAttributesImplApi21Parcelizer(_assertnotnull));
            _assertnotnull.AudioAttributesImplApi21Parcelizer(false);
        }
        if (hasReferringProperties.write(_assertnotnull.getAudioAttributesImplApi26Parcelizer(), hasReferringProperties.INSTANCE.RemoteActionCompatParcelizer())) {
            return;
        }
        UTF32Reader<_assertNotNull> uTF32ReaderAddObserverForBackInvoker = _assertnotnull.addObserverForBackInvoker();
        _assertNotNull[] _assertnotnullArr = uTF32ReaderAddObserverForBackInvoker.IconCompatParcelizer;
        int iWrite = uTF32ReaderAddObserverForBackInvoker.getAudioAttributesCompatParcelizer();
        for (int i = 0; i < iWrite; i++) {
            AudioAttributesImplApi26Parcelizer(_assertnotnullArr[i]);
        }
    }

    private final void MediaBrowserCompatItemReceiver(_assertNotNull p0) {
        AudioAttributesImplBaseParcelizer(p0);
        UTF32Reader<_assertNotNull> uTF32ReaderAddObserverForBackInvoker = p0.addObserverForBackInvoker();
        _assertNotNull[] _assertnotnullArr = uTF32ReaderAddObserverForBackInvoker.IconCompatParcelizer;
        int iWrite = uTF32ReaderAddObserverForBackInvoker.getAudioAttributesCompatParcelizer();
        for (int i = 0; i < iWrite; i++) {
            _assertNotNull _assertnotnull = _assertnotnullArr[i];
            if (_assertnotnull.MediaDescriptionCompat()) {
                MediaBrowserCompatItemReceiver(_assertnotnull);
            }
        }
    }

    private final void AudioAttributesImplBaseParcelizer(_assertNotNull p0) {
        p0.RemoteActionCompatParcelizer(true);
        p0.IconCompatParcelizer(hasReferringProperties.INSTANCE.RemoteActionCompatParcelizer());
        _bindAndClose _bindandcloseR8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8 = p0.r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8();
        getSubtypeResolver getsubtyperesolverParcelableVolumeInfo = p0.ParcelableVolumeInfo();
        int iMediaBrowserCompatSearchResultReceiver = getsubtyperesolverParcelableVolumeInfo.MediaBrowserCompatSearchResultReceiver();
        int iAudioAttributesImplBaseParcelizer = getsubtyperesolverParcelableVolumeInfo.AudioAttributesImplBaseParcelizer();
        getType gettype = this.RatingCompat;
        gettype.AudioAttributesCompatParcelizer(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, iMediaBrowserCompatSearchResultReceiver, iAudioAttributesImplBaseParcelizer);
        RemoteActionCompatParcelizer(_bindandcloseR8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8, gettype);
        int remoteActionCompatParcelizer = (int) gettype.getRemoteActionCompatParcelizer();
        int read = (int) gettype.getRead();
        int audioAttributesCompatParcelizer = (int) gettype.getAudioAttributesCompatParcelizer();
        int write = (int) gettype.getWrite();
        int iconCompatParcelizer = p0.getIconCompatParcelizer();
        boolean audioAttributesImplApi21Parcelizer = p0.getAudioAttributesImplApi21Parcelizer();
        p0.IconCompatParcelizer(true);
        if (!audioAttributesImplApi21Parcelizer || !this.read.write(iconCompatParcelizer, remoteActionCompatParcelizer, read, audioAttributesCompatParcelizer, write)) {
            _assertNotNull _assertnotnull_init_lambda4 = p0._init_lambda4();
            this.read.read(iconCompatParcelizer, remoteActionCompatParcelizer, read, audioAttributesCompatParcelizer, write, (512 & 32) != 0 ? -1 : _assertnotnull_init_lambda4 != null ? _assertnotnull_init_lambda4.getIconCompatParcelizer() : -1, (512 & 64) != 0 ? false : p0.get_init_lambda2().write(_bind.write(1024)), (512 & 128) != 0 ? false : p0.get_init_lambda2().write(_bind.write(16)), (512 & 256) != 0 ? false : this.write.RemoteActionCompatParcelizer().IconCompatParcelizer(iconCompatParcelizer), (512 & 512) != 0 ? -1 : 0);
        }
        AudioAttributesCompatParcelizer();
    }

    private final void RemoteActionCompatParcelizer(_bindAndClose _bindandclose, getType gettype) {
        while (_bindandclose != null) {
            _assertNotNull iconCompatParcelizer = _bindandclose.getIconCompatParcelizer();
            if (_bindandclose == iconCompatParcelizer.r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8() && !iconCompatParcelizer.getRemoteActionCompatParcelizer()) {
                long jWrite = write(iconCompatParcelizer);
                if (!hasReferringProperties.write(jWrite, hasReferringProperties.INSTANCE.RemoteActionCompatParcelizer())) {
                    long j = -1;
                    gettype.IconCompatParcelizer(getReferencedType.AudioAttributesCompatParcelizer((((long) Float.floatToRawIntBits(hasReferringProperties.AudioAttributesCompatParcelizer(jWrite))) & ((((long) 0) << 32) | (j - ((j >> 63) << 32)))) | (((long) Float.floatToRawIntBits(hasReferringProperties.IconCompatParcelizer(jWrite))) << 32)));
                    return;
                }
            }
            _reportUnkownFormat mediaSessionCompatResultReceiverWrapper = _bindandclose.getMediaSessionCompatResultReceiverWrapper();
            if (mediaSessionCompatResultReceiverWrapper != null) {
                float[] fArr = mediaSessionCompatResultReceiverWrapper.read();
                if (!getTextBuffer.write(fArr)) {
                    resetWithShared.write(fArr, gettype);
                }
            }
            long j2 = -1;
            gettype.IconCompatParcelizer(getReferencedType.AudioAttributesCompatParcelizer((((long) Float.floatToRawIntBits(hasReferringProperties.AudioAttributesCompatParcelizer(r0))) & ((((long) 0) << 32) | (j2 - ((j2 >> 63) << 32)))) | (((long) Float.floatToRawIntBits(hasReferringProperties.IconCompatParcelizer(_bindandclose.getRead()))) << 32)));
            _bindandclose = _bindandclose.getAudioAttributesImplApi26Parcelizer();
        }
    }

    private final boolean read(_bindAndClose _bindandclose) {
        _reportUnkownFormat mediaSessionCompatResultReceiverWrapper = _bindandclose.getMediaSessionCompatResultReceiverWrapper();
        return (mediaSessionCompatResultReceiverWrapper == null || getTextBuffer.write(mediaSessionCompatResultReceiverWrapper.read())) ? false : true;
    }

    private final long AudioAttributesImplApi21Parcelizer(_assertNotNull _assertnotnull) {
        _bindAndClose _bindandcloseR8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8 = _assertnotnull.r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8();
        long jWrite = hasReferringProperties.INSTANCE.write();
        for (_bindAndClose _bindandcloseOnPrepareFromUri = _assertnotnull.onPrepareFromUri(); _bindandcloseOnPrepareFromUri != null && _bindandcloseOnPrepareFromUri != _bindandcloseR8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8; _bindandcloseOnPrepareFromUri = _bindandcloseOnPrepareFromUri.getAudioAttributesImplApi26Parcelizer()) {
            if (read(_bindandcloseOnPrepareFromUri)) {
                return hasReferringProperties.INSTANCE.RemoteActionCompatParcelizer();
            }
            jWrite = hasReferringProperties.AudioAttributesCompatParcelizer(jWrite, _bindandcloseOnPrepareFromUri.getRead());
        }
        return jWrite;
    }

    public final void IconCompatParcelizer(_assertNotNull p0) {
        if (p0.getAudioAttributesImplApi21Parcelizer()) {
            this.read.RemoteActionCompatParcelizer(p0.getIconCompatParcelizer());
            p0.IconCompatParcelizer(false);
            AudioAttributesCompatParcelizer();
            this.AudioAttributesImplApi21Parcelizer = true;
        }
    }

    public final void AudioAttributesCompatParcelizer(_assertNotNull p0) {
        this.read.RemoteActionCompatParcelizer(p0.getIconCompatParcelizer(), false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public getAttributes() {
        this(null, 1, 0 == true ? 1 : 0);
    }
}
