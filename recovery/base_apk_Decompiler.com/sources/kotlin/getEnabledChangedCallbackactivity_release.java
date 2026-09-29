package kotlin;

import android.content.res.TypedArray;
import android.text.InputFilter;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.widget.TextView;
import kotlin._init_lambda5;

/* JADX INFO: loaded from: classes.dex */
public class getEnabledChangedCallbackactivity_release {
    private final TextView RemoteActionCompatParcelizer;
    private final _databindException write;

    public getEnabledChangedCallbackactivity_release(TextView textView) {
        this.RemoteActionCompatParcelizer = textView;
        this.write = new _databindException(textView);
    }

    public void AudioAttributesCompatParcelizer(AttributeSet attributeSet, int i) {
        TypedArray typedArrayObtainStyledAttributes = this.RemoteActionCompatParcelizer.getContext().obtainStyledAttributes(attributeSet, _init_lambda5.AudioAttributesImplApi26Parcelizer.AppCompatTextView, i, 0);
        try {
            boolean z = typedArrayObtainStyledAttributes.hasValue(_init_lambda5.AudioAttributesImplApi26Parcelizer.AppCompatTextView_emojiCompatEnabled) ? typedArrayObtainStyledAttributes.getBoolean(_init_lambda5.AudioAttributesImplApi26Parcelizer.AppCompatTextView_emojiCompatEnabled, true) : true;
            typedArrayObtainStyledAttributes.recycle();
            read(z);
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    public void read(boolean z) {
        this.write.RemoteActionCompatParcelizer(z);
    }

    public boolean write() {
        return this.write.RemoteActionCompatParcelizer();
    }

    public InputFilter[] AudioAttributesCompatParcelizer(InputFilter[] inputFilterArr) {
        return this.write.RemoteActionCompatParcelizer(inputFilterArr);
    }

    public void write(boolean z) {
        this.write.AudioAttributesCompatParcelizer(z);
    }

    public TransformationMethod read(TransformationMethod transformationMethod) {
        return this.write.RemoteActionCompatParcelizer(transformationMethod);
    }
}
