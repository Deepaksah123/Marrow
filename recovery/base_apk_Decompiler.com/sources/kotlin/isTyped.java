package kotlin;

import com.google.android.exoplayer2.C;
import java.io.IOException;
import kotlin.isCollectionMapOrArray;
import kotlin.removeFirstOccurrence;

/* JADX INFO: loaded from: classes2.dex */
public final class isTyped implements findConstructor {
    private boolean RemoteActionCompatParcelizer;
    private final isVisibleForView IconCompatParcelizer = new isVisibleForView();
    private final AsPropertyTypeDeserializer read = new AsPropertyTypeDeserializer(16384);

    @Override // kotlin.findConstructor
    public final void RemoteActionCompatParcelizer() {
    }

    static {
        new getClassDescription() { // from class: o.ViewMatcherMulti
            @Override // kotlin.getClassDescription
            public final findConstructor[] RemoteActionCompatParcelizer() {
                return isTyped.IconCompatParcelizer();
            }
        };
    }

    static /* synthetic */ findConstructor[] IconCompatParcelizer() {
        return new findConstructor[]{new isTyped()};
    }

    @Override // kotlin.findConstructor
    public final boolean read(closeOnFailAndThrowAsIOE closeonfailandthrowasioe) throws IOException {
        AsPropertyTypeDeserializer asPropertyTypeDeserializer = new AsPropertyTypeDeserializer(10);
        int i = 0;
        while (true) {
            closeonfailandthrowasioe.RemoteActionCompatParcelizer(asPropertyTypeDeserializer.RemoteActionCompatParcelizer(), 0, 10);
            asPropertyTypeDeserializer.MediaBrowserCompatCustomActionResultReceiver(0);
            if (asPropertyTypeDeserializer.onPause() != 4801587) {
                break;
            }
            asPropertyTypeDeserializer.AudioAttributesImplBaseParcelizer(3);
            int iOnPlay = asPropertyTypeDeserializer.onPlay();
            i += iOnPlay + 10;
            closeonfailandthrowasioe.write(iOnPlay);
        }
        closeonfailandthrowasioe.RemoteActionCompatParcelizer();
        closeonfailandthrowasioe.write(i);
        int i2 = 0;
        int i3 = i;
        while (true) {
            closeonfailandthrowasioe.RemoteActionCompatParcelizer(asPropertyTypeDeserializer.RemoteActionCompatParcelizer(), 0, 7);
            asPropertyTypeDeserializer.MediaBrowserCompatCustomActionResultReceiver(0);
            int iOnPrepare = asPropertyTypeDeserializer.onPrepare();
            if (iOnPrepare == 44096 || iOnPrepare == 44097) {
                i2++;
                if (i2 >= 4) {
                    return true;
                }
                int iAudioAttributesCompatParcelizer = _interfaces.AudioAttributesCompatParcelizer(asPropertyTypeDeserializer.RemoteActionCompatParcelizer(), iOnPrepare);
                if (iAudioAttributesCompatParcelizer == -1) {
                    return false;
                }
                closeonfailandthrowasioe.write(iAudioAttributesCompatParcelizer - 7);
            } else {
                closeonfailandthrowasioe.RemoteActionCompatParcelizer();
                i3++;
                if (i3 - i >= 8192) {
                    return false;
                }
                closeonfailandthrowasioe.write(i3);
                i2 = 0;
            }
        }
    }

    @Override // kotlin.findConstructor
    public final void read(findRawSuperTypes findrawsupertypes) {
        this.IconCompatParcelizer.write(findrawsupertypes, new removeFirstOccurrence.write(0, 1));
        findrawsupertypes.RemoteActionCompatParcelizer();
        findrawsupertypes.read(new isCollectionMapOrArray.write(C.TIME_UNSET));
    }

    @Override // kotlin.findConstructor
    public final void write(long j, long j2) {
        this.RemoteActionCompatParcelizer = false;
        this.IconCompatParcelizer.write();
    }

    @Override // kotlin.findConstructor
    public final int RemoteActionCompatParcelizer(closeOnFailAndThrowAsIOE closeonfailandthrowasioe, isJacksonStdImpl isjacksonstdimpl) throws IOException {
        int iAudioAttributesCompatParcelizer = closeonfailandthrowasioe.AudioAttributesCompatParcelizer(this.read.RemoteActionCompatParcelizer(), 0, 16384);
        if (iAudioAttributesCompatParcelizer == -1) {
            return -1;
        }
        this.read.MediaBrowserCompatCustomActionResultReceiver(0);
        this.read.AudioAttributesCompatParcelizer(iAudioAttributesCompatParcelizer);
        if (!this.RemoteActionCompatParcelizer) {
            this.IconCompatParcelizer.IconCompatParcelizer(0L, 4);
            this.RemoteActionCompatParcelizer = true;
        }
        this.IconCompatParcelizer.read(this.read);
        return 0;
    }
}
