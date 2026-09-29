package kotlin;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.onActivityPostStarted;
import kotlin.onForceLoad;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010!\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0003)*+B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0016\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u00152\u0006\u0010\u0018\u001a\u00020\u000bH\u0002J\u000e\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u000bJ\u000e\u0010#\u001a\u00020\u000b2\u0006\u0010$\u001a\u00020\u000bJ\u0016\u0010%\u001a\u00020\u000b2\u0006\u0010$\u001a\u00020\u000b2\u0006\u0010&\u001a\u00020\u000bJ\b\u0010'\u001a\u00020(H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\b0\u0007j\b\u0012\u0004\u0012\u00020\b`\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\u00020\u000b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u000e\u0010\u000e\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0019\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\rR$\u0010\u001c\u001a\u00020\u000b2\u0006\u0010\u001b\u001a\u00020\u000b@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\r\"\u0004\b\u001e\u0010\u001f¨\u0006,"}, d2 = {"Landroidx/compose/foundation/lazy/grid/LazyGridSpanLayoutProvider;", "", "gridContent", "Landroidx/compose/foundation/lazy/grid/LazyGridIntervalContent;", "<init>", "(Landroidx/compose/foundation/lazy/grid/LazyGridIntervalContent;)V", "buckets", "Ljava/util/ArrayList;", "Landroidx/compose/foundation/lazy/grid/LazyGridSpanLayoutProvider$Bucket;", "Lkotlin/collections/ArrayList;", "bucketSize", "", "getBucketSize", "()I", "lastLineIndex", "lastLineStartItemIndex", "lastLineStartKnownSpan", "cachedBucketIndex", "cachedBucket", "", "previousDefaultSpans", "", "Landroidx/compose/foundation/lazy/grid/GridItemSpan;", "getDefaultSpans", "currentSlotsPerLine", "totalSize", "getTotalSize", AppMeasurementSdk.ConditionalUserProperty.VALUE, "slotsPerLine", "getSlotsPerLine", "setSlotsPerLine", "(I)V", "getLineConfiguration", "Landroidx/compose/foundation/lazy/grid/LazyGridSpanLayoutProvider$LineConfiguration;", "lineIndex", "getLineIndexOfItem", "itemIndex", "spanOf", "maxSpan", "invalidateCache", "", "LineConfiguration", "Bucket", "LazyGridItemSpanScopeImpl", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class onActivityPostStarted {
    private final lambdainit1androidxfragmentappFragmentActivity AudioAttributesCompatParcelizer;
    private int AudioAttributesImplApi21Parcelizer;
    private int AudioAttributesImplApi26Parcelizer;
    private int IconCompatParcelizer;
    private List<init> MediaBrowserCompatCustomActionResultReceiver;
    private int MediaBrowserCompatItemReceiver;
    private final ArrayList<RemoteActionCompatParcelizer> RemoteActionCompatParcelizer;
    private final List<Integer> read;
    private int write;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u000b\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR \u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010"}, d2 = {"Lo/onActivityPostStarted$IconCompatParcelizer;", "", "", "p0", "", "Lo/init;", "p1", "<init>", "(ILjava/util/List;)V", "AudioAttributesCompatParcelizer", "I", "RemoteActionCompatParcelizer", "()I", "write", "Ljava/util/List;", "IconCompatParcelizer", "()Ljava/util/List;"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class IconCompatParcelizer {

        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
        private final int RemoteActionCompatParcelizer;
        private final List<init> write;

        public IconCompatParcelizer(int i, List<init> list) {
            this.RemoteActionCompatParcelizer = i;
            this.write = list;
        }

        public final List<init> IconCompatParcelizer() {
            return this.write;
        }

        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from getter */
        public final int getRemoteActionCompatParcelizer() {
            return this.RemoteActionCompatParcelizer;
        }
    }

    public onActivityPostStarted(lambdainit1androidxfragmentappFragmentActivity lambdainit1androidxfragmentappfragmentactivity) {
        this.AudioAttributesCompatParcelizer = lambdainit1androidxfragmentappfragmentactivity;
        ArrayList<RemoteActionCompatParcelizer> arrayList = new ArrayList<>();
        int i = 0;
        arrayList.add(new RemoteActionCompatParcelizer(i, i, 2, null));
        this.RemoteActionCompatParcelizer = arrayList;
        this.IconCompatParcelizer = -1;
        this.read = new ArrayList();
        this.MediaBrowserCompatCustomActionResultReceiver = IntermediateLoginResponseBody.RemoteActionCompatParcelizer();
    }

    private final int read() {
        return ((int) Math.sqrt(((double) IconCompatParcelizer()) / ((double) this.MediaBrowserCompatItemReceiver))) + 1;
    }

    private final List<init> read(int i) {
        if (i == this.MediaBrowserCompatCustomActionResultReceiver.size()) {
            return this.MediaBrowserCompatCustomActionResultReceiver;
        }
        ArrayList arrayList = new ArrayList(i);
        for (int i2 = 0; i2 < i; i2++) {
            arrayList.add(init.AudioAttributesCompatParcelizer(registerIn.RemoteActionCompatParcelizer(1)));
        }
        ArrayList arrayList2 = arrayList;
        this.MediaBrowserCompatCustomActionResultReceiver = arrayList2;
        return arrayList2;
    }

    public final int IconCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer().getRemoteActionCompatParcelizer();
    }

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from getter */
    public final int getMediaBrowserCompatItemReceiver() {
        return this.MediaBrowserCompatItemReceiver;
    }

    public final void write(int i) {
        if (i != this.MediaBrowserCompatItemReceiver) {
            this.MediaBrowserCompatItemReceiver = i;
            write();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x008e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final o.onActivityPostStarted.IconCompatParcelizer AudioAttributesCompatParcelizer(int r11) {
        /*
            Method dump skipped, instruction units count: 351
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.onActivityPostStarted.AudioAttributesCompatParcelizer(int):o.onActivityPostStarted$IconCompatParcelizer");
    }

    public final int RemoteActionCompatParcelizer(final int i) {
        int i2 = 0;
        if (IconCompatParcelizer() <= 0) {
            return 0;
        }
        if (i >= IconCompatParcelizer()) {
            getRootStableInsets.RemoteActionCompatParcelizer("ItemIndex > total count");
        }
        if (!this.AudioAttributesCompatParcelizer.getIconCompatParcelizer()) {
            return i / this.MediaBrowserCompatItemReceiver;
        }
        ArrayList<RemoteActionCompatParcelizer> arrayList = this.RemoteActionCompatParcelizer;
        int iIconCompatParcelizer = IntermediateLoginResponseBody.IconCompatParcelizer(arrayList, 0, arrayList.size(), new getAnswerMap() { // from class: o.onActivityDestroyed
            @Override // kotlin.getAnswerMap
            public final Object invoke(Object obj) {
                return Integer.valueOf(onActivityPostStarted.read(i, (onActivityPostStarted.RemoteActionCompatParcelizer) obj));
            }
        });
        int i3 = 2;
        if (iIconCompatParcelizer < 0) {
            iIconCompatParcelizer = (-iIconCompatParcelizer) - 2;
        }
        int i4 = read() * iIconCompatParcelizer;
        int remoteActionCompatParcelizer = this.RemoteActionCompatParcelizer.get(iIconCompatParcelizer).getRemoteActionCompatParcelizer();
        if (remoteActionCompatParcelizer > i) {
            getRootStableInsets.RemoteActionCompatParcelizer("currentItemIndex > itemIndex");
        }
        int i5 = 0;
        while (remoteActionCompatParcelizer < i) {
            int i6 = remoteActionCompatParcelizer + 1;
            int iWrite = write(remoteActionCompatParcelizer, this.MediaBrowserCompatItemReceiver - i5);
            i5 += iWrite;
            int i7 = this.MediaBrowserCompatItemReceiver;
            if (i5 >= i7) {
                i4++;
                i5 = i5 == i7 ? 0 : iWrite;
            }
            if (i4 % read() == 0 && i4 / read() >= this.RemoteActionCompatParcelizer.size()) {
                this.RemoteActionCompatParcelizer.add(new RemoteActionCompatParcelizer(i6 - (i5 > 0 ? 1 : 0), i2, i3, null));
            }
            remoteActionCompatParcelizer = i6;
        }
        return i5 + write(i, this.MediaBrowserCompatItemReceiver - i5) > this.MediaBrowserCompatItemReceiver ? i4 + 1 : i4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int read(int i, RemoteActionCompatParcelizer remoteActionCompatParcelizer) {
        return remoteActionCompatParcelizer.getRemoteActionCompatParcelizer() - i;
    }

    public final int write(int i, int i2) {
        write writeVar = write.INSTANCE;
        writeVar.write(i2);
        writeVar.IconCompatParcelizer(this.MediaBrowserCompatItemReceiver);
        onForceLoad.write<lambdainit2androidxfragmentappFragmentActivity> writeVarRemoteActionCompatParcelizer = this.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer().RemoteActionCompatParcelizer(i);
        return init.RemoteActionCompatParcelizer(writeVarRemoteActionCompatParcelizer.RemoteActionCompatParcelizer().AudioAttributesCompatParcelizer().invoke(writeVar, Integer.valueOf(i - writeVarRemoteActionCompatParcelizer.getIconCompatParcelizer())).getWrite());
    }

    private final void write() {
        this.RemoteActionCompatParcelizer.clear();
        int i = 0;
        this.RemoteActionCompatParcelizer.add(new RemoteActionCompatParcelizer(i, i, 2, null));
        this.write = 0;
        this.AudioAttributesImplApi21Parcelizer = 0;
        this.AudioAttributesImplApi26Parcelizer = 0;
        this.IconCompatParcelizer = -1;
        this.read.clear();
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\n\b\u0002\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\n\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0007\u0010\tR\u001a\u0010\u000b\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\b\u001a\u0004\b\f\u0010\t"}, d2 = {"Lo/onActivityPostStarted$RemoteActionCompatParcelizer;", "", "", "p0", "p1", "<init>", "(II)V", "IconCompatParcelizer", "I", "()I", "RemoteActionCompatParcelizer", "read", "write"}, k = 1, mv = {2, 0, 0}, xi = 48)
    static final class RemoteActionCompatParcelizer {

        /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
        private final int RemoteActionCompatParcelizer;
        private final int read;

        public RemoteActionCompatParcelizer(int i, int i2) {
            this.RemoteActionCompatParcelizer = i;
            this.read = i2;
        }

        public /* synthetic */ RemoteActionCompatParcelizer(int i, int i2, int i3, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this(i, (i3 & 2) != 0 ? 0 : i2);
        }

        /* JADX INFO: renamed from: IconCompatParcelizer, reason: from getter */
        public final int getRemoteActionCompatParcelizer() {
            return this.RemoteActionCompatParcelizer;
        }

        /* JADX INFO: renamed from: write, reason: from getter */
        public final int getRead() {
            return this.read;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001c\u0010\t\u001a\u00020\u00048\u0016@\u0017X\u0096\u000e¢\u0006\f\n\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\u0007\u001a\u00020\u00048\u0016@\u0017X\u0097\u000e¢\u0006\f\n\u0004\b\n\u0010\u0006\"\u0004\b\u0005\u0010\b"}, d2 = {"Lo/onActivityPostStarted$write;", "Lo/setLayoutTransition;", "<init>", "()V", "", "IconCompatParcelizer", "I", "write", "(I)V", "AudioAttributesCompatParcelizer", "read"}, k = 1, mv = {2, 0, 0}, xi = 48)
    static final class write implements setLayoutTransition {
        public static final write INSTANCE = new write();

        /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
        private static int AudioAttributesCompatParcelizer;

        /* JADX INFO: renamed from: read, reason: from kotlin metadata */
        private static int write;

        private write() {
        }

        public final void write(int i) {
            AudioAttributesCompatParcelizer = i;
        }

        public final void IconCompatParcelizer(int i) {
            write = i;
        }
    }
}
