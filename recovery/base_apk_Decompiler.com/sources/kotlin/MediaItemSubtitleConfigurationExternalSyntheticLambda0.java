package kotlin;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Environment;
import android.os.ParcelFileDescriptor;
import android.provider.MediaStore;
import android.text.TextUtils;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStream;
import kotlin.MediaItemLocalConfigurationExternalSyntheticLambda0;
import kotlin.fromUri;

/* JADX INFO: loaded from: classes2.dex */
public final class MediaItemSubtitleConfigurationExternalSyntheticLambda0<DataT> implements MediaItemLocalConfigurationExternalSyntheticLambda0<Uri, DataT> {
    private final MediaItemLocalConfigurationExternalSyntheticLambda0<Uri, DataT> AudioAttributesCompatParcelizer;
    private final Class<DataT> IconCompatParcelizer;
    private final MediaItemLocalConfigurationExternalSyntheticLambda0<File, DataT> read;
    private final Context write;

    @Override // kotlin.MediaItemLocalConfigurationExternalSyntheticLambda0
    public final /* synthetic */ boolean read(Uri uri) {
        return RemoteActionCompatParcelizer(uri);
    }

    MediaItemSubtitleConfigurationExternalSyntheticLambda0(Context context, MediaItemLocalConfigurationExternalSyntheticLambda0<File, DataT> mediaItemLocalConfigurationExternalSyntheticLambda0, MediaItemLocalConfigurationExternalSyntheticLambda0<Uri, DataT> mediaItemLocalConfigurationExternalSyntheticLambda02, Class<DataT> cls) {
        this.write = context.getApplicationContext();
        this.read = mediaItemLocalConfigurationExternalSyntheticLambda0;
        this.AudioAttributesCompatParcelizer = mediaItemLocalConfigurationExternalSyntheticLambda02;
        this.IconCompatParcelizer = cls;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.MediaItemLocalConfigurationExternalSyntheticLambda0
    /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public MediaItemLocalConfigurationExternalSyntheticLambda0.RemoteActionCompatParcelizer<DataT> write(Uri uri, int i, int i2, r8lambda_r106e6zya8q8i_eKUnQWRolPk r8lambda_r106e6zya8q8i_ekunqwrolpk) {
        return new MediaItemLocalConfigurationExternalSyntheticLambda0.RemoteActionCompatParcelizer<>(new getWindowIndexForChildWindowIndex(uri), new write(this.write, this.read, this.AudioAttributesCompatParcelizer, uri, i, i2, r8lambda_r106e6zya8q8i_ekunqwrolpk, this.IconCompatParcelizer));
    }

    private static boolean RemoteActionCompatParcelizer(Uri uri) {
        return setClipEndPositionMs.IconCompatParcelizer(uri);
    }

    static final class write<DataT> implements fromUri<DataT> {
        private static final String[] AudioAttributesCompatParcelizer = {"_data"};
        private volatile boolean AudioAttributesImplApi21Parcelizer;
        private final int AudioAttributesImplApi26Parcelizer;
        private final Uri AudioAttributesImplBaseParcelizer;
        private final Context IconCompatParcelizer;
        private final MediaItemLocalConfigurationExternalSyntheticLambda0<Uri, DataT> MediaBrowserCompatCustomActionResultReceiver;
        private final r8lambda_r106e6zya8q8i_eKUnQWRolPk MediaBrowserCompatItemReceiver;
        private final int MediaBrowserCompatSearchResultReceiver;
        private volatile fromUri<DataT> RemoteActionCompatParcelizer;
        private final MediaItemLocalConfigurationExternalSyntheticLambda0<File, DataT> read;
        private final Class<DataT> write;

        write(Context context, MediaItemLocalConfigurationExternalSyntheticLambda0<File, DataT> mediaItemLocalConfigurationExternalSyntheticLambda0, MediaItemLocalConfigurationExternalSyntheticLambda0<Uri, DataT> mediaItemLocalConfigurationExternalSyntheticLambda02, Uri uri, int i, int i2, r8lambda_r106e6zya8q8i_eKUnQWRolPk r8lambda_r106e6zya8q8i_ekunqwrolpk, Class<DataT> cls) {
            this.IconCompatParcelizer = context.getApplicationContext();
            this.read = mediaItemLocalConfigurationExternalSyntheticLambda0;
            this.MediaBrowserCompatCustomActionResultReceiver = mediaItemLocalConfigurationExternalSyntheticLambda02;
            this.AudioAttributesImplBaseParcelizer = uri;
            this.MediaBrowserCompatSearchResultReceiver = i;
            this.AudioAttributesImplApi26Parcelizer = i2;
            this.MediaBrowserCompatItemReceiver = r8lambda_r106e6zya8q8i_ekunqwrolpk;
            this.write = cls;
        }

        @Override // kotlin.fromUri
        public final void write(setSampleRate setsamplerate, fromUri.AudioAttributesCompatParcelizer<? super DataT> audioAttributesCompatParcelizer) {
            try {
                fromUri<DataT> fromuriMediaBrowserCompatCustomActionResultReceiver = MediaBrowserCompatCustomActionResultReceiver();
                if (fromuriMediaBrowserCompatCustomActionResultReceiver == null) {
                    StringBuilder sb = new StringBuilder("Failed to build fetcher for: ");
                    sb.append(this.AudioAttributesImplBaseParcelizer);
                    audioAttributesCompatParcelizer.IconCompatParcelizer(new IllegalArgumentException(sb.toString()));
                } else {
                    this.RemoteActionCompatParcelizer = fromuriMediaBrowserCompatCustomActionResultReceiver;
                    if (this.AudioAttributesImplApi21Parcelizer) {
                        AudioAttributesCompatParcelizer();
                    } else {
                        fromuriMediaBrowserCompatCustomActionResultReceiver.write(setsamplerate, audioAttributesCompatParcelizer);
                    }
                }
            } catch (FileNotFoundException e) {
                audioAttributesCompatParcelizer.IconCompatParcelizer(e);
            }
        }

        private fromUri<DataT> MediaBrowserCompatCustomActionResultReceiver() throws FileNotFoundException {
            MediaItemLocalConfigurationExternalSyntheticLambda0.RemoteActionCompatParcelizer<DataT> RemoteActionCompatParcelizer = RemoteActionCompatParcelizer();
            if (RemoteActionCompatParcelizer != null) {
                return RemoteActionCompatParcelizer.RemoteActionCompatParcelizer;
            }
            return null;
        }

        private MediaItemLocalConfigurationExternalSyntheticLambda0.RemoteActionCompatParcelizer<DataT> RemoteActionCompatParcelizer() throws FileNotFoundException {
            if (Environment.isExternalStorageLegacy()) {
                return this.read.write(RemoteActionCompatParcelizer(this.AudioAttributesImplBaseParcelizer), this.MediaBrowserCompatSearchResultReceiver, this.AudioAttributesImplApi26Parcelizer, this.MediaBrowserCompatItemReceiver);
            }
            if (setClipEndPositionMs.AudioAttributesCompatParcelizer(this.AudioAttributesImplBaseParcelizer)) {
                return this.MediaBrowserCompatCustomActionResultReceiver.write(this.AudioAttributesImplBaseParcelizer, this.MediaBrowserCompatSearchResultReceiver, this.AudioAttributesImplApi26Parcelizer, this.MediaBrowserCompatItemReceiver);
            }
            return this.MediaBrowserCompatCustomActionResultReceiver.write(AudioAttributesImplApi21Parcelizer() ? MediaStore.setRequireOriginal(this.AudioAttributesImplBaseParcelizer) : this.AudioAttributesImplBaseParcelizer, this.MediaBrowserCompatSearchResultReceiver, this.AudioAttributesImplApi26Parcelizer, this.MediaBrowserCompatItemReceiver);
        }

        @Override // kotlin.fromUri
        public final void read() {
            fromUri<DataT> fromuri = this.RemoteActionCompatParcelizer;
            if (fromuri != null) {
                fromuri.read();
            }
        }

        @Override // kotlin.fromUri
        public final void AudioAttributesCompatParcelizer() {
            this.AudioAttributesImplApi21Parcelizer = true;
            fromUri<DataT> fromuri = this.RemoteActionCompatParcelizer;
            if (fromuri != null) {
                fromuri.AudioAttributesCompatParcelizer();
            }
        }

        @Override // kotlin.fromUri
        public final Class<DataT> write() {
            return this.write;
        }

        @Override // kotlin.fromUri
        public final onTracksChanged IconCompatParcelizer() {
            return onTracksChanged.LOCAL;
        }

        private File RemoteActionCompatParcelizer(Uri uri) throws FileNotFoundException {
            Cursor cursor = null;
            try {
                Cursor cursorQuery = this.IconCompatParcelizer.getContentResolver().query(uri, AudioAttributesCompatParcelizer, null, null, null);
                if (cursorQuery == null || !cursorQuery.moveToFirst()) {
                    StringBuilder sb = new StringBuilder("Failed to media store entry for: ");
                    sb.append(uri);
                    throw new FileNotFoundException(sb.toString());
                }
                String string = cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("_data"));
                if (TextUtils.isEmpty(string)) {
                    StringBuilder sb2 = new StringBuilder("File path was empty in media store for: ");
                    sb2.append(uri);
                    throw new FileNotFoundException(sb2.toString());
                }
                File file = new File(string);
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
                return file;
            } catch (Throwable th) {
                if (0 != 0) {
                    cursor.close();
                }
                throw th;
            }
        }

        private boolean AudioAttributesImplApi21Parcelizer() {
            return this.IconCompatParcelizer.checkSelfPermission("android.permission.ACCESS_MEDIA_LOCATION") == 0;
        }
    }

