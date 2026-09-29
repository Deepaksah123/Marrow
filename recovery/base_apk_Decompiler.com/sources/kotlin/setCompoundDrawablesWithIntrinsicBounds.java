package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0012B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\b\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\b\u0010\u000bJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u000f\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0014R\u0011\u0010\u0016\u001a\u00020\u00048\u0006¢\u0006\u0006\n\u0004\b\u000f\u0010\u0015R\u0014\u0010\u0012\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0014"}, d2 = {"Lo/setCompoundDrawablesWithIntrinsicBounds;", "", "", "p0", "Lo/bufferMapProperty;", "p1", "<init>", "(FLo/bufferMapProperty;)V", "IconCompatParcelizer", "(Lo/bufferMapProperty;)F", "", "(F)D", "", "read", "(F)J", "AudioAttributesCompatParcelizer", "(F)F", "Lo/setCompoundDrawablesWithIntrinsicBounds$write;", "write", "(F)Lo/setCompoundDrawablesWithIntrinsicBounds$write;", "F", "Lo/bufferMapProperty;", "RemoteActionCompatParcelizer"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class setCompoundDrawablesWithIntrinsicBounds {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final bufferMapProperty RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final float write;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final float AudioAttributesCompatParcelizer;

    public setCompoundDrawablesWithIntrinsicBounds(float f, bufferMapProperty buffermapproperty) {
        this.AudioAttributesCompatParcelizer = f;
        this.RemoteActionCompatParcelizer = buffermapproperty;
        this.write = IconCompatParcelizer(buffermapproperty);
    }

    private final float IconCompatParcelizer(bufferMapProperty p0) {
        return AppCompatTextView.IconCompatParcelizer(0.84f, p0.getWrite());
    }

    private final double IconCompatParcelizer(float p0) {
        return setTextClassifier.INSTANCE.AudioAttributesCompatParcelizer(p0, this.AudioAttributesCompatParcelizer * this.write);
    }

    public final long read(float p0) {
        return (long) (Math.exp(IconCompatParcelizer(p0) / (((double) AppCompatTextView.AudioAttributesCompatParcelizer) - 1.0d)) * 1000.0d);
    }

    public final float AudioAttributesCompatParcelizer(float p0) {
        return (float) (((double) (this.AudioAttributesCompatParcelizer * this.write)) * Math.exp((((double) AppCompatTextView.AudioAttributesCompatParcelizer) / (((double) AppCompatTextView.AudioAttributesCompatParcelizer) - 1.0d)) * IconCompatParcelizer(p0)));
    }

    public final write write(float p0) {
        double dIconCompatParcelizer = IconCompatParcelizer(p0);
        double d = ((double) AppCompatTextView.AudioAttributesCompatParcelizer) - 1.0d;
        return new write(p0, (float) (((double) (this.AudioAttributesCompatParcelizer * this.write)) * Math.exp((((double) AppCompatTextView.AudioAttributesCompatParcelizer) / d) * dIconCompatParcelizer)), (long) (Math.exp(dIconCompatParcelizer / d) * 1000.0d));
    }

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\t\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0005¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0005¢\u0006\u0004\b\u000b\u0010\nJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0016\u001a\u00020\u00028\u0006¢\u0006\u0006\n\u0004\b\u000b\u0010\u0015R\u0011\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\u0006\n\u0004\b\u0016\u0010\u0015R\u0011\u0010\u0018\u001a\u00020\u00058\u0006¢\u0006\u0006\n\u0004\b\t\u0010\u0017"}, d2 = {"Lo/setCompoundDrawablesWithIntrinsicBounds$write;", "", "", "p0", "p1", "", "p2", "<init>", "(FFJ)V", "RemoteActionCompatParcelizer", "(J)F", "write", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "F", "read", "J", "IconCompatParcelizer"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class write {

        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
        private final long IconCompatParcelizer;

        /* JADX INFO: renamed from: read, reason: from kotlin metadata */
        private final float write;

        /* JADX INFO: renamed from: write, reason: from kotlin metadata */
        private final float read;

        public write(float f, float f2, long j) {
            this.read = f;
            this.write = f2;
            this.IconCompatParcelizer = j;
        }

        public final float RemoteActionCompatParcelizer(long p0) {
            long j = this.IconCompatParcelizer;
            return this.write * Math.signum(this.read) * setTextClassifier.INSTANCE.RemoteActionCompatParcelizer(j > 0 ? p0 / j : 1.0f).getRead();
        }

        public final float write(long p0) {
            long j = this.IconCompatParcelizer;
            return (((setTextClassifier.INSTANCE.RemoteActionCompatParcelizer(j > 0 ? p0 / j : 1.0f).getIconCompatParcelizer() * Math.signum(this.read)) * this.write) / this.IconCompatParcelizer) * 1000.0f;
        }

        public final boolean equals(Object p0) {
            if (this == p0) {
                return true;
            }
            if (!(p0 instanceof write)) {
                return false;
            }
            write writeVar = (write) p0;
            return Float.compare(this.read, writeVar.read) == 0 && Float.compare(this.write, writeVar.write) == 0 && this.IconCompatParcelizer == writeVar.IconCompatParcelizer;
        }

        public final int hashCode() {
            return (((Float.hashCode(this.read) * 31) + Float.hashCode(this.write)) * 31) + Long.hashCode(this.IconCompatParcelizer);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("write(read=");
            sb.append(this.read);
            sb.append(", write=");
            sb.append(this.write);
            sb.append(", IconCompatParcelizer=");
            sb.append(this.IconCompatParcelizer);
            sb.append(')');
            return sb.toString();
        }
    }
}
