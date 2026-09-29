package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0016\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\tB!\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bH\u0096\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u000f\u001a\u00020\u000b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u000eH\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0016\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0012R\u001a\u0010\u0018\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0017\u001a\u0004\b\u0019\u0010\u0012R\u001a\u0010\t\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u0017\u001a\u0004\b\u0018\u0010\u0012"}, d2 = {"Lo/getDecryptedContent;", "", "", "p0", "p1", "p2", "<init>", "(III)V", "Lo/getSINGLE_SYNC_RESULT;", "IconCompatParcelizer", "()Lo/getSINGLE_SYNC_RESULT;", "", "AudioAttributesImplApi26Parcelizer", "()Z", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "read", "I", "AudioAttributesCompatParcelizer", "RemoteActionCompatParcelizer", "write"}, k = 1, mv = {2, 2, 0}, xi = 48)
public class getDecryptedContent implements Iterable<Integer>, getCurrentAnsweredMcqProgress {

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final int AudioAttributesCompatParcelizer;
    private final int read;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final int IconCompatParcelizer;

    public getDecryptedContent(int i, int i2, int i3) {
        if (i3 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        }
        if (i3 == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
        this.read = i;
        this.AudioAttributesCompatParcelizer = saveMagicModuleTimeline.read(i, i2, i3);
        this.IconCompatParcelizer = i3;
    }

    /* JADX INFO: renamed from: read, reason: from getter */
    public final int getRead() {
        return this.read;
    }

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from getter */
    public final int getAudioAttributesCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from getter */
    public final int getIconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // java.lang.Iterable
    /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public getSINGLE_SYNC_RESULT iterator() {
        return new getEncryptedContent(this.read, this.AudioAttributesCompatParcelizer, this.IconCompatParcelizer);
    }

    public boolean AudioAttributesImplApi26Parcelizer() {
        return this.IconCompatParcelizer > 0 ? this.read > this.AudioAttributesCompatParcelizer : this.read < this.AudioAttributesCompatParcelizer;
    }

    public boolean equals(Object p0) {
        if (!(p0 instanceof getDecryptedContent)) {
            return false;
        }
        if (AudioAttributesImplApi26Parcelizer() && ((getDecryptedContent) p0).AudioAttributesImplApi26Parcelizer()) {
            return true;
        }
        getDecryptedContent getdecryptedcontent = (getDecryptedContent) p0;
        return this.read == getdecryptedcontent.read && this.AudioAttributesCompatParcelizer == getdecryptedcontent.AudioAttributesCompatParcelizer && this.IconCompatParcelizer == getdecryptedcontent.IconCompatParcelizer;
    }

    public int hashCode() {
        if (AudioAttributesImplApi26Parcelizer()) {
            return -1;
        }
        return (((this.read * 31) + this.AudioAttributesCompatParcelizer) * 31) + this.IconCompatParcelizer;
    }

    public String toString() {
        StringBuilder sb;
        int i;
        if (this.IconCompatParcelizer > 0) {
            sb = new StringBuilder();
            sb.append(this.read);
            sb.append("..");
            sb.append(this.AudioAttributesCompatParcelizer);
            sb.append(" step ");
            i = this.IconCompatParcelizer;
        } else {
            sb = new StringBuilder();
            sb.append(this.read);
            sb.append(" downTo ");
            sb.append(this.AudioAttributesCompatParcelizer);
            sb.append(" step ");
            i = -this.IconCompatParcelizer;
        }
        sb.append(i);
        return sb.toString();
    }

    /* JADX INFO: renamed from: o.getDecryptedContent$IconCompatParcelizer, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Lo/getDecryptedContent$IconCompatParcelizer;", "", "<init>", "()V", "", "p0", "p1", "p2", "Lo/getDecryptedContent;", "RemoteActionCompatParcelizer", "(III)Lo/getDecryptedContent;"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static getDecryptedContent RemoteActionCompatParcelizer(int p0, int p1, int p2) {
            return new getDecryptedContent(p0, p1, p2);
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }
}
