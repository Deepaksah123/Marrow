package kotlin;

import android.view.MotionEvent;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a/\u0010\u0007\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a/\u0010\t\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\u0000¢\u0006\u0004\b\t\u0010\b\u001a+\u0010\t\u001a\u00020\u00052\u0006\u0010\u0002\u001a\u00020\n2\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\u0000¢\u0006\u0004\b\t\u0010\u000b\u001a7\u0010\u000e\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00032\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000f"}, d2 = {"Lo/DeserializationContext;", "Lo/getReferencedType;", "p0", "Lkotlin/Function1;", "Landroid/view/MotionEvent;", "", "p1", "RemoteActionCompatParcelizer", "(Lo/DeserializationContext;JLo/getAnswerMap;)V", "read", "", "(JLo/getAnswerMap;)V", "", "p2", "IconCompatParcelizer", "(Lo/DeserializationContext;JLo/getAnswerMap;Z)V"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class handlePrimaryContextualization {
    public static final void RemoteActionCompatParcelizer(DeserializationContext deserializationContext, long j, getAnswerMap<? super MotionEvent, getShowPopup> getanswermap) {
        IconCompatParcelizer(deserializationContext, j, getanswermap, false);
    }

    public static final void read(DeserializationContext deserializationContext, long j, getAnswerMap<? super MotionEvent, getShowPopup> getanswermap) {
        IconCompatParcelizer(deserializationContext, j, getanswermap, true);
    }

    public static final void read(long j, getAnswerMap<? super MotionEvent, getShowPopup> getanswermap) {
        MotionEvent motionEventObtain = MotionEvent.obtain(j, j, 3, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 0);
        motionEventObtain.setSource(0);
        getanswermap.invoke(motionEventObtain);
        motionEventObtain.recycle();
    }

    private static final void IconCompatParcelizer(DeserializationContext deserializationContext, long j, getAnswerMap<? super MotionEvent, getShowPopup> getanswermap, boolean z) {
        MotionEvent motionEventAudioAttributesImplBaseParcelizer = deserializationContext.AudioAttributesImplBaseParcelizer();
        if (motionEventAudioAttributesImplBaseParcelizer == null) {
            throw new IllegalArgumentException("The PointerEvent receiver cannot have a null MotionEvent.".toString());
        }
        int action = motionEventAudioAttributesImplBaseParcelizer.getAction();
        if (z) {
            motionEventAudioAttributesImplBaseParcelizer.setAction(3);
        }
        int i = (int) (j >> 32);
        int i2 = (int) j;
        motionEventAudioAttributesImplBaseParcelizer.offsetLocation(-Float.intBitsToFloat(i), -Float.intBitsToFloat(i2));
        getanswermap.invoke(motionEventAudioAttributesImplBaseParcelizer);
        motionEventAudioAttributesImplBaseParcelizer.offsetLocation(Float.intBitsToFloat(i), Float.intBitsToFloat(i2));
        motionEventAudioAttributesImplBaseParcelizer.setAction(action);
    }
}
