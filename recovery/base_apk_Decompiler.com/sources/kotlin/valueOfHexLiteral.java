package kotlin;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;
import kotlin.AbstractFloatValueParser;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010*\n\u0002\b\u0007\b\u0000\u0018\u0000 \u0019*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003:\u0001\u0019B\u0017\u0012\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00042\u0006\u0010\u0006\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\f2\u0006\u0010\u0006\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\n\u0010\rJ#\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\f2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J)\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\f2\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00120\u0011H\u0016¢\u0006\u0004\b\n\u0010\u0013J%\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\f2\u0006\u0010\u0006\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\f2\u0006\u0010\u0006\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000f\u0010\u0017J\u0015\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001b\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001d\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u001d\u0010\u001cJ\u001d\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00000\u001e2\u0006\u0010\u0006\u001a\u00020\tH\u0016¢\u0006\u0004\b\u001f\u0010 J\u0018\u0010!\u001a\u00028\u00002\u0006\u0010\u0006\u001a\u00020\tH\u0096\u0002¢\u0006\u0004\b!\u0010\"J%\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\f2\u0006\u0010\u0006\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u000f\u0010\u0016R\u001c\u0010\u0019\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010#\u001a\u00020\t8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b#\u0010%"}, d2 = {"Lo/valueOfHexLiteral;", "E", "Lo/reportInvalid;", "Lo/parseNaNOrInfinity;", "", "", "p0", "<init>", "([Ljava/lang/Object;)V", "", "write", "(I)[Ljava/lang/Object;", "Lo/AbstractFloatValueParser;", "(Ljava/lang/Object;)Lo/AbstractFloatValueParser;", "", "IconCompatParcelizer", "(Ljava/util/Collection;)Lo/AbstractFloatValueParser;", "Lkotlin/Function1;", "", "(Lo/getAnswerMap;)Lo/AbstractFloatValueParser;", "p1", "read", "(ILjava/lang/Object;)Lo/AbstractFloatValueParser;", "(I)Lo/AbstractFloatValueParser;", "Lo/AbstractFloatValueParser$AudioAttributesCompatParcelizer;", "RemoteActionCompatParcelizer", "()Lo/AbstractFloatValueParser$AudioAttributesCompatParcelizer;", "indexOf", "(Ljava/lang/Object;)I", "lastIndexOf", "", "listIterator", "(I)Ljava/util/ListIterator;", "get", "(I)Ljava/lang/Object;", "AudioAttributesCompatParcelizer", "[Ljava/lang/Object;", "()I"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class valueOfHexLiteral<E> extends parseNaNOrInfinity<E> {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final Object[] RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int write = 8;
    private static final valueOfHexLiteral IconCompatParcelizer = new valueOfHexLiteral(new Object[0]);

    public valueOfHexLiteral(Object[] objArr) {
        this.RemoteActionCompatParcelizer = objArr;
        createPowersOfTenFloor16Map.IconCompatParcelizer(objArr.length <= 32);
    }

    @Override // kotlin.setBigButtonText
    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer */
    public final int getWrite() {
        return this.RemoteActionCompatParcelizer.length;
    }

    private final Object[] write(int p0) {
        return new Object[p0];
    }

    @Override // kotlin.AbstractFloatValueParser
    public final AbstractFloatValueParser<E> write(E p0) {
        if (size() < 32) {
            Object[] objArrCopyOf = Arrays.copyOf(this.RemoteActionCompatParcelizer, size() + 1);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(objArrCopyOf, "");
            objArrCopyOf[size()] = p0;
            return new valueOfHexLiteral(objArrCopyOf);
        }
        return new parseDecFloatLiteral(this.RemoteActionCompatParcelizer, lookupHex.AudioAttributesCompatParcelizer(p0), size() + 1, 0);
    }

    @Override // kotlin.parseNaNOrInfinity, kotlin.AbstractFloatValueParser
    public final AbstractFloatValueParser<E> IconCompatParcelizer(Collection<? extends E> p0) {
        if (size() + p0.size() <= 32) {
            Object[] objArrCopyOf = Arrays.copyOf(this.RemoteActionCompatParcelizer, size() + p0.size());
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(objArrCopyOf, "");
            int size = size();
            Iterator<? extends E> it = p0.iterator();
            while (it.hasNext()) {
                objArrCopyOf[size] = it.next();
                size++;
            }
            return new valueOfHexLiteral(objArrCopyOf);
        }
        AbstractFloatValueParser.AudioAttributesCompatParcelizer<E> audioAttributesCompatParcelizerRemoteActionCompatParcelizer = RemoteActionCompatParcelizer();
        audioAttributesCompatParcelizerRemoteActionCompatParcelizer.addAll(p0);
        return audioAttributesCompatParcelizerRemoteActionCompatParcelizer.IconCompatParcelizer();
    }

    @Override // kotlin.AbstractFloatValueParser
    public final AbstractFloatValueParser<E> write(getAnswerMap<? super E, Boolean> p0) {
        Object[] objArrCopyOf = this.RemoteActionCompatParcelizer;
        int size = size();
        int size2 = size();
        boolean z = false;
        for (int i = 0; i < size2; i++) {
            Object obj = this.RemoteActionCompatParcelizer[i];
            if (p0.invoke(obj).booleanValue()) {
                if (!z) {
                    Object[] objArr = this.RemoteActionCompatParcelizer;
                    objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
                    toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(objArrCopyOf, "");
                    z = true;
                    size = i;
                }
            } else if (z) {
                objArrCopyOf[size] = obj;
                size++;
            }
        }
        if (size == size()) {
            return this;
        }
        if (size == 0) {
            return IconCompatParcelizer;
        }
        return new valueOfHexLiteral(getOrderDetails.IconCompatParcelizer(objArrCopyOf, 0, size));
    }

    @Override // kotlin.AbstractFloatValueParser
    public final AbstractFloatValueParser<E> read(int p0, E p1) {
        fillPowersOfNFloor16Recursive.IconCompatParcelizer(p0, size());
        if (p0 == size()) {
            return write(p1);
        }
        if (size() < 32) {
            Object[] objArrWrite = write(size() + 1);
            getOrderDetails.read(this.RemoteActionCompatParcelizer, objArrWrite, 0, p0, 6);
            getOrderDetails.RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer, objArrWrite, p0 + 1, p0, size());
            objArrWrite[p0] = p1;
            return new valueOfHexLiteral(objArrWrite);
        }
        Object[] objArr = this.RemoteActionCompatParcelizer;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(objArrCopyOf, "");
        getOrderDetails.RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer, objArrCopyOf, p0 + 1, p0, size() - 1);
        objArrCopyOf[p0] = p1;
        return new parseDecFloatLiteral(objArrCopyOf, lookupHex.AudioAttributesCompatParcelizer(this.RemoteActionCompatParcelizer[31]), size() + 1, 0);
    }

    @Override // kotlin.AbstractFloatValueParser
    public final AbstractFloatValueParser<E> IconCompatParcelizer(int p0) {
        fillPowersOfNFloor16Recursive.read(p0, size());
        if (size() == 1) {
            return IconCompatParcelizer;
        }
        Object[] objArrCopyOf = Arrays.copyOf(this.RemoteActionCompatParcelizer, size() - 1);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(objArrCopyOf, "");
        getOrderDetails.RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer, objArrCopyOf, p0, p0 + 1, size());
        return new valueOfHexLiteral(objArrCopyOf);
    }

    @Override // kotlin.AbstractFloatValueParser
    public final AbstractFloatValueParser.AudioAttributesCompatParcelizer<E> RemoteActionCompatParcelizer() {
        return new parseFloatingPointLiteral(this, null, this.RemoteActionCompatParcelizer, 0);
    }

    @Override // kotlin.setUrl, java.util.List
    public final int indexOf(Object p0) {
        return getOrderDetails.read(this.RemoteActionCompatParcelizer, p0);
    }

    @Override // kotlin.setUrl, java.util.List
    public final int lastIndexOf(Object p0) {
        return getOrderDetails.write(this.RemoteActionCompatParcelizer, p0);
    }

    @Override // kotlin.setUrl, java.util.List
    public final ListIterator<E> listIterator(int p0) {
        fillPowersOfNFloor16Recursive.IconCompatParcelizer(p0, size());
        return new AbstractJavaFloatingPointBitsFromCharSequence(this.RemoteActionCompatParcelizer, p0, size());
    }

    @Override // kotlin.setUrl, java.util.List
    public final E get(int p0) {
        fillPowersOfNFloor16Recursive.read(p0, size());
        return (E) this.RemoteActionCompatParcelizer[p0];
    }

    @Override // kotlin.AbstractFloatValueParser
    public final AbstractFloatValueParser<E> IconCompatParcelizer(int p0, E p1) {
        fillPowersOfNFloor16Recursive.read(p0, size());
        Object[] objArr = this.RemoteActionCompatParcelizer;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(objArrCopyOf, "");
        objArrCopyOf[p0] = p1;
        return new valueOfHexLiteral(objArrCopyOf);
    }

    /* JADX INFO: renamed from: o.valueOfHexLiteral$RemoteActionCompatParcelizer, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t"}, d2 = {"Lo/valueOfHexLiteral$RemoteActionCompatParcelizer;", "", "<init>", "()V", "Lo/valueOfHexLiteral;", "", "IconCompatParcelizer", "Lo/valueOfHexLiteral;", "read", "()Lo/valueOfHexLiteral;", "RemoteActionCompatParcelizer"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final valueOfHexLiteral read() {
            return valueOfHexLiteral.IconCompatParcelizer;
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }
}
