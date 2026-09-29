package kotlin;

import android.os.Handler;
import com.facebook.GraphRequest;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0007\u0018\u0000 !2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\n!\u001aB\t\b\u0016¢\u0006\u0004\b\u0003\u0010\u0004B\u0017\b\u0016\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005¢\u0006\u0004\b\u0003\u0010\u0007B\u0011\b\u0016\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0003\u0010\bJ\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0006\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0006\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0014\u0010\u0004J\u0013\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015¢\u0006\u0004\b\n\u0010\u0017J\u0015\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015H\u0002¢\u0006\u0004\b\u0018\u0010\u0017J\r\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001c\u0010\u001bJ\u0018\u0010\n\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\fH\u0096\u0002¢\u0006\u0004\b\n\u0010\u001dJ\u0017\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\fH\u0016¢\u0006\u0004\b\u001a\u0010\u001dJ \u0010\u001a\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u001a\u0010\u001eR\u001e\u0010\u001a\u001a\u0004\u0018\u00010\u001f8\u0007@\u0006X\u0086\f¢\u0006\f\n\u0004\b\u001a\u0010 \u001a\u0004\b!\u0010\"R$\u0010\u0012\u001a\u0004\u0018\u00010#8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\n\u0010$\u001a\u0004\b\u000f\u0010%\"\u0004\b!\u0010&R0\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00110'2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00110'8\u0007@BX\u0087\u000e¢\u0006\f\n\u0004\b\u000f\u0010(\u001a\u0004\b\u0012\u0010\u0017R\u001a\u0010!\u001a\u00020\u001f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b)\u0010 \u001a\u0004\b)\u0010\"R0\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00020'2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020'8\u0007@BX\u0087\u000e¢\u0006\f\n\u0004\b*\u0010(\u001a\u0004\b+\u0010\u0017R\u0014\u0010\u001c\u001a\u00020\f8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b,\u0010-R\u0016\u0010\u0018\u001a\u00020\f8G@FX\u0086\f¢\u0006\u0006\u001a\u0004\b*\u0010-R\u0016\u0010*\u001a\u00020\f8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b+\u0010."}, d2 = {"Lo/lambdaonPlaybackSuppressionReasonChanged37;", "Ljava/util/AbstractList;", "Lcom/facebook/GraphRequest;", "<init>", "()V", "", "p0", "(Ljava/util/Collection;)V", "([Lcom/facebook/GraphRequest;)V", "", "IconCompatParcelizer", "(Lcom/facebook/GraphRequest;)Z", "", "p1", "", "write", "(ILcom/facebook/GraphRequest;)V", "Lo/lambdaonPlaybackSuppressionReasonChanged37$IconCompatParcelizer;", "RemoteActionCompatParcelizer", "(Lo/lambdaonPlaybackSuppressionReasonChanged37$IconCompatParcelizer;)V", "clear", "", "Lo/lambdaonPlayerError41;", "()Ljava/util/List;", "AudioAttributesImplBaseParcelizer", "Lo/lambdaonPlaybackStateChanged35;", "read", "()Lo/lambdaonPlaybackStateChanged35;", "MediaBrowserCompatItemReceiver", "(I)Lcom/facebook/GraphRequest;", "(ILcom/facebook/GraphRequest;)Lcom/facebook/GraphRequest;", "", "Ljava/lang/String;", "AudioAttributesCompatParcelizer", "()Ljava/lang/String;", "Landroid/os/Handler;", "Landroid/os/Handler;", "()Landroid/os/Handler;", "(Landroid/os/Handler;)V", "", "Ljava/util/List;", "MediaBrowserCompatCustomActionResultReceiver", "AudioAttributesImplApi26Parcelizer", "AudioAttributesImplApi21Parcelizer", "MediaBrowserCompatMediaItem", "()I", "I"}, k = 1, mv = {1, 4, 0})
public final class lambdaonPlaybackSuppressionReasonChanged37 extends AbstractList<GraphRequest> {
    private static final AtomicInteger RemoteActionCompatParcelizer = new AtomicInteger();

    /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: from kotlin metadata */
    private int AudioAttributesImplApi26Parcelizer;

    /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: from kotlin metadata */
    private List<GraphRequest> write;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private Handler RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from kotlin metadata */
    private final String AudioAttributesCompatParcelizer;
    private String read;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private List<IconCompatParcelizer> IconCompatParcelizer;

