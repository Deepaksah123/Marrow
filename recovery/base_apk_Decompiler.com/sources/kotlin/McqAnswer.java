package kotlin;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes4.dex */
public final class McqAnswer extends AbstractList<String> implements RandomAccess, toJSONArray {
    public static final toJSONArray RemoteActionCompatParcelizer = new McqAnswer().IconCompatParcelizer();
    private final List<Object> write;

    public McqAnswer() {
        this.write = new ArrayList();
    }

    public McqAnswer(toJSONArray tojsonarray) {
        this.write = new ArrayList(tojsonarray.size());
        addAll(tojsonarray);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
    public String get(int i) {
        Object obj = this.write.get(i);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof setVideoAspectRatio) {
            setVideoAspectRatio setvideoaspectratio = (setVideoAspectRatio) obj;
            String strAudioAttributesImplApi21Parcelizer = setvideoaspectratio.AudioAttributesImplApi21Parcelizer();
            if (setvideoaspectratio.read()) {
                this.write.set(i, strAudioAttributesImplApi21Parcelizer);
            }
            return strAudioAttributesImplApi21Parcelizer;
        }
        byte[] bArr = (byte[]) obj;
        String strRemoteActionCompatParcelizer = LessonSpinnerItem.RemoteActionCompatParcelizer(bArr);
        if (LessonSpinnerItem.AudioAttributesCompatParcelizer(bArr)) {
            this.write.set(i, strRemoteActionCompatParcelizer);
        }
        return strRemoteActionCompatParcelizer;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.write.size();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
    public String set(int i, String str) {
        return IconCompatParcelizer(this.write.set(i, str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public void add(int i, String str) {
        this.write.add(i, str);
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends String> collection) {
        return addAll(size(), collection);
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection<? extends String> collection) {
        if (collection instanceof toJSONArray) {
            collection = ((toJSONArray) collection).RemoteActionCompatParcelizer();
        }
        boolean zAddAll = this.write.addAll(i, collection);
        ((AbstractList) this).modCount++;
        return zAddAll;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public String remove(int i) {
        Object objRemove = this.write.remove(i);
        ((AbstractList) this).modCount++;
        return IconCompatParcelizer(objRemove);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        this.write.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // kotlin.toJSONArray
    public final void write(setVideoAspectRatio setvideoaspectratio) {
        this.write.add(setvideoaspectratio);
        ((AbstractList) this).modCount++;
    }

    @Override // kotlin.toJSONArray
    public final setVideoAspectRatio write(int i) {
        Object obj = this.write.get(i);
        setVideoAspectRatio setvideoaspectratioWrite = write(obj);
        if (setvideoaspectratioWrite != obj) {
            this.write.set(i, setvideoaspectratioWrite);
        }
        return setvideoaspectratioWrite;
    }

    private static String IconCompatParcelizer(Object obj) {
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof setVideoAspectRatio) {
            return ((setVideoAspectRatio) obj).AudioAttributesImplApi21Parcelizer();
        }
        return LessonSpinnerItem.RemoteActionCompatParcelizer((byte[]) obj);
    }

    private static setVideoAspectRatio write(Object obj) {
        if (obj instanceof setVideoAspectRatio) {
            return (setVideoAspectRatio) obj;
        }
        if (obj instanceof String) {
            return setVideoAspectRatio.write((String) obj);
        }
        return setVideoAspectRatio.read((byte[]) obj);
    }

    @Override // kotlin.toJSONArray
    public final List<?> RemoteActionCompatParcelizer() {
        return Collections.unmodifiableList(this.write);
    }

    @Override // kotlin.toJSONArray
    public final toJSONArray IconCompatParcelizer() {
        return new isGuessed(this);
    }
}
