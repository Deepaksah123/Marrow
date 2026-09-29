package kotlin;

import com.marrow2.data.tag.local.model.TagLSModel;
import java.util.Collection;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class retrieveData {
    private final List<TagLSModel> AudioAttributesCompatParcelizer;
    private final notifyCompletion RemoteActionCompatParcelizer;
    private final boolean read;

    public retrieveData(notifyCompletion notifycompletion, List<TagLSModel> list, boolean z) {
        toMagicModuleMetaRepoModel.write(notifycompletion, "");
        toMagicModuleMetaRepoModel.write(list, "");
        this.RemoteActionCompatParcelizer = notifycompletion;
        this.AudioAttributesCompatParcelizer = list;
        this.read = z;
    }

    public final notifyCompletion IconCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    public final List<TagLSModel> read() {
        return this.AudioAttributesCompatParcelizer;
    }

    public final boolean AudioAttributesCompatParcelizer() {
        return this.read;
    }

    public static retrieveData RemoteActionCompatParcelizer(List<TagLSModel> list) {
        toMagicModuleMetaRepoModel.write(list, "");
        return IconCompatParcelizer(notifyCompletion.AudioAttributesCompatParcelizer, list, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static retrieveData write(List<TagLSModel> list) {
        toMagicModuleMetaRepoModel.write(list, "");
        return IconCompatParcelizer(notifyCompletion.IconCompatParcelizer, list, false);
    }

    public final retrieveData RemoteActionCompatParcelizer() {
        return IconCompatParcelizer(this, !this.read);
    }

    public final retrieveData read(TagLSModel tagLSModel, int i) {
        boolean z;
        notifyCompletion notifycompletion;
        toMagicModuleMetaRepoModel.write(tagLSModel, "");
        List listMediaBrowserCompatItemReceiver = IntermediateLoginResponseBody.MediaBrowserCompatItemReceiver((Collection) this.AudioAttributesCompatParcelizer);
        if (listMediaBrowserCompatItemReceiver.size() == i) {
            listMediaBrowserCompatItemReceiver.clear();
            z = true;
        } else {
            z = false;
        }
        if (listMediaBrowserCompatItemReceiver.size() == i) {
            notifycompletion = notifyCompletion.AudioAttributesCompatParcelizer;
        } else {
            notifycompletion = notifyCompletion.IconCompatParcelizer;
        }
        if (listMediaBrowserCompatItemReceiver.contains(tagLSModel)) {
            listMediaBrowserCompatItemReceiver.remove(tagLSModel);
        } else {
            listMediaBrowserCompatItemReceiver.add(tagLSModel);
        }
        return IconCompatParcelizer(notifycompletion, listMediaBrowserCompatItemReceiver, z ? false : this.read);
    }

    private static /* synthetic */ retrieveData IconCompatParcelizer(retrieveData retrievedata, boolean z) {
        return IconCompatParcelizer(retrievedata.RemoteActionCompatParcelizer, retrievedata.AudioAttributesCompatParcelizer, z);
    }

    private static retrieveData IconCompatParcelizer(notifyCompletion notifycompletion, List<TagLSModel> list, boolean z) {
        toMagicModuleMetaRepoModel.write(notifycompletion, "");
        toMagicModuleMetaRepoModel.write(list, "");
        return new retrieveData(notifycompletion, list, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof retrieveData)) {
            return false;
        }
        retrieveData retrievedata = (retrieveData) obj;
        return this.RemoteActionCompatParcelizer == retrievedata.RemoteActionCompatParcelizer && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.AudioAttributesCompatParcelizer, retrievedata.AudioAttributesCompatParcelizer) && this.read == retrievedata.read;
    }

    public final int hashCode() {
        return (((this.RemoteActionCompatParcelizer.hashCode() * 31) + this.AudioAttributesCompatParcelizer.hashCode()) * 31) + Boolean.hashCode(this.read);
    }

    public final String toString() {
        notifyCompletion notifycompletion = this.RemoteActionCompatParcelizer;
        List<TagLSModel> list = this.AudioAttributesCompatParcelizer;
        boolean z = this.read;
        StringBuilder sb = new StringBuilder("TagUIStateModel(tagState=");
        sb.append(notifycompletion);
        sb.append(", tagList=");
        sb.append(list);
        sb.append(", isUntaggedMcq=");
        sb.append(z);
        sb.append(")");
        return sb.toString();
    }
}
