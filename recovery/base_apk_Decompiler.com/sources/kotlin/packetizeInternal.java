package kotlin;

import java.io.File;
import java.io.FileNotFoundException;

/* JADX INFO: loaded from: classes2.dex */
public final class packetizeInternal extends MagicModuleUseCase implements getCreatedOnDateMs {
    private /* synthetic */ getSkippedFrames read;
    private /* synthetic */ String write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public packetizeInternal(getSkippedFrames getskippedframes, String str) {
        super(0);
        this.read = getskippedframes;
        this.write = str;
    }

    @Override // kotlin.getCreatedOnDateMs
    public final Object invoke() {
        StringBuilder sb = new StringBuilder();
        String str = this.read.IconCompatParcelizer;
        toMagicModuleMetaRepoModel.write((Object) str);
        sb.append(str);
        sb.append('/');
        sb.append(this.write);
        File file = new File(sb.toString());
        return !file.exists() ? new codecNeedsDiscardChannelsWorkaround(new FileNotFoundException()) : new Ac4Util(downloadMagicModuleDetail.read(file));
    }
}
