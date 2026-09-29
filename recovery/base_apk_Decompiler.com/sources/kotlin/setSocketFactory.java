package kotlin;

import com.google.android.exoplayer2.source.rtsp.RtspHeaders;
import java.io.EOFException;
import java.nio.charset.Charset;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import kotlin.MarrowTheme;
import org.apache.commons.compress.utils.CharsetNames;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class setSocketFactory implements MarrowTheme {
    private static final Charset read = Charset.forName(CharsetNames.UTF_8);
    private String AudioAttributesCompatParcelizer;
    private volatile IconCompatParcelizer RemoteActionCompatParcelizer;
    private final AudioAttributesCompatParcelizer write;

    public interface AudioAttributesCompatParcelizer {
        public static final AudioAttributesCompatParcelizer write = new AudioAttributesCompatParcelizer() { // from class: o.setSocketFactory.AudioAttributesCompatParcelizer.2
        };
    }

    public enum IconCompatParcelizer {
        NONE,
        BASIC,
        HEADERS,
        BODY,
        ENCRYPTED
    }

    public setSocketFactory() {
        this(AudioAttributesCompatParcelizer.write);
    }

    public setSocketFactory(String str) {
        this(AudioAttributesCompatParcelizer.write);
        this.AudioAttributesCompatParcelizer = str;
    }

    private setSocketFactory(AudioAttributesCompatParcelizer audioAttributesCompatParcelizer) {
        this.RemoteActionCompatParcelizer = IconCompatParcelizer.NONE;
        this.write = audioAttributesCompatParcelizer;
    }

    public final setSocketFactory write(IconCompatParcelizer iconCompatParcelizer) {
        if (iconCompatParcelizer == null) {
            throw new NullPointerException("level == null. Use Level.NONE instead.");
        }
        this.RemoteActionCompatParcelizer = iconCompatParcelizer;
        return this;
    }

    @Override // kotlin.MarrowTheme
    public final C0156TypeKt AudioAttributesCompatParcelizer(MarrowTheme.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer) throws Exception {
        String string;
        IconCompatParcelizer iconCompatParcelizer = this.RemoteActionCompatParcelizer;
        ThemeKtExternalSyntheticLambda0 themeKtExternalSyntheticLambda0IconCompatParcelizer = audioAttributesCompatParcelizer.IconCompatParcelizer();
        if (iconCompatParcelizer == IconCompatParcelizer.NONE) {
            return audioAttributesCompatParcelizer.RemoteActionCompatParcelizer(themeKtExternalSyntheticLambda0IconCompatParcelizer);
        }
        boolean z = iconCompatParcelizer == IconCompatParcelizer.BODY || iconCompatParcelizer == IconCompatParcelizer.ENCRYPTED;
        boolean z2 = z || iconCompatParcelizer == IconCompatParcelizer.HEADERS;
        ThemeKtExternalSyntheticLambda2 body = themeKtExternalSyntheticLambda0IconCompatParcelizer.getBody();
        boolean z3 = body != null;
        UserLoggedOutException userLoggedOutExceptionRemoteActionCompatParcelizer = audioAttributesCompatParcelizer.RemoteActionCompatParcelizer();
        ThemeKtExternalSyntheticLambda1 themeKtExternalSyntheticLambda1RemoteActionCompatParcelizer = userLoggedOutExceptionRemoteActionCompatParcelizer != null ? userLoggedOutExceptionRemoteActionCompatParcelizer.RemoteActionCompatParcelizer() : ThemeKtExternalSyntheticLambda1.HTTP_1_1;
        StringBuilder sb = new StringBuilder("--> ");
        sb.append(themeKtExternalSyntheticLambda0IconCompatParcelizer.getMethod());
        sb.append(' ');
        sb.append(themeKtExternalSyntheticLambda0IconCompatParcelizer.getUrl());
        sb.append(' ');
        sb.append(themeKtExternalSyntheticLambda1RemoteActionCompatParcelizer);
        sb.toString();
        if (!z2 && z3) {
            body.contentLength();
        }
        if (z2) {
            if (z3) {
                if (body.contentType() != null) {
                    Objects.toString(body.contentType());
                }
                if (body.contentLength() != -1) {
                    body.contentLength();
                }
            }
            ShapeKt headers = themeKtExternalSyntheticLambda0IconCompatParcelizer.getHeaders();
            int iIconCompatParcelizer = headers.IconCompatParcelizer();
            for (int i = 0; i < iIconCompatParcelizer; i++) {
                String strIconCompatParcelizer = headers.IconCompatParcelizer(i);
                if (!RtspHeaders.CONTENT_TYPE.equalsIgnoreCase(strIconCompatParcelizer) && !RtspHeaders.CONTENT_LENGTH.equalsIgnoreCase(strIconCompatParcelizer)) {
                    headers.AudioAttributesCompatParcelizer(i);
                }
            }
            if (!z || !z3 || RemoteActionCompatParcelizer(themeKtExternalSyntheticLambda0IconCompatParcelizer.getHeaders())) {
                themeKtExternalSyntheticLambda0IconCompatParcelizer.getMethod();
            } else {
                resetCurrentSelectedPosition resetcurrentselectedposition = new resetCurrentSelectedPosition();
                body.writeTo(resetcurrentselectedposition);
                Charset charset = read;
                MediaType mediaTypeContentType = body.contentType();
                if (mediaTypeContentType != null) {
                    charset = mediaTypeContentType.read(charset);
                }
                if (write(resetcurrentselectedposition)) {
                    String strWrite = resetcurrentselectedposition.write(charset);
                    if (iconCompatParcelizer == IconCompatParcelizer.ENCRYPTED) {
                        try {
                            DashManifestParser.IconCompatParcelizer(parseDuration.RemoteActionCompatParcelizer(themeKtExternalSyntheticLambda0IconCompatParcelizer), new JSONObject(strWrite).optString("enc_data"));
                        } catch (JSONException e) {
                            e.printStackTrace();
                        }
                    }
                    IconCompatParcelizer iconCompatParcelizer2 = IconCompatParcelizer.ENCRYPTED;
                    themeKtExternalSyntheticLambda0IconCompatParcelizer.getMethod();
                    body.contentLength();
                } else {
                    themeKtExternalSyntheticLambda0IconCompatParcelizer.getMethod();
                    body.contentLength();
                }
            }
        }
        long jNanoTime = System.nanoTime();
        try {
            C0156TypeKt c0156TypeKtRemoteActionCompatParcelizer = audioAttributesCompatParcelizer.RemoteActionCompatParcelizer(themeKtExternalSyntheticLambda0IconCompatParcelizer);
            TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - jNanoTime);
            ActivityAdapterModule body2 = c0156TypeKtRemoteActionCompatParcelizer.getBody();
            long j = body2.read();
            if (j != -1) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(j);
                sb2.append("-byte");
                string = sb2.toString();
            } else {
                string = "unknown-length";
            }
            c0156TypeKtRemoteActionCompatParcelizer.getCode();
            c0156TypeKtRemoteActionCompatParcelizer.getMessage();
            Objects.toString(c0156TypeKtRemoteActionCompatParcelizer.getRequest().getUrl());
            if (!z2) {
                StringBuilder sb3 = new StringBuilder(", ");
                sb3.append(string);
                sb3.append(" body");
                sb3.toString();
            }
            if (z2) {
                ShapeKt headers2 = c0156TypeKtRemoteActionCompatParcelizer.getHeaders();
                int iIconCompatParcelizer2 = headers2.IconCompatParcelizer();
                for (int i2 = 0; i2 < iIconCompatParcelizer2; i2++) {
                    headers2.IconCompatParcelizer(i2);
                    headers2.AudioAttributesCompatParcelizer(i2);
                }
                if (z && FragmentProviderModule.RemoteActionCompatParcelizer(c0156TypeKtRemoteActionCompatParcelizer) && !RemoteActionCompatParcelizer(c0156TypeKtRemoteActionCompatParcelizer.getHeaders())) {
                    LessonCompletedDialog lessonCompletedDialogAudioAttributesCompatParcelizer = body2.AudioAttributesCompatParcelizer();
                    lessonCompletedDialogAudioAttributesCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver(Long.MAX_VALUE);
                    resetCurrentSelectedPosition resetcurrentselectedposition2 = lessonCompletedDialogAudioAttributesCompatParcelizer.read();
                    Charset charset2 = read;
                    MediaType mediaTypeWrite = body2.write();
                    if (mediaTypeWrite != null) {
                        charset2 = mediaTypeWrite.read(charset2);
                    }
                    if (!write(resetcurrentselectedposition2)) {
                        resetcurrentselectedposition2.getSize();
                        return c0156TypeKtRemoteActionCompatParcelizer;
                    }
                    if (j != 0) {
                        resetcurrentselectedposition2.clone().write(charset2);
                    }
                    resetcurrentselectedposition2.getSize();
                }
            }
            return c0156TypeKtRemoteActionCompatParcelizer;
        } catch (Exception e2) {
            e2.toString();
            throw e2;
        }
    }

    private static boolean write(resetCurrentSelectedPosition resetcurrentselectedposition) {
        try {
            resetCurrentSelectedPosition resetcurrentselectedposition2 = new resetCurrentSelectedPosition();
            resetcurrentselectedposition.write(resetcurrentselectedposition2, 0L, resetcurrentselectedposition.getSize() < 64 ? resetcurrentselectedposition.getSize() : 64L);
            for (int i = 0; i < 16; i++) {
                if (resetcurrentselectedposition2.MediaBrowserCompatCustomActionResultReceiver()) {
                    return true;
                }
                int iOnFastForward = resetcurrentselectedposition2.onFastForward();
                if (Character.isISOControl(iOnFastForward) && !Character.isWhitespace(iOnFastForward)) {
                    return false;
                }
            }
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }

    private static boolean RemoteActionCompatParcelizer(ShapeKt shapeKt) {
        String strIconCompatParcelizer = shapeKt.IconCompatParcelizer(RtspHeaders.CONTENT_ENCODING);
        return (strIconCompatParcelizer == null || strIconCompatParcelizer.equalsIgnoreCase("identity")) ? false : true;
    }
}
