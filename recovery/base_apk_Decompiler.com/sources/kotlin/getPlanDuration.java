package kotlin;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.reflect.InvocationTargetException;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class getPlanDuration {
    public static final String AudioAttributesCompatParcelizer(Throwable th) throws IOException {
        toMagicModuleMetaRepoModel.write(th, "");
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        th.printStackTrace(printWriter);
        printWriter.flush();
        String string = stringWriter.toString();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string, "");
        return string;
    }

    public static final void IconCompatParcelizer(Throwable th, Throwable th2) throws IllegalAccessException, InvocationTargetException {
        toMagicModuleMetaRepoModel.write(th, "");
        toMagicModuleMetaRepoModel.write(th2, "");
        if (th != th2) {
            saveMagicModuleModel.write.write(th, th2);
        }
    }

    public static final List<Throwable> write(Throwable th) {
        toMagicModuleMetaRepoModel.write(th, "");
        return saveMagicModuleModel.write.write(th);
    }
}
