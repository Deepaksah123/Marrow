package kotlin;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes4.dex */
final /* synthetic */ class setCompoundDrawablesWithIntrinsicBoundsCompat {
    private static final Logger RemoteActionCompatParcelizer = Logger.getLogger("okio.Okio");

    public static final setCompoundDrawablesWithIntrinsicBoundsCompatdefault read(OutputStream outputStream) {
        toMagicModuleMetaRepoModel.write(outputStream, "");
        return new setStateChangeListener(outputStream, new CustomTextView());
    }

    public static final setLockedFromSeek IconCompatParcelizer(InputStream inputStream) {
        toMagicModuleMetaRepoModel.write(inputStream, "");
        return new ActiveRecallQbankLessonUiModel(inputStream, new CustomTextView());
    }

    public static final setCompoundDrawablesWithIntrinsicBoundsCompatdefault write(Socket socket) throws IOException {
        toMagicModuleMetaRepoModel.write(socket, "");
        setTextOrHide settextorhide = new setTextOrHide(socket);
        OutputStream outputStream = socket.getOutputStream();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(outputStream, "");
        return settextorhide.read(new setStateChangeListener(outputStream, settextorhide));
    }

    public static final setLockedFromSeek AudioAttributesCompatParcelizer(Socket socket) throws IOException {
        toMagicModuleMetaRepoModel.write(socket, "");
        setTextOrHide settextorhide = new setTextOrHide(socket);
        InputStream inputStream = socket.getInputStream();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(inputStream, "");
        return settextorhide.IconCompatParcelizer(new ActiveRecallQbankLessonUiModel(inputStream, settextorhide));
    }

    public static final setCompoundDrawablesWithIntrinsicBoundsCompatdefault RemoteActionCompatParcelizer(File file, boolean z) throws FileNotFoundException {
        toMagicModuleMetaRepoModel.write(file, "");
        return CustomAppBarLayout.read(new FileOutputStream(file, z));
    }

    public static final setCompoundDrawablesWithIntrinsicBoundsCompatdefault RemoteActionCompatParcelizer(File file) throws FileNotFoundException {
        toMagicModuleMetaRepoModel.write(file, "");
        return CustomAppBarLayout.read(new FileOutputStream(file, true));
    }

    public static final setLockedFromSeek AudioAttributesCompatParcelizer(File file) throws FileNotFoundException {
        toMagicModuleMetaRepoModel.write(file, "");
        return new ActiveRecallQbankLessonUiModel(new FileInputStream(file), CustomTextView.IconCompatParcelizer);
    }

    public static final boolean RemoteActionCompatParcelizer(AssertionError assertionError) {
        String message;
        toMagicModuleMetaRepoModel.write(assertionError, "");
        return (assertionError.getCause() == null || (message = assertionError.getMessage()) == null || !TestGroupLSModel.write((CharSequence) message, (CharSequence) "getsockname failed", false)) ? false : true;
    }
}
