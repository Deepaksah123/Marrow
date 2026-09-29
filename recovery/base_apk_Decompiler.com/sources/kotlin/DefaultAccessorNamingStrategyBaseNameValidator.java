package kotlin;

import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;

/* JADX INFO: loaded from: classes2.dex */
public final class DefaultAccessorNamingStrategyBaseNameValidator {
    private final read AudioAttributesCompatParcelizer;
    private int read = Integer.MAX_VALUE;
    private int IconCompatParcelizer = 0;

    public DefaultAccessorNamingStrategyBaseNameValidator(EditText editText) {
        StringCollectionDeserializer.write(editText, "editText cannot be null");
        this.AudioAttributesCompatParcelizer = new AudioAttributesCompatParcelizer(editText, false);
    }

    public final KeyListener AudioAttributesCompatParcelizer(KeyListener keyListener) {
        return this.AudioAttributesCompatParcelizer.write(keyListener);
    }

    public final InputConnection AudioAttributesCompatParcelizer(InputConnection inputConnection, EditorInfo editorInfo) {
        if (inputConnection == null) {
            return null;
        }
        return this.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(inputConnection, editorInfo);
    }

    public final void AudioAttributesCompatParcelizer(boolean z) {
        this.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer(z);
    }

    static class read {
        void AudioAttributesCompatParcelizer(boolean z) {
        }

        InputConnection RemoteActionCompatParcelizer(InputConnection inputConnection, EditorInfo editorInfo) {
            return inputConnection;
        }

        KeyListener write(KeyListener keyListener) {
            return keyListener;
        }

        read() {
        }
    }

    static class AudioAttributesCompatParcelizer extends read {
        private final EditText read;
        private final _primitiveAndWrapper write;

        AudioAttributesCompatParcelizer(EditText editText, boolean z) {
            this.read = editText;
            _primitiveAndWrapper _primitiveandwrapper = new _primitiveAndWrapper(editText, z);
            this.write = _primitiveandwrapper;
            editText.addTextChangedListener(_primitiveandwrapper);
            editText.setEditableFactory(EnumNamingStrategyFactory.write());
        }

        @Override // o.DefaultAccessorNamingStrategyBaseNameValidator.read
        KeyListener write(KeyListener keyListener) {
            if (!(keyListener instanceof DefaultAccessorNamingStrategyProvider)) {
                if (keyListener == null) {
                    return null;
                }
                if (!(keyListener instanceof NumberKeyListener)) {
                    return new DefaultAccessorNamingStrategyProvider(keyListener);
                }
            }
            return keyListener;
        }

        @Override // o.DefaultAccessorNamingStrategyBaseNameValidator.read
        InputConnection RemoteActionCompatParcelizer(InputConnection inputConnection, EditorInfo editorInfo) {
            return inputConnection instanceof DefaultAccessorNamingStrategyRecordNaming ? inputConnection : new DefaultAccessorNamingStrategyRecordNaming(this.read, inputConnection, editorInfo);
        }

        @Override // o.DefaultAccessorNamingStrategyBaseNameValidator.read
        void AudioAttributesCompatParcelizer(boolean z) {
            this.write.AudioAttributesCompatParcelizer(z);
        }
    }
}
