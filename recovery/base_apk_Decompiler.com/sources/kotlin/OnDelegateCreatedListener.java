package kotlin;

import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
public final class OnDelegateCreatedListener {
    private final boolean AudioAttributesCompatParcelizer;
    private final String AudioAttributesImplApi21Parcelizer;
    private final long AudioAttributesImplApi26Parcelizer;
    private boolean IconCompatParcelizer;
    private final IconCompatParcelizer MediaBrowserCompatCustomActionResultReceiver;
    private final String RemoteActionCompatParcelizer;
    private final boolean read;
    private final List<String> write;

    public OnDelegateCreatedListener(String str, long j, String str2, IconCompatParcelizer iconCompatParcelizer, boolean z, boolean z2, List<String> list) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(str2, "");
        toMagicModuleMetaRepoModel.write(iconCompatParcelizer, "");
        toMagicModuleMetaRepoModel.write(list, "");
        this.RemoteActionCompatParcelizer = str;
        this.AudioAttributesImplApi26Parcelizer = j;
        this.AudioAttributesImplApi21Parcelizer = str2;
        this.MediaBrowserCompatCustomActionResultReceiver = iconCompatParcelizer;
        this.read = z;
        this.AudioAttributesCompatParcelizer = z2;
        this.write = list;
    }

    public final String read() {
        return this.RemoteActionCompatParcelizer;
    }

    public final long IconCompatParcelizer() {
        return this.AudioAttributesImplApi26Parcelizer;
    }

    public final String RemoteActionCompatParcelizer() {
        return this.AudioAttributesImplApi21Parcelizer;
    }

    public final IconCompatParcelizer AudioAttributesCompatParcelizer() {
        return this.MediaBrowserCompatCustomActionResultReceiver;
    }

    public final boolean AudioAttributesImplBaseParcelizer() {
        return this.read;
    }

    public final boolean AudioAttributesImplApi26Parcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    public final List<String> write() {
        return this.write;
    }

    public final boolean AudioAttributesImplApi21Parcelizer() {
        return this.IconCompatParcelizer;
    }

    public final void write(boolean z) {
        this.IconCompatParcelizer = z;
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0015\u001a\u00020\u00028\u0006¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0017\u001a\u00020\u00048\u0006¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0018\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0018\u0010\u0014\u001a\u0004\b\u0015\u0010\u0012R \u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0013\u0010\u001b"}, d2 = {"Lo/OnDelegateCreatedListener$IconCompatParcelizer;", "", "", "p0", "", "p1", "p2", "", "Lo/OnDelegateCreatedListener$read;", "p3", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/util/List;)V", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "()Ljava/lang/String;", "AudioAttributesCompatParcelizer", "Ljava/lang/String;", "write", "I", "IconCompatParcelizer", "read", "RemoteActionCompatParcelizer", "Ljava/util/List;", "()Ljava/util/List;"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class IconCompatParcelizer {

        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
        private final String write;

        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
        private final List<read> AudioAttributesCompatParcelizer;
        private final String read;

        /* JADX INFO: renamed from: write, reason: from kotlin metadata */
        private final int IconCompatParcelizer;

        public IconCompatParcelizer(String str, int i, String str2, List<read> list) {
            toMagicModuleMetaRepoModel.write(str, "");
            toMagicModuleMetaRepoModel.write(str2, "");
            toMagicModuleMetaRepoModel.write(list, "");
            this.write = str;
            this.IconCompatParcelizer = i;
            this.read = str2;
            this.AudioAttributesCompatParcelizer = list;
        }

        /* JADX INFO: renamed from: write, reason: from getter */
        public final String getRead() {
            return this.read;
        }

        public final List<read> AudioAttributesCompatParcelizer() {
            return this.AudioAttributesCompatParcelizer;
        }

        public final boolean equals(Object p0) {
            if (this == p0) {
                return true;
            }
            if (!(p0 instanceof IconCompatParcelizer)) {
                return false;
            }
            IconCompatParcelizer iconCompatParcelizer = (IconCompatParcelizer) p0;
            return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.write, (Object) iconCompatParcelizer.write) && this.IconCompatParcelizer == iconCompatParcelizer.IconCompatParcelizer && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.read, (Object) iconCompatParcelizer.read) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.AudioAttributesCompatParcelizer, iconCompatParcelizer.AudioAttributesCompatParcelizer);
        }

        public final int hashCode() {
            return (((((this.write.hashCode() * 31) + Integer.hashCode(this.IconCompatParcelizer)) * 31) + this.read.hashCode()) * 31) + this.AudioAttributesCompatParcelizer.hashCode();
        }

        public final String toString() {
            String str = this.write;
            int i = this.IconCompatParcelizer;
            String str2 = this.read;
            List<read> list = this.AudioAttributesCompatParcelizer;
            StringBuilder sb = new StringBuilder("IconCompatParcelizer(write=");
            sb.append(str);
            sb.append(", IconCompatParcelizer=");
            sb.append(i);
            sb.append(", read=");
            sb.append(str2);
            sb.append(", AudioAttributesCompatParcelizer=");
            sb.append(list);
            sb.append(")");
            return sb.toString();
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OnDelegateCreatedListener)) {
            return false;
        }
        OnDelegateCreatedListener onDelegateCreatedListener = (OnDelegateCreatedListener) obj;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.RemoteActionCompatParcelizer, (Object) onDelegateCreatedListener.RemoteActionCompatParcelizer) && this.AudioAttributesImplApi26Parcelizer == onDelegateCreatedListener.AudioAttributesImplApi26Parcelizer && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.AudioAttributesImplApi21Parcelizer, (Object) onDelegateCreatedListener.AudioAttributesImplApi21Parcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.MediaBrowserCompatCustomActionResultReceiver, onDelegateCreatedListener.MediaBrowserCompatCustomActionResultReceiver) && this.read == onDelegateCreatedListener.read && this.AudioAttributesCompatParcelizer == onDelegateCreatedListener.AudioAttributesCompatParcelizer && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.write, onDelegateCreatedListener.write);
    }

    public final int hashCode() {
        return (((((((((((this.RemoteActionCompatParcelizer.hashCode() * 31) + Long.hashCode(this.AudioAttributesImplApi26Parcelizer)) * 31) + this.AudioAttributesImplApi21Parcelizer.hashCode()) * 31) + this.MediaBrowserCompatCustomActionResultReceiver.hashCode()) * 31) + Boolean.hashCode(this.read)) * 31) + Boolean.hashCode(this.AudioAttributesCompatParcelizer)) * 31) + this.write.hashCode();
    }

    public final String toString() {
        String str = this.RemoteActionCompatParcelizer;
        long j = this.AudioAttributesImplApi26Parcelizer;
        String str2 = this.AudioAttributesImplApi21Parcelizer;
        IconCompatParcelizer iconCompatParcelizer = this.MediaBrowserCompatCustomActionResultReceiver;
        boolean z = this.read;
        boolean z2 = this.AudioAttributesCompatParcelizer;
        List<String> list = this.write;
        StringBuilder sb = new StringBuilder("PlanSubscriptionVMModel(invoiceUrl=");
        sb.append(str);
        sb.append(", paymentDate=");
        sb.append(j);
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

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\t\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0012\u001a\u00020\u00028\u0006¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0013\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0011\u001a\u0004\b\u0012\u0010\u000fR\u0016\u0010\u0014\u001a\u00020\u00028\u0006@\u0006X\u0087\f¢\u0006\u0006\n\u0004\b\u0012\u0010\u0011"}, d2 = {"Lo/OnDelegateCreatedListener$read;", "", "", "p0", "p1", "p2", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "write", "Ljava/lang/String;", "AudioAttributesCompatParcelizer", "IconCompatParcelizer", "RemoteActionCompatParcelizer"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class read {

        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
        public String RemoteActionCompatParcelizer;
        private final String IconCompatParcelizer;

        /* JADX INFO: renamed from: write, reason: from kotlin metadata */
        private final String AudioAttributesCompatParcelizer;

        public read(String str, String str2, String str3) {
            toMagicModuleMetaRepoModel.write(str, "");
            toMagicModuleMetaRepoModel.write(str2, "");
            toMagicModuleMetaRepoModel.write(str3, "");
            this.AudioAttributesCompatParcelizer = str;
            this.IconCompatParcelizer = str2;
            this.RemoteActionCompatParcelizer = str3;
        }

        public /* synthetic */ read(String str, String str2, String str3, int i, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3);
        }

        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from getter */
        public final String getIconCompatParcelizer() {
            return this.IconCompatParcelizer;
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
            return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.AudioAttributesCompatParcelizer, (Object) readVar.AudioAttributesCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.IconCompatParcelizer, (Object) readVar.IconCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.RemoteActionCompatParcelizer, (Object) readVar.RemoteActionCompatParcelizer);
        }

        public final int hashCode() {
            return (((this.AudioAttributesCompatParcelizer.hashCode() * 31) + this.IconCompatParcelizer.hashCode()) * 31) + this.RemoteActionCompatParcelizer.hashCode();
        }

        public final String toString() {
            String str = this.AudioAttributesCompatParcelizer;
            String str2 = this.IconCompatParcelizer;
            String str3 = this.RemoteActionCompatParcelizer;
            StringBuilder sb = new StringBuilder("read(AudioAttributesCompatParcelizer=");
            sb.append(str);
            sb.append(", IconCompatParcelizer=");
            sb.append(str2);
            sb.append(", RemoteActionCompatParcelizer=");
            sb.append(str3);
            sb.append(")");
            return sb.toString();
        }
    }
}
