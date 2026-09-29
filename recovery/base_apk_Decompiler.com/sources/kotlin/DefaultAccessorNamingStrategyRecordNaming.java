package kotlin;

import android.text.Editable;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.widget.TextView;

/* JADX INFO: loaded from: classes2.dex */
final class DefaultAccessorNamingStrategyRecordNaming extends InputConnectionWrapper {
    private final write IconCompatParcelizer;
    private final TextView RemoteActionCompatParcelizer;

    DefaultAccessorNamingStrategyRecordNaming(TextView textView, InputConnection inputConnection, EditorInfo editorInfo) {
        this(textView, inputConnection, editorInfo, new write());
    }

    private DefaultAccessorNamingStrategyRecordNaming(TextView textView, InputConnection inputConnection, EditorInfo editorInfo, write writeVar) {
        super(inputConnection, false);
        this.RemoteActionCompatParcelizer = textView;
        this.IconCompatParcelizer = writeVar;
        writeVar.AudioAttributesCompatParcelizer(editorInfo);
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int i, int i2) {
        return this.IconCompatParcelizer.RemoteActionCompatParcelizer(this, RemoteActionCompatParcelizer(), i, i2, false) || super.deleteSurroundingText(i, i2);
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingTextInCodePoints(int i, int i2) {
        return this.IconCompatParcelizer.RemoteActionCompatParcelizer(this, RemoteActionCompatParcelizer(), i, i2, true) || super.deleteSurroundingTextInCodePoints(i, i2);
    }

    private Editable RemoteActionCompatParcelizer() {
        return this.RemoteActionCompatParcelizer.getEditableText();
    }

    public static class write {
        public boolean RemoteActionCompatParcelizer(InputConnection inputConnection, Editable editable, int i, int i2, boolean z) {
            return _booleanType.read(inputConnection, editable, i, i2, z);
        }

        public void AudioAttributesCompatParcelizer(EditorInfo editorInfo) {
            if (_booleanType.read()) {
                _booleanType.AudioAttributesCompatParcelizer().read(editorInfo);
            }
        }
    }
}
