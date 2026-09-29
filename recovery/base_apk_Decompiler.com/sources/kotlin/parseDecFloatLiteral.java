package kotlin;

import java.util.Arrays;
import java.util.ListIterator;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010*\n\u0002\b\b\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003B7\u0012\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004\u0012\u000e\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0006\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u000f\u0010\u0010JE\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00042\u000e\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00042\u000e\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004H\u0002¢\u0006\u0004\b\u0011\u0010\u0012JA\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00042\u0010\u0010\u0006\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\b2\u000e\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004H\u0002¢\u0006\u0004\b\r\u0010\u0013J%\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\r\u0010\u0014J7\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00042\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\u0005H\u0002¢\u0006\u0004\b\u0011\u0010\u0015JI\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00042\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00042\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u001d\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0006\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ=\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00042\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0002¢\u0006\u0004\b\r\u0010\u001cJ5\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00042\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0011\u0010\u001dJA\u0010\u0018\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u00042\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00042\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0018\u0010\u001eJ?\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00042\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00042\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0011\u0010\u001eJ)\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020 0\u001fH\u0016¢\u0006\u0004\b\u000f\u0010!J\u0015\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\"H\u0016¢\u0006\u0004\b\u000f\u0010#J\u001d\u0010%\u001a\b\u0012\u0004\u0012\u00028\u00000$2\u0006\u0010\u0006\u001a\u00020\bH\u0016¢\u0006\u0004\b%\u0010&J\u001f\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00042\u0006\u0010\u0006\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0018\u0010'J\u0018\u0010(\u001a\u00028\u00002\u0006\u0010\u0006\u001a\u00020\bH\u0096\u0002¢\u0006\u0004\b(\u0010)J%\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u001a\u0010\u0014JA\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00042\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00042\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\u0005H\u0002¢\u0006\u0004\b\u0011\u0010*R\u001c\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010+R\u001c\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010+R\u001a\u0010\u000f\u001a\u00020\b8\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010,\u001a\u0004\b\u0018\u0010\u000eR\u0014\u0010\u001a\u001a\u00020\b8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010,"}, d2 = {"Lo/parseDecFloatLiteral;", "E", "Lo/AbstractFloatValueParser;", "Lo/parseNaNOrInfinity;", "", "", "p0", "p1", "", "p2", "p3", "<init>", "([Ljava/lang/Object;[Ljava/lang/Object;II)V", "read", "()I", "write", "(Ljava/lang/Object;)Lo/AbstractFloatValueParser;", "RemoteActionCompatParcelizer", "([Ljava/lang/Object;[Ljava/lang/Object;[Ljava/lang/Object;)Lo/parseDecFloatLiteral;", "([Ljava/lang/Object;I[Ljava/lang/Object;)[Ljava/lang/Object;", "(ILjava/lang/Object;)Lo/AbstractFloatValueParser;", "([Ljava/lang/Object;ILjava/lang/Object;)Lo/parseDecFloatLiteral;", "Lo/AbstractJavaFloatingPointBitsFromCharArray;", "p4", "AudioAttributesCompatParcelizer", "([Ljava/lang/Object;IILjava/lang/Object;Lo/AbstractJavaFloatingPointBitsFromCharArray;)[Ljava/lang/Object;", "IconCompatParcelizer", "(I)Lo/AbstractFloatValueParser;", "([Ljava/lang/Object;III)Lo/AbstractFloatValueParser;", "([Ljava/lang/Object;II)Lo/AbstractFloatValueParser;", "([Ljava/lang/Object;IILo/AbstractJavaFloatingPointBitsFromCharArray;)[Ljava/lang/Object;", "Lkotlin/Function1;", "", "(Lo/getAnswerMap;)Lo/AbstractFloatValueParser;", "Lo/parseFloatingPointLiteral;", "()Lo/parseFloatingPointLiteral;", "", "listIterator", "(I)Ljava/util/ListIterator;", "(I)[Ljava/lang/Object;", "get", "(I)Ljava/lang/Object;", "([Ljava/lang/Object;IILjava/lang/Object;)[Ljava/lang/Object;", "[Ljava/lang/Object;", "I"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class parseDecFloatLiteral<E> extends parseNaNOrInfinity<E> {
    private final Object[] AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final int write;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final Object[] RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final int IconCompatParcelizer;

    public parseDecFloatLiteral(Object[] objArr, Object[] objArr2, int i, int i2) {
        this.AudioAttributesCompatParcelizer = objArr;
        this.RemoteActionCompatParcelizer = objArr2;
        this.write = i;
        this.IconCompatParcelizer = i2;
        if (size() <= 32) {
            StringBuilder sb = new StringBuilder("Trie-based persistent vector should have at least 33 elements, got ");
            sb.append(size());
            getInputCodeUtf8JsNames.write(sb.toString());
        }
        createPowersOfTenFloor16Map.IconCompatParcelizer(size() - lookupHex.IconCompatParcelizer(size()) <= getQues.RemoteActionCompatParcelizer(objArr2.length, 32));
    }

    @Override // kotlin.setBigButtonText
    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from getter */
    public final int getWrite() {
        return this.write;
    }

    private final int read() {
        return lookupHex.IconCompatParcelizer(size());
    }

    @Override // kotlin.AbstractFloatValueParser
    public final AbstractFloatValueParser<E> write(E p0) {
        int size = size() - read();
        if (size < 32) {
            Object[] objArrCopyOf = Arrays.copyOf(this.RemoteActionCompatParcelizer, 32);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(objArrCopyOf, "");
            objArrCopyOf[size] = p0;
            return new parseDecFloatLiteral(this.AudioAttributesCompatParcelizer, objArrCopyOf, size() + 1, this.IconCompatParcelizer);
        }
        return RemoteActionCompatParcelizer(this.AudioAttributesCompatParcelizer, this.RemoteActionCompatParcelizer, lookupHex.AudioAttributesCompatParcelizer(p0));
    }

    private final parseDecFloatLiteral<E> RemoteActionCompatParcelizer(Object[] p0, Object[] p1, Object[] p2) {
        int size = size();
        int i = this.IconCompatParcelizer;
        if ((size >> 5) > (1 << i)) {
            Object[] objArrAudioAttributesCompatParcelizer = lookupHex.AudioAttributesCompatParcelizer(p0);
            int i2 = this.IconCompatParcelizer + 5;
            return new parseDecFloatLiteral<>(read(objArrAudioAttributesCompatParcelizer, i2, p1), p2, size() + 1, i2);
        }
        return new parseDecFloatLiteral<>(read(p0, i, p1), p2, size() + 1, this.IconCompatParcelizer);
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.Object[] read(java.lang.Object[] r4, int r5, java.lang.Object[] r6) {
        /*
            r3 = this;
            int r0 = r3.size()
            int r0 = r0 + (-1)
            int r0 = kotlin.lookupHex.write(r0, r5)
            r1 = 32
            if (r4 == 0) goto L19
            java.lang.Object[] r4 = java.util.Arrays.copyOf(r4, r1)
            java.lang.String r2 = ""
            kotlin.toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(r4, r2)
            if (r4 != 0) goto L1b
        L19:
            java.lang.Object[] r4 = new java.lang.Object[r1]
        L1b:
            r1 = 5
            if (r5 != r1) goto L21
            r4[r0] = r6
            return r4
        L21:
            r2 = r4[r0]
            java.lang.Object[] r2 = (java.lang.Object[]) r2
            int r5 = r5 - r1
            java.lang.Object[] r3 = r3.read(r2, r5, r6)
            r4[r0] = r3
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.parseDecFloatLiteral.read(java.lang.Object[], int, java.lang.Object[]):java.lang.Object[]");
    }

    @Override // kotlin.AbstractFloatValueParser
    public final AbstractFloatValueParser<E> read(int p0, E p1) {
        fillPowersOfNFloor16Recursive.IconCompatParcelizer(p0, size());
        if (p0 == size()) {
            return write(p1);
        }
        int i = read();
        if (p0 >= i) {
            return RemoteActionCompatParcelizer(this.AudioAttributesCompatParcelizer, p0 - i, p1);
        }
        AbstractJavaFloatingPointBitsFromCharArray abstractJavaFloatingPointBitsFromCharArray = new AbstractJavaFloatingPointBitsFromCharArray(null);
        return RemoteActionCompatParcelizer(AudioAttributesCompatParcelizer(this.AudioAttributesCompatParcelizer, this.IconCompatParcelizer, p0, p1, abstractJavaFloatingPointBitsFromCharArray), 0, abstractJavaFloatingPointBitsFromCharArray.getAudioAttributesCompatParcelizer());
    }

    private final parseDecFloatLiteral<E> RemoteActionCompatParcelizer(Object[] p0, int p1, Object p2) {
        int size = size() - read();
        Object[] objArrCopyOf = Arrays.copyOf(this.RemoteActionCompatParcelizer, 32);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(objArrCopyOf, "");
        if (size < 32) {
            getOrderDetails.RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer, objArrCopyOf, p1 + 1, p1, size);
            objArrCopyOf[p1] = p2;
            return new parseDecFloatLiteral<>(p0, objArrCopyOf, size() + 1, this.IconCompatParcelizer);
        }
        Object[] objArr = this.RemoteActionCompatParcelizer;
        Object obj = objArr[31];
        getOrderDetails.RemoteActionCompatParcelizer(objArr, objArrCopyOf, p1 + 1, p1, size - 1);
        objArrCopyOf[p1] = p2;
        return RemoteActionCompatParcelizer(p0, objArrCopyOf, lookupHex.AudioAttributesCompatParcelizer(obj));
    }

    private final Object[] AudioAttributesCompatParcelizer(Object[] p0, int p1, int p2, Object p3, AbstractJavaFloatingPointBitsFromCharArray p4) {
        Object[] objArrCopyOf;
        int iWrite = lookupHex.write(p2, p1);
        if (p1 == 0) {
            if (iWrite != 0) {
                objArrCopyOf = Arrays.copyOf(p0, 32);
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(objArrCopyOf, "");
            } else {
                objArrCopyOf = new Object[32];
            }
            getOrderDetails.RemoteActionCompatParcelizer(p0, objArrCopyOf, iWrite + 1, iWrite, 31);
            p4.AudioAttributesCompatParcelizer(p0[31]);
            objArrCopyOf[iWrite] = p3;
            return objArrCopyOf;
        }
        Object[] objArrCopyOf2 = Arrays.copyOf(p0, 32);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(objArrCopyOf2, "");
        int i = p1 - 5;
        Object obj = p0[iWrite];
        toMagicModuleMetaRepoModel.read(obj, "");
        objArrCopyOf2[iWrite] = AudioAttributesCompatParcelizer((Object[]) obj, i, p2, p3, p4);
        while (true) {
            iWrite++;
            if (iWrite >= 32 || objArrCopyOf2[iWrite] == null) {
                break;
            }
            Object obj2 = p0[iWrite];
            toMagicModuleMetaRepoModel.read(obj2, "");
            objArrCopyOf2[iWrite] = AudioAttributesCompatParcelizer((Object[]) obj2, i, 0, p4.getAudioAttributesCompatParcelizer(), p4);
        }
        return objArrCopyOf2;
    }

    @Override // kotlin.AbstractFloatValueParser
    public final AbstractFloatValueParser<E> IconCompatParcelizer(int p0) {
        fillPowersOfNFloor16Recursive.read(p0, size());
        int i = read();
        if (p0 >= i) {
            return read(this.AudioAttributesCompatParcelizer, i, this.IconCompatParcelizer, p0 - i);
        }
        return read(RemoteActionCompatParcelizer(this.AudioAttributesCompatParcelizer, this.IconCompatParcelizer, p0, new AbstractJavaFloatingPointBitsFromCharArray(this.RemoteActionCompatParcelizer[0])), i, this.IconCompatParcelizer, 0);
    }

    private final AbstractFloatValueParser<E> read(Object[] p0, int p1, int p2, int p3) {
        int size = size() - p1;
        createPowersOfTenFloor16Map.IconCompatParcelizer(p3 < size);
        if (size == 1) {
            return RemoteActionCompatParcelizer(p0, p1, p2);
        }
        Object[] objArrCopyOf = Arrays.copyOf(this.RemoteActionCompatParcelizer, 32);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(objArrCopyOf, "");
        int i = size - 1;
        if (p3 < i) {
            getOrderDetails.RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer, objArrCopyOf, p3, p3 + 1, size);
        }
        objArrCopyOf[i] = null;
        return new parseDecFloatLiteral(p0, objArrCopyOf, (p1 + size) - 1, p2);
    }

    private final AbstractFloatValueParser<E> RemoteActionCompatParcelizer(Object[] p0, int p1, int p2) {
        if (p2 == 0) {
            if (p0.length == 33) {
                p0 = Arrays.copyOf(p0, 32);
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(p0, "");
            }
            return new valueOfHexLiteral(p0);
        }
        AbstractJavaFloatingPointBitsFromCharArray abstractJavaFloatingPointBitsFromCharArray = new AbstractJavaFloatingPointBitsFromCharArray(null);
        Object[] objArrAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(p0, p2, p1 - 1, abstractJavaFloatingPointBitsFromCharArray);
        toMagicModuleMetaRepoModel.write(objArrAudioAttributesCompatParcelizer);
        Object audioAttributesCompatParcelizer = abstractJavaFloatingPointBitsFromCharArray.getAudioAttributesCompatParcelizer();
        toMagicModuleMetaRepoModel.read(audioAttributesCompatParcelizer, "");
        Object[] objArr = (Object[]) audioAttributesCompatParcelizer;
        if (objArrAudioAttributesCompatParcelizer[1] == null) {
            Object obj = objArrAudioAttributesCompatParcelizer[0];
            toMagicModuleMetaRepoModel.read(obj, "");
            return new parseDecFloatLiteral((Object[]) obj, objArr, p1, p2 - 5);
        }
        return new parseDecFloatLiteral(objArrAudioAttributesCompatParcelizer, objArr, p1, p2);
    }

    private final Object[] AudioAttributesCompatParcelizer(Object[] p0, int p1, int p2, AbstractJavaFloatingPointBitsFromCharArray p3) {
        Object[] objArrAudioAttributesCompatParcelizer;
        int iWrite = lookupHex.write(p2, p1);
        if (p1 == 5) {
            p3.AudioAttributesCompatParcelizer(p0[iWrite]);
            objArrAudioAttributesCompatParcelizer = null;
        } else {
            Object obj = p0[iWrite];
            toMagicModuleMetaRepoModel.read(obj, "");
            objArrAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer((Object[]) obj, p1 - 5, p2, p3);
        }
        if (objArrAudioAttributesCompatParcelizer == null && iWrite == 0) {
            return null;
        }
        Object[] objArrCopyOf = Arrays.copyOf(p0, 32);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(objArrCopyOf, "");
        objArrCopyOf[iWrite] = objArrAudioAttributesCompatParcelizer;
        return objArrCopyOf;
    }

    private final Object[] RemoteActionCompatParcelizer(Object[] p0, int p1, int p2, AbstractJavaFloatingPointBitsFromCharArray p3) {
        Object[] objArrCopyOf;
        int iWrite = lookupHex.write(p2, p1);
        if (p1 == 0) {
            if (iWrite != 0) {
                objArrCopyOf = Arrays.copyOf(p0, 32);
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(objArrCopyOf, "");
            } else {
                objArrCopyOf = new Object[32];
            }
            getOrderDetails.RemoteActionCompatParcelizer(p0, objArrCopyOf, iWrite, iWrite + 1, 32);
            objArrCopyOf[31] = p3.getAudioAttributesCompatParcelizer();
            p3.AudioAttributesCompatParcelizer(p0[iWrite]);
            return objArrCopyOf;
        }
        int iWrite2 = p0[31] == null ? lookupHex.write(read() - 1, p1) : 31;
        Object[] objArrCopyOf2 = Arrays.copyOf(p0, 32);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(objArrCopyOf2, "");
        int i = p1 - 5;
        int i2 = iWrite + 1;
        if (i2 <= iWrite2) {
            while (true) {
                Object obj = objArrCopyOf2[iWrite2];
                toMagicModuleMetaRepoModel.read(obj, "");
                objArrCopyOf2[iWrite2] = RemoteActionCompatParcelizer((Object[]) obj, i, 0, p3);
                if (iWrite2 == i2) {
                    break;
                }
                iWrite2--;
            }
        }
        Object obj2 = objArrCopyOf2[iWrite];
        toMagicModuleMetaRepoModel.read(obj2, "");
        objArrCopyOf2[iWrite] = RemoteActionCompatParcelizer((Object[]) obj2, i, p2, p3);
        return objArrCopyOf2;
    }

    @Override // kotlin.AbstractFloatValueParser
    public final AbstractFloatValueParser<E> write(getAnswerMap<? super E, Boolean> p0) {
        parseFloatingPointLiteral<E> parsefloatingpointliteralRemoteActionCompatParcelizer = RemoteActionCompatParcelizer();
        parsefloatingpointliteralRemoteActionCompatParcelizer.IconCompatParcelizer(p0);
        return parsefloatingpointliteralRemoteActionCompatParcelizer.IconCompatParcelizer();
    }

    @Override // kotlin.AbstractFloatValueParser
    /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
    public final parseFloatingPointLiteral<E> RemoteActionCompatParcelizer() {
        return new parseFloatingPointLiteral<>(this, this.AudioAttributesCompatParcelizer, this.RemoteActionCompatParcelizer, this.IconCompatParcelizer);
    }

    @Override // kotlin.setUrl, java.util.List
    public final ListIterator<E> listIterator(int p0) {
        fillPowersOfNFloor16Recursive.IconCompatParcelizer(p0, size());
        return new skipWhitespace(this.AudioAttributesCompatParcelizer, this.RemoteActionCompatParcelizer, p0, size(), (this.IconCompatParcelizer / 5) + 1);
    }

    private final Object[] AudioAttributesCompatParcelizer(int p0) {
        if (read() <= p0) {
            return this.RemoteActionCompatParcelizer;
        }
        Object[] objArr = this.AudioAttributesCompatParcelizer;
        for (int i = this.IconCompatParcelizer; i > 0; i -= 5) {
            Object[] objArr2 = objArr[lookupHex.write(p0, i)];
            toMagicModuleMetaRepoModel.read(objArr2, "");
            objArr = objArr2;
        }
        return objArr;
    }

    @Override // kotlin.setUrl, java.util.List
    public final E get(int p0) {
        fillPowersOfNFloor16Recursive.read(p0, size());
        return (E) AudioAttributesCompatParcelizer(p0)[p0 & 31];
    }

    @Override // kotlin.AbstractFloatValueParser
    public final AbstractFloatValueParser<E> IconCompatParcelizer(int p0, E p1) {
        fillPowersOfNFloor16Recursive.read(p0, size());
        if (read() <= p0) {
            Object[] objArrCopyOf = Arrays.copyOf(this.RemoteActionCompatParcelizer, 32);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(objArrCopyOf, "");
            objArrCopyOf[p0 & 31] = p1;
            return new parseDecFloatLiteral(this.AudioAttributesCompatParcelizer, objArrCopyOf, size(), this.IconCompatParcelizer);
        }
        return new parseDecFloatLiteral(RemoteActionCompatParcelizer(this.AudioAttributesCompatParcelizer, this.IconCompatParcelizer, p0, p1), this.RemoteActionCompatParcelizer, size(), this.IconCompatParcelizer);
    }

    private final Object[] RemoteActionCompatParcelizer(Object[] p0, int p1, int p2, Object p3) {
        int iWrite = lookupHex.write(p2, p1);
        Object[] objArrCopyOf = Arrays.copyOf(p0, 32);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(objArrCopyOf, "");
        if (p1 == 0) {
            objArrCopyOf[iWrite] = p3;
            return objArrCopyOf;
        }
        Object obj = objArrCopyOf[iWrite];
        toMagicModuleMetaRepoModel.read(obj, "");
        objArrCopyOf[iWrite] = RemoteActionCompatParcelizer((Object[]) obj, p1 - 5, p2, p3);
        return objArrCopyOf;
    }
}
