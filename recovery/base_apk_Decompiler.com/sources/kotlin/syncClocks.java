package kotlin;

import android.net.NetworkRequest;
import android.net.Uri;
import android.os.Build;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.e;
import kotlin.getChildPeriodUidFromConcatenatedUid;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0007\u0010\tJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\nH\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u000b\u0010\rJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u000b\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0012H\u0007¢\u0006\u0004\b\u000b\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0014\u0010\u0015J\u001d\u0010\u000b\u001a\u00020\u00182\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016H\u0007¢\u0006\u0004\b\u000b\u0010\u0019J\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00170\u00162\u0006\u0010\u0005\u001a\u00020\u0018H\u0007¢\u0006\u0004\b\u0010\u0010\u001aJ\u0017\u0010\u0014\u001a\u00020\u001b2\u0006\u0010\u0005\u001a\u00020\u0018H\u0001¢\u0006\u0004\b\u0014\u0010\u001cJ\u0017\u0010\u000b\u001a\u00020\u00182\u0006\u0010\u0005\u001a\u00020\u001bH\u0001¢\u0006\u0004\b\u000b\u0010\u001d"}, d2 = {"Lo/syncClocks;", "", "<init>", "()V", "Lo/getChildPeriodUidFromConcatenatedUid$write;", "p0", "", "IconCompatParcelizer", "(Lo/getChildPeriodUidFromConcatenatedUid$write;)I", "(I)Lo/getChildPeriodUidFromConcatenatedUid$write;", "Lo/verifyPendingInstall;", "read", "(Lo/verifyPendingInstall;)I", "(I)Lo/verifyPendingInstall;", "Lo/ia;", "(Lo/ia;)I", "RemoteActionCompatParcelizer", "(I)Lo/ia;", "Lo/qaa;", "(Lo/qaa;)I", "write", "(I)Lo/qaa;", "", "Lo/e$read;", "", "(Ljava/util/Set;)[B", "([B)Ljava/util/Set;", "Lo/buildTextRenderers;", "([B)Lo/buildTextRenderers;", "(Lo/buildTextRenderers;)[B"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class syncClocks {
    public static final syncClocks INSTANCE = new syncClocks();

    public static final /* synthetic */ class AudioAttributesCompatParcelizer {
        public static final /* synthetic */ int[] IconCompatParcelizer;
        public static final /* synthetic */ int[] RemoteActionCompatParcelizer;
        public static final /* synthetic */ int[] read;
        public static final /* synthetic */ int[] write;

        static {
            int[] iArr = new int[getChildPeriodUidFromConcatenatedUid.write.values().length];
            try {
                iArr[getChildPeriodUidFromConcatenatedUid.write.AudioAttributesCompatParcelizer.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[getChildPeriodUidFromConcatenatedUid.write.RemoteActionCompatParcelizer.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[getChildPeriodUidFromConcatenatedUid.write.AudioAttributesImplBaseParcelizer.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[getChildPeriodUidFromConcatenatedUid.write.read.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[getChildPeriodUidFromConcatenatedUid.write.write.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[getChildPeriodUidFromConcatenatedUid.write.IconCompatParcelizer.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            read = iArr;
            int[] iArr2 = new int[verifyPendingInstall.values().length];
            try {
                iArr2[verifyPendingInstall.AudioAttributesCompatParcelizer.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[verifyPendingInstall.RemoteActionCompatParcelizer.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            write = iArr2;
            int[] iArr3 = new int[ia.values().length];
            try {
                iArr3[ia.RemoteActionCompatParcelizer.ordinal()] = 1;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr3[ia.write.ordinal()] = 2;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr3[ia.AudioAttributesImplBaseParcelizer.ordinal()] = 3;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr3[ia.read.ordinal()] = 4;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr3[ia.AudioAttributesCompatParcelizer.ordinal()] = 5;
            } catch (NoSuchFieldError unused13) {
            }
            RemoteActionCompatParcelizer = iArr3;
            int[] iArr4 = new int[qaa.values().length];
            try {
                iArr4[qaa.write.ordinal()] = 1;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr4[qaa.AudioAttributesCompatParcelizer.ordinal()] = 2;
            } catch (NoSuchFieldError unused15) {
            }
            IconCompatParcelizer = iArr4;
        }
    }

    private syncClocks() {
    }

    @getMagicModuleMeta
    public static final int IconCompatParcelizer(getChildPeriodUidFromConcatenatedUid.write p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        switch (AudioAttributesCompatParcelizer.read[p0.ordinal()]) {
            case 1:
                return 0;
            case 2:
                return 1;
            case 3:
                return 2;
            case 4:
                return 3;
            case 5:
                return 4;
            case 6:
                return 5;
            default:
                throw new RenewEligibleCreator();
        }
    }

    @getMagicModuleMeta
    public static final getChildPeriodUidFromConcatenatedUid.write IconCompatParcelizer(int p0) {
        if (p0 == 0) {
            return getChildPeriodUidFromConcatenatedUid.write.AudioAttributesCompatParcelizer;
        }
        if (p0 == 1) {
            return getChildPeriodUidFromConcatenatedUid.write.RemoteActionCompatParcelizer;
        }
        if (p0 == 2) {
            return getChildPeriodUidFromConcatenatedUid.write.AudioAttributesImplBaseParcelizer;
        }
        if (p0 == 3) {
            return getChildPeriodUidFromConcatenatedUid.write.read;
        }
        if (p0 == 4) {
            return getChildPeriodUidFromConcatenatedUid.write.write;
        }
        if (p0 == 5) {
            return getChildPeriodUidFromConcatenatedUid.write.IconCompatParcelizer;
        }
        StringBuilder sb = new StringBuilder("Could not convert ");
        sb.append(p0);
        sb.append(" to State");
        throw new IllegalArgumentException(sb.toString());
    }

    @getMagicModuleMeta
    public static final int read(verifyPendingInstall p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        int i = AudioAttributesCompatParcelizer.write[p0.ordinal()];
        if (i == 1) {
            return 0;
        }
        if (i == 2) {
            return 1;
        }
        throw new RenewEligibleCreator();
    }

    @getMagicModuleMeta
    public static final verifyPendingInstall read(int p0) {
        if (p0 == 0) {
            return verifyPendingInstall.AudioAttributesCompatParcelizer;
        }
        if (p0 == 1) {
            return verifyPendingInstall.RemoteActionCompatParcelizer;
        }
        StringBuilder sb = new StringBuilder("Could not convert ");
        sb.append(p0);
        sb.append(" to BackoffPolicy");
        throw new IllegalArgumentException(sb.toString());
    }

    @getMagicModuleMeta
    public static final int read(ia p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        int i = AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer[p0.ordinal()];
        if (i == 1) {
            return 0;
        }
        if (i == 2) {
            return 1;
        }
        if (i == 3) {
            return 2;
        }
        if (i == 4) {
            return 3;
        }
        if (i == 5) {
            return 4;
        }
        if (Build.VERSION.SDK_INT >= 30 && p0 == ia.IconCompatParcelizer) {
            return 5;
        }
        StringBuilder sb = new StringBuilder("Could not convert ");
        sb.append(p0);
        sb.append(" to int");
        throw new IllegalArgumentException(sb.toString());
    }

    @getMagicModuleMeta
    public static final ia RemoteActionCompatParcelizer(int p0) {
        if (p0 == 0) {
            return ia.RemoteActionCompatParcelizer;
        }
        if (p0 == 1) {
            return ia.write;
        }
        if (p0 == 2) {
            return ia.AudioAttributesImplBaseParcelizer;
        }
        if (p0 == 3) {
            return ia.read;
        }
        if (p0 == 4) {
            return ia.AudioAttributesCompatParcelizer;
        }
        if (Build.VERSION.SDK_INT >= 30 && p0 == 5) {
            return ia.IconCompatParcelizer;
        }
        StringBuilder sb = new StringBuilder("Could not convert ");
        sb.append(p0);
        sb.append(" to NetworkType");
        throw new IllegalArgumentException(sb.toString());
    }

    @getMagicModuleMeta
    public static final int read(qaa p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        int i = AudioAttributesCompatParcelizer.IconCompatParcelizer[p0.ordinal()];
        if (i == 1) {
            return 0;
        }
        if (i == 2) {
            return 1;
        }
        throw new RenewEligibleCreator();
    }

    @getMagicModuleMeta
    public static final qaa write(int p0) {
        if (p0 == 0) {
            return qaa.write;
        }
        if (p0 == 1) {
            return qaa.AudioAttributesCompatParcelizer;
        }
        StringBuilder sb = new StringBuilder("Could not convert ");
        sb.append(p0);
        sb.append(" to OutOfQuotaPolicy");
        throw new IllegalArgumentException(sb.toString());
    }

    @getMagicModuleMeta
    public static final byte[] read(Set<e.read> p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        if (p0.isEmpty()) {
            return new byte[0];
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ObjectOutputStream objectOutputStream = byteArrayOutputStream;
        try {
            ByteArrayOutputStream byteArrayOutputStream2 = objectOutputStream;
            objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
            try {
                ObjectOutputStream objectOutputStream2 = objectOutputStream;
                objectOutputStream2.writeInt(p0.size());
                for (e.read readVar : p0) {
                    objectOutputStream2.writeUTF(readVar.IconCompatParcelizer().toString());
                    objectOutputStream2.writeBoolean(readVar.AudioAttributesCompatParcelizer());
                }
                getShowPopup getshowpopup = getShowPopup.INSTANCE;
                MagicModuleMetaLSModel.IconCompatParcelizer(objectOutputStream, null);
                getShowPopup getshowpopup2 = getShowPopup.INSTANCE;
                MagicModuleMetaLSModel.IconCompatParcelizer(objectOutputStream, null);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(byteArray, "");
                return byteArray;
            } finally {
            }
        } finally {
        }
    }

    @getMagicModuleMeta
    public static final Set<e.read> RemoteActionCompatParcelizer(byte[] p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        if (p0.length == 0) {
            return linkedHashSet;
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(p0);
        ObjectInputStream objectInputStream = byteArrayInputStream;
        try {
            ByteArrayInputStream byteArrayInputStream2 = objectInputStream;
            try {
                objectInputStream = new ObjectInputStream(byteArrayInputStream);
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                ObjectInputStream objectInputStream2 = objectInputStream;
                int i = objectInputStream2.readInt();
                for (int i2 = 0; i2 < i; i2++) {
                    Uri uri = Uri.parse(objectInputStream2.readUTF());
                    boolean z = objectInputStream2.readBoolean();
                    toMagicModuleMetaRepoModel.write(uri);
                    linkedHashSet.add(new e.read(uri, z));
                }
                getShowPopup getshowpopup = getShowPopup.INSTANCE;
                MagicModuleMetaLSModel.IconCompatParcelizer(objectInputStream, null);
                getShowPopup getshowpopup2 = getShowPopup.INSTANCE;
                MagicModuleMetaLSModel.IconCompatParcelizer(objectInputStream, null);
                return linkedHashSet;
            } finally {
            }
        } finally {
            try {
                throw th;
            } finally {
            }
        }
    }

    @getMagicModuleMeta
    public static final buildTextRenderers write(byte[] p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        if (p0.length == 0) {
            return new buildTextRenderers(null);
        }
        ObjectInputStream byteArrayInputStream = new ByteArrayInputStream(p0);
        try {
            byteArrayInputStream = new ObjectInputStream(byteArrayInputStream);
            try {
                ObjectInputStream objectInputStream = byteArrayInputStream;
                int i = objectInputStream.readInt();
                int[] iArr = new int[i];
                for (int i2 = 0; i2 < i; i2++) {
                    iArr[i2] = objectInputStream.readInt();
                }
                int i3 = objectInputStream.readInt();
                int[] iArr2 = new int[i3];
                for (int i4 = 0; i4 < i3; i4++) {
                    iArr2[i4] = objectInputStream.readInt();
                }
                buildCameraMotionRenderers buildcameramotionrenderers = buildCameraMotionRenderers.INSTANCE;
                buildTextRenderers buildtextrenderersIconCompatParcelizer = buildCameraMotionRenderers.IconCompatParcelizer(iArr2, iArr);
                MagicModuleMetaLSModel.IconCompatParcelizer(byteArrayInputStream, null);
                MagicModuleMetaLSModel.IconCompatParcelizer(byteArrayInputStream, null);
                return buildtextrenderersIconCompatParcelizer;
            } finally {
            }
        } finally {
        }
    }

    @getMagicModuleMeta
    public static final byte[] read(buildTextRenderers p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        NetworkRequest networkRequestIconCompatParcelizer = p0.IconCompatParcelizer();
        if (networkRequestIconCompatParcelizer == null) {
            return new byte[0];
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ObjectOutputStream objectOutputStream = byteArrayOutputStream;
        try {
            objectOutputStream = new ObjectOutputStream(objectOutputStream);
            try {
                ObjectOutputStream objectOutputStream2 = objectOutputStream;
                int[] iArrWrite = buildMetadataRenderers.write(networkRequestIconCompatParcelizer);
                int[] iArr = buildMetadataRenderers.read(networkRequestIconCompatParcelizer);
                objectOutputStream2.writeInt(iArrWrite.length);
                for (int i : iArrWrite) {
                    objectOutputStream2.writeInt(i);
                }
                objectOutputStream2.writeInt(iArr.length);
                for (int i2 : iArr) {
                    objectOutputStream2.writeInt(i2);
                }
                getShowPopup getshowpopup = getShowPopup.INSTANCE;
                MagicModuleMetaLSModel.IconCompatParcelizer(objectOutputStream, null);
                getShowPopup getshowpopup2 = getShowPopup.INSTANCE;
                MagicModuleMetaLSModel.IconCompatParcelizer(objectOutputStream, null);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(byteArray, "");
                return byteArray;
            } finally {
            }
        } finally {
        }
    }
}
