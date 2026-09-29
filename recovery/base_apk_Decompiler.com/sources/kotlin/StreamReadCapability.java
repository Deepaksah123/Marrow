package kotlin;

import kotlin.Metadata;
import kotlin._skipWSOrEnd;
import kotlin.writeObjectEntrySeparator;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/StreamReadCapability;", "", "<init>", "()V", "RemoteActionCompatParcelizer", "IconCompatParcelizer"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class StreamReadCapability {
    public static final StreamReadCapability INSTANCE = new StreamReadCapability();

    private StreamReadCapability() {
    }

    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J/\u0010\r\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u0003\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001a\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0018\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b"}, d2 = {"Lo/StreamReadCapability$RemoteActionCompatParcelizer;", "Lo/writeObjectEntrySeparator$RemoteActionCompatParcelizer;", "Lo/_skipWSOrEnd$write;", "p0", "", "p1", "<init>", "(Lo/_skipWSOrEnd$write;I)V", "Lo/appendReferring;", "Lo/getKey;", "p2", "Lo/tryToResolveUnresolved;", "p3", "write", "(Lo/appendReferring;JILo/tryToResolveUnresolved;)I", "", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "RemoteActionCompatParcelizer", "Lo/_skipWSOrEnd$write;", "AudioAttributesCompatParcelizer", "I"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class RemoteActionCompatParcelizer implements writeObjectEntrySeparator.RemoteActionCompatParcelizer {

        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
        private final int RemoteActionCompatParcelizer;

        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
        private final _skipWSOrEnd.write AudioAttributesCompatParcelizer;

        public RemoteActionCompatParcelizer(_skipWSOrEnd.write writeVar, int i) {
            this.AudioAttributesCompatParcelizer = writeVar;
            this.RemoteActionCompatParcelizer = i;
        }

        @Override // o.writeObjectEntrySeparator.RemoteActionCompatParcelizer
        public final int write(appendReferring p0, long p1, int p2, tryToResolveUnresolved p3) {
            int i = (int) (p1 >> 32);
            if (p2 >= i - (this.RemoteActionCompatParcelizer << 1)) {
                return _skipWSOrEnd.INSTANCE.AudioAttributesImplApi21Parcelizer().IconCompatParcelizer(p2, i, p3);
            }
            int iIconCompatParcelizer = this.AudioAttributesCompatParcelizer.IconCompatParcelizer(p2, i, p3);
            int i2 = this.RemoteActionCompatParcelizer;
            return getQues.write(iIconCompatParcelizer, i2, (i - i2) - p2);
        }

        public final boolean equals(Object p0) {
            if (this == p0) {
                return true;
            }
            if (!(p0 instanceof RemoteActionCompatParcelizer)) {
                return false;
            }
            RemoteActionCompatParcelizer remoteActionCompatParcelizer = (RemoteActionCompatParcelizer) p0;
            return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.AudioAttributesCompatParcelizer, remoteActionCompatParcelizer.AudioAttributesCompatParcelizer) && this.RemoteActionCompatParcelizer == remoteActionCompatParcelizer.RemoteActionCompatParcelizer;
        }

        public final int hashCode() {
            return (this.AudioAttributesCompatParcelizer.hashCode() * 31) + Integer.hashCode(this.RemoteActionCompatParcelizer);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("RemoteActionCompatParcelizer(AudioAttributesCompatParcelizer=");
            sb.append(this.AudioAttributesCompatParcelizer);
            sb.append(", RemoteActionCompatParcelizer=");
            sb.append(this.RemoteActionCompatParcelizer);
            sb.append(')');
            return sb.toString();
        }
    }

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J'\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0003\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0018\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001a\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019"}, d2 = {"Lo/StreamReadCapability$IconCompatParcelizer;", "Lo/writeObjectEntrySeparator$IconCompatParcelizer;", "Lo/_skipWSOrEnd$read;", "p0", "", "p1", "<init>", "(Lo/_skipWSOrEnd$read;I)V", "Lo/appendReferring;", "Lo/getKey;", "p2", "write", "(Lo/appendReferring;JI)I", "", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "IconCompatParcelizer", "Lo/_skipWSOrEnd$read;", "read", "I", "RemoteActionCompatParcelizer"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class IconCompatParcelizer implements writeObjectEntrySeparator.IconCompatParcelizer {

        /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
        private final _skipWSOrEnd.read read;

        /* JADX INFO: renamed from: read, reason: from kotlin metadata */
        private final int RemoteActionCompatParcelizer;

        public IconCompatParcelizer(_skipWSOrEnd.read readVar, int i) {
            this.read = readVar;
            this.RemoteActionCompatParcelizer = i;
        }

        @Override // o.writeObjectEntrySeparator.IconCompatParcelizer
        public final int write(appendReferring p0, long p1, int p2) {
            int i = (int) p1;
            if (p2 >= i - (this.RemoteActionCompatParcelizer << 1)) {
                return _skipWSOrEnd.INSTANCE.MediaBrowserCompatCustomActionResultReceiver().read(p2, i);
            }
            int i2 = this.read.read(p2, i);
            int i3 = this.RemoteActionCompatParcelizer;
            return getQues.write(i2, i3, (i - i3) - p2);
        }

        public final boolean equals(Object p0) {
            if (this == p0) {
                return true;
            }
            if (!(p0 instanceof IconCompatParcelizer)) {
                return false;
            }
            IconCompatParcelizer iconCompatParcelizer = (IconCompatParcelizer) p0;
            return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.read, iconCompatParcelizer.read) && this.RemoteActionCompatParcelizer == iconCompatParcelizer.RemoteActionCompatParcelizer;
        }

        public final int hashCode() {
            return (this.read.hashCode() * 31) + Integer.hashCode(this.RemoteActionCompatParcelizer);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("IconCompatParcelizer(read=");
            sb.append(this.read);
            sb.append(", RemoteActionCompatParcelizer=");
            sb.append(this.RemoteActionCompatParcelizer);
            sb.append(')');
            return sb.toString();
        }
    }
}
