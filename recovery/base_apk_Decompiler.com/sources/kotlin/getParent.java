package kotlin;

import kotlin.Metadata;
import kotlin._skipWSOrEnd;
import kotlin.writeObjectEntrySeparator;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/getParent;", "", "<init>", "()V", "read", "IconCompatParcelizer"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class getParent {
    public static final getParent INSTANCE = new getParent();

    private getParent() {
    }

    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ/\u0010\r\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u0003\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001a\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001b\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0019R\u0014\u0010\r\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d"}, d2 = {"Lo/getParent$read;", "Lo/writeObjectEntrySeparator$RemoteActionCompatParcelizer;", "Lo/_skipWSOrEnd$write;", "p0", "p1", "", "p2", "<init>", "(Lo/_skipWSOrEnd$write;Lo/_skipWSOrEnd$write;I)V", "Lo/appendReferring;", "Lo/getKey;", "Lo/tryToResolveUnresolved;", "p3", "write", "(Lo/appendReferring;JILo/tryToResolveUnresolved;)I", "", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "IconCompatParcelizer", "Lo/_skipWSOrEnd$write;", "read", "RemoteActionCompatParcelizer", "AudioAttributesCompatParcelizer", "I"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class read implements writeObjectEntrySeparator.RemoteActionCompatParcelizer {

        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
        private final int write;

        /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
        private final _skipWSOrEnd.write read;

        /* JADX INFO: renamed from: read, reason: from kotlin metadata */
        private final _skipWSOrEnd.write RemoteActionCompatParcelizer;

        public read(_skipWSOrEnd.write writeVar, _skipWSOrEnd.write writeVar2, int i) {
            this.read = writeVar;
            this.RemoteActionCompatParcelizer = writeVar2;
            this.write = i;
        }

        @Override // o.writeObjectEntrySeparator.RemoteActionCompatParcelizer
        public final int write(appendReferring p0, long p1, int p2, tryToResolveUnresolved p3) {
            int iIconCompatParcelizer = this.RemoteActionCompatParcelizer.IconCompatParcelizer(0, p0.MediaBrowserCompatItemReceiver(), p3);
            int i = -this.read.IconCompatParcelizer(0, p2, p3);
            tryToResolveUnresolved trytoresolveunresolved = tryToResolveUnresolved.write;
            int i2 = this.write;
            if (p3 != trytoresolveunresolved) {
                i2 = -i2;
            }
            return p0.getRead() + iIconCompatParcelizer + i + i2;
        }

        public final boolean equals(Object p0) {
            if (this == p0) {
                return true;
            }
            if (!(p0 instanceof read)) {
                return false;
            }
            read readVar = (read) p0;
            return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.read, readVar.read) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer, readVar.RemoteActionCompatParcelizer) && this.write == readVar.write;
        }

        public final int hashCode() {
            return (((this.read.hashCode() * 31) + this.RemoteActionCompatParcelizer.hashCode()) * 31) + Integer.hashCode(this.write);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("read(read=");
            sb.append(this.read);
            sb.append(", RemoteActionCompatParcelizer=");
            sb.append(this.RemoteActionCompatParcelizer);
            sb.append(", write=");
            sb.append(this.write);
            sb.append(')');
            return sb.toString();
        }
    }

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ'\u0010\u000b\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0003\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0018\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u000b\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0017R\u0014\u0010\u001b\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a"}, d2 = {"Lo/getParent$IconCompatParcelizer;", "Lo/writeObjectEntrySeparator$IconCompatParcelizer;", "Lo/_skipWSOrEnd$read;", "p0", "p1", "", "p2", "<init>", "(Lo/_skipWSOrEnd$read;Lo/_skipWSOrEnd$read;I)V", "Lo/appendReferring;", "Lo/getKey;", "write", "(Lo/appendReferring;JI)I", "", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "RemoteActionCompatParcelizer", "Lo/_skipWSOrEnd$read;", "AudioAttributesCompatParcelizer", "IconCompatParcelizer", "I", "read"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class IconCompatParcelizer implements writeObjectEntrySeparator.IconCompatParcelizer {

        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
        private final _skipWSOrEnd.read write;

        /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
        private final int read;

        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
        private final _skipWSOrEnd.read AudioAttributesCompatParcelizer;

        public IconCompatParcelizer(_skipWSOrEnd.read readVar, _skipWSOrEnd.read readVar2, int i) {
            this.AudioAttributesCompatParcelizer = readVar;
            this.write = readVar2;
            this.read = i;
        }

        @Override // o.writeObjectEntrySeparator.IconCompatParcelizer
        public final int write(appendReferring p0, long p1, int p2) {
            int i = this.write.read(0, p0.IconCompatParcelizer());
            return p0.getWrite() + i + (-this.AudioAttributesCompatParcelizer.read(0, p2)) + this.read;
        }

        public final boolean equals(Object p0) {
            if (this == p0) {
                return true;
            }
            if (!(p0 instanceof IconCompatParcelizer)) {
                return false;
            }
            IconCompatParcelizer iconCompatParcelizer = (IconCompatParcelizer) p0;
            return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.AudioAttributesCompatParcelizer, iconCompatParcelizer.AudioAttributesCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.write, iconCompatParcelizer.write) && this.read == iconCompatParcelizer.read;
        }

        public final int hashCode() {
            return (((this.AudioAttributesCompatParcelizer.hashCode() * 31) + this.write.hashCode()) * 31) + Integer.hashCode(this.read);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("IconCompatParcelizer(AudioAttributesCompatParcelizer=");
            sb.append(this.AudioAttributesCompatParcelizer);
            sb.append(", write=");
            sb.append(this.write);
            sb.append(", read=");
            sb.append(this.read);
            sb.append(')');
            return sb.toString();
        }
    }
}
