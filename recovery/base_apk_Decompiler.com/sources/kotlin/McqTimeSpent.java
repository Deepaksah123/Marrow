package kotlin;

import java.util.List;
import kotlin.setActiveRecallQbankId;

/* JADX INFO: loaded from: classes4.dex */
public final class McqTimeSpent {
    private final setQuestions AudioAttributesCompatParcelizer;
    private final setTagActive AudioAttributesImplApi21Parcelizer;
    private final setRatingCount AudioAttributesImplApi26Parcelizer;
    private final getVariant IconCompatParcelizer;
    private final SchemaCompletionState MediaBrowserCompatCustomActionResultReceiver;
    private final setVideoId MediaBrowserCompatItemReceiver;
    private final setPublishedTime RemoteActionCompatParcelizer;
    private final allFilterItem read;
    private final getPearlId write;

    public McqTimeSpent(getPearlId getpearlid, setRatingCount setratingcount, getVariant getvariant, setTagActive settagactive, setVideoId setvideoid, setPublishedTime setpublishedtime, setQuestions setquestions, SchemaCompletionState schemaCompletionState, List<setActiveRecallQbankId.onCustomAction> list) {
        String strIconCompatParcelizer;
        toMagicModuleMetaRepoModel.write(getpearlid, "");
        toMagicModuleMetaRepoModel.write(setratingcount, "");
        toMagicModuleMetaRepoModel.write(getvariant, "");
        toMagicModuleMetaRepoModel.write(settagactive, "");
        toMagicModuleMetaRepoModel.write(setvideoid, "");
        toMagicModuleMetaRepoModel.write(setpublishedtime, "");
        toMagicModuleMetaRepoModel.write(list, "");
        this.write = getpearlid;
        this.AudioAttributesImplApi26Parcelizer = setratingcount;
        this.IconCompatParcelizer = getvariant;
        this.AudioAttributesImplApi21Parcelizer = settagactive;
        this.MediaBrowserCompatItemReceiver = setvideoid;
        this.RemoteActionCompatParcelizer = setpublishedtime;
        this.AudioAttributesCompatParcelizer = setquestions;
        StringBuilder sb = new StringBuilder("Deserializer for \"");
        sb.append(getvariant.aQ_());
        sb.append('\"');
        this.MediaBrowserCompatCustomActionResultReceiver = new SchemaCompletionState(this, schemaCompletionState, list, sb.toString(), (setquestions == null || (strIconCompatParcelizer = setquestions.IconCompatParcelizer()) == null) ? "[container not found]" : strIconCompatParcelizer);
        this.read = new allFilterItem(this);
    }

    public final getPearlId AudioAttributesCompatParcelizer() {
        return this.write;
    }

    public final setRatingCount write() {
        return this.AudioAttributesImplApi26Parcelizer;
    }

    public final getVariant IconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    public final setTagActive MediaBrowserCompatCustomActionResultReceiver() {
        return this.AudioAttributesImplApi21Parcelizer;
    }

    public final setVideoId AudioAttributesImplBaseParcelizer() {
        return this.MediaBrowserCompatItemReceiver;
    }

    public final setQuestions RemoteActionCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    public final SchemaCompletionState MediaBrowserCompatItemReceiver() {
        return this.MediaBrowserCompatCustomActionResultReceiver;
    }

    public final allFilterItem read() {
        return this.read;
    }

    public final getMini AudioAttributesImplApi21Parcelizer() {
        return this.write.onCustomAction();
    }

    public final McqTimeSpent write(getVariant getvariant, List<setActiveRecallQbankId.onCustomAction> list, setRatingCount setratingcount, setTagActive settagactive, setVideoId setvideoid, setPublishedTime setpublishedtime) {
        toMagicModuleMetaRepoModel.write(getvariant, "");
        toMagicModuleMetaRepoModel.write(list, "");
        toMagicModuleMetaRepoModel.write(setratingcount, "");
        toMagicModuleMetaRepoModel.write(settagactive, "");
        toMagicModuleMetaRepoModel.write(setvideoid, "");
        toMagicModuleMetaRepoModel.write(setpublishedtime, "");
        return new McqTimeSpent(this.write, setratingcount, getvariant, settagactive, !setUpdatedLesson.read(setpublishedtime) ? this.MediaBrowserCompatItemReceiver : setvideoid, setpublishedtime, this.AudioAttributesCompatParcelizer, this.MediaBrowserCompatCustomActionResultReceiver, list);
    }
}
