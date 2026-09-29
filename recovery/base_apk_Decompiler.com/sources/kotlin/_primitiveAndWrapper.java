package kotlin;

import android.os.Handler;
import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.text.TextWatcher;
import android.widget.EditText;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import kotlin._booleanType;

/* JADX INFO: loaded from: classes2.dex */
final class _primitiveAndWrapper implements TextWatcher {
    private final boolean RemoteActionCompatParcelizer;
    private final EditText read;
    private _booleanType.IconCompatParcelizer write;
    private int MediaBrowserCompatItemReceiver = Integer.MAX_VALUE;
    private int IconCompatParcelizer = 0;
    private boolean AudioAttributesCompatParcelizer = true;

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    _primitiveAndWrapper(EditText editText, boolean z) {
        this.read = editText;
        this.RemoteActionCompatParcelizer = z;
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        if (this.read.isInEditMode() || IconCompatParcelizer() || i2 > i3 || !(charSequence instanceof Spannable)) {
            return;
        }
        int iIconCompatParcelizer = _booleanType.AudioAttributesCompatParcelizer().IconCompatParcelizer();
        if (iIconCompatParcelizer != 0) {
            if (iIconCompatParcelizer == 1) {
                _booleanType.AudioAttributesCompatParcelizer().AudioAttributesCompatParcelizer((Spannable) charSequence, i, i + i3, this.MediaBrowserCompatItemReceiver, this.IconCompatParcelizer);
                return;
            } else if (iIconCompatParcelizer != 3) {
                return;
            }
        }
        _booleanType.AudioAttributesCompatParcelizer().read(write());
    }

    private boolean IconCompatParcelizer() {
        if (this.AudioAttributesCompatParcelizer) {
            return (this.RemoteActionCompatParcelizer || _booleanType.read()) ? false : true;
        }
        return true;
    }

    private _booleanType.IconCompatParcelizer write() {
        if (this.write == null) {
            this.write = new AudioAttributesCompatParcelizer(this.read);
        }
        return this.write;
    }

    public final void AudioAttributesCompatParcelizer(boolean z) {
        if (this.AudioAttributesCompatParcelizer != z) {
            if (this.write != null) {
                _booleanType.AudioAttributesCompatParcelizer().AudioAttributesCompatParcelizer(this.write);
            }
            this.AudioAttributesCompatParcelizer = z;
            if (z) {
                read(this.read, _booleanType.AudioAttributesCompatParcelizer().IconCompatParcelizer());
            }
        }
    }

    static class AudioAttributesCompatParcelizer extends _booleanType.IconCompatParcelizer implements Runnable {
        private final Reference<EditText> read;

        AudioAttributesCompatParcelizer(EditText editText) {
            this.read = new WeakReference(editText);
        }

        @Override // o._booleanType.IconCompatParcelizer
        public final void read() {
            Handler handler;
            super.read();
            EditText editText = this.read.get();
            if (editText == null || (handler = editText.getHandler()) == null) {
                return;
            }
            handler.post(this);
        }

        @Override // java.lang.Runnable
        public final void run() {
            _primitiveAndWrapper.read(this.read.get(), 1);
        }
    }

    static void read(EditText editText, int i) {
        if (i == 1 && editText != null && editText.isAttachedToWindow()) {
            Editable editableText = editText.getEditableText();
            int selectionStart = Selection.getSelectionStart(editableText);
            int selectionEnd = Selection.getSelectionEnd(editableText);
            _booleanType.AudioAttributesCompatParcelizer().write(editableText);
            stdManglePropertyName.RemoteActionCompatParcelizer(editableText, selectionStart, selectionEnd);
        }
    }
}
