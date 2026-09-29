package kotlin;

import android.content.Intent;
import android.os.Bundle;
import com.marrow.data.models.custommodule.FilterParams;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0086\b\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010BS\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\u0006\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0003\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cR\u0011\u0010\u001e\u001a\u00020\u00028\u0006¢\u0006\u0006\n\u0004\b\u0014\u0010\u001dR\u0017\u0010\u001f\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u001f\u0010\u001d\u001a\u0004\b\u001e\u0010\u001cR\u001a\u0010\u0010\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001d\u001a\u0004\b\u001f\u0010\u001cR\u001a\u0010\"\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010\u001aR \u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00020\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u0014\u0010#\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\"\u0010!R\u001a\u0010%\u001a\u00020\u000b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b\u0014\u0010)"}, d2 = {"Lo/BlockingServiceConnection;", "", "", "p0", "p1", "p2", "", "p3", "", "p4", "p5", "Lo/readBlockToCache;", "p6", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/util/List;ILo/readBlockToCache;)V", "Landroid/os/Bundle;", "write", "()Landroid/os/Bundle;", "Landroid/content/Intent;", "", "RemoteActionCompatParcelizer", "(Landroid/content/Intent;)V", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "()Ljava/lang/String;", "Ljava/lang/String;", "AudioAttributesCompatParcelizer", "read", "MediaBrowserCompatCustomActionResultReceiver", "I", "IconCompatParcelizer", "AudioAttributesImplApi21Parcelizer", "Ljava/util/List;", "MediaBrowserCompatItemReceiver", "()Ljava/util/List;", "AudioAttributesImplApi26Parcelizer", "Lo/readBlockToCache;", "()Lo/readBlockToCache;"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class BlockingServiceConnection {

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final String write;

    /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: from kotlin metadata */
    private final List<String> RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: from kotlin metadata */
    private final readBlockToCache MediaBrowserCompatItemReceiver;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final int AudioAttributesImplApi21Parcelizer;

    /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from kotlin metadata */
    private final int IconCompatParcelizer;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final String AudioAttributesCompatParcelizer;
    private final String read;

    public BlockingServiceConnection(String str, String str2, String str3, int i, List<String> list, int i2, readBlockToCache readblocktocache) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(str2, "");
        toMagicModuleMetaRepoModel.write(str3, "");
        toMagicModuleMetaRepoModel.write(list, "");
        toMagicModuleMetaRepoModel.write(readblocktocache, "");
        this.AudioAttributesCompatParcelizer = str;
        this.read = str2;
        this.write = str3;
        this.IconCompatParcelizer = i;
        this.RemoteActionCompatParcelizer = list;
        this.AudioAttributesImplApi21Parcelizer = i2;
        this.MediaBrowserCompatItemReceiver = readblocktocache;
    }

    public /* synthetic */ BlockingServiceConnection(String str, String str2, String str3, int i, List list, int i2, readBlockToCache readblocktocache, int i3, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this((i3 & 1) != 0 ? "" : str, (i3 & 2) != 0 ? "" : str2, (i3 & 4) != 0 ? "" : str3, (i3 & 8) != 0 ? 0 : i, (i3 & 16) != 0 ? IntermediateLoginResponseBody.RemoteActionCompatParcelizer() : list, (i3 & 32) != 0 ? -1 : i2, (i3 & 64) != 0 ? readBlockToCache.AudioAttributesImplBaseParcelizer : readblocktocache);
    }

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from getter */
    public final String getRead() {
        return this.read;
    }

    /* JADX INFO: renamed from: read, reason: from getter */
    public final String getWrite() {
        return this.write;
    }

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from getter */
    public final int getIconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    public final List<String> MediaBrowserCompatItemReceiver() {
        return this.RemoteActionCompatParcelizer;
    }

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from getter */
    public final readBlockToCache getMediaBrowserCompatItemReceiver() {
        return this.MediaBrowserCompatItemReceiver;
    }

    /* JADX INFO: renamed from: o.BlockingServiceConnection$write, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\t¢\u0006\u0004\b\u0007\u0010\nJ\u0015\u0010\f\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\r"}, d2 = {"Lo/BlockingServiceConnection$write;", "", "<init>", "()V", "Lo/POJOPropertyBuilder5;", "p0", "Lo/BlockingServiceConnection;", "AudioAttributesCompatParcelizer", "(Lo/POJOPropertyBuilder5;)Lo/BlockingServiceConnection;", "Landroid/content/Intent;", "(Landroid/content/Intent;)Lo/BlockingServiceConnection;", "Landroid/os/Bundle;", "RemoteActionCompatParcelizer", "(Landroid/os/Bundle;)Lo/BlockingServiceConnection;"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static BlockingServiceConnection AudioAttributesCompatParcelizer(POJOPropertyBuilder5 p0) {
            toMagicModuleMetaRepoModel.write(p0, "");
            String strIconCompatParcelizer = PlayerControlViewExternalSyntheticLambda0.IconCompatParcelizer((String) p0.write("lesson_id"));
            String strIconCompatParcelizer2 = PlayerControlViewExternalSyntheticLambda0.IconCompatParcelizer((String) p0.write("module_id"));
            Integer num = (Integer) p0.write("filter_type");
            int iIntValue = num != null ? num.intValue() : -1;
            String strIconCompatParcelizer3 = PlayerControlViewExternalSyntheticLambda0.IconCompatParcelizer((String) p0.write("feedback_text"));
            List listRemoteActionCompatParcelizer = (List) p0.write(FilterParams.KEY_TAGS);
            if (listRemoteActionCompatParcelizer == null) {
                listRemoteActionCompatParcelizer = IntermediateLoginResponseBody.RemoteActionCompatParcelizer();
            }
            List list = listRemoteActionCompatParcelizer;
            Integer num2 = (Integer) p0.write("rating");
            int iIntValue2 = num2 != null ? num2.intValue() : 0;
            readBlockToCache readblocktocache = (readBlockToCache) p0.write("module_type");
            if (readblocktocache == null) {
                readblocktocache = readBlockToCache.AudioAttributesImplBaseParcelizer;
            }
            return new BlockingServiceConnection(strIconCompatParcelizer3, strIconCompatParcelizer, strIconCompatParcelizer2, iIntValue2, list, iIntValue, readblocktocache);
        }

        public static BlockingServiceConnection AudioAttributesCompatParcelizer(Intent p0) {
            toMagicModuleMetaRepoModel.write(p0, "");
            Bundle extras = p0.getExtras();
            if (extras != null) {
                Companion companion = BlockingServiceConnection.INSTANCE;
                return RemoteActionCompatParcelizer(extras);
            }
            return new BlockingServiceConnection(null, null, null, 0, null, 0, null, 127, null);
        }

        private static BlockingServiceConnection RemoteActionCompatParcelizer(Bundle p0) {
            toMagicModuleMetaRepoModel.write(p0, "");
            String string = p0.getString("lesson_id", "");
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string, "");
            String string2 = p0.getString("module_id", "");
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string2, "");
            int i = p0.getInt("filter_type", -1);
            readBlockToCache serializable = p0.getSerializable("module_type");
            if (serializable == null) {
                serializable = readBlockToCache.AudioAttributesImplBaseParcelizer;
            }
            toMagicModuleMetaRepoModel.read(serializable, "");
            readBlockToCache readblocktocache = (readBlockToCache) serializable;
            int i2 = p0.getInt("rating", 0);
            String strIconCompatParcelizer = PlayerControlViewExternalSyntheticLambda0.IconCompatParcelizer(p0.getString("feedback_text"));
            Serializable serializable2 = p0.getSerializable(FilterParams.KEY_TAGS);
            List listRemoteActionCompatParcelizer = serializable2 instanceof List ? (List) serializable2 : null;
            if (listRemoteActionCompatParcelizer == null) {
                listRemoteActionCompatParcelizer = IntermediateLoginResponseBody.RemoteActionCompatParcelizer();
            }
            return new BlockingServiceConnection(strIconCompatParcelizer, string, string2, i2, listRemoteActionCompatParcelizer, i, readblocktocache);
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }

    public final Bundle write() {
        Bundle bundle = new Bundle();
        bundle.putString("lesson_id", this.read);
        bundle.putString("module_id", this.write);
        bundle.putInt("filter_type", this.AudioAttributesImplApi21Parcelizer);
        bundle.putSerializable("module_type", this.MediaBrowserCompatItemReceiver);
        bundle.putInt("rating", this.IconCompatParcelizer);
        bundle.putString("feedback_text", this.AudioAttributesCompatParcelizer);
        bundle.putStringArrayList(FilterParams.KEY_TAGS, new ArrayList<>(this.RemoteActionCompatParcelizer));
        return bundle;
    }

    public final void RemoteActionCompatParcelizer(Intent p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        p0.putExtra("lesson_id", this.read);
        p0.putExtra("module_id", this.write);
        p0.putExtra("filter_type", this.AudioAttributesImplApi21Parcelizer);
        p0.putExtra("feedback_text", this.AudioAttributesCompatParcelizer);
        p0.putExtra("rating", this.IconCompatParcelizer);
        p0.putStringArrayListExtra(FilterParams.KEY_TAGS, new ArrayList<>(this.RemoteActionCompatParcelizer));
        p0.putExtra("module_type", this.MediaBrowserCompatItemReceiver);
    }

    public BlockingServiceConnection() {
        this(null, null, null, 0, null, 0, null, 127, null);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof BlockingServiceConnection)) {
            return false;
        }
        BlockingServiceConnection blockingServiceConnection = (BlockingServiceConnection) p0;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.AudioAttributesCompatParcelizer, (Object) blockingServiceConnection.AudioAttributesCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.read, (Object) blockingServiceConnection.read) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.write, (Object) blockingServiceConnection.write) && this.IconCompatParcelizer == blockingServiceConnection.IconCompatParcelizer && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer, blockingServiceConnection.RemoteActionCompatParcelizer) && this.AudioAttributesImplApi21Parcelizer == blockingServiceConnection.AudioAttributesImplApi21Parcelizer && this.MediaBrowserCompatItemReceiver == blockingServiceConnection.MediaBrowserCompatItemReceiver;
    }

    public final int hashCode() {
        return (((((((((((this.AudioAttributesCompatParcelizer.hashCode() * 31) + this.read.hashCode()) * 31) + this.write.hashCode()) * 31) + Integer.hashCode(this.IconCompatParcelizer)) * 31) + this.RemoteActionCompatParcelizer.hashCode()) * 31) + Integer.hashCode(this.AudioAttributesImplApi21Parcelizer)) * 31) + this.MediaBrowserCompatItemReceiver.hashCode();
    }

    public final String toString() {
        String str = this.AudioAttributesCompatParcelizer;
        String str2 = this.read;
        String str3 = this.write;
        int i = this.IconCompatParcelizer;
        List<String> list = this.RemoteActionCompatParcelizer;
        int i2 = this.AudioAttributesImplApi21Parcelizer;
        readBlockToCache readblocktocache = this.MediaBrowserCompatItemReceiver;
        StringBuilder sb = new StringBuilder("BlockingServiceConnection(AudioAttributesCompatParcelizer=");
        sb.append(str);
        sb.append(", read=");
        sb.append(str2);
        sb.append(", write=");
        sb.append(str3);
        sb.append(", IconCompatParcelizer=");
        sb.append(i);
        sb.append(", RemoteActionCompatParcelizer=");
        sb.append(list);
        sb.append(", AudioAttributesImplApi21Parcelizer=");
        sb.append(i2);
        sb.append(", MediaBrowserCompatItemReceiver=");
        sb.append(readblocktocache);
        sb.append(")");
        return sb.toString();
    }
}
