package kotlin;

import com.google.android.exoplayer2.source.rtsp.RtspHeaders;
import java.io.EOFException;
import java.io.IOException;
import java.util.regex.Pattern;
import kotlin.AppThemeCompanion;
import kotlin.ShapeKt;
import kotlin.ThemeAlphaConstantsKt;
import kotlin.ThemeKtExternalSyntheticLambda0;
import kotlin.ThemeKtWhenMappings;

/* JADX INFO: loaded from: classes4.dex */
final class toRSModel {
    private final ShapeKt.RemoteActionCompatParcelizer AudioAttributesImplApi21Parcelizer;
    private ThemeKtWhenMappings.write AudioAttributesImplApi26Parcelizer;
    private AppThemeCompanion.IconCompatParcelizer AudioAttributesImplBaseParcelizer;
    private MediaType IconCompatParcelizer;
    private final String MediaBrowserCompatCustomActionResultReceiver;
    private final boolean MediaBrowserCompatItemReceiver;
    private ThemeAlphaConstantsKt.write MediaBrowserCompatMediaItem;
    private final ThemeKtExternalSyntheticLambda0.IconCompatParcelizer MediaMetadataCompat = new ThemeKtExternalSyntheticLambda0.IconCompatParcelizer();
    private String RatingCompat;
    private final ThemeAlphaConstantsKt RemoteActionCompatParcelizer;
    private ThemeKtExternalSyntheticLambda2 read;
    private static final char[] write = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    private static final Pattern AudioAttributesCompatParcelizer = Pattern.compile("(.*/)?(\\.|%2e|%2E){1,2}(/.*)?");

    toRSModel(String str, ThemeAlphaConstantsKt themeAlphaConstantsKt, String str2, ShapeKt shapeKt, MediaType mediaType, boolean z, boolean z2, boolean z3) {
        this.MediaBrowserCompatCustomActionResultReceiver = str;
        this.RemoteActionCompatParcelizer = themeAlphaConstantsKt;
        this.RatingCompat = str2;
        this.IconCompatParcelizer = mediaType;
        this.MediaBrowserCompatItemReceiver = z;
        if (shapeKt != null) {
            this.AudioAttributesImplApi21Parcelizer = shapeKt.AudioAttributesCompatParcelizer();
        } else {
            this.AudioAttributesImplApi21Parcelizer = new ShapeKt.RemoteActionCompatParcelizer();
        }
        if (z2) {
            this.AudioAttributesImplBaseParcelizer = new AppThemeCompanion.IconCompatParcelizer();
        } else if (z3) {
            ThemeKtWhenMappings.write writeVar = new ThemeKtWhenMappings.write();
            this.AudioAttributesImplApi26Parcelizer = writeVar;
            writeVar.RemoteActionCompatParcelizer(ThemeKtWhenMappings.read);
        }
    }

    final void read(Object obj) {
        this.RatingCompat = obj.toString();
    }

    final void IconCompatParcelizer(String str, String str2) {
        if (RtspHeaders.CONTENT_TYPE.equalsIgnoreCase(str)) {
            try {
                this.IconCompatParcelizer = MediaType.read(str2);
                return;
            } catch (IllegalArgumentException e) {
                throw new IllegalArgumentException("Malformed content type: ".concat(String.valueOf(str2)), e);
            }
        }
        this.AudioAttributesImplApi21Parcelizer.IconCompatParcelizer(str, str2);
    }

    final void AudioAttributesCompatParcelizer(ShapeKt shapeKt) {
        this.AudioAttributesImplApi21Parcelizer.write(shapeKt);
    }

    final void write(String str, String str2, boolean z) throws EOFException {
        if (this.RatingCompat == null) {
            throw new AssertionError();
        }
        String strRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(str2, z);
        String str3 = this.RatingCompat;
        StringBuilder sb = new StringBuilder("{");
        sb.append(str);
        sb.append("}");
        String strReplace = str3.replace(sb.toString(), strRemoteActionCompatParcelizer);
        if (AudioAttributesCompatParcelizer.matcher(strReplace).matches()) {
            throw new IllegalArgumentException("@Path parameters shouldn't perform path traversal ('.' or '..'): ".concat(String.valueOf(str2)));
        }
        this.RatingCompat = strReplace;
    }

