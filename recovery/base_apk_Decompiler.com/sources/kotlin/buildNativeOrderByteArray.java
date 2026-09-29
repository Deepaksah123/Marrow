package kotlin;

import java.io.File;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class buildNativeOrderByteArray extends MagicModuleUseCase implements getCreatedOnDateMs {
    private /* synthetic */ byte[] AudioAttributesCompatParcelizer;
    private /* synthetic */ String read;
    private /* synthetic */ getSkippedFrames write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public buildNativeOrderByteArray(getSkippedFrames getskippedframes, String str, byte[] bArr) {
        super(0);
        this.write = getskippedframes;
        this.read = str;
        this.AudioAttributesCompatParcelizer = bArr;
    }

    @Override // kotlin.getCreatedOnDateMs
    public final Object invoke() throws IOException {
        String str = this.write.IconCompatParcelizer;
        toMagicModuleMetaRepoModel.write((Object) str);
        File file = new File(str);
        if (!file.exists()) {
            file.mkdirs();
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this.write.IconCompatParcelizer);
        sb.append('/');
        sb.append(this.read);
        File file2 = new File(sb.toString());
        if (!file2.exists()) {
            file2.createNewFile();
        }
        downloadMagicModuleDetail.read(file2, this.AudioAttributesCompatParcelizer);
        return getShowPopup.INSTANCE;
    }
}
