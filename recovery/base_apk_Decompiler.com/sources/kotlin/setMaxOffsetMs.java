package kotlin;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import java.io.File;
import java.io.FileNotFoundException;
import kotlin.MediaItemLocalConfigurationExternalSyntheticLambda0;
import kotlin.fromUri;

/* JADX INFO: loaded from: classes2.dex */
public final class setMaxOffsetMs implements MediaItemLocalConfigurationExternalSyntheticLambda0<Uri, File> {
    private final Context AudioAttributesCompatParcelizer;

    @Override // kotlin.MediaItemLocalConfigurationExternalSyntheticLambda0
    public final /* synthetic */ boolean read(Uri uri) {
        return AudioAttributesCompatParcelizer(uri);
    }

    @Override // kotlin.MediaItemLocalConfigurationExternalSyntheticLambda0
    public final /* synthetic */ MediaItemLocalConfigurationExternalSyntheticLambda0.RemoteActionCompatParcelizer<File> write(Uri uri, int i, int i2, r8lambda_r106e6zya8q8i_eKUnQWRolPk r8lambda_r106e6zya8q8i_ekunqwrolpk) {
        return IconCompatParcelizer(uri);
    }

    public setMaxOffsetMs(Context context) {
        this.AudioAttributesCompatParcelizer = context;
    }

    private MediaItemLocalConfigurationExternalSyntheticLambda0.RemoteActionCompatParcelizer<File> IconCompatParcelizer(Uri uri) {
        return new MediaItemLocalConfigurationExternalSyntheticLambda0.RemoteActionCompatParcelizer<>(new getWindowIndexForChildWindowIndex(uri), new write(this.AudioAttributesCompatParcelizer, uri));
    }

    private static boolean AudioAttributesCompatParcelizer(Uri uri) {
        return setClipEndPositionMs.IconCompatParcelizer(uri);
    }

    static class write implements fromUri<File> {
        private static final String[] RemoteActionCompatParcelizer = {"_data"};
        private final Context IconCompatParcelizer;
        private final Uri read;

        @Override // kotlin.fromUri
        public final void AudioAttributesCompatParcelizer() {
        }

        @Override // kotlin.fromUri
        public final void read() {
        }

        write(Context context, Uri uri) {
            this.IconCompatParcelizer = context;
            this.read = uri;
        }

        @Override // kotlin.fromUri
        public final void write(setSampleRate setsamplerate, fromUri.AudioAttributesCompatParcelizer<? super File> audioAttributesCompatParcelizer) {
            Cursor cursorQuery = this.IconCompatParcelizer.getContentResolver().query(this.read, RemoteActionCompatParcelizer, null, null, null);
            if (cursorQuery != null) {
                try {
                    string = cursorQuery.moveToFirst() ? cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("_data")) : null;
                } finally {
                    cursorQuery.close();
                }
            }
            if (TextUtils.isEmpty(string)) {
                StringBuilder sb = new StringBuilder("Failed to find file path for: ");
                sb.append(this.read);
                audioAttributesCompatParcelizer.IconCompatParcelizer(new FileNotFoundException(sb.toString()));
                return;
            }
            audioAttributesCompatParcelizer.write(new File(string));
        }

        @Override // kotlin.fromUri
        public final Class<File> write() {
            return File.class;
        }

        @Override // kotlin.fromUri
        public final onTracksChanged IconCompatParcelizer() {
            return onTracksChanged.LOCAL;
        }
    }

    public static final class RemoteActionCompatParcelizer implements setTargetOffsetMs<Uri, File> {
        private final Context RemoteActionCompatParcelizer;

        @Override // kotlin.setTargetOffsetMs
        public final void read() {
        }

        public RemoteActionCompatParcelizer(Context context) {
            this.RemoteActionCompatParcelizer = context;
        }

        @Override // kotlin.setTargetOffsetMs
        public final MediaItemLocalConfigurationExternalSyntheticLambda0<Uri, File> write(MediaItemRequestMetadataExternalSyntheticLambda0 mediaItemRequestMetadataExternalSyntheticLambda0) {
            return new setMaxOffsetMs(this.RemoteActionCompatParcelizer);
        }
    }
}
