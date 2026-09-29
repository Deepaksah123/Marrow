package kotlin;

import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
public final class dispatchOnFrameAvailable {
    private final Long AudioAttributesCompatParcelizer;
    private final IconCompatParcelizer AudioAttributesImplApi21Parcelizer;
    private final String AudioAttributesImplBaseParcelizer;
    private final String IconCompatParcelizer;
    private final boolean RemoteActionCompatParcelizer;
    private final boolean read;
    private final List<String> write;

    public dispatchOnFrameAvailable(String str, Long l, String str2, IconCompatParcelizer iconCompatParcelizer, boolean z, boolean z2, List<String> list) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(str2, "");
        toMagicModuleMetaRepoModel.write(iconCompatParcelizer, "");
        toMagicModuleMetaRepoModel.write(list, "");
        this.IconCompatParcelizer = str;
        this.AudioAttributesCompatParcelizer = l;
        this.AudioAttributesImplBaseParcelizer = str2;
        this.AudioAttributesImplApi21Parcelizer = iconCompatParcelizer;
        this.read = z;
        this.RemoteActionCompatParcelizer = z2;
        this.write = list;
    }

    public final String read() {
        return this.IconCompatParcelizer;
    }

    public final Long write() {
        return this.AudioAttributesCompatParcelizer;
    }

    public final String RemoteActionCompatParcelizer() {
        return this.AudioAttributesImplBaseParcelizer;
    }

    public final IconCompatParcelizer AudioAttributesCompatParcelizer() {
        return this.AudioAttributesImplApi21Parcelizer;
    }

    public final boolean AudioAttributesImplApi21Parcelizer() {
        return this.read;
    }

    public final boolean MediaBrowserCompatItemReceiver() {
        return this.RemoteActionCompatParcelizer;
    }

    public final List<String> IconCompatParcelizer() {
        return this.write;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dispatchOnFrameAvailable)) {
            return false;
        }
        dispatchOnFrameAvailable dispatchonframeavailable = (dispatchOnFrameAvailable) obj;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.IconCompatParcelizer, (Object) dispatchonframeavailable.IconCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.AudioAttributesCompatParcelizer, dispatchonframeavailable.AudioAttributesCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.AudioAttributesImplBaseParcelizer, (Object) dispatchonframeavailable.AudioAttributesImplBaseParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.AudioAttributesImplApi21Parcelizer, dispatchonframeavailable.AudioAttributesImplApi21Parcelizer) && this.read == dispatchonframeavailable.read && this.RemoteActionCompatParcelizer == dispatchonframeavailable.RemoteActionCompatParcelizer && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.write, dispatchonframeavailable.write);
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0015\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0012R\u001a\u0010\u0017\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0010R\u001a\u0010\u0013\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0014\u001a\u0004\b\u0019\u0010\u0012R \u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u001a\u001a\u0004\b\u0018\u0010\u001b"}, d2 = {"Lo/dispatchOnFrameAvailable$IconCompatParcelizer;", "", "", "p0", "", "p1", "p2", "", "Lo/dispatchOnFrameAvailable$read;", "p3", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/util/List;)V", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "()Ljava/lang/String;", "write", "Ljava/lang/String;", "IconCompatParcelizer", "I", "RemoteActionCompatParcelizer", "read", "AudioAttributesCompatParcelizer", "Ljava/util/List;", "()Ljava/util/List;"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class IconCompatParcelizer {

        /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
        private final int RemoteActionCompatParcelizer;

        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
        private final List<read> read;

        /* JADX INFO: renamed from: read, reason: from kotlin metadata */
        private final String write;

        /* JADX INFO: renamed from: write, reason: from kotlin metadata */
        private final String IconCompatParcelizer;

        public IconCompatParcelizer(String str, int i, String str2, List<read> list) {
            toMagicModuleMetaRepoModel.write(str, "");
            toMagicModuleMetaRepoModel.write(str2, "");
            toMagicModuleMetaRepoModel.write(list, "");
            this.IconCompatParcelizer = str;
            this.RemoteActionCompatParcelizer = i;
            this.write = str2;
            this.read = list;
        }

        /* JADX INFO: renamed from: write, reason: from getter */
        public final String getIconCompatParcelizer() {
            return this.IconCompatParcelizer;
        }

        /* JADX INFO: renamed from: IconCompatParcelizer, reason: from getter */
        public final int getRemoteActionCompatParcelizer() {
            return this.RemoteActionCompatParcelizer;
        }

        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from getter */
        public final String getWrite() {
            return this.write;
        }

        public final List<read> read() {
            return this.read;
        }

        public final boolean equals(Object p0) {
            if (this == p0) {
                return true;
            }
            if (!(p0 instanceof IconCompatParcelizer)) {
                return false;
            }
            IconCompatParcelizer iconCompatParcelizer = (IconCompatParcelizer) p0;
            return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.IconCompatParcelizer, (Object) iconCompatParcelizer.IconCompatParcelizer) && this.RemoteActionCompatParcelizer == iconCompatParcelizer.RemoteActionCompatParcelizer && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.write, (Object) iconCompatParcelizer.write) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.read, iconCompatParcelizer.read);
        }

        public final int hashCode() {
            return (((((this.IconCompatParcelizer.hashCode() * 31) + Integer.hashCode(this.RemoteActionCompatParcelizer)) * 31) + this.write.hashCode()) * 31) + this.read.hashCode();
        }

        public final String toString() {
            String str = this.IconCompatParcelizer;
            int i = this.RemoteActionCompatParcelizer;
            String str2 = this.write;
            List<read> list = this.read;
            StringBuilder sb = new StringBuilder("IconCompatParcelizer(IconCompatParcelizer=");
            sb.append(str);
            sb.append(", RemoteActionCompatParcelizer=");
            sb.append(i);
            sb.append(", write=");
            sb.append(str2);
            sb.append(", read=");
            sb.append(list);
            sb.append(")");
            return sb.toString();
        }
    }

    public final int hashCode() {
        int iHashCode = this.IconCompatParcelizer.hashCode();
        Long l = this.AudioAttributesCompatParcelizer;
        return (((((((((((iHashCode * 31) + (l == null ? 0 : l.hashCode())) * 31) + this.AudioAttributesImplBaseParcelizer.hashCode()) * 31) + this.AudioAttributesImplApi21Parcelizer.hashCode()) * 31) + Boolean.hashCode(this.read)) * 31) + Boolean.hashCode(this.RemoteActionCompatParcelizer)) * 31) + this.write.hashCode();
    }

    public final String toString() {
        String str = this.IconCompatParcelizer;
        Long l = this.AudioAttributesCompatParcelizer;
        String str2 = this.AudioAttributesImplBaseParcelizer;
        IconCompatParcelizer iconCompatParcelizer = this.AudioAttributesImplApi21Parcelizer;
        boolean z = this.read;
        boolean z2 = this.RemoteActionCompatParcelizer;
        List<String> list = this.write;
        StringBuilder sb = new StringBuilder("SubscriptionPlanRepoModel(invoiceUrl=");
        sb.append(str);
        sb.append(", paymentDate=");
        sb.append(l);
        sb.append(", paymentRefId=");
        sb.append(str2);
        sb.append(", planData=");
        sb.append(iconCompatParcelizer);
        sb.append(", isFreePlan=");
        sb.append(z);
        sb.append(", isAddressAvailable=");
        sb.append(z2);
        sb.append(", addOnPlans=");
        sb.append(list);
        sb.append(")");
        return sb.toString();
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\t\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0013\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u000fR\u001a\u0010\u0012\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0011\u001a\u0004\b\u0010\u0010\u000fR\u001c\u0010\u0010\u001a\u00020\u00028\u0007@\u0006X\u0087\f¢\u0006\f\n\u0004\b\u0015\u0010\u0011\u001a\u0004\b\u0015\u0010\u000f"}, d2 = {"Lo/dispatchOnFrameAvailable$read;", "", "", "p0", "p1", "p2", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "write", "Ljava/lang/String;", "IconCompatParcelizer", "read", "RemoteActionCompatParcelizer", "AudioAttributesCompatParcelizer"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class read {

        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
        private String write;

        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
        private final String IconCompatParcelizer;

        /* JADX INFO: renamed from: write, reason: from kotlin metadata */
        private final String read;

        public read(String str, String str2, String str3) {
            toMagicModuleMetaRepoModel.write(str, "");
            toMagicModuleMetaRepoModel.write(str2, "");
            toMagicModuleMetaRepoModel.write(str3, "");
            this.read = str;
            this.IconCompatParcelizer = str2;
            this.write = str3;
        }

        public /* synthetic */ read(String str, String str2, String str3, int i, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3);
        }

        /* JADX INFO: renamed from: IconCompatParcelizer, reason: from getter */
        public final String getRead() {
            return this.read;
        }

        /* JADX INFO: renamed from: write, reason: from getter */
        public final String getIconCompatParcelizer() {
            return this.IconCompatParcelizer;
        }

        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from getter */
        public final String getWrite() {
            return this.write;
        }

        public read() {
            this(null, null, null, 7, null);
        }

        public final boolean equals(Object p0) {
            if (this == p0) {
                return true;
            }
            if (!(p0 instanceof read)) {
                return false;
            }
            read readVar = (read) p0;
            return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.read, (Object) readVar.read) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.IconCompatParcelizer, (Object) readVar.IconCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.write, (Object) readVar.write);
        }

        public final int hashCode() {
            return (((this.read.hashCode() * 31) + this.IconCompatParcelizer.hashCode()) * 31) + this.write.hashCode();
        }

        public final String toString() {
            String str = this.read;
            String str2 = this.IconCompatParcelizer;
            String str3 = this.write;
            StringBuilder sb = new StringBuilder("read(read=");
            sb.append(str);
            sb.append(", IconCompatParcelizer=");
            sb.append(str2);
            sb.append(", write=");
            sb.append(str3);
            sb.append(")");
            return sb.toString();
        }
    }
}
