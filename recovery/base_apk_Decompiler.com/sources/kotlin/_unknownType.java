package kotlin;

import com.google.android.exoplayer2.C;
import java.io.FileNotFoundException;
import java.io.IOException;
import kotlin._deserializeWithNativeTypeId;
import kotlin._resolveSuperClass;
import kotlin.constructCollectionType;

/* JADX INFO: loaded from: classes2.dex */
public final class _unknownType implements _resolveSuperClass {
    private final int write;

    public _unknownType() {
        this((byte) 0);
    }

    private _unknownType(byte b) {
        this.write = -1;
    }

    @Override // kotlin._resolveSuperClass
    public final _resolveSuperClass.RemoteActionCompatParcelizer read(_resolveSuperClass.read readVar, _resolveSuperClass.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer) {
        if (!RemoteActionCompatParcelizer(audioAttributesCompatParcelizer.IconCompatParcelizer)) {
            return null;
        }
        if (readVar.write(1)) {
            return new _resolveSuperClass.RemoteActionCompatParcelizer(1, 300000L);
        }
        if (readVar.write(2)) {
            return new _resolveSuperClass.RemoteActionCompatParcelizer(2, 60000L);
        }
        return null;
    }

    @Override // kotlin._resolveSuperClass
    public final long write(_resolveSuperClass.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer) {
        IOException iOException = audioAttributesCompatParcelizer.IconCompatParcelizer;
        return ((iOException instanceof SchemaAware) || (iOException instanceof FileNotFoundException) || (iOException instanceof _deserializeWithNativeTypeId.IconCompatParcelizer) || (iOException instanceof constructCollectionType.AudioAttributesImplApi26Parcelizer) || idResolver.read(iOException)) ? C.TIME_UNSET : Math.min((audioAttributesCompatParcelizer.read - 1) * 1000, 5000);
    }

    @Override // kotlin._resolveSuperClass
    public final int write(int i) {
        int i2 = this.write;
        return i2 == -1 ? i == 7 ? 6 : 3 : i2;
    }

    private static boolean RemoteActionCompatParcelizer(IOException iOException) {
        if (!(iOException instanceof _deserializeWithNativeTypeId.write)) {
            return false;
        }
        _deserializeWithNativeTypeId.write writeVar = (_deserializeWithNativeTypeId.write) iOException;
        return writeVar.AudioAttributesImplApi26Parcelizer == 403 || writeVar.AudioAttributesImplApi26Parcelizer == 404 || writeVar.AudioAttributesImplApi26Parcelizer == 410 || writeVar.AudioAttributesImplApi26Parcelizer == 416 || writeVar.AudioAttributesImplApi26Parcelizer == 500 || writeVar.AudioAttributesImplApi26Parcelizer == 503;
    }
}
