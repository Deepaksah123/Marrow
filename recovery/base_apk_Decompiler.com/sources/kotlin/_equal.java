package kotlin;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin._equal;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012BG\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fH\u0086@¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u000fH\u0080@¢\u0006\u0004\b\u0012\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u000fH\u0086@¢\u0006\u0004\b\u0013\u0010\u0011J\u0010\u0010\u0014\u001a\u00020\u000fH\u0080@¢\u0006\u0004\b\u0014\u0010\u0011J\"\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\nH\u0080@¢\u0006\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0000X\u0080\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0016R\u001a\u0010\u0013\u001a\u00020\u00078\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0018\u001a\u0004\b\u0013\u0010\u0019R \u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00020\u001a8\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u001b\u001a\u0004\b\u0012\u0010\u001cR\u0011\u0010\u0014\u001a\u00020\u00028G¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u001dR\u0011\u0010\u0010\u001a\u00020\u00028G¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u001dR\u0011\u0010\u001e\u001a\u00020\u00078G¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u0019R\u0014\u0010\u001f\u001a\u00020\u00078AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0019"}, d2 = {"Lo/_equal;", "", "Lo/getPattern;", "p0", "Lo/bufferMapProperty;", "p1", "Lkotlin/Function1;", "", "p2", "Lo/setOrientation;", "", "p3", "p4", "<init>", "(Lo/getPattern;Lo/bufferMapProperty;Lo/getAnswerMap;Lo/setOrientation;Z)V", "", "read", "(Lo/SampleVideos;)Ljava/lang/Object;", "write", "IconCompatParcelizer", "AudioAttributesCompatParcelizer", "(Lo/getPattern;FLo/SampleVideos;)Ljava/lang/Object;", "Lo/setOrientation;", "RemoteActionCompatParcelizer", "Z", "()Z", "Lo/Glide;", "Lo/Glide;", "()Lo/Glide;", "()Lo/getPattern;", "AudioAttributesImplApi26Parcelizer", "MediaBrowserCompatCustomActionResultReceiver"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class _equal {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final setOrientation<Float> RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final Glide<getPattern> write;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final boolean IconCompatParcelizer;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int IconCompatParcelizer = 8;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] RemoteActionCompatParcelizer;

        static {
            int[] iArr = new int[getPattern.values().length];
            try {
                iArr[getPattern.AudioAttributesCompatParcelizer.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            RemoteActionCompatParcelizer = iArr;
        }
    }

    public _equal(getPattern getpattern, final bufferMapProperty buffermapproperty, getAnswerMap<? super getPattern, Boolean> getanswermap, setOrientation<Float> setorientation, boolean z) {
        this.RemoteActionCompatParcelizer = setorientation;
        this.IconCompatParcelizer = z;
        this.write = new Glide<>(getpattern, new getAnswerMap() { // from class: o.JsonFormatValue
            @Override // kotlin.getAnswerMap
            public final Object invoke(Object obj) {
                return Float.valueOf(_equal.read(buffermapproperty, ((Float) obj).floatValue()));
            }
        }, new getCreatedOnDateMs() { // from class: o.isNumeric
            @Override // kotlin.getCreatedOnDateMs
            public final Object invoke() {
                return Float.valueOf(_equal.AudioAttributesCompatParcelizer(buffermapproperty));
            }
        }, setorientation, getanswermap);
        if (z && getpattern == getPattern.IconCompatParcelizer) {
            throw new IllegalArgumentException("The initial value must not be set to HalfExpanded if skipHalfExpanded is set to true.".toString());
        }
    }

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from getter */
    public final boolean getIconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    public final Glide<getPattern> write() {
        return this.write;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float read(bufferMapProperty buffermapproperty, float f) {
        return buffermapproperty.AudioAttributesCompatParcelizer(mode.read);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float AudioAttributesCompatParcelizer(bufferMapProperty buffermapproperty) {
        return buffermapproperty.AudioAttributesCompatParcelizer(mode.AudioAttributesCompatParcelizer);
    }

    public final getPattern RemoteActionCompatParcelizer() {
        return this.write.AudioAttributesCompatParcelizer();
    }

    public final getPattern read() {
        return this.write.MediaBrowserCompatCustomActionResultReceiver();
    }

    public final boolean AudioAttributesImplApi26Parcelizer() {
        return this.write.AudioAttributesCompatParcelizer() != getPattern.AudioAttributesCompatParcelizer;
    }

    public final boolean AudioAttributesCompatParcelizer() {
        return this.write.read().RemoteActionCompatParcelizer(getPattern.IconCompatParcelizer);
    }

    public final Object read(SampleVideos<? super getShowPopup> sampleVideos) {
        getPattern getpattern;
        boolean zRemoteActionCompatParcelizer = this.write.read().RemoteActionCompatParcelizer(getPattern.RemoteActionCompatParcelizer);
        if (WhenMappings.RemoteActionCompatParcelizer[RemoteActionCompatParcelizer().ordinal()] == 1) {
            getpattern = AudioAttributesCompatParcelizer() ? getPattern.IconCompatParcelizer : getPattern.RemoteActionCompatParcelizer;
        } else {
            getpattern = zRemoteActionCompatParcelizer ? getPattern.RemoteActionCompatParcelizer : getPattern.AudioAttributesCompatParcelizer;
        }
        Object objAudioAttributesCompatParcelizer$default = AudioAttributesCompatParcelizer$default(this, getpattern, BitmapDescriptorFactory.HUE_RED, sampleVideos, 2, null);
        return objAudioAttributesCompatParcelizer$default == getYear.IconCompatParcelizer() ? objAudioAttributesCompatParcelizer$default : getShowPopup.INSTANCE;
    }

    public final Object write(SampleVideos<? super getShowPopup> sampleVideos) {
        if (!AudioAttributesCompatParcelizer()) {
            return getShowPopup.INSTANCE;
        }
        Object objAudioAttributesCompatParcelizer$default = AudioAttributesCompatParcelizer$default(this, getPattern.IconCompatParcelizer, BitmapDescriptorFactory.HUE_RED, sampleVideos, 2, null);
        return objAudioAttributesCompatParcelizer$default == getYear.IconCompatParcelizer() ? objAudioAttributesCompatParcelizer$default : getShowPopup.INSTANCE;
    }

    public final Object IconCompatParcelizer(SampleVideos<? super getShowPopup> sampleVideos) {
        Object objAudioAttributesCompatParcelizer$default = AudioAttributesCompatParcelizer$default(this, getPattern.AudioAttributesCompatParcelizer, BitmapDescriptorFactory.HUE_RED, sampleVideos, 2, null);
        return objAudioAttributesCompatParcelizer$default == getYear.IconCompatParcelizer() ? objAudioAttributesCompatParcelizer$default : getShowPopup.INSTANCE;
    }

    public final Object AudioAttributesCompatParcelizer(SampleVideos<? super getShowPopup> sampleVideos) {
        if (!this.write.read().RemoteActionCompatParcelizer(getPattern.RemoteActionCompatParcelizer)) {
            return getShowPopup.INSTANCE;
        }
        Object objAudioAttributesCompatParcelizer$default = AudioAttributesCompatParcelizer$default(this, getPattern.RemoteActionCompatParcelizer, BitmapDescriptorFactory.HUE_RED, sampleVideos, 2, null);
        return objAudioAttributesCompatParcelizer$default == getYear.IconCompatParcelizer() ? objAudioAttributesCompatParcelizer$default : getShowPopup.INSTANCE;
    }

    public static /* synthetic */ Object AudioAttributesCompatParcelizer$default(_equal _equalVar, getPattern getpattern, float f, SampleVideos sampleVideos, int i, Object obj) {
        if ((i & 2) != 0) {
            f = _equalVar.write.AudioAttributesImplApi21Parcelizer();
        }
        return _equalVar.AudioAttributesCompatParcelizer(getpattern, f, sampleVideos);
    }

    public final Object AudioAttributesCompatParcelizer(getPattern getpattern, float f, SampleVideos<? super getShowPopup> sampleVideos) {
        Object objWrite = LottieAnimationViewSavedState.write(this.write, getpattern, f, sampleVideos);
        return objWrite == getYear.IconCompatParcelizer() ? objWrite : getShowPopup.INSTANCE;
    }

    /* JADX INFO: renamed from: o._equal$write, reason: from kotlin metadata */
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JI\u0010\u0010\u001a\f\u0012\u0004\u0012\u00020\u000f\u0012\u0002\b\u00030\u000e2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00072\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u0010\u0010\u0011"}, d2 = {"Lo/_equal$write;", "", "<init>", "()V", "Lo/setOrientation;", "", "p0", "Lkotlin/Function1;", "Lo/getPattern;", "", "p1", "p2", "Lo/bufferMapProperty;", "p3", "Lo/parseManyDecDigits;", "Lo/_equal;", "read", "(Lo/setOrientation;Lo/getAnswerMap;ZLo/bufferMapProperty;)Lo/parseManyDecDigits;"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final parseManyDecDigits<_equal, ?> read(final setOrientation<Float> p0, final getAnswerMap<? super getPattern, Boolean> p1, final boolean p2, final bufferMapProperty p3) {
            return JavaDoubleBitsFromByteArray.RemoteActionCompatParcelizer(new MagicModuleSubmissionRequestBody() { // from class: o.merge
                @Override // kotlin.MagicModuleSubmissionRequestBody
                public final Object invoke(Object obj, Object obj2) {
                    return _equal.Companion.write((JavaDoubleBitsFromCharSequence) obj, (_equal) obj2);
                }
            }, new getAnswerMap() { // from class: o.getLenient
                @Override // kotlin.getAnswerMap
                public final Object invoke(Object obj) {
                    return _equal.Companion.AudioAttributesCompatParcelizer(p3, p1, p0, p2, (getPattern) obj);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final getPattern write(JavaDoubleBitsFromCharSequence javaDoubleBitsFromCharSequence, _equal _equalVar) {
            return _equalVar.RemoteActionCompatParcelizer();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final _equal AudioAttributesCompatParcelizer(bufferMapProperty buffermapproperty, getAnswerMap getanswermap, setOrientation setorientation, boolean z, getPattern getpattern) {
            return new _equal(getpattern, buffermapproperty, getanswermap, setorientation, z);
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }
}
