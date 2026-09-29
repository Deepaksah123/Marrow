package kotlin;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes4.dex */
public abstract class setBlinkerTexts implements LottieRatingBar {
    @Override // kotlin.LottieRatingBar
    public abstract setMsDelay AudioAttributesImplApi26Parcelizer();

    public void read(OutputStream outputStream) throws IOException {
        AudioAttributesImplApi26Parcelizer().read(outputStream);
    }

    public void read(OutputStream outputStream, String str) throws IOException {
        AudioAttributesImplApi26Parcelizer().read(outputStream, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof LottieRatingBar) {
            return AudioAttributesImplApi26Parcelizer().AudioAttributesCompatParcelizer(((LottieRatingBar) obj).AudioAttributesImplApi26Parcelizer());
        }
        return false;
    }

    public final byte[] MediaBrowserCompatCustomActionResultReceiver() throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        AudioAttributesImplApi26Parcelizer().read(byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
    }

    public final byte[] write(String str) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        AudioAttributesImplApi26Parcelizer().read(byteArrayOutputStream, str);
        return byteArrayOutputStream.toByteArray();
    }

    public int hashCode() {
        return AudioAttributesImplApi26Parcelizer().hashCode();
    }
}
