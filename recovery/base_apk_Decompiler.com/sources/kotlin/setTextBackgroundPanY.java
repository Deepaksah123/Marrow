package kotlin;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0001\u0010\u0002\u001a\u001f\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a+\u0010\u000b\u001a\u00020\t*\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\f\u001a%\u0010\u000e\u001a\u0004\u0018\u00010\r*\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u001d\u0010\u000e\u001a\u00020\t*\u0004\u0018\u00010\r2\u0006\u0010\u0004\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000e\u0010\u0010\u001a\u001d\u0010\u0001\u001a\u00020\t*\u0004\u0018\u00010\r2\u0006\u0010\u0004\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0001\u0010\u0010"}, d2 = {"Lo/setTransitionState;", "read", "(Lo/_handleUnrecognizedCharacterEscape;I)Lo/setTransitionState;", "", "p0", "p1", "AudioAttributesCompatParcelizer", "(IILo/_handleUnrecognizedCharacterEscape;I)Lo/setTransitionState;", "Landroid/content/Context;", "Lo/switchToNext;", "p2", "IconCompatParcelizer", "(Landroid/content/Context;IIJ)J", "Landroid/content/res/ColorStateList;", "RemoteActionCompatParcelizer", "(Landroid/content/Context;II)Landroid/content/res/ColorStateList;", "(Landroid/content/res/ColorStateList;J)J"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class setTextBackgroundPanY {
    public static final setTransitionState read(_handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i) {
        if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
            _validJsonValueList.AudioAttributesCompatParcelizer(1428061410, i, -1, "androidx.compose.foundation.contextmenu.computeContextMenuColors (ContextMenuUi.android.kt:32)");
        }
        setTransitionState settransitionstateAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(R.style.Widget.PopupMenu, R.style.TextAppearance.Widget.PopupMenu.Large, _handleunrecognizedcharacterescape, 54);
        if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
            _validJsonValueList.AudioAttributesImplApi21Parcelizer();
        }
        return settransitionstateAudioAttributesCompatParcelizer;
    }

    public static final setTransitionState AudioAttributesCompatParcelizer(int i, int i2, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i3) {
        if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
            _validJsonValueList.AudioAttributesCompatParcelizer(1689505294, i3, -1, "androidx.compose.foundation.contextmenu.computeContextMenuColors (ContextMenuUi.android.kt:41)");
        }
        Context context = (Context) _handleunrecognizedcharacterescape.write(AndroidCompositionLocals_androidKt.IconCompatParcelizer());
        Object obj = (Configuration) _handleunrecognizedcharacterescape.write(AndroidCompositionLocals_androidKt.read());
        boolean zAudioAttributesCompatParcelizer = _handleunrecognizedcharacterescape.AudioAttributesCompatParcelizer(context);
        boolean zAudioAttributesCompatParcelizer2 = _handleunrecognizedcharacterescape.AudioAttributesCompatParcelizer(obj);
        Object objOnPause = _handleunrecognizedcharacterescape.onPause();
        if ((zAudioAttributesCompatParcelizer2 | zAudioAttributesCompatParcelizer) || objOnPause == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
            long jIconCompatParcelizer = IconCompatParcelizer(context, i, R.attr.colorBackground, setImageZoom.AudioAttributesCompatParcelizer().getWrite());
            ColorStateList colorStateListRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(context, i2, R.attr.textColorPrimary);
            long jRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(colorStateListRemoteActionCompatParcelizer, setImageZoom.AudioAttributesCompatParcelizer().getAudioAttributesCompatParcelizer());
            long j = read(colorStateListRemoteActionCompatParcelizer, setImageZoom.AudioAttributesCompatParcelizer().getRemoteActionCompatParcelizer());
            objOnPause = new setTransitionState(jIconCompatParcelizer, jRemoteActionCompatParcelizer, jRemoteActionCompatParcelizer, j, j, null);
            _handleunrecognizedcharacterescape.RemoteActionCompatParcelizer(objOnPause);
        }
        setTransitionState settransitionstate = (setTransitionState) objOnPause;
        if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
            _validJsonValueList.AudioAttributesImplApi21Parcelizer();
        }
        return settransitionstate;
    }

    private static final long IconCompatParcelizer(Context context, int i, int i2, long j) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i, new int[]{i2});
        int iIconCompatParcelizer = RequestPayload.IconCompatParcelizer(j);
        int color = typedArrayObtainStyledAttributes.getColor(0, iIconCompatParcelizer);
        typedArrayObtainStyledAttributes.recycle();
        return color == iIconCompatParcelizer ? j : RequestPayload.AudioAttributesCompatParcelizer(color);
    }

    private static final ColorStateList RemoteActionCompatParcelizer(Context context, int i, int i2) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i, new int[]{i2});
        ColorStateList colorStateList = typedArrayObtainStyledAttributes.getColorStateList(0);
        typedArrayObtainStyledAttributes.recycle();
        return colorStateList;
    }

    private static final long RemoteActionCompatParcelizer(ColorStateList colorStateList, long j) {
        int iIconCompatParcelizer = RequestPayload.IconCompatParcelizer(j);
        Integer numValueOf = colorStateList != null ? Integer.valueOf(colorStateList.getColorForState(new int[]{R.attr.state_enabled}, iIconCompatParcelizer)) : null;
        return (numValueOf == null || numValueOf.intValue() == iIconCompatParcelizer) ? j : RequestPayload.AudioAttributesCompatParcelizer(numValueOf.intValue());
    }

    private static final long read(ColorStateList colorStateList, long j) {
        int iIconCompatParcelizer = RequestPayload.IconCompatParcelizer(j);
        Integer numValueOf = colorStateList != null ? Integer.valueOf(colorStateList.getColorForState(new int[]{-16842910}, iIconCompatParcelizer)) : null;
        return (numValueOf == null || numValueOf.intValue() == iIconCompatParcelizer) ? j : RequestPayload.AudioAttributesCompatParcelizer(numValueOf.intValue());
    }
}
