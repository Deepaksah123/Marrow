package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u0000 #2\u00020\u0001:\u0004 !\"#B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0017\u001a\u00020\tHÆ\u0003J1\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006$"}, d2 = {"Lcom/marrow2/ui/home/model/ScreenProperties;", "", "statusBarColor", "Lcom/marrow2/ui/home/model/StatusBarColor;", "toolbarProperty", "Lcom/marrow2/ui/home/model/ScreenProperties$ToolbarProperty;", "bottomNavigationProperties", "Lcom/marrow2/ui/home/model/ScreenProperties$BottomNavigationProperties;", "contentProperties", "Lcom/marrow2/ui/home/model/ScreenProperties$ContentProperties;", "<init>", "(Lcom/marrow2/ui/home/model/StatusBarColor;Lcom/marrow2/ui/home/model/ScreenProperties$ToolbarProperty;Lcom/marrow2/ui/home/model/ScreenProperties$BottomNavigationProperties;Lcom/marrow2/ui/home/model/ScreenProperties$ContentProperties;)V", "getStatusBarColor", "()Lcom/marrow2/ui/home/model/StatusBarColor;", "getToolbarProperty", "()Lcom/marrow2/ui/home/model/ScreenProperties$ToolbarProperty;", "getBottomNavigationProperties", "()Lcom/marrow2/ui/home/model/ScreenProperties$BottomNavigationProperties;", "getContentProperties", "()Lcom/marrow2/ui/home/model/ScreenProperties$ContentProperties;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "", "ToolbarProperty", "BottomNavigationProperties", "ContentProperties", "Companion", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class maybeSignOut {
    public static final write read = new write(null);
    private final RemoteActionCompatParcelizer AudioAttributesCompatParcelizer;
    private final isConnectionFailedListenerRegistered IconCompatParcelizer;
    private final AudioAttributesCompatParcelizer RemoteActionCompatParcelizer;
    private final read write;

    public maybeSignOut(isConnectionFailedListenerRegistered isconnectionfailedlistenerregistered, AudioAttributesCompatParcelizer audioAttributesCompatParcelizer, RemoteActionCompatParcelizer remoteActionCompatParcelizer, read readVar) {
        toMagicModuleMetaRepoModel.write(isconnectionfailedlistenerregistered, "");
        toMagicModuleMetaRepoModel.write(audioAttributesCompatParcelizer, "");
        toMagicModuleMetaRepoModel.write(remoteActionCompatParcelizer, "");
        toMagicModuleMetaRepoModel.write(readVar, "");
        this.IconCompatParcelizer = isconnectionfailedlistenerregistered;
        this.RemoteActionCompatParcelizer = audioAttributesCompatParcelizer;
        this.AudioAttributesCompatParcelizer = remoteActionCompatParcelizer;
        this.write = readVar;
    }

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from getter */
    public final isConnectionFailedListenerRegistered getIconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from getter */
    public final AudioAttributesCompatParcelizer getRemoteActionCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from getter */
    public final RemoteActionCompatParcelizer getAudioAttributesCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    /* JADX INFO: renamed from: write, reason: from getter */
    public final read getWrite() {
        return this.write;
    }

    /* JADX INFO: loaded from: classes3.dex */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0014\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0010\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015"}, d2 = {"Lo/maybeSignOut$AudioAttributesCompatParcelizer;", "", "Lo/zao;", "p0", "", "p1", "<init>", "(Lo/zao;Z)V", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "IconCompatParcelizer", "Lo/zao;", "AudioAttributesCompatParcelizer", "()Lo/zao;", "write", "Z"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class AudioAttributesCompatParcelizer {

        /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
        private final EnumC0232zao write;

        /* JADX INFO: renamed from: write, reason: from kotlin metadata */
        private final boolean IconCompatParcelizer;

        public AudioAttributesCompatParcelizer(EnumC0232zao enumC0232zao, boolean z) {
            toMagicModuleMetaRepoModel.write(enumC0232zao, "");
            this.write = enumC0232zao;
            this.IconCompatParcelizer = z;
        }

        public /* synthetic */ AudioAttributesCompatParcelizer(EnumC0232zao enumC0232zao, boolean z, int i, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this((i & 1) != 0 ? EnumC0232zao.write : enumC0232zao, (i & 2) != 0 ? true : z);
        }

        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from getter */
        public final EnumC0232zao getWrite() {
            return this.write;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public AudioAttributesCompatParcelizer() {
            this(null, false, 3, 0 == true ? 1 : 0);
        }

        public final boolean equals(Object p0) {
            if (this == p0) {
                return true;
            }
            if (!(p0 instanceof AudioAttributesCompatParcelizer)) {
                return false;
            }
            AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = (AudioAttributesCompatParcelizer) p0;
            return this.write == audioAttributesCompatParcelizer.write && this.IconCompatParcelizer == audioAttributesCompatParcelizer.IconCompatParcelizer;
        }

        public final int hashCode() {
            return (this.write.hashCode() * 31) + Boolean.hashCode(this.IconCompatParcelizer);
        }

        public final String toString() {
            EnumC0232zao enumC0232zao = this.write;
            boolean z = this.IconCompatParcelizer;
            StringBuilder sb = new StringBuilder("AudioAttributesCompatParcelizer(write=");
            sb.append(enumC0232zao);
            sb.append(", IconCompatParcelizer=");
            sb.append(z);
            sb.append(")");
            return sb.toString();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static maybeSignOut AudioAttributesCompatParcelizer(isConnectionFailedListenerRegistered isconnectionfailedlistenerregistered, AudioAttributesCompatParcelizer audioAttributesCompatParcelizer, RemoteActionCompatParcelizer remoteActionCompatParcelizer, read readVar) {
        toMagicModuleMetaRepoModel.write(isconnectionfailedlistenerregistered, "");
        toMagicModuleMetaRepoModel.write(audioAttributesCompatParcelizer, "");
        toMagicModuleMetaRepoModel.write(remoteActionCompatParcelizer, "");
        toMagicModuleMetaRepoModel.write(readVar, "");
        return new maybeSignOut(isconnectionfailedlistenerregistered, audioAttributesCompatParcelizer, remoteActionCompatParcelizer, readVar);
    }

    public final boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof maybeSignOut)) {
            return false;
        }
        maybeSignOut maybesignout = (maybeSignOut) other;
        return this.IconCompatParcelizer == maybesignout.IconCompatParcelizer && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer, maybesignout.RemoteActionCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.AudioAttributesCompatParcelizer, maybesignout.AudioAttributesCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.write, maybesignout.write);
    }

    public final int hashCode() {
        return (((((this.IconCompatParcelizer.hashCode() * 31) + this.RemoteActionCompatParcelizer.hashCode()) * 31) + this.AudioAttributesCompatParcelizer.hashCode()) * 31) + this.write.hashCode();
    }

    /* JADX INFO: loaded from: classes3.dex */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u0006\u001a\u00020\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rR\u0017\u0010\u0011\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u000e\u0010\u0010"}, d2 = {"Lo/maybeSignOut$RemoteActionCompatParcelizer;", "", "", "p0", "<init>", "(Z)V", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "write", "Z", "()Z", "IconCompatParcelizer"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class RemoteActionCompatParcelizer {

        /* JADX INFO: renamed from: write, reason: from kotlin metadata */
        private final boolean IconCompatParcelizer;

        public RemoteActionCompatParcelizer(boolean z) {
            this.IconCompatParcelizer = z;
        }

        public /* synthetic */ RemoteActionCompatParcelizer(boolean z, int i, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this((i & 1) != 0 ? true : z);
        }

        /* JADX INFO: renamed from: write, reason: from getter */
        public final boolean getIconCompatParcelizer() {
            return this.IconCompatParcelizer;
        }

        public RemoteActionCompatParcelizer() {
            this(false, 1, null);
        }

        public final boolean equals(Object p0) {
            if (this == p0) {
                return true;
            }
            return (p0 instanceof RemoteActionCompatParcelizer) && this.IconCompatParcelizer == ((RemoteActionCompatParcelizer) p0).IconCompatParcelizer;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.IconCompatParcelizer);
        }

        public final String toString() {
            boolean z = this.IconCompatParcelizer;
            StringBuilder sb = new StringBuilder("RemoteActionCompatParcelizer(IconCompatParcelizer=");
            sb.append(z);
            sb.append(")");
            return sb.toString();
        }
    }

    public final String toString() {
        isConnectionFailedListenerRegistered isconnectionfailedlistenerregistered = this.IconCompatParcelizer;
        AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = this.RemoteActionCompatParcelizer;
        RemoteActionCompatParcelizer remoteActionCompatParcelizer = this.AudioAttributesCompatParcelizer;
        read readVar = this.write;
        StringBuilder sb = new StringBuilder("ScreenProperties(statusBarColor=");
        sb.append(isconnectionfailedlistenerregistered);
        sb.append(", toolbarProperty=");
        sb.append(audioAttributesCompatParcelizer);
        sb.append(", bottomNavigationProperties=");
        sb.append(remoteActionCompatParcelizer);
        sb.append(", contentProperties=");
        sb.append(readVar);
        sb.append(")");
        return sb.toString();
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eR\u0011\u0010\u000f\u001a\u00020\u00028\u0006¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0013\u001a\u00020\u00048\u0006¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0011\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0014"}, d2 = {"Lo/maybeSignOut$read;", "", "", "p0", "", "p1", "<init>", "(IZ)V", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "IconCompatParcelizer", "I", "RemoteActionCompatParcelizer", "Z", "write", "()Z"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class read {
        private final int IconCompatParcelizer;

        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
        private final boolean write;

        private read(int i, boolean z) {
            this.IconCompatParcelizer = i;
            this.write = z;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ read(int i, boolean z, int i2, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            i = (i2 & 1) != 0 ? 0 : i;
            this(i, (i2 & 2) != 0 ? i != 0 : z);
        }

        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from getter */
        public final boolean getWrite() {
            return this.write;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public read() {
            this(0, 0 == true ? 1 : 0, 3, null);
        }

        public final boolean equals(Object p0) {
            if (this == p0) {
                return true;
            }
            if (!(p0 instanceof read)) {
                return false;
            }
            read readVar = (read) p0;
            return this.IconCompatParcelizer == readVar.IconCompatParcelizer && this.write == readVar.write;
        }

        public final int hashCode() {
            return (Integer.hashCode(this.IconCompatParcelizer) * 31) + Boolean.hashCode(this.write);
        }

        public final String toString() {
            int i = this.IconCompatParcelizer;
            boolean z = this.write;
            StringBuilder sb = new StringBuilder("read(IconCompatParcelizer=");
            sb.append(i);
            sb.append(", write=");
            sb.append(z);
            sb.append(")");
            return sb.toString();
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\u0006J\u0015\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\f\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\f\u0010\u000bJ\u0015\u0010\u0007\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0007\u0010\u000bJ\r\u0010\n\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\u0006J\u0015\u0010\r\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\r\u0010\u000b"}, d2 = {"Lo/maybeSignOut$write;", "", "<init>", "()V", "Lo/maybeSignOut;", "read", "()Lo/maybeSignOut;", "AudioAttributesCompatParcelizer", "", "p0", "write", "(I)Lo/maybeSignOut;", "RemoteActionCompatParcelizer", "IconCompatParcelizer"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class write {
        private write() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static maybeSignOut read() {
            return new maybeSignOut(isConnectionFailedListenerRegistered.read, new AudioAttributesCompatParcelizer(EnumC0232zao.write, true), new RemoteActionCompatParcelizer(true), new read(0, 0 == true ? 1 : 0, 2, null));
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static maybeSignOut AudioAttributesCompatParcelizer() {
            return new maybeSignOut(isConnectionFailedListenerRegistered.RemoteActionCompatParcelizer, new AudioAttributesCompatParcelizer(EnumC0232zao.RemoteActionCompatParcelizer, true), new RemoteActionCompatParcelizer(true), new read(0, 0 == true ? 1 : 0, 2, null));
        }

        public static maybeSignOut write(int p0) {
            return new maybeSignOut(isConnectionFailedListenerRegistered.IconCompatParcelizer, new AudioAttributesCompatParcelizer(EnumC0232zao.AudioAttributesCompatParcelizer, true), new RemoteActionCompatParcelizer(false), new read(p0, false, 2, null));
        }

        public static maybeSignOut RemoteActionCompatParcelizer(int p0) {
            return new maybeSignOut(isConnectionFailedListenerRegistered.read, new AudioAttributesCompatParcelizer(EnumC0232zao.write, true), new RemoteActionCompatParcelizer(false), new read(p0, false, 2, null));
        }

        public static maybeSignOut AudioAttributesCompatParcelizer(int p0) {
            return new maybeSignOut(isConnectionFailedListenerRegistered.IconCompatParcelizer, new AudioAttributesCompatParcelizer(EnumC0232zao.AudioAttributesCompatParcelizer, true), new RemoteActionCompatParcelizer(true), new read(p0, false, 2, null));
        }

        public static maybeSignOut write() {
            return new maybeSignOut(isConnectionFailedListenerRegistered.write, new AudioAttributesCompatParcelizer(EnumC0232zao.AudioAttributesCompatParcelizer, true), new RemoteActionCompatParcelizer(true), new read(0, true, 1 == true ? 1 : 0, null));
        }

        public static maybeSignOut IconCompatParcelizer(int p0) {
            return new maybeSignOut(isConnectionFailedListenerRegistered.read, new AudioAttributesCompatParcelizer(EnumC0232zao.write, true), new RemoteActionCompatParcelizer(true), new read(p0, false, 2, null));
        }

        public /* synthetic */ write(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }
}
