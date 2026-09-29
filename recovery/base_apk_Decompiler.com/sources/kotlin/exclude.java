package kotlin;

import org.json.JSONException;

/* JADX INFO: loaded from: classes3.dex */
public final class exclude implements getPriorityCount {
    private static int AudioAttributesCompatParcelizer = 1;
    private static int read;
    private final BundledChunkExtractor RemoteActionCompatParcelizer;
    private final DefaultDashChunkSourceFactory write;

    public static /* synthetic */ Object read(int i, int i2, Object[] objArr, int i3, int i4, int i5, int i6) {
        int i7 = ~i5;
        int i8 = ~i4;
        int i9 = (~(i7 | i8 | (~i))) | (~(i5 | i4 | i));
        int i10 = (~(i8 | i)) | (~(i8 | i5));
        int i11 = (~(i | i4)) | i5;
        int i12 = i5 + i4 + i6 + (1661237432 * i3) + (961048624 * i2);
        int i13 = i12 * i12;
        int i14 = ((119520104 * i5) - 281083904) + ((-1329838950) * i4) + (i9 * 724679527) + (724679527 * i10) + ((-724679527) * i11) + ((-605159424) * i6) + ((-1559232512) * i3) + (1553989632 * i2) + (2020540416 * i13);
        int i15 = (i5 * (-2040814728)) + 92927091 + (i4 * (-2040813538)) + (i9 * (-595)) + (i10 * (-595)) + (i11 * 595) + (i6 * (-2040814133)) + (i3 * (-1614655000)) + (i2 * 500164112) + (i13 * 184877056);
        int i16 = i14 + (i15 * i15 * 1800994816);
        return i16 != 1 ? i16 != 2 ? i16 != 3 ? i16 != 4 ? i16 != 5 ? read(objArr) : AudioAttributesImplApi26Parcelizer(objArr) : IconCompatParcelizer(objArr) : AudioAttributesCompatParcelizer(objArr) : RemoteActionCompatParcelizer(objArr) : write(objArr);
    }

    public exclude(DefaultDashChunkSourceFactory defaultDashChunkSourceFactory, BundledChunkExtractor bundledChunkExtractor) {
        toMagicModuleMetaRepoModel.write(defaultDashChunkSourceFactory, "");
        toMagicModuleMetaRepoModel.write(bundledChunkExtractor, "");
        this.write = defaultDashChunkSourceFactory;
        this.RemoteActionCompatParcelizer = bundledChunkExtractor;
    }

