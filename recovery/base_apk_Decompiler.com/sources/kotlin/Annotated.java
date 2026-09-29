package kotlin;

import android.content.ClipData;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.view.inputmethod.InputContentInfo;
import kotlin.StringDeserializer;

/* JADX INFO: loaded from: classes2.dex */
public final class Annotated {

    public interface AudioAttributesCompatParcelizer {
        boolean RemoteActionCompatParcelizer(getAnnotation getannotation, int i, Bundle bundle);
    }

    @Deprecated
    public static InputConnection read(InputConnection inputConnection, EditorInfo editorInfo, final AudioAttributesCompatParcelizer audioAttributesCompatParcelizer) {
        configureFromStringCreator.AudioAttributesCompatParcelizer(inputConnection, "inputConnection must be non-null");
        configureFromStringCreator.AudioAttributesCompatParcelizer(editorInfo, "editorInfo must be non-null");
        configureFromStringCreator.AudioAttributesCompatParcelizer(audioAttributesCompatParcelizer, "onCommitContentListener must be non-null");
        return new InputConnectionWrapper(inputConnection, false) { // from class: o.Annotated.5
            @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
            public boolean commitContent(InputContentInfo inputContentInfo, int i, Bundle bundle) {
                if (audioAttributesCompatParcelizer.RemoteActionCompatParcelizer(getAnnotation.write(inputContentInfo), i, bundle)) {
                    return true;
                }
                return super.commitContent(inputContentInfo, i, bundle);
            }
        };
    }

    public static InputConnection IconCompatParcelizer(View view, InputConnection inputConnection, EditorInfo editorInfo) {
        return read(inputConnection, editorInfo, IconCompatParcelizer(view));
    }

    private static AudioAttributesCompatParcelizer IconCompatParcelizer(final View view) {
        return new AudioAttributesCompatParcelizer() { // from class: o.hasAnnotation
            @Override // o.Annotated.AudioAttributesCompatParcelizer
            public final boolean RemoteActionCompatParcelizer(getAnnotation getannotation, int i, Bundle bundle) {
                return Annotated.read(view, getannotation, i, bundle);
            }
        };
    }

    static /* synthetic */ boolean read(View view, getAnnotation getannotation, int i, Bundle bundle) {
        if ((i & 1) != 0) {
            try {
                getannotation.IconCompatParcelizer();
                Parcelable parcelable = (Parcelable) getannotation.write();
                bundle = bundle == null ? new Bundle() : new Bundle(bundle);
                bundle.putParcelable("androidx.core.view.extra.INPUT_CONTENT_INFO", parcelable);
            } catch (Exception unused) {
                return false;
            }
        }
        return InvalidTypeIdException.read(view, new StringDeserializer.read(new ClipData(getannotation.read(), new ClipData.Item(getannotation.RemoteActionCompatParcelizer())), 2).RemoteActionCompatParcelizer(getannotation.AudioAttributesCompatParcelizer()).write(bundle).write()) == null;
    }

    @Deprecated
    public Annotated() {
    }
}
