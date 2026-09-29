package kotlin;

import android.util.Pair;
import java.util.Arrays;
import kotlin.StdKeySerializers;

/* JADX INFO: loaded from: classes2.dex */
public abstract class unknownType extends _constructSimple {
    protected abstract Pair<buildIteratorSerializer[], _verifyAndResolvePlaceholders[]> read(write writeVar, int[][][] iArr, int[] iArr2) throws addNull;

    public static final class write {
        private final int[] AudioAttributesCompatParcelizer;
        private final int[] AudioAttributesImplBaseParcelizer;
        private final int IconCompatParcelizer;
        private final _writeAsBinary MediaBrowserCompatItemReceiver;
        private final String[] RemoteActionCompatParcelizer;
        private final _writeAsBinary[] read;
        private final int[][][] write;

        write(String[] strArr, int[] iArr, _writeAsBinary[] _writeasbinaryArr, int[] iArr2, int[][][] iArr3, _writeAsBinary _writeasbinary) {
            this.RemoteActionCompatParcelizer = strArr;
            this.AudioAttributesImplBaseParcelizer = iArr;
            this.read = _writeasbinaryArr;
            this.write = iArr3;
            this.AudioAttributesCompatParcelizer = iArr2;
            this.MediaBrowserCompatItemReceiver = _writeasbinary;
            this.IconCompatParcelizer = iArr.length;
        }

        public final int write() {
            return this.IconCompatParcelizer;
        }

        public final int read(int i) {
            return this.AudioAttributesImplBaseParcelizer[i];
        }

        public final _writeAsBinary write(int i) {
            return this.read[i];
        }

        private int RemoteActionCompatParcelizer(int i, int i2, int i3) {
            return this.write[i][i2][i3];
        }

        public final int AudioAttributesCompatParcelizer(int i, int i2, int i3) {
            return buildIterableSerializer.read(RemoteActionCompatParcelizer(i, i2, i3));
        }

        public final int AudioAttributesCompatParcelizer(int i, int i2) {
            int i3 = this.read[i].RemoteActionCompatParcelizer(i2).write;
            int[] iArr = new int[i3];
            int i4 = 0;
            for (int i5 = 0; i5 < i3; i5++) {
                if (AudioAttributesCompatParcelizer(i, i2, i5) == 4) {
                    iArr[i4] = i5;
                    i4++;
                }
            }
            return write(i, i2, Arrays.copyOf(iArr, i4));
        }

        private int write(int i, int i2, int[] iArr) {
            int i3 = 0;
            int iMin = 16;
            String str = null;
            boolean z = false;
            int i4 = 0;
            while (i3 < iArr.length) {
                String str2 = this.read[i].RemoteActionCompatParcelizer(i2).AudioAttributesCompatParcelizer(iArr[i3]).onPlayFromUri;
                if (i4 == 0) {
                    str = str2;
                } else {
                    z |= !LaissezFaireSubTypeValidator.read(str, str2);
                }
                iMin = Math.min(iMin, buildIterableSerializer.write(this.write[i][i2][i3]));
                i3++;
                i4++;
            }
            return z ? Math.min(iMin, this.AudioAttributesCompatParcelizer[i]) : iMin;
        }

        public final _writeAsBinary IconCompatParcelizer() {
            return this.MediaBrowserCompatItemReceiver;
        }
    }