    private static String RemoteActionCompatParcelizer(String str, boolean z) throws EOFException {
        int length = str.length();
        int iCharCount = 0;
        while (iCharCount < length) {
            int iCodePointAt = str.codePointAt(iCharCount);
            if (iCodePointAt >= 32 && iCodePointAt < 127 && " \"<>^`{}|\\?#".indexOf(iCodePointAt) == -1 && (z || (iCodePointAt != 47 && iCodePointAt != 37))) {
                iCharCount += Character.charCount(iCodePointAt);
            } else {
                resetCurrentSelectedPosition resetcurrentselectedposition = new resetCurrentSelectedPosition();
                resetcurrentselectedposition.AudioAttributesCompatParcelizer(str, 0, iCharCount);
                RemoteActionCompatParcelizer(resetcurrentselectedposition, str, iCharCount, length, z);
                return resetcurrentselectedposition.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver();
            }
        }
        return str;
    }

    private static void RemoteActionCompatParcelizer(resetCurrentSelectedPosition resetcurrentselectedposition, String str, int i, int i2, boolean z) throws EOFException {
        resetCurrentSelectedPosition resetcurrentselectedposition2 = null;
        while (i < i2) {
            int iCodePointAt = str.codePointAt(i);
            if (!z || (iCodePointAt != 9 && iCodePointAt != 10 && iCodePointAt != 12 && iCodePointAt != 13)) {
                if (iCodePointAt < 32 || iCodePointAt >= 127 || " \"<>^`{}|\\?#".indexOf(iCodePointAt) != -1 || (!z && (iCodePointAt == 47 || iCodePointAt == 37))) {
                    if (resetcurrentselectedposition2 == null) {
                        resetcurrentselectedposition2 = new resetCurrentSelectedPosition();
                    }
                    resetcurrentselectedposition2.MediaBrowserCompatItemReceiver(iCodePointAt);
                    while (!resetcurrentselectedposition2.MediaBrowserCompatCustomActionResultReceiver()) {
                        byte bMediaMetadataCompat = resetcurrentselectedposition2.MediaMetadataCompat();
                        resetcurrentselectedposition.read(37);
                        char[] cArr = write;
                        resetcurrentselectedposition.read((int) cArr[((bMediaMetadataCompat & 255) >> 4) & 15]);
                        resetcurrentselectedposition.read((int) cArr[bMediaMetadataCompat & 15]);
                    }
                } else {
                    resetcurrentselectedposition.MediaBrowserCompatItemReceiver(iCodePointAt);
                }
            }
            i += Character.charCount(iCodePointAt);
        }
    }

    final void read(String str, String str2, boolean z) {
        String str3 = this.RatingCompat;
        if (str3 != null) {
            ThemeAlphaConstantsKt.write writeVarWrite = this.RemoteActionCompatParcelizer.write(str3);
            this.MediaBrowserCompatMediaItem = writeVarWrite;
            if (writeVarWrite == null) {
                StringBuilder sb = new StringBuilder("Malformed URL. Base: ");
                sb.append(this.RemoteActionCompatParcelizer);
                sb.append(", Relative: ");
                sb.append(this.RatingCompat);
                throw new IllegalArgumentException(sb.toString());
            }
            this.RatingCompat = null;
        }
        if (z) {
            this.MediaBrowserCompatMediaItem.AudioAttributesCompatParcelizer(str, str2);
        } else {
            this.MediaBrowserCompatMediaItem.RemoteActionCompatParcelizer(str, str2);
        }
    }

    final void AudioAttributesCompatParcelizer(String str, String str2, boolean z) {
        if (z) {
            this.AudioAttributesImplBaseParcelizer.write(str, str2);
        } else {
            this.AudioAttributesImplBaseParcelizer.read(str, str2);
        }
    }

    final void read(ShapeKt shapeKt, ThemeKtExternalSyntheticLambda2 themeKtExternalSyntheticLambda2) {
        this.AudioAttributesImplApi26Parcelizer.AudioAttributesCompatParcelizer(shapeKt, themeKtExternalSyntheticLambda2);
    }

