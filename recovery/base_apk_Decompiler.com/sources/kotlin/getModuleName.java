package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\b\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\n\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\n\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\f¢\u0006\u0004\b\n\u0010\u000eJ\u0015\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0006¢\u0006\u0004\b\u000f\u0010\u000bJ\r\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\u0010J\r\u0010\u000f\u001a\u00020\u0002¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u000f\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0012R\u0014\u0010\u0014\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0012R\u0014\u0010\n\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0012R\u0011\u0010\u0013\u001a\u00020\u00028G¢\u0006\u0006\u001a\u0004\b\n\u0010\u0010"}, d2 = {"Lo/getModuleName;", "", "", "p0", "<init>", "(Z)V", "Lo/_assertNotNull;", "p1", "read", "(Lo/_assertNotNull;Z)Z", "RemoteActionCompatParcelizer", "(Lo/_assertNotNull;)Z", "Lo/setMixInAnnotations;", "", "(Lo/_assertNotNull;Lo/setMixInAnnotations;)V", "write", "()Z", "Lo/setupModule;", "Lo/setupModule;", "IconCompatParcelizer", "AudioAttributesCompatParcelizer"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class getModuleName {

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final setupModule AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final setupModule write;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final setupModule RemoteActionCompatParcelizer;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] read;

        static {
            int[] iArr = new int[setMixInAnnotations.values().length];
            try {
                iArr[setMixInAnnotations.AudioAttributesCompatParcelizer.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[setMixInAnnotations.IconCompatParcelizer.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[setMixInAnnotations.read.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[setMixInAnnotations.RemoteActionCompatParcelizer.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            read = iArr;
        }
    }

    public getModuleName(boolean z) {
        this.write = new setupModule(z);
        this.AudioAttributesCompatParcelizer = new setupModule(z);
        this.RemoteActionCompatParcelizer = new setupModule(z);
    }

    public final boolean read(_assertNotNull p0, boolean p1) {
        boolean z = p0.getMediaBrowserCompatSearchResultReceiver() == null;
        boolean z2 = this.write.AudioAttributesCompatParcelizer(p0) || this.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer(p0);
        return p1 ? !z && z2 : (z && z2) || this.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer(p0);
    }

    public final boolean RemoteActionCompatParcelizer(_assertNotNull p0) {
        return this.write.AudioAttributesCompatParcelizer(p0) || this.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer(p0) || this.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer(p0);
    }

    public final void RemoteActionCompatParcelizer(_assertNotNull p0, setMixInAnnotations p1) {
        int i = WhenMappings.read[p1.ordinal()];
        if (i == 1) {
            this.write.write(p0);
            this.RemoteActionCompatParcelizer.write(p0);
            return;
        }
        if (i == 2) {
            this.AudioAttributesCompatParcelizer.write(p0);
            this.RemoteActionCompatParcelizer.write(p0);
            return;
        }
        if (i == 3) {
            if (p0.getMediaBrowserCompatSearchResultReceiver() != null) {
                this.RemoteActionCompatParcelizer.write(p0);
                return;
            } else {
                this.write.write(p0);
                return;
            }
        }
        if (i != 4) {
            throw new RenewEligibleCreator();
        }
        if (p0.getMediaBrowserCompatSearchResultReceiver() != null) {
            this.RemoteActionCompatParcelizer.write(p0);
        } else {
            this.AudioAttributesCompatParcelizer.write(p0);
        }
    }

    public final boolean write(_assertNotNull p0) {
        return this.RemoteActionCompatParcelizer.read(p0) || this.write.read(p0) || this.AudioAttributesCompatParcelizer.read(p0);
    }

    public final boolean read() {
        return this.write.IconCompatParcelizer() && this.RemoteActionCompatParcelizer.IconCompatParcelizer() && this.AudioAttributesCompatParcelizer.IconCompatParcelizer();
    }

    public final boolean RemoteActionCompatParcelizer() {
        return (this.RemoteActionCompatParcelizer.IconCompatParcelizer() || this.write.IconCompatParcelizer()) ? false : true;
    }

    public final boolean write() {
        return !read();
    }
}
