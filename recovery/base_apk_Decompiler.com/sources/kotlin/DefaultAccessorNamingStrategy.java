package kotlin;

import android.text.Editable;
import android.text.Selection;
import android.text.method.MetaKeyKeyListener;
import android.view.KeyEvent;
import android.view.inputmethod.InputConnection;

/* JADX INFO: loaded from: classes2.dex */
final class DefaultAccessorNamingStrategy {
    private static boolean read(int i, int i2) {
        return i == -1 || i2 == -1 || i != i2;
    }

    static boolean read(Editable editable, int i, KeyEvent keyEvent) {
        boolean zRemoteActionCompatParcelizer;
        if (i != 67) {
            if (i == 112) {
                zRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(editable, keyEvent, true);
            }
            return false;
        }
        zRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(editable, keyEvent, false);
        if (zRemoteActionCompatParcelizer) {
            MetaKeyKeyListener.adjustMetaAfterKeypress(editable);
            return true;
        }
        return false;
    }

    private static boolean RemoteActionCompatParcelizer(Editable editable, KeyEvent keyEvent, boolean z) {
        _isGroovyMetaClassGetter[] _isgroovymetaclassgetterArr;
        if (write(keyEvent)) {
            return false;
        }
        int selectionStart = Selection.getSelectionStart(editable);
        int selectionEnd = Selection.getSelectionEnd(editable);
        if (!read(selectionStart, selectionEnd) && (_isgroovymetaclassgetterArr = (_isGroovyMetaClassGetter[]) editable.getSpans(selectionStart, selectionEnd, _isGroovyMetaClassGetter.class)) != null && _isgroovymetaclassgetterArr.length > 0) {
            for (_isGroovyMetaClassGetter _isgroovymetaclassgetter : _isgroovymetaclassgetterArr) {
                int spanStart = editable.getSpanStart(_isgroovymetaclassgetter);
                int spanEnd = editable.getSpanEnd(_isgroovymetaclassgetter);
                if ((z && spanStart == selectionStart) || ((!z && spanEnd == selectionStart) || (selectionStart > spanStart && selectionStart < spanEnd))) {
                    editable.delete(spanStart, spanEnd);
                    return true;
                }
            }
        }
        return false;
    }

    static boolean RemoteActionCompatParcelizer(InputConnection inputConnection, Editable editable, int i, int i2, boolean z) {
        int iMax;
        int iMin;
        if (editable != null && inputConnection != null && i >= 0 && i2 >= 0) {
            int selectionStart = Selection.getSelectionStart(editable);
            int selectionEnd = Selection.getSelectionEnd(editable);
            if (read(selectionStart, selectionEnd)) {
                return false;
            }
            if (z) {
                iMax = read.IconCompatParcelizer(editable, selectionStart, Math.max(i, 0));
                iMin = read.RemoteActionCompatParcelizer(editable, selectionEnd, Math.max(i2, 0));
                if (iMax == -1 || iMin == -1) {
                    return false;
                }
            } else {
                iMax = Math.max(selectionStart - i, 0);
                iMin = Math.min(selectionEnd + i2, editable.length());
            }
            _isGroovyMetaClassGetter[] _isgroovymetaclassgetterArr = (_isGroovyMetaClassGetter[]) editable.getSpans(iMax, iMin, _isGroovyMetaClassGetter.class);
            if (_isgroovymetaclassgetterArr != null && _isgroovymetaclassgetterArr.length > 0) {
                for (_isGroovyMetaClassGetter _isgroovymetaclassgetter : _isgroovymetaclassgetterArr) {
                    int spanStart = editable.getSpanStart(_isgroovymetaclassgetter);
                    int spanEnd = editable.getSpanEnd(_isgroovymetaclassgetter);
                    iMax = Math.min(spanStart, iMax);
                    iMin = Math.max(spanEnd, iMin);
                }
                int iMax2 = Math.max(iMax, 0);
                int iMin2 = Math.min(iMin, editable.length());
                inputConnection.beginBatchEdit();
                editable.delete(iMax2, iMin2);
                inputConnection.endBatchEdit();
                return true;
            }
        }
        return false;
    }

    private static boolean write(KeyEvent keyEvent) {
        return !KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState());
    }

    static final class read {
        static int IconCompatParcelizer(CharSequence charSequence, int i, int i2) {
            int length = charSequence.length();
            if (i < 0 || length < i || i2 < 0) {
                return -1;
            }
            while (true) {
                boolean z = false;
                while (i2 != 0) {
                    i--;
                    if (i < 0) {
                        return z ? -1 : 0;
                    }
                    char cCharAt = charSequence.charAt(i);
                    if (z) {
                        if (!Character.isHighSurrogate(cCharAt)) {
                            return -1;
                        }
                        i2--;
                    } else if (!Character.isSurrogate(cCharAt)) {
                        i2--;
                    } else {
                        if (Character.isHighSurrogate(cCharAt)) {
                            return -1;
                        }
                        z = true;
                    }
                }
                return i;
            }
        }

        static int RemoteActionCompatParcelizer(CharSequence charSequence, int i, int i2) {
            int length = charSequence.length();
            if (i < 0 || length < i || i2 < 0) {
                return -1;
            }
            while (true) {
                boolean z = false;
                while (i2 != 0) {
                    if (i >= length) {
                        if (z) {
                            return -1;
                        }
                        return length;
                    }
                    char cCharAt = charSequence.charAt(i);
                    if (z) {
                        if (!Character.isLowSurrogate(cCharAt)) {
                            return -1;
                        }
                        i2--;
                        i++;
                    } else if (!Character.isSurrogate(cCharAt)) {
                        i2--;
                        i++;
                    } else {
                        if (Character.isLowSurrogate(cCharAt)) {
                            return -1;
                        }
                        i++;
                        z = true;
                    }
                }
                return i;
            }
        }
    }
}
