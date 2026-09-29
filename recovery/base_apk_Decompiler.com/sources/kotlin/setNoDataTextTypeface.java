package kotlin;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\u0018\u0000 \u001d2\u00020\u0001:\u0004\u001d\u0018\u0019\u0016BC\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0007¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0018\u001a\u00020\u00028\u0006¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u001d\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0017\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0019\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u00078\u0006¢\u0006\u0006\n\u0004\b\u0018\u0010\u001c"}, d2 = {"Lo/setNoDataTextTypeface;", "", "", "p0", "", "Lo/setNoDataTextTypeface$write;", "p1", "", "Lo/setNoDataTextTypeface$AudioAttributesCompatParcelizer;", "p2", "Lo/setNoDataTextTypeface$IconCompatParcelizer;", "p3", "<init>", "(Ljava/lang/String;Ljava/util/Map;Ljava/util/Set;Ljava/util/Set;)V", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "IconCompatParcelizer", "Ljava/lang/String;", "write", "AudioAttributesCompatParcelizer", "Ljava/util/Map;", "RemoteActionCompatParcelizer", "Ljava/util/Set;", "read"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class setNoDataTextTypeface {

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    public final Map<String, write> IconCompatParcelizer;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    public final String write;
    public final Set<AudioAttributesCompatParcelizer> RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    public final Set<IconCompatParcelizer> AudioAttributesCompatParcelizer;

    public setNoDataTextTypeface(String str, Map<String, write> map, Set<AudioAttributesCompatParcelizer> set, Set<IconCompatParcelizer> set2) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(map, "");
        toMagicModuleMetaRepoModel.write(set, "");
        this.write = str;
        this.IconCompatParcelizer = map;
        this.RemoteActionCompatParcelizer = set;
        this.AudioAttributesCompatParcelizer = set2;
    }

    public final boolean equals(Object p0) {
        return setMaxHighlightDistance.IconCompatParcelizer(this, p0);
    }

    public final int hashCode() {
        return setMaxHighlightDistance.read(this);
    }

    public final String toString() {
        return setMaxHighlightDistance.write(this);
    }

    /* JADX INFO: renamed from: o.setNoDataTextTypeface$read, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Lo/setNoDataTextTypeface$read;", "", "<init>", "()V", "Lo/setDrawHoleEnabled;", "p0", "", "p1", "Lo/setNoDataTextTypeface;", "write", "(Lo/setDrawHoleEnabled;Ljava/lang/String;)Lo/setNoDataTextTypeface;"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @getMagicModuleMeta
        public static setNoDataTextTypeface write(setDrawHoleEnabled p0, String p1) {
            toMagicModuleMetaRepoModel.write(p0, "");
            toMagicModuleMetaRepoModel.write(p1, "");
            return setOnChartGestureListener.AudioAttributesCompatParcelizer(p0, p1);
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0017\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\n\u001a\u00020\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\r\u001a\u00020\u00052\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0015\u001a\u00020\u00028\u0006¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0017\u001a\u00020\u00028\u0006¢\u0006\u0006\n\u0004\b\u0016\u0010\u0014R\u0011\u0010\u0013\u001a\u00020\u00058\u0006¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0011\u0010\u001c\u001a\u00020\u00078\u0006¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0013\u0010\u001d\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\u0006\n\u0004\b\u001c\u0010\u0014R\u0011\u0010\u0016\u001a\u00020\u00078\u0006¢\u0006\u0006\n\u0004\b\u001d\u0010\u001bR\u0011\u0010\u0018\u001a\u00020\u00078\u0006¢\u0006\u0006\n\u0004\b\u0015\u0010\u001bR\u0011\u0010\u001a\u001a\u00020\u00058G¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001e"}, d2 = {"Lo/setNoDataTextTypeface$write;", "", "", "p0", "p1", "", "p2", "", "p3", "p4", "p5", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "()Ljava/lang/String;", "write", "Ljava/lang/String;", "read", "MediaBrowserCompatItemReceiver", "IconCompatParcelizer", "AudioAttributesImplApi21Parcelizer", "Z", "AudioAttributesImplApi26Parcelizer", "I", "AudioAttributesCompatParcelizer", "RemoteActionCompatParcelizer", "()Z"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class write {

        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
        public final String RemoteActionCompatParcelizer;

        /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: from kotlin metadata */
        public final boolean write;

        /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: from kotlin metadata */
        public final int AudioAttributesCompatParcelizer;

        /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: from kotlin metadata */
        public final String IconCompatParcelizer;

        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
        public final int MediaBrowserCompatItemReceiver;

        /* JADX INFO: renamed from: read, reason: from kotlin metadata */
        public final int AudioAttributesImplApi21Parcelizer;

        /* JADX INFO: renamed from: write, reason: from kotlin metadata */
        public final String read;

        public write(String str, String str2, boolean z, int i, String str3, int i2) {
            toMagicModuleMetaRepoModel.write(str, "");
            toMagicModuleMetaRepoModel.write(str2, "");
            this.read = str;
            this.IconCompatParcelizer = str2;
            this.write = z;
            this.AudioAttributesCompatParcelizer = i;
            this.RemoteActionCompatParcelizer = str3;
            this.MediaBrowserCompatItemReceiver = i2;
            this.AudioAttributesImplApi21Parcelizer = setOnChartGestureListener.read(str2);
        }

        public final boolean AudioAttributesCompatParcelizer() {
            return this.AudioAttributesCompatParcelizer > 0;
        }

        public final boolean equals(Object p0) {
            return setMaxHighlightDistance.write(this, p0);
        }

        public final int hashCode() {
            return setMaxHighlightDistance.AudioAttributesCompatParcelizer(this);
        }

        public final String toString() {
            return setMaxHighlightDistance.IconCompatParcelizer(this);
        }
    }

    public static final class AudioAttributesCompatParcelizer {
        public final List<String> AudioAttributesCompatParcelizer;
        public final String IconCompatParcelizer;
        public final String RemoteActionCompatParcelizer;
        public final String read;
        public final List<String> write;

        public AudioAttributesCompatParcelizer(String str, String str2, String str3, List<String> list, List<String> list2) {
            toMagicModuleMetaRepoModel.write(str, "");
            toMagicModuleMetaRepoModel.write(str2, "");
            toMagicModuleMetaRepoModel.write(str3, "");
            toMagicModuleMetaRepoModel.write(list, "");
            toMagicModuleMetaRepoModel.write(list2, "");
            this.RemoteActionCompatParcelizer = str;
            this.IconCompatParcelizer = str2;
            this.read = str3;
            this.write = list;
            this.AudioAttributesCompatParcelizer = list2;
        }

        public final boolean equals(Object obj) {
            return setMaxHighlightDistance.AudioAttributesCompatParcelizer(this, obj);
        }

        public final int hashCode() {
            return setMaxHighlightDistance.AudioAttributesCompatParcelizer(this);
        }

        public final String toString() {
            return setMaxHighlightDistance.RemoteActionCompatParcelizer(this);
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\f\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000b\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0014\u001a\u00020\u00028\u0006¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0015\u001a\u00020\u00048\u0006¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00020\u00068\u0006¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001c\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u0018"}, d2 = {"Lo/setNoDataTextTypeface$IconCompatParcelizer;", "", "", "p0", "", "p1", "", "p2", "p3", "<init>", "(Ljava/lang/String;ZLjava/util/List;Ljava/util/List;)V", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "write", "Ljava/lang/String;", "IconCompatParcelizer", "RemoteActionCompatParcelizer", "Z", "read", "Ljava/util/List;", "AudioAttributesCompatParcelizer"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class IconCompatParcelizer {
        public List<String> AudioAttributesCompatParcelizer;
        public final boolean RemoteActionCompatParcelizer;
        public final List<String> read;

        /* JADX INFO: renamed from: write, reason: from kotlin metadata */
        public final String IconCompatParcelizer;

        public IconCompatParcelizer(String str, boolean z, List<String> list, List<String> list2) {
            toMagicModuleMetaRepoModel.write(str, "");
            toMagicModuleMetaRepoModel.write(list, "");
            toMagicModuleMetaRepoModel.write(list2, "");
            this.IconCompatParcelizer = str;
            this.RemoteActionCompatParcelizer = z;
            this.read = list;
            this.AudioAttributesCompatParcelizer = list2;
            ArrayList arrayList = list2;
            if (arrayList.isEmpty()) {
                int size = list.size();
                ArrayList arrayList2 = new ArrayList(size);
                for (int i = 0; i < size; i++) {
                    arrayList2.add("ASC");
                }
                arrayList = arrayList2;
            }
            this.AudioAttributesCompatParcelizer = arrayList;
        }

        public final boolean equals(Object p0) {
            return setMaxHighlightDistance.write(this, p0);
        }

        public final int hashCode() {
            return setMaxHighlightDistance.write(this);
        }

        public final String toString() {
            return setMaxHighlightDistance.RemoteActionCompatParcelizer(this);
        }
    }
}
