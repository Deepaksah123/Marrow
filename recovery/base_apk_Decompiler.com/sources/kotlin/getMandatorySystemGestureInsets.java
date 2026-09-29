package kotlin;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0015\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007JH\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u000e2\u0006\u0010\u0005\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u00022\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\f0\u000bH\u0096@¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012"}, d2 = {"Lo/getMandatorySystemGestureInsets;", "Lo/onRequestSendAccessibilityEvent;", "", "Lo/setHoverListener;", "Lo/setOrientation;", "p0", "<init>", "(Lo/setOrientation;)V", "Lo/checkSelfPermission;", "p1", "p2", "Lkotlin/Function1;", "", "p3", "Lo/sendAccessibilityEventUnchecked;", "write", "(Lo/checkSelfPermission;FFLo/getAnswerMap;Lo/SampleVideos;)Ljava/lang/Object;", "read", "Lo/setOrientation;", "RemoteActionCompatParcelizer"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class getMandatorySystemGestureInsets implements onRequestSendAccessibilityEvent<Float, setHoverListener> {

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final setOrientation<Float> RemoteActionCompatParcelizer;

    public getMandatorySystemGestureInsets(setOrientation<Float> setorientation) {
        this.RemoteActionCompatParcelizer = setorientation;
    }

    @Override // kotlin.onRequestSendAccessibilityEvent
    public final /* synthetic */ Object RemoteActionCompatParcelizer(checkSelfPermission checkselfpermission, Float f, Float f2, getAnswerMap<? super Float, getShowPopup> getanswermap, SampleVideos sampleVideos) {
        return write(checkselfpermission, f.floatValue(), f2.floatValue(), getanswermap, sampleVideos);
    }

    public final Object write(checkSelfPermission checkselfpermission, float f, float f2, getAnswerMap<? super Float, getShowPopup> getanswermap, SampleVideos<? super sendAccessibilityEventUnchecked<Float, setHoverListener>> sampleVideos) {
        Object objAudioAttributesCompatParcelizer = getInsets.AudioAttributesCompatParcelizer(checkselfpermission, Math.abs(f) * Math.signum(f2), f, setAllowCollapse.AudioAttributesCompatParcelizer$default(BitmapDescriptorFactory.HUE_RED, f2, 0L, 0L, false, 28, null), this.RemoteActionCompatParcelizer, getanswermap, sampleVideos);
        return objAudioAttributesCompatParcelizer == getYear.IconCompatParcelizer() ? objAudioAttributesCompatParcelizer : (sendAccessibilityEventUnchecked) objAudioAttributesCompatParcelizer;
    }
}
