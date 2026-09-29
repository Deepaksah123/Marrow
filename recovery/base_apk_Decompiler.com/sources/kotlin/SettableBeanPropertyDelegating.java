package kotlin;

import android.view.Choreographer;
import android.view.inputmethod.EditorInfo;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import java.util.concurrent.Executor;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\u0010\u000b\n\u0000\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0002¢\u0006\u0004\b\u0002\u0010\u0003\u001a#\u0010\b\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\b\u0010\t\u001a\u0013\u0010\f\u001a\u00020\u000b*\u00020\nH\u0000¢\u0006\u0004\b\f\u0010\r\u001a\u001f\u0010\u0002\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0002\u0010\u0010"}, d2 = {"Landroid/view/inputmethod/EditorInfo;", "", "write", "(Landroid/view/inputmethod/EditorInfo;)V", "Lo/KeyDeserializers;", "p0", "Lo/hasValueTypeDeserializer;", "p1", "RemoteActionCompatParcelizer", "(Landroid/view/inputmethod/EditorInfo;Lo/KeyDeserializers;Lo/hasValueTypeDeserializer;)V", "Landroid/view/Choreographer;", "Ljava/util/concurrent/Executor;", "read", "(Landroid/view/Choreographer;)Ljava/util/concurrent/Executor;", "", "", "(II)Z"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class SettableBeanPropertyDelegating {
    private static final boolean write(int i, int i2) {
        return (i & i2) == i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void write(EditorInfo editorInfo) {
        if (_booleanType.read()) {
            _booleanType.AudioAttributesCompatParcelizer().read(editorInfo);
        }
    }

    public static final void RemoteActionCompatParcelizer(EditorInfo editorInfo, KeyDeserializers keyDeserializers, hasValueTypeDeserializer hasvaluetypedeserializer) {
        int i;
        String audioAttributesCompatParcelizer;
        int audioAttributesCompatParcelizer2 = keyDeserializers.getAudioAttributesCompatParcelizer();
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
        int write = keyDeserializers.getWrite();
        if (getPropertyName.AudioAttributesCompatParcelizer(write, getPropertyName.INSTANCE.MediaBrowserCompatCustomActionResultReceiver())) {
            editorInfo.inputType = 1;
        } else if (getPropertyName.AudioAttributesCompatParcelizer(write, getPropertyName.INSTANCE.read())) {
            editorInfo.inputType = 1;
            editorInfo.imeOptions |= Integer.MIN_VALUE;
        } else if (getPropertyName.AudioAttributesCompatParcelizer(write, getPropertyName.INSTANCE.RemoteActionCompatParcelizer())) {
            editorInfo.inputType = 2;
        } else if (getPropertyName.AudioAttributesCompatParcelizer(write, getPropertyName.INSTANCE.AudioAttributesImplApi26Parcelizer())) {
            editorInfo.inputType = 3;
        } else if (getPropertyName.AudioAttributesCompatParcelizer(write, getPropertyName.INSTANCE.AudioAttributesImplApi21Parcelizer())) {
            editorInfo.inputType = 17;
        } else if (getPropertyName.AudioAttributesCompatParcelizer(write, getPropertyName.INSTANCE.AudioAttributesCompatParcelizer())) {
            editorInfo.inputType = 33;
        } else if (getPropertyName.AudioAttributesCompatParcelizer(write, getPropertyName.INSTANCE.AudioAttributesImplBaseParcelizer())) {
            editorInfo.inputType = TsExtractor.TS_STREAM_TYPE_AC3;
        } else if (getPropertyName.AudioAttributesCompatParcelizer(write, getPropertyName.INSTANCE.IconCompatParcelizer())) {
            editorInfo.inputType = 18;
        } else if (getPropertyName.AudioAttributesCompatParcelizer(write, getPropertyName.INSTANCE.write())) {
            editorInfo.inputType = 8194;
        } else {
            throw new IllegalStateException("Invalid Keyboard Type".toString());
        }
        if (!keyDeserializers.getIconCompatParcelizer() && write(editorInfo.inputType, 1)) {
            editorInfo.inputType |= 131072;
            if (ResolvableDeserializer.write(keyDeserializers.getAudioAttributesCompatParcelizer(), ResolvableDeserializer.INSTANCE.IconCompatParcelizer())) {
                editorInfo.imeOptions |= 1073741824;
            }
        }
        if (write(editorInfo.inputType, 1)) {
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
        editorInfo.initialSelStart = findProperty.AudioAttributesImplBaseParcelizer(hasvaluetypedeserializer.getAudioAttributesCompatParcelizer());
        editorInfo.initialSelEnd = findProperty.read(hasvaluetypedeserializer.getAudioAttributesCompatParcelizer());
        forRecord.RemoteActionCompatParcelizer(editorInfo, hasvaluetypedeserializer.AudioAttributesCompatParcelizer());
        editorInfo.imeOptions |= 33554432;
    }

    public static final Executor read(final Choreographer choreographer) {
        return new Executor() { // from class: o.getRoid
            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                SettableBeanPropertyDelegating.write(choreographer, runnable);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void IconCompatParcelizer(Runnable runnable, long j) {
        runnable.run();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void write(Choreographer choreographer, final Runnable runnable) {
        choreographer.postFrameCallback(new Choreographer.FrameCallback() { // from class: o.UnresolvedForwardReference
            @Override // android.view.Choreographer.FrameCallback
            public final void doFrame(long j) {
                SettableBeanPropertyDelegating.IconCompatParcelizer(runnable, j);
            }
        });
    }
}