    private static /* synthetic */ Object RemoteActionCompatParcelizer(Object[] objArr) {
        exclude excludeVar = (exclude) objArr[0];
        String str = (String) objArr[1];
        int i = 2 % 2;
        int i2 = read;
        int i3 = (-2) - ((((i2 | 34) << 1) - (i2 ^ 34)) ^ (-1));
        AudioAttributesCompatParcelizer = i3 % 128;
        if (i3 % 2 != 0) {
            toMagicModuleMetaRepoModel.write(str, "");
            return excludeVar.write.AudioAttributesImplApi26Parcelizer(str);
        }
        toMagicModuleMetaRepoModel.write(str, "");
        excludeVar.write.AudioAttributesImplApi26Parcelizer(str);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object AudioAttributesImplApi26Parcelizer(Object[] objArr) {
        exclude excludeVar = (exclude) objArr[0];
        getPrimaryStreamIndex getprimarystreamindex = (getPrimaryStreamIndex) objArr[1];
        int i = 2 % 2;
        int i2 = read + 17;
        AudioAttributesCompatParcelizer = i2 % 128;
        if (i2 % 2 != 0) {
            toMagicModuleMetaRepoModel.write(getprimarystreamindex, "");
            int iOnRemoveQueueItem = getExamName.onRemoveQueueItem();
            int iOnRemoveQueueItem2 = getExamName.onRemoveQueueItem();
            read(iOnRemoveQueueItem, getExamName.onRemoveQueueItem(), new Object[]{excludeVar, "--1", getprimarystreamindex}, getExamName.onRemoveQueueItem(), -1863111724, 1863111728, iOnRemoveQueueItem2);
            return null;
        }
        toMagicModuleMetaRepoModel.write(getprimarystreamindex, "");
        int iOnRemoveQueueItem3 = getExamName.onRemoveQueueItem();
        int iOnRemoveQueueItem4 = getExamName.onRemoveQueueItem();
        int iOnRemoveQueueItem5 = getExamName.onRemoveQueueItem();
        read(iOnRemoveQueueItem3, getExamName.onRemoveQueueItem(), new Object[]{excludeVar, "--1", getprimarystreamindex}, iOnRemoveQueueItem5, -1863111724, 1863111728, iOnRemoveQueueItem4);
        int i3 = 41 / 0;
        return null;
    }

    private static /* synthetic */ Object AudioAttributesCompatParcelizer(Object[] objArr) {
        exclude excludeVar = (exclude) objArr[0];
        int i = 2 % 2;
        int i2 = (-2) - ((AudioAttributesCompatParcelizer + 52) ^ (-1));
        read = i2 % 128;
        int i3 = i2 % 2;
        int iOnRemoveQueueItem = excludeVar.RemoteActionCompatParcelizer.onRemoveQueueItem();
        if (i3 != 0) {
            int i4 = 36 / 0;
        }
        int i5 = AudioAttributesCompatParcelizer;
        int i6 = i5 & 59;
        int i7 = (i6 - (~((i5 ^ 59) | i6))) - 1;
        read = i7 % 128;
        int i8 = i7 % 2;
        return Integer.valueOf(iOnRemoveQueueItem);
    }

    private static /* synthetic */ Object write(Object[] objArr) {
        exclude excludeVar = (exclude) objArr[0];
        int i = 2 % 2;
        int i2 = read + 79;
        AudioAttributesCompatParcelizer = i2 % 128;
        int i3 = i2 % 2;
        int iOnPrepareFromUri = excludeVar.RemoteActionCompatParcelizer.onPrepareFromUri();
        if (i3 == 0) {
            int i4 = 41 / 0;
        }
        return Integer.valueOf(iOnPrepareFromUri);
    }

    private static /* synthetic */ Object IconCompatParcelizer(Object[] objArr) throws JSONException {
        exclude excludeVar = (exclude) objArr[0];
        String str = (String) objArr[1];
        getPrimaryStreamIndex getprimarystreamindex = (getPrimaryStreamIndex) objArr[2];
        int i = 2 % 2;
        int i2 = AudioAttributesCompatParcelizer;
        int i3 = i2 ^ 79;
        int i4 = (((i2 & 79) | i3) << 1) - i3;
        read = i4 % 128;
        int i5 = i4 % 2;
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(getprimarystreamindex, "");
        int i6 = read + 89;
        AudioAttributesCompatParcelizer = i6 % 128;
        int i7 = i6 % 2;
        excludeVar.write.AudioAttributesCompatParcelizer(findDescriptor.read(getprimarystreamindex, str));
        int i8 = AudioAttributesCompatParcelizer;
        int i9 = ((i8 & 64) + (i8 | 64)) - 1;
        read = i9 % 128;
        if (i9 % 2 == 0) {
            return null;
        }
        throw null;
    }

    private static /* synthetic */ Object read(Object[] objArr) {
        exclude excludeVar = (exclude) objArr[0];
        int i = 2 % 2;
        int i2 = (-2) - ((read + 84) ^ (-1));
        AudioAttributesCompatParcelizer = i2 % 128;
        int i3 = i2 % 2;
        DashChunkSource dashChunkSourceAudioAttributesImplApi26Parcelizer = excludeVar.write.AudioAttributesImplApi26Parcelizer("--1");
        if (i3 == 0) {
            int i4 = 66 / 0;
        }
        return dashChunkSourceAudioAttributesImplApi26Parcelizer;
    }

    @Override // kotlin.getPriorityCount
    public final DashChunkSource AudioAttributesCompatParcelizer(String str) {
        int iOnRemoveQueueItem = getExamName.onRemoveQueueItem();
        int iOnRemoveQueueItem2 = getExamName.onRemoveQueueItem();
        int iOnRemoveQueueItem3 = getExamName.onRemoveQueueItem();
        return (DashChunkSource) read(iOnRemoveQueueItem, getExamName.onRemoveQueueItem(), new Object[]{this, str}, iOnRemoveQueueItem3, -1799309325, 1799309327, iOnRemoveQueueItem2);
    }

    @Override // kotlin.getPriorityCount
    public final int write() {
        int iOnRemoveQueueItem = getExamName.onRemoveQueueItem();
        int iOnRemoveQueueItem2 = getExamName.onRemoveQueueItem();
        int iOnRemoveQueueItem3 = getExamName.onRemoveQueueItem();
        return ((Integer) read(iOnRemoveQueueItem, getExamName.onRemoveQueueItem(), new Object[]{this}, iOnRemoveQueueItem3, -1686630051, 1686630054, iOnRemoveQueueItem2)).intValue();
    }

    @Override // kotlin.getPriorityCount
    public final int read() {
        int iOnRemoveQueueItem = getExamName.onRemoveQueueItem();
        int iOnRemoveQueueItem2 = getExamName.onRemoveQueueItem();
        int iOnRemoveQueueItem3 = getExamName.onRemoveQueueItem();
        return ((Integer) read(iOnRemoveQueueItem, getExamName.onRemoveQueueItem(), new Object[]{this}, iOnRemoveQueueItem3, -538244579, 538244580, iOnRemoveQueueItem2)).intValue();
    }

    @Override // kotlin.getPriorityCount
    public final DashChunkSource RemoteActionCompatParcelizer() {
        int iOnRemoveQueueItem = getExamName.onRemoveQueueItem();
        int iOnRemoveQueueItem2 = getExamName.onRemoveQueueItem();
        int iOnRemoveQueueItem3 = getExamName.onRemoveQueueItem();
        return (DashChunkSource) read(iOnRemoveQueueItem, getExamName.onRemoveQueueItem(), new Object[]{this}, iOnRemoveQueueItem3, 836435, -836435, iOnRemoveQueueItem2);
    }

    private void read(String str, getPrimaryStreamIndex getprimarystreamindex) {
        int iOnRemoveQueueItem = getExamName.onRemoveQueueItem();
        int iOnRemoveQueueItem2 = getExamName.onRemoveQueueItem();
        int iOnRemoveQueueItem3 = getExamName.onRemoveQueueItem();
        read(iOnRemoveQueueItem, getExamName.onRemoveQueueItem(), new Object[]{this, str, getprimarystreamindex}, iOnRemoveQueueItem3, -1863111724, 1863111728, iOnRemoveQueueItem2);
    }

    @Override // kotlin.getPriorityCount
    public final void IconCompatParcelizer(getPrimaryStreamIndex getprimarystreamindex) {
        int iOnRemoveQueueItem = getExamName.onRemoveQueueItem();
        int iOnRemoveQueueItem2 = getExamName.onRemoveQueueItem();
        int iOnRemoveQueueItem3 = getExamName.onRemoveQueueItem();
        read(iOnRemoveQueueItem, getExamName.onRemoveQueueItem(), new Object[]{this, getprimarystreamindex}, iOnRemoveQueueItem3, -407976718, 407976723, iOnRemoveQueueItem2);
    }
}
