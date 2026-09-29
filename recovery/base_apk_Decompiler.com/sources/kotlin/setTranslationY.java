package kotlin;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.parseDigitsRecursive;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J<\u0010\r\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00062\"\u0010\f\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u0007H\u0096@¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J(\u0010\r\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0012H\u0086@¢\u0006\u0004\b\r\u0010\u0013R+\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00028G@CX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0016\u0010\u0005R$\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00028G@AX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0019\u0010\u0017\"\u0004\b\r\u0010\u0005R%\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00028F@AX\u0087\u008e\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u0015\"\u0004\b\u0018\u0010\u0005R%\u0010\r\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00028@@AX\u0081\u008e\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u0015\"\u0004\b\u001c\u0010\u0005R\u001a\u0010\u001c\u001a\u00020\u001d8\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u001e\u001a\u0004\b\u0010\u0010\u001fR\u0016\u0010!\u001a\u00020 8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u0015R\u0016\u0010\u0016\u001a\u00020\u000f8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\"R\u0014\u0010$\u001a\u00020\u00018\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b!\u0010#R\u0014\u0010'\u001a\u00020%8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010&R\u0014\u0010\u001b\u001a\u00020(8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010)R\u001b\u0010+\u001a\u00020(8WX\u0097\u0084\u0002¢\u0006\f\n\u0004\b$\u0010*\u001a\u0004\b\r\u0010)R\u001b\u0010\u0014\u001a\u00020(8WX\u0097\u0084\u0002¢\u0006\f\n\u0004\b'\u0010*\u001a\u0004\b\u001c\u0010)"}, d2 = {"Lo/setTranslationY;", "Lo/getNoBackupFilesDir;", "", "p0", "<init>", "(I)V", "Lo/Flow;", "Lkotlin/Function2;", "Lo/checkSelfPermission;", "Lo/SampleVideos;", "", "", "p1", "AudioAttributesCompatParcelizer", "(Lo/Flow;Lo/MagicModuleSubmissionRequestBody;Lo/SampleVideos;)Ljava/lang/Object;", "", "RemoteActionCompatParcelizer", "(F)F", "Lo/setOrientation;", "(ILo/setOrientation;Lo/SampleVideos;)Ljava/lang/Object;", "MediaBrowserCompatSearchResultReceiver", "Lo/hasMoreBytes;", "MediaBrowserCompatItemReceiver", "()I", "write", "IconCompatParcelizer", "RatingCompat", "AudioAttributesImplApi26Parcelizer", "read", "Lo/hashCode;", "Lo/hashCode;", "()Lo/hashCode;", "Lo/hasMoreBytes;", "MediaBrowserCompatCustomActionResultReceiver", "F", "Lo/getNoBackupFilesDir;", "AudioAttributesImplApi21Parcelizer", "Lo/setTranslationY$RemoteActionCompatParcelizer;", "Lo/setTranslationY$RemoteActionCompatParcelizer;", "AudioAttributesImplBaseParcelizer", "", "()Z", "Lo/parseDouble;", "MediaDescriptionCompat"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class setTranslationY implements getNoBackupFilesDir {

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final parseManyDecDigits<setTranslationY, ?> read = JavaDoubleBitsFromByteArray.RemoteActionCompatParcelizer(new MagicModuleSubmissionRequestBody() { // from class: o.setScaleX
        @Override // kotlin.MagicModuleSubmissionRequestBody
        public final Object invoke(Object obj, Object obj2) {
            return setTranslationY.RemoteActionCompatParcelizer((JavaDoubleBitsFromCharSequence) obj, (setTranslationY) obj2);
        }
    }, new getAnswerMap() { // from class: o.MotionHelper
        @Override // kotlin.getAnswerMap
        public final Object invoke(Object obj) {
            return setTranslationY.RemoteActionCompatParcelizer(((Integer) obj).intValue());
        }
    });

    /* JADX INFO: renamed from: MediaBrowserCompatSearchResultReceiver, reason: from kotlin metadata */
    private final hasMoreBytes write;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private float MediaBrowserCompatItemReceiver;

    /* JADX INFO: renamed from: RatingCompat, reason: from kotlin metadata */
    private final hasMoreBytes IconCompatParcelizer = _appendByte.RemoteActionCompatParcelizer(0);

    /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: from kotlin metadata */
    private final hasMoreBytes AudioAttributesCompatParcelizer = _appendByte.RemoteActionCompatParcelizer(0);

    /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: from kotlin metadata */
    private final hashCode read = isConsumed.RemoteActionCompatParcelizer();

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private hasMoreBytes MediaBrowserCompatCustomActionResultReceiver = _appendByte.RemoteActionCompatParcelizer(Integer.MAX_VALUE);

    /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from kotlin metadata */
    private final getNoBackupFilesDir AudioAttributesImplApi21Parcelizer = C0193obtainAndCheckReceiverPermission.IconCompatParcelizer(new getAnswerMap() { // from class: o.setScaleY
        @Override // kotlin.getAnswerMap
        public final Object invoke(Object obj) {
            return Float.valueOf(setTranslationY.IconCompatParcelizer(this.write, ((Float) obj).floatValue()));
        }
    });

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final RemoteActionCompatParcelizer AudioAttributesImplBaseParcelizer = new RemoteActionCompatParcelizer();

    /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: from kotlin metadata */
    private final parseDouble MediaDescriptionCompat = _qbuf.RemoteActionCompatParcelizer(new getCreatedOnDateMs() { // from class: o.setRotation
        @Override // kotlin.getCreatedOnDateMs
        public final Object invoke() {
            return Boolean.valueOf(setTranslationY.AudioAttributesCompatParcelizer(this.IconCompatParcelizer));
        }
    });

    /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: from kotlin metadata */
    private final parseDouble MediaBrowserCompatSearchResultReceiver = _qbuf.RemoteActionCompatParcelizer(new getCreatedOnDateMs() { // from class: o.setTranslationX
        @Override // kotlin.getCreatedOnDateMs
        public final Object invoke() {
            return Boolean.valueOf(setTranslationY.write(this.RemoteActionCompatParcelizer));
        }
    });

    public setTranslationY(int i) {
        this.write = _appendByte.RemoteActionCompatParcelizer(i);
    }

    private final void MediaBrowserCompatItemReceiver(int i) {
        this.write.read(i);
    }

    public final int MediaBrowserCompatItemReceiver() {
        return this.write.IconCompatParcelizer();
    }

    public final int IconCompatParcelizer() {
        return this.MediaBrowserCompatCustomActionResultReceiver.IconCompatParcelizer();
    }

    public final void AudioAttributesCompatParcelizer(int i) {
        this.MediaBrowserCompatCustomActionResultReceiver.read(i);
        parseDigitsRecursive.Companion companion = parseDigitsRecursive.INSTANCE;
        parseDigitsRecursive parsedigitsrecursiveIconCompatParcelizer = companion.IconCompatParcelizer();
        getAnswerMap<Object, getShowPopup> getanswermapAudioAttributesImplApi26Parcelizer = parsedigitsrecursiveIconCompatParcelizer != null ? parsedigitsrecursiveIconCompatParcelizer.AudioAttributesImplApi26Parcelizer() : null;
        parseDigitsRecursive parsedigitsrecursive = companion.read(parsedigitsrecursiveIconCompatParcelizer);
        try {
            if (MediaBrowserCompatItemReceiver() > i) {
                MediaBrowserCompatItemReceiver(i);
            }
            getShowPopup getshowpopup = getShowPopup.INSTANCE;
        } finally {
            companion.AudioAttributesCompatParcelizer(parsedigitsrecursiveIconCompatParcelizer, parsedigitsrecursive, getanswermapAudioAttributesImplApi26Parcelizer);
        }
    }

    public final void write(int i) {
        this.IconCompatParcelizer.read(i);
    }

    public final void read(int i) {
        this.AudioAttributesCompatParcelizer.read(i);
    }

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from getter */
    public final hashCode getRead() {
        return this.read;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float IconCompatParcelizer(setTranslationY settranslationy, float f) {
        float fMediaBrowserCompatItemReceiver = settranslationy.MediaBrowserCompatItemReceiver() + f + settranslationy.MediaBrowserCompatItemReceiver;
        float f2 = getQues.read(fMediaBrowserCompatItemReceiver, BitmapDescriptorFactory.HUE_RED, settranslationy.IconCompatParcelizer());
        boolean z = fMediaBrowserCompatItemReceiver == f2;
        float fMediaBrowserCompatItemReceiver2 = f2 - settranslationy.MediaBrowserCompatItemReceiver();
        int iRound = Math.round(fMediaBrowserCompatItemReceiver2);
        settranslationy.MediaBrowserCompatItemReceiver(settranslationy.MediaBrowserCompatItemReceiver() + iRound);
        settranslationy.MediaBrowserCompatItemReceiver = fMediaBrowserCompatItemReceiver2 - iRound;
        return !z ? fMediaBrowserCompatItemReceiver2 : f;
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b\n\u0018\u00002\u00020\u0001"}, d2 = {"Lo/setTranslationY$RemoteActionCompatParcelizer;", "Lo/setPaddingTop;"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class RemoteActionCompatParcelizer implements setPaddingTop {
        RemoteActionCompatParcelizer() {
        }
    }

    @Override // kotlin.getNoBackupFilesDir
    public final Object AudioAttributesCompatParcelizer(Flow flow, MagicModuleSubmissionRequestBody<? super checkSelfPermission, ? super SampleVideos<? super getShowPopup>, ? extends Object> magicModuleSubmissionRequestBody, SampleVideos<? super getShowPopup> sampleVideos) {
        Object objAudioAttributesCompatParcelizer = this.AudioAttributesImplApi21Parcelizer.AudioAttributesCompatParcelizer(flow, magicModuleSubmissionRequestBody, sampleVideos);
        return objAudioAttributesCompatParcelizer == getYear.IconCompatParcelizer() ? objAudioAttributesCompatParcelizer : getShowPopup.INSTANCE;
    }

    @Override // kotlin.getNoBackupFilesDir
    public final float RemoteActionCompatParcelizer(float p0) {
        return this.AudioAttributesImplApi21Parcelizer.RemoteActionCompatParcelizer(p0);
    }

    @Override // kotlin.getNoBackupFilesDir
    public final boolean AudioAttributesImplApi26Parcelizer() {
        return this.AudioAttributesImplApi21Parcelizer.AudioAttributesImplApi26Parcelizer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean AudioAttributesCompatParcelizer(setTranslationY settranslationy) {
        return settranslationy.MediaBrowserCompatItemReceiver() < settranslationy.IconCompatParcelizer();
    }

    @Override // kotlin.getNoBackupFilesDir
    public final boolean AudioAttributesCompatParcelizer() {
        return ((Boolean) this.MediaDescriptionCompat.getRemoteActionCompatParcelizer()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean write(setTranslationY settranslationy) {
        return settranslationy.MediaBrowserCompatItemReceiver() > 0;
    }

    @Override // kotlin.getNoBackupFilesDir
    public final boolean read() {
        return ((Boolean) this.MediaBrowserCompatSearchResultReceiver.getRemoteActionCompatParcelizer()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object AudioAttributesCompatParcelizer$default(setTranslationY settranslationy, int i, setOrientation setorientation, SampleVideos sampleVideos, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            setorientation = new setNavigationOnClickListener(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, null, 7, null);
        }
        return settranslationy.AudioAttributesCompatParcelizer(i, (setOrientation<Float>) setorientation, (SampleVideos<? super getShowPopup>) sampleVideos);
    }

    public final Object AudioAttributesCompatParcelizer(int i, setOrientation<Float> setorientation, SampleVideos<? super getShowPopup> sampleVideos) {
        Object objIconCompatParcelizer = createFilesDir.IconCompatParcelizer(this, i - MediaBrowserCompatItemReceiver(), setorientation, sampleVideos);
        return objIconCompatParcelizer == getYear.IconCompatParcelizer() ? objIconCompatParcelizer : getShowPopup.INSTANCE;
    }

    /* JADX INFO: renamed from: o.setTranslationY$IconCompatParcelizer, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R!\u0010\t\u001a\f\u0012\u0004\u0012\u00020\u0005\u0012\u0002\b\u00030\u00048\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b"}, d2 = {"Lo/setTranslationY$IconCompatParcelizer;", "", "<init>", "()V", "Lo/parseManyDecDigits;", "Lo/setTranslationY;", "read", "Lo/parseManyDecDigits;", "()Lo/parseManyDecDigits;", "RemoteActionCompatParcelizer"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final parseManyDecDigits<setTranslationY, ?> read() {
            return setTranslationY.read;
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Integer RemoteActionCompatParcelizer(JavaDoubleBitsFromCharSequence javaDoubleBitsFromCharSequence, setTranslationY settranslationy) {
        return Integer.valueOf(settranslationy.MediaBrowserCompatItemReceiver());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final setTranslationY RemoteActionCompatParcelizer(int i) {
        return new setTranslationY(i);
    }
}
