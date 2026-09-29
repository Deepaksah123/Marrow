package kotlin;

import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0002\u0018\u0000 \r2\u00020\u0001:\u0001\rB%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006¢\u0006\u0004\b\b\u0010\tR(\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00060\n8\u0007@\u0006X\u0086\f¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u0012\u001a\u00020\u00028WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011"}, d2 = {"Lo/setVideoEffects;", "Lo/ApicFrame;", "", "p0", "", "p1", "Lkotlin/Function0;", "p2", "<init>", "(IFLo/getCreatedOnDateMs;)V", "Lo/InputAccessor;", "AudioAttributesImplApi21Parcelizer", "Lo/InputAccessor;", "IconCompatParcelizer", "()Lo/InputAccessor;", "AudioAttributesCompatParcelizer", "write", "()I", "read"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class setVideoEffects extends ApicFrame {

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final parseManyDecDigits<setVideoEffects, ?> MediaBrowserCompatCustomActionResultReceiver = squarePointwise.IconCompatParcelizer(new MagicModuleSubmissionRequestBody() { // from class: o.createTimelineForLive
        @Override // kotlin.MagicModuleSubmissionRequestBody
        public final Object invoke(Object obj, Object obj2) {
            return setVideoEffects.AudioAttributesCompatParcelizer((JavaDoubleBitsFromCharSequence) obj, (setVideoEffects) obj2);
        }
    }, new getAnswerMap() { // from class: o.setWakeMode
        @Override // kotlin.getAnswerMap
        public final Object invoke(Object obj) {
            return setVideoEffects.RemoteActionCompatParcelizer((List) obj);
        }
    });

    /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: from kotlin metadata */
    private InputAccessor<getCreatedOnDateMs<Integer>> AudioAttributesCompatParcelizer;

    public setVideoEffects(int i, float f, getCreatedOnDateMs<Integer> getcreatedondatems) {
        super(i, f);
        this.AudioAttributesCompatParcelizer = available.RemoteActionCompatParcelizer$default(getcreatedondatems, null, 2, null);
    }

    public final InputAccessor<getCreatedOnDateMs<Integer>> IconCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    @Override // kotlin.ApicFrame
    public final int write() {
        return this.AudioAttributesCompatParcelizer.getRemoteActionCompatParcelizer().invoke().intValue();
    }

    /* JADX INFO: renamed from: o.setVideoEffects$IconCompatParcelizer, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R!\u0010\n\u001a\f\u0012\u0004\u0012\u00020\u0005\u0012\u0002\b\u00030\u00048\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t"}, d2 = {"Lo/setVideoEffects$IconCompatParcelizer;", "", "<init>", "()V", "Lo/parseManyDecDigits;", "Lo/setVideoEffects;", "MediaBrowserCompatCustomActionResultReceiver", "Lo/parseManyDecDigits;", "read", "()Lo/parseManyDecDigits;", "RemoteActionCompatParcelizer"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final parseManyDecDigits<setVideoEffects, ?> read() {
            return setVideoEffects.MediaBrowserCompatCustomActionResultReceiver;
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List AudioAttributesCompatParcelizer(JavaDoubleBitsFromCharSequence javaDoubleBitsFromCharSequence, setVideoEffects setvideoeffects) {
        return IntermediateLoginResponseBody.RemoteActionCompatParcelizer(Integer.valueOf(setvideoeffects.AudioAttributesImplApi21Parcelizer()), Float.valueOf(getQues.read(setvideoeffects.MediaDescriptionCompat(), -0.5f, 0.5f)), Integer.valueOf(setvideoeffects.write()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final setVideoEffects RemoteActionCompatParcelizer(final List list) {
        Object obj = list.get(0);
        toMagicModuleMetaRepoModel.read(obj, "");
        int iIntValue = ((Integer) obj).intValue();
        Object obj2 = list.get(1);
        toMagicModuleMetaRepoModel.read(obj2, "");
        return new setVideoEffects(iIntValue, ((Float) obj2).floatValue(), new getCreatedOnDateMs() { // from class: o.HlsMediaSource
            @Override // kotlin.getCreatedOnDateMs
            public final Object invoke() {
                return Integer.valueOf(setVideoEffects.read(list));
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int read(List list) {
        Object obj = list.get(2);
        toMagicModuleMetaRepoModel.read(obj, "");
        return ((Integer) obj).intValue();
    }
}
