package kotlin;

import kotlin.Metadata;
import kotlin.anyIgnorals;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
public final /* synthetic */ class ConfigOverride$RemoteActionCompatParcelizer$AudioAttributesCompatParcelizer$WhenMappings {
    public static final /* synthetic */ int[] write;

    static {
        int[] iArr = new int[anyIgnorals.read.values().length];
        try {
            iArr[anyIgnorals.read.ON_CREATE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[anyIgnorals.read.ON_START.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[anyIgnorals.read.ON_STOP.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[anyIgnorals.read.ON_DESTROY.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[anyIgnorals.read.ON_PAUSE.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[anyIgnorals.read.ON_RESUME.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[anyIgnorals.read.ON_ANY.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        write = iArr;
    }
}
