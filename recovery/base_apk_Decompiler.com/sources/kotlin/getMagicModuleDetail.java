package kotlin;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;
import java.io.StringWriter;
import java.io.Writer;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public final class getMagicModuleDetail {
    private static getTopRankers<String> IconCompatParcelizer(BufferedReader bufferedReader) {
        toMagicModuleMetaRepoModel.write(bufferedReader, "");
        return StateResult.IconCompatParcelizer((getTopRankers) new submitMagicModuleFeedback(bufferedReader));
    }

    public static final String write(Reader reader) {
        toMagicModuleMetaRepoModel.write(reader, "");
        StringWriter stringWriter = new StringWriter();
        IconCompatParcelizer(reader, stringWriter);
        String string = stringWriter.toString();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string, "");
        return string;
    }

    private static /* synthetic */ long IconCompatParcelizer(Reader reader, Writer writer) {
        return RemoteActionCompatParcelizer(reader, writer, 8192);
    }

    private static long RemoteActionCompatParcelizer(Reader reader, Writer writer, int i) throws IOException {
        toMagicModuleMetaRepoModel.write(reader, "");
        toMagicModuleMetaRepoModel.write(writer, "");
        char[] cArr = new char[8192];
        int i2 = reader.read(cArr);
        long j = 0;
        while (i2 >= 0) {
            writer.write(cArr, 0, i2);
            j += (long) i2;
            i2 = reader.read(cArr);
        }
        return j;
    }

    public static final void write(Reader reader, getAnswerMap<? super String, getShowPopup> getanswermap) {
        toMagicModuleMetaRepoModel.write(reader, "");
        toMagicModuleMetaRepoModel.write(getanswermap, "");
        BufferedReader bufferedReader = reader instanceof BufferedReader ? (BufferedReader) reader : new BufferedReader(reader, 8192);
        try {
            Iterator<String> itWrite = IconCompatParcelizer(bufferedReader).write();
            while (itWrite.hasNext()) {
                getanswermap.invoke(itWrite.next());
            }
            getShowPopup getshowpopup = getShowPopup.INSTANCE;
            MagicModuleMetaLSModel.IconCompatParcelizer(bufferedReader, null);
        } finally {
        }
    }
}
