package kotlin;

import com.google.android.exoplayer2.C;
import java.io.IOException;
import kotlin.isCollectionMapOrArray;
import kotlin.removeFirstOccurrence;

/* JADX INFO: loaded from: classes2.dex */
public final class TypeKey implements findConstructor {
    private boolean IconCompatParcelizer;
    private final ViewMatcher AudioAttributesCompatParcelizer = new ViewMatcher();
    private final AsPropertyTypeDeserializer write = new AsPropertyTypeDeserializer(2786);

    @Override // kotlin.findConstructor
    public final void RemoteActionCompatParcelizer() {
    }

    static {
        new getClassDescription() { // from class: o.ViewMatcherSingle
            @Override // kotlin.getClassDescription
            public final findConstructor[] RemoteActionCompatParcelizer() {
                return TypeKey.IconCompatParcelizer();
            }
        };
    }

    static /* synthetic */ findConstructor[] IconCompatParcelizer() {
        return new findConstructor[]{new TypeKey()};
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
            closeonfailandthrowasioe.RemoteActionCompatParcelizer(asPropertyTypeDeserializer.RemoteActionCompatParcelizer(), 0, 6);
            asPropertyTypeDeserializer.MediaBrowserCompatCustomActionResultReceiver(0);
            if (asPropertyTypeDeserializer.onPrepare() != 2935) {
                closeonfailandthrowasioe.RemoteActionCompatParcelizer();
                i3++;
                if (i3 - i >= 8192) {
                    return false;
                }
                closeonfailandthrowasioe.write(i3);
                i2 = 0;
            } else {
                i2++;
                if (i2 >= 4) {
                    return true;
                }
                int i4 = isJava8TimeClass.read(asPropertyTypeDeserializer.RemoteActionCompatParcelizer());
                if (i4 == -1) {
                    return false;
                }
                closeonfailandthrowasioe.write(i4 - 6);
            }
        }
    }

    @Override // kotlin.findConstructor
    public final void read(findRawSuperTypes findrawsupertypes) {
        this.AudioAttributesCompatParcelizer.write(findrawsupertypes, new removeFirstOccurrence.write(0, 1));
        findrawsupertypes.RemoteActionCompatParcelizer();
        findrawsupertypes.read(new isCollectionMapOrArray.write(C.TIME_UNSET));
    }

    @Override // kotlin.findConstructor
    public final void write(long j, long j2) {
        this.IconCompatParcelizer = false;
        this.AudioAttributesCompatParcelizer.write();
    }

    @Override // kotlin.findConstructor
    public final int RemoteActionCompatParcelizer(closeOnFailAndThrowAsIOE closeonfailandthrowasioe, isJacksonStdImpl isjacksonstdimpl) throws IOException {
        int iAudioAttributesCompatParcelizer = closeonfailandthrowasioe.AudioAttributesCompatParcelizer(this.write.RemoteActionCompatParcelizer(), 0, 2786);
        if (iAudioAttributesCompatParcelizer == -1) {
            return -1;
        }
        this.write.MediaBrowserCompatCustomActionResultReceiver(0);
        this.write.AudioAttributesCompatParcelizer(iAudioAttributesCompatParcelizer);
        if (!this.IconCompatParcelizer) {
            this.AudioAttributesCompatParcelizer.IconCompatParcelizer(0L, 4);
            this.IconCompatParcelizer = true;
        }
        this.AudioAttributesCompatParcelizer.read(this.write);
        return 0;
    }
}
