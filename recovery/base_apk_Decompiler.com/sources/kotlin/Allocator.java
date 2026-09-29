package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u001d\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00040\r8\u0007¢\u0006\f\n\u0004\b\u0007\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010"}, d2 = {"Lo/Allocator;", "", "<init>", "()V", "Lo/allocate;", "p0", "", "AudioAttributesCompatParcelizer", "(Lo/allocate;)V", "Lo/ThemeState;", "IconCompatParcelizer", "Lo/ThemeState;", "write", "Lo/isDark;", "Lo/isDark;", "RemoteActionCompatParcelizer", "()Lo/isDark;", "read"}, k = 1, mv = {2, 2, 0}, xi = 48)
@getPlanOldPrice
public final class Allocator {
    private static int read = 1;
    private static int write;

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final isDark<allocate> read;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final ThemeState<allocate> write;

    public static /* synthetic */ Object IconCompatParcelizer(int i, int i2, int i3, int i4, int i5, Object[] objArr, int i6) {
        int i7 = ~i3;
        int i8 = ~i2;
        int i9 = ~(i7 | i8);
        int i10 = ~(i7 | i2);
        int i11 = ~i5;
        int i12 = (~(i8 | i11 | i3)) | i10;
        int i13 = (~(i2 | i11)) | (~(i7 | i11));
        int i14 = i3 + i5 + i + (1941422536 * i4) + ((-555707305) * i6);
        int i15 = i14 * i14;
        int i16 = (i3 * (-2131549542)) + 177471488 + ((-2131549542) * i5) + (i9 * (-207299225)) + (i12 * (-207299225)) + ((-207299225) * i13) + (1956118528 * i) + ((-1363148800) * i4) + (2141716480 * i6) + ((-573308928) * i15);
        int i17 = ((i3 * 487360618) - 1291405921) + (i5 * 487360618) + (i9 * 543) + (i12 * 543) + (i13 * 543) + (i * 487361161) + (i4 * (-1188264952)) + (i6 * 624576655) + (i15 * (-25952256));
        return i16 + ((i17 * i17) * 74186752) != 1 ? RemoteActionCompatParcelizer(objArr) : write(objArr);
    }

    @setSdkPayload
    public Allocator() {
        ThemeState<allocate> themeStateAudioAttributesCompatParcelizer = getThemeState.AudioAttributesCompatParcelizer(0, 16, setAddressLine2.AudioAttributesCompatParcelizer);
        this.write = themeStateAudioAttributesCompatParcelizer;
        this.read = VerifyNewNumberRequest.IconCompatParcelizer((ThemeState) themeStateAudioAttributesCompatParcelizer);
    }

    private static /* synthetic */ Object write(Object[] objArr) {
        Allocator allocator = (Allocator) objArr[0];
        int i = 2 % 2;
        int i2 = read;
        int i3 = (((i2 | 12) << 1) - (i2 ^ 12)) - 1;
        int i4 = i3 % 128;
        write = i4;
        int i5 = i3 % 2;
        isDark<allocate> isdark = allocator.read;
        int i6 = i4 | 13;
        int i7 = i6 << 1;
        int i8 = -((~(i4 & 13)) & i6);
        int i9 = (i7 ^ i8) + ((i8 & i7) << 1);
        read = i9 % 128;
        int i10 = i9 % 2;
        return isdark;
    }

    private static /* synthetic */ Object RemoteActionCompatParcelizer(Object[] objArr) {
        Allocator allocator = (Allocator) objArr[0];
        allocate allocateVar = (allocate) objArr[1];
        int i = 2 % 2;
        int i2 = read;
        int i3 = ((i2 | 2) << 1) - (i2 ^ 2);
        int i4 = (i3 ^ (-1)) + (i3 << 1);
        write = i4 % 128;
        Object obj = null;
        if (i4 % 2 != 0) {
            toMagicModuleMetaRepoModel.write(allocateVar, "");
            allocator.write.RemoteActionCompatParcelizer(allocateVar);
            obj.hashCode();
            throw null;
        }
        toMagicModuleMetaRepoModel.write(allocateVar, "");
        allocator.write.RemoteActionCompatParcelizer(allocateVar);
        int i5 = write;
        int i6 = i5 & 79;
        int i7 = ((i5 ^ 79) | i6) << 1;
        int i8 = -((i5 | 79) & (~i6));
        int i9 = ((i7 | i8) << 1) - (i8 ^ i7);
        read = i9 % 128;
        if (i9 % 2 != 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    public final void AudioAttributesCompatParcelizer(allocate p0) {
        int iIconCompatParcelizer = setScheme.IconCompatParcelizer();
        IconCompatParcelizer(setScheme.IconCompatParcelizer(), iIconCompatParcelizer, 1799461542, setScheme.IconCompatParcelizer(), -1799461542, new Object[]{this, p0}, setScheme.IconCompatParcelizer());
    }

    public final isDark<allocate> RemoteActionCompatParcelizer() {
        int iIconCompatParcelizer = setScheme.IconCompatParcelizer();
        return (isDark) IconCompatParcelizer(setScheme.IconCompatParcelizer(), iIconCompatParcelizer, 1850090459, setScheme.IconCompatParcelizer(), -1850090458, new Object[]{this}, setScheme.IconCompatParcelizer());
    }
}
