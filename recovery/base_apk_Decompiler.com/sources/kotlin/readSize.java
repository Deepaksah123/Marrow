package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J'\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00032\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\t¨\u0006\u0016"}, d2 = {"Lcom/marrow2/ui/onboarding/main_phone/model/WhatsappOtpUiState;", "", "shouldShowWhatsappOtp", "", "isWhatsappOtpSent", "shouldRunTimer", "<init>", "(ZZZ)V", "getShouldShowWhatsappOtp", "()Z", "getShouldRunTimer", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "", "Companion", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class readSize {
    public static final write write = new write(null);
    private final boolean AudioAttributesCompatParcelizer;
    private final boolean RemoteActionCompatParcelizer;
    private final boolean read;

    public readSize(boolean z, boolean z2, boolean z3) {
        this.read = z;
        this.AudioAttributesCompatParcelizer = z2;
        this.RemoteActionCompatParcelizer = z3;
    }

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from getter */
    public final boolean getRead() {
        return this.read;
    }

    /* JADX INFO: renamed from: write, reason: from getter */
    public final boolean getAudioAttributesCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from getter */
    public final boolean getRemoteActionCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lo/readSize$write;", "", "<init>", "()V", "Lo/readSize;", "write", "()Lo/readSize;"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class write {
        private write() {
        }

        public static readSize write() {
            return new readSize(false, false, false);
        }

        public /* synthetic */ write(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }

    public static /* synthetic */ readSize read(readSize readsize, boolean z, boolean z2, boolean z3, int i) {
        if ((i & 1) != 0) {
            z = readsize.read;
        }
        if ((i & 2) != 0) {
            z2 = readsize.AudioAttributesCompatParcelizer;
        }
        if ((i & 4) != 0) {
            z3 = readsize.RemoteActionCompatParcelizer;
        }
        return read(z, z2, z3);
    }

    private static readSize read(boolean z, boolean z2, boolean z3) {
        return new readSize(z, z2, z3);
    }

    public final boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof readSize)) {
            return false;
        }
        readSize readsize = (readSize) other;
        return this.read == readsize.read && this.AudioAttributesCompatParcelizer == readsize.AudioAttributesCompatParcelizer && this.RemoteActionCompatParcelizer == readsize.RemoteActionCompatParcelizer;
    }

    public final int hashCode() {
        return (((Boolean.hashCode(this.read) * 31) + Boolean.hashCode(this.AudioAttributesCompatParcelizer)) * 31) + Boolean.hashCode(this.RemoteActionCompatParcelizer);
    }

    public final String toString() {
        boolean z = this.read;
        boolean z2 = this.AudioAttributesCompatParcelizer;
        boolean z3 = this.RemoteActionCompatParcelizer;
        StringBuilder sb = new StringBuilder("WhatsappOtpUiState(shouldShowWhatsappOtp=");
        sb.append(z);
        sb.append(", isWhatsappOtpSent=");
        sb.append(z2);
        sb.append(", shouldRunTimer=");
        sb.append(z3);
        sb.append(")");
        return sb.toString();
    }
}
