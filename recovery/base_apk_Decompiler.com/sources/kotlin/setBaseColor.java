package kotlin;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.setBaseColor;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tH\u0086@¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011R \u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00128\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0010\u001a\u00020\u00058G¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0017R\u0011\u0010\n\u001a\u00020\u00028G¢\u0006\u0006\u001a\u0004\b\n\u0010\u0018R\u001e\u0010\r\u001a\u0004\u0018\u00010\u000f8\u0000@\u0001X\u0081\u000e¢\u0006\f\n\u0004\b\r\u0010\u0019\"\u0004\b\n\u0010\u001a"}, d2 = {"Lo/setBaseColor;", "", "Lo/offset;", "p0", "Lkotlin/Function1;", "", "p1", "<init>", "(Lo/offset;Lo/getAnswerMap;)V", "", "RemoteActionCompatParcelizer", "(Lo/SampleVideos;)Ljava/lang/Object;", "", "write", "()F", "Lo/bufferMapProperty;", "AudioAttributesCompatParcelizer", "()Lo/bufferMapProperty;", "Lo/Glide;", "read", "Lo/Glide;", "IconCompatParcelizer", "()Lo/Glide;", "()Z", "()Lo/offset;", "Lo/bufferMapProperty;", "(Lo/bufferMapProperty;)V"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class setBaseColor {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final Glide<offset> IconCompatParcelizer;
    private bufferMapProperty write;

    public setBaseColor(offset offsetVar, getAnswerMap<? super offset, Boolean> getanswermap) {
        this.IconCompatParcelizer = new Glide<>(offsetVar, new getAnswerMap() { // from class: o.updateShader
            @Override // kotlin.getAnswerMap
            public final Object invoke(Object obj) {
                return Float.valueOf(setBaseColor.RemoteActionCompatParcelizer(this.write, ((Float) obj).floatValue()));
            }
        }, new getCreatedOnDateMs() { // from class: o.getOpacity
            @Override // kotlin.getCreatedOnDateMs
            public final Object invoke() {
                return Float.valueOf(setBaseColor.RemoteActionCompatParcelizer(this.write));
            }
        }, setAutoStart.write, getanswermap);
    }

    public final Glide<offset> IconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float RemoteActionCompatParcelizer(setBaseColor setbasecolor, float f) {
        return setbasecolor.AudioAttributesCompatParcelizer().AudioAttributesCompatParcelizer(setAutoStart.IconCompatParcelizer);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float RemoteActionCompatParcelizer(setBaseColor setbasecolor) {
        return setbasecolor.AudioAttributesCompatParcelizer().AudioAttributesCompatParcelizer(setAutoStart.RemoteActionCompatParcelizer);
    }

    public final boolean read() {
        return RemoteActionCompatParcelizer() == offset.AudioAttributesCompatParcelizer;
    }

    public final offset RemoteActionCompatParcelizer() {
        return this.IconCompatParcelizer.AudioAttributesCompatParcelizer();
    }

    public final Object RemoteActionCompatParcelizer(SampleVideos<? super getShowPopup> sampleVideos) {
        Object objWrite$default = LottieAnimationViewSavedState.write$default(this.IconCompatParcelizer, offset.write, BitmapDescriptorFactory.HUE_RED, sampleVideos, 2, null);
        return objWrite$default == getYear.IconCompatParcelizer() ? objWrite$default : getShowPopup.INSTANCE;
    }

    public final float write() {
        return this.IconCompatParcelizer.MediaMetadataCompat();
    }

    public final void RemoteActionCompatParcelizer(bufferMapProperty buffermapproperty) {
        this.write = buffermapproperty;
    }

    private final bufferMapProperty AudioAttributesCompatParcelizer() {
        bufferMapProperty buffermapproperty = this.write;
        if (buffermapproperty != null) {
            return buffermapproperty;
        }
        StringBuilder sb = new StringBuilder("The density on DrawerState (");
        sb.append(this);
        sb.append(") was not set. Did you use DrawerState with the Drawer composable?");
        throw new IllegalArgumentException(sb.toString().toString());
    }

    /* JADX INFO: renamed from: o.setBaseColor$AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J-\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00050\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"Lo/setBaseColor$AudioAttributesCompatParcelizer;", "", "<init>", "()V", "Lkotlin/Function1;", "Lo/offset;", "", "p0", "Lo/parseManyDecDigits;", "Lo/setBaseColor;", "AudioAttributesCompatParcelizer", "(Lo/getAnswerMap;)Lo/parseManyDecDigits;"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final parseManyDecDigits<setBaseColor, offset> AudioAttributesCompatParcelizer(final getAnswerMap<? super offset, Boolean> p0) {
            return JavaDoubleBitsFromByteArray.RemoteActionCompatParcelizer(new MagicModuleSubmissionRequestBody() { // from class: o.updateValueAnimator
                @Override // kotlin.MagicModuleSubmissionRequestBody
                public final Object invoke(Object obj, Object obj2) {
                    return setBaseColor.Companion.RemoteActionCompatParcelizer((JavaDoubleBitsFromCharSequence) obj, (setBaseColor) obj2);
                }
            }, new getAnswerMap() { // from class: o.draw
                @Override // kotlin.getAnswerMap
                public final Object invoke(Object obj) {
                    return setBaseColor.Companion.IconCompatParcelizer(p0, (offset) obj);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final offset RemoteActionCompatParcelizer(JavaDoubleBitsFromCharSequence javaDoubleBitsFromCharSequence, setBaseColor setbasecolor) {
            return setbasecolor.RemoteActionCompatParcelizer();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final setBaseColor IconCompatParcelizer(getAnswerMap getanswermap, offset offsetVar) {
            return new setBaseColor(offsetVar, getanswermap);
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }
}
