package kotlin;

import android.graphics.Bitmap;
import java.io.IOException;
import java.io.InputStream;
import kotlin.setAlbumTitle;

/* JADX INFO: loaded from: classes2.dex */
public final class setRecordingDay implements IllegalSeekPositionException<InputStream, Bitmap> {
    private final setAlbumTitle IconCompatParcelizer;
    private final setSubtitleConfigurations RemoteActionCompatParcelizer;

    @Override // kotlin.IllegalSeekPositionException
    public final /* synthetic */ boolean RemoteActionCompatParcelizer(InputStream inputStream, r8lambda_r106e6zya8q8i_eKUnQWRolPk r8lambda_r106e6zya8q8i_ekunqwrolpk) throws IOException {
        return write();
    }

    public setRecordingDay(setAlbumTitle setalbumtitle, setSubtitleConfigurations setsubtitleconfigurations) {
        this.IconCompatParcelizer = setalbumtitle;
        this.RemoteActionCompatParcelizer = setsubtitleconfigurations;
    }

    private boolean write() {
        return setAlbumTitle.write();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.IllegalSeekPositionException
    /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
    public setMimeType<Bitmap> AudioAttributesCompatParcelizer(InputStream inputStream, int i, int i2, r8lambda_r106e6zya8q8i_eKUnQWRolPk r8lambda_r106e6zya8q8i_ekunqwrolpk) throws IOException {
        boolean z;
        setDisplayTitle setdisplaytitle;
        if (inputStream instanceof setDisplayTitle) {
            setdisplaytitle = (setDisplayTitle) inputStream;
            z = false;
        } else {
            z = true;
            setdisplaytitle = new setDisplayTitle(inputStream, this.RemoteActionCompatParcelizer);
        }
        getPeriodUid getperioduidWrite = getPeriodUid.write(setdisplaytitle);
        try {
            return this.IconCompatParcelizer.RemoteActionCompatParcelizer(new getShuffleOrder(getperioduidWrite), i, i2, r8lambda_r106e6zya8q8i_ekunqwrolpk, new RemoteActionCompatParcelizer(setdisplaytitle, getperioduidWrite));
        } finally {
            getperioduidWrite.RemoteActionCompatParcelizer();
            if (z) {
                setdisplaytitle.write();
            }
        }
    }

    static class RemoteActionCompatParcelizer implements setAlbumTitle.AudioAttributesCompatParcelizer {
        private final setDisplayTitle AudioAttributesCompatParcelizer;
        private final getPeriodUid write;

        RemoteActionCompatParcelizer(setDisplayTitle setdisplaytitle, getPeriodUid getperioduid) {
            this.AudioAttributesCompatParcelizer = setdisplaytitle;
            this.write = getperioduid;
        }

        @Override // o.setAlbumTitle.AudioAttributesCompatParcelizer
        public final void AudioAttributesCompatParcelizer() {
            this.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer();
        }

        @Override // o.setAlbumTitle.AudioAttributesCompatParcelizer
        public final void write(access3900 access3900Var, Bitmap bitmap) throws IOException {
            IOException iOExceptionWrite = this.write.write();
            if (iOExceptionWrite != null) {
                if (bitmap != null) {
                    access3900Var.write(bitmap);
                    throw iOExceptionWrite;
                }
                throw iOExceptionWrite;
            }
        }
    }
}
