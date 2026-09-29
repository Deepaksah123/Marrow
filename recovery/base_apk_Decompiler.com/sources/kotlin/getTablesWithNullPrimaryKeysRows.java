package kotlin;

import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0002\u0018\u0000 \u001a2\u00020\u00012\u00020\u0002:\u0001\u001aB\u001b\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\bH\u0016¢\u0006\u0004\b\u000b\u0010\nJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u0004\u001a\u0004\u0018\u00010\u000fH\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0016\u0010\u000eR\u0016\u0010\u0017\u001a\u0004\u0018\u00010\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0016\u0010\u0019\u001a\u0004\u0018\u00010\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0018"}, d2 = {"Lo/getTablesWithNullPrimaryKeysRows;", "Ljava/lang/reflect/WildcardType;", "Lo/flushData;", "Ljava/lang/reflect/Type;", "p0", "p1", "<init>", "(Ljava/lang/reflect/Type;Ljava/lang/reflect/Type;)V", "", "getUpperBounds", "()[Ljava/lang/reflect/Type;", "getLowerBounds", "", "getTypeName", "()Ljava/lang/String;", "", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "AudioAttributesCompatParcelizer", "Ljava/lang/reflect/Type;", "read", "IconCompatParcelizer"}, k = 1, mv = {2, 2, 0}, xi = 48)
final class getTablesWithNullPrimaryKeysRows implements WildcardType, flushData {

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final getTablesWithNullPrimaryKeysRows write = new getTablesWithNullPrimaryKeysRows(null, null);
    private final Type AudioAttributesCompatParcelizer;
    private final Type read;

    public getTablesWithNullPrimaryKeysRows(Type type, Type type2) {
        this.AudioAttributesCompatParcelizer = type;
        this.read = type2;
    }

    @Override // java.lang.reflect.WildcardType
    public final Type[] getUpperBounds() {
        Type[] typeArr = new Type[1];
        Class cls = this.AudioAttributesCompatParcelizer;
        if (cls == null) {
        }
        typeArr[0] = cls;
        return typeArr;
    }

    @Override // java.lang.reflect.WildcardType
    public final Type[] getLowerBounds() {
        Type type = this.read;
        return type == null ? new Type[0] : new Type[]{type};
    }

    @Override // java.lang.reflect.Type
    public final String getTypeName() {
        if (this.read != null) {
            StringBuilder sb = new StringBuilder("? super ");
            sb.append(deleteTablesForEditionSwitch.RemoteActionCompatParcelizer(this.read));
            return sb.toString();
        }
        Type type = this.AudioAttributesCompatParcelizer;
        if (type != null && !toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(type, Object.class)) {
            StringBuilder sb2 = new StringBuilder("? extends ");
            sb2.append(deleteTablesForEditionSwitch.RemoteActionCompatParcelizer(this.AudioAttributesCompatParcelizer));
            return sb2.toString();
        }
        return "?";
    }

    public final boolean equals(Object p0) {
        if (!(p0 instanceof WildcardType)) {
            return false;
        }
        WildcardType wildcardType = (WildcardType) p0;
        return Arrays.equals(getUpperBounds(), wildcardType.getUpperBounds()) && Arrays.equals(getLowerBounds(), wildcardType.getLowerBounds());
    }

    public final int hashCode() {
        return Arrays.hashCode(getLowerBounds()) ^ Arrays.hashCode(getUpperBounds());
    }

    public final String toString() {
        return getTypeName();
    }

    /* JADX INFO: renamed from: o.getTablesWithNullPrimaryKeysRows$IconCompatParcelizer, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0005\u0010\u0007"}, d2 = {"Lo/getTablesWithNullPrimaryKeysRows$IconCompatParcelizer;", "", "<init>", "()V", "Lo/getTablesWithNullPrimaryKeysRows;", "write", "Lo/getTablesWithNullPrimaryKeysRows;", "()Lo/getTablesWithNullPrimaryKeysRows;"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static getTablesWithNullPrimaryKeysRows write() {
            return getTablesWithNullPrimaryKeysRows.write;
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }
}
