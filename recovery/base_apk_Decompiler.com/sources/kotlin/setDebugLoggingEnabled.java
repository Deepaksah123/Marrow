package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0017\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a'\u0010\b\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\b\u0010\t\u001a\u001f\u0010\u0002\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0002\u0010\n\"\u001a\u0010\u0002\u001a\u00020\u000b8\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u0002\u0010\u000e\"\u001a\u0010\f\u001a\u00020\u000b8\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u0002\u0010\r\u001a\u0004\b\b\u0010\u000e\" \u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\f\u0010\u0013"}, d2 = {"Lo/getReferencedType;", "p0", "read", "(J)J", "", "Lo/_properties;", "p1", "p2", "write", "(ZLo/_properties;Z)Z", "(Lo/_properties;Z)Z", "Lo/assignParameter;", "IconCompatParcelizer", "F", "()F", "Lo/MapperConfig;", "Lo/requestDelayedModelBuild;", "RemoteActionCompatParcelizer", "Lo/MapperConfig;", "()Lo/MapperConfig;", "AudioAttributesCompatParcelizer"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class setDebugLoggingEnabled {
    private static final float IconCompatParcelizer = assignParameter.IconCompatParcelizer(25.0f);
    private static final float read = assignParameter.IconCompatParcelizer(25.0f);
    private static final MapperConfig<requestDelayedModelBuild> RemoteActionCompatParcelizer = new MapperConfig<>("SelectionHandleInfo", (MagicModuleSubmissionRequestBody) null, 2, (MagicModuleRepositoryImplExternalSyntheticLambda0) null);

    public static final float read() {
        return IconCompatParcelizer;
    }

    public static final float write() {
        return read;
    }

    public static final MapperConfig<requestDelayedModelBuild> IconCompatParcelizer() {
        return RemoteActionCompatParcelizer;
    }

    public static final boolean write(boolean z, _properties _propertiesVar, boolean z2) {
        if (z) {
            return read(_propertiesVar, z2);
        }
        return !read(_propertiesVar, z2);
    }

    public static final boolean read(_properties _propertiesVar, boolean z) {
        if (_propertiesVar != _properties.RemoteActionCompatParcelizer || z) {
            return _propertiesVar == _properties.IconCompatParcelizer && z;
        }
        return true;
    }

    public static final long read(long j) {
        long j2 = -1;
        return getReferencedType.AudioAttributesCompatParcelizer((((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) j) - 1.0f)) & ((((long) 0) << 32) | (j2 - ((j2 >> 63) << 32)))) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j >> 32)))) << 32));
    }
}
