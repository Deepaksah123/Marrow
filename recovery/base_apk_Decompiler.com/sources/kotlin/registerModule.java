package kotlin;

import kotlin.Metadata;
import kotlin._assertNotNull;
import kotlin._configureGenerator;
import kotlin.isRequired;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001:\u0001\u000fB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\f\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u000e\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000e\u0010\rJ\u001d\u0010\b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\b\u0010\rJ\u001d\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000f\u0010\rJ\u0015\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0010\u0010\u0005J!\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\u0010\u0010\u0011J!\u0010\f\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\f\u0010\u0011J\u001d\u0010\f\u001a\u00020\n2\u000e\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0012¢\u0006\u0004\b\f\u0010\u0013J\r\u0010\u000f\u001a\u00020\u0007¢\u0006\u0004\b\u000f\u0010\u0014J\u0017\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0015\u0010\u0005J\u001d\u0010\f\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\f\u0010\u0016J\u0017\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000f\u0010\u0005J\u0015\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0017¢\u0006\u0004\b\b\u0010\u0018J\u000f\u0010\u0010\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0010\u0010\u0014J'\u0010\b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\nH\u0002¢\u0006\u0004\b\b\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u001b\u0010\u0014J\u001f\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0015\u0010\u001cJ\u001d\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0010\u0010\u001cJ\u001f\u0010\u001d\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u001d\u0010\u001cJ\u001f\u0010\u001e\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u001e\u0010\u001cJ\u0017\u0010\u0010\u001a\u00020\u00072\b\b\u0002\u0010\u0003\u001a\u00020\n¢\u0006\u0004\b\u0010\u0010\u001fJ\u0015\u0010\f\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\f\u0010\u0005J\u001b\u0010 \u001a\u00020\n*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\nH\u0002¢\u0006\u0004\b \u0010\rR\u0014\u0010\u0010\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010!R\u0014\u0010\f\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010#R\u0011\u0010\u000f\u001a\u00020\n8G¢\u0006\u0006\u001a\u0004\b\b\u0010$R\u0011\u0010\u000e\u001a\u00020\n8G¢\u0006\u0006\u001a\u0004\b\f\u0010$R\u001c\u0010\b\u001a\u00020\n8\u0001@\u0000X\u0081\f¢\u0006\f\n\u0004\b\b\u0010%\u001a\u0004\b\u000e\u0010$R\u0016\u0010 \u001a\u00020\n8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\f\u0010%R\u0014\u0010\u0015\u001a\u00020&8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010'R\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00170(8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010)R\u001e\u0010\u001b\u001a\u00020*2\u0006\u0010\u0003\u001a\u00020*8F@BX\u0087\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010+R\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020,0(8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010)R\u0018\u0010.\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010-R\u001e\u00103\u001a\u0004\u0018\u00010/8\u0000@\u0001X\u0081\u000e¢\u0006\f\n\u0004\b0\u00101\"\u0004\b\b\u00102R\u0016\u00106\u001a\u0004\u0018\u0001048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u000e\u00105R\u0018\u00100\u001a\u00020\n*\u00020\u00028CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u00107R\u0018\u00108\u001a\u00020\n*\u00020\u00028CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u00107R\u0018\u00109\u001a\u00020\n*\u00020\u00028CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\b\u00107R\u0018\u0010:\u001a\u00020\n*\u00020\u00028CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u00107R\u0018\u0010;\u001a\u00020\n*\u00020\u00028CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u00107"}, d2 = {"Lo/registerModule;", "", "Lo/_assertNotNull;", "p0", "<init>", "(Lo/_assertNotNull;)V", "Lo/PropertyValueAny;", "", "write", "(J)V", "", "p1", "read", "(Lo/_assertNotNull;Z)Z", "AudioAttributesCompatParcelizer", "IconCompatParcelizer", "RemoteActionCompatParcelizer", "(Lo/_assertNotNull;Lo/PropertyValueAny;)Z", "Lkotlin/Function0;", "(Lo/getCreatedOnDateMs;)Z", "()V", "AudioAttributesImplApi21Parcelizer", "(Lo/_assertNotNull;J)V", "Lo/_configureGenerator$IconCompatParcelizer;", "(Lo/_configureGenerator$IconCompatParcelizer;)V", "p2", "(Lo/_assertNotNull;ZZ)Z", "AudioAttributesImplBaseParcelizer", "(Lo/_assertNotNull;Z)V", "MediaBrowserCompatItemReceiver", "AudioAttributesImplApi26Parcelizer", "(Z)V", "MediaBrowserCompatCustomActionResultReceiver", "Lo/_assertNotNull;", "Lo/getModuleName;", "Lo/getModuleName;", "()Z", "Z", "Lo/ObjectWriter;", "Lo/ObjectWriter;", "Lo/UTF32Reader;", "Lo/UTF32Reader;", "", "J", "Lo/registerModule$IconCompatParcelizer;", "Lo/PropertyValueAny;", "MediaBrowserCompatSearchResultReceiver", "Lo/isRequired$AudioAttributesCompatParcelizer;", "RatingCompat", "Lo/isRequired$AudioAttributesCompatParcelizer;", "(Lo/isRequired$AudioAttributesCompatParcelizer;)V", "MediaBrowserCompatMediaItem", "Lo/getDeserializationConfig;", "Lo/getDeserializationConfig;", "MediaDescriptionCompat", "(Lo/_assertNotNull;)Z", "MediaMetadataCompat", "onAddQueueItem", "MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver", "onCustomAction"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class registerModule {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final getDeserializationConfig MediaDescriptionCompat;

    /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: from kotlin metadata */
    private final UTF32Reader<IconCompatParcelizer> AudioAttributesImplApi26Parcelizer;

    /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: from kotlin metadata */
    private final ObjectWriter AudioAttributesImplApi21Parcelizer;

    /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: from kotlin metadata */
    private PropertyValueAny MediaBrowserCompatSearchResultReceiver;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final UTF32Reader<_configureGenerator.IconCompatParcelizer> MediaBrowserCompatItemReceiver;

    /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from kotlin metadata */
    private final getModuleName read;

    /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: from kotlin metadata */
    private final _assertNotNull RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: RatingCompat, reason: from kotlin metadata */
    private isRequired.AudioAttributesCompatParcelizer MediaBrowserCompatMediaItem;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    public long AudioAttributesImplBaseParcelizer;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private boolean MediaBrowserCompatCustomActionResultReceiver;
    private boolean write;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] write;

        static {
            int[] iArr = new int[_assertNotNull.RemoteActionCompatParcelizer.values().length];
            try {
                iArr[_assertNotNull.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[_assertNotNull.RemoteActionCompatParcelizer.write.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[_assertNotNull.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[_assertNotNull.RemoteActionCompatParcelizer.read.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[_assertNotNull.RemoteActionCompatParcelizer.IconCompatParcelizer.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            write = iArr;
        }
    }

    public registerModule(_assertNotNull _assertnotnull) {
        this.RemoteActionCompatParcelizer = _assertnotnull;
        getModuleName getmodulename = new getModuleName(_configureGenerator.INSTANCE.write());
        this.read = getmodulename;
        this.AudioAttributesImplApi21Parcelizer = new ObjectWriter();
        this.MediaBrowserCompatItemReceiver = new UTF32Reader<>(new _configureGenerator.IconCompatParcelizer[16], 0);
        this.AudioAttributesImplBaseParcelizer = 1L;
        UTF32Reader<IconCompatParcelizer> uTF32Reader = new UTF32Reader<>(new IconCompatParcelizer[16], 0);
        this.AudioAttributesImplApi26Parcelizer = uTF32Reader;
        this.MediaDescriptionCompat = _configureGenerator.INSTANCE.write() ? new getDeserializationConfig(_assertnotnull, getmodulename, uTF32Reader.read()) : null;
    }

    public final boolean write() {
        return this.read.write();
    }

    public final boolean read() {
        return this.AudioAttributesImplApi21Parcelizer.read();
    }

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from getter */
    public final boolean getWrite() {
        return this.write;
    }

    public final void write(isRequired.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer) {
        this.MediaBrowserCompatMediaItem = audioAttributesCompatParcelizer;
    }

    public final void write(long p0) {
        setMixInAnnotations setmixinannotations;
        PropertyValueAny propertyValueAny = this.MediaBrowserCompatSearchResultReceiver;
        if (propertyValueAny != null && PropertyValueAny.write(propertyValueAny.getRead(), p0)) {
            return;
        }
        if (this.write) {
            reportWrongTokenException.AudioAttributesCompatParcelizer("updateRootConstraints called while measuring");
        }
        this.MediaBrowserCompatSearchResultReceiver = PropertyValueAny.read(p0);
        if (this.RemoteActionCompatParcelizer.getMediaBrowserCompatSearchResultReceiver() != null) {
            this.RemoteActionCompatParcelizer.getActivityResultRegistry();
        }
        this.RemoteActionCompatParcelizer.addOnUserLeaveHintListener();
        getModuleName getmodulename = this.read;
        _assertNotNull _assertnotnull = this.RemoteActionCompatParcelizer;
        if (_assertnotnull.getMediaBrowserCompatSearchResultReceiver() != null) {
            setmixinannotations = setMixInAnnotations.AudioAttributesCompatParcelizer;
        } else {
            setmixinannotations = setMixInAnnotations.read;
        }
        getmodulename.RemoteActionCompatParcelizer(_assertnotnull, setmixinannotations);
    }

    public final boolean read(_assertNotNull p0, boolean p1) {
        _assertNotNull _assertnotnull_init_lambda4;
        _assertNotNull _assertnotnull_init_lambda42;
        if (p0.getMediaBrowserCompatSearchResultReceiver() == null) {
            reportWrongTokenException.read("Error: requestLookaheadRemeasure cannot be called on a node outside LookaheadScope");
        }
        int i = WhenMappings.write[p0.onSkipToQueueItem().ordinal()];
        if (i != 1) {
            if (i != 2 && i != 3 && i != 4) {
                if (i != 5) {
                    throw new RenewEligibleCreator();
                }
                if (p0.PlaybackStateCompat() && !p1) {
                    return false;
                }
                p0.getActivityResultRegistry();
                p0.addOnUserLeaveHintListener();
                if (p0.getAddOnUserLeaveHintListener()) {
                    return false;
                }
                if ((toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(p0.addOnNewIntentListener(), Boolean.TRUE) || AudioAttributesCompatParcelizer(p0)) && ((_assertnotnull_init_lambda4 = p0._init_lambda4()) == null || !_assertnotnull_init_lambda4.PlaybackStateCompat())) {
                    this.read.RemoteActionCompatParcelizer(p0, setMixInAnnotations.AudioAttributesCompatParcelizer);
                } else if ((p0.MediaDescriptionCompat() || write(p0)) && ((_assertnotnull_init_lambda42 = p0._init_lambda4()) == null || !_assertnotnull_init_lambda42.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM())) {
                    this.read.RemoteActionCompatParcelizer(p0, setMixInAnnotations.read);
                }
                return !this.MediaBrowserCompatCustomActionResultReceiver;
            }
            this.AudioAttributesImplApi26Parcelizer.read(new IconCompatParcelizer(p0, true, p1));
            getDeserializationConfig getdeserializationconfig = this.MediaDescriptionCompat;
            if (getdeserializationconfig != null) {
                getdeserializationconfig.IconCompatParcelizer();
            }
        }
        return false;
    }

    public static /* synthetic */ boolean AudioAttributesCompatParcelizer$default(registerModule registermodule, _assertNotNull _assertnotnull, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return registermodule.AudioAttributesCompatParcelizer(_assertnotnull, z);
    }

    public final boolean AudioAttributesCompatParcelizer(_assertNotNull p0, boolean p1) {
        int i = WhenMappings.write[p0.onSkipToQueueItem().ordinal()];
        if (i != 1 && i != 2) {
            if (i != 3 && i != 4) {
                if (i != 5) {
                    throw new RenewEligibleCreator();
                }
                if (p0.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM() && !p1) {
                    return false;
                }
                p0.addOnUserLeaveHintListener();
                if (p0.getAddOnUserLeaveHintListener()) {
                    return false;
                }
                if (!p0.MediaDescriptionCompat() && !write(p0)) {
                    return false;
                }
                _assertNotNull _assertnotnull_init_lambda4 = p0._init_lambda4();
                if (_assertnotnull_init_lambda4 == null || !_assertnotnull_init_lambda4.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM()) {
                    this.read.RemoteActionCompatParcelizer(p0, setMixInAnnotations.read);
                }
                return !this.MediaBrowserCompatCustomActionResultReceiver;
            }
            this.AudioAttributesImplApi26Parcelizer.read(new IconCompatParcelizer(p0, false, p1));
            getDeserializationConfig getdeserializationconfig = this.MediaDescriptionCompat;
            if (getdeserializationconfig != null) {
                getdeserializationconfig.IconCompatParcelizer();
            }
        }
        return false;
    }

    public final boolean write(_assertNotNull p0, boolean p1) {
        int i = WhenMappings.write[p0.onSkipToQueueItem().ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4 && i != 5) {
                        throw new RenewEligibleCreator();
                    }
                }
            }
            if ((p0.PlaybackStateCompat() || p0.onSkipToPrevious()) && !p1) {
                getDeserializationConfig getdeserializationconfig = this.MediaDescriptionCompat;
                if (getdeserializationconfig != null) {
                    getdeserializationconfig.IconCompatParcelizer();
                }
                return false;
            }
            p0.addOnTrimMemoryListener();
            p0.getDefaultViewModelCreationExtras();
            if (p0.getAddOnUserLeaveHintListener()) {
                return false;
            }
            _assertNotNull _assertnotnull_init_lambda4 = p0._init_lambda4();
            if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(p0.addOnNewIntentListener(), Boolean.TRUE) && ((_assertnotnull_init_lambda4 == null || !_assertnotnull_init_lambda4.PlaybackStateCompat()) && (_assertnotnull_init_lambda4 == null || !_assertnotnull_init_lambda4.onSkipToPrevious()))) {
                this.read.RemoteActionCompatParcelizer(p0, setMixInAnnotations.IconCompatParcelizer);
            } else if (p0.MediaDescriptionCompat() && ((_assertnotnull_init_lambda4 == null || !_assertnotnull_init_lambda4.onStop()) && (_assertnotnull_init_lambda4 == null || !_assertnotnull_init_lambda4.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM()))) {
                this.read.RemoteActionCompatParcelizer(p0, setMixInAnnotations.RemoteActionCompatParcelizer);
            }
            return !this.MediaBrowserCompatCustomActionResultReceiver;
        }
        getDeserializationConfig getdeserializationconfig2 = this.MediaDescriptionCompat;
        if (getdeserializationconfig2 != null) {
            getdeserializationconfig2.IconCompatParcelizer();
        }
        return false;
    }

    public final boolean IconCompatParcelizer(_assertNotNull p0, boolean p1) {
        int i = WhenMappings.write[p0.onSkipToQueueItem().ordinal()];
        if (i == 1 || i == 2 || i == 3 || i == 4) {
            getDeserializationConfig getdeserializationconfig = this.MediaDescriptionCompat;
            if (getdeserializationconfig != null) {
                getdeserializationconfig.IconCompatParcelizer();
            }
            return false;
        }
        if (i != 5) {
            throw new RenewEligibleCreator();
        }
        _assertNotNull _assertnotnull_init_lambda4 = p0._init_lambda4();
        boolean z = _assertnotnull_init_lambda4 == null || _assertnotnull_init_lambda4.MediaDescriptionCompat();
        if (!p1 && (p0.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM() || (p0.onStop() && p0.MediaDescriptionCompat() == z && p0.MediaDescriptionCompat() == p0.addOnMultiWindowModeChangedListener()))) {
            getDeserializationConfig getdeserializationconfig2 = this.MediaDescriptionCompat;
            if (getdeserializationconfig2 != null) {
                getdeserializationconfig2.IconCompatParcelizer();
            }
            return false;
        }
        p0.getDefaultViewModelCreationExtras();
        if (!p0.getAddOnUserLeaveHintListener() && p0.addOnMultiWindowModeChangedListener() && z) {
            if ((_assertnotnull_init_lambda4 == null || !_assertnotnull_init_lambda4.onStop()) && (_assertnotnull_init_lambda4 == null || !_assertnotnull_init_lambda4.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM())) {
                this.read.RemoteActionCompatParcelizer(p0, setMixInAnnotations.RemoteActionCompatParcelizer);
            }
            if (!this.MediaBrowserCompatCustomActionResultReceiver) {
                return true;
            }
        }
        return false;
    }

    public final void RemoteActionCompatParcelizer(_assertNotNull p0) {
        this.AudioAttributesImplApi21Parcelizer.read(p0);
    }

    private final boolean RemoteActionCompatParcelizer(_assertNotNull p0, PropertyValueAny p1) {
        boolean zRemoteActionCompatParcelizer$default;
        if (p0.getMediaBrowserCompatSearchResultReceiver() == null) {
            return false;
        }
        if (p1 != null) {
            zRemoteActionCompatParcelizer$default = p0.RemoteActionCompatParcelizer(p1);
        } else {
            zRemoteActionCompatParcelizer$default = _assertNotNull.RemoteActionCompatParcelizer$default(p0, null, 1, null);
        }
        _assertNotNull _assertnotnull_init_lambda4 = p0._init_lambda4();
        if (zRemoteActionCompatParcelizer$default && _assertnotnull_init_lambda4 != null) {
            if (_assertnotnull_init_lambda4.getMediaBrowserCompatSearchResultReceiver() == null) {
                _assertNotNull.AudioAttributesCompatParcelizer$default(_assertnotnull_init_lambda4, false, false, false, 3, null);
                return zRemoteActionCompatParcelizer$default;
            }
            if (p0.r8lambdaKUbBm7ckfqTc9QCgukC86fguu4() == _assertNotNull.MediaBrowserCompatCustomActionResultReceiver.AudioAttributesCompatParcelizer) {
                _assertNotNull.IconCompatParcelizer$default(_assertnotnull_init_lambda4, false, false, false, 3, null);
                return zRemoteActionCompatParcelizer$default;
            }
            if (p0.r8lambdaKUbBm7ckfqTc9QCgukC86fguu4() == _assertNotNull.MediaBrowserCompatCustomActionResultReceiver.RemoteActionCompatParcelizer) {
                _assertNotNull.write$default(_assertnotnull_init_lambda4, false, 1, null);
            }
        }
        return zRemoteActionCompatParcelizer$default;
    }

    private final boolean read(_assertNotNull p0, PropertyValueAny p1) {
        boolean z;
        if (p1 != null) {
            z = p0.read(p1);
        } else {
            z = _assertNotNull.read$default(p0, null, 1, null);
        }
        _assertNotNull _assertnotnull_init_lambda4 = p0._init_lambda4();
        if (z && _assertnotnull_init_lambda4 != null) {
            if (p0.ResultReceiver() == _assertNotNull.MediaBrowserCompatCustomActionResultReceiver.AudioAttributesCompatParcelizer) {
                _assertNotNull.AudioAttributesCompatParcelizer$default(_assertnotnull_init_lambda4, false, false, false, 3, null);
                return z;
            }
            if (p0.ResultReceiver() == _assertNotNull.MediaBrowserCompatCustomActionResultReceiver.RemoteActionCompatParcelizer) {
                _assertNotNull.AudioAttributesCompatParcelizer$default(_assertnotnull_init_lambda4, false, 1, null);
            }
        }
        return z;
    }

    public final void IconCompatParcelizer() {
        if (this.read.write()) {
            if (!this.RemoteActionCompatParcelizer.AudioAttributesImplApi26Parcelizer()) {
                reportWrongTokenException.AudioAttributesCompatParcelizer("performMeasureAndLayout called with unattached root");
            }
            if (!this.RemoteActionCompatParcelizer.MediaDescriptionCompat()) {
                reportWrongTokenException.AudioAttributesCompatParcelizer("performMeasureAndLayout called with unplaced root");
            }
            if (this.write) {
                reportWrongTokenException.AudioAttributesCompatParcelizer("performMeasureAndLayout called during measure layout");
            }
            if (this.MediaBrowserCompatSearchResultReceiver != null) {
                this.write = true;
                this.MediaBrowserCompatCustomActionResultReceiver = false;
                try {
                    if (this.read.RemoteActionCompatParcelizer()) {
                        if (this.RemoteActionCompatParcelizer.getMediaBrowserCompatSearchResultReceiver() != null) {
                            AudioAttributesImplApi21Parcelizer(this.RemoteActionCompatParcelizer, true);
                        } else {
                            AudioAttributesImplApi21Parcelizer(this.RemoteActionCompatParcelizer);
                        }
                    }
                    AudioAttributesImplApi21Parcelizer(this.RemoteActionCompatParcelizer, false);
                } catch (Throwable th) {
                    try {
                        isRequired.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = this.MediaBrowserCompatMediaItem;
                        if (audioAttributesCompatParcelizer == null) {
                            throw th;
                        }
                        audioAttributesCompatParcelizer.IconCompatParcelizer(th);
                    } catch (Throwable th2) {
                        this.write = false;
                        this.MediaBrowserCompatCustomActionResultReceiver = false;
                        throw th2;
                    }
                }
                this.write = false;
                this.MediaBrowserCompatCustomActionResultReceiver = false;
                getDeserializationConfig getdeserializationconfig = this.MediaDescriptionCompat;
                if (getdeserializationconfig != null) {
                    getdeserializationconfig.IconCompatParcelizer();
                }
            }
        }
    }

    public final void read(_assertNotNull p0, long p1) {
        if (p0.getAddOnUserLeaveHintListener()) {
            return;
        }
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(p0, this.RemoteActionCompatParcelizer)) {
            reportWrongTokenException.AudioAttributesCompatParcelizer("measureAndLayout called on root");
        }
        if (!this.RemoteActionCompatParcelizer.AudioAttributesImplApi26Parcelizer()) {
            reportWrongTokenException.AudioAttributesCompatParcelizer("performMeasureAndLayout called with unattached root");
        }
        if (!this.RemoteActionCompatParcelizer.MediaDescriptionCompat()) {
            reportWrongTokenException.AudioAttributesCompatParcelizer("performMeasureAndLayout called with unplaced root");
        }
        if (this.write) {
            reportWrongTokenException.AudioAttributesCompatParcelizer("performMeasureAndLayout called during measure layout");
        }
        if (this.MediaBrowserCompatSearchResultReceiver != null) {
            this.write = true;
            this.MediaBrowserCompatCustomActionResultReceiver = false;
            try {
                this.read.write(p0);
                if ((RemoteActionCompatParcelizer(p0, PropertyValueAny.read(p1)) || p0.onSkipToPrevious()) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(p0.addOnNewIntentListener(), Boolean.TRUE)) {
                    p0.addOnConfigurationChangedListener();
                }
                IconCompatParcelizer(p0);
                read(p0, PropertyValueAny.read(p1));
                if (p0.onStop() && p0.MediaDescriptionCompat()) {
                    p0.getFullyDrawnReporter();
                    this.AudioAttributesImplApi21Parcelizer.read(p0);
                }
                AudioAttributesImplBaseParcelizer();
            } catch (Throwable th) {
                try {
                    isRequired.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = this.MediaBrowserCompatMediaItem;
                    if (audioAttributesCompatParcelizer == null) {
                        throw th;
                    }
                    audioAttributesCompatParcelizer.IconCompatParcelizer(th);
                } catch (Throwable th2) {
                    this.write = false;
                    this.MediaBrowserCompatCustomActionResultReceiver = false;
                    throw th2;
                }
            }
            this.write = false;
            this.MediaBrowserCompatCustomActionResultReceiver = false;
            getDeserializationConfig getdeserializationconfig = this.MediaDescriptionCompat;
            if (getdeserializationconfig != null) {
                getdeserializationconfig.IconCompatParcelizer();
            }
        }
        RemoteActionCompatParcelizer();
    }

    public final void write(_configureGenerator.IconCompatParcelizer p0) {
        this.MediaBrowserCompatItemReceiver.read(p0);
    }

    private final void RemoteActionCompatParcelizer() {
        UTF32Reader<_configureGenerator.IconCompatParcelizer> uTF32Reader = this.MediaBrowserCompatItemReceiver;
        _configureGenerator.IconCompatParcelizer[] iconCompatParcelizerArr = uTF32Reader.IconCompatParcelizer;
        int iWrite = uTF32Reader.getAudioAttributesCompatParcelizer();
        for (int i = 0; i < iWrite; i++) {
            iconCompatParcelizerArr[i].s_();
        }
        this.MediaBrowserCompatItemReceiver.RemoteActionCompatParcelizer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean write(_assertNotNull p0, boolean p1, boolean p2) {
        PropertyValueAny propertyValueAny;
        boolean zRemoteActionCompatParcelizer;
        _assertNotNull _assertnotnull_init_lambda4;
        if (p0.getAddOnUserLeaveHintListener()) {
            return false;
        }
        if (!p0.MediaDescriptionCompat() && !p0.addOnMultiWindowModeChangedListener() && !write(p0) && !toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(p0.addOnNewIntentListener(), Boolean.TRUE) && !AudioAttributesCompatParcelizer(p0) && !p0.handleMediaPlayPauseIfPendingOnHandler()) {
            return false;
        }
        if (p0 == this.RemoteActionCompatParcelizer) {
            propertyValueAny = this.MediaBrowserCompatSearchResultReceiver;
            toMagicModuleMetaRepoModel.write(propertyValueAny);
        } else {
            propertyValueAny = null;
        }
        if (p1) {
            zRemoteActionCompatParcelizer = p0.PlaybackStateCompat() ? RemoteActionCompatParcelizer(p0, propertyValueAny) : false;
            if (p2 && ((zRemoteActionCompatParcelizer || p0.onSkipToPrevious()) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(p0.addOnNewIntentListener(), Boolean.TRUE))) {
                p0.addOnConfigurationChangedListener();
            }
        } else {
            boolean z = p0.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM() ? read(p0, propertyValueAny) : false;
            if (p2 && p0.onStop() && (p0 == this.RemoteActionCompatParcelizer || ((_assertnotnull_init_lambda4 = p0._init_lambda4()) != null && _assertnotnull_init_lambda4.MediaDescriptionCompat() && p0.addOnMultiWindowModeChangedListener()))) {
                if (p0 == this.RemoteActionCompatParcelizer) {
                    p0.read(0, 0);
                } else {
                    p0.getFullyDrawnReporter();
                }
                this.AudioAttributesImplApi21Parcelizer.read(p0);
                getDeserializationConfig getdeserializationconfig = this.MediaDescriptionCompat;
                if (getdeserializationconfig != null) {
                    getdeserializationconfig.IconCompatParcelizer();
                }
            }
            zRemoteActionCompatParcelizer = z;
        }
        AudioAttributesImplBaseParcelizer();
        return zRemoteActionCompatParcelizer;
    }

    private final void AudioAttributesImplBaseParcelizer() {
        if (this.AudioAttributesImplApi26Parcelizer.getAudioAttributesCompatParcelizer() != 0) {
            UTF32Reader<IconCompatParcelizer> uTF32Reader = this.AudioAttributesImplApi26Parcelizer;
            IconCompatParcelizer[] iconCompatParcelizerArr = uTF32Reader.IconCompatParcelizer;
            int iWrite = uTF32Reader.getAudioAttributesCompatParcelizer();
            for (int i = 0; i < iWrite; i++) {
                IconCompatParcelizer iconCompatParcelizer = iconCompatParcelizerArr[i];
                if (iconCompatParcelizer.getRemoteActionCompatParcelizer().AudioAttributesImplApi26Parcelizer()) {
                    if (!iconCompatParcelizer.getIconCompatParcelizer()) {
                        _assertNotNull.AudioAttributesCompatParcelizer$default(iconCompatParcelizer.getRemoteActionCompatParcelizer(), iconCompatParcelizer.getWrite(), false, false, 2, null);
                    } else {
                        _assertNotNull.IconCompatParcelizer$default(iconCompatParcelizer.getRemoteActionCompatParcelizer(), iconCompatParcelizer.getWrite(), false, false, 2, null);
                    }
                }
            }
            this.AudioAttributesImplApi26Parcelizer.RemoteActionCompatParcelizer();
        }
    }

    private final void AudioAttributesImplApi21Parcelizer(_assertNotNull p0, boolean p1) {
        PropertyValueAny propertyValueAny;
        if (p0.getAddOnUserLeaveHintListener()) {
            return;
        }
        if (p0 == this.RemoteActionCompatParcelizer) {
            propertyValueAny = this.MediaBrowserCompatSearchResultReceiver;
            toMagicModuleMetaRepoModel.write(propertyValueAny);
        } else {
            propertyValueAny = null;
        }
        if (p1) {
            RemoteActionCompatParcelizer(p0, propertyValueAny);
        } else {
            read(p0, propertyValueAny);
        }
    }

    public final void RemoteActionCompatParcelizer(_assertNotNull p0, boolean p1) {
        if (!this.write) {
            reportWrongTokenException.read("forceMeasureTheSubtree should be executed during the measureAndLayout pass");
        }
        if (MediaBrowserCompatCustomActionResultReceiver(p0, p1)) {
            reportWrongTokenException.AudioAttributesCompatParcelizer("node not yet measured");
        }
        AudioAttributesImplApi26Parcelizer(p0, p1);
    }

    private final void MediaBrowserCompatItemReceiver(_assertNotNull p0, boolean p1) {
        if (MediaBrowserCompatCustomActionResultReceiver(p0, p1)) {
            write(p0, p1, false);
        }
    }

    public static /* synthetic */ void RemoteActionCompatParcelizer$default(registerModule registermodule, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        registermodule.RemoteActionCompatParcelizer(z);
    }

    public final void RemoteActionCompatParcelizer(boolean p0) {
        if (p0) {
            this.AudioAttributesImplApi21Parcelizer.IconCompatParcelizer(this.RemoteActionCompatParcelizer);
        }
        if (this.AudioAttributesImplApi21Parcelizer.read()) {
            this.AudioAttributesImplApi21Parcelizer.write();
        }
    }

    public final void read(_assertNotNull p0) {
        this.read.write(p0);
        this.AudioAttributesImplApi21Parcelizer.RemoteActionCompatParcelizer(p0);
    }

    private final boolean AudioAttributesImplApi26Parcelizer(_assertNotNull _assertnotnull) {
        return _assertnotnull.ResultReceiver() == _assertNotNull.MediaBrowserCompatCustomActionResultReceiver.AudioAttributesCompatParcelizer || _assertnotnull.getAccessaddObserverForBackInvoker().read().getOnPause().AudioAttributesCompatParcelizer();
    }

    private final boolean AudioAttributesImplBaseParcelizer(_assertNotNull _assertnotnull) {
        do {
            if (_assertnotnull.ResultReceiver() == _assertNotNull.MediaBrowserCompatCustomActionResultReceiver.IconCompatParcelizer && !_assertnotnull.getAccessaddObserverForBackInvoker().read().getOnPause().AudioAttributesCompatParcelizer()) {
                _assertNotNull _assertnotnull_init_lambda4 = _assertnotnull._init_lambda4();
                if ((_assertnotnull_init_lambda4 != null ? _assertnotnull_init_lambda4.onSkipToQueueItem() : null) != _assertNotNull.RemoteActionCompatParcelizer.write) {
                    return false;
                }
            }
            _assertnotnull = _assertnotnull._init_lambda4();
            if (_assertnotnull == null) {
                return false;
            }
        } while (!_assertnotnull.MediaDescriptionCompat());
        return true;
    }

    private final boolean write(_assertNotNull _assertnotnull) {
        return _assertnotnull.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM() && AudioAttributesImplBaseParcelizer(_assertnotnull);
    }

    private final boolean AudioAttributesCompatParcelizer(_assertNotNull _assertnotnull) {
        KeyDeserializer keyDeserializerMediaBrowserCompatMediaItem;
        properties propertiesVarIconCompatParcelizer;
        if (_assertnotnull.PlaybackStateCompat()) {
            return (_assertnotnull.r8lambdaKUbBm7ckfqTc9QCgukC86fguu4() == _assertNotNull.MediaBrowserCompatCustomActionResultReceiver.IconCompatParcelizer && ((keyDeserializerMediaBrowserCompatMediaItem = _assertnotnull.getAccessaddObserverForBackInvoker().MediaBrowserCompatMediaItem()) == null || (propertiesVarIconCompatParcelizer = keyDeserializerMediaBrowserCompatMediaItem.getOnPause()) == null || !propertiesVarIconCompatParcelizer.AudioAttributesCompatParcelizer())) ? false : true;
        }
        return false;
    }

    private final boolean MediaBrowserCompatItemReceiver(_assertNotNull _assertnotnull) {
        KeyDeserializer keyDeserializerMediaBrowserCompatMediaItem;
        properties propertiesVarIconCompatParcelizer;
        return _assertnotnull.r8lambdaKUbBm7ckfqTc9QCgukC86fguu4() == _assertNotNull.MediaBrowserCompatCustomActionResultReceiver.AudioAttributesCompatParcelizer || !((keyDeserializerMediaBrowserCompatMediaItem = _assertnotnull.getAccessaddObserverForBackInvoker().MediaBrowserCompatMediaItem()) == null || (propertiesVarIconCompatParcelizer = keyDeserializerMediaBrowserCompatMediaItem.getOnPause()) == null || !propertiesVarIconCompatParcelizer.AudioAttributesCompatParcelizer());
    }

    private final boolean MediaBrowserCompatCustomActionResultReceiver(_assertNotNull _assertnotnull, boolean z) {
        return z ? _assertnotnull.PlaybackStateCompat() : _assertnotnull.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\f\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\t\u0010\u000bR\u001a\u0010\u0010\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u000e\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\r\u001a\u0004\b\f\u0010\u000f"}, d2 = {"Lo/registerModule$IconCompatParcelizer;", "", "Lo/_assertNotNull;", "p0", "", "p1", "p2", "<init>", "(Lo/_assertNotNull;ZZ)V", "AudioAttributesCompatParcelizer", "Lo/_assertNotNull;", "()Lo/_assertNotNull;", "RemoteActionCompatParcelizer", "Z", "write", "()Z", "IconCompatParcelizer", "read"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class IconCompatParcelizer {

        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
        private final _assertNotNull RemoteActionCompatParcelizer;

        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
        private final boolean IconCompatParcelizer;

        /* JADX INFO: renamed from: read, reason: from kotlin metadata */
        private final boolean write;

        public IconCompatParcelizer(_assertNotNull _assertnotnull, boolean z, boolean z2) {
            this.RemoteActionCompatParcelizer = _assertnotnull;
            this.IconCompatParcelizer = z;
            this.write = z2;
        }

        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from getter */
        public final _assertNotNull getRemoteActionCompatParcelizer() {
            return this.RemoteActionCompatParcelizer;
        }

        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from getter */
        public final boolean getWrite() {
            return this.write;
        }

        /* JADX INFO: renamed from: write, reason: from getter */
        public final boolean getIconCompatParcelizer() {
            return this.IconCompatParcelizer;
        }
    }

    public final boolean read(getCreatedOnDateMs<getShowPopup> p0) {
        boolean z;
        _assertNotNull _assertnotnullAudioAttributesCompatParcelizer;
        boolean z2;
        boolean z3;
        if (!this.RemoteActionCompatParcelizer.AudioAttributesImplApi26Parcelizer()) {
            reportWrongTokenException.AudioAttributesCompatParcelizer("performMeasureAndLayout called with unattached root");
        }
        if (!this.RemoteActionCompatParcelizer.MediaDescriptionCompat()) {
            reportWrongTokenException.AudioAttributesCompatParcelizer("performMeasureAndLayout called with unplaced root");
        }
        if (this.write) {
            reportWrongTokenException.AudioAttributesCompatParcelizer("performMeasureAndLayout called during measure layout");
        }
        boolean z4 = false;
        if (this.MediaBrowserCompatSearchResultReceiver != null) {
            this.write = true;
            this.MediaBrowserCompatCustomActionResultReceiver = true;
            try {
                if (this.read.write()) {
                    getModuleName getmodulename = this.read;
                    z = false;
                    while (true) {
                        try {
                            if (!getmodulename.write.IconCompatParcelizer()) {
                                _assertnotnullAudioAttributesCompatParcelizer = getmodulename.write.AudioAttributesCompatParcelizer();
                                z3 = _assertnotnullAudioAttributesCompatParcelizer.getMediaBrowserCompatSearchResultReceiver() != null;
                                z2 = false;
                            } else if (!getmodulename.AudioAttributesCompatParcelizer.IconCompatParcelizer()) {
                                _assertnotnullAudioAttributesCompatParcelizer = getmodulename.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer();
                                z3 = _assertnotnullAudioAttributesCompatParcelizer.getMediaBrowserCompatSearchResultReceiver() != null;
                                z2 = true;
                            } else {
                                if (getmodulename.RemoteActionCompatParcelizer.IconCompatParcelizer()) {
                                    break;
                                }
                                _assertnotnullAudioAttributesCompatParcelizer = getmodulename.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer();
                                z2 = true;
                                z3 = false;
                            }
                            boolean zWrite = write(_assertnotnullAudioAttributesCompatParcelizer, z3, z2);
                            if (!z2) {
                                if (_assertnotnullAudioAttributesCompatParcelizer.onSkipToPrevious()) {
                                    this.read.RemoteActionCompatParcelizer(_assertnotnullAudioAttributesCompatParcelizer, setMixInAnnotations.IconCompatParcelizer);
                                }
                                if (_assertnotnullAudioAttributesCompatParcelizer.onStop()) {
                                    this.read.RemoteActionCompatParcelizer(_assertnotnullAudioAttributesCompatParcelizer, setMixInAnnotations.RemoteActionCompatParcelizer);
                                }
                            }
                            if (_assertnotnullAudioAttributesCompatParcelizer == this.RemoteActionCompatParcelizer && zWrite) {
                                z = true;
                            }
                        } catch (Throwable th) {
                            th = th;
                            try {
                                isRequired.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = this.MediaBrowserCompatMediaItem;
                                if (audioAttributesCompatParcelizer == null) {
                                    throw th;
                                }
                                audioAttributesCompatParcelizer.IconCompatParcelizer(th);
                            } catch (Throwable th2) {
                                this.write = false;
                                this.MediaBrowserCompatCustomActionResultReceiver = false;
                                throw th2;
                            }
                        }
                    }
                    if (p0 != null) {
                        p0.invoke();
                    }
                } else {
                    z = false;
                }
            } catch (Throwable th3) {
                th = th3;
                z = false;
            }
            this.write = false;
            this.MediaBrowserCompatCustomActionResultReceiver = false;
            getDeserializationConfig getdeserializationconfig = this.MediaDescriptionCompat;
            if (getdeserializationconfig != null) {
                getdeserializationconfig.IconCompatParcelizer();
            }
            z4 = z;
        }
        RemoteActionCompatParcelizer();
        return z4;
    }

    private final void AudioAttributesImplApi21Parcelizer(_assertNotNull p0) {
        UTF32Reader<_assertNotNull> uTF32ReaderAddObserverForBackInvoker = p0.addObserverForBackInvoker();
        _assertNotNull[] _assertnotnullArr = uTF32ReaderAddObserverForBackInvoker.IconCompatParcelizer;
        int iWrite = uTF32ReaderAddObserverForBackInvoker.getAudioAttributesCompatParcelizer();
        for (int i = 0; i < iWrite; i++) {
            _assertNotNull _assertnotnull = _assertnotnullArr[i];
            if (AudioAttributesImplApi26Parcelizer(_assertnotnull)) {
                if (configure.write(_assertnotnull)) {
                    AudioAttributesImplApi21Parcelizer(_assertnotnull, true);
                } else {
                    AudioAttributesImplApi21Parcelizer(_assertnotnull);
                }
            }
        }
    }

    private final void IconCompatParcelizer(_assertNotNull p0) {
        UTF32Reader<_assertNotNull> uTF32ReaderAddObserverForBackInvoker = p0.addObserverForBackInvoker();
        _assertNotNull[] _assertnotnullArr = uTF32ReaderAddObserverForBackInvoker.IconCompatParcelizer;
        int iWrite = uTF32ReaderAddObserverForBackInvoker.getAudioAttributesCompatParcelizer();
        for (int i = 0; i < iWrite; i++) {
            _assertNotNull _assertnotnull = _assertnotnullArr[i];
            if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(_assertnotnull.addOnNewIntentListener(), Boolean.TRUE) && !_assertnotnull.getAddOnUserLeaveHintListener()) {
                if (this.read.read(_assertnotnull, true)) {
                    _assertnotnull.addOnConfigurationChangedListener();
                }
                IconCompatParcelizer(_assertnotnull);
            }
        }
    }

    private final void AudioAttributesImplApi26Parcelizer(_assertNotNull p0, boolean p1) {
        UTF32Reader<_assertNotNull> uTF32ReaderAddObserverForBackInvoker = p0.addObserverForBackInvoker();
        _assertNotNull[] _assertnotnullArr = uTF32ReaderAddObserverForBackInvoker.IconCompatParcelizer;
        int iWrite = uTF32ReaderAddObserverForBackInvoker.getAudioAttributesCompatParcelizer();
        for (int i = 0; i < iWrite; i++) {
            _assertNotNull _assertnotnull = _assertnotnullArr[i];
            if ((!p1 && AudioAttributesImplApi26Parcelizer(_assertnotnull)) || (p1 && MediaBrowserCompatItemReceiver(_assertnotnull))) {
                if (configure.write(_assertnotnull) && !p1) {
                    if (_assertnotnull.PlaybackStateCompat() && this.read.read(_assertnotnull, true)) {
                        write(_assertnotnull, true, false);
                    } else {
                        RemoteActionCompatParcelizer(_assertnotnull, true);
                    }
                }
                MediaBrowserCompatItemReceiver(_assertnotnull, p1);
                if (!MediaBrowserCompatCustomActionResultReceiver(_assertnotnull, p1)) {
                    AudioAttributesImplApi26Parcelizer(_assertnotnull, p1);
                }
            }
        }
        MediaBrowserCompatItemReceiver(p0, p1);
    }
}
