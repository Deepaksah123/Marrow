package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t"}, d2 = {"Lo/findNalUnit;", "", "<init>", "()V", "read", "AudioAttributesCompatParcelizer", "RemoteActionCompatParcelizer", "Lo/findNalUnit$read;", "Lo/findNalUnit$AudioAttributesCompatParcelizer;", "Lo/findNalUnit$RemoteActionCompatParcelizer;"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class findNalUnit {

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\n\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\tHÖ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0013\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\rR\u001a\u0010\u0014\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0016\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0015\u001a\u0004\b\u0018\u0010\u0017"}, d2 = {"Lo/findNalUnit$read;", "Lo/findNalUnit;", "", "p0", "", "p1", "p2", "<init>", "(IZZ)V", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "IconCompatParcelizer", "I", "AudioAttributesCompatParcelizer", "RemoteActionCompatParcelizer", "Z", "write", "()Z", "read"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class read extends findNalUnit {

        /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
        private final int AudioAttributesCompatParcelizer;
        private final boolean RemoteActionCompatParcelizer;
        private final boolean write;

        public read(int i, boolean z, boolean z2) {
            super(null);
            this.AudioAttributesCompatParcelizer = i;
            this.RemoteActionCompatParcelizer = z;
            this.write = z2;
        }

        /* JADX INFO: renamed from: IconCompatParcelizer, reason: from getter */
        public final int getAudioAttributesCompatParcelizer() {
            return this.AudioAttributesCompatParcelizer;
        }

        /* JADX INFO: renamed from: write, reason: from getter */
        public final boolean getRemoteActionCompatParcelizer() {
            return this.RemoteActionCompatParcelizer;
        }

        /* JADX INFO: renamed from: read, reason: from getter */
        public final boolean getWrite() {
            return this.write;
        }

        public final boolean equals(Object p0) {
            if (this == p0) {
                return true;
            }
            if (!(p0 instanceof read)) {
                return false;
            }
            read readVar = (read) p0;
            return this.AudioAttributesCompatParcelizer == readVar.AudioAttributesCompatParcelizer && this.RemoteActionCompatParcelizer == readVar.RemoteActionCompatParcelizer && this.write == readVar.write;
        }

        public final int hashCode() {
            return (((Integer.hashCode(this.AudioAttributesCompatParcelizer) * 31) + Boolean.hashCode(this.RemoteActionCompatParcelizer)) * 31) + Boolean.hashCode(this.write);
        }

        public final String toString() {
            int i = this.AudioAttributesCompatParcelizer;
            boolean z = this.RemoteActionCompatParcelizer;
            boolean z2 = this.write;
            StringBuilder sb = new StringBuilder("read(AudioAttributesCompatParcelizer=");
            sb.append(i);
            sb.append(", RemoteActionCompatParcelizer=");
            sb.append(z);
            sb.append(", write=");
            sb.append(z2);
            sb.append(")");
            return sb.toString();
        }
    }

    private findNalUnit() {
    }

    public /* synthetic */ findNalUnit(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this();
    }

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\r\u001a\u00020\u00052\b\u0010\u0003\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0016\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0010R\u001a\u0010\u0018\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0015\u001a\u0004\b\u0017\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001a\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0019R\u001a\u0010\u0017\u001a\u00020\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u001b\u001a\u0004\b\u001a\u0010\u001c"}, d2 = {"Lo/findNalUnit$AudioAttributesCompatParcelizer;", "Lo/findNalUnit;", "", "p0", "p1", "", "p2", "p3", "Lo/getH265NalUnitType;", "p4", "<init>", "(IIZZLo/getH265NalUnitType;)V", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "AudioAttributesCompatParcelizer", "I", "IconCompatParcelizer", "write", "RemoteActionCompatParcelizer", "Z", "read", "Lo/getH265NalUnitType;", "()Lo/getH265NalUnitType;"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class AudioAttributesCompatParcelizer extends findNalUnit {

        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
        private final int IconCompatParcelizer;

        /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
        private final int RemoteActionCompatParcelizer;

        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
        private final boolean AudioAttributesCompatParcelizer;
        private final boolean read;
        private final getH265NalUnitType write;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AudioAttributesCompatParcelizer(int i, int i2, boolean z, boolean z2, getH265NalUnitType geth265nalunittype) {
            super(null);
            toMagicModuleMetaRepoModel.write(geth265nalunittype, "");
            this.IconCompatParcelizer = i;
            this.RemoteActionCompatParcelizer = i2;
            this.AudioAttributesCompatParcelizer = z;
            this.read = z2;
            this.write = geth265nalunittype;
        }

        /* JADX INFO: renamed from: IconCompatParcelizer, reason: from getter */
        public final int getIconCompatParcelizer() {
            return this.IconCompatParcelizer;
        }

        /* JADX INFO: renamed from: write, reason: from getter */
        public final int getRemoteActionCompatParcelizer() {
            return this.RemoteActionCompatParcelizer;
        }

        /* JADX INFO: renamed from: read, reason: from getter */
        public final getH265NalUnitType getWrite() {
            return this.write;
        }

        public final boolean equals(Object p0) {
            if (this == p0) {
                return true;
            }
            if (!(p0 instanceof AudioAttributesCompatParcelizer)) {
                return false;
            }
            AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = (AudioAttributesCompatParcelizer) p0;
            return this.IconCompatParcelizer == audioAttributesCompatParcelizer.IconCompatParcelizer && this.RemoteActionCompatParcelizer == audioAttributesCompatParcelizer.RemoteActionCompatParcelizer && this.AudioAttributesCompatParcelizer == audioAttributesCompatParcelizer.AudioAttributesCompatParcelizer && this.read == audioAttributesCompatParcelizer.read && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.write, audioAttributesCompatParcelizer.write);
        }

        public final int hashCode() {
            return (((((((Integer.hashCode(this.IconCompatParcelizer) * 31) + Integer.hashCode(this.RemoteActionCompatParcelizer)) * 31) + Boolean.hashCode(this.AudioAttributesCompatParcelizer)) * 31) + Boolean.hashCode(this.read)) * 31) + this.write.hashCode();
        }

        public final String toString() {
            int i = this.IconCompatParcelizer;
            int i2 = this.RemoteActionCompatParcelizer;
            boolean z = this.AudioAttributesCompatParcelizer;
            boolean z2 = this.read;
            getH265NalUnitType geth265nalunittype = this.write;
            StringBuilder sb = new StringBuilder("AudioAttributesCompatParcelizer(IconCompatParcelizer=");
            sb.append(i);
            sb.append(", RemoteActionCompatParcelizer=");
            sb.append(i2);
            sb.append(", AudioAttributesCompatParcelizer=");
            sb.append(z);
            sb.append(", read=");
            sb.append(z2);
            sb.append(", write=");
            sb.append(geth265nalunittype);
            sb.append(")");
            return sb.toString();
        }
    }

    public static final class RemoteActionCompatParcelizer extends findNalUnit {
        private final boolean write;

        public RemoteActionCompatParcelizer(boolean z) {
            super(null);
            this.write = z;
        }

        public final boolean RemoteActionCompatParcelizer() {
            return this.write;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof RemoteActionCompatParcelizer) && this.write == ((RemoteActionCompatParcelizer) obj).write;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.write);
        }

        public final String toString() {
            boolean z = this.write;
            StringBuilder sb = new StringBuilder("NewCourseArtZenAreaInfoUCModel(isWaterRippleEnabled=");
            sb.append(z);
            sb.append(")");
            return sb.toString();
        }
    }
}