    @Override // kotlin._constructSimple
    public final _findPrimitive RemoteActionCompatParcelizer(buildIterableSerializer[] builditerableserializerArr, _writeAsBinary _writeasbinary, StdKeySerializers.write writeVar, PolymorphicTypeValidator polymorphicTypeValidator) throws addNull {
        int[] iArrIconCompatParcelizer;
        int[] iArr = new int[builditerableserializerArr.length + 1];
        int length = builditerableserializerArr.length + 1;
        setName[][] setnameArr = new setName[length][];
        int[][][] iArr2 = new int[builditerableserializerArr.length + 1][][];
        for (int i = 0; i < length; i++) {
            setnameArr[i] = new setName[_writeasbinary.RemoteActionCompatParcelizer];
            iArr2[i] = new int[_writeasbinary.RemoteActionCompatParcelizer][];
        }
        int[] iArrAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(builditerableserializerArr);
        for (int i2 = 0; i2 < _writeasbinary.RemoteActionCompatParcelizer; i2++) {
            setName setnameRemoteActionCompatParcelizer = _writeasbinary.RemoteActionCompatParcelizer(i2);
            int iWrite = write(builditerableserializerArr, setnameRemoteActionCompatParcelizer, iArr, setnameRemoteActionCompatParcelizer.IconCompatParcelizer == 5);
            if (iWrite == builditerableserializerArr.length) {
                iArrIconCompatParcelizer = new int[setnameRemoteActionCompatParcelizer.write];
            } else {
                iArrIconCompatParcelizer = IconCompatParcelizer(builditerableserializerArr[iWrite], setnameRemoteActionCompatParcelizer);
            }
            int i3 = iArr[iWrite];
            setnameArr[iWrite][i3] = setnameRemoteActionCompatParcelizer;
            iArr2[iWrite][i3] = iArrIconCompatParcelizer;
            iArr[iWrite] = i3 + 1;
        }
        _writeAsBinary[] _writeasbinaryArr = new _writeAsBinary[builditerableserializerArr.length];
        String[] strArr = new String[builditerableserializerArr.length];
        int[] iArr3 = new int[builditerableserializerArr.length];
        for (int i4 = 0; i4 < builditerableserializerArr.length; i4++) {
            int i5 = iArr[i4];
            _writeasbinaryArr[i4] = new _writeAsBinary((setName[]) LaissezFaireSubTypeValidator.AudioAttributesCompatParcelizer(setnameArr[i4], i5));
            iArr2[i4] = (int[][]) LaissezFaireSubTypeValidator.AudioAttributesCompatParcelizer(iArr2[i4], i5);
            strArr[i4] = builditerableserializerArr[i4].onSeekTo();
            iArr3[i4] = builditerableserializerArr[i4].MediaBrowserCompatMediaItem();
        }
        write writeVar2 = new write(strArr, iArr3, _writeasbinaryArr, iArrAudioAttributesCompatParcelizer, iArr2, new _writeAsBinary((setName[]) LaissezFaireSubTypeValidator.AudioAttributesCompatParcelizer(setnameArr[builditerableserializerArr.length], iArr[builditerableserializerArr.length])));
        Pair<buildIteratorSerializer[], _verifyAndResolvePlaceholders[]> pair = read(writeVar2, iArr2, iArrAudioAttributesCompatParcelizer);
        return new _findPrimitive((buildIteratorSerializer[]) pair.first, (_verifyAndResolvePlaceholders[]) pair.second, _fromAny.AudioAttributesCompatParcelizer(writeVar2, (_referenceType[]) pair.second), writeVar2);
    }

    private static int write(buildIterableSerializer[] builditerableserializerArr, setName setname, int[] iArr, boolean z) throws addNull {
        int length = builditerableserializerArr.length;
        int i = 0;
        boolean z2 = true;
        for (int i2 = 0; i2 < builditerableserializerArr.length; i2++) {
            buildIterableSerializer builditerableserializer = builditerableserializerArr[i2];
            int iMax = 0;
            for (int i3 = 0; i3 < setname.write; i3++) {
                iMax = Math.max(iMax, buildIterableSerializer.read(builditerableserializer.read(setname.AudioAttributesCompatParcelizer(i3))));
            }
            boolean z3 = iArr[i2] == 0;
            if (iMax > i || (iMax == i && z && !z2 && z3)) {
                length = i2;
                z2 = z3;
                i = iMax;
            }
        }
        return length;
    }

    private static int[] IconCompatParcelizer(buildIterableSerializer builditerableserializer, setName setname) throws addNull {
        int[] iArr = new int[setname.write];
        for (int i = 0; i < setname.write; i++) {
            iArr[i] = builditerableserializer.read(setname.AudioAttributesCompatParcelizer(i));
        }
        return iArr;
    }

    private static int[] AudioAttributesCompatParcelizer(buildIterableSerializer[] builditerableserializerArr) throws addNull {
        int length = builditerableserializerArr.length;
        int[] iArr = new int[length];
        for (int i = 0; i < length; i++) {
            iArr[i] = builditerableserializerArr[i].onPlayFromSearch();
        }
        return iArr;
    }
}
