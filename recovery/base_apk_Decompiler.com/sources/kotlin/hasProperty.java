package kotlin;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes4.dex */
public final class hasProperty extends AnnotatedMethodMap<String> implements isFactoryMethod, RandomAccess {
    private final List<Object> read;

    @Override // kotlin.AnnotatedMethodMap, java.util.AbstractList, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override // kotlin.AnnotatedMethodMap, java.util.AbstractList, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    @Override // kotlin.AnnotatedMethodMap, o.forDeserialization.AudioAttributesImplBaseParcelizer
    public final /* bridge */ /* synthetic */ boolean read() {
        return super.read();
    }

    @Override // kotlin.AnnotatedMethodMap, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean remove(Object obj) {
        return super.remove(obj);
    }

    @Override // kotlin.AnnotatedMethodMap, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean removeAll(Collection collection) {
        return super.removeAll(collection);
    }

    @Override // kotlin.AnnotatedMethodMap, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean retainAll(Collection collection) {
        return super.retainAll(collection);
    }

    static {
        new hasProperty().RemoteActionCompatParcelizer();
    }

    public hasProperty() {
        this(10);
    }

    public hasProperty(int i) {
        this((ArrayList<Object>) new ArrayList(i));
    }

    private hasProperty(ArrayList<Object> arrayList) {
        this.read = arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // o.forDeserialization.AudioAttributesImplBaseParcelizer
    /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
    public hasProperty AudioAttributesCompatParcelizer(int i) {
        if (i < size()) {
            throw new IllegalArgumentException();
        }
        ArrayList arrayList = new ArrayList(i);
        arrayList.addAll(this.read);
        return new hasProperty((ArrayList<Object>) arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
    public String get(int i) {
        Object obj = this.read.get(i);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof AnnotatedWithParams) {
            AnnotatedWithParams annotatedWithParams = (AnnotatedWithParams) obj;
            String strMediaBrowserCompatCustomActionResultReceiver = annotatedWithParams.MediaBrowserCompatCustomActionResultReceiver();
            if (annotatedWithParams.AudioAttributesCompatParcelizer()) {
                this.read.set(i, strMediaBrowserCompatCustomActionResultReceiver);
            }
            return strMediaBrowserCompatCustomActionResultReceiver;
        }
        byte[] bArr = (byte[]) obj;
        String strAudioAttributesCompatParcelizer = forDeserialization.AudioAttributesCompatParcelizer(bArr);
        if (forDeserialization.read(bArr)) {
            this.read.set(i, strAudioAttributesCompatParcelizer);
        }
        return strAudioAttributesCompatParcelizer;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.read.size();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.AnnotatedMethodMap, java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
    public String set(int i, String str) {
        IconCompatParcelizer();
        return RemoteActionCompatParcelizer(this.read.set(i, str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.AnnotatedMethodMap, java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
    public void add(int i, String str) {
        IconCompatParcelizer();
        this.read.add(i, str);
        ((AbstractList) this).modCount++;
    }

    @Override // kotlin.AnnotatedMethodMap, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends String> collection) {
        return addAll(size(), collection);
    }

    @Override // kotlin.AnnotatedMethodMap, java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection<? extends String> collection) {
        IconCompatParcelizer();
        if (collection instanceof isFactoryMethod) {
            collection = ((isFactoryMethod) collection).AudioAttributesCompatParcelizer();
        }
        boolean zAddAll = this.read.addAll(i, collection);
        ((AbstractList) this).modCount++;
        return zAddAll;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.AnnotatedMethodMap, java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public String remove(int i) {
        IconCompatParcelizer();
        Object objRemove = this.read.remove(i);
        ((AbstractList) this).modCount++;
        return RemoteActionCompatParcelizer(objRemove);
    }

    @Override // kotlin.AnnotatedMethodMap, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        IconCompatParcelizer();
        this.read.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // kotlin.isFactoryMethod
    public final void IconCompatParcelizer(AnnotatedWithParams annotatedWithParams) {
        IconCompatParcelizer();
        this.read.add(annotatedWithParams);
        ((AbstractList) this).modCount++;
    }

    @Override // kotlin.isFactoryMethod
    public final Object RemoteActionCompatParcelizer(int i) {
        return this.read.get(i);
    }

    private static String RemoteActionCompatParcelizer(Object obj) {
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof AnnotatedWithParams) {
            return ((AnnotatedWithParams) obj).MediaBrowserCompatCustomActionResultReceiver();
        }
        return forDeserialization.AudioAttributesCompatParcelizer((byte[]) obj);
    }

    @Override // kotlin.isFactoryMethod
    public final List<?> AudioAttributesCompatParcelizer() {
        return Collections.unmodifiableList(this.read);
    }

    @Override // kotlin.isFactoryMethod
    public final isFactoryMethod write() {
        return read() ? new hasSetter(this) : this;
    }
}
