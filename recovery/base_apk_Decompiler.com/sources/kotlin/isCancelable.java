package kotlin;

import kotlin.Metadata;
import kotlin.onDismiss;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0000\u0018\u00002\u00020\u0001:\u0002\u0010\u001cB7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\fJ?\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0003\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u0010\u0010\u0011JW\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00122\b\u0010\b\u001a\u0004\u0018\u00010\u00122\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u000e¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0010\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0016\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001e\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001c\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0019R\u0014\u0010\u0018\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0019R\u0014\u0010\u001f\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0019"}, d2 = {"Lo/isCancelable;", "", "", "p0", "Lo/onGetLayoutInflater;", "p1", "Lo/getNextTransition;", "p2", "p3", "p4", "p5", "<init>", "(ILo/onGetLayoutInflater;JIIILo/MagicModuleRepositoryImplExternalSyntheticLambda0;)V", "Lo/isCancelable$write;", "", "Lo/isCancelable$RemoteActionCompatParcelizer;", "write", "(Lo/isCancelable$write;ZIIII)Lo/isCancelable$RemoteActionCompatParcelizer;", "Lo/setShowingForActionMode;", "p6", "p7", "p8", "IconCompatParcelizer", "(ZIJLo/setShowingForActionMode;IIIZZ)Lo/isCancelable$write;", "AudioAttributesCompatParcelizer", "I", "AudioAttributesImplApi21Parcelizer", "Lo/onGetLayoutInflater;", "RemoteActionCompatParcelizer", "J", "read", "AudioAttributesImplBaseParcelizer"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class isCancelable {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final int write;

    /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: from kotlin metadata */
    private final onGetLayoutInflater IconCompatParcelizer;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final int RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final long read;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final int AudioAttributesImplBaseParcelizer;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final int AudioAttributesCompatParcelizer;

    private isCancelable(int i, onGetLayoutInflater ongetlayoutinflater, long j, int i2, int i3, int i4) {
        this.write = i;
        this.IconCompatParcelizer = ongetlayoutinflater;
        this.read = j;
        this.RemoteActionCompatParcelizer = i2;
        this.AudioAttributesCompatParcelizer = i3;
        this.AudioAttributesImplBaseParcelizer = i4;
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\n\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\t\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0007\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\b\u001a\u0004\b\f\u0010\n"}, d2 = {"Lo/isCancelable$write;", "", "", "p0", "p1", "<init>", "(ZZ)V", "IconCompatParcelizer", "Z", "read", "()Z", "RemoteActionCompatParcelizer", "AudioAttributesCompatParcelizer"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class write {

        /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
        private final boolean read;

        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
        private final boolean IconCompatParcelizer;

        public write(boolean z, boolean z2) {
            this.read = z;
            this.IconCompatParcelizer = z2;
        }

        public /* synthetic */ write(boolean z, boolean z2, int i, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2);
        }

        /* JADX INFO: renamed from: read, reason: from getter */
        public final boolean getRead() {
            return this.read;
        }

        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from getter */
        public final boolean getIconCompatParcelizer() {
            return this.IconCompatParcelizer;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public write() {
            boolean z = false;
            this(z, z, 3, null);
        }
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\u0010\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\f\u0010\u0012R\u001a\u0010\u000e\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\"\u0010\f\u001a\u00020\b8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0017\u001a\u0004\b\u0010\u0010\u0018\"\u0004\b\u0015\u0010\u0019"}, d2 = {"Lo/isCancelable$RemoteActionCompatParcelizer;", "", "Lo/isTypeOrSuperTypeOf;", "p0", "Lo/_parser;", "p1", "Lo/setShowingForActionMode;", "p2", "", "p3", "<init>", "(Lo/isTypeOrSuperTypeOf;Lo/_parser;JZLo/MagicModuleRepositoryImplExternalSyntheticLambda0;)V", "read", "Lo/isTypeOrSuperTypeOf;", "write", "()Lo/isTypeOrSuperTypeOf;", "AudioAttributesCompatParcelizer", "Lo/_parser;", "()Lo/_parser;", "RemoteActionCompatParcelizer", "J", "IconCompatParcelizer", "()J", "Z", "()Z", "(Z)V"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class RemoteActionCompatParcelizer {

        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
        private final _parser RemoteActionCompatParcelizer;

        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
        private boolean read;

        /* JADX INFO: renamed from: read, reason: from kotlin metadata */
        private final isTypeOrSuperTypeOf AudioAttributesCompatParcelizer;
        private final long write;

        private RemoteActionCompatParcelizer(isTypeOrSuperTypeOf istypeorsupertypeof, _parser _parserVar, long j, boolean z) {
            this.AudioAttributesCompatParcelizer = istypeorsupertypeof;
            this.RemoteActionCompatParcelizer = _parserVar;
            this.write = j;
            this.read = z;
        }

        public /* synthetic */ RemoteActionCompatParcelizer(isTypeOrSuperTypeOf istypeorsupertypeof, _parser _parserVar, long j, boolean z, int i, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this(istypeorsupertypeof, _parserVar, j, (i & 8) != 0 ? true : z, null);
        }

        /* JADX INFO: renamed from: write, reason: from getter */
        public final isTypeOrSuperTypeOf getAudioAttributesCompatParcelizer() {
            return this.AudioAttributesCompatParcelizer;
        }

        /* JADX INFO: renamed from: read, reason: from getter */
        public final _parser getRemoteActionCompatParcelizer() {
            return this.RemoteActionCompatParcelizer;
        }

        /* JADX INFO: renamed from: IconCompatParcelizer, reason: from getter */
        public final long getWrite() {
            return this.write;
        }

        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from getter */
        public final boolean getRead() {
            return this.read;
        }

        public final void IconCompatParcelizer(boolean z) {
            this.read = z;
        }

        public /* synthetic */ RemoteActionCompatParcelizer(isTypeOrSuperTypeOf istypeorsupertypeof, _parser _parserVar, long j, boolean z, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this(istypeorsupertypeof, _parserVar, j, z);
        }
    }

    public final RemoteActionCompatParcelizer write(write p0, boolean p1, int p2, int p3, int p4, int p5) {
        RemoteActionCompatParcelizer remoteActionCompatParcelizerAudioAttributesCompatParcelizer;
        if (!p0.getIconCompatParcelizer() || (remoteActionCompatParcelizerAudioAttributesCompatParcelizer = this.IconCompatParcelizer.AudioAttributesCompatParcelizer(p1, p2, p3)) == null) {
            return null;
        }
        remoteActionCompatParcelizerAudioAttributesCompatParcelizer.IconCompatParcelizer(p2 >= 0 && (p5 == 0 || (p4 - setShowingForActionMode.IconCompatParcelizer(remoteActionCompatParcelizerAudioAttributesCompatParcelizer.getWrite()) >= 0 && p5 < this.write)));
        return remoteActionCompatParcelizerAudioAttributesCompatParcelizer;
    }

    public final write IconCompatParcelizer(boolean p0, int p1, long p2, setShowingForActionMode p3, int p4, int p5, int p6, boolean p7, boolean p8) {
        if (p3 == null) {
            return new write(true, true);
        }
        if (this.IconCompatParcelizer.getRemoteActionCompatParcelizer() != onDismiss.RemoteActionCompatParcelizer.read && (p4 >= this.RemoteActionCompatParcelizer || setShowingForActionMode.write(p2) - setShowingForActionMode.write(p3.read()) < 0)) {
            return new write(true, true);
        }
        if (p1 != 0 && (p1 >= this.write || setShowingForActionMode.IconCompatParcelizer(p2) - setShowingForActionMode.IconCompatParcelizer(p3.read()) < 0)) {
            if (p7) {
                return new write(true, true);
            }
            return new write(true, IconCompatParcelizer(p0, 0, setShowingForActionMode.write(PropertyValueAny.AudioAttributesImplBaseParcelizer(this.read), (setShowingForActionMode.write(p2) - this.AudioAttributesImplBaseParcelizer) - p6), setShowingForActionMode.RemoteActionCompatParcelizer(setShowingForActionMode.write(setShowingForActionMode.IconCompatParcelizer(p3.read()) - this.AudioAttributesCompatParcelizer, setShowingForActionMode.write(p3.read()))), p4 + 1, p5 + p6, 0, true, false).getIconCompatParcelizer());
        }
        int iMax = p5 + Math.max(p6, setShowingForActionMode.write(p3.read()));
        setShowingForActionMode setshowingforactionmodeRemoteActionCompatParcelizer = p8 ? null : this.IconCompatParcelizer.RemoteActionCompatParcelizer(p0, p4, iMax);
        if (setshowingforactionmodeRemoteActionCompatParcelizer != null) {
            setshowingforactionmodeRemoteActionCompatParcelizer.read();
            if (p1 + 1 >= this.write || ((setShowingForActionMode.IconCompatParcelizer(p2) - setShowingForActionMode.IconCompatParcelizer(p3.read())) - this.AudioAttributesCompatParcelizer) - setShowingForActionMode.IconCompatParcelizer(setshowingforactionmodeRemoteActionCompatParcelizer.read()) < 0) {
                if (p8) {
                    return new write(true, true);
                }
                write writeVarIconCompatParcelizer = IconCompatParcelizer(false, 0, setShowingForActionMode.write(PropertyValueAny.AudioAttributesImplBaseParcelizer(this.read), (setShowingForActionMode.write(p2) - this.AudioAttributesImplBaseParcelizer) - Math.max(p6, setShowingForActionMode.write(p3.read()))), setshowingforactionmodeRemoteActionCompatParcelizer, p4 + 1, iMax, 0, true, true);
                return new write(writeVarIconCompatParcelizer.getIconCompatParcelizer(), writeVarIconCompatParcelizer.getIconCompatParcelizer());
            }
        }
        return new write(false, false);
    }

    public /* synthetic */ isCancelable(int i, onGetLayoutInflater ongetlayoutinflater, long j, int i2, int i3, int i4, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this(i, ongetlayoutinflater, j, i2, i3, i4);
    }
}
