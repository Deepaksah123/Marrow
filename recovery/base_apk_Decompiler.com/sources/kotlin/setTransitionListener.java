package kotlin;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a'\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001H\u0000¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lo/_handleOddName;", "Lkotlin/Function1;", "Lo/getReferencedType;", "", "p0", "IconCompatParcelizer", "(Lo/_handleOddName;Lo/getAnswerMap;)Lo/_handleOddName;"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class setTransitionListener {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class read implements PointerInputEventHandler {
        final /* synthetic */ getAnswerMap<getReferencedType, getShowPopup> write;

        @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
        public final Object invoke(handleBadMerge handlebadmerge, SampleVideos<? super getShowPopup> sampleVideos) {
            Object obj = isBound.read(handlebadmerge, this.write, sampleVideos);
            return obj == getYear.IconCompatParcelizer() ? obj : getShowPopup.INSTANCE;
        }

        /* JADX WARN: Multi-variable type inference failed */
        read(getAnswerMap<? super getReferencedType, getShowPopup> getanswermap) {
            this.write = getanswermap;
        }
    }

    public static final _handleOddName IconCompatParcelizer(_handleOddName _handleoddname, getAnswerMap<? super getReferencedType, getShowPopup> getanswermap) {
        return hasSomeOfFeatures.IconCompatParcelizer(_handleoddname, setBrightness.INSTANCE, new read(getanswermap));
    }
}