    public static final class read extends IconCompatParcelizer<InputStream> {
        public read(Context context) {
            super(context, InputStream.class);
        }
    }

    public static final class RemoteActionCompatParcelizer extends IconCompatParcelizer<ParcelFileDescriptor> {
        public RemoteActionCompatParcelizer(Context context) {
            super(context, ParcelFileDescriptor.class);
        }
    }

    static abstract class IconCompatParcelizer<DataT> implements setTargetOffsetMs<Uri, DataT> {
        private final Class<DataT> IconCompatParcelizer;
        private final Context write;

        @Override // kotlin.setTargetOffsetMs
        public final void read() {
        }

        IconCompatParcelizer(Context context, Class<DataT> cls) {
            this.write = context;
            this.IconCompatParcelizer = cls;
        }

        @Override // kotlin.setTargetOffsetMs
        public final MediaItemLocalConfigurationExternalSyntheticLambda0<Uri, DataT> write(MediaItemRequestMetadataExternalSyntheticLambda0 mediaItemRequestMetadataExternalSyntheticLambda0) {
            return new MediaItemSubtitleConfigurationExternalSyntheticLambda0(this.write, mediaItemRequestMetadataExternalSyntheticLambda0.IconCompatParcelizer(File.class, this.IconCompatParcelizer), mediaItemRequestMetadataExternalSyntheticLambda0.IconCompatParcelizer(Uri.class, this.IconCompatParcelizer), this.IconCompatParcelizer);
        }
    }
}
