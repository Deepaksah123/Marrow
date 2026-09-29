package kotlin;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t"}, d2 = {"Lo/TreeNode;", "", "<init>", "(Ljava/lang/String;I)V", "AudioAttributesCompatParcelizer", "write", "AudioAttributesImplBaseParcelizer", "IconCompatParcelizer", "RemoteActionCompatParcelizer", "read"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class TreeNode {
    private static final /* synthetic */ TreeNode[] AudioAttributesImplApi21Parcelizer;
    private static final /* synthetic */ getMagicModuleSavedMcqCount MediaBrowserCompatCustomActionResultReceiver;
    public static final TreeNode AudioAttributesCompatParcelizer = new TreeNode("DefaultSpatial", 0);
    public static final TreeNode write = new TreeNode("FastSpatial", 1);
    public static final TreeNode AudioAttributesImplBaseParcelizer = new TreeNode("SlowSpatial", 2);
    public static final TreeNode IconCompatParcelizer = new TreeNode("DefaultEffects", 3);
    public static final TreeNode RemoteActionCompatParcelizer = new TreeNode("FastEffects", 4);
    public static final TreeNode read = new TreeNode("SlowEffects", 5);

    private TreeNode(String str, int i) {
    }

    static {
        TreeNode[] treeNodeArrAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer();
        AudioAttributesImplApi21Parcelizer = treeNodeArrAudioAttributesCompatParcelizer;
        MediaBrowserCompatCustomActionResultReceiver = getMagicModuleTimeline.IconCompatParcelizer(treeNodeArrAudioAttributesCompatParcelizer);
    }

    public static TreeNode valueOf(String str) {
        return (TreeNode) Enum.valueOf(TreeNode.class, str);
    }

    public static TreeNode[] values() {
        return (TreeNode[]) AudioAttributesImplApi21Parcelizer.clone();
    }

    private static final /* synthetic */ TreeNode[] AudioAttributesCompatParcelizer() {
        return new TreeNode[]{AudioAttributesCompatParcelizer, write, AudioAttributesImplBaseParcelizer, IconCompatParcelizer, RemoteActionCompatParcelizer, read};
    }
}
