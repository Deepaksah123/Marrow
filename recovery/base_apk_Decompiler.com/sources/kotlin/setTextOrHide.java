package kotlin;

import java.io.IOException;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes4.dex */
final class setTextOrHide extends setSubscriptionDataProvider {
    private final Socket read;

    public setTextOrHide(Socket socket) {
        toMagicModuleMetaRepoModel.write(socket, "");
        this.read = socket;
    }

    @Override // kotlin.setSubscriptionDataProvider
    protected final IOException write(IOException iOException) {
        SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
        if (iOException != null) {
            socketTimeoutException.initCause(iOException);
        }
        return socketTimeoutException;
    }

    @Override // kotlin.setSubscriptionDataProvider
    protected final void RemoteActionCompatParcelizer() {
        try {
            this.read.close();
        } catch (AssertionError e) {
            if (CustomAppBarLayout.RemoteActionCompatParcelizer(e)) {
                Logger logger = setCompoundDrawablesWithIntrinsicBoundsCompat.RemoteActionCompatParcelizer;
                Level level = Level.WARNING;
                StringBuilder sb = new StringBuilder("Failed to close timed out socket ");
                sb.append(this.read);
                logger.log(level, sb.toString(), (Throwable) e);
                return;
            }
            throw e;
        } catch (Exception e2) {
            Logger logger2 = setCompoundDrawablesWithIntrinsicBoundsCompat.RemoteActionCompatParcelizer;
            Level level2 = Level.WARNING;
            StringBuilder sb2 = new StringBuilder("Failed to close timed out socket ");
            sb2.append(this.read);
            logger2.log(level2, sb2.toString(), (Throwable) e2);
        }
    }
}
