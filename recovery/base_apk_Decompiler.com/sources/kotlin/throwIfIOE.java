package kotlin;

import java.io.IOException;
import java.util.Arrays;
import kotlin.isCollectionMapOrArray;

/* JADX INFO: loaded from: classes2.dex */
final class throwIfIOE {
    private int AudioAttributesCompatParcelizer;
    private int AudioAttributesImplApi21Parcelizer;
    private int AudioAttributesImplApi26Parcelizer;
    private int AudioAttributesImplBaseParcelizer;
    protected final nonNullString IconCompatParcelizer;
    private final long MediaBrowserCompatCustomActionResultReceiver;
    private int[] MediaBrowserCompatItemReceiver;
    private long[] MediaBrowserCompatSearchResultReceiver;
    private final int MediaMetadataCompat;
    private final int RemoteActionCompatParcelizer;
    private int read;
    private final int write;

    public throwIfIOE(int i, int i2, long j, int i3, nonNullString nonnullstring) {
        boolean z = true;
        if (i2 != 1 && i2 != 2) {
            z = false;
        }
        buildTypeSerializer.IconCompatParcelizer(z);
        this.MediaBrowserCompatCustomActionResultReceiver = j;
        this.MediaMetadataCompat = i3;
        this.IconCompatParcelizer = nonnullstring;
        this.RemoteActionCompatParcelizer = AudioAttributesCompatParcelizer(i, i2 == 2 ? 1667497984 : 1651965952);
        this.write = i2 == 2 ? AudioAttributesCompatParcelizer(i, 1650720768) : -1;
        this.MediaBrowserCompatSearchResultReceiver = new long[512];
        this.MediaBrowserCompatItemReceiver = new int[512];
    }

    public final void AudioAttributesCompatParcelizer(long j) {
        if (this.AudioAttributesImplApi26Parcelizer == this.MediaBrowserCompatItemReceiver.length) {
            long[] jArr = this.MediaBrowserCompatSearchResultReceiver;
            this.MediaBrowserCompatSearchResultReceiver = Arrays.copyOf(jArr, (jArr.length * 3) / 2);
            int[] iArr = this.MediaBrowserCompatItemReceiver;
            this.MediaBrowserCompatItemReceiver = Arrays.copyOf(iArr, (iArr.length * 3) / 2);
        }
        long[] jArr2 = this.MediaBrowserCompatSearchResultReceiver;
        int i = this.AudioAttributesImplApi26Parcelizer;
        jArr2[i] = j;
        this.MediaBrowserCompatItemReceiver[i] = this.AudioAttributesImplBaseParcelizer;
        this.AudioAttributesImplApi26Parcelizer = i + 1;
    }

    private void IconCompatParcelizer() {
        this.AudioAttributesCompatParcelizer++;
    }

    private long AudioAttributesCompatParcelizer() {
        return write(this.AudioAttributesCompatParcelizer);
    }

    private long read() {
        return write(1);
    }

    public final void write() {
        this.AudioAttributesImplBaseParcelizer++;
    }

    public final void RemoteActionCompatParcelizer() {
        this.MediaBrowserCompatSearchResultReceiver = Arrays.copyOf(this.MediaBrowserCompatSearchResultReceiver, this.AudioAttributesImplApi26Parcelizer);
        this.MediaBrowserCompatItemReceiver = Arrays.copyOf(this.MediaBrowserCompatItemReceiver, this.AudioAttributesImplApi26Parcelizer);
    }

    public final boolean IconCompatParcelizer(int i) {
        return this.RemoteActionCompatParcelizer == i || this.write == i;
    }

    private boolean AudioAttributesImplBaseParcelizer() {
        return Arrays.binarySearch(this.MediaBrowserCompatItemReceiver, this.AudioAttributesCompatParcelizer) >= 0;
    }

    public final void AudioAttributesCompatParcelizer(int i) {
        this.AudioAttributesImplApi21Parcelizer = i;
        this.read = i;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final boolean write(closeOnFailAndThrowAsIOE closeonfailandthrowasioe) throws IOException {
        int i = this.read;
        int iAudioAttributesCompatParcelizer = i - this.IconCompatParcelizer.AudioAttributesCompatParcelizer(closeonfailandthrowasioe, i, false);
        this.read = iAudioAttributesCompatParcelizer;
        boolean z = iAudioAttributesCompatParcelizer == 0;
        if (z) {
            if (this.AudioAttributesImplApi21Parcelizer > 0) {
                this.IconCompatParcelizer.IconCompatParcelizer(AudioAttributesCompatParcelizer(), AudioAttributesImplBaseParcelizer() ? 1 : 0, this.AudioAttributesImplApi21Parcelizer, 0, null);
            }
            IconCompatParcelizer();
        }
        return z;
    }

    public final void RemoteActionCompatParcelizer(long j) {
        if (this.AudioAttributesImplApi26Parcelizer == 0) {
            this.AudioAttributesCompatParcelizer = 0;
        } else {
            this.AudioAttributesCompatParcelizer = this.MediaBrowserCompatItemReceiver[LaissezFaireSubTypeValidator.RemoteActionCompatParcelizer(this.MediaBrowserCompatSearchResultReceiver, j, true)];
        }
    }

    public final isCollectionMapOrArray.read read(long j) {
        int i = (int) (j / read());
        int iWrite = LaissezFaireSubTypeValidator.write(this.MediaBrowserCompatItemReceiver, i, true, true);
        if (this.MediaBrowserCompatItemReceiver[iWrite] == i) {
            return new isCollectionMapOrArray.read(RemoteActionCompatParcelizer(iWrite));
        }
        isLocalType islocaltypeRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(iWrite);
        int i2 = iWrite + 1;
        if (i2 < this.MediaBrowserCompatSearchResultReceiver.length) {
            return new isCollectionMapOrArray.read(islocaltypeRemoteActionCompatParcelizer, RemoteActionCompatParcelizer(i2));
        }
        return new isCollectionMapOrArray.read(islocaltypeRemoteActionCompatParcelizer);
    }

    private long write(int i) {
        return (this.MediaBrowserCompatCustomActionResultReceiver * ((long) i)) / ((long) this.MediaMetadataCompat);
    }

    private isLocalType RemoteActionCompatParcelizer(int i) {
        return new isLocalType(((long) this.MediaBrowserCompatItemReceiver[i]) * read(), this.MediaBrowserCompatSearchResultReceiver[i]);
    }

    private static int AudioAttributesCompatParcelizer(int i, int i2) {
        return (((i % 10) + 48) << 8) | ((i / 10) + 48) | i2;
    }
}
