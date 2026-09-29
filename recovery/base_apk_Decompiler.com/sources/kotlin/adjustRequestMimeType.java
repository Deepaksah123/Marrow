package kotlin;

import android.content.Context;

/* JADX INFO: loaded from: classes5.dex */
final class adjustRequestMimeType extends lambdasetOnEventListener1comgoogleandroidexoplayer2drmFrameworkMediaDrm {
    private final Context IconCompatParcelizer;
    private final BinarySearchSeeker RemoteActionCompatParcelizer;
    private final String read;
    private final BinarySearchSeeker write;

    adjustRequestMimeType(Context context, BinarySearchSeeker binarySearchSeeker, BinarySearchSeeker binarySearchSeeker2, String str) {
        if (context == null) {
            throw new NullPointerException("Null applicationContext");
        }
        this.IconCompatParcelizer = context;
        if (binarySearchSeeker == null) {
            throw new NullPointerException("Null wallClock");
        }
        this.write = binarySearchSeeker;
        if (binarySearchSeeker2 == null) {
            throw new NullPointerException("Null monotonicClock");
        }
        this.RemoteActionCompatParcelizer = binarySearchSeeker2;
        if (str == null) {
            throw new NullPointerException("Null backendName");
        }
        this.read = str;
    }

    @Override // kotlin.lambdasetOnEventListener1comgoogleandroidexoplayer2drmFrameworkMediaDrm
    public final Context RemoteActionCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    @Override // kotlin.lambdasetOnEventListener1comgoogleandroidexoplayer2drmFrameworkMediaDrm
    public final BinarySearchSeeker read() {
        return this.write;
    }

    @Override // kotlin.lambdasetOnEventListener1comgoogleandroidexoplayer2drmFrameworkMediaDrm
    public final BinarySearchSeeker AudioAttributesCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    @Override // kotlin.lambdasetOnEventListener1comgoogleandroidexoplayer2drmFrameworkMediaDrm
    public final String IconCompatParcelizer() {
        return this.read;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CreationContext{applicationContext=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", wallClock=");
        sb.append(this.write);
        sb.append(", monotonicClock=");
        sb.append(this.RemoteActionCompatParcelizer);
        sb.append(", backendName=");
        sb.append(this.read);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof lambdasetOnEventListener1comgoogleandroidexoplayer2drmFrameworkMediaDrm)) {
            return false;
        }
        lambdasetOnEventListener1comgoogleandroidexoplayer2drmFrameworkMediaDrm lambdasetoneventlistener1comgoogleandroidexoplayer2drmframeworkmediadrm = (lambdasetOnEventListener1comgoogleandroidexoplayer2drmFrameworkMediaDrm) obj;
        return this.IconCompatParcelizer.equals(lambdasetoneventlistener1comgoogleandroidexoplayer2drmframeworkmediadrm.RemoteActionCompatParcelizer()) && this.write.equals(lambdasetoneventlistener1comgoogleandroidexoplayer2drmframeworkmediadrm.read()) && this.RemoteActionCompatParcelizer.equals(lambdasetoneventlistener1comgoogleandroidexoplayer2drmframeworkmediadrm.AudioAttributesCompatParcelizer()) && this.read.equals(lambdasetoneventlistener1comgoogleandroidexoplayer2drmframeworkmediadrm.IconCompatParcelizer());
    }

    public final int hashCode() {
        int iHashCode = this.IconCompatParcelizer.hashCode();
        int iHashCode2 = this.write.hashCode();
        return this.read.hashCode() ^ ((((((iHashCode ^ 1000003) * 1000003) ^ iHashCode2) * 1000003) ^ this.RemoteActionCompatParcelizer.hashCode()) * 1000003);
    }
}
