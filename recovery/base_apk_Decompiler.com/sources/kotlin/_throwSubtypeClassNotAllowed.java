package kotlin;

import android.view.KeyEvent;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\"\u0015\u0010\u0004\u001a\u00020\u0001*\u00020\u00008G¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003\"\u0015\u0010\u0006\u001a\u00020\u0005*\u00020\u00008G¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\"\u0015\u0010\u0002\u001a\u00020\b*\u00020\u00008G¢\u0006\u0006\u001a\u0004\b\t\u0010\u0007\"\u0015\u0010\u000b\u001a\u00020\n*\u00020\u00008G¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f\"\u0015\u0010\t\u001a\u00020\n*\u00020\u00008G¢\u0006\u0006\u001a\u0004\b\u0004\u0010\f\"\u0015\u0010\u000e\u001a\u00020\n*\u00020\u00008G¢\u0006\u0006\u001a\u0004\b\r\u0010\f*\n\u0010\u0006\"\u00020\u000f2\u00020\u000f"}, d2 = {"Lo/constructType;", "Lo/_quotedString;", "IconCompatParcelizer", "(Landroid/view/KeyEvent;)J", "read", "", "AudioAttributesCompatParcelizer", "(Landroid/view/KeyEvent;)I", "Lo/_throwNotASubtype;", "RemoteActionCompatParcelizer", "", "write", "(Landroid/view/KeyEvent;)Z", "AudioAttributesImplBaseParcelizer", "MediaBrowserCompatCustomActionResultReceiver", "Landroid/view/KeyEvent;"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class _throwSubtypeClassNotAllowed {
    public static final long IconCompatParcelizer(KeyEvent keyEvent) {
        return C0180invalidTypeIdException.AudioAttributesCompatParcelizer(keyEvent.getKeyCode());
    }

    public static final int AudioAttributesCompatParcelizer(KeyEvent keyEvent) {
        return keyEvent.getUnicodeChar();
    }

    public static final int RemoteActionCompatParcelizer(KeyEvent keyEvent) {
        int action = keyEvent.getAction();
        if (action == 0) {
            return _throwNotASubtype.INSTANCE.read();
        }
        if (action == 1) {
            return _throwNotASubtype.INSTANCE.AudioAttributesCompatParcelizer();
        }
        return _throwNotASubtype.INSTANCE.write();
    }

    public static final boolean write(KeyEvent keyEvent) {
        return keyEvent.isAltPressed();
    }

    public static final boolean read(KeyEvent keyEvent) {
        return keyEvent.isCtrlPressed();
    }

    public static final boolean AudioAttributesImplBaseParcelizer(KeyEvent keyEvent) {
        return keyEvent.isShiftPressed();
    }
}
