package kotlin;

import android.view.inputmethod.EditorInfo;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a=\u0010\u000b\u001a\u00020\n*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007H\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0002\u001a\u00020\r2\u0006\u0010\u0004\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010"}, d2 = {"Landroid/view/inputmethod/EditorInfo;", "", "p0", "Lo/findProperty;", "p1", "Lo/KeyDeserializers;", "p2", "", "", "p3", "", "read", "(Landroid/view/inputmethod/EditorInfo;Ljava/lang/CharSequence;JLo/KeyDeserializers;[Ljava/lang/String;)V", "", "", "IconCompatParcelizer", "(II)Z"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class setPageMarginDrawable {
    private static final boolean IconCompatParcelizer(int i, int i2) {
        return (i & i2) == i2;
    }

    public static /* synthetic */ void read$default(EditorInfo editorInfo, CharSequence charSequence, long j, KeyDeserializers keyDeserializers, String[] strArr, int i, Object obj) {
        if ((i & 8) != 0) {
            strArr = null;
        }
        read(editorInfo, charSequence, j, keyDeserializers, strArr);
    }

    public static final void read(EditorInfo editorInfo, CharSequence charSequence, long j, KeyDeserializers keyDeserializers, String[] strArr) {
        int i;
        String audioAttributesCompatParcelizer;
        int audioAttributesCompatParcelizer2 = keyDeserializers.getAudioAttributesCompatParcelizer();
        int i2 = 3;
        if (ResolvableDeserializer.write(audioAttributesCompatParcelizer2, ResolvableDeserializer.INSTANCE.IconCompatParcelizer())) {
            i = !keyDeserializers.getIconCompatParcelizer() ? 0 : 6;
        } else if (ResolvableDeserializer.write(audioAttributesCompatParcelizer2, ResolvableDeserializer.INSTANCE.AudioAttributesCompatParcelizer())) {
            i = 1;
        } else if (ResolvableDeserializer.write(audioAttributesCompatParcelizer2, ResolvableDeserializer.INSTANCE.write())) {
            i = 2;
        } else if (ResolvableDeserializer.write(audioAttributesCompatParcelizer2, ResolvableDeserializer.INSTANCE.read())) {
            i = 5;
        } else if (ResolvableDeserializer.write(audioAttributesCompatParcelizer2, ResolvableDeserializer.INSTANCE.MediaBrowserCompatItemReceiver())) {
            i = 7;
        } else if (ResolvableDeserializer.write(audioAttributesCompatParcelizer2, ResolvableDeserializer.INSTANCE.AudioAttributesImplBaseParcelizer())) {
            i = 3;
        } else if (ResolvableDeserializer.write(audioAttributesCompatParcelizer2, ResolvableDeserializer.INSTANCE.AudioAttributesImplApi26Parcelizer())) {
            i = 4;
        } else {
            if (!ResolvableDeserializer.write(audioAttributesCompatParcelizer2, ResolvableDeserializer.INSTANCE.RemoteActionCompatParcelizer())) {
                throw new IllegalStateException("invalid ImeAction".toString());
            }
        }
        editorInfo.imeOptions = i;
        getManagedReferenceName mediaBrowserCompatCustomActionResultReceiver = keyDeserializers.getMediaBrowserCompatCustomActionResultReceiver();
        if (mediaBrowserCompatCustomActionResultReceiver != null && (audioAttributesCompatParcelizer = mediaBrowserCompatCustomActionResultReceiver.getAudioAttributesCompatParcelizer()) != null) {
            editorInfo.privateImeOptions = audioAttributesCompatParcelizer;
        }
        removeRearDisplayPresentationStatusListener.INSTANCE.IconCompatParcelizer(editorInfo, keyDeserializers.getAudioAttributesImplApi21Parcelizer());
        int write = keyDeserializers.getWrite();
        if (getPropertyName.AudioAttributesCompatParcelizer(write, getPropertyName.INSTANCE.MediaBrowserCompatCustomActionResultReceiver())) {
            i2 = 1;
        } else if (getPropertyName.AudioAttributesCompatParcelizer(write, getPropertyName.INSTANCE.read())) {
            editorInfo.imeOptions |= Integer.MIN_VALUE;
            i2 = 1;
        } else if (getPropertyName.AudioAttributesCompatParcelizer(write, getPropertyName.INSTANCE.RemoteActionCompatParcelizer())) {
            i2 = 2;
        } else if (!getPropertyName.AudioAttributesCompatParcelizer(write, getPropertyName.INSTANCE.AudioAttributesImplApi26Parcelizer())) {
            if (getPropertyName.AudioAttributesCompatParcelizer(write, getPropertyName.INSTANCE.AudioAttributesImplApi21Parcelizer())) {
                i2 = 17;
            } else if (getPropertyName.AudioAttributesCompatParcelizer(write, getPropertyName.INSTANCE.AudioAttributesCompatParcelizer())) {
                i2 = 33;
            } else if (getPropertyName.AudioAttributesCompatParcelizer(write, getPropertyName.INSTANCE.AudioAttributesImplBaseParcelizer())) {
                i2 = TsExtractor.TS_STREAM_TYPE_AC3;
            } else if (getPropertyName.AudioAttributesCompatParcelizer(write, getPropertyName.INSTANCE.IconCompatParcelizer())) {
                i2 = 18;
            } else {
                if (!getPropertyName.AudioAttributesCompatParcelizer(write, getPropertyName.INSTANCE.write())) {
                    throw new IllegalStateException("Invalid Keyboard Type".toString());
                }
                i2 = 8194;
            }
        }
        editorInfo.inputType = i2;
        if (!keyDeserializers.getIconCompatParcelizer() && IconCompatParcelizer(editorInfo.inputType, 1)) {
            editorInfo.inputType |= 131072;
            if (ResolvableDeserializer.write(keyDeserializers.getAudioAttributesCompatParcelizer(), ResolvableDeserializer.INSTANCE.IconCompatParcelizer())) {
                editorInfo.imeOptions |= 1073741824;
            }
        }
        if (IconCompatParcelizer(editorInfo.inputType, 1)) {
            int read = keyDeserializers.getRead();
            if (_set.read(read, _set.INSTANCE.write())) {
                editorInfo.inputType |= 4096;
            } else if (_set.read(read, _set.INSTANCE.IconCompatParcelizer())) {
                editorInfo.inputType |= 8192;
            } else if (_set.read(read, _set.INSTANCE.RemoteActionCompatParcelizer())) {
                editorInfo.inputType |= 16384;
            }
            if (keyDeserializers.getRemoteActionCompatParcelizer()) {
                editorInfo.inputType |= 32768;
            }
        }
        editorInfo.initialSelStart = findProperty.AudioAttributesImplBaseParcelizer(j);
        editorInfo.initialSelEnd = findProperty.read(j);
        forRecord.RemoteActionCompatParcelizer(editorInfo, charSequence);
        if (strArr != null) {
            forRecord.write(editorInfo, strArr);
        }
        editorInfo.imeOptions |= 33554432;
        if (getLocalMatrix.write() && !getPropertyName.AudioAttributesCompatParcelizer(keyDeserializers.getWrite(), getPropertyName.INSTANCE.AudioAttributesImplBaseParcelizer()) && !getPropertyName.AudioAttributesCompatParcelizer(keyDeserializers.getWrite(), getPropertyName.INSTANCE.IconCompatParcelizer())) {
            forRecord.AudioAttributesCompatParcelizer(editorInfo, true);
            setNonPrimaryAlpha.INSTANCE.read(editorInfo);
        } else {
            forRecord.AudioAttributesCompatParcelizer(editorInfo, false);
        }
    }
}
