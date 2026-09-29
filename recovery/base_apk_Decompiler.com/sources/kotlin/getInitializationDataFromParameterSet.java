package kotlin;

import java.io.IOException;
import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.security.cert.CertificateParsingException;
import java.util.Date;
import java.util.Enumeration;
import java.util.Set;
import kotlin.onEmsgLeafAtomRead;

/* JADX INFO: loaded from: classes3.dex */
public final class getInitializationDataFromParameterSet {
    public static int write(LottieRatingBar lottieRatingBar) throws CertificateParsingException {
        if (lottieRatingBar instanceof getPairOfTimeAndIndex) {
            return AudioAttributesCompatParcelizer(((getPairOfTimeAndIndex) lottieRatingBar).AudioAttributesCompatParcelizer());
        }
        if (lottieRatingBar instanceof MarrowWebView) {
            return AudioAttributesCompatParcelizer(((MarrowWebView) lottieRatingBar).read());
        }
        StringBuilder sb = new StringBuilder("Integer value expected, ");
        sb.append(lottieRatingBar.getClass().getName());
        sb.append(" found.");
        throw new CertificateParsingException(sb.toString());
    }

    public static Long read(LottieRatingBar lottieRatingBar) throws CertificateParsingException {
        if (lottieRatingBar instanceof getPairOfTimeAndIndex) {
            return Long.valueOf(write(((getPairOfTimeAndIndex) lottieRatingBar).AudioAttributesCompatParcelizer()));
        }
        StringBuilder sb = new StringBuilder("Integer value expected, ");
        sb.append(lottieRatingBar.getClass().getName());
        sb.append(" found.");
        throw new CertificateParsingException(sb.toString());
    }

    public static byte[] IconCompatParcelizer(LottieRatingBar lottieRatingBar) throws CertificateParsingException {
        if (!(lottieRatingBar instanceof EmptyBody)) {
            throw new CertificateParsingException("Expected DEROctetString");
        }
        return ((setIsTablet) lottieRatingBar).read();
    }

    public static LottieRatingBar IconCompatParcelizer(byte[] bArr) throws CertificateParsingException {
        try {
            getHideRunner gethiderunner = new getHideRunner(bArr);
            try {
                setMsDelay setmsdelayRemoteActionCompatParcelizer = gethiderunner.RemoteActionCompatParcelizer();
                gethiderunner.close();
                return setmsdelayRemoteActionCompatParcelizer;
            } finally {
            }
        } catch (IOException e) {
            throw new CertificateParsingException("Failed to parse Encodable", e);
        }
    }

    public static setMsFixedDuration AudioAttributesCompatParcelizer(byte[] bArr) throws CertificateParsingException {
        try {
            getHideRunner gethiderunner = new getHideRunner(bArr);
            try {
                setMsFixedDuration setmsfixeddurationRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(gethiderunner);
                gethiderunner.close();
                return setmsfixeddurationRemoteActionCompatParcelizer;
            } finally {
            }
        } catch (IOException e) {
            throw new CertificateParsingException("Failed to parse SEQUENCE", e);
        }
    }