    public interface IconCompatParcelizer {
        void RemoteActionCompatParcelizer(lambdaonPlaybackSuppressionReasonChanged37 lambdaonplaybacksuppressionreasonchanged37);
    }

    public interface read extends IconCompatParcelizer {
    }

    private int AudioAttributesCompatParcelizer(GraphRequest graphRequest) {
        return super.lastIndexOf(graphRequest);
    }

    private boolean RemoteActionCompatParcelizer(GraphRequest graphRequest) {
        return super.contains(graphRequest);
    }

    private boolean read(GraphRequest graphRequest) {
        return super.remove(graphRequest);
    }

    private int write(GraphRequest graphRequest) {
        return super.indexOf(graphRequest);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        if (obj == null || (obj instanceof GraphRequest)) {
            return RemoteActionCompatParcelizer((GraphRequest) obj);
        }
        return false;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (obj == null || (obj instanceof GraphRequest)) {
            return write((GraphRequest) obj);
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        if (obj == null || (obj instanceof GraphRequest)) {
            return AudioAttributesCompatParcelizer((GraphRequest) obj);
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        if (obj == null || (obj instanceof GraphRequest)) {
            return read((GraphRequest) obj);
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return MediaBrowserCompatMediaItem();
    }

    public final void AudioAttributesCompatParcelizer(Handler handler) {
        this.RemoteActionCompatParcelizer = handler;
    }

    /* JADX INFO: renamed from: write, reason: from getter */
    public final Handler getRemoteActionCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from getter */
    public final String getAudioAttributesCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    public final List<GraphRequest> AudioAttributesImplApi21Parcelizer() {
        return this.write;
    }

    public final List<IconCompatParcelizer> RemoteActionCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: from getter */
    public final int getAudioAttributesImplApi26Parcelizer() {
        return this.AudioAttributesImplApi26Parcelizer;
    }

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from getter */
    public final String getRead() {
        return this.read;
    }

    public lambdaonPlaybackSuppressionReasonChanged37() {
        this.AudioAttributesCompatParcelizer = String.valueOf(RemoteActionCompatParcelizer.incrementAndGet());
        this.IconCompatParcelizer = new ArrayList();
        this.write = new ArrayList();
    }

    public lambdaonPlaybackSuppressionReasonChanged37(Collection<GraphRequest> collection) {
        toMagicModuleMetaRepoModel.write(collection, "");
        this.AudioAttributesCompatParcelizer = String.valueOf(RemoteActionCompatParcelizer.incrementAndGet());
        this.IconCompatParcelizer = new ArrayList();
        this.write = new ArrayList(collection);
    }

    public lambdaonPlaybackSuppressionReasonChanged37(GraphRequest... graphRequestArr) {
        toMagicModuleMetaRepoModel.write(graphRequestArr, "");
        this.AudioAttributesCompatParcelizer = String.valueOf(RemoteActionCompatParcelizer.incrementAndGet());
        this.IconCompatParcelizer = new ArrayList();
        this.write = new ArrayList(getOrderDetails.read(graphRequestArr));
    }

    public final void RemoteActionCompatParcelizer(IconCompatParcelizer p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        if (this.IconCompatParcelizer.contains(p0)) {
            return;
        }
        this.IconCompatParcelizer.add(p0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public boolean add(GraphRequest p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        return this.write.add(p0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
    public void add(int p0, GraphRequest p1) {
        toMagicModuleMetaRepoModel.write(p1, "");
        this.write.add(p0, p1);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        this.write.clear();
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public final GraphRequest get(int p0) {
        return this.write.get(p0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
    public GraphRequest remove(int p0) {
        return this.write.remove(p0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
    public GraphRequest set(int p0, GraphRequest p1) {
        toMagicModuleMetaRepoModel.write(p1, "");
        return this.write.set(p0, p1);
    }

    private int MediaBrowserCompatMediaItem() {
        return this.write.size();
    }

    public final List<lambdaonPlayerError41> IconCompatParcelizer() {
        return AudioAttributesImplBaseParcelizer();
    }

    public final lambdaonPlaybackStateChanged35 read() {
        return MediaBrowserCompatItemReceiver();
    }

    private final List<lambdaonPlayerError41> AudioAttributesImplBaseParcelizer() {
        return GraphRequest.INSTANCE.write(this);
    }

    private final lambdaonPlaybackStateChanged35 MediaBrowserCompatItemReceiver() {
        GraphRequest.Companion companion = GraphRequest.INSTANCE;
        return GraphRequest.Companion.AudioAttributesCompatParcelizer(this);
    }
}
