package kotlin;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u001a'\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u00012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0002¢\u0006\u0004\b\u0006\u0010\u0007\u001a'\u0010\b\u001a\u00020\u0005*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u00012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0002¢\u0006\u0004\b\b\u0010\u0007\u001a\u0013\u0010\n\u001a\u00020\t*\u00020\u0000H\u0002¢\u0006\u0004\b\n\u0010\u000b\u001a\u0013\u0010\f\u001a\u00020\t*\u00020\u0000H\u0002¢\u0006\u0004\b\f\u0010\u000b\u001a/\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u00012\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0006\u0010\r\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0006\u0010\u000e\u001a'\u0010\u000f\u001a\u00020\u0005*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u00012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0002¢\u0006\u0004\b\u000f\u0010\u0007\u001a'\u0010\n\u001a\u00020\u0005*\u00020\u00052\b\u0010\u0002\u001a\u0004\u0018\u00010\u00012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0002¢\u0006\u0004\b\n\u0010\u0010\u001a'\u0010\u0011\u001a\u00020\u0005*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u00012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0002¢\u0006\u0004\b\u0011\u0010\u0007\u001a?\u0010\u0017\u001a\u00020\u0016*\u00020\u00122\u0006\u0010\u0002\u001a\u00020\u00002\b\u0010\u0004\u001a\u0004\u0018\u00010\u00012\b\u0010\r\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0017\u0010\u0018"}, d2 = {"Lo/_colonConcat;", "Lo/superDispatchKeyEvent;", "p0", "Lo/getWrapperName;", "p1", "Lo/getReferencedType;", "AudioAttributesCompatParcelizer", "(Lo/_colonConcat;Lo/superDispatchKeyEvent;Lo/getWrapperName;)J", "AudioAttributesImplBaseParcelizer", "", "RemoteActionCompatParcelizer", "(Lo/_colonConcat;)Z", "write", "p2", "(Lo/_colonConcat;Lo/superDispatchKeyEvent;Lo/getWrapperName;Z)J", "MediaBrowserCompatItemReceiver", "(JLo/superDispatchKeyEvent;Lo/getWrapperName;)J", "AudioAttributesImplApi26Parcelizer", "Lo/reportPropertyInputMismatch;", "Lo/CoordinatorLayoutSavedState;", "p3", "p4", "", "IconCompatParcelizer", "(Lo/reportPropertyInputMismatch;Lo/_colonConcat;Lo/superDispatchKeyEvent;Lo/getWrapperName;Lo/CoordinatorLayoutSavedState;J)V"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class VirtualLayout {
    /* JADX INFO: Access modifiers changed from: private */
    public static final long AudioAttributesCompatParcelizer(_colonConcat _colonconcat, superDispatchKeyEvent superdispatchkeyevent, getWrapperName getwrappername) {
        return AudioAttributesCompatParcelizer(_colonconcat, superdispatchkeyevent, getwrappername, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long AudioAttributesImplBaseParcelizer(_colonConcat _colonconcat, superDispatchKeyEvent superdispatchkeyevent, getWrapperName getwrappername) {
        return AudioAttributesCompatParcelizer(_colonconcat, superdispatchkeyevent, getwrappername, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean RemoteActionCompatParcelizer(_colonConcat _colonconcat) {
        return _colonconcat.getAudioAttributesImplApi26Parcelizer() && !_colonconcat.getRemoteActionCompatParcelizer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean write(_colonConcat _colonconcat) {
        return !_colonconcat.getAudioAttributesImplApi26Parcelizer() && _colonconcat.getRemoteActionCompatParcelizer();
    }

    private static final long AudioAttributesCompatParcelizer(_colonConcat _colonconcat, superDispatchKeyEvent superdispatchkeyevent, getWrapperName getwrappername, boolean z) {
        return (z || !_colonconcat.getMediaBrowserCompatCustomActionResultReceiver()) ? getReferencedType.AudioAttributesCompatParcelizer(MediaBrowserCompatItemReceiver(_colonconcat, superdispatchkeyevent, getwrappername), AudioAttributesImplApi26Parcelizer(_colonconcat, superdispatchkeyevent, getwrappername)) : getReferencedType.INSTANCE.write();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long MediaBrowserCompatItemReceiver(_colonConcat _colonconcat, superDispatchKeyEvent superdispatchkeyevent, getWrapperName getwrappername) {
        float fIntBitsToFloat;
        if (superdispatchkeyevent == null) {
            return _colonconcat.getIconCompatParcelizer();
        }
        int iAudioAttributesCompatParcelizer = getWrapperName.INSTANCE.AudioAttributesCompatParcelizer();
        if (getwrappername == null || !getWrapperName.RemoteActionCompatParcelizer(getwrappername.getIconCompatParcelizer(), iAudioAttributesCompatParcelizer)) {
            int iRemoteActionCompatParcelizer = getWrapperName.INSTANCE.RemoteActionCompatParcelizer();
            if (getwrappername == null || !getWrapperName.RemoteActionCompatParcelizer(getwrappername.getIconCompatParcelizer(), iRemoteActionCompatParcelizer)) {
                return _colonconcat.getIconCompatParcelizer();
            }
            fIntBitsToFloat = Float.intBitsToFloat((int) _colonconcat.getIconCompatParcelizer());
        } else {
            fIntBitsToFloat = Float.intBitsToFloat((int) (_colonconcat.getIconCompatParcelizer() >> 32));
        }
        if (superdispatchkeyevent == superDispatchKeyEvent.AudioAttributesCompatParcelizer) {
            long j = -1;
            return getReferencedType.AudioAttributesCompatParcelizer((((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((((long) 0) << 32) | (j - ((j >> 63) << 32))) & ((long) Float.floatToRawIntBits(BitmapDescriptorFactory.HUE_RED))));
        }
        long j2 = -1;
        return getReferencedType.AudioAttributesCompatParcelizer((((long) Float.floatToRawIntBits(BitmapDescriptorFactory.HUE_RED)) << 32) | (((((long) 0) << 32) | (j2 - ((j2 >> 63) << 32))) & ((long) Float.floatToRawIntBits(fIntBitsToFloat))));
    }

    private static final long RemoteActionCompatParcelizer(long j, superDispatchKeyEvent superdispatchkeyevent, getWrapperName getwrappername) {
        float fIntBitsToFloat;
        if (superdispatchkeyevent == null) {
            return j;
        }
        int iAudioAttributesCompatParcelizer = getWrapperName.INSTANCE.AudioAttributesCompatParcelizer();
        if (getwrappername == null || !getWrapperName.RemoteActionCompatParcelizer(getwrappername.getIconCompatParcelizer(), iAudioAttributesCompatParcelizer)) {
            int iRemoteActionCompatParcelizer = getWrapperName.INSTANCE.RemoteActionCompatParcelizer();
            if (getwrappername == null || !getWrapperName.RemoteActionCompatParcelizer(getwrappername.getIconCompatParcelizer(), iRemoteActionCompatParcelizer)) {
                return j;
            }
            fIntBitsToFloat = Float.intBitsToFloat((int) j);
        } else {
            fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        }
        if (superdispatchkeyevent == superDispatchKeyEvent.AudioAttributesCompatParcelizer) {
            long j2 = -1;
            return getReferencedType.AudioAttributesCompatParcelizer((((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((((long) 0) << 32) | (j2 - ((j2 >> 63) << 32))) & ((long) Float.floatToRawIntBits(BitmapDescriptorFactory.HUE_RED))));
        }
        long j3 = -1;
        return getReferencedType.AudioAttributesCompatParcelizer((((long) Float.floatToRawIntBits(BitmapDescriptorFactory.HUE_RED)) << 32) | (((((long) 0) << 32) | (j3 - ((j3 >> 63) << 32))) & ((long) Float.floatToRawIntBits(fIntBitsToFloat))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long AudioAttributesImplApi26Parcelizer(_colonConcat _colonconcat, superDispatchKeyEvent superdispatchkeyevent, getWrapperName getwrappername) {
        float fIntBitsToFloat;
        if (superdispatchkeyevent == null) {
            return _colonconcat.getMediaBrowserCompatItemReceiver();
        }
        int iAudioAttributesCompatParcelizer = getWrapperName.INSTANCE.AudioAttributesCompatParcelizer();
        if (getwrappername == null || !getWrapperName.RemoteActionCompatParcelizer(getwrappername.getIconCompatParcelizer(), iAudioAttributesCompatParcelizer)) {
            int iRemoteActionCompatParcelizer = getWrapperName.INSTANCE.RemoteActionCompatParcelizer();
            if (getwrappername == null || !getWrapperName.RemoteActionCompatParcelizer(getwrappername.getIconCompatParcelizer(), iRemoteActionCompatParcelizer)) {
                return _colonconcat.getMediaBrowserCompatItemReceiver();
            }
            fIntBitsToFloat = Float.intBitsToFloat((int) _colonconcat.getMediaBrowserCompatItemReceiver());
        } else {
            fIntBitsToFloat = Float.intBitsToFloat((int) (_colonconcat.getMediaBrowserCompatItemReceiver() >> 32));
        }
        if (superdispatchkeyevent == superDispatchKeyEvent.AudioAttributesCompatParcelizer) {
            long j = -1;
            return getReferencedType.AudioAttributesCompatParcelizer((((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((((long) 0) << 32) | (j - ((j >> 63) << 32))) & ((long) Float.floatToRawIntBits(BitmapDescriptorFactory.HUE_RED))));
        }
        long j2 = -1;
        return getReferencedType.AudioAttributesCompatParcelizer((((long) Float.floatToRawIntBits(BitmapDescriptorFactory.HUE_RED)) << 32) | (((((long) 0) << 32) | (j2 - ((j2 >> 63) << 32))) & ((long) Float.floatToRawIntBits(fIntBitsToFloat))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void IconCompatParcelizer(reportPropertyInputMismatch reportpropertyinputmismatch, _colonConcat _colonconcat, superDispatchKeyEvent superdispatchkeyevent, getWrapperName getwrappername, CoordinatorLayoutSavedState coordinatorLayoutSavedState, long j) {
        reportpropertyinputmismatch.IconCompatParcelizer(_colonconcat.getRead(), getReferencedType.RemoteActionCompatParcelizer(RemoteActionCompatParcelizer(coordinatorLayoutSavedState.read(_colonconcat), superdispatchkeyevent, getwrappername), j));
    }
}
