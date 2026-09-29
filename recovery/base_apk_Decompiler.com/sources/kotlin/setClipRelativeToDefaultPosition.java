package kotlin;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.provider.MediaStore;
import com.bumptech.glide.Glide;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import kotlin.fromUri;

/* JADX INFO: loaded from: classes2.dex */
public final class setClipRelativeToDefaultPosition implements fromUri<InputStream> {
    private final Uri IconCompatParcelizer;
    private InputStream RemoteActionCompatParcelizer;
    private final setClipRelativeToLiveWindow read;

    @Override // kotlin.fromUri
    public final void AudioAttributesCompatParcelizer() {
    }

    public static setClipRelativeToDefaultPosition RemoteActionCompatParcelizer(Context context, Uri uri) {
        return RemoteActionCompatParcelizer(context, uri, new AudioAttributesCompatParcelizer(context.getContentResolver()));
    }

    public static setClipRelativeToDefaultPosition write(Context context, Uri uri) {
        return RemoteActionCompatParcelizer(context, uri, new write(context.getContentResolver()));
    }

    private static setClipRelativeToDefaultPosition RemoteActionCompatParcelizer(Context context, Uri uri, setClippingConfiguration setclippingconfiguration) {
        return new setClipRelativeToDefaultPosition(uri, new setClipRelativeToLiveWindow(Glide.read(context).AudioAttributesImplApi26Parcelizer().write(), setclippingconfiguration, Glide.read(context).write(), context.getContentResolver()));
    }

    private setClipRelativeToDefaultPosition(Uri uri, setClipRelativeToLiveWindow setcliprelativetolivewindow) {
        this.IconCompatParcelizer = uri;
        this.read = setcliprelativetolivewindow;
    }

    @Override // kotlin.fromUri
    public final void write(setSampleRate setsamplerate, fromUri.AudioAttributesCompatParcelizer<? super InputStream> audioAttributesCompatParcelizer) throws Throwable {
        try {
            InputStream inputStreamRemoteActionCompatParcelizer = RemoteActionCompatParcelizer();
            this.RemoteActionCompatParcelizer = inputStreamRemoteActionCompatParcelizer;
            audioAttributesCompatParcelizer.write(inputStreamRemoteActionCompatParcelizer);
        } catch (FileNotFoundException e) {
            audioAttributesCompatParcelizer.IconCompatParcelizer(e);
        }
    }

    private InputStream RemoteActionCompatParcelizer() throws Throwable {
        InputStream inputStreamRemoteActionCompatParcelizer = this.read.RemoteActionCompatParcelizer(this.IconCompatParcelizer);
        int iWrite = inputStreamRemoteActionCompatParcelizer != null ? this.read.write(this.IconCompatParcelizer) : -1;
        return iWrite != -1 ? new MediaItem1(inputStreamRemoteActionCompatParcelizer, iWrite) : inputStreamRemoteActionCompatParcelizer;
    }

    @Override // kotlin.fromUri
    public final void read() {
        InputStream inputStream = this.RemoteActionCompatParcelizer;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
    }

    @Override // kotlin.fromUri
    public final Class<InputStream> write() {
        return InputStream.class;
    }

    @Override // kotlin.fromUri
    public final onTracksChanged IconCompatParcelizer() {
        return onTracksChanged.LOCAL;
    }

    static class write implements setClippingConfiguration {
        private static final String[] write = {"_data"};
        private final ContentResolver IconCompatParcelizer;

        write(ContentResolver contentResolver) {
            this.IconCompatParcelizer = contentResolver;
        }

        @Override // kotlin.setClippingConfiguration
        public final Cursor AudioAttributesCompatParcelizer(Uri uri) {
            return this.IconCompatParcelizer.query(MediaStore.Video.Thumbnails.EXTERNAL_CONTENT_URI, write, "kind = 1 AND video_id = ?", new String[]{uri.getLastPathSegment()}, null);
        }
    }

    static class AudioAttributesCompatParcelizer implements setClippingConfiguration {
        private static final String[] read = {"_data"};
        private final ContentResolver IconCompatParcelizer;

        AudioAttributesCompatParcelizer(ContentResolver contentResolver) {
            this.IconCompatParcelizer = contentResolver;
        }

        @Override // kotlin.setClippingConfiguration
        public final Cursor AudioAttributesCompatParcelizer(Uri uri) {
            return this.IconCompatParcelizer.query(MediaStore.Images.Thumbnails.EXTERNAL_CONTENT_URI, read, "kind = 1 AND image_id = ?", new String[]{uri.getLastPathSegment()}, null);
        }
    }
}