    final void read(ThemeKtWhenMappings.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer) {
        this.AudioAttributesImplApi26Parcelizer.IconCompatParcelizer(audioAttributesCompatParcelizer);
    }

    final void IconCompatParcelizer(ThemeKtExternalSyntheticLambda2 themeKtExternalSyntheticLambda2) {
        this.read = themeKtExternalSyntheticLambda2;
    }

    final <T> void IconCompatParcelizer(Class<T> cls, T t) {
        this.MediaMetadataCompat.IconCompatParcelizer(cls, t);
    }

    final ThemeKtExternalSyntheticLambda0.IconCompatParcelizer read() {
        ThemeAlphaConstantsKt themeAlphaConstantsKt;
        ThemeAlphaConstantsKt.write writeVar = this.MediaBrowserCompatMediaItem;
        if (writeVar != null) {
            themeAlphaConstantsKt = writeVar.read();
        } else {
            themeAlphaConstantsKt = this.RemoteActionCompatParcelizer.read(this.RatingCompat);
            if (themeAlphaConstantsKt == null) {
                StringBuilder sb = new StringBuilder("Malformed URL. Base: ");
                sb.append(this.RemoteActionCompatParcelizer);
                sb.append(", Relative: ");
                sb.append(this.RatingCompat);
                throw new IllegalArgumentException(sb.toString());
            }
        }
        ThemeKtExternalSyntheticLambda2 iconCompatParcelizer = this.read;
        if (iconCompatParcelizer == null) {
            AppThemeCompanion.IconCompatParcelizer iconCompatParcelizer2 = this.AudioAttributesImplBaseParcelizer;
            if (iconCompatParcelizer2 != null) {
                iconCompatParcelizer = iconCompatParcelizer2.write();
            } else {
                ThemeKtWhenMappings.write writeVar2 = this.AudioAttributesImplApi26Parcelizer;
                if (writeVar2 != null) {
                    iconCompatParcelizer = writeVar2.IconCompatParcelizer();
                } else if (this.MediaBrowserCompatItemReceiver) {
                    iconCompatParcelizer = ThemeKtExternalSyntheticLambda2.create((MediaType) null, new byte[0]);
                }
            }
        }
        MediaType mediaType = this.IconCompatParcelizer;
        if (mediaType != null) {
            if (iconCompatParcelizer != null) {
                iconCompatParcelizer = new IconCompatParcelizer(iconCompatParcelizer, mediaType);
            } else {
                this.AudioAttributesImplApi21Parcelizer.IconCompatParcelizer(RtspHeaders.CONTENT_TYPE, mediaType.toString());
            }
        }
        return this.MediaMetadataCompat.write(themeAlphaConstantsKt).read(this.AudioAttributesImplApi21Parcelizer.AudioAttributesCompatParcelizer()).AudioAttributesCompatParcelizer(this.MediaBrowserCompatCustomActionResultReceiver, iconCompatParcelizer);
    }

    static class IconCompatParcelizer extends ThemeKtExternalSyntheticLambda2 {
        private final MediaType RemoteActionCompatParcelizer;
        private final ThemeKtExternalSyntheticLambda2 write;

        IconCompatParcelizer(ThemeKtExternalSyntheticLambda2 themeKtExternalSyntheticLambda2, MediaType mediaType) {
            this.write = themeKtExternalSyntheticLambda2;
            this.RemoteActionCompatParcelizer = mediaType;
        }

        @Override // kotlin.ThemeKtExternalSyntheticLambda2
        /* JADX INFO: renamed from: contentType */
        public final MediaType getIconCompatParcelizer() {
            return this.RemoteActionCompatParcelizer;
        }

        @Override // kotlin.ThemeKtExternalSyntheticLambda2
        public final long contentLength() throws IOException {
            return this.write.contentLength();
        }

        @Override // kotlin.ThemeKtExternalSyntheticLambda2
        public final void writeTo(LessonCompletedDialogonViewCreatedllm1 lessonCompletedDialogonViewCreatedllm1) throws IOException {
            this.write.writeTo(lessonCompletedDialogonViewCreatedllm1);
        }
    }
}
