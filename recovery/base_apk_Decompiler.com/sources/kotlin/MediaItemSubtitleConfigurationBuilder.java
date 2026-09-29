package kotlin;

import android.graphics.ColorSpace;
import android.graphics.ImageDecoder;
import android.util.Log;
import android.util.Size;

/* JADX INFO: loaded from: classes2.dex */
public final class MediaItemSubtitleConfigurationBuilder implements ImageDecoder.OnHeaderDecodedListener {
    private final boolean AudioAttributesCompatParcelizer;
    private final populateFromMetadata AudioAttributesImplApi26Parcelizer;
    private final int AudioAttributesImplBaseParcelizer;
    private final onTrackSelectionParametersChanged IconCompatParcelizer;
    private final setCompilation RemoteActionCompatParcelizer = setCompilation.read();
    private final HeartRating read;
    private final int write;

    public MediaItemSubtitleConfigurationBuilder(int i, int i2, r8lambda_r106e6zya8q8i_eKUnQWRolPk r8lambda_r106e6zya8q8i_ekunqwrolpk) {
        this.AudioAttributesImplBaseParcelizer = i;
        this.write = i2;
        this.IconCompatParcelizer = (onTrackSelectionParametersChanged) r8lambda_r106e6zya8q8i_ekunqwrolpk.IconCompatParcelizer(setAlbumTitle.IconCompatParcelizer);
        this.AudioAttributesImplApi26Parcelizer = (populateFromMetadata) r8lambda_r106e6zya8q8i_ekunqwrolpk.IconCompatParcelizer(populateFromMetadata.MediaBrowserCompatItemReceiver);
        this.AudioAttributesCompatParcelizer = r8lambda_r106e6zya8q8i_ekunqwrolpk.IconCompatParcelizer(setAlbumTitle.write) != null && ((Boolean) r8lambda_r106e6zya8q8i_ekunqwrolpk.IconCompatParcelizer(setAlbumTitle.write)).booleanValue();
        this.read = (HeartRating) r8lambda_r106e6zya8q8i_ekunqwrolpk.IconCompatParcelizer(setAlbumTitle.AudioAttributesCompatParcelizer);
    }

    @Override // android.graphics.ImageDecoder.OnHeaderDecodedListener
    public final void onHeaderDecoded(ImageDecoder imageDecoder, ImageDecoder.ImageInfo imageInfo, ImageDecoder.Source source) {
        if (this.RemoteActionCompatParcelizer.write(this.AudioAttributesImplBaseParcelizer, this.write, this.AudioAttributesCompatParcelizer, false)) {
            imageDecoder.setAllocator(3);
        } else {
            imageDecoder.setAllocator(1);
        }
        if (this.IconCompatParcelizer == onTrackSelectionParametersChanged.PREFER_RGB_565) {
            imageDecoder.setMemorySizePolicy(0);
        }
        imageDecoder.setOnPartialImageListener(new ImageDecoder.OnPartialImageListener() { // from class: o.MediaItemSubtitleConfigurationBuilder.4
            @Override // android.graphics.ImageDecoder.OnPartialImageListener
            public final boolean onPartialImage(ImageDecoder.DecodeException decodeException) {
                return false;
            }
        });
        Size size = imageInfo.getSize();
        int width = this.AudioAttributesImplBaseParcelizer;
        if (width == Integer.MIN_VALUE) {
            width = size.getWidth();
        }
        int height = this.write;
        if (height == Integer.MIN_VALUE) {
            height = size.getHeight();
        }
        float fWrite = this.AudioAttributesImplApi26Parcelizer.write(size.getWidth(), size.getHeight(), width, height);
        int iRound = Math.round(size.getWidth() * fWrite);
        int iRound2 = Math.round(size.getHeight() * fWrite);
        if (Log.isLoggable("ImageDecoder", 2)) {
            size.getWidth();
            size.getHeight();
        }
        imageDecoder.setTargetSize(iRound, iRound2);
        HeartRating heartRating = this.read;
        if (heartRating != null) {
            imageDecoder.setTargetColorSpace(ColorSpace.get((heartRating == HeartRating.DISPLAY_P3 && imageInfo.getColorSpace() != null && imageInfo.getColorSpace().isWideGamut()) ? ColorSpace.Named.DISPLAY_P3 : ColorSpace.Named.SRGB));
        }
    }
}
