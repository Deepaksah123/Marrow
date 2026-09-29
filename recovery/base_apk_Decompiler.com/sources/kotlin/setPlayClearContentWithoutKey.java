package kotlin;

import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes2.dex */
public final class setPlayClearContentWithoutKey implements onShuffleModeEnabledChanged<ByteBuffer> {
    @Override // kotlin.onShuffleModeEnabledChanged
    public final /* synthetic */ boolean write(ByteBuffer byteBuffer, File file, r8lambda_r106e6zya8q8i_eKUnQWRolPk r8lambda_r106e6zya8q8i_ekunqwrolpk) {
        return AudioAttributesCompatParcelizer(byteBuffer, file);
    }

    private static boolean AudioAttributesCompatParcelizer(ByteBuffer byteBuffer, File file) throws Throwable {
        try {
            maybeReleaseChildSource.RemoteActionCompatParcelizer(byteBuffer, file);
            return true;
        } catch (IOException unused) {
            return false;
        }
    }
}
