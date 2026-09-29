package kotlin;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes3.dex */
public final class isIdle extends handleDownloadHelperCallbackMessage<String> implements isInitialized, RandomAccess {
    private final List<Object> RemoteActionCompatParcelizer;

    @Override // kotlin.handleDownloadHelperCallbackMessage, o.getDownloadIndex.MediaBrowserCompatItemReceiver
    public final /* bridge */ /* synthetic */ boolean AudioAttributesCompatParcelizer() {
        return super.AudioAttributesCompatParcelizer();
    }

    @Override // kotlin.handleDownloadHelperCallbackMessage, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        return super.add(obj);
    }

    @Override // kotlin.handleDownloadHelperCallbackMessage, java.util.AbstractList, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override // kotlin.handleDownloadHelperCallbackMessage, java.util.AbstractList, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    @Override // kotlin.handleDownloadHelperCallbackMessage, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean remove(Object obj) {
        return super.remove(obj);
    }

    @Override // kotlin.handleDownloadHelperCallbackMessage, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean removeAll(Collection collection) {
        return super.removeAll(collection);
    }

    @Override // kotlin.handleDownloadHelperCallbackMessage, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean retainAll(Collection collection) {
        return super.retainAll(collection);
    }

    static {
        new isIdle().RemoteActionCompatParcelizer();
    }

    public isIdle() {
        this(10);
    }

    public isIdle(int i) {
        this((ArrayList<Object>) new ArrayList(i));
    }

    private isIdle(ArrayList<Object> arrayList) {
        this.RemoteActionCompatParcelizer = arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // o.getDownloadIndex.MediaBrowserCompatItemReceiver
    /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
    public isIdle AudioAttributesCompatParcelizer(int i) {
        if (i < size()) {
            throw new IllegalArgumentException();
        }
        ArrayList arrayList = new ArrayList(i);
        arrayList.addAll(this.RemoteActionCompatParcelizer);
        return new isIdle((ArrayList<Object>) arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public String get(int i) {
        Object obj = this.RemoteActionCompatParcelizer.get(i);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof DownloadIndex) {
            DownloadIndex downloadIndex = (DownloadIndex) obj;
            String strMediaBrowserCompatCustomActionResultReceiver = downloadIndex.MediaBrowserCompatCustomActionResultReceiver();
            if (downloadIndex.RemoteActionCompatParcelizer()) {
                this.RemoteActionCompatParcelizer.set(i, strMediaBrowserCompatCustomActionResultReceiver);
            }
            return strMediaBrowserCompatCustomActionResultReceiver;
        }
        byte[] bArr = (byte[]) obj;
        String str = getDownloadIndex.read(bArr);
        if (getDownloadIndex.IconCompatParcelizer(bArr)) {
            this.RemoteActionCompatParcelizer.set(i, str);
        }
        return str;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.RemoteActionCompatParcelizer.size();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.handleDownloadHelperCallbackMessage, java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
    public String set(int i, String str) {
        read();
        return AudioAttributesCompatParcelizer(this.RemoteActionCompatParcelizer.set(i, str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.handleDownloadHelperCallbackMessage, java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public void add(int i, String str) {
        read();
        this.RemoteActionCompatParcelizer.add(i, str);
        ((AbstractList) this).modCount++;
    }

    @Override // kotlin.handleDownloadHelperCallbackMessage, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends String> collection) {
        return addAll(size(), collection);
    }

    @Override // kotlin.handleDownloadHelperCallbackMessage, java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection<? extends String> collection) {
        read();
        if (collection instanceof isInitialized) {
            collection = ((isInitialized) collection).write();
        }
        boolean zAddAll = this.RemoteActionCompatParcelizer.addAll(i, collection);
        ((AbstractList) this).modCount++;
        return zAddAll;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.handleDownloadHelperCallbackMessage, java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
    public String remove(int i) {
        read();
        Object objRemove = this.RemoteActionCompatParcelizer.remove(i);
        ((AbstractList) this).modCount++;
        return AudioAttributesCompatParcelizer(objRemove);
    }

    @Override // kotlin.handleDownloadHelperCallbackMessage, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        read();
        this.RemoteActionCompatParcelizer.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // kotlin.isInitialized
    public final void AudioAttributesCompatParcelizer(DownloadIndex downloadIndex) {
        read();
        this.RemoteActionCompatParcelizer.add(downloadIndex);
        ((AbstractList) this).modCount++;
    }

    @Override // kotlin.isInitialized
    public final Object IconCompatParcelizer(int i) {
        return this.RemoteActionCompatParcelizer.get(i);
    }

    private static String AudioAttributesCompatParcelizer(Object obj) {
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof DownloadIndex) {
            return ((DownloadIndex) obj).MediaBrowserCompatCustomActionResultReceiver();
        }
        return getDownloadIndex.read((byte[]) obj);
    }

    @Override // kotlin.isInitialized
    public final List<?> write() {
        return Collections.unmodifiableList(this.RemoteActionCompatParcelizer);
    }

    @Override // kotlin.isInitialized
    public final isInitialized IconCompatParcelizer() {
        return AudioAttributesCompatParcelizer() ? new onIdle(this) : this;
    }
}
