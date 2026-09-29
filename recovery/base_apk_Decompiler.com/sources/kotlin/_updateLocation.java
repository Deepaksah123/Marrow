package kotlin;

import kotlin.Metadata;
import kotlin._skipWSOrEnd;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001:\u0002\u000b\u001bB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J'\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0003\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016R\u0011\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0011\u0010\u001a\u001a\u00020\u00028\u0006¢\u0006\u0006\n\u0004\b\u0019\u0010\u0018"}, d2 = {"Lo/_updateLocation;", "Lo/_skipWSOrEnd;", "", "p0", "p1", "<init>", "(FF)V", "Lo/getKey;", "Lo/tryToResolveUnresolved;", "p2", "Lo/hasReferringProperties;", "IconCompatParcelizer", "(JJLo/tryToResolveUnresolved;)J", "", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "read", "F", "write", "RemoteActionCompatParcelizer", "AudioAttributesCompatParcelizer"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class _updateLocation implements _skipWSOrEnd {

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final float IconCompatParcelizer;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final float RemoteActionCompatParcelizer;

    public _updateLocation(float f, float f2) {
        this.IconCompatParcelizer = f;
        this.RemoteActionCompatParcelizer = f2;
    }

    @Override // kotlin._skipWSOrEnd
    public final long IconCompatParcelizer(long p0, long p1, tryToResolveUnresolved p2) {
        float f;
        float f2 = (((int) (p1 >> 32)) - ((int) (p0 >> 32))) / 2.0f;
        float f3 = (((int) p1) - ((int) p0)) / 2.0f;
        if (p2 == tryToResolveUnresolved.write) {
            f = this.IconCompatParcelizer;
        } else {
            f = (-1.0f) * this.IconCompatParcelizer;
        }
        float f4 = this.RemoteActionCompatParcelizer;
        long j = -1;
        return hasReferringProperties.read((((long) Math.round(f2 * (f + 1.0f))) << 32) | (((long) Math.round(f3 * (f4 + 1.0f))) & ((((long) 0) << 32) | (j - ((j >> 63) << 32)))));
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J'\u0010\n\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\u0003\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0017\u001a\u00020\u00028\u0006¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016"}, d2 = {"Lo/_updateLocation$IconCompatParcelizer;", "Lo/_skipWSOrEnd$write;", "", "p0", "<init>", "(F)V", "", "p1", "Lo/tryToResolveUnresolved;", "p2", "IconCompatParcelizer", "(IILo/tryToResolveUnresolved;)I", "", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "read", "F", "RemoteActionCompatParcelizer"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class IconCompatParcelizer implements _skipWSOrEnd.write {

        /* JADX INFO: renamed from: read, reason: from kotlin metadata */
        private final float RemoteActionCompatParcelizer;

        public IconCompatParcelizer(float f) {
            this.RemoteActionCompatParcelizer = f;
        }

        @Override // o._skipWSOrEnd.write
        public final int IconCompatParcelizer(int p0, int p1, tryToResolveUnresolved p2) {
            float f = (p1 - p0) / 2.0f;
            tryToResolveUnresolved trytoresolveunresolved = tryToResolveUnresolved.write;
            float f2 = this.RemoteActionCompatParcelizer;
            if (p2 != trytoresolveunresolved) {
                f2 = -f2;
            }
            return Math.round(f * (f2 + 1.0f));
        }

        public final boolean equals(Object p0) {
            if (this == p0) {
                return true;
            }
            return (p0 instanceof IconCompatParcelizer) && Float.compare(this.RemoteActionCompatParcelizer, ((IconCompatParcelizer) p0).RemoteActionCompatParcelizer) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.RemoteActionCompatParcelizer);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("IconCompatParcelizer(RemoteActionCompatParcelizer=");
            sb.append(this.RemoteActionCompatParcelizer);
            sb.append(')');
            return sb.toString();
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\u0003\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0015\u001a\u00020\u00028\u0006¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014"}, d2 = {"Lo/_updateLocation$AudioAttributesCompatParcelizer;", "Lo/_skipWSOrEnd$read;", "", "p0", "<init>", "(F)V", "", "p1", "read", "(II)I", "", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "write", "F", "RemoteActionCompatParcelizer"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class AudioAttributesCompatParcelizer implements _skipWSOrEnd.read {

        /* JADX INFO: renamed from: write, reason: from kotlin metadata */
        private final float RemoteActionCompatParcelizer;

        public AudioAttributesCompatParcelizer(float f) {
            this.RemoteActionCompatParcelizer = f;
        }

        @Override // o._skipWSOrEnd.read
        public final int read(int p0, int p1) {
            return Math.round(((p1 - p0) / 2.0f) * (this.RemoteActionCompatParcelizer + 1.0f));
        }

        public final boolean equals(Object p0) {
            if (this == p0) {
                return true;
            }
            return (p0 instanceof AudioAttributesCompatParcelizer) && Float.compare(this.RemoteActionCompatParcelizer, ((AudioAttributesCompatParcelizer) p0).RemoteActionCompatParcelizer) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.RemoteActionCompatParcelizer);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("AudioAttributesCompatParcelizer(RemoteActionCompatParcelizer=");
            sb.append(this.RemoteActionCompatParcelizer);
            sb.append(')');
            return sb.toString();
        }
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof _updateLocation)) {
            return false;
        }
        _updateLocation _updatelocation = (_updateLocation) p0;
        return Float.compare(this.IconCompatParcelizer, _updatelocation.IconCompatParcelizer) == 0 && Float.compare(this.RemoteActionCompatParcelizer, _updatelocation.RemoteActionCompatParcelizer) == 0;
    }

    public final int hashCode() {
        return (Float.hashCode(this.IconCompatParcelizer) * 31) + Float.hashCode(this.RemoteActionCompatParcelizer);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("_updateLocation(IconCompatParcelizer=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", RemoteActionCompatParcelizer=");
        sb.append(this.RemoteActionCompatParcelizer);
        sb.append(')');
        return sb.toString();
    }
}