    private static setMsFixedDuration RemoteActionCompatParcelizer(getHideRunner gethiderunner) throws CertificateParsingException, IOException {
        setMsDelay setmsdelayRemoteActionCompatParcelizer = gethiderunner.RemoteActionCompatParcelizer();
        if (!(setmsdelayRemoteActionCompatParcelizer instanceof setIsTablet)) {
            StringBuilder sb = new StringBuilder("Expected octet stream, found ");
            sb.append(setmsdelayRemoteActionCompatParcelizer.getClass().getName());
            throw new CertificateParsingException(sb.toString());
        }
        getHideRunner gethiderunner2 = new getHideRunner(((setIsTablet) setmsdelayRemoteActionCompatParcelizer).read());
        try {
            setMsDelay setmsdelayRemoteActionCompatParcelizer2 = gethiderunner2.RemoteActionCompatParcelizer();
            if (!(setmsdelayRemoteActionCompatParcelizer2 instanceof setMsFixedDuration)) {
                StringBuilder sb2 = new StringBuilder("Expected sequence, found ");
                sb2.append(setmsdelayRemoteActionCompatParcelizer2.getClass().getName());
                throw new CertificateParsingException(sb2.toString());
            }
            setMsFixedDuration setmsfixedduration = (setMsFixedDuration) setmsdelayRemoteActionCompatParcelizer2;
            gethiderunner2.close();
            return setmsfixedduration;
        } catch (Throwable th) {
            try {
                gethiderunner2.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static Set<Integer> AudioAttributesCompatParcelizer(LottieRatingBar lottieRatingBar) throws CertificateParsingException {
        if (!(lottieRatingBar instanceof ResponsiveScrollView)) {
            StringBuilder sb = new StringBuilder("Expected set, found ");
            sb.append(lottieRatingBar.getClass().getName());
            throw new CertificateParsingException(sb.toString());
        }
        onEmsgLeafAtomRead.IconCompatParcelizer iconCompatParcelizerMediaBrowserCompatItemReceiver = onEmsgLeafAtomRead.MediaBrowserCompatItemReceiver();
        Enumeration enumeration = ((ResponsiveScrollView) lottieRatingBar).read();
        while (enumeration.hasMoreElements()) {
            iconCompatParcelizerMediaBrowserCompatItemReceiver.RemoteActionCompatParcelizer(Integer.valueOf(write((getPairOfTimeAndIndex) enumeration.nextElement())));
        }
        return iconCompatParcelizerMediaBrowserCompatItemReceiver.write();
    }

    public static String AudioAttributesImplApi26Parcelizer(LottieRatingBar lottieRatingBar) throws CertificateParsingException {
        if (!(lottieRatingBar instanceof setIsTablet)) {
            StringBuilder sb = new StringBuilder("Expected octet string, found ");
            sb.append(lottieRatingBar.getClass().getName());
            throw new CertificateParsingException(sb.toString());
        }
        return new String(((setIsTablet) lottieRatingBar).read(), StandardCharsets.UTF_8);
    }

    public static String MediaBrowserCompatItemReceiver(LottieRatingBar lottieRatingBar) throws CertificateParsingException {
        if (!(lottieRatingBar instanceof setOnMoveListener)) {
            StringBuilder sb = new StringBuilder("Expected printable string, found ");
            sb.append(lottieRatingBar.getClass().getName());
            throw new CertificateParsingException(sb.toString());
        }
        return ((setOnMoveListener) lottieRatingBar).read();
    }

    public static Date read(setMsDelay setmsdelay) throws CertificateParsingException {
        return new Date(read((LottieRatingBar) setmsdelay).longValue());
    }

    public static boolean RemoteActionCompatParcelizer(LottieRatingBar lottieRatingBar) throws CertificateParsingException {
        if (!(lottieRatingBar instanceof setRatingChangeAllowed)) {
            StringBuilder sb = new StringBuilder("Expected boolean, found ");
            sb.append(lottieRatingBar.getClass().getName());
            throw new CertificateParsingException(sb.toString());
        }
        setRatingChangeAllowed setratingchangeallowed = (setRatingChangeAllowed) lottieRatingBar;
        if (setratingchangeallowed.AudioAttributesCompatParcelizer(setRatingChangeAllowed.IconCompatParcelizer)) {
            return true;
        }
        if (setratingchangeallowed.AudioAttributesCompatParcelizer(setRatingChangeAllowed.AudioAttributesCompatParcelizer)) {
            return false;
        }
        throw new CertificateParsingException("DER-encoded boolean values must contain either 0x00 or 0xFF");
    }

    private static int AudioAttributesCompatParcelizer(BigInteger bigInteger) throws CertificateParsingException {
        if (bigInteger.compareTo(BigInteger.valueOf(2147483647L)) > 0 || bigInteger.compareTo(BigInteger.ZERO) < 0) {
            throw new CertificateParsingException("INTEGER out of bounds");
        }
        return bigInteger.intValue();
    }

    private static long write(BigInteger bigInteger) throws CertificateParsingException {
        if (bigInteger.compareTo(BigInteger.valueOf(Long.MAX_VALUE)) > 0 || bigInteger.compareTo(BigInteger.ZERO) < 0) {
            throw new CertificateParsingException("INTEGER out of bounds");
        }
        return bigInteger.longValue();
    }
}
