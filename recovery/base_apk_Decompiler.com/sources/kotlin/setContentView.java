package kotlin;

import android.content.res.TypedArray;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;
import kotlin._init_lambda5;

/* JADX INFO: loaded from: classes.dex */
public class setContentView {
    private final DefaultAccessorNamingStrategyBaseNameValidator AudioAttributesCompatParcelizer;
    private final EditText write;

    public setContentView(EditText editText) {
        this.write = editText;
        this.AudioAttributesCompatParcelizer = new DefaultAccessorNamingStrategyBaseNameValidator(editText);
    }

    public void write(AttributeSet attributeSet, int i) {
        TypedArray typedArrayObtainStyledAttributes = this.write.getContext().obtainStyledAttributes(attributeSet, _init_lambda5.AudioAttributesImplApi26Parcelizer.AppCompatTextView, i, 0);
        try {
            boolean z = typedArrayObtainStyledAttributes.hasValue(_init_lambda5.AudioAttributesImplApi26Parcelizer.AppCompatTextView_emojiCompatEnabled) ? typedArrayObtainStyledAttributes.getBoolean(_init_lambda5.AudioAttributesImplApi26Parcelizer.AppCompatTextView_emojiCompatEnabled, true) : true;
            typedArrayObtainStyledAttributes.recycle();
            AudioAttributesCompatParcelizer(z);
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    public boolean write(KeyListener keyListener) {
        return !(keyListener instanceof NumberKeyListener);
    }

    public void AudioAttributesCompatParcelizer(boolean z) {
        this.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer(z);
    }

    public KeyListener RemoteActionCompatParcelizer(KeyListener keyListener) {
        return write(keyListener) ? this.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer(keyListener) : keyListener;
    }

    public InputConnection read(InputConnection inputConnection, EditorInfo editorInfo) {
        return this.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer(inputConnection, editorInfo);
    }
}
