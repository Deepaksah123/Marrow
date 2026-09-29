package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0015\b\u0080\b\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0002¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0019\u001a\u00020\t8\u0007@\u0006X\u0086\f¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001c\u0010\u0015\u001a\u00020\u00078\u0007@\u0006X\u0087\f¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0019\u0010\u001cR\"\u0010\u001d\u001a\u00020\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u0015\u0010\u0014\"\u0004\b\u0017\u0010\u001fR\u001a\u0010\u001a\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u001e\u001a\u0004\b\u001a\u0010\u0014R\u001a\u0010\u0017\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001e\u001a\u0004\b\u001d\u0010\u0014R\u001a\u0010#\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010\u0012"}, d2 = {"Lo/SpliceScheduleCommandComponentSplice;", "", "", "p0", "p1", "", "p2", "", "p3", "Lo/UrlLinkFrame1;", "p4", "p5", "<init>", "(Ljava/lang/String;Ljava/lang/String;IJLo/UrlLinkFrame1;Ljava/lang/String;)V", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "()Ljava/lang/String;", "AudioAttributesCompatParcelizer", "Lo/UrlLinkFrame1;", "IconCompatParcelizer", "()Lo/UrlLinkFrame1;", "RemoteActionCompatParcelizer", "write", "J", "()J", "read", "Ljava/lang/String;", "(Ljava/lang/String;)V", "AudioAttributesImplBaseParcelizer", "I", "AudioAttributesImplApi26Parcelizer", "MediaBrowserCompatItemReceiver"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final /* data */ class SpliceScheduleCommandComponentSplice {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private UrlLinkFrame1 RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: from kotlin metadata */
    private final int MediaBrowserCompatItemReceiver;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final String write;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final String IconCompatParcelizer;
    private String read;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private long AudioAttributesCompatParcelizer;

    private SpliceScheduleCommandComponentSplice(String str, String str2, int i, long j, UrlLinkFrame1 urlLinkFrame1, String str3) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(str2, "");
        toMagicModuleMetaRepoModel.write(urlLinkFrame1, "");
        toMagicModuleMetaRepoModel.write(str3, "");
        this.IconCompatParcelizer = str;
        this.write = str2;
        this.MediaBrowserCompatItemReceiver = i;
        this.AudioAttributesCompatParcelizer = j;
        this.RemoteActionCompatParcelizer = urlLinkFrame1;
        this.read = str3;
    }

    /* JADX INFO: renamed from: read, reason: from getter */
    public final String getIconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    /* JADX INFO: renamed from: write, reason: from getter */
    public final String getWrite() {
        return this.write;
    }

    /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: from getter */
    public final int getMediaBrowserCompatItemReceiver() {
        return this.MediaBrowserCompatItemReceiver;
    }

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from getter */
    public final long getAudioAttributesCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    public /* synthetic */ SpliceScheduleCommandComponentSplice(String str, String str2, int i, long j, UrlLinkFrame1 urlLinkFrame1, String str3, int i2, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this(str, str2, i, j, (i2 & 16) != 0 ? new UrlLinkFrame1(null, null, 0.0d, 7, null) : urlLinkFrame1, (i2 & 32) != 0 ? "" : str3);
    }

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from getter */
    public final UrlLinkFrame1 getRemoteActionCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from getter */
    public final String getRead() {
        return this.read;
    }

    public final void IconCompatParcelizer(String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        this.read = str;
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof SpliceScheduleCommandComponentSplice)) {
            return false;
        }
        SpliceScheduleCommandComponentSplice spliceScheduleCommandComponentSplice = (SpliceScheduleCommandComponentSplice) p0;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.IconCompatParcelizer, (Object) spliceScheduleCommandComponentSplice.IconCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.write, (Object) spliceScheduleCommandComponentSplice.write) && this.MediaBrowserCompatItemReceiver == spliceScheduleCommandComponentSplice.MediaBrowserCompatItemReceiver && this.AudioAttributesCompatParcelizer == spliceScheduleCommandComponentSplice.AudioAttributesCompatParcelizer && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer, spliceScheduleCommandComponentSplice.RemoteActionCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.read, (Object) spliceScheduleCommandComponentSplice.read);
    }

    public final int hashCode() {
        return (((((((((this.IconCompatParcelizer.hashCode() * 31) + this.write.hashCode()) * 31) + Integer.hashCode(this.MediaBrowserCompatItemReceiver)) * 31) + Long.hashCode(this.AudioAttributesCompatParcelizer)) * 31) + this.RemoteActionCompatParcelizer.hashCode()) * 31) + this.read.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SpliceScheduleCommandComponentSplice(IconCompatParcelizer=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", write=");
        sb.append(this.write);
        sb.append(", MediaBrowserCompatItemReceiver=");
        sb.append(this.MediaBrowserCompatItemReceiver);
        sb.append(", AudioAttributesCompatParcelizer=");
        sb.append(this.AudioAttributesCompatParcelizer);
        sb.append(", RemoteActionCompatParcelizer=");
        sb.append(this.RemoteActionCompatParcelizer);
        sb.append(", read=");
        sb.append(this.read);
        sb.append(')');
        return sb.toString();
    }
}
