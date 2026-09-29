package kotlin;

import java.io.InvalidObjectException;
import java.io.NotSerializableException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.Metadata;
import kotlin.getLoggedUser;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\"\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010)\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\u0004\b\u0000\u0018\u0000 (*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u00022\b\u0012\u0004\u0012\u0002H\u00010\u00032\u00060\u0004j\u0002`\u0005:\u0001(B\u001b\b\u0000\u0012\u0010\u0010\u0006\u001a\f\u0012\u0004\u0012\u00028\u0000\u0012\u0002\b\u00030\u0007¢\u0006\u0004\b\b\u0010\tB\t\b\u0016¢\u0006\u0004\b\b\u0010\nB\u0011\b\u0016\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\b\u0010\rJ\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u000fJ\b\u0010\u0010\u001a\u00020\u0011H\u0002J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0002J\b\u0010\u0019\u001a\u00020\u001aH\u0016J\u0016\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0002\u0010\u001dJ\b\u0010\u001e\u001a\u00020\u0013H\u0016J\u0015\u0010\u001f\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u001dJ\u0015\u0010 \u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u001dJ\u000f\u0010!\u001a\b\u0012\u0004\u0012\u00028\u00000\"H\u0096\u0002J\u0016\u0010#\u001a\u00020\u001a2\f\u0010$\u001a\b\u0012\u0004\u0012\u00028\u00000%H\u0016J\u0016\u0010&\u001a\u00020\u001a2\f\u0010$\u001a\b\u0012\u0004\u0012\u00028\u00000%H\u0016J\u0016\u0010'\u001a\u00020\u001a2\f\u0010$\u001a\b\u0012\u0004\u0012\u00028\u00000%H\u0016R\u0018\u0010\u0006\u001a\f\u0012\u0004\u0012\u00028\u0000\u0012\u0002\b\u00030\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0016\u001a\u00020\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018¨\u0006)"}, d2 = {"Lkotlin/collections/builders/SetBuilder;", "E", "", "Lkotlin/collections/AbstractMutableSet;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "backing", "Lkotlin/collections/builders/MapBuilder;", "<init>", "(Lkotlin/collections/builders/MapBuilder;)V", "()V", "initialCapacity", "", "(I)V", "build", "", "writeReplace", "", "readObject", "", "input", "Ljava/io/ObjectInputStream;", "size", "getSize", "()I", "isEmpty", "", "contains", "element", "(Ljava/lang/Object;)Z", "clear", "add", "remove", "iterator", "", "addAll", "elements", "", "removeAll", "retainAll", "Companion", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class getConfigPref<E> extends getCardContent<E> implements Set<E>, Serializable {
    private static final write RemoteActionCompatParcelizer = new write(null);
    private static final getConfigPref write;
    private final getLoggedUser<E, ?> read;

    private getConfigPref(getLoggedUser<E, ?> getloggeduser) {
        toMagicModuleMetaRepoModel.write(getloggeduser, "");
        this.read = getloggeduser;
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007"}, d2 = {"Lo/getConfigPref$write;", "", "<init>", "()V", "Lo/getConfigPref;", "", "write", "Lo/getConfigPref;", "RemoteActionCompatParcelizer"}, k = 1, mv = {2, 2, 0}, xi = 48)
    static final class write {
        private write() {
        }

        public /* synthetic */ write(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }

    static {
        getLoggedUser.read readVar = getLoggedUser.write;
        write = new getConfigPref(getLoggedUser.read.write());
    }

    public getConfigPref() {
        this(new getLoggedUser());
    }

    public getConfigPref(int i) {
        this(new getLoggedUser(i));
    }

    public final Set<E> RemoteActionCompatParcelizer() {
        this.read.AudioAttributesCompatParcelizer();
        return size() > 0 ? this : write;
    }

    private final Object writeReplace() throws NotSerializableException {
        if (this.read.getAudioAttributesImplApi26Parcelizer()) {
            return new isMagicModuleEnabled(this, 1);
        }
        throw new NotSerializableException("The set cannot be serialized while it is being built.");
    }

    private final void readObject(ObjectInputStream input) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization is supported via proxy only");
    }

    @Override // kotlin.getCardContent
    public final int read() {
        return this.read.size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.read.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object element) {
        return this.read.containsKey(element);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.read.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(E element) {
        return this.read.read(element) >= 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object element) {
        return this.read.RemoteActionCompatParcelizer(element);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator<E> iterator() {
        return this.read.MediaBrowserCompatCustomActionResultReceiver();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean addAll(Collection<? extends E> elements) {
        toMagicModuleMetaRepoModel.write(elements, "");
        this.read.read();
        return super.addAll(elements);
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection<?> elements) {
        toMagicModuleMetaRepoModel.write(elements, "");
        this.read.read();
        return super.removeAll(elements);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection<?> elements) {
        toMagicModuleMetaRepoModel.write(elements, "");
        this.read.read();
        return super.retainAll(elements);
    }
}
