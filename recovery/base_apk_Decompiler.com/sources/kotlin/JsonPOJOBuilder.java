package kotlin;

import android.view.View;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000>\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\u0002\u001a\f\u0010\u0002\u001a\u00020\u0003*\u00020\u0001H\u0002\u001a\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0001H\u0000\u001a\f\u0010\u0006\u001a\u00020\u0001*\u00020\u0003H\u0002\u001a\f\u0010\u0007\u001a\u00020\u0001*\u00020\u0001H\u0002\u001a/\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u0013\u0010\u0011\u001a\u00020\u0003*\u00020\u0012H\u0002¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u001b\u0010\u0016\u001a\u00020\u0003*\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u001b\u0010\u001c\u001a\u0017\u0010\u001d\u001a\u00020\u001e2\b\b\u0002\u0010\u001f\u001a\u00020 H\u0007¢\u0006\u0002\u0010!\"\u000e\u0010\u0015\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u0018\u0010\u0016\u001a\u00020\u0003*\u00020\t8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018¨\u0006\""}, d2 = {"ceilAwayFromZero", "", "extractIntegerPixels", "", "composeToViewOffset", "offset", "reverseAxis", "toViewVelocity", "toOffset", "Landroidx/compose/ui/geometry/Offset;", "dx", "dy", "consumed", "", "available", "toOffset-moWRBKg", "(II[IJ)J", "toViewType", "Landroidx/compose/ui/input/nestedscroll/NestedScrollSource;", "toViewType-GyEprt8", "(I)I", "ScrollingAxesThreshold", "scrollAxes", "getScrollAxes-k-4lQ0M", "(J)I", "Landroidx/compose/ui/unit/Velocity;", "minFlingVelocity", "scrollAxes-sF-c-tU", "(JF)I", "rememberNestedScrollInteropConnection", "Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "hostView", "Landroid/view/View;", "(Landroid/view/View;Landroidx/compose/runtime/Composer;II)Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "ui"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class JsonPOJOBuilder {
    private static final float AudioAttributesCompatParcelizer(int i) {
        return -i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float write(float f) {
        return -f;
    }

    private static final float read(float f) {
        return (float) (f >= BitmapDescriptorFactory.HUE_RED ? Math.ceil(f) : Math.floor(f));
    }

    private static final int IconCompatParcelizer(float f) {
        return getOnline.RemoteActionCompatParcelizer(f);
    }

    public static final int AudioAttributesCompatParcelizer(float f) {
        int iIconCompatParcelizer;
        if (_verifyNoLeadingZeroes.MediaMetadataCompat) {
            iIconCompatParcelizer = IconCompatParcelizer(f);
        } else {
            iIconCompatParcelizer = (int) read(f);
        }
        return -iIconCompatParcelizer;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long read(int i, int i2, int[] iArr, long j) {
        float fWrite;
        float fWrite2;
        float fIntBitsToFloat = (!_verifyNoLeadingZeroes.MediaMetadataCompat || Math.abs(iArr[0]) == 0) ? 0.0f : Float.intBitsToFloat((int) (j >> 32)) - AudioAttributesCompatParcelizer(i);
        float fIntBitsToFloat2 = (!_verifyNoLeadingZeroes.MediaMetadataCompat || Math.abs(iArr[1]) == 0) ? 0.0f : Float.intBitsToFloat((int) j) - AudioAttributesCompatParcelizer(i2);
        int i3 = (int) (j >> 32);
        if (Float.intBitsToFloat(i3) >= BitmapDescriptorFactory.HUE_RED) {
            fWrite = getQues.write(AudioAttributesCompatParcelizer(iArr[0]) + fIntBitsToFloat, Float.intBitsToFloat(i3));
        } else {
            fWrite = getQues.read(AudioAttributesCompatParcelizer(iArr[0]) + fIntBitsToFloat, Float.intBitsToFloat(i3));
        }
        int i4 = (int) j;
        if (Float.intBitsToFloat(i4) >= BitmapDescriptorFactory.HUE_RED) {
            fWrite2 = getQues.write(AudioAttributesCompatParcelizer(iArr[1]) + fIntBitsToFloat2, Float.intBitsToFloat(i4));
        } else {
            fWrite2 = getQues.read(AudioAttributesCompatParcelizer(iArr[1]) + fIntBitsToFloat2, Float.intBitsToFloat(i4));
        }
        long j2 = -1;
        return getReferencedType.AudioAttributesCompatParcelizer((((long) Float.floatToRawIntBits(fWrite)) << 32) | (((long) Float.floatToRawIntBits(fWrite2)) & ((((long) 0) << 32) | (j2 - ((j2 >> 63) << 32)))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int RemoteActionCompatParcelizer(int i) {
        return !findCoercionAction.IconCompatParcelizer(i, findCoercionAction.INSTANCE.AudioAttributesCompatParcelizer()) ? 1 : 0;
    }

    public static final DatabindException read(View view, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i, int i2) {
        if ((i2 & 1) != 0) {
            view = (View) _handleunrecognizedcharacterescape.write(AndroidCompositionLocals_androidKt.MediaBrowserCompatItemReceiver());
        }
        if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
            _validJsonValueList.AudioAttributesCompatParcelizer(1075877987, i, -1, "androidx.compose.ui.platform.rememberNestedScrollInteropConnection (NestedScrollInteropConnection.android.kt:292)");
        }
        CoercionConfig coercionConfig = (CoercionConfig) _handleunrecognizedcharacterescape.write(getDefaultNullValueSerializer.onAddQueueItem());
        boolean zAudioAttributesCompatParcelizer = _handleunrecognizedcharacterescape.AudioAttributesCompatParcelizer(view);
        boolean zAudioAttributesCompatParcelizer2 = _handleunrecognizedcharacterescape.AudioAttributesCompatParcelizer(coercionConfig);
        Object objOnPause = _handleunrecognizedcharacterescape.onPause();
        if ((zAudioAttributesCompatParcelizer | zAudioAttributesCompatParcelizer2) || objOnPause == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
            objOnPause = new JsonNaming(view, coercionConfig.MediaBrowserCompatItemReceiver());
            _handleunrecognizedcharacterescape.RemoteActionCompatParcelizer(objOnPause);
        }
        JsonNaming jsonNaming = (JsonNaming) objOnPause;
        if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
            _validJsonValueList.AudioAttributesImplApi21Parcelizer();
        }
        return jsonNaming;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int RemoteActionCompatParcelizer(long j) {
        int i = Math.abs(Float.intBitsToFloat((int) (j >> 32))) >= 0.5f ? 1 : 0;
        return Math.abs(Float.intBitsToFloat((int) j)) >= 0.5f ? i | 2 : i;
    }
}
