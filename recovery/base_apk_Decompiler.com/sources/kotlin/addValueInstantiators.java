package kotlin;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.UnaryOperator;
import kotlin.Metadata;
import kotlin._handleOddName;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u001e\n\u0002\b\u0005\n\u0002\u0010(\n\u0002\b\u0002\n\u0002\u0010*\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0018\u0013B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\r\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\u0004J\u001d\u0010\r\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0005¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\r\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\r\u0010\u0010J+\u0010\u0013\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u00052\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\b0\u0011¢\u0006\u0004\b\u0013\u0010\u0014J3\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u00052\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\b0\u0011¢\u0006\u0004\b\t\u0010\u0016J\u0017\u0010\u0018\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u0006\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u00172\u0006\u0010\f\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u0006\u0010\u001aJ\u0018\u0010\u0018\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0018\u0010\u001bJ\u001d\u0010\u001d\u001a\u00020\u00052\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\u001cH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0018\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0017H\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u001fJ\u0017\u0010\u0013\u001a\u00020\u00172\u0006\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0013\u0010 J\u000f\u0010!\u001a\u00020\u0005H\u0016¢\u0006\u0004\b!\u0010\u0007J\u0016\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00020\"H\u0096\u0002¢\u0006\u0004\b#\u0010$J\u0017\u0010\r\u001a\u00020\u00172\u0006\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010 J\u0015\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00020%H\u0016¢\u0006\u0004\b&\u0010'J\u001d\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00020%2\u0006\u0010\u000b\u001a\u00020\u0017H\u0016¢\u0006\u0004\b&\u0010(J%\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u000b\u001a\u00020\u00172\u0006\u0010\f\u001a\u00020\u0017H\u0016¢\u0006\u0004\b)\u0010*J\r\u0010+\u001a\u00020\b¢\u0006\u0004\b+\u0010\u0004R\u001c\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020-0,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010.R\u0016\u0010\u0013\u001a\u00020/8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u00100R\u0016\u0010\t\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u00101R\u0014\u0010\r\u001a\u00020\u00178WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u00102"}, d2 = {"Lo/addValueInstantiators;", "", "Lo/_handleOddName$IconCompatParcelizer;", "<init>", "()V", "", "write", "()Z", "", "IconCompatParcelizer", "", "p0", "p1", "RemoteActionCompatParcelizer", "(FZ)Z", "Lo/addBeanSerializerModifier;", "()J", "Lkotlin/Function0;", "p2", "read", "(Lo/_handleOddName$IconCompatParcelizer;ZLo/getCreatedOnDateMs;)V", "p3", "(Lo/_handleOddName$IconCompatParcelizer;FZLo/getCreatedOnDateMs;)V", "", "AudioAttributesCompatParcelizer", "(I)V", "(II)V", "(Lo/_handleOddName$IconCompatParcelizer;)Z", "", "containsAll", "(Ljava/util/Collection;)Z", "(I)Lo/_handleOddName$IconCompatParcelizer;", "(Lo/_handleOddName$IconCompatParcelizer;)I", "isEmpty", "", "iterator", "()Ljava/util/Iterator;", "", "listIterator", "()Ljava/util/ListIterator;", "(I)Ljava/util/ListIterator;", "subList", "(II)Ljava/util/List;", "clear", "Lo/setDropDownBackgroundResource;", "", "Lo/setDropDownBackgroundResource;", "Lo/AppCompatAutoCompleteTextView;", "Lo/AppCompatAutoCompleteTextView;", "I", "()I"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class addValueInstantiators implements List<_handleOddName.IconCompatParcelizer>, getCurrentAnsweredMcqProgress {

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private setDropDownBackgroundResource<Object> write = new setDropDownBackgroundResource<>(16);

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private AppCompatAutoCompleteTextView read = new AppCompatAutoCompleteTextView(16);

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private int IconCompatParcelizer = -1;

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        if (obj instanceof _handleOddName.IconCompatParcelizer) {
            return AudioAttributesCompatParcelizer((_handleOddName.IconCompatParcelizer) obj);
        }
        return false;
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        if (obj instanceof _handleOddName.IconCompatParcelizer) {
            return read((_handleOddName.IconCompatParcelizer) obj);
        }
        return -1;
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        if (obj instanceof _handleOddName.IconCompatParcelizer) {
            return RemoteActionCompatParcelizer((_handleOddName.IconCompatParcelizer) obj);
        }
        return -1;
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return read();
    }

    public final int read() {
        return this.write.getRemoteActionCompatParcelizer();
    }

    public final boolean write() {
        long jRemoteActionCompatParcelizer = RemoteActionCompatParcelizer();
        return addBeanSerializerModifier.write(jRemoteActionCompatParcelizer) < BitmapDescriptorFactory.HUE_RED && addBeanSerializerModifier.AudioAttributesCompatParcelizer(jRemoteActionCompatParcelizer) && !addBeanSerializerModifier.IconCompatParcelizer(jRemoteActionCompatParcelizer);
    }

    public final void IconCompatParcelizer() {
        this.IconCompatParcelizer = size() - 1;
    }

    public final boolean RemoteActionCompatParcelizer(float p0, boolean p1) {
        if (this.IconCompatParcelizer == IntermediateLoginResponseBody.write((List) this)) {
            return true;
        }
        return addBeanSerializerModifier.RemoteActionCompatParcelizer(RemoteActionCompatParcelizer(), addSerializers.AudioAttributesCompatParcelizer$default(p0, p1, false, 4, null)) > 0;
    }

    private final long RemoteActionCompatParcelizer() {
        long jAudioAttributesCompatParcelizer$default = addSerializers.AudioAttributesCompatParcelizer$default(Float.POSITIVE_INFINITY, false, false, 4, null);
        int i = this.IconCompatParcelizer + 1;
        int iWrite = IntermediateLoginResponseBody.write((List) this);
        if (i <= iWrite) {
            while (true) {
                long jRemoteActionCompatParcelizer = addBeanSerializerModifier.RemoteActionCompatParcelizer(this.read.read(i));
                if (addBeanSerializerModifier.RemoteActionCompatParcelizer(jRemoteActionCompatParcelizer, jAudioAttributesCompatParcelizer$default) < 0) {
                    jAudioAttributesCompatParcelizer$default = jRemoteActionCompatParcelizer;
                }
                if ((addBeanSerializerModifier.write(jAudioAttributesCompatParcelizer$default) < BitmapDescriptorFactory.HUE_RED && addBeanSerializerModifier.AudioAttributesCompatParcelizer(jAudioAttributesCompatParcelizer$default)) || i == iWrite) {
                    break;
                }
                i++;
            }
        }
        return jAudioAttributesCompatParcelizer$default;
    }

    public final void read(_handleOddName.IconCompatParcelizer p0, boolean p1, getCreatedOnDateMs<getShowPopup> p2) {
        addValueInstantiators addvalueinstantiators = this;
        if (this.IconCompatParcelizer == IntermediateLoginResponseBody.write((List) addvalueinstantiators)) {
            int i = this.IconCompatParcelizer;
            write(this.IconCompatParcelizer + 1, size());
            this.IconCompatParcelizer++;
            this.write.AudioAttributesCompatParcelizer(p0);
            this.read.read(addSerializers.AudioAttributesCompatParcelizer(BitmapDescriptorFactory.HUE_RED, p1, true));
            p2.invoke();
            this.IconCompatParcelizer = i;
            return;
        }
        long jRemoteActionCompatParcelizer = RemoteActionCompatParcelizer();
        int i2 = this.IconCompatParcelizer;
        if (!addBeanSerializerModifier.IconCompatParcelizer(jRemoteActionCompatParcelizer)) {
            if (addBeanSerializerModifier.write(jRemoteActionCompatParcelizer) > BitmapDescriptorFactory.HUE_RED) {
                int i3 = this.IconCompatParcelizer;
                write(this.IconCompatParcelizer + 1, size());
                this.IconCompatParcelizer++;
                this.write.AudioAttributesCompatParcelizer(p0);
                this.read.read(addSerializers.AudioAttributesCompatParcelizer(BitmapDescriptorFactory.HUE_RED, p1, true));
                p2.invoke();
                this.IconCompatParcelizer = i3;
                return;
            }
            return;
        }
        this.IconCompatParcelizer = IntermediateLoginResponseBody.write((List) addvalueinstantiators);
        int i4 = this.IconCompatParcelizer;
        write(this.IconCompatParcelizer + 1, size());
        this.IconCompatParcelizer++;
        this.write.AudioAttributesCompatParcelizer(p0);
        this.read.read(addSerializers.AudioAttributesCompatParcelizer(BitmapDescriptorFactory.HUE_RED, p1, true));
        p2.invoke();
        this.IconCompatParcelizer = i4;
        if (addBeanSerializerModifier.write(RemoteActionCompatParcelizer()) < BitmapDescriptorFactory.HUE_RED) {
            write(i2 + 1, this.IconCompatParcelizer + 1);
        }
        this.IconCompatParcelizer = i2;
    }

    public final void IconCompatParcelizer(_handleOddName.IconCompatParcelizer p0, float p1, boolean p2, getCreatedOnDateMs<getShowPopup> p3) {
        int i;
        addValueInstantiators addvalueinstantiators = this;
        if (this.IconCompatParcelizer == IntermediateLoginResponseBody.write((List) addvalueinstantiators)) {
            int i2 = this.IconCompatParcelizer;
            write(this.IconCompatParcelizer + 1, size());
            this.IconCompatParcelizer++;
            this.write.AudioAttributesCompatParcelizer(p0);
            this.read.read(addSerializers.AudioAttributesCompatParcelizer(p1, p2, false));
            p3.invoke();
            this.IconCompatParcelizer = i2;
            if (this.IconCompatParcelizer + 1 == IntermediateLoginResponseBody.write((List) addvalueinstantiators) || addBeanSerializerModifier.IconCompatParcelizer(RemoteActionCompatParcelizer())) {
                AudioAttributesCompatParcelizer(this.IconCompatParcelizer + 1);
                return;
            }
            return;
        }
        long jRemoteActionCompatParcelizer = RemoteActionCompatParcelizer();
        int i3 = this.IconCompatParcelizer;
        this.IconCompatParcelizer = IntermediateLoginResponseBody.write((List) addvalueinstantiators);
        int i4 = this.IconCompatParcelizer;
        write(this.IconCompatParcelizer + 1, size());
        this.IconCompatParcelizer++;
        this.write.AudioAttributesCompatParcelizer(p0);
        this.read.read(addSerializers.AudioAttributesCompatParcelizer(p1, p2, false));
        p3.invoke();
        this.IconCompatParcelizer = i4;
        long jRemoteActionCompatParcelizer2 = RemoteActionCompatParcelizer();
        if (this.IconCompatParcelizer + 1 < IntermediateLoginResponseBody.write((List) addvalueinstantiators) && addBeanSerializerModifier.RemoteActionCompatParcelizer(jRemoteActionCompatParcelizer, jRemoteActionCompatParcelizer2) > 0) {
            if (addBeanSerializerModifier.IconCompatParcelizer(jRemoteActionCompatParcelizer2)) {
                i = this.IconCompatParcelizer + 2;
            } else {
                i = this.IconCompatParcelizer + 1;
            }
            write(i3 + 1, i);
        } else {
            write(this.IconCompatParcelizer + 1, size());
        }
        this.IconCompatParcelizer = i3;
    }

    private final void AudioAttributesCompatParcelizer(int p0) {
        this.write.AudioAttributesCompatParcelizer(p0);
        this.read.write(p0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void write(int p0, int p1) {
        if (p0 >= p1) {
            return;
        }
        this.write.write(p0, p1);
        this.read.RemoteActionCompatParcelizer(p0, p1);
    }

    public final boolean AudioAttributesCompatParcelizer(_handleOddName.IconCompatParcelizer p0) {
        return indexOf(p0) != -1;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection<?> p0) {
        Iterator<T> it = p0.iterator();
        while (it.hasNext()) {
            if (!contains((_handleOddName.IconCompatParcelizer) it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
    public final _handleOddName.IconCompatParcelizer get(int p0) {
        Object obj = this.write.read(p0);
        toMagicModuleMetaRepoModel.read(obj, "");
        return (_handleOddName.IconCompatParcelizer) obj;
    }

    public final int read(_handleOddName.IconCompatParcelizer p0) {
        int iWrite = IntermediateLoginResponseBody.write((List) this);
        if (iWrite < 0) {
            return -1;
        }
        int i = 0;
        while (!toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.write.read(i), p0)) {
            if (i == iWrite) {
                return -1;
            }
            i++;
        }
        return i;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.write.AudioAttributesImplApi21Parcelizer();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator<_handleOddName.IconCompatParcelizer> iterator() {
        return new AudioAttributesCompatParcelizer(this, 0, 0, 0, 7, null);
    }

    public final int RemoteActionCompatParcelizer(_handleOddName.IconCompatParcelizer p0) {
        for (int iWrite = IntermediateLoginResponseBody.write((List) this); iWrite >= 0; iWrite--) {
            if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.write.read(iWrite), p0)) {
                return iWrite;
            }
        }
        return -1;
    }

    @Override // java.util.List
    public final ListIterator<_handleOddName.IconCompatParcelizer> listIterator() {
        return new AudioAttributesCompatParcelizer(this, 0, 0, 0, 7, null);
    }

    @Override // java.util.List
    public final ListIterator<_handleOddName.IconCompatParcelizer> listIterator(int p0) {
        return new AudioAttributesCompatParcelizer(this, p0, 0, 0, 6, null);
    }

    @Override // java.util.List
    public final List<_handleOddName.IconCompatParcelizer> subList(int p0, int p1) {
        return new read(p0, p1);
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        this.IconCompatParcelizer = -1;
        this.write.RemoteActionCompatParcelizer();
        this.read.read();
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010*\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\r\b\u0082\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B%\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tH\u0096\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\u000bJ\u0010\u0010\r\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0011\u0010\u000eJ\u000f\u0010\u0012\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0012\u0010\u0010R\u0016\u0010\u0013\u001a\u00020\u00038\u0006@\u0006X\u0086\f¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0016\u001a\u00020\u00038\u0006¢\u0006\u0006\n\u0004\b\u0015\u0010\u0014R\u0011\u0010\r\u001a\u00020\u00038\u0006¢\u0006\u0006\n\u0004\b\r\u0010\u0014"}, d2 = {"Lo/addValueInstantiators$AudioAttributesCompatParcelizer;", "", "Lo/_handleOddName$IconCompatParcelizer;", "", "p0", "p1", "p2", "<init>", "(Lo/addValueInstantiators;III)V", "", "hasNext", "()Z", "hasPrevious", "write", "()Lo/_handleOddName$IconCompatParcelizer;", "nextIndex", "()I", "RemoteActionCompatParcelizer", "previousIndex", "AudioAttributesCompatParcelizer", "I", "read", "IconCompatParcelizer"}, k = 1, mv = {2, 0, 0}, xi = 48)
    final class AudioAttributesCompatParcelizer implements ListIterator<_handleOddName.IconCompatParcelizer>, getCurrentAnsweredMcqProgress {
        public int AudioAttributesCompatParcelizer;

        /* JADX INFO: renamed from: read, reason: from kotlin metadata */
        private final int IconCompatParcelizer;
        private final int write;

        public AudioAttributesCompatParcelizer(int i, int i2, int i3) {
            this.AudioAttributesCompatParcelizer = i;
            this.IconCompatParcelizer = i2;
            this.write = i3;
        }

        public /* synthetic */ AudioAttributesCompatParcelizer(addValueInstantiators addvalueinstantiators, int i, int i2, int i3, int i4, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this((i4 & 1) != 0 ? 0 : i, (i4 & 2) != 0 ? 0 : i2, (i4 & 4) != 0 ? addvalueinstantiators.size() : i3);
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public final boolean hasNext() {
            return this.AudioAttributesCompatParcelizer < this.write;
        }

        @Override // java.util.ListIterator
        public final boolean hasPrevious() {
            return this.AudioAttributesCompatParcelizer > this.IconCompatParcelizer;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.ListIterator, java.util.Iterator
        /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
        public final _handleOddName.IconCompatParcelizer next() {
            setDropDownBackgroundResource setdropdownbackgroundresource = addValueInstantiators.this.write;
            int i = this.AudioAttributesCompatParcelizer;
            this.AudioAttributesCompatParcelizer = i + 1;
            E e = setdropdownbackgroundresource.read(i);
            toMagicModuleMetaRepoModel.read(e, "");
            return (_handleOddName.IconCompatParcelizer) e;
        }

        @Override // java.util.ListIterator
        public final int nextIndex() {
            return this.AudioAttributesCompatParcelizer - this.IconCompatParcelizer;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.ListIterator
        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final _handleOddName.IconCompatParcelizer previous() {
            setDropDownBackgroundResource setdropdownbackgroundresource = addValueInstantiators.this.write;
            int i = this.AudioAttributesCompatParcelizer - 1;
            this.AudioAttributesCompatParcelizer = i;
            E e = setdropdownbackgroundresource.read(i);
            toMagicModuleMetaRepoModel.read(e, "");
            return (_handleOddName.IconCompatParcelizer) e;
        }

        @Override // java.util.ListIterator
        public final int previousIndex() {
            return (this.AudioAttributesCompatParcelizer - this.IconCompatParcelizer) - 1;
        }

        @Override // java.util.ListIterator
        public final /* synthetic */ void add(_handleOddName.IconCompatParcelizer iconCompatParcelizer) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.ListIterator
        public final /* synthetic */ void set(_handleOddName.IconCompatParcelizer iconCompatParcelizer) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\u0007\n\u0002\u0010(\n\u0002\b\u0003\n\u0002\u0010*\n\u0002\b\t\b\u0082\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\f\u001a\u00020\b2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0018\u0010\t\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\t\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0016\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00020\u0013H\u0096\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0016\u0010\u0010J\u0015\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u001d\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00020\u00172\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0018\u0010\u001aJ%\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u001b\u0010\u001cR\u0011\u0010\u0016\u001a\u00020\u00038\u0006¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0011\u0010\u001d\u001a\u00020\u00038\u0006¢\u0006\u0006\n\u0004\b\t\u0010\u001eR\u0014\u0010 \u001a\u00020\u00038WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u001f"}, d2 = {"Lo/addValueInstantiators$read;", "", "Lo/_handleOddName$IconCompatParcelizer;", "", "p0", "p1", "<init>", "(Lo/addValueInstantiators;II)V", "", "read", "(Lo/_handleOddName$IconCompatParcelizer;)Z", "", "containsAll", "(Ljava/util/Collection;)Z", "(I)Lo/_handleOddName$IconCompatParcelizer;", "write", "(Lo/_handleOddName$IconCompatParcelizer;)I", "isEmpty", "()Z", "", "iterator", "()Ljava/util/Iterator;", "IconCompatParcelizer", "", "listIterator", "()Ljava/util/ListIterator;", "(I)Ljava/util/ListIterator;", "subList", "(II)Ljava/util/List;", "AudioAttributesCompatParcelizer", "I", "()I", "RemoteActionCompatParcelizer"}, k = 1, mv = {2, 0, 0}, xi = 48)
    final class read implements List<_handleOddName.IconCompatParcelizer>, getCurrentAnsweredMcqProgress {

        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
        private final int IconCompatParcelizer;

        /* JADX INFO: renamed from: read, reason: from kotlin metadata */
        private final int AudioAttributesCompatParcelizer;

        public read(int i, int i2) {
            this.IconCompatParcelizer = i;
            this.AudioAttributesCompatParcelizer = i2;
        }

        @Override // java.util.List, java.util.Collection
        public final boolean contains(Object obj) {
            if (obj instanceof _handleOddName.IconCompatParcelizer) {
                return read((_handleOddName.IconCompatParcelizer) obj);
            }
            return false;
        }

        @Override // java.util.List
        public final int indexOf(Object obj) {
            if (obj instanceof _handleOddName.IconCompatParcelizer) {
                return write((_handleOddName.IconCompatParcelizer) obj);
            }
            return -1;
        }

        @Override // java.util.List
        public final int lastIndexOf(Object obj) {
            if (obj instanceof _handleOddName.IconCompatParcelizer) {
                return IconCompatParcelizer((_handleOddName.IconCompatParcelizer) obj);
            }
            return -1;
        }

        @Override // java.util.List, java.util.Collection
        public final int size() {
            return read();
        }

        public final int read() {
            return this.AudioAttributesCompatParcelizer - this.IconCompatParcelizer;
        }

        public final boolean read(_handleOddName.IconCompatParcelizer p0) {
            return indexOf(p0) != -1;
        }

        @Override // java.util.List, java.util.Collection
        public final boolean containsAll(Collection<?> p0) {
            Iterator<T> it = p0.iterator();
            while (it.hasNext()) {
                if (!contains((_handleOddName.IconCompatParcelizer) it.next())) {
                    return false;
                }
            }
            return true;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.List
        /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
        public final _handleOddName.IconCompatParcelizer get(int p0) {
            E e = addValueInstantiators.this.write.read(p0 + this.IconCompatParcelizer);
            toMagicModuleMetaRepoModel.read(e, "");
            return (_handleOddName.IconCompatParcelizer) e;
        }

        public final int write(_handleOddName.IconCompatParcelizer p0) {
            int i = this.IconCompatParcelizer;
            int i2 = this.AudioAttributesCompatParcelizer;
            if (i > i2) {
                return -1;
            }
            while (!toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(addValueInstantiators.this.write.read(i), p0)) {
                if (i == i2) {
                    return -1;
                }
                i++;
            }
            return i - this.IconCompatParcelizer;
        }

        @Override // java.util.List, java.util.Collection
        public final boolean isEmpty() {
            return size() == 0;
        }

        @Override // java.util.List, java.util.Collection, java.lang.Iterable
        public final Iterator<_handleOddName.IconCompatParcelizer> iterator() {
            addValueInstantiators addvalueinstantiators = addValueInstantiators.this;
            int i = this.IconCompatParcelizer;
            return addvalueinstantiators.new AudioAttributesCompatParcelizer(i, i, this.AudioAttributesCompatParcelizer);
        }

        public final int IconCompatParcelizer(_handleOddName.IconCompatParcelizer p0) {
            int i = this.AudioAttributesCompatParcelizer;
            int i2 = this.IconCompatParcelizer;
            if (i2 > i) {
                return -1;
            }
            while (!toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(addValueInstantiators.this.write.read(i), p0)) {
                if (i == i2) {
                    return -1;
                }
                i--;
            }
            return i - this.IconCompatParcelizer;
        }

        @Override // java.util.List
        public final ListIterator<_handleOddName.IconCompatParcelizer> listIterator() {
            addValueInstantiators addvalueinstantiators = addValueInstantiators.this;
            int i = this.IconCompatParcelizer;
            return addvalueinstantiators.new AudioAttributesCompatParcelizer(i, i, this.AudioAttributesCompatParcelizer);
        }

        @Override // java.util.List
        public final ListIterator<_handleOddName.IconCompatParcelizer> listIterator(int p0) {
            addValueInstantiators addvalueinstantiators = addValueInstantiators.this;
            int i = this.IconCompatParcelizer;
            return addvalueinstantiators.new AudioAttributesCompatParcelizer(p0 + i, i, this.AudioAttributesCompatParcelizer);
        }

        @Override // java.util.List
        public final List<_handleOddName.IconCompatParcelizer> subList(int p0, int p1) {
            addValueInstantiators addvalueinstantiators = addValueInstantiators.this;
            int i = this.IconCompatParcelizer;
            return addvalueinstantiators.new read(p0 + i, i + p1);
        }

        @Override // java.util.List
        public final /* synthetic */ void add(int i, _handleOddName.IconCompatParcelizer iconCompatParcelizer) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public final /* synthetic */ boolean add(Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List
        public final boolean addAll(int i, Collection<? extends _handleOddName.IconCompatParcelizer> collection) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public final boolean addAll(Collection<? extends _handleOddName.IconCompatParcelizer> collection) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public final /* synthetic */ void addFirst(Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public final /* synthetic */ void addLast(Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public final void clear() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List
        public final /* synthetic */ _handleOddName.IconCompatParcelizer remove(int i) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public final boolean remove(Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public final boolean removeAll(Collection<?> collection) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public final /* synthetic */ Object removeFirst() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public final /* synthetic */ Object removeLast() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List
        public final void replaceAll(UnaryOperator<_handleOddName.IconCompatParcelizer> unaryOperator) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public final boolean retainAll(Collection<?> collection) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List
        public final /* synthetic */ _handleOddName.IconCompatParcelizer set(int i, _handleOddName.IconCompatParcelizer iconCompatParcelizer) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List
        public final void sort(Comparator<? super _handleOddName.IconCompatParcelizer> comparator) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public final Object[] toArray() {
            return markCompletelambda1.read(this);
        }

        @Override // java.util.List, java.util.Collection
        public final <T> T[] toArray(T[] tArr) {
            return (T[]) markCompletelambda1.RemoteActionCompatParcelizer(this, tArr);
        }
    }

    @Override // java.util.List
    public final /* synthetic */ void add(int i, _handleOddName.IconCompatParcelizer iconCompatParcelizer) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection<? extends _handleOddName.IconCompatParcelizer> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection<? extends _handleOddName.IconCompatParcelizer> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* synthetic */ void addFirst(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* synthetic */ void addLast(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final /* synthetic */ _handleOddName.IconCompatParcelizer remove(int i) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection<?> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* synthetic */ Object removeFirst() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* synthetic */ Object removeLast() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final void replaceAll(UnaryOperator<_handleOddName.IconCompatParcelizer> unaryOperator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection<?> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final /* synthetic */ _handleOddName.IconCompatParcelizer set(int i, _handleOddName.IconCompatParcelizer iconCompatParcelizer) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final void sort(Comparator<? super _handleOddName.IconCompatParcelizer> comparator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return markCompletelambda1.read(this);
    }

    @Override // java.util.List, java.util.Collection
    public final <T> T[] toArray(T[] tArr) {
        return (T[]) markCompletelambda1.RemoteActionCompatParcelizer(this, tArr);
    }
}
