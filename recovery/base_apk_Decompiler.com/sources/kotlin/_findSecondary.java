package kotlin;

import android.graphics.Rect;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.AndroidComposeView;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0002\u001a\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0000*\u00020\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0015\u0010\b\u001a\u0004\u0018\u00010\u0002*\u00020\u0007H\u0000¢\u0006\u0004\b\b\u0010\t\u001a\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a\u001b\u0010\u000f\u001a\u00020\u000e*\u00020\r2\u0006\u0010\u0001\u001a\u00020\rH\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001a'\u0010\u0003\u001a\u00020\u0013*\u00020\r2\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0000¢\u0006\u0004\b\u0003\u0010\u0014\"\u0014\u0010\u0003\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0016\"\u0014\u0010\u000f\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0017"}, d2 = {"", "p0", "Lo/_checkNeedForRehash;", "AudioAttributesCompatParcelizer", "(I)Lo/_checkNeedForRehash;", "write", "(I)Ljava/lang/Integer;", "Lo/constructType;", "read", "(Landroid/view/KeyEvent;)Lo/_checkNeedForRehash;", "Lo/tryToResolveUnresolved;", "RemoteActionCompatParcelizer", "(I)Lo/tryToResolveUnresolved;", "Landroid/view/View;", "Lo/WritableTypeIdInclusion;", "IconCompatParcelizer", "(Landroid/view/View;Landroid/view/View;)Lo/WritableTypeIdInclusion;", "Landroid/graphics/Rect;", "p1", "", "(Landroid/view/View;Ljava/lang/Integer;Landroid/graphics/Rect;)Z", "", "[I", "Landroid/graphics/Rect;"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class _findSecondary {
    private static final int[] write = new int[2];
    private static final Rect AudioAttributesCompatParcelizer = new Rect();

    public static final _checkNeedForRehash AudioAttributesCompatParcelizer(int i) {
        if (i == 1) {
            return _checkNeedForRehash.read(_checkNeedForRehash.INSTANCE.AudioAttributesImplBaseParcelizer());
        }
        if (i == 2) {
            return _checkNeedForRehash.read(_checkNeedForRehash.INSTANCE.write());
        }
        if (i == 17) {
            return _checkNeedForRehash.read(_checkNeedForRehash.INSTANCE.read());
        }
        if (i == 33) {
            return _checkNeedForRehash.read(_checkNeedForRehash.INSTANCE.AudioAttributesImplApi21Parcelizer());
        }
        if (i == 66) {
            return _checkNeedForRehash.read(_checkNeedForRehash.INSTANCE.MediaBrowserCompatItemReceiver());
        }
        if (i != 130) {
            return null;
        }
        return _checkNeedForRehash.read(_checkNeedForRehash.INSTANCE.IconCompatParcelizer());
    }

    public static final Integer write(int i) {
        if (_checkNeedForRehash.IconCompatParcelizer(i, _checkNeedForRehash.INSTANCE.AudioAttributesImplApi21Parcelizer())) {
            return 33;
        }
        if (_checkNeedForRehash.IconCompatParcelizer(i, _checkNeedForRehash.INSTANCE.IconCompatParcelizer())) {
            return Integer.valueOf(TsExtractor.TS_STREAM_TYPE_HDMV_DTS);
        }
        if (_checkNeedForRehash.IconCompatParcelizer(i, _checkNeedForRehash.INSTANCE.read())) {
            return 17;
        }
        if (_checkNeedForRehash.IconCompatParcelizer(i, _checkNeedForRehash.INSTANCE.MediaBrowserCompatItemReceiver())) {
            return 66;
        }
        if (_checkNeedForRehash.IconCompatParcelizer(i, _checkNeedForRehash.INSTANCE.write())) {
            return 2;
        }
        return _checkNeedForRehash.IconCompatParcelizer(i, _checkNeedForRehash.INSTANCE.AudioAttributesImplBaseParcelizer()) ? 1 : null;
    }

    public static final _checkNeedForRehash read(KeyEvent keyEvent) {
        long jIconCompatParcelizer = _throwSubtypeClassNotAllowed.IconCompatParcelizer(keyEvent);
        if (_quotedString.read(jIconCompatParcelizer, _quotedString.INSTANCE.onMediaButtonEvent())) {
            return _checkNeedForRehash.read(_checkNeedForRehash.INSTANCE.AudioAttributesImplBaseParcelizer());
        }
        if (_quotedString.read(jIconCompatParcelizer, _quotedString.INSTANCE.handleMediaPlayPauseIfPendingOnHandler())) {
            return _checkNeedForRehash.read(_checkNeedForRehash.INSTANCE.write());
        }
        if (_quotedString.read(jIconCompatParcelizer, _quotedString.INSTANCE.onPrepareFromMediaId())) {
            return _checkNeedForRehash.read(_throwSubtypeClassNotAllowed.AudioAttributesImplBaseParcelizer(keyEvent) ? _checkNeedForRehash.INSTANCE.AudioAttributesImplBaseParcelizer() : _checkNeedForRehash.INSTANCE.write());
        }
        if (_quotedString.read(jIconCompatParcelizer, _quotedString.INSTANCE.MediaMetadataCompat())) {
            return _checkNeedForRehash.read(_checkNeedForRehash.INSTANCE.MediaBrowserCompatItemReceiver());
        }
        if (_quotedString.read(jIconCompatParcelizer, _quotedString.INSTANCE.MediaBrowserCompatMediaItem())) {
            return _checkNeedForRehash.read(_checkNeedForRehash.INSTANCE.read());
        }
        if (_quotedString.read(jIconCompatParcelizer, _quotedString.INSTANCE.RatingCompat()) || _quotedString.read(jIconCompatParcelizer, _quotedString.INSTANCE.onPause())) {
            return _checkNeedForRehash.read(_checkNeedForRehash.INSTANCE.AudioAttributesImplApi21Parcelizer());
        }
        if (_quotedString.read(jIconCompatParcelizer, _quotedString.INSTANCE.MediaBrowserCompatCustomActionResultReceiver()) || _quotedString.read(jIconCompatParcelizer, _quotedString.INSTANCE.onPlay())) {
            return _checkNeedForRehash.read(_checkNeedForRehash.INSTANCE.IconCompatParcelizer());
        }
        if (_quotedString.read(jIconCompatParcelizer, _quotedString.INSTANCE.MediaBrowserCompatItemReceiver()) || _quotedString.read(jIconCompatParcelizer, _quotedString.INSTANCE.MediaDescriptionCompat()) || _quotedString.read(jIconCompatParcelizer, _quotedString.INSTANCE.onFastForward())) {
            return _checkNeedForRehash.read(_checkNeedForRehash.INSTANCE.RemoteActionCompatParcelizer());
        }
        if (_quotedString.read(jIconCompatParcelizer, _quotedString.INSTANCE.AudioAttributesCompatParcelizer()) || _quotedString.read(jIconCompatParcelizer, _quotedString.INSTANCE.MediaBrowserCompatSearchResultReceiver())) {
            return _checkNeedForRehash.read(_checkNeedForRehash.INSTANCE.AudioAttributesCompatParcelizer());
        }
        return null;
    }

    public static final tryToResolveUnresolved RemoteActionCompatParcelizer(int i) {
        if (i == 0) {
            return tryToResolveUnresolved.write;
        }
        if (i != 1) {
            return null;
        }
        return tryToResolveUnresolved.RemoteActionCompatParcelizer;
    }

    public static final WritableTypeIdInclusion IconCompatParcelizer(View view, View view2) {
        int[] iArr = write;
        view.getLocationInWindow(iArr);
        int i = iArr[0];
        int i2 = iArr[1];
        view2.getLocationInWindow(iArr);
        float f = i - iArr[0];
        float f2 = i2 - iArr[1];
        Rect rect = AudioAttributesCompatParcelizer;
        view.getFocusedRect(rect);
        return new WritableTypeIdInclusion(rect.left + f, rect.top + f2, f + rect.left + rect.width(), f2 + rect.top + rect.height());
    }

    public static final boolean AudioAttributesCompatParcelizer(View view, Integer num, Rect rect) {
        if (num == null) {
            return view.requestFocus();
        }
        if (!(view instanceof ViewGroup)) {
            return view.requestFocus(num.intValue(), rect);
        }
        ViewGroup viewGroup = (ViewGroup) view;
        if (viewGroup.isFocused()) {
            return true;
        }
        if (viewGroup.isFocusable() && !viewGroup.hasFocus()) {
            return viewGroup.requestFocus(num.intValue(), rect);
        }
        if (view instanceof AndroidComposeView) {
            return ((AndroidComposeView) view).requestFocus(num.intValue(), rect);
        }
        if (rect != null) {
            View viewFindNextFocusFromRect = FocusFinder.getInstance().findNextFocusFromRect(viewGroup, rect, num.intValue());
            return viewFindNextFocusFromRect != null ? viewFindNextFocusFromRect.requestFocus(num.intValue(), rect) : viewGroup.requestFocus(num.intValue(), rect);
        }
        View viewFindNextFocus = FocusFinder.getInstance().findNextFocus(viewGroup, viewGroup.hasFocus() ? viewGroup.findFocus() : null, num.intValue());
        return viewFindNextFocus != null ? viewFindNextFocus.requestFocus(num.intValue()) : view.requestFocus(num.intValue());
    }
}
