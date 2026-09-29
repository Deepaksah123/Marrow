package kotlin;

import android.view.KeyEvent;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.List;
import kotlin.Metadata;
import kotlin.getExternalFilesDirs;
import kotlin.setTag;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000Ò\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004BO\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u000f\u001a\u00020\r\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0006\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J@\u0010\u001f\u001a\u00020\u00172.\u0010\u0006\u001a*\b\u0001\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u00170\u001b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u001d\u0012\u0006\u0012\u0004\u0018\u00010\u001e0\u001aH\u0096@¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010!\u001a\u00020\u00172\u0006\u0010\u0006\u001a\u00020\u0016H\u0016¢\u0006\u0004\b!\u0010\u0019J\u0017\u0010#\u001a\u00020\u00172\u0006\u0010\u0006\u001a\u00020\"H\u0016¢\u0006\u0004\b#\u0010$J\u0017\u0010\u001f\u001a\u00020\u00172\u0006\u0010\u0006\u001a\u00020%H\u0002¢\u0006\u0004\b\u001f\u0010\u0019J\u000f\u0010&\u001a\u00020\rH\u0016¢\u0006\u0004\b&\u0010'J\u000f\u0010(\u001a\u00020\u0017H\u0002¢\u0006\u0004\b(\u0010)JU\u0010*\u001a\u00020\u00172\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u00072\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u000f\u001a\u0004\u0018\u00010\t2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b*\u0010+J\u000f\u0010,\u001a\u00020\u0017H\u0016¢\u0006\u0004\b,\u0010)J\u000f\u0010-\u001a\u00020\u0017H\u0002¢\u0006\u0004\b-\u0010)J\u000f\u0010.\u001a\u00020\u0017H\u0016¢\u0006\u0004\b.\u0010)J\u0017\u0010!\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020/H\u0016¢\u0006\u0004\b!\u00100J\u0017\u0010#\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020/H\u0016¢\u0006\u0004\b#\u00100J'\u0010!\u001a\u00020\u00172\u0006\u0010\u0006\u001a\u0002012\u0006\u0010\b\u001a\u0002022\u0006\u0010\n\u001a\u000203H\u0016¢\u0006\u0004\b!\u00104J\u0013\u0010!\u001a\u00020\u0017*\u000205H\u0016¢\u0006\u0004\b!\u00106J\u000f\u00107\u001a\u00020\u0017H\u0002¢\u0006\u0004\b7\u0010)J\u000f\u00108\u001a\u00020\u0017H\u0002¢\u0006\u0004\b8\u0010)R\u0018\u0010#\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u0010:R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010;R\u001a\u0010*\u001a\u00020\r8\u0017X\u0096D¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b>\u0010'R\u0014\u0010!\u001a\u00020?8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b@\u0010AR\u0014\u0010\u001f\u001a\u00020B8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b&\u0010CR\u0014\u0010F\u001a\u00020D8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b*\u0010ER\u0014\u0010@\u001a\u00020G8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bH\u0010IR\u0014\u00109\u001a\u00020J8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b>\u0010KR\u0014\u0010N\u001a\u00020L8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bF\u0010MR\u0014\u0010>\u001a\u00020O8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010PR*\u0010T\u001a\u0016\u0012\u0004\u0012\u00020Q\u0012\u0004\u0012\u00020Q\u0012\u0004\u0012\u00020\r\u0018\u00010\u001a8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bR\u0010SR4\u0010R\u001a \b\u0001\u0012\u0004\u0012\u00020\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u001d\u0012\u0006\u0012\u0004\u0018\u00010\u001e\u0018\u00010\u001a8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b8\u0010SR\u0018\u00108\u001a\u0004\u0018\u00010U8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bN\u0010V"}, d2 = {"Lo/getExternalFilesDirs;", "Lo/Guideline;", "Lo/objectIdGeneratorInstance;", "Lo/hasIndex;", "Lo/putExtraData;", "Lo/getNoBackupFilesDir;", "p0", "Lo/setLastHorizontalStyle;", "p1", "Lo/CoordinatorLayout;", "p2", "Lo/superDispatchKeyEvent;", "p3", "", "p4", "p5", "Lo/hashCode;", "p6", "Lo/MotionTelltales;", "p7", "<init>", "(Lo/getNoBackupFilesDir;Lo/setLastHorizontalStyle;Lo/CoordinatorLayout;Lo/superDispatchKeyEvent;ZZLo/hashCode;Lo/MotionTelltales;)V", "Lo/getReferencedType;", "", "read", "(J)V", "Lkotlin/Function2;", "Lkotlin/Function1;", "Lo/setTag$AudioAttributesCompatParcelizer;", "Lo/SampleVideos;", "", "IconCompatParcelizer", "(Lo/MagicModuleSubmissionRequestBody;Lo/SampleVideos;)Ljava/lang/Object;", "write", "Lo/setTag$write;", "AudioAttributesCompatParcelizer", "(Lo/setTag$write;)V", "Lo/UnsupportedTypeDeserializer;", "MediaMetadataCompat", "()Z", "onRewind", "()V", "RemoteActionCompatParcelizer", "(Lo/getNoBackupFilesDir;Lo/superDispatchKeyEvent;Lo/setLastHorizontalStyle;ZZLo/CoordinatorLayout;Lo/hashCode;Lo/MotionTelltales;)V", "c_", "onSetPlaybackSpeed", "e_", "Lo/constructType;", "(Landroid/view/KeyEvent;)Z", "Lo/DeserializationContext;", "Lo/_shapeForToken;", "Lo/getKey;", "(Lo/DeserializationContext;Lo/_shapeForToken;J)V", "Lo/getConfigOverride;", "(Lo/getConfigOverride;)V", "onSetShuffleMode", "RatingCompat", "AudioAttributesImplApi26Parcelizer", "Lo/setLastHorizontalStyle;", "Lo/CoordinatorLayout;", "MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver", "Z", "AudioAttributesImplBaseParcelizer", "Lo/reportBadDefinition;", "MediaBrowserCompatItemReceiver", "Lo/reportBadDefinition;", "Lo/getDataDir;", "Lo/getDataDir;", "Lo/getContextForLanguage;", "Lo/getContextForLanguage;", "MediaBrowserCompatCustomActionResultReceiver", "Lo/registerReceiver;", "MediaDescriptionCompat", "Lo/registerReceiver;", "Lo/getExternalCacheDirs;", "Lo/getExternalCacheDirs;", "Lo/_findSymbol2;", "Lo/_findSymbol2;", "AudioAttributesImplApi21Parcelizer", "Lo/setTextureWidth;", "Lo/setTextureWidth;", "", "MediaBrowserCompatMediaItem", "Lo/MagicModuleSubmissionRequestBody;", "MediaBrowserCompatSearchResultReceiver", "Lo/setStatusBarBackgroundResource;", "Lo/setStatusBarBackgroundResource;"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class getExternalFilesDirs extends Guideline implements objectIdGeneratorInstance, hasIndex, putExtraData {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private CoordinatorLayout read;

    /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: from kotlin metadata */
    private setStatusBarBackgroundResource RatingCompat;

    /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: from kotlin metadata */
    private setLastHorizontalStyle AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: from kotlin metadata */
    private final getExternalCacheDirs AudioAttributesImplApi26Parcelizer;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final setTextureWidth AudioAttributesImplBaseParcelizer;

    /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from kotlin metadata */
    private final _findSymbol2 AudioAttributesImplApi21Parcelizer;

    /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: from kotlin metadata */
    private final reportBadDefinition write;

    /* JADX INFO: renamed from: MediaBrowserCompatMediaItem, reason: from kotlin metadata */
    private MagicModuleSubmissionRequestBody<? super Float, ? super Float, Boolean> MediaBrowserCompatSearchResultReceiver;

    /* JADX INFO: renamed from: MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, reason: from kotlin metadata */
    private final boolean RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: MediaDescriptionCompat, reason: from kotlin metadata */
    private final registerReceiver MediaBrowserCompatItemReceiver;

    /* JADX INFO: renamed from: MediaMetadataCompat, reason: from kotlin metadata */
    private final getDataDir IconCompatParcelizer;

    /* JADX INFO: renamed from: RatingCompat, reason: from kotlin metadata */
    private MagicModuleSubmissionRequestBody<? super getReferencedType, ? super SampleVideos<? super getReferencedType>, ? extends Object> MediaBrowserCompatMediaItem;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final getContextForLanguage MediaBrowserCompatCustomActionResultReceiver;

    @Override // kotlin.objectIdGeneratorInstance
    public final boolean AudioAttributesCompatParcelizer(KeyEvent p0) {
        return false;
    }

    @Override // kotlin.Guideline
    public final void write(long p0) {
    }

    public getExternalFilesDirs(getNoBackupFilesDir getnobackupfilesdir, setLastHorizontalStyle setlasthorizontalstyle, CoordinatorLayout coordinatorLayout, superDispatchKeyEvent superdispatchkeyevent, boolean z, boolean z2, hashCode hashcode, MotionTelltales motionTelltales) {
        super(getColor.IconCompatParcelizer(), z, hashcode, superdispatchkeyevent);
        this.AudioAttributesCompatParcelizer = setlasthorizontalstyle;
        this.read = coordinatorLayout;
        reportBadDefinition reportbaddefinition = new reportBadDefinition();
        this.write = reportbaddefinition;
        this.IconCompatParcelizer = (getDataDir) AudioAttributesCompatParcelizer(new getDataDir(z));
        getContextForLanguage getcontextforlanguage = startActivities.read();
        this.MediaBrowserCompatCustomActionResultReceiver = getcontextforlanguage;
        setLastHorizontalStyle setlasthorizontalstyle2 = this.AudioAttributesCompatParcelizer;
        CoordinatorLayout coordinatorLayout2 = this.read;
        registerReceiver registerreceiver = new registerReceiver(getnobackupfilesdir, setlasthorizontalstyle2, coordinatorLayout2 == null ? getcontextforlanguage : coordinatorLayout2, superdispatchkeyevent, z2, reportbaddefinition, this, new getCreatedOnDateMs() { // from class: o.getDisplayOrDefault
            @Override // kotlin.getCreatedOnDateMs
            public final Object invoke() {
                return Boolean.valueOf(getExternalFilesDirs.read(this.write));
            }
        });
        this.MediaBrowserCompatItemReceiver = registerreceiver;
        getExternalCacheDirs getexternalcachedirs = new getExternalCacheDirs(registerreceiver, z);
        this.AudioAttributesImplApi26Parcelizer = getexternalcachedirs;
        this.AudioAttributesImplApi21Parcelizer = (_findSymbol2) AudioAttributesCompatParcelizer(findSymbol.RemoteActionCompatParcelizer$default(hashSeed.INSTANCE.IconCompatParcelizer(), null, 2, null));
        setTextureWidth settexturewidth = (setTextureWidth) AudioAttributesCompatParcelizer(new setTextureWidth(superdispatchkeyevent, registerreceiver, z2, motionTelltales, new getCreatedOnDateMs() { // from class: o.getString
            @Override // kotlin.getCreatedOnDateMs
            public final Object invoke() {
                return getExternalFilesDirs.RemoteActionCompatParcelizer(this.write);
            }
        }));
        this.AudioAttributesImplBaseParcelizer = settexturewidth;
        AudioAttributesCompatParcelizer(_withMapperFeatures.IconCompatParcelizer(getexternalcachedirs, reportbaddefinition));
        AudioAttributesCompatParcelizer(new SpliceInsertCommand(settexturewidth));
        if (getDesignInfoListui_tooling.AudioAttributesImplBaseParcelizer) {
            return;
        }
        AudioAttributesCompatParcelizer(new setOnModifierChangedui(new getAnswerMap() { // from class: o.getSystemService
            @Override // kotlin.getAnswerMap
            public final Object invoke(Object obj) {
                return getExternalFilesDirs.read(this.AudioAttributesCompatParcelizer, (isAbstract) obj);
            }
        }));
    }

    @Override // o._handleOddName.IconCompatParcelizer
    /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: from getter */
    public final boolean getRemoteActionCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean read(getExternalFilesDirs getexternalfilesdirs) {
        return getexternalfilesdirs.getRatingCompat();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final WritableTypeIdInclusion RemoteActionCompatParcelizer(getExternalFilesDirs getexternalfilesdirs) {
        return findSymbol.write(getexternalfilesdirs.AudioAttributesImplApi21Parcelizer);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup read(getExternalFilesDirs getexternalfilesdirs, isAbstract isabstract) {
        getexternalfilesdirs.AudioAttributesImplBaseParcelizer.AudioAttributesCompatParcelizer(isabstract);
        return getShowPopup.INSTANCE;
    }

    @Override // kotlin.putExtraData
    public final void read(long p0) {
        if (getRatingCompat()) {
            collectLongDefaults.write(this, p0);
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Landroidx/compose/foundation/gestures/NestedScrollScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    static final class write extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<shouldSkipDump, SampleVideos<? super getShowPopup>, Object> {
        final /* synthetic */ MagicModuleSubmissionRequestBody<getAnswerMap<? super setTag.AudioAttributesCompatParcelizer, getShowPopup>, SampleVideos<? super getShowPopup>, Object> IconCompatParcelizer;
        private /* synthetic */ Object RemoteActionCompatParcelizer;
        int read;
        final /* synthetic */ registerReceiver write;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.read;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                final shouldSkipDump shouldskipdump = (shouldSkipDump) this.RemoteActionCompatParcelizer;
                MagicModuleSubmissionRequestBody<getAnswerMap<? super setTag.AudioAttributesCompatParcelizer, getShowPopup>, SampleVideos<? super getShowPopup>, Object> magicModuleSubmissionRequestBody = this.IconCompatParcelizer;
                final registerReceiver registerreceiver = this.write;
                getAnswerMap<? super setTag.AudioAttributesCompatParcelizer, getShowPopup> getanswermap = new getAnswerMap() { // from class: o.getObbDirs
                    @Override // kotlin.getAnswerMap
                    public final Object invoke(Object obj2) {
                        return getExternalFilesDirs.write.read(shouldskipdump, registerreceiver, (setTag.AudioAttributesCompatParcelizer) obj2);
                    }
                };
                this.read = 1;
                if (magicModuleSubmissionRequestBody.invoke(getanswermap, this) == objIconCompatParcelizer) {
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

        /* JADX INFO: Access modifiers changed from: private */
        public static final getShowPopup read(shouldSkipDump shouldskipdump, registerReceiver registerreceiver, setTag.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer) {
            shouldskipdump.RemoteActionCompatParcelizer(getReferencedType.read(registerreceiver.RemoteActionCompatParcelizer(audioAttributesCompatParcelizer.getWrite()), audioAttributesCompatParcelizer.getIconCompatParcelizer() ? -1.0f : 1.0f), findCoercionAction.INSTANCE.AudioAttributesCompatParcelizer());
            return getShowPopup.INSTANCE;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        write(MagicModuleSubmissionRequestBody<? super getAnswerMap<? super setTag.AudioAttributesCompatParcelizer, getShowPopup>, ? super SampleVideos<? super getShowPopup>, ? extends Object> magicModuleSubmissionRequestBody, registerReceiver registerreceiver, SampleVideos<? super write> sampleVideos) {
            super(2, sampleVideos);
            this.IconCompatParcelizer = magicModuleSubmissionRequestBody;
            this.write = registerreceiver;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            write writeVar = new write(this.IconCompatParcelizer, this.write, sampleVideos);
            writeVar.RemoteActionCompatParcelizer = obj;
            return writeVar;
        }

        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
        public final Object invoke(shouldSkipDump shouldskipdump, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((write) create(shouldskipdump, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    @Override // kotlin.Guideline
    public final Object IconCompatParcelizer(MagicModuleSubmissionRequestBody<? super getAnswerMap<? super setTag.AudioAttributesCompatParcelizer, getShowPopup>, ? super SampleVideos<? super getShowPopup>, ? extends Object> magicModuleSubmissionRequestBody, SampleVideos<? super getShowPopup> sampleVideos) {
        registerReceiver registerreceiver = this.MediaBrowserCompatItemReceiver;
        Object obj = registerreceiver.read(Flow.AudioAttributesCompatParcelizer, new write(magicModuleSubmissionRequestBody, registerreceiver, null), sampleVideos);
        return obj == getYear.IconCompatParcelizer() ? obj : getShowPopup.INSTANCE;
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    static final class IconCompatParcelizer extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        final /* synthetic */ getExternalFilesDirs AudioAttributesCompatParcelizer;
        int IconCompatParcelizer;
        final /* synthetic */ setTag.write write;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.IconCompatParcelizer;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                float f = this.write.getAudioAttributesCompatParcelizer() ? -1.0f : 1.0f;
                this.IconCompatParcelizer = 1;
                if (this.AudioAttributesCompatParcelizer.MediaBrowserCompatItemReceiver.IconCompatParcelizer(UnsupportedTypeDeserializer.IconCompatParcelizer(this.write.getRemoteActionCompatParcelizer(), f), false, (SampleVideos<? super getShowPopup>) this) == objIconCompatParcelizer) {
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
        IconCompatParcelizer(setTag.write writeVar, getExternalFilesDirs getexternalfilesdirs, SampleVideos<? super IconCompatParcelizer> sampleVideos) {
            super(2, sampleVideos);
            this.write = writeVar;
            this.AudioAttributesCompatParcelizer = getexternalfilesdirs;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return new IconCompatParcelizer(this.write, this.AudioAttributesCompatParcelizer, sampleVideos);
        }

        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
        public final Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((IconCompatParcelizer) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    @Override // kotlin.Guideline
    public final void AudioAttributesCompatParcelizer(setTag.write p0) {
        C0201setMcqCount.IconCompatParcelizer(this.write.IconCompatParcelizer(), null, null, new IconCompatParcelizer(p0, this, null), 3);
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    static final class read extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        final /* synthetic */ long AudioAttributesCompatParcelizer;
        int write;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.write;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                this.write = 1;
                if (getExternalFilesDirs.this.MediaBrowserCompatItemReceiver.IconCompatParcelizer(this.AudioAttributesCompatParcelizer, true, (SampleVideos<? super getShowPopup>) this) == objIconCompatParcelizer) {
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
        read(long j, SampleVideos<? super read> sampleVideos) {
            super(2, sampleVideos);
            this.AudioAttributesCompatParcelizer = j;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return getExternalFilesDirs.this.new read(this.AudioAttributesCompatParcelizer, sampleVideos);
        }

        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((read) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    private final void IconCompatParcelizer(long p0) {
        C0201setMcqCount.IconCompatParcelizer(this.write.IconCompatParcelizer(), null, null, new read(p0, null), 3);
    }

    @Override // kotlin.Guideline
    /* JADX INFO: renamed from: MediaMetadataCompat */
    public final boolean getWrite() {
        return this.MediaBrowserCompatItemReceiver.IconCompatParcelizer();
    }

    private final void onRewind() {
        if (this.RatingCompat == null) {
            this.RatingCompat = new setStatusBarBackgroundResource(this.MediaBrowserCompatItemReceiver, setTextFillColor.RemoteActionCompatParcelizer(this), new AudioAttributesCompatParcelizer(this), collectLongDefaults.write((Module) this));
        }
        setStatusBarBackgroundResource setstatusbarbackgroundresource = this.RatingCompat;
        if (setstatusbarbackgroundresource != null) {
            setstatusbarbackgroundresource.read(MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver());
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final /* synthetic */ class AudioAttributesCompatParcelizer extends downloadMagicModuleModule implements MagicModuleSubmissionRequestBody<UnsupportedTypeDeserializer, SampleVideos<? super getShowPopup>, Object>, getUserTimezone {
        @Override // kotlin.MagicModuleSubmissionRequestBody
        public final /* synthetic */ Object invoke(UnsupportedTypeDeserializer unsupportedTypeDeserializer, SampleVideos<? super getShowPopup> sampleVideos) {
            return read(unsupportedTypeDeserializer.getIconCompatParcelizer(), sampleVideos);
        }

        public final Object read(long j, SampleVideos<? super getShowPopup> sampleVideos) {
            return getExternalFilesDirs.read((getExternalFilesDirs) this.write, j, sampleVideos);
        }

        AudioAttributesCompatParcelizer(Object obj) {
            super(2, obj, getExternalFilesDirs.class, "onWheelScrollStopped", "onWheelScrollStopped-TH1AsA0(J)V", 4);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ Object read(getExternalFilesDirs getexternalfilesdirs, long j, SampleVideos sampleVideos) {
        getexternalfilesdirs.IconCompatParcelizer(j);
        return getShowPopup.INSTANCE;
    }

    public final void RemoteActionCompatParcelizer(getNoBackupFilesDir p0, superDispatchKeyEvent p1, setLastHorizontalStyle p2, boolean p3, boolean p4, CoordinatorLayout p5, hashCode p6, MotionTelltales p7) {
        boolean z;
        if (getRead() != p3) {
            this.AudioAttributesImplApi26Parcelizer.AudioAttributesCompatParcelizer(p3);
            this.IconCompatParcelizer.write(p3);
            z = true;
        } else {
            z = false;
        }
        boolean z2 = z;
        boolean zWrite = this.MediaBrowserCompatItemReceiver.write(p0, p1, p2, p4, p5 == null ? this.MediaBrowserCompatCustomActionResultReceiver : p5, this.write);
        this.AudioAttributesImplBaseParcelizer.write(p1, p4, p7);
        this.AudioAttributesCompatParcelizer = p2;
        this.read = p5;
        IconCompatParcelizer(getColor.IconCompatParcelizer(), p3, p6, this.MediaBrowserCompatItemReceiver.write() ? superDispatchKeyEvent.write : superDispatchKeyEvent.AudioAttributesCompatParcelizer, zWrite);
        if (z2) {
            RatingCompat();
            getValueNulls.write(this);
        }
    }

    @Override // o._handleOddName.IconCompatParcelizer
    public final void c_() {
        onSetPlaybackSpeed();
        setStatusBarBackgroundResource setstatusbarbackgroundresource = this.RatingCompat;
        if (setstatusbarbackgroundresource != null) {
            setstatusbarbackgroundresource.IconCompatParcelizer(collectLongDefaults.write((Module) this));
        }
    }

    private final void onSetPlaybackSpeed() {
        if (getRatingCompat()) {
            this.MediaBrowserCompatCustomActionResultReceiver.read(collectLongDefaults.write((Module) this));
        }
    }

    @Override // kotlin.Module, kotlin.forRootType
    public final void e_() {
        MediaBrowserCompatMediaItem();
        onSetPlaybackSpeed();
        setStatusBarBackgroundResource setstatusbarbackgroundresource = this.RatingCompat;
        if (setstatusbarbackgroundresource != null) {
            setstatusbarbackgroundresource.IconCompatParcelizer(collectLongDefaults.write((Module) this));
        }
    }

    @Override // kotlin.objectIdGeneratorInstance
    public final boolean write(KeyEvent p0) {
        long jAudioAttributesCompatParcelizer;
        if (!getRead() || ((!_quotedString.read(_throwSubtypeClassNotAllowed.IconCompatParcelizer(p0), _quotedString.INSTANCE.onPlay()) && !_quotedString.read(_throwSubtypeClassNotAllowed.IconCompatParcelizer(p0), _quotedString.INSTANCE.onPause())) || !_throwNotASubtype.read(_throwSubtypeClassNotAllowed.RemoteActionCompatParcelizer(p0), _throwNotASubtype.INSTANCE.read()) || _throwSubtypeClassNotAllowed.read(p0))) {
            return false;
        }
        if (this.MediaBrowserCompatItemReceiver.write()) {
            int mediaMetadataCompat = (int) this.AudioAttributesImplBaseParcelizer.getMediaMetadataCompat();
            long j = -1;
            jAudioAttributesCompatParcelizer = getReferencedType.AudioAttributesCompatParcelizer((((((long) 0) << 32) | (j - ((j >> 63) << 32))) & ((long) Float.floatToRawIntBits(_quotedString.read(_throwSubtypeClassNotAllowed.IconCompatParcelizer(p0), _quotedString.INSTANCE.onPause()) ? mediaMetadataCompat : -mediaMetadataCompat))) | (((long) Float.floatToRawIntBits(BitmapDescriptorFactory.HUE_RED)) << 32));
        } else {
            int mediaMetadataCompat2 = (int) (this.AudioAttributesImplBaseParcelizer.getMediaMetadataCompat() >> 32);
            long j2 = -1;
            jAudioAttributesCompatParcelizer = getReferencedType.AudioAttributesCompatParcelizer((((((long) 0) << 32) | (j2 - ((j2 >> 63) << 32))) & ((long) Float.floatToRawIntBits(BitmapDescriptorFactory.HUE_RED))) | (((long) Float.floatToRawIntBits(_quotedString.read(_throwSubtypeClassNotAllowed.IconCompatParcelizer(p0), _quotedString.INSTANCE.onPause()) ? mediaMetadataCompat2 : -mediaMetadataCompat2)) << 32));
        }
        C0201setMcqCount.IconCompatParcelizer(MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver(), null, null, new RemoteActionCompatParcelizer(jAudioAttributesCompatParcelizer, null), 3);
        return true;
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    static final class RemoteActionCompatParcelizer extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        final /* synthetic */ long AudioAttributesCompatParcelizer;
        int read;

        /* JADX INFO: renamed from: o.getExternalFilesDirs$RemoteActionCompatParcelizer$3, reason: invalid class name */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Landroidx/compose/foundation/gestures/NestedScrollScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        static final class AnonymousClass3 extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<shouldSkipDump, SampleVideos<? super getShowPopup>, Object> {
            final /* synthetic */ long RemoteActionCompatParcelizer;
            private /* synthetic */ Object read;
            int write;

            @Override // kotlin.getMonthName
            public final Object invokeSuspend(Object obj) {
                getYear.IconCompatParcelizer();
                if (this.write != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                SdkPayloadData.IconCompatParcelizer(obj);
                ((shouldSkipDump) this.read).write(this.RemoteActionCompatParcelizer, findCoercionAction.INSTANCE.AudioAttributesCompatParcelizer());
                return getShowPopup.INSTANCE;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass3(long j, SampleVideos<? super AnonymousClass3> sampleVideos) {
                super(2, sampleVideos);
                this.RemoteActionCompatParcelizer = j;
            }

            @Override // kotlin.getMonthName
            public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
                AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.RemoteActionCompatParcelizer, sampleVideos);
                anonymousClass3.read = obj;
                return anonymousClass3;
            }

            @Override // kotlin.MagicModuleSubmissionRequestBody
            /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
            public final Object invoke(shouldSkipDump shouldskipdump, SampleVideos<? super getShowPopup> sampleVideos) {
                return ((AnonymousClass3) create(shouldskipdump, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
            }
        }

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.read;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                this.read = 1;
                if (getExternalFilesDirs.this.MediaBrowserCompatItemReceiver.read(Flow.AudioAttributesCompatParcelizer, new AnonymousClass3(this.AudioAttributesCompatParcelizer, null), this) == objIconCompatParcelizer) {
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
        RemoteActionCompatParcelizer(long j, SampleVideos<? super RemoteActionCompatParcelizer> sampleVideos) {
            super(2, sampleVideos);
            this.AudioAttributesCompatParcelizer = j;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return getExternalFilesDirs.this.new RemoteActionCompatParcelizer(this.AudioAttributesCompatParcelizer, sampleVideos);
        }

        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
        public final Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((RemoteActionCompatParcelizer) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    @Override // kotlin.Guideline, kotlin.forRootType
    public final void write(DeserializationContext p0, _shapeForToken p1, long p2) {
        List<getArrayBuilders> listAudioAttributesCompatParcelizer = p0.AudioAttributesCompatParcelizer();
        int size = listAudioAttributesCompatParcelizer.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                break;
            }
            if (write().invoke(handleWeirdNumberValue.AudioAttributesCompatParcelizer(listAudioAttributesCompatParcelizer.get(i).getMediaBrowserCompatItemReceiver())).booleanValue()) {
                super.write(p0, p1, p2);
                break;
            }
            i++;
        }
        if (getRead()) {
            if (p1 == _shapeForToken.IconCompatParcelizer && constructCalendar.AudioAttributesCompatParcelizer(p0.getMediaBrowserCompatItemReceiver(), constructCalendar.INSTANCE.MediaBrowserCompatItemReceiver())) {
                onRewind();
            }
            setStatusBarBackgroundResource setstatusbarbackgroundresource = this.RatingCompat;
            if (setstatusbarbackgroundresource != null) {
                setstatusbarbackgroundresource.IconCompatParcelizer(p0, p1, p2);
            }
        }
    }

    @Override // kotlin.hasIndex
    public final void write(getConfigOverride getconfigoverride) {
        if (getRead() && (this.MediaBrowserCompatSearchResultReceiver == null || this.MediaBrowserCompatMediaItem == null)) {
            onSetShuffleMode();
        }
        MagicModuleSubmissionRequestBody<? super Float, ? super Float, Boolean> magicModuleSubmissionRequestBody = this.MediaBrowserCompatSearchResultReceiver;
        if (magicModuleSubmissionRequestBody != null) {
            MapperBuilder.RemoteActionCompatParcelizer$default(getconfigoverride, (String) null, magicModuleSubmissionRequestBody, 1, (Object) null);
        }
        MagicModuleSubmissionRequestBody<? super getReferencedType, ? super SampleVideos<? super getReferencedType>, ? extends Object> magicModuleSubmissionRequestBody2 = this.MediaBrowserCompatMediaItem;
        if (magicModuleSubmissionRequestBody2 != null) {
            MapperBuilder.AudioAttributesCompatParcelizer(getconfigoverride, magicModuleSubmissionRequestBody2);
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    static final class MediaBrowserCompatCustomActionResultReceiver extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        final /* synthetic */ float AudioAttributesCompatParcelizer;
        final /* synthetic */ float RemoteActionCompatParcelizer;
        int write;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.write;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                registerReceiver registerreceiver = getExternalFilesDirs.this.MediaBrowserCompatItemReceiver;
                float f = this.AudioAttributesCompatParcelizer;
                float f2 = this.RemoteActionCompatParcelizer;
                long jFloatToRawIntBits = Float.floatToRawIntBits(f);
                long jFloatToRawIntBits2 = Float.floatToRawIntBits(f2);
                long j = -1;
                this.write = 1;
                if (getColor.read(registerreceiver, getReferencedType.AudioAttributesCompatParcelizer((jFloatToRawIntBits << 32) | (jFloatToRawIntBits2 & ((((long) 0) << 32) | (j - ((j >> 63) << 32))))), this) == objIconCompatParcelizer) {
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
        MediaBrowserCompatCustomActionResultReceiver(float f, float f2, SampleVideos<? super MediaBrowserCompatCustomActionResultReceiver> sampleVideos) {
            super(2, sampleVideos);
            this.AudioAttributesCompatParcelizer = f;
            this.RemoteActionCompatParcelizer = f2;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return getExternalFilesDirs.this.new MediaBrowserCompatCustomActionResultReceiver(this.AudioAttributesCompatParcelizer, this.RemoteActionCompatParcelizer, sampleVideos);
        }

        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((MediaBrowserCompatCustomActionResultReceiver) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    private final void onSetShuffleMode() {
        this.MediaBrowserCompatSearchResultReceiver = new MagicModuleSubmissionRequestBody() { // from class: o.getSystemServiceName
            @Override // kotlin.MagicModuleSubmissionRequestBody
            public final Object invoke(Object obj, Object obj2) {
                return Boolean.valueOf(getExternalFilesDirs.AudioAttributesCompatParcelizer(this.read, ((Float) obj).floatValue(), ((Float) obj2).floatValue()));
            }
        };
        this.MediaBrowserCompatMediaItem = new AudioAttributesImplBaseParcelizer(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean AudioAttributesCompatParcelizer(getExternalFilesDirs getexternalfilesdirs, float f, float f2) {
        C0201setMcqCount.IconCompatParcelizer(getexternalfilesdirs.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver(), null, null, getexternalfilesdirs.new MediaBrowserCompatCustomActionResultReceiver(f, f2, null), 3);
        return true;
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", "Landroidx/compose/ui/geometry/Offset;", "offset"}, k = 3, mv = {2, 0, 0}, xi = 48)
    static final class AudioAttributesImplBaseParcelizer extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<getReferencedType, SampleVideos<? super getReferencedType>, Object> {
        int AudioAttributesCompatParcelizer;
        /* synthetic */ long write;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.AudioAttributesCompatParcelizer;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                SdkPayloadData.IconCompatParcelizer(obj);
                return obj;
            }
            SdkPayloadData.IconCompatParcelizer(obj);
            long j = this.write;
            this.AudioAttributesCompatParcelizer = 1;
            Object obj2 = getColor.read(getExternalFilesDirs.this.MediaBrowserCompatItemReceiver, j, this);
            return obj2 == objIconCompatParcelizer ? objIconCompatParcelizer : obj2;
        }

        AudioAttributesImplBaseParcelizer(SampleVideos<? super AudioAttributesImplBaseParcelizer> sampleVideos) {
            super(2, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            AudioAttributesImplBaseParcelizer audioAttributesImplBaseParcelizer = getExternalFilesDirs.this.new AudioAttributesImplBaseParcelizer(sampleVideos);
            audioAttributesImplBaseParcelizer.write = ((getReferencedType) obj).getWrite();
            return audioAttributesImplBaseParcelizer;
        }

        @Override // kotlin.MagicModuleSubmissionRequestBody
        public final /* synthetic */ Object invoke(getReferencedType getreferencedtype, SampleVideos<? super getReferencedType> sampleVideos) {
            return read(getreferencedtype.getWrite(), sampleVideos);
        }

        public final Object read(long j, SampleVideos<? super getReferencedType> sampleVideos) {
            return ((AudioAttributesImplBaseParcelizer) create(getReferencedType.read(j), sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    private final void RatingCompat() {
        this.MediaBrowserCompatSearchResultReceiver = null;
        this.MediaBrowserCompatMediaItem = null;
    }
}
