package kotlin;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.UnknownServiceException;
import java.security.cert.CertificateException;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSocket;

/* JADX INFO: loaded from: classes4.dex */
public final class UserModule {
    private boolean AudioAttributesCompatParcelizer;
    private boolean IconCompatParcelizer;
    private int RemoteActionCompatParcelizer;
    private final List<UserLoggedOutExceptionCompanion> write;

    public UserModule(List<UserLoggedOutExceptionCompanion> list) {
        toMagicModuleMetaRepoModel.write(list, "");
        this.write = list;
    }

    public final UserLoggedOutExceptionCompanion IconCompatParcelizer(SSLSocket sSLSocket) throws IOException {
        UserLoggedOutExceptionCompanion userLoggedOutExceptionCompanion;
        toMagicModuleMetaRepoModel.write(sSLSocket, "");
        int i = this.RemoteActionCompatParcelizer;
        int size = this.write.size();
        while (true) {
            if (i >= size) {
                userLoggedOutExceptionCompanion = null;
                break;
            }
            userLoggedOutExceptionCompanion = this.write.get(i);
            if (userLoggedOutExceptionCompanion.IconCompatParcelizer(sSLSocket)) {
                this.RemoteActionCompatParcelizer = i + 1;
                break;
            }
            i++;
        }
        if (userLoggedOutExceptionCompanion == null) {
            StringBuilder sb = new StringBuilder("Unable to find acceptable protocols. isFallback=");
            sb.append(this.IconCompatParcelizer);
            sb.append(", modes=");
            sb.append(this.write);
            sb.append(", supported protocols=");
            String[] enabledProtocols = sSLSocket.getEnabledProtocols();
            toMagicModuleMetaRepoModel.write(enabledProtocols);
            String string = Arrays.toString(enabledProtocols);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string, "");
            sb.append(string);
            throw new UnknownServiceException(sb.toString());
        }
        this.AudioAttributesCompatParcelizer = RemoteActionCompatParcelizer(sSLSocket);
        userLoggedOutExceptionCompanion.read(sSLSocket, this.IconCompatParcelizer);
        return userLoggedOutExceptionCompanion;
    }

    public final boolean IconCompatParcelizer(IOException iOException) {
        toMagicModuleMetaRepoModel.write(iOException, "");
        this.IconCompatParcelizer = true;
        if (!this.AudioAttributesCompatParcelizer || (iOException instanceof ProtocolException) || (iOException instanceof InterruptedIOException)) {
            return false;
        }
        return (((iOException instanceof SSLHandshakeException) && (iOException.getCause() instanceof CertificateException)) || (iOException instanceof SSLPeerUnverifiedException) || !(iOException instanceof SSLException)) ? false : true;
    }

    private final boolean RemoteActionCompatParcelizer(SSLSocket sSLSocket) {
        int size = this.write.size();
        for (int i = this.RemoteActionCompatParcelizer; i < size; i++) {
            if (this.write.get(i).IconCompatParcelizer(sSLSocket)) {
                return true;
            }
        }
        return false;
    }
}
