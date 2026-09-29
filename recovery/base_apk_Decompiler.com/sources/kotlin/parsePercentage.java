package kotlin;

import com.marrow.data.models.video.PixelInfo;
import java.util.Arrays;
import kotlin.isWebvttHeaderLine;

/* JADX INFO: loaded from: classes3.dex */
public final class parsePercentage extends SubtitleInputBuffer<isWebvttHeaderLine.write, PixelInfo> implements isWebvttHeaderLine.AudioAttributesCompatParcelizer {
    private final int IconCompatParcelizer;
    private PixelInfo write;

    @setSdkPayload
    public parsePercentage(int i) {
        this.IconCompatParcelizer = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.SubtitleInputBuffer, kotlin.Cea608Decoder
    /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
    public void RemoteActionCompatParcelizer(isWebvttHeaderLine.write writeVar, int i) {
        toMagicModuleMetaRepoModel.write(writeVar, "");
        super.RemoteActionCompatParcelizer(writeVar, i);
        PixelInfo pixelInfo = ((PixelInfo[]) this.RemoteActionCompatParcelizer)[i];
        if (pixelInfo != null) {
            writeVar.write(pixelInfo.resolutionString);
            writeVar.read(pixelInfo.isSupported());
            int resolutionSize = pixelInfo.getResolutionSize(this.IconCompatParcelizer);
            if (resolutionSize > 1024) {
                toMagicModuleStatusUcModel tomagicmodulestatusucmodel = toMagicModuleStatusUcModel.INSTANCE;
                String str = String.format("%.2f GB", Arrays.copyOf(new Object[]{Float.valueOf(resolutionSize / 1024.0f)}, 1));
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(str, "");
                writeVar.RemoteActionCompatParcelizer(str);
            } else {
                toMagicModuleStatusUcModel tomagicmodulestatusucmodel2 = toMagicModuleStatusUcModel.INSTANCE;
                String str2 = String.format("%d MB/hour", Arrays.copyOf(new Object[]{Integer.valueOf(resolutionSize)}, 1));
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(str2, "");
                writeVar.RemoteActionCompatParcelizer(str2);
            }
            PixelInfo pixelInfo2 = this.write;
            if (pixelInfo2 != null && pixelInfo.getHeight() == pixelInfo2.getHeight() && pixelInfo.isSupported()) {
                writeVar.IconCompatParcelizer();
            } else {
                writeVar.AudioAttributesCompatParcelizer();
            }
        }
    }

    @Override // o.isWebvttHeaderLine.AudioAttributesCompatParcelizer
    public final void RemoteActionCompatParcelizer(PixelInfo pixelInfo) {
        toMagicModuleMetaRepoModel.write(pixelInfo, "");
        this.write = pixelInfo;
        IconCompatParcelizer();
    }
}
