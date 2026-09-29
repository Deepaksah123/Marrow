package kotlin;

import java.util.TreeMap;

/* JADX INFO: loaded from: classes4.dex */
final class javaMemberIsRequired {
    final String AudioAttributesCompatParcelizer;
    long AudioAttributesImplApi21Parcelizer = 0;
    final TreeMap<Integer, Integer> AudioAttributesImplApi26Parcelizer;
    final long IconCompatParcelizer;
    final int MediaBrowserCompatCustomActionResultReceiver;
    final int MediaBrowserCompatItemReceiver;
    final String RemoteActionCompatParcelizer;
    int[] read;
    int write;

    javaMemberIsRequired(String str, String str2, long j, int i, int i2, int i3, int[] iArr, TreeMap<Integer, Integer> treeMap) {
        this.RemoteActionCompatParcelizer = str;
        this.AudioAttributesCompatParcelizer = str2;
        this.IconCompatParcelizer = j;
        this.write = i;
        this.MediaBrowserCompatCustomActionResultReceiver = i2;
        this.MediaBrowserCompatItemReceiver = i3;
        this.read = iArr;
        this.AudioAttributesImplApi26Parcelizer = treeMap;
    }
}
