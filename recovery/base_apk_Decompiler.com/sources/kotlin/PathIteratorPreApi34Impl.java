package kotlin;

import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0016\b\u0000\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\f¢\u0006\u0004\b\u0011\u0010\u0012J+\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0013\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017R \u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001d\u001a\u00020\u00078\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010\u0015\u001a\u00020\f8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010 R\u0014\u0010\"\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b!\u0010\u0016R\u001a\u0010\u001e\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0016\u001a\u0004\b\u0013\u0010\u0017R\u001a\u0010\u001b\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u0016\u001a\u0004\b\u001d\u0010\u0017"}, d2 = {"Lo/PathIteratorPreApi34Impl;", "", "", "p0", "", "Lo/createInternalPathIterator;", "p1", "Lo/ProcessLifecycleInitializer;", "p2", "", "Lo/init;", "p3", "", "p4", "p5", "<init>", "(I[Lo/createInternalPathIterator;Lo/ProcessLifecycleInitializer;Ljava/util/List;ZI)V", "read", "()Z", "IconCompatParcelizer", "(III)[Lo/createInternalPathIterator;", "write", "I", "()I", "[Lo/createInternalPathIterator;", "RemoteActionCompatParcelizer", "()[Lo/createInternalPathIterator;", "MediaBrowserCompatItemReceiver", "Lo/ProcessLifecycleInitializer;", "AudioAttributesCompatParcelizer", "AudioAttributesImplApi26Parcelizer", "Ljava/util/List;", "Z", "AudioAttributesImplBaseParcelizer", "MediaBrowserCompatCustomActionResultReceiver"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class PathIteratorPreApi34Impl {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final int MediaBrowserCompatItemReceiver;

    /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: from kotlin metadata */
    private final List<init> RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: from kotlin metadata */
    private final int MediaBrowserCompatCustomActionResultReceiver;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final int AudioAttributesImplApi26Parcelizer;

    /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: from kotlin metadata */
    private final ProcessLifecycleInitializer AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final boolean write;
    private final createInternalPathIterator[] read;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final int IconCompatParcelizer;

    public PathIteratorPreApi34Impl(int i, createInternalPathIterator[] createinternalpathiteratorArr, ProcessLifecycleInitializer processLifecycleInitializer, List<init> list, boolean z, int i2) {
        this.IconCompatParcelizer = i;
        this.read = createinternalpathiteratorArr;
        this.AudioAttributesCompatParcelizer = processLifecycleInitializer;
        this.RemoteActionCompatParcelizer = list;
        this.write = z;
        this.MediaBrowserCompatCustomActionResultReceiver = i2;
        int iMax = 0;
        for (createInternalPathIterator createinternalpathiterator : createinternalpathiteratorArr) {
            iMax = Math.max(iMax, createinternalpathiterator.getOnCommand());
        }
        this.AudioAttributesImplApi26Parcelizer = iMax;
        this.MediaBrowserCompatItemReceiver = getQues.write(iMax + this.MediaBrowserCompatCustomActionResultReceiver, 0);
    }

    /* JADX INFO: renamed from: write, reason: from getter */
    public final int getIconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from getter */
    public final createInternalPathIterator[] getRead() {
        return this.read;
    }

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from getter */
    public final int getAudioAttributesImplApi26Parcelizer() {
        return this.AudioAttributesImplApi26Parcelizer;
    }

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from getter */
    public final int getMediaBrowserCompatItemReceiver() {
        return this.MediaBrowserCompatItemReceiver;
    }

    public final boolean read() {
        return this.read.length == 0;
    }

    public final createInternalPathIterator[] IconCompatParcelizer(int p0, int p1, int p2) {
        createInternalPathIterator[] createinternalpathiteratorArr = this.read;
        int length = createinternalpathiteratorArr.length;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (i < length) {
            createInternalPathIterator createinternalpathiterator = createinternalpathiteratorArr[i];
            int iRemoteActionCompatParcelizer = init.RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer.get(i2).getWrite());
            int i4 = this.AudioAttributesCompatParcelizer.getWrite()[i3];
            boolean z = this.write;
            createinternalpathiterator.write(p0, i4, p1, p2, z ? this.IconCompatParcelizer : i3, z ? i3 : this.IconCompatParcelizer);
            getShowPopup getshowpopup = getShowPopup.INSTANCE;
            i3 += iRemoteActionCompatParcelizer;
            i++;
            i2++;
        }
        return this.read;
    }
}
