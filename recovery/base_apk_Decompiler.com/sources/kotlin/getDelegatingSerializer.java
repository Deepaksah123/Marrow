package kotlin;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.deserializeKeyQDdqvc;

/* JADX INFO: loaded from: classes2.dex */
public final class getDelegatingSerializer {
    private final deserializeKeyQDdqvc.write AudioAttributesCompatParcelizer;
    private final int[] IconCompatParcelizer;
    private final String[] RemoteActionCompatParcelizer;
    private final Set<String> read;

    public getDelegatingSerializer(deserializeKeyQDdqvc.write writeVar, int[] iArr, String[] strArr) {
        toMagicModuleMetaRepoModel.write(writeVar, "");
        toMagicModuleMetaRepoModel.write(iArr, "");
        toMagicModuleMetaRepoModel.write(strArr, "");
        this.AudioAttributesCompatParcelizer = writeVar;
        this.IconCompatParcelizer = iArr;
        this.RemoteActionCompatParcelizer = strArr;
        if (iArr.length != strArr.length) {
            throw new IllegalStateException("Check failed.");
        }
        this.read = strArr.length == 0 ? getKycMessage.read() : getKycMessage.read(strArr[0]);
    }

    public final deserializeKeyQDdqvc.write RemoteActionCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    public final int[] IconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    public final void AudioAttributesCompatParcelizer(Set<Integer> set) {
        Set<String> setRemoteActionCompatParcelizer;
        toMagicModuleMetaRepoModel.write(set, "");
        int[] iArr = this.IconCompatParcelizer;
        int length = iArr.length;
        if (length != 0) {
            int i = 0;
            if (length == 1) {
                setRemoteActionCompatParcelizer = set.contains(Integer.valueOf(iArr[0])) ? this.read : getKycMessage.read();
            } else {
                Set setWrite = getKycMessage.write();
                int[] iArr2 = this.IconCompatParcelizer;
                int length2 = iArr2.length;
                int i2 = 0;
                while (i < length2) {
                    if (set.contains(Integer.valueOf(iArr2[i]))) {
                        setWrite.add(this.RemoteActionCompatParcelizer[i2]);
                    }
                    i++;
                    i2++;
                }
                setRemoteActionCompatParcelizer = getKycMessage.RemoteActionCompatParcelizer(setWrite);
            }
        } else {
            setRemoteActionCompatParcelizer = getKycMessage.read();
        }
        if (setRemoteActionCompatParcelizer.isEmpty()) {
            return;
        }
        this.AudioAttributesCompatParcelizer.write(setRemoteActionCompatParcelizer);
    }

    public final void write(Set<String> set) {
        Set<String> setRemoteActionCompatParcelizer;
        toMagicModuleMetaRepoModel.write(set, "");
        int length = this.RemoteActionCompatParcelizer.length;
        if (length == 0) {
            setRemoteActionCompatParcelizer = getKycMessage.read();
        } else if (length == 1) {
            Set<String> set2 = set;
            if ((set2 instanceof Collection) && set2.isEmpty()) {
                setRemoteActionCompatParcelizer = getKycMessage.read();
            } else {
                Iterator<T> it = set2.iterator();
                while (it.hasNext()) {
                    if (TestGroupLSModel.read((String) it.next(), this.RemoteActionCompatParcelizer[0], true)) {
                        setRemoteActionCompatParcelizer = this.read;
                        break;
                    }
                }
                setRemoteActionCompatParcelizer = getKycMessage.read();
            }
        } else {
            Set setWrite = getKycMessage.write();
            for (String str : set) {
                String[] strArr = this.RemoteActionCompatParcelizer;
                int length2 = strArr.length;
                int i = 0;
                while (true) {
                    if (i < length2) {
                        String str2 = strArr[i];
                        if (TestGroupLSModel.read(str2, str, true)) {
                            setWrite.add(str2);
                            break;
                        }
                        i++;
                    }
                }
            }
            setRemoteActionCompatParcelizer = getKycMessage.RemoteActionCompatParcelizer(setWrite);
        }
        if (setRemoteActionCompatParcelizer.isEmpty()) {
            return;
        }
        this.AudioAttributesCompatParcelizer.write(setRemoteActionCompatParcelizer);
    }
}
