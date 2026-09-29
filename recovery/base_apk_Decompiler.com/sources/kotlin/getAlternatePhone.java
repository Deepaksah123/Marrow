package kotlin;

import java.util.ArrayList;
import java.util.List;
import kotlin.postOrRunWithCompletion;

/* JADX INFO: loaded from: classes4.dex */
public final class getAlternatePhone {
    public static final List<AbstractC0202setMcqId> read(postOrRunWithCompletion postorrunwithcompletion) {
        toMagicModuleMetaRepoModel.write(postorrunwithcompletion, "");
        ArrayList arrayList = new ArrayList();
        for (postOrRunWithCompletion.RemoteActionCompatParcelizer remoteActionCompatParcelizer : postorrunwithcompletion.read()) {
            arrayList.add(new component10(remoteActionCompatParcelizer.IconCompatParcelizer()));
            for (postOrRunWithCompletion.RemoteActionCompatParcelizer.read readVar : remoteActionCompatParcelizer.AudioAttributesCompatParcelizer()) {
                arrayList.add(new component11(readVar.RemoteActionCompatParcelizer(), readVar.IconCompatParcelizer(), readVar.read(), readVar.AudioAttributesCompatParcelizer(), readVar.write()));
            }
        }
        return arrayList;
    }

    public static final getCity write(postOrRunWithCompletion postorrunwithcompletion) {
        toMagicModuleMetaRepoModel.write(postorrunwithcompletion, "");
        postOrRunWithCompletion.write write = postorrunwithcompletion.getWrite();
        String str = write != null ? write.read() : null;
        if (str == null) {
            str = "";
        }
        postOrRunWithCompletion.write write2 = postorrunwithcompletion.getWrite();
        String strIconCompatParcelizer = write2 != null ? write2.IconCompatParcelizer() : null;
        if (strIconCompatParcelizer == null) {
            strIconCompatParcelizer = "";
        }
        postOrRunWithCompletion.write write3 = postorrunwithcompletion.getWrite();
        String strAudioAttributesCompatParcelizer = write3 != null ? write3.AudioAttributesCompatParcelizer() : null;
        return new getCity(str, strIconCompatParcelizer, strAudioAttributesCompatParcelizer != null ? strAudioAttributesCompatParcelizer : "");
    }
}
